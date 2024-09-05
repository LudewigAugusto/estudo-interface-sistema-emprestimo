package model.entities;

import java.time.format.DateTimeFormatter;

public class Contrato {
	
	private int numeroContrato;
	private DateTimeFormatter dataContrato;
	private Double valorTotalContrato;
	private int parcelamentoContrato;
	
	public Contrato(int numeroContrato, DateTimeFormatter dataContrato, Double valorTotalContrato, int parcelamentoContrato) {
		this.numeroContrato = numeroContrato;
		this.dataContrato = dataContrato;
		this.valorTotalContrato = valorTotalContrato;
		this.parcelamentoContrato = parcelamentoContrato;
		
	}

	public int getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(int numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public DateTimeFormatter getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(DateTimeFormatter dataContrato) {
		this.dataContrato = dataContrato;
	}

	public Double getValorTotalContrato() {
		return valorTotalContrato;
	}

	public void setValorTotalContrato(Double valorTotalContrato) {
		this.valorTotalContrato = valorTotalContrato;
	}
	
	public int getParcelamentoContrato() {
		return parcelamentoContrato;
	}

	public void setParcelamentoContrato(int parcelamentoContrato) {
		this.parcelamentoContrato = parcelamentoContrato;
	}
	

}
