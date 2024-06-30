package models;

import exceptions.RegistroNaoEncontradoException;
import java.util.ArrayList;


public class Database {
    
    private static ArrayList<Livro> livros = new ArrayList<>();
    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    private static ArrayList<Emprestimo> emprestimos = new ArrayList<>();
    
    
    /**
     * Livros
     */
    
    public static ArrayList<Livro> getLivros() {
        return livros;
    }
    
    public static void addLivro(Livro livro) {
        livro.setId(GeradorID.getIdLivro());
        livros.add(livro);
    }
    
    public static void excluirLivro(int index) {
        livros.remove(index);
    }
    
    public static Livro encontrarLivro(int id) throws RegistroNaoEncontradoException {
        for(Livro l : livros) {
            if(l.getId() == id) {
                return l;
            }
        }
        throw new RegistroNaoEncontradoException("Livro não encontrado");
    }
    
    public static void setIndisponivel(int id){
        int length = livros.size();
        for(int i = 0; i < length; i++) {
            if(livros.get(i).getId() == id) {
                livros.get(i).setDisponivel(false);
                return;
            }
        }
    }
    
    public static void setDisponivel(int id){
        int length = livros.size();
        for(int i = 0; i < length; i++) {
            if(livros.get(i).getId() == id) {
                livros.get(i).setDisponivel(true);
                return;
            }
        }
    }
    
    
    /**
     * Usuarios
     */
    
    public static void addUsuario(Usuario usuario) {
        usuario.setId(GeradorID.getIdUsuario());
        usuarios.add(usuario);
    }

    public static ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    
    public static void excluirUsuario(int index) {
        usuarios.remove(index);
    }
    
    public static Usuario encontrarUsuario(int id) throws RegistroNaoEncontradoException {
        for(Usuario u : usuarios) {
            if(u.getId() == id) {
                return u;
            }
        }
        throw new RegistroNaoEncontradoException("Usuário não encontrado");
    }
    
    
    /**
     * Emprestimos
     */

    public static ArrayList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }    
    
    public static void addEmprestimo(Emprestimo emprestimo) {
        emprestimo.setId(GeradorID.getIdEmprestimo());
        emprestimos.add(emprestimo);
    }
    
    public static void excluirEmprestimo(Emprestimo emprestimo){
        int length = emprestimos.size();
        for(int i = 0; i < length; i++) {
            if(emprestimos.get(i).equals(emprestimo)) {
                emprestimos.remove(i);
                return;
            }
        }
    }
    
    public static void excluirEmprestimoPorId(int id){
        int length = emprestimos.size();
        for(int i = 0; i < length; i++) {
            if(emprestimos.get(i).getId() == id) {
                emprestimos.remove(i);
                return;
            }
        }
    }
    
    public static Emprestimo encontrarEmprestimoIdEmprestimo(int idEmprestimo) throws RegistroNaoEncontradoException{
        for(Emprestimo e: emprestimos){
            if(e.getId() == idEmprestimo){
                return e;
            }
        }
        throw new RegistroNaoEncontradoException("Emprestimo não encontrado");
    }
    
    public static Emprestimo encontrarEmprestimoIdLivro(int idLivro) throws RegistroNaoEncontradoException{
        for(Emprestimo e: emprestimos){
            if(e.getLivro().getId() == idLivro) {
                return e;
            }
        }
        throw new RegistroNaoEncontradoException("Emprestimo não encontrado");
    }
    
}