import java.util.ArrayList;

public class ListaEspecialidades {
	
	private ArrayList<Especialidade> listaEspecialidades;

	public ListaEspecialidades() {
		listaEspecialidades = new ArrayList<Especialidade>();
	}

	public void insereEspecialidade(Especialidade newEspecialidade) {
		System.out.println("Inserindo Especialidade: " + newEspecialidade.getNome());
		listaEspecialidades.add(newEspecialidade);
	}
	
	public void removeEspecialidade(String nome) {
		for(int i = 0; i < listaEspecialidades.size(); i++) {
			if(listaEspecialidades.get(i).getNome() == nome) {
				listaEspecialidades.remove(i);
			}
		}
	}
	
	public boolean encontraEspecialidade(String nome) {
		for(int i = 0; i < listaEspecialidades.size(); i++) {
			if(new String(listaEspecialidades.get(i).getNome()).equals(nome)) {
				System.out.println("Especialidade encontrada!\n");
				return true;
			}
		}
		System.out.print("Especialidade não encontrada!\n");
		return false;
	}

	public Especialidade getEspecialidadePorIndice(int indice){
		return listaEspecialidades.get(indice);
	}

	public void registraEspecialidades(ListaMedicos listaMedicos){
		String espAux;
		Medico medico;
		for(int i = 0; i < listaMedicos.getSize(); i++){
			medico = listaMedicos.getMedicoPorIndice(i);
			espAux = medico.getEspecialidade();
			if(encontraEspecialidade(espAux)){
				insereMedicoEspecialidade(espAux, medico);
			} else {
				insereEspecialidade(new Especialidade(espAux));
				insereMedicoEspecialidade(espAux, medico);
			}
		}
	}

	public void insereMedicoEspecialidade(String nome, Medico medico){
		for(int i = 0; i < listaEspecialidades.size(); i++) {
			if(new String(listaEspecialidades.get(i).getNome()).equals(nome)) {
				listaEspecialidades.get(i).adicionaMedico(medico);
			}
		}
	}

	public int getSize(){
		return listaEspecialidades.size();
	}
	
	public String toString() {
		return "Número de Especialidades cadastrados: " + listaEspecialidades.size();
	}
	
}