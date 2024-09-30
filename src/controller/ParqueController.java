package controller;

import br.edu.fateczl.fila.Fila;
import model.Pessoa;

public class ParqueController {

    public void brinquedo(Fila<Pessoa> fila) throws Exception {
        while (!fila.isEmpty()) {
            Pessoa pessoa = fila.remove();
            if (pessoa.idade > 16 && pessoa.altura > 1.60) {
                System.out.println(pessoa.nome + " passou para o brinquedo.");
            } else {
                if (pessoa.idade <= 16) {
                    System.out.println(pessoa.nome + " não pode entrar no brinquedo: idade insuficiente.");
                }
                if (pessoa.altura <= 1.60) {
                    System.out.println(pessoa.nome + " não pode entrar no brinquedo: altura insuficiente.");
                }
            }
        }
    }
}
