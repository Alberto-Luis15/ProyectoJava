package leeryescribir;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Leer{
    
    public static void main(String[] args){
       Scanner sn = new Scanner(System.in);
       boolean salir = false;
       int opcion; //Guardaremos la opcion del usuario
       List<String> Lista = new ArrayList<String>(); 
       while(!salir){
            
           System.out.println("1. Opcion escribir archivo");
           System.out.println("2. Opcion leer archivo");
           System.out.println("3. Opcion editar archivo");
           System.out.println("4. Salir");
            
           System.out.println("Escribe una de las opciones");
           opcion = sn.nextInt();
           
           switch (opcion){
               case 1: 
                   System.out.println("Escribe el archivo");
                   CrearArchivoTexto aplicacion = new CrearArchivoTexto();
                   aplicacion.abrirArchivo();
                   aplicacion.agregarRegistros(Lista);
                   aplicacion.cerrarArchivo();
                   break;
               
               case 2: 
                   System.out.println("Leer archivo");
                   LeerArchivodeTexto aplicacion1 = new LeerArchivodeTexto();
                   aplicacion1.abrirArchivo();
                   aplicacion1.leerRegistros();
                   Lista=aplicacion1.getLista();
                   aplicacion1.cerrarArchivo();
                   break;
               
               case 3:
                   System.out.println("Editar archivo");
                   System.out.println(Lista.add("20       fsaf            ds                    60.00            19"));
                   System.out.println(Lista.size());
                   CrearArchivoTexto aplicacion2 = new CrearArchivoTexto();
                   aplicacion2.abrirArchivo();
                   aplicacion2.agregarRegistros(Lista);
                   aplicacion2.cerrarArchivo();
                   
                   break;
                   
               case 4:
                   salir=true;
                   System.out.println("BYE");
                   break;
               default:
                   System.out.println("Escribe solo numeros de 1 a 3");
           }
       }
    
    }
}