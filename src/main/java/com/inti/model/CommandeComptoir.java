package com.inti.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "commande_comptoir")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommandeComptoir {

	@Id
	private long idCommandeComptoir;
	private double prixCommande;
	private String nomClient;
	private boolean aPayer;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idCommandePizza")
	private CommandePizza commandePizza ;

}
