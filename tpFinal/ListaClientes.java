import java.util.ArrayList;

public class ListaClientes {
	
	private ArrayList<Cliente> listaClientes;

	public ListaClientes() {
		listaClientes = new ArrayList<Cliente>();
	}

	public void insereCliente(Cliente newCliente) {
		System.out.println("Inserindo cliente");
		listaClientes.add(newCliente);
	}
	
	public void removeCliente(String cpf) {
		for(int i = 0; i < listaClientes.size(); i++) {
			if(listaClientes.get(i).getCpf() == cpf) {
				listaClientes.remove(i);
			}
		}
	}
	
	public boolean encontraCliente(String cpf) {
		for(int i = 0; i < listaClientes.size(); i++) {
			if(new String(listaClientes.get(i).getCpf()).equals(cpf)) {
				System.out.println("Cpf encontrado!\n");
				return true;
			}
		}
		System.out.print("Cpf não encontrado!\n");
		return false;
	}
	
	public String toString() {
		return "Número de clientes cadastrados: " + listaClientes.size();
	}
	
}
