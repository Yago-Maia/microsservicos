package com.yagomaia.pagamento.entity;

import com.yagomaia.pagamento.data.vo.VendaVO;
import lombok.*;
import org.modelmapper.ModelMapper;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.ui.ModelMap;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Table(name = "venda")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Venda implements Serializable {

    private static final long serialVersionUID = 7354993776427500169L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @DateTimeFormat(pattern = "MM/dd/yyyy")
    @Column(name = "data", nullable = false)
    private Date data;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "venda", cascade = CascadeType.REFRESH)
    private List<ProdutoVenda> produtos;

    @Column(name = "valor_total", nullable = false, length = 10)
    private Double valorTotal;

    public static Venda create(VendaVO vendaVO) {
        return new ModelMapper().map(vendaVO, Venda.class);
    }

}
