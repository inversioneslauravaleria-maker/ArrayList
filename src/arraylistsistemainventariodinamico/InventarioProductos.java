package arraylistsistemainventariodinamico;
import java.util.Scanner;
import java.util.ArrayList;


public class InventarioProductos {
    
    public static Scanner sc;
    public static ArrayList<String> ListaProductos = new ArrayList <> ();
    public static int opcion = 0;
    

    public static void main(String[] args) {
   //Use arraylist y sollicite 5 cosas al usarlo para que ingrese.
   //Debo usar los metodos del arraylist para demostrar su funcionalidad.
   sc = new Scanner(System.in);
   System.out.println("---Bienvenido al sistema de inventario---");
   System.out.println("Ingrese 5 productos");
   for(int i=0; i<5; i++){
      System.out.println("Producto #"+(i+1)+" :");
      String nombreProducto = sc.nextLine();
      ListaProductos.add(nombreProducto);
   
   }
    
   do{
       System.out.println("Que desea hacer ? ");
       System.out.println("1.Ver Productos");
       System.out.println("2.Agregar productos");
       System.out.println("3.Editar producto");
       System.out.println("4.Eliminar producto");
       System.out.println("0.salir");
       System.out.println("Seleciione una opcio de menu:");
       opcion = sc.nextInt();
       
       System.out.println("**************************");
       switch(opcion){
           case 1:
               verProductos();
               break;
           case 2:
               agregarProducto();
               break;
           case 3:
               editarProducto();
               break;
           case 4:
                eliminarProducto();
               break;
       
       }
       
   }while(opcion!=0);
   
   System.out.println("FIN DEL PROGRAMA, GRACIAS. ");
    }
    
    public static void verProductos(){
         System.out.println("*********************");
           System.out.println("---Lista de Productos---");
        for(int i=0 ; i <ListaProductos.size(); i ++){
           System.out.println(ListaProductos.get(i));
        
       }
    
    }
    public static void agregarProducto(){
        System.out.println("Cuantos productos desea agregar: ");
        int cantidad = sc.nextInt();
        sc.nextLine();
                
                
        for(int i=0; i <cantidad; i++){
            System.out.println("Nombre Producto:");
            String nuevoProducto = sc.nextLine();
            ListaProductos.add(nuevoProducto);
        }
    
    }
    public static void editarProducto(){
        System.out.println("De esta lista de productos cual desea modificar");
        for(int i=0; i<ListaProductos.size(); i++){
           System.out.println (""+i+"->"+ListaProductos.get(i)); 
           
        
        }
        System.out.println("Elija una de las opciones a editar: ");
        int opcionEditar = sc.nextInt();
        sc.nextLine();
        System.out.println("con que nombre desea remplazarlo? ");
        String nuevoNombre = sc.nextLine();
        ListaProductos.set(opcionEditar, nuevoNombre);
       sc.nextLine();
    }
    public static void eliminarProducto(){
     System.out.println("cual desea eliminar");
     for(int i=0; i<ListaProductos.size(); i++){
         System.out.println(""+i+ " -> " + ListaProductos.get(i));
      }
    System.out.println("Elija una opción a eliminar: ");
    int opcionEliminar = sc.nextInt();
    ListaProductos.remove(opcionEliminar);
    System.out.println("Eliminado correctamente");
           
    }
}