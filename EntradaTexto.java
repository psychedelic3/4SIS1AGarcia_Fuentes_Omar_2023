//debe de tener una clase
//public class 

//variable int num por defecto es publico public int num

class EntradaTexto{


//debe de existir un metodo principal 
public static void main(String[]args){
    //debemos de crear una estructura basica
    //declaracion
    String nombre;
    //mensaje para el usuario
    System.out.println("Por favor ingresa tu nombre: ");
    //ln es el salto de linea

    //asignar operacion o comportamieno le voy a otorgar a la variable

nombre = System.console().readLine();

//System , es la clase del sistema
//console () es el metodo que puede obtener los datos de la consola
//readLine es el metodo que puede dar lectura a los dato introducidos en la consola

System.out.println(" Hola " +  nombre  + " Bienvenido a tronar ");



}






}