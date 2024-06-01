package com.anass.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class Issues {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private User assignee;


}
