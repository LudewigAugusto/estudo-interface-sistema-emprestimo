package model.entities;

import java.util.Date;

import model.services.ServicoPagamentoOnline;

public class Parcelas implements ServicoPagamentoOnline {
	
	private Date dataVencimentoParcela;
	private Double valorParcela;
	
	@Override
	public Double semParcelamento(Double valorContrato) {
		return null;
	}
	
	

}
