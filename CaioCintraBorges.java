/*
 * Copyright (C) 2024 Caio Cintra B. Paula <caioexecutivo11@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
 /*Pacote Inicial do Projeto*/
package avaliacao.n1;

/*Biblioteca para entrada de dados através do usuário*/
import java.util.Scanner;

/**
 * Informações do autor do código
 *
 * @author Caio Cintra B. Paula <caioexecutivo11@gmail.com>
 * @date 08/03/2024
 * @brief Class $(name)
 */

/*Classe pública Prova*/
public class Prova1 {

    /*método inicial para executar o programa*/
    public static void main(String[] args) {
        
        /*Atribuições iniciais para declaração das variáveis*/
        int opcao = 0, qde_expresso = 0, qde_leite_com_cafe = 0, qde_croissant = 0, qde_paodemel = 0, qde_cafes_vendidos;
        double valor_expresso, valor_leite_com_cafe, valor_croissant, valor_paodemel, valor_cafes_vendidos;
        
        /*Comando que permite a entrada de dados e prepara o computador para a entrada de dados*/
        Scanner sc = new Scanner(System.in);
        do {
            /*Comando de escrita para o usuário fazer a seleção*/
            System.out.println("Forneça uma opção: \n"
                    + "1 - café expresso; \n"
                    + "2 - leite com café; \n"
                    + "3 - pão de mel; \n"
                    + "4 - croissant; \n"
                    + "5 - totalizar vendas; \n");
                    

            opcao = sc.nextInt();
            
            /*Laço de repetição que atribui os valores iniciais 
            para as variáveis segundo as escolhas do usuário*/
            if (opcao == 1) {
                qde_expresso++;
            } else if (opcao == 2) {
                qde_leite_com_cafe++;
            } else if (opcao == 3) {
                qde_paodemel++;
            } else if (opcao == 4) {
                qde_croissant++;
            } else if (opcao == 5) {
                System.out.println("Opção Inválida");
            }

        } while (opcao != 5);
       
        /*Atribuição que irá multiplicar os itens escolhidos pelo usuário pelo
        seu respectivo valor, gerando assim o total a se pagar*/
        valor_expresso = qde_expresso * 0.75;
        valor_leite_com_cafe = qde_leite_com_cafe * 1.25;
        valor_croissant = qde_croissant * 3.00;
        valor_paodemel = qde_paodemel * 2.50;
        qde_cafes_vendidos = qde_expresso + qde_leite_com_cafe + qde_croissant + qde_paodemel;
        valor_cafes_vendidos = valor_expresso + valor_leite_com_cafe + valor_croissant + valor_paodemel;
        
        /*Comando final que irá exibir na tela as escolhas e 
        o preço total do pedido do usuário*/
        System.out.println("Qde café expresso: " + qde_expresso + " - valor: " + valor_expresso);
        System.out.println("Qde leite com café: " + qde_leite_com_cafe + " - valor: " + valor_leite_com_cafe);
        System.out.println("Qde croissants: " + qde_croissant + " - valor: " + valor_croissant);
        System.out.println("Qde pão de mel: " + qde_paodemel + " - valor: " + valor_paodemel);
        System.out.println("Qde cafés vendidos: " + qde_cafes_vendidos + " - valor cafés vendidos: " + valor_cafes_vendidos);
        
    }
} 

/*Fim do código*/
