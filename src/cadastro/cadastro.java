package cadastro;

import java.util.Scanner;

public class cadastro {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Cachorro>listaDeCachorros = new ArrayList<>();
		ArrayList<Gato>listaDeGatos = new ArrayList<>();
		do {
		System.out.println("MENU" 
				+ "\n1 - Cadastrar um animal" 
				+ "\n2 - Editar um animal" 
				+ "\n3 - Remover um animal"
				+ "\n4 - Mostrar todos os animais"
				+ "\n5 - Fechar");
		int escolha = sc.nextInt();
        switch (escolha) {
        case 1:{
        	System.out.println("O animal é um:"
        			+"\n1- Cachorro(a)"
        			+"\n2 - Gato(a)"
        			+"\n3 - Voltar");
        			int escolhaCadastro= sc.nextInt();
        			switch(escolhaCadastro) {
        			case 1:{
        				System.out.println("MENU\nCadastro de um novo Cachorro: ");
        				System.out.println("Nome: ");
        				String nome= sc.next();
        				System.out.println("Idade: ");
        				int idade = sc.nextInt();
        				System.out.println("Raça: ");
        				String raça = sc.next();
        				System.out.println("Peso: ");
        				double peso = sc.nextDouble();
        				System.out.println("Sexo: ");
        				String sexo = sc.next();
        				listaDeCachorros .add(new Cachorro(nome ,idade , raça , peso , sexo));
        		        
        			}case 2: {
        		
        				System.out.println("MENU\nCadastro de um novo Gato: ");
        				System.out.println("Nome: ");
        				String nome=sc.next();
        				System.out.println("Idade: ");
        				int idade =sc.nextInt();
        				System.out.println("Raça: ");
        				String raça =sc.next();
        				System.out.println("Cor do pelo: ");
        				String corDoPelo =sc.next();
        				System.out.println("Sexo: ");
        				String sexo =sc.next();
        				listaDeGatos .add(new Gato(nome ,idade , raça , corDoPelo , sexo));
        			}case 3:{
        				break;
        			}
            }
            break;
        }
        case 2:{
        	System.out.println("O animal é um:"
        			+"\n1- Cachorro(a)"
        			+"\n2 - Gato(a)"
        			+"\n3 - Voltar");
        			int escolhaCadastroParaEditar=sc.nextInt();
        			switch(escolhaCadastroParaEditar) {
        			case 1:{
        				System.out.println("\nMenu\nEditar Cadastro de um Cachorro \nInforme o número do cadastro: ");
        				int EscolhaCadrasto=sc.nextInt();
        				
        				for (int i = 0; i < listaDeCachorros.size(); i++) {
        					
        					if ( EscolhaCadrasto == listaDeCachorros.get(i).getNumCachorro()) {
        						int escolhaEditar;
        						do{
        							System.out.println("MENU"
        						        +"\n1 - Editar nome"
        								+"\n2 - Editar Idade"
        								+"\n3 - Editar raça"
        								+"\n4 - Editar Peso"
        								+"\n5 - Editar Sexo"
        								+"\n6 - Voltar");
        						    escolhaEditar=sc.nextInt();
        						    switch(escolhaEditar) {
        						    case 1:
        						    	System.out.println("Informe o nome da nova pessoa cadastrada: ");
        						    	String nome = sc.next();
        						    	listaDeCachorros.get(i).setNome(nome);
        						    	break;
        						   
        						    case 2:
        						    	System.out.println("Idade: ");
        						    	int idade =sc.nextInt();
        						    	listaDeCachorros.get(i).setIdade(idade);
        						    	break;
        						    case 3:
        						    	System.out.println("Raça: ");
        						    	String raça =sc.next();
        						    	listaDeCachorros.get(i).setRaça(raça);
        						    	break;
        						    case 4:
        						    	System.out.println("Peso: ");
        						    	int  peso = sc.nextInt();
        						    	listaDeCachorros.get(i).setPeso(peso);
        						    	break;
        						    case 5:
        						    	System.out.println("Sexo: ");
        						        String sexo=sc.next();
        						    	listaDeCachorros.get(i).setSexo(sexo);
        						    	break;
        						    case 6:
        						    	break;
        						    }
        						
        						    break;
        					    } while ( escolhaEditar != 6);
        					}
        				}
        				break;
        			}case 2:{
        				System.out.println("\nMenu"+"\nEditar Cadastro de um Gato \nInforme o número do cadastro: ");
        				int EscolhaCadrasto=sc.nextInt();
        				
        				for (int i = 0; i < listaDeGatos.size(); i++) {
        					
        					if ( EscolhaCadrasto == listaDeGatos.get(i).getNumGatos()) {
        						int escolhaEditar;
        						do{
        							System.out.println("MENU"
        						        +"\n1 - Editar nome"
        								+"\n2 - Editar Idade"
        								+"\n3 - Editar raça"
        								+"\n4 - Editar Peso"
        								+"\n5 - Editar Sexo"
        								+"\n7 - Voltar");
        						    escolhaEditar=sc.nextInt();
        						    switch(escolhaEditar) {
        						    case 1:
        						    	System.out.println("Informe o nome da nova pessoa cadastrada: ");
        						    	String nome = sc.next();
        						    	listaDeGatos.get(i).setNome(nome);
        						    	break;
        						   
        						    case 2:
        						    	System.out.println("Idade: ");
        						    	int idade =sc.nextInt();
        						    	listaDeGatos.get(i).setIdade(idade);
        						    	break;
        						    case 3:
        						    	System.out.println("Raça: ");
        						    	String raça =sc.next();
        						    	listaDeGatos.get(i).setRaça(raça);
        						    	break;
        						    case 4:
        						    	System.out.println("Cor do pelo: ");
        						    	String  corDoPelo = sc.next();
        						    	listaDeGatos.get(i).setCorDoPelo(corDoPelo);
        						    	break;
        						    case 5:
        						    	System.out.println("Sexo: ");
        						        String sexo=sc.next();
        						        listaDeGatos.get(i).setSexo(sexo);
        						    	break;
        						    case 6:
        						    	break;
        						    case 7:
        						    	System.out.println(listaDeGatos.get(i).getInformacoesGatos());
        						    }
        						
        						    break;
        					    } while (escolhaEditar != 7);
        				}
        		    }
        	       break;
        		}case 3:{
        			break;
        		}		
           }
        break;
        }case 3:{
        	System.out.println("MENU"+"\nO animal é um: "+
                    "\n1- Cachorro"
        			+"\n2 - Gato"
                    +"\n3 - Voltar");
        	int escolhaCadastroParaExcluir=sc.nextInt();
			switch(escolhaCadastroParaExcluir) {
			case 1:{
				System.out.println("MENU \nExcluir um cadastro de um cachorro");
				System.out.println("Informe o número de cadastro do cachorro:");
				int EscolhaCadrasto=sc.nextInt();
				
				for (int i = 0; i < listaDeCachorros.size(); i++) {
					
					if ( EscolhaCadrasto == listaDeCachorros.get(i).getNumCachorro()) {
						listaDeCachorros.remove(i);
					}
				
			}
			break;
			}case 2:{
				System.out.println("MENU \nExcluir um cadastro de um Gato");
				System.out.println("Informe o número de cadastro do Gato:");
				int EscolhaCadrastoGato=sc.nextInt();
				
				for (int i = 0; i < listaDeGatos.size(); i++) {
					
					if ( EscolhaCadrastoGato == listaDeGatos.get(i).getNumGatos()) {
						listaDeGatos.remove(i);
					}
				}
				break;
				}case 3:{
					break;
				}
			}
			break;
        }case 4:{
        	System.out.println("MENU \nO animal é: "
        			+"\n1 - Cachorro"
        			+"\n2 - Gato"
        			+"\n3 - Voltar");
        	int escolhaInformacoes = sc.nextInt();
        	switch(escolhaInformacoes) {
        	case 1:
        		System.out.println("Informações de todos os cachorros: ");
        		for (int i = 0; i < listaDeCachorros.size(); i++) {
					System.out.println(listaDeCachorros.get(i).getInformacoesCachorros());
					
				}
        		break;
        	case 2:
        		System.out.println("Informações de todos os cachorros: ");
        		for (int i = 0; i < listaDeGatos.size(); i++) {
					System.out.println(listaDeGatos.get(i).getInformacoesGatos());
					
				}
        		break;
        	case 3:
        		break;
        	}
        	break;
        }case 5:{
        	System.exit(0);
        	break;
		
		}

      }
	}while(true);
	}

}


