import java.util.ArrayList;

public class Agenda {
    private ArrayList<Data> listaDias;
    
   public Agenda() {
        listaDias = new ArrayList<Data>();
    }
    
     public Data getDataPorIndice(int indice) {
        return listaDias.get(indice);
    }

    public Data getDataPorDia(int dia) {
        for(Data data : listaDias){
            if(data.getDia() == dia){
                return data;
            }
        }
        System.out.println("Data não encontrada");
        return null;
    }

    public void insereData(Data data) {
        listaDias.add(data);
        System.out.println("Dia " + data.getDia() + " inserido na agenda");
    }
   
}