package com.bytebook.bfftg.keyboard;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class InlineKeyboardMarkup {
    private List<List<InlineKeyboardButton>> inlineKeyboard;
}
