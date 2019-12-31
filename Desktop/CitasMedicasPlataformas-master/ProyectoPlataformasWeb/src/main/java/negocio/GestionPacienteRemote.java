package negocio;

import java.util.List;


import javax.ejb.Remote;

import modelo.Paciente;
@Remote
public interface GestionPacienteRemote {
	
	public void guardarPaciente(int codigo,String nombre, String apellido, String cedula, String direccion, String telefono,String email);
	public List<Paciente> getPaciente();
}
