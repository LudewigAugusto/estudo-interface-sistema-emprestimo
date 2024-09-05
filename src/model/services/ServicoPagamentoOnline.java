package model.services;

public interface ServicoPagamentoOnline {

	public Double taxaPagamento(Double valorContrato);
	
	public Double juros(Double valorContrato, Integer meses);

}
