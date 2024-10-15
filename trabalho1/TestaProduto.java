package trabalho1;

import java.util.Scanner;

/*

	OBSERVAÇÃO: depois de inserir os valores que forem solicitados precione "ENTER" para continuar.

*/

public class TestaProduto {
	
	static Scanner input = new Scanner(System.in); 	//Objeto Scanner captura entrada do usuario
	static Produto[] Estoque = new Produto[2];		//estoque de produtos
	static Produto p1, p2;							//Objetos da clasee Produto, inicialmento valendo null

	public static void main(String[] args){

		while(true){ 								//gera um loop infinito
			menu(); 								//exibi o menu

			System.out.println("opcao:"); 			//solicita uma opcao
			int opcao = input.nextInt(); 			//captura a opcao escolhida
			input.nextLine(); 						//limpa o buffer

			switch (opcao){ 						//executa a funcao correta para a opcao desejada
				case 1:
					CriarProdutos();
					break;

				case 2:
					InserirProdutoAoEstoque(1);
					break;
					
				case 3:
					InserirProdutoAoEstoque(2);
					break;
					
				case 4:
					RemoverProdutoDoEstoque(1);
					break;
					
				case 5:
					RemoverProdutoDoEstoque(2);
					break;

				case 6:
					ImprimirEstoque();
					break;

				case 7:
					CompararProdutosDoEstoque();
					break;

				case 8:
					input.close(); 					//fecha o scaner 
					return; 						//sai do loop

				default:
					break; 							//repete o processo.
			}
			
		}

	}

	public static Produto CriarProduto(){

		System.out.println("Insira o nome do produto:");
		String nome_produto = input.nextLine();
		input.nextLine();
		
		System.out.println("Insira o preco do produto:");
		float preco_produto = Float.parseFloat(input.nextLine());
		input.nextLine();
		
		System.out.println("Insira a quantidade inicial do produto:");
		int quantidade_produto = Integer.parseInt(input.nextLine());
		input.nextLine();

		return new Produto(nome_produto, preco_produto, quantidade_produto);
	}
	

	public static void AdicionarQuantidadeAoProduto(int indice, int quantidade){
		Estoque[indice - 1].adicionarEstoque(quantidade);
	}

	public static void RemoverQuantidadeDoProduto(int indice, int quantidade){
		Estoque[indice - 1].removerEstoque(quantidade);
	}
	
	public static void InserirProdutoAoEstoque(int indice){
		if(Estoque[indice - 1] != null){
			System.out.println("quanto deseja adicionar?:");
			int qnt = input.nextInt();
			input.nextLine();
	
			AdicionarQuantidadeAoProduto(indice, qnt);
		} else {
			System.out.println("Este produto ainda nao foi criado.");
		}
	}

	public static void RemoverProdutoDoEstoque(int indice){
		if(Estoque[indice - 1] != null){
			System.out.println("quanto deseja remover?:");
			int qnt = input.nextInt();
			input.nextLine();
	
			RemoverQuantidadeDoProduto(indice, qnt);
		} else {
			System.out.println("Este produto ainda nao foi criado.");
		}
	}
	
	public static void CriarProdutos(){
		p1 = CriarProduto(); 	//atribui a p1 uma nova instancia de Produto
		p2 = CriarProduto();	//atribui a p2 uma nova instancia de Produto

		Estoque[0] = p1; 		//adiciona p1 ao estoque
		Estoque[1] = p2;		//adiciona p2 ao estoque
	}

	public static void ImprimirEstoque(){
		if(Estoque[0] != null && Estoque[1] != null){
			System.out.println("[ESTOQUE] -> quantidade de produtos: " + Estoque.length);
			for(Produto produto: Estoque){
				System.out.println(produto.toString());
			}
		} else {
			System.out.println("[ESTOQUE] -> quantidade de produtos: vazio");
		}
	}

	public static void CompararProdutosDoEstoque(){
		if(Estoque[0] != null && Estoque[1] != null)
			System.out.println("produto[p1] == produto[p2] -> " + Estoque[0].equals(Estoque[1]) + "\n");
		else
			System.out.println("Nao há items suficiente no estoque para comparacao.");
	}

	public static void menu(){
		System.out.println("Opção 1 – Criar Produto 1 e Produto 2.\n");
		System.out.println("Opção 2 – Inserir Estoque Produto 1.\n");
		System.out.println("Opção 3 – Inserir Estoque Produto 2.\n");
		System.out.println("Opção 4 – Remover Estoque Produto 1.\n");
		System.out.println("Opção 5 - Remover Estoque Produto 2.\n");
		System.out.println("Opção 6 – Imprimir Estoque Produto 1 e Produto 2 .\n");
		System.out.println("Opção 7 – Comparar Produto 1 e Produto 2.\n");
		System.out.println("Opção 8 - Sair.\n");
	}

}