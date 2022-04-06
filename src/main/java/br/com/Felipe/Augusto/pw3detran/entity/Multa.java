package br.com.Felipe.Augusto.pw3detran.entity;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table (name = "TBL_MULTA")
public class Multa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idMulta")
	private int id_multa;
	
	@Column(name = "dataAplicacao")
	public LocalDate Data;
	
	@Column(name = "vencimento")
	public LocalDate Vencimento;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "estadoMulta")
	public String Estado_Multa;
	
	@Column(name = "orgao")
	public String orgao;
	
	@OneToMany
	@Column(name = "idVeiculo")
	public int id_veiculo;
	
	@OneToMany
	@Column(name = "idPessoa")
	public int proprietario;
}
