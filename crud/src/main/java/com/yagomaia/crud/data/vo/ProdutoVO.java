package com.yagomaia.crud.data.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.yagomaia.crud.entity.Produto;
import lombok.*;
import org.modelmapper.ModelMapper;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;

@JsonPropertyOrder({"id", "nome", "preco", "estoque"})
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class ProdutoVO extends RepresentationModel<ProdutoVO> implements Serializable {

    private static final long serialVersionUID = -4521959441291647009L;

    @JsonProperty("id")
    private Long id;

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("estoque")
    private Integer estoque;

    @JsonProperty("preco")
    private  Double preco;

    public static ProdutoVO create(Produto produto) {
        return new ModelMapper().map(produto, ProdutoVO.class);
    }
}
