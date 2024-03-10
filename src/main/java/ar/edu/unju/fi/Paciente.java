package ar.edu.unju.fi;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Paciente {
    @Id
    private Long dni; // Clave primaria

    private String apellido;
    private String nombre;
    private String fechaNacimiento;
    private String password;
    private String tipoUsuario; // Paciente o Administrador

public Paciente () {
	
}
    
public Paciente(Long dni,String apellido, String nombre, String fechaNacimiento, String password) {
	

}

// Getter y Setter para DNI
public Long getDni() {
    return dni;
}

public void setDni(Long dni) {
    this.dni = dni;
}

// Getter y Setter para Apellido
public String getApellido() {
    return apellido;
}

public void setApellido(String apellido) {
    this.apellido = apellido;
}

// Getter y Setter para Nombre
public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

// Getter y Setter para Fecha de Nacimiento
public String getFechaNacimiento() {
    return fechaNacimiento;
}

public void setFechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
}

// Getter y Setter para Password
public String getPassword() {
    return password;
}

public void setPassword(String password) {
    this.password = password;
}

// Getter y Setter para Tipo de Usuario
public String getTipoUsuario() {
    return tipoUsuario;
}

public void setTipoUsuario(String tipoUsuario) {
    this.tipoUsuario = tipoUsuario;
}
}


}