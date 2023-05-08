package br.com.lmartins;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;

public class Projeto {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		String nome;
		char gen;
		
		Scanner ler = new Scanner(System.in);
		
		List<Pessoa> pessoas = new ArrayList<>();
		
			System.out.println("Vamos crirar duas listas separado por Homens e Mulheres.");
		
				while (true) {
					
					Thread.sleep(200);
		            System.out.println("Se deseja parar, digite 'p'; caso contrário, digite o nome:");
		            nome = ler.nextLine();
		            
		            Thread.sleep(200);
		            if (nome.equalsIgnoreCase("p")) {
		            	
		            	System.out.println("Até a próxima!");
		            	break;
		            }
		    

            System.out.println("Digite o sexo 'H' ou 'M':");
            gen = ler.next().charAt(0);
            
            pessoas.add(new Pessoa(nome, gen, gen));
            ler.nextLine(); // limpar o buffer
		
				}
				
				List<Pessoa> homem1 = new ArrayList<>();
		        List<Pessoa> mulher1 = new ArrayList<>();
		
		        for (Pessoa pessoa : pessoas) {
		            if (pessoa.getGen() == 'H' || pessoa.getGen() == 'h'){	            	
		            	homem1.add(pessoa);
		            } 
		            
		            else if (pessoa.getGen() == 'M' || pessoa.getGen() == 'm') {
		                mulher1.add(pessoa);
		            }
		               
		            else {
		            break;
	                }
          	        
		        }
		        Collections.sort(homem1);
		        Collections.sort(mulher1);

		        System.out.println("\nHomens:\n");
		        for (Pessoa homem : homem1) {
		            System.out.println(homem.getNome());
		        }

		        System.out.println("\nMulheres:\n");
		        for (Pessoa mulher : mulher1) {
		            System.out.println(mulher.getNome());
		        }
		    }
		}
