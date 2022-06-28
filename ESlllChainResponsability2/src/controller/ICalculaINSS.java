package controller;

import model.Funcionario;

public interface ICalculaINSS {
  public float calculaINSS(Funcionario f);

  public float proximoCalculo(Funcionario f);
}
