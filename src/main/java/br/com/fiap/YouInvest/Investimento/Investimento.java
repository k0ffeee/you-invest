package br.com.fiap.YouInvest.Investimento;

import br.com.fiap.YouInvest.user.User;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
public class Investimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NotBlank
    String Nome;

    @Size(min = 10)
    Integer Duracao_anos;

    @Min(1)
    @Max(100)
    Float Rendimento;

    @Min(0)
    @Max(100)
    Integer Valor_inicial = 0;

    @Min(0)
    @Max(100)
    Integer Valor_final;

    @ManyToOne
    User user;

}
