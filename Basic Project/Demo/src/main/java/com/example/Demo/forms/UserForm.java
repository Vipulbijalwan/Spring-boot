package com.example.Demo.Controller.forms;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserForm {

  private   String name;
    private   String email;
    private   String password;
    private   String phoneNumber;
}
