package fun.kmoon.utils;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtUtil {

    private static final String SECRET_KEY = "LLNYsl0223!";

    // 生成JWT令牌
    public String generateToken(String username) {
        long expiration = 1000 * 60 * 60 * 24;  // 过期时间24小时
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())      // 设置签发时间
                .setExpiration(new Date(System.currentTimeMillis() + expiration))   // 设置过期时间
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)     // 使用HS256签名算法和密钥
                .compact();
    }

    // 验证JWT令牌
    public boolean validateToken(String token) {
        try {
            Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // 从JWT令牌中获取用户名
    public String getUsername(String token) {
        return Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody().getSubject();
    }
}
