package com.rafaa.inventoryManagement.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "client")
public class Client extends AbstractEntity{

	  @Column(name = "nom")
	  private String nom;

	  @Column(name = "prenom")
	  private String prenom;

	  @Embedded
	  private Adresse adresse;

	  @Column(name = "photo")
	  private String photo;

	  @Column(name = "mail")
	  private String mail;

	  @Column(name = "numTel")
	  private String numTel;

	  @Column(name = "identreprise")
	  private Integer idEntreprise;

	  @OneToMany(mappedBy = "client")
	  private List<CommandeClient> commandeClients;
}
