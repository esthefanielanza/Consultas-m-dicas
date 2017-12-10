import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ListaClientes {
	
	private ArrayList<Cliente> listaClientes;

	public ListaClientes() {
		listaClientes = new ArrayList<Cliente>();
	}

	public void insereCliente(Cliente newCliente) {
		System.out.println("Inserindo cliente");
		salvaClienteArquivo(newCliente);
		listaClientes.add(newCliente);
	}
	
	public void removeCliente(String cpf) {
		for(int i = 0; i < listaClientes.size(); i++) {
			if(listaClientes.get(i).getCpf() == cpf) {
				listaClientes.remove(i);
			}
		}
	}
	
	public static void salvaClienteArquivo(Cliente cliente) {
		try {
			FileWriter arq;
			arq = new FileWriter("clientes", true);
	        BufferedWriter bw = new BufferedWriter(arq);
	        bw.write(cliente.getCpf());
	        bw.newLine();
	        bw.write(cliente.getNome());
	        bw.newLine();
	        bw.write(cliente.getIdentidade());
	        bw.newLine();
	        bw.write(cliente.getEndereco());
	        bw.newLine();
	        bw.write(cliente.getTelefone());
	        bw.newLine();
	        bw.write(cliente.getDataNascimento());
	        bw.newLine();
	        bw.write(",");
	        bw.newLine();
			bw.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Erro ao ler a lista de clientes!");
		}
	}
	
	public void leClientesArquivo(File file){
		Cliente tmpCliente = new Cliente();
		int currentField = 0;
		
		try {
			BufferedReader buffer = new BufferedReader(new FileReader(file));
	 		String line;
	  		while ((line = buffer.readLine()) != null) {
	  			System.out.print("Lendo" + line);
	  			if(line.equals(",")) {
	  				System.out.println("Inserindo cliente1");
	  				listaClientes.add(tmpCliente);
	  			} else if(currentField == 0) {
	  				tmpCliente.setCpf(line);
	  				currentField++;
	  			} else if(currentField == 1) {
	  				tmpCliente.setNome(line);
	  				currentField++;
	  			} else if(currentField == 2) {
	  				tmpCliente.setIdentidade(line);
	  				currentField++;
	  			}  else if(currentField == 2) {
	  				tmpCliente.setEndereco(line);
	  				currentField++;
	  			}  else if(currentField == 2) {
	  				tmpCliente.setTelefone(line);
	  				currentField++;
	  			} else {
	  				tmpCliente.setDataNascimento(line);
	  				currentField = 0;
	  			}
	  		}
	  		buffer.close();

	    } catch (Exception e){
	    	System.out.println(e);
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
        
        public String encontraNomeCliente(String cpf) {
		for(int i = 0; i < listaClientes.size(); i++) {
			if(new String(listaClientes.get(i).getCpf()).equals(cpf)) {
                            return listaClientes.get(i).getNome();
			}
		}
		System.out.print("Cpf não encontrado!\n");
		return "";
	}
	
	public String toString() {
		return "Número de clientes cadastrados: " + listaClientes.size();
	}
	
}
