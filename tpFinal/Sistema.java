import java.awt.EventQueue;
import java.io.*;

public class Sistema {

	public static void main(String[] args) {

		File file = new File(System.getProperty("user.dir") + "\\arquivo.txt"); //Pega o diretório de onde o programa foi inicializado

		try {

			BufferedReader br = new BufferedReader(new FileReader(file));
	 
	 		String st;
	  		while ((st = br.readLine()) != null)
	    		System.out.println(st);
	    } catch (Exception e){
	    	System.out.println(e);
	    }

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUILogin frame = new GUILogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
