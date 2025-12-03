package com.bytebook.bfftg.models.update;

import com.bytebook.bfftg.models.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CallbackQueryBff {
    private String id;
    private User from;
    private MessageBff message;
    private String data;

}
