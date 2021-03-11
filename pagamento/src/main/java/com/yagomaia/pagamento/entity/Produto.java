package com.yagomaia.pagamento.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "produto")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Produto implements Serializable {

    private static final long serialVersionUID = 2470318695649453512L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "estoque", nullable = false, length = 10)
    private Integer estoque;
}
