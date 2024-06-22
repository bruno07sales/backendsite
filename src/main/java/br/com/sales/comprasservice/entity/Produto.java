package br.com.sales.comprasservice.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_produto")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Produto {
    
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    @Column(name = "pk_produto")
    private Integer id;    

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;
    
    @Column(name = "preco", nullable = false)
    private BigDecimal preco;

    @Column(name = "imagem_url", nullable = false)
    private String urlImagem;

    @ManyToOne
    @JoinColumn (name = "fk_categoria")
    private Categoria categoria;


    
}
