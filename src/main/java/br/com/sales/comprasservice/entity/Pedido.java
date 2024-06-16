// package br.com.sales.comprasservice.entity;

// import java.math.BigDecimal;

// import jakarta.persistence.Column;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.Table;
// import lombok.AllArgsConstructor;
// import lombok.Builder;
// import lombok.Getter;
// import lombok.NoArgsConstructor;
// import lombok.Setter;

//     @Entity
//     @Table(name = "tb_pedido")
//     @Builder
//     @Getter
//     @Setter
//     @NoArgsConstructor
//     @AllArgsConstructor

// public class Pedido {
//     @Id
//     @GeneratedValue(strategy=GenerationType.IDENTITY)
//     @Column(name = "pk_pedido")
//     private Integer id;
//     @Column (name= "fk_cliente")
//     private Usuario usuario;
//     @Column (name= "fk_produto")
//     private Produto produto;
//     @Column (name= "nu_preco_unitario", nullable = false)
//     private BigDecimal preco;
//     @Column (name= "nu_quantidade", nullable= false)
//     private Integer quantidade;
//     @Column (name= "st_pedido", nullable= false)
//     private Integer status;
        
// }

