package com.example.inicial1.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.envers.Audited;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@ToString
@Entity
@Table(name = "Libro")
@Audited

public class Libro extends Base{

    private String titulo;
    private int fecha;
    private String genero;
    private int paginas;
    private String autor;

    @Builder.Default
    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Autor> autores = new ArrayList<>();
}
