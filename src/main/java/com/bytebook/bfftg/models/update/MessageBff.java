package com.bytebook.bfftg.models.update;

import com.bytebook.bfftg.models.user.Chat;
import com.bytebook.bfftg.models.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MessageBff {
    private Long message_id;
    private User from;
    private Chat chat;
    private String text;
    private List<MessageEntityBff> entities;

}
