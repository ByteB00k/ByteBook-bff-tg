package com.bytebook.bfftg.models.update;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MessageEntityBff {
    private String type;
    private Integer offset;
    private Integer length;
}
