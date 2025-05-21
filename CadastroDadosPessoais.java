/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastrodadospessoais;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class CadastroDadosPessoais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(java.util.Locale.US); // Força usar ponto como separador decimal
        
        System.out.println("=== CADASTRO DE DADOS PESSOAIS ===");
        
        try {
            System.out.print("Digite seu nome completo: ");
            String nome = scanner.nextLine();
            
            System.out.print("Digite sua data de nascimento (DD/MM/AAAA): ");
            String dataNascimento = scanner.nextLine();
            
            System.out.print("Digite seu curso: ");
            String curso = scanner.nextLine();
            
            System.out.print("Digite sua série/ano: ");
            String serie = scanner.nextLine();
            
            double altura = 0;
            double peso = 0;
            
            // Tratamento para altura
            while(true) {
                try {
                    System.out.print("Digite sua altura (em metros, ex: 1.75): ");
                    altura = scanner.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Valor inválido! Use ponto como separador decimal (ex: 1.75)");
                    scanner.nextLine(); // Limpa o buffer
                }
            }
            
            // Tratamento para peso
            while(true) {
                try {
                    System.out.print("Digite seu peso (em kg, ex: 68.5): ");
                    peso = scanner.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Valor inválido! Use ponto como separador decimal (ex: 68.5)");
                    scanner.nextLine(); // Limpa o buffer
                }
            }
            
            // Exibição dos dados cadastrados
            System.out.println("\n=== DADOS CADASTRADOS ===");
            System.out.println("Nome: " + nome);
            System.out.println("Data de Nascimento: " + dataNascimento);
            System.out.println("Curso: " + curso);
            System.out.println("Série/Ano: " + serie);
            System.out.printf("Altura: %.2f m\n", altura);
            System.out.printf("Peso: %.1f kg\n", peso);
            
        } finally {
            scanner.close();
        }
    }
}