//CLASSE RESPONSÁVEL POR FAZER O PROCESSAMENTO DO PARCELAMENTO DO CONTRATO
//REGISTRA O NÚMERO DE PARCELAS, O VALOR E A DATA DE PAGEMENTO DAS PARCELAS DO CONTRATO

package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contrato;
import model.entities.Parcelamento;
import model.entities.Paypal;

public class ServicoContrato {
	
	private ServicoPagamentoOnline servicoPagamento;
	
	public void processarContrato(Contrato contrato, Integer meses) {
		
		servicoPagamento = new Paypal();
		
		Date dataInicial = contrato.getDataContrato();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInicial);
		
		for (int i = 1; i <= meses; i++) {
			
			// FOR PARA IR ADICIONANDO O MËS
			calendar.add(Calendar.MONTH, 1);
			Date novaData = calendar.getTime();
			
			Parcelamento parcelamento = new Parcelamento(
					// DATA COM O MÊS ADICIONADO
					novaData,
					// CALCULO DO VALOR DA PARCELA PASSANDO COMO PARÂMETROS OS CÁLCULOS DA CLASSE PAYPAL
					servicoPagamento.juros((contrato.getValorTotalContrato()/meses), i) 
					+ servicoPagamento.taxaPagamento(servicoPagamento.juros((contrato.getValorTotalContrato()/meses), i)));
			
			contrato.adicionarParcelasContrato(parcelamento);
			
		}		

	}	
}