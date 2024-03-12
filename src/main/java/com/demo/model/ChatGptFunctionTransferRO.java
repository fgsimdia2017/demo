package com.demo.model;

import lombok.Data;

import java.util.List;

/**
 * @Author huangfeng
 * @Date 2023/11/22 10:43
 * @description
 * @Version 1.0
 */
@Data
public class ChatGptFunctionTransferRO {
    private String model;
    private List<ChatGptMessage> messages;
    private List<TransferTools> tools;

    @Data
    private static class ChatGptMessage {
        private String role;
        private String content;
    }
    @Data
    private static class TransferTools {
        private String type;
        private TransferFunctions function;
    }

    @Data
    private static class TransferFunctions {
        private String name;
        private TransferParameters parameters;
    }

    @Data
    private static class TransferParameters {
        private String name;
        private TransferParameters parameters;
    }
}
