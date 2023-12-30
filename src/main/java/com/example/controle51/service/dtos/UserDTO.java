package com.example.controle51.service.dtos;

import jakarta.persistence.AssociationOverride;
import lombok.*;

import java.util.Date;

@Getter@Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class UserDTO {
    private String name;
    private String email;
    private Date date_Naissance;


}
