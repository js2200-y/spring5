package com.itwill.spring5.dto.post;

import lombok.Data;

@Data
public class PostUpdateDto {
    
    private Long id;
    private String title;
    private String content;

}