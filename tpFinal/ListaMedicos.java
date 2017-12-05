import java.util.ArrayList;

public class ListaMedicos {
	
	private ArrayList<Medico> listaMedicos;

	public ListaMedicos() {
		listaMedicos = new ArrayList<Medico>();
	}

	public void insereMedico(Medico newMedico) {
		System.out.println("Inserindo Medico: " + newMedico.getNome());
		System.out.println("Especialidade: " + newMedico.getEspecialidade());
		listaMedicos.add(newMedico);
	}
	
	public void removeMedico(String nome) {
		for(int i = 0; i < listaMedicos.size(); i++) {
			if(listaMedicos.get(i).getNome() == nome) {
				listaMedicos.remove(i);
			}
		}
	}
	
	public boolean encontraMedico(String nome) {
		for(int i = 0; i < listaMedicos.size(); i++) {
			if(new String(listaMedicos.get(i).getNome()).equals(nome)) {
				System.out.println("Cpf encontrado!\n");
				return true;
			}
		}
		System.out.print("Cpf não encontrado!\n");
		return false;
	}
	
	public String toString() {
		return "Número de Medicos cadastrados: " + listaMedicos.size();
	}
	
}