package leeryescribir;

public class PruebaLeerArchivodeTexto {
    public static void main( String[] args )
  {
 LeerArchivodeTexto aplicacion = new LeerArchivodeTexto();
 
 aplicacion.abrirArchivo();
 aplicacion.leerRegistros();
 aplicacion.cerrarArchivo();
 } 
}
