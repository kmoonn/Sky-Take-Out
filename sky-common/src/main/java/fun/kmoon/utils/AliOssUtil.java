package fun.kmoon.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@AllArgsConstructor
@Slf4j
public class AliOssUtil {

    public String upload(byte[] bytes, String fileName) {
        return fileName;
    }
}
