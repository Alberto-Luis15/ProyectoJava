package leeryescribir;

import java.io.File;  
import java.io.FileNotFoundException; 
import java.lang.IllegalStateException; 
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException; 
import java.util.Scanner; 


public class LeerArchivodeTexto {
    private Scanner entrada;
    private List<String> Lista = new ArrayList<String>();

    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }

    public List<String> getLista() {
        return Lista;
    }

    public void setLista(List<String> Lista) {
        this.Lista = Lista;
    }

 // permite al usuario abrir el archivo
 public void abrirArchivo()
 {
 try
 {
 entrada = new Scanner( new File( "clientes.txt" ) );
 } // fin de try
 catch ( FileNotFoundException fileNotFoundException )
 {
 System.err.println( "Error al abrir el archivo." );
 System.exit( 1 );
 } // fin de catch
 } // fin del método abrirArchivo

 // lee registro del archivo
 public void leerRegistros()
 {
 // objeto que se va a escribir en la pantalla
    RegistroCuenta registro = new RegistroCuenta();

 System.out.printf( "%-9s%-15s%-18s%10s%10s\n", "Equipo",
 "Primer nombre", "Apellido paterno", "Minutos a usar", "Edad" );

 try // lee registros del archivo, usando el objeto Scanner
 {
 while ( entrada.hasNext() )
 {
 registro.establecerCuenta( entrada.nextInt() );
 
 registro.establecerPrimerNombre( entrada.next() ); // lee el primer nombre
 registro.establecerApellidoPaterno( entrada.next() ); // lee el apellido

 registro.establecerSaldo( entrada.nextDouble() );
 registro.establecerEdad(entrada.nextInt()); 
 

 // muestra el contenido del registro
 System.out.printf( "<%-9d%-15s%-18s%10.2f%13s\n",
 registro.obtenerCuenta(), registro.obtenerPrimerNombre(),
 registro.obtenerApellidoPaterno(), registro.obtenerSaldo(), registro.obtenerEdad() );
 
 String linea=(registro.toString());
 Lista.add(linea);
 System.out.println("Contenido de la lista: ");
 System.out.println(Lista.toString());
 
 } // fin de while

 } // fin de try
catch ( NoSuchElementException elementException )
{
 System.err.println( "El archivo no esta bien formado." );
 entrada.close();
 System.exit( 1 );
 } // fin de catch
 catch ( IllegalStateException stateException )
 {
 System.err.println( "Error al leer del archivo." );
 System.exit( 1 );
 } // fin de catch
 } // fin del método leerRegistros

 // cierra el archivo y termina la aplicación
 public void cerrarArchivo()
 {
 if ( entrada != null )
 entrada.close(); // cierra el archivo
 }

    void leerRegistros(List<String> Lista) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 } // fin de la clase LeerArchivoTexto
   
    

