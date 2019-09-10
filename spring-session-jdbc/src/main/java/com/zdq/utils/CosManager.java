package com.zdq.utils;

import com.qcloud.cos.COSClient;
import lombok.Data;

@Data
public class CosManager {
    private COSClient cosClient;
}
