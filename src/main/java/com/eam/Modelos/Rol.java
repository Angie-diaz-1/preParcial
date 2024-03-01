package com.eam.Modelos;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Rol")

public class Rol {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRol;

    @Column(name="nombre")
    private String nombreRol;
    
    @OneToMany(mappedBy="rol")
    private List<Usuario> usuarios;
    
    public Rol() {        
    }
    
    public Rol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

	public int getIdRol() {
		return idRol;
	}

	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}

	public String getNombreRol() {
		return nombreRol;
	}

	public void setNombreRol(String nombreRol) {
		this.nombreRol = nombreRol;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
    
    
}
