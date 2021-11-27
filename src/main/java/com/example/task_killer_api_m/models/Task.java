package com.example.task_killer_api_m.models;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "task")
@RequiredArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //se crea id unico
    @Column(name="id_task", nullable = false, unique = true)  //nombre de la columna y algunas caracteristicas
    private Long id;

    @Column(length = 300)  //nombre de la columna y algunas caracteristicas
    private String content;

    @Column
    private boolean done;

}
