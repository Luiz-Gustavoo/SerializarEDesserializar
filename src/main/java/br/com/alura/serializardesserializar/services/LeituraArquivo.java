package br.com.alura.serializardesserializar.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeituraArquivo {

    public void lerArquivo(File arquivo) throws FileNotFoundException {
        Scanner leitor = new Scanner(arquivo);

        while (leitor.hasNextLine()) {
            String textoArquivo = leitor.nextLine();
            System.out.println(textoArquivo);
        }
    }
}
