package com.example.mybatisnative;


import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class Customer {

    private final Integer id;
    private final String name;
    private final String email;
}
