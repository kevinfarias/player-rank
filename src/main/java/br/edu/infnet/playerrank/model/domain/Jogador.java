package br.edu.infnet.playerrank.model.domain;

public class Jogador {
   public int codigo;
   public String cidade;
   public String nome;
   public String cpf;
   public String email;

   @Override
   public String toString() {
      return cidade + ";" + nome + ";" + cpf + ";" + email;
   }
}
