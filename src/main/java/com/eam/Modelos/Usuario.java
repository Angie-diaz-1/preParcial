package com.eam.Modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;

    @Column(name="nombre_usuario")
    private String nombreUsuario;

    @Column(name="telefono")
    private String telefonoUsuario;

    @ManyToOne
    @JoinColumn(name="id_rol", referencedColumnName = "idRol")
    private Rol rol;
    
    public Usuario() {
    }

    public Usuario(String nombreUsuario, String telefonoUsuario, Rol rol) {
        this.nombreUsuario = nombreUsuario;
        this.telefonoUsuario = telefonoUsuario;
        this.rol = rol;
    }

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getTelefonoUsuario() {
		return telefonoUsuario;
	}

	public void setTelefonoUsuario(String telefonoUsuario) {
		this.telefonoUsuario = telefonoUsuario;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}
    
    
}
