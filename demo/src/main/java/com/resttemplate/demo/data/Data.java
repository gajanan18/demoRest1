package com.resttemplate.demo.data;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
public class Data {

    @Id
    private int id;

    private String image_id;
    private String sub_id;
    private String created_at;
    private Integer value;
    private String country_code;



    public Data(int id, String image_id, String sub_id, String created_at, Integer value, String country_code) {
        this.id = id;
        this.image_id = image_id;
        this.sub_id = sub_id;
        this.created_at = created_at;
        this.value = value;
        this.country_code = country_code;
    }
}
