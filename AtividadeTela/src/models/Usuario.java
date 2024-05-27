
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;


public class Usuario {
    private int id;
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private String sexo;
    private String email;
    private String telefone;
    private String celular;
    private String rua;
    private int num;
    private String bairro;
    private String complemento;
    private String uf;
    private String municipio;
    private Date dataCadastro;
    private boolean aptoEmprestimo;

    public Usuario(String nome, String cpf, Date dataNascimento, String sexo, String email, String telefone, String celular, String rua, int num, String bairro, String complemento, String uf, String municipio) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.email = email;
        this.telefone = telefone;
        this.celular = celular;
        this.rua = rua;
        this.num = num;
        this.bairro = bairro;
        this.complemento = complemento;
        this.uf = uf;
        this.municipio = municipio;
        this.dataCadastro = new Date(System.currentTimeMillis());
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public boolean isAptoEmprestimo() {
        return aptoEmprestimo;
    }

    public void setAptoEmprestimo(boolean aptoEmprestimo) {
        this.aptoEmprestimo = aptoEmprestimo;
    }
    
}
