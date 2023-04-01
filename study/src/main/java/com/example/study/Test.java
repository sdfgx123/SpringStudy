package com.example.study;

import javax.persistence.*;

@Entity
@Table(name = "test_table")
public class Test {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;
}
