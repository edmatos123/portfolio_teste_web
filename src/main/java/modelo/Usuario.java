package modelo;

public class Usuario {

    private String nomeCompleto;
    private String email;
    private String tipoGenero;
    private String senha;
    private String dia;
    private String mes;
    private String ano;
    private String primeiroNome;
    private String ultimoNome;
    private String empresa;
    private String endereco;
    private String endereco2;
    private String pais;
    private String estado;
    private String cidade;
    private String cep;
    private String celular;

    public Usuario nomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
        return this;
    }

    public Usuario email(String email) {
        this.email = email;
        return this;
    }

    public Usuario tipoGenero(String tipoGenero) {
        this.tipoGenero = tipoGenero;
        return this;
    }

    public Usuario senha(String senha) {
        this.senha = senha;
        return this;
    }

    public Usuario dia(String dia) {
        this.dia = dia;
        return this;
    }

    public Usuario mes(String mes) {
        this.mes = mes;
        return this;
    }

    public Usuario ano(String ano) {
        this.ano = ano;
        return this;
    }

    public Usuario primeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
        return this;
    }

    public Usuario ultimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
        return this;
    }

    public Usuario empresa(String empresa) {
        this.empresa = empresa;
        return this;
    }

    public Usuario endereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    public Usuario endereco2(String endereco2) {
        this.endereco2 = endereco2;
        return this;
    }

    public Usuario pais(String pais) {
        this.pais = pais;
        return this;
    }

    public Usuario estado(String estado) {
        this.estado = estado;
        return this;
    }

    public Usuario cidade(String cidade) {
        this.cidade = cidade;
        return this;
    }

    public Usuario cep(String cep) {
        this.cep = cep;
        return this;
    }

    public Usuario celular(String celular) {
        this.celular = celular;
        return this;
    }

    public String getNomeCompleto() { return nomeCompleto; }
    public String getEmail() { return email; }
    public String getTipoGenero() { return tipoGenero; }
    public String getSenha() { return senha; }
    public String getDia() { return dia; }
    public String getMes() { return mes; }
    public String getAno() { return ano; }
    public String getPrimeiroNome() { return primeiroNome; }
    public String getUltimoNome() { return ultimoNome; }
    public String getEmpresa() { return empresa; }
    public String getEndereco() { return endereco; }
    public String getEndereco2() { return endereco2; }
    public String getPais() { return pais; }
    public String getEstado() { return estado; }
    public String getCidade() { return cidade; }
    public String getCep() { return cep; }
    public String getCelular() { return celular; }
}