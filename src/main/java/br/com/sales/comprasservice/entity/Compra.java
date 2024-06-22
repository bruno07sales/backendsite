// package br.com.sales.comprasservice.entity;

// import java.math.BigDecimal;
// import java.time.LocalDateTime;

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

// @Entity
//     @Table(name = "tb_compra")
//     @Builder
//     @Getter
//     @Setter
//     @NoArgsConstructor
//     @AllArgsConstructor
    
// public class Compra {
//     @Id
//     @GeneratedValue(strategy=GenerationType.IDENTITY)
//     @Column(name = "pk_compra")
//     private Integer id;
//     @Column(name = "dt_compra")
//     private LocalDateTime dtCompra;
//     @Column(name = "nu_total_compra")
//     private BigDecimal totalCompra;
//     @Column(name = "st_compra", nullable= false)
//     private Integer status;
//     @Column(name = "fk_pedido")
//     private Pedido pedido;

// }
