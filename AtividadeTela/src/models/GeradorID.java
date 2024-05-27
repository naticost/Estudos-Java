
package models;


public class GeradorID {
    public static int idUsuario    = 0;
    public static int idLivro      = 0;
    public static int idEmprestimo = 0;
    
    public static int getIdUsuario(){
        return ++idUsuario;
    }
 
    public static int getIdLivro(){
        return ++idLivro;
    }
 
    public static int getIdEmprestimo(){
        return ++idEmprestimo;
    }
}