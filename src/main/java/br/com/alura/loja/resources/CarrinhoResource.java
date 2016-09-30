package br.com.alura.loja.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import br.com.alura.loja.dao.CarrinhoDAO;
import br.com.alura.loja.modelo.Carrinho;

@Path("carrinho")
public class CarrinhoResource {
	
	@GET
	public String busca(){
		Carrinho carrinho = new CarrinhoDAO().busca(1l);
		return carrinho.toXML();
	}

}
