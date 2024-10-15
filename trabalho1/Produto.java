package trabalho1;

public class Produto {

	private String nome;
	private float  preco;
	private int    quantidade;

	Produto(String nome, float preco, int qnt){
		this.nome = nome;
		this.serPreco(preco);
		this.setQuantidade(qnt);
	}

	
	void setQuantidade(int qnt){
		if(qnt >= 0){
			this.quantidade = qnt;
			return;
		}
		this.quantidade = 0;
	}

	void serPreco(float valor){
		if(valor >= 0.0f){
			this.preco = valor;
			return;
		}
		this.preco = 0.0f;
	}

	
	String getNome(){
		return this.nome;
	}

	float getPreco(){
		return this.preco;
	}

	int getQuantidade(){
		return this.quantidade;
	}	

	
	Boolean adicionarEstoque(int quantidade){
		if(quantidade >= 0){
			this.quantidade += quantidade;
			return true;
		}
		return false;
	}

	Boolean removerEstoque(int quantidade){
		if(this.quantidade < quantidade){
			return false;
		}
		this.quantidade -= quantidade;
		return true;
	}

	@Override
	public String toString(){
		return "Produto [" + this.getNome() + "] -> preco: R$" + this.getPreco() + " quantidade: " + this.getQuantidade() + ".";
	}

	@Override
	public boolean equals(Object produto){
		
		if(this == produto)
			return true;

		if(produto == null || this.getClass() != produto.getClass())
			return false;

		Produto prod = (Produto) produto;

		return this.nome.equals(prod.nome) && this.getPreco() == prod.getPreco() && this.getQuantidade() == prod.getQuantidade();
	}
}