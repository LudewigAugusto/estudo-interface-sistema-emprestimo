package model.services;

public interface ServicoPagamentoOnline {

	public Double taxaPagamento(Double valorParcela);
	
	public Double juros(Double valorParcela, Integer meses);

}
