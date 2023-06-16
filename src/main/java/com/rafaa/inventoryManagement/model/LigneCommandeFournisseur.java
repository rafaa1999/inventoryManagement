package com.rafaa.inventoryManagement.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "lignecommadefournisseur")
public class LigneCommandeFournisseur extends AbstractEntity {

	  @ManyToOne
	  @JoinColumn(name = "idarticle")
	  private Article article;

	  @ManyToOne
	  @JoinColumn(name = "idcommandefournisseur")
	  private CommandeFournisseur commandeFournisseur;

	  @Column(name = "quantite")
	  private BigDecimal quantite;

	  @Column(name = "prixunitaire")
	  private BigDecimal prixUnitaire;

	  @Column(name = "identreprise")
	  private Integer idEntreprise;
}
