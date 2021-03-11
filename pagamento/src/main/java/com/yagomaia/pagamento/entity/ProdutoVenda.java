package com.yagomaia.pagamento.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "produto_venda")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class ProdutoVenda implements Serializable {
    private static final long serialVersionUID = -3670981121075234911L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "id_produto", nullable = false, length = 10)
    private Long idProduto;

    @Column(name = "quantidade", nullable = false, length = 10)
    private Integer quantidade;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_venda")
    private Venda venda;

}
