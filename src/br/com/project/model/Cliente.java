package br.com.project.model;

import java.io.Serializable;

public class Cliente implements Serializable {

    protected int id;
    protected String name;
    protected String email;
    protected String cep;
    protected String endereco;
    protected String bairro;
    protected String cidade;
    protected String cpf;
    protected String rg;
    protected String celular;
    protected String telefone;
    protected int numero;
    protected String complemento;
    protected String estado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return " Codigo:" + this.id + " \n Nome: " + this.name + "\n E-mail: " + this.email
                + "\n Cep: " + this.cep + "\n Endereço: " + this.endereco + "\n Bairro: " + this.bairro
                + "\n Cidade: " + this.cidade + "\n Estado: " + this.estado + "\n CPF: " + this.cpf + "\n RG: "
                + this.rg + "\n Celular: " + this.celular + "\n Telefone: " + this.telefone + "\n Numero: "
                + this.numero + "\n Complemento: " + this.complemento;

    }

}
