package br.com.sales.comprasservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_usuario")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Usuario {
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    @Column(name = "pk_usuario")

    private Integer id;
    @Column(name = "nome_usuario", nullable= false, length= 150)
    private String nome;
    @Column(name = "email_usuario", nullable= false, length= 150)
    private String email;
    @Column(name = "senha_usuario", nullable= false, length= 150)
    private String senha;
}
