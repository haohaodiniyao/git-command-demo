package com.example.gitcommanddemo.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserDTO implements Serializable {
    private Long userId;
    private Long id;
}
