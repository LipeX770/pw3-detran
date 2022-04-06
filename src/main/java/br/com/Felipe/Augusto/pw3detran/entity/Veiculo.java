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
@Table (name = "TBL_VEICULO")
public class Veiculo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idVeiculo")
	private Long id;
	
	@Column(name = "renavam")
	public String renavam;
	
	@Column(name = "placa")
	public String placa;
	
	@Column(name = "modelo")
	public String modelo;
	
	@Column(name = "proprietario")
	public String proprietario;
	
	@Column(name = "ano")
	private LocalDate ano;
	
	

}
