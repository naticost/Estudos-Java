
package models;

import java.util.Date;


public class Emprestimo {
    
    private int id;
    private Usuario usuario;
    private Livro livro;
    private Date dataEmprestimo;
    private Date dataDevolucao;
    
    // 7 Dias em milisegundos
    static final int DIAS_EMPRESTIMO = 60 * 60 * 24 * 7 * 1000;
    
    public Emprestimo(int id, Usuario usuario, Livro livro) {
        this.id = id;
        this.livro = livro;
        this.usuario = usuario;
        dataEmprestimo = new Date(System.currentTimeMillis());
        dataDevolucao = new Date(
                dataEmprestimo.getTime() + new Date(DIAS_EMPRESTIMO).getTime()
            );
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return this.id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }


}
