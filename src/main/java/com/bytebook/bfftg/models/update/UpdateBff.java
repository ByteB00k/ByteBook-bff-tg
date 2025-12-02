package com.bytebook.bfftg.models.update;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateBff {
    private Long updateId;
    private MessageBff message;
    private CallbackQueryBff callbackQueryBff;
}
