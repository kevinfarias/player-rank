package br.edu.infnet.playerrank.model.domain;

public class Jogador {
   private int codigo;
   private String cidade;

   private String nome;

   private String cpf;

   private String email;

   @Override
   public String toString() {
      return cidade + ";" + nome + ";" + cpf + ";" + email;
   }

   public int getCodigo() {
      return codigo;
   }

   public void setCodigo(int codigo) {
      this.codigo = codigo;
   }

   public String getCidade() {
      return cidade;
   }

   public void setCidade(String cidade) {
      this.cidade = cidade;
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

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }
}
