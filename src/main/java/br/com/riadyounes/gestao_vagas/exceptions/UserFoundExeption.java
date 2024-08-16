package br.com.riadyounes.gestao_vagas.exceptions;

public class UserFoundExeption extends RuntimeException {
  public UserFoundExeption() {
    super("User already exists with the same username or email.");
  }
}
