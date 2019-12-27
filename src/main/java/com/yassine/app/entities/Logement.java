package com.yassine.app.entities;

import javax.persistence.*;
import lombok.*;


@Entity
@Table(name = "logements")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Logement {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id ;
	
    @Column(name="adress")
    private String adress;
    
	@Column(name = "idAgence")
	private Long idAgence;
	
	@Column(name="idClient")
	private int idClient;
	
	@Column(name="dispo")
	private boolean dispo;
	@Column(name="prix")
	private float prix;


}
