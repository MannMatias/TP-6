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
@Builder
@ToString
@Entity
@Table(name = "Autor")
@Audited

public class Autor extends Base {


    private String nombre;
    private String apellido;
    private String biografia;
}
