package view;

import controller.CalculaINSSFaixa1;
import model.Funcionario;
import persistence.FuncionarioDao;
import util.HibernateUtil;

public class Principal {
  public static void main(String[] args) {
    Funcionario f = new Funcionario();
    f.setId(1);
    f.setNome("Rodrigo");
    f.setSalario(3000f);

    FuncionarioDao fd = new FuncionarioDao(HibernateUtil.getSessionFactory());
    // fd.insere(f);

    CalculaINSSFaixa1 cif1 = new CalculaINSSFaixa1();
    float desconto = cif1.proximoCalculo(f);

    System.out.println(desconto);
  }
}
