package br.com.campingfire.dto;

import br.com.campingfire.enums.State;

import java.io.Serializable;

public class CampingDTO implements Serializable {

    private Long id;
    private String name;
    private State state;
    private String city;
    private String description;
    private Long contact;
    private UserDTO user;

}
