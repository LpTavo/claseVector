import java.util.Vector;

public class EjemploVector {
    public static void main(String[] args) {
     
        Vector<String> frutas = new Vector<>();

      
        frutas.add("Manzana");
        frutas.add("Naranja");
        frutas.add("Plátano");
        frutas.add("Pera");

     
        System.out.println("Frutas en el vector: " + frutas);

     
        System.out.println("Tamaño del vector: " + frutas.size());

        
        System.out.println("Primera fruta: " + frutas.firstElement());
        System.out.println("Última fruta: " + frutas.lastElement());

      
        frutas.add(2, "Fresa");
        System.out.println("Frutas después de insertar Fresa en la posición 2: " + frutas);

   
        frutas.remove(3);
        System.out.println("Frutas después de eliminar el elemento en la posición 3: " + frutas);

        
        System.out.println("¿El vector contiene 'Pera'? " + frutas.contains("Pera"));

      
        System.out.println("Elemento en la posición 1: " + frutas.get(1));

       
        String[] frutasArray = frutas.toArray(new String[0]);
        System.out.println("Frutas en el array:");
        for (String fruta : frutasArray) {
            System.out.println(fruta);
        }

       
        frutas.clear();
        System.out.println("Frutas después de limpiar el vector: " + frutas);
        System.out.println("¿El vector está vacío? " + frutas.isEmpty());
    }
}
