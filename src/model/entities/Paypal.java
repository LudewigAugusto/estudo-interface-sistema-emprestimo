package model.entities;

import model.services.ServicoPagamentoOnline;

public class Paypal implements ServicoPagamentoOnline {

	// CALCULA A TAXA DE JUROS (1% AO MÊS)
	@Override
	public Double juros(Double valorParcela, Integer meses) {		
		return valorParcela * (0.01 * meses);
	}

	// CALCULA A TAXA DE PAGAMENTO MENSAL (2% POR PAGAMENTO)
	@Override
	public Double taxaPagamento(Double valorParcela) {
		return valorParcela * 0.02;
	}
	

}
