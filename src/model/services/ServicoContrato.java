//CLASSE RESPONSÁVEL POR FAZER O PROCESSAMENTO DO PARCELAMENTO DO CONTRATO
//REGISTRA O NÚMERO DE PARCELAS, O VALOR E A DATA DE PAGEMENTO DAS PARCELAS DO CONTRATO

package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contrato;
import model.entities.Parcelamento;

public class ServicoContrato {

	private ServicoPagamentoOnline servicoPagamento;

	public ServicoContrato(ServicoPagamentoOnline servicoPagamento) {
		this.servicoPagamento = servicoPagamento;
	}

	public void processarContrato(Contrato contrato, Integer meses) {

		Date dataInicial = contrato.getDataContrato();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInicial);

		for (int i = 1; i <= meses; i++) {

			calendar.add(Calendar.MONTH, 1);
			Date novaData = calendar.getTime();
			double parcelaBase = contrato.getValorTotalContrato()/meses;
			double juros = servicoPagamento.juros(parcelaBase, i);
			double taxaPagamento = servicoPagamento.taxaPagamento(parcelaBase + juros);
			double valorParcela = taxaPagamento + juros + parcelaBase;
			
			Parcelamento parcelamento = new Parcelamento(novaData, valorParcela);

			contrato.getParcelasDoContrato().add(parcelamento);

		}

	}
}