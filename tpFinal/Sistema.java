import java.awt.EventQueue;
import java.io.*;

public class Sistema {

	public static void main(String[] args) {

		File file = new File(System.getProperty("user.dir") + "//medicos"); //Pega o diretório de onde o programa foi inicializado
		ListaClientes listaClientes = new ListaClientes();
		ListaMedicos listaMedicos = new ListaMedicos();

		listaMedicos.leMedicosArquivo(file);

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUILogin frame = new GUILogin(listaClientes, listaMedicos);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
