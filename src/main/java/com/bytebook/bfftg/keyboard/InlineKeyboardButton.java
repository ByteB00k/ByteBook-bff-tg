package com.bytebook.bfftg.keyboard;

import lombok.Getter;
import lombok.Setter;

import java.nio.charset.StandardCharsets;

@Getter
@Setter
public class InlineKeyboardButton {
    private String text;
    private String url;
    private String callbackData;

    public void setCallbackData(String callbackData) {
        if (callbackData != null &&
                callbackData.getBytes(StandardCharsets.UTF_8).length > 64) {
            throw new IllegalArgumentException("callback_data must be ≤ 64 bytes");
        }
        this.callbackData = callbackData;
    }
}
