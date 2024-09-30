package view;

import br.edu.fateczl.fila.Fila;
import controller.ParqueController;
import model.Pessoa;

import java.util.Random;

public class Principal {
    public static void main(String[] args) throws Exception {
        Fila<Pessoa> fila = new Fila<>();

        Random random = new Random();
        for (int i = 1; i <= 30; i++) {
            String nome = "Pessoa" + i;
            int idade = random.nextInt(31) + 10;
            float altura = (float) (1.35 + (random.nextFloat() * (2.00 - 1.35)));
            fila.insert(new Pessoa(nome, idade, altura));
        }

        ParqueController parqueController = new ParqueController();
        parqueController.brinquedo(fila);
    }
}
