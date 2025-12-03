package com.bytebook.bfftg.keyboard;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class ReplyKeyboardMarkup {
    private List<List<KeyboardButton>> keyboard;
    private Boolean resizeKeyboard;
    private Boolean oneTimeKeyboard;
}
