package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {

	private int numeroContrato;
	private Date dataContrato;
	private Double valorTotalContrato;
	private List<Parcelamento> parcelasDoContrato = new ArrayList<>();

	public Contrato(int numeroContrato, Date dataContrato, Double valorTotalContrato) {
		this.numeroContrato = numeroContrato;
		this.dataContrato = dataContrato;
		this.valorTotalContrato = valorTotalContrato;
	}

	public int getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(int numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public Date getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(Date dataContrato) {
		this.dataContrato = dataContrato;
	}

	public Double getValorTotalContrato() {
		return valorTotalContrato;
	}

	public void setValorTotalContrato(Double valorTotalContrato) {
		this.valorTotalContrato = valorTotalContrato;
	}
	
	public List<Parcelamento> getParcelasDoContrato() {
		return parcelasDoContrato;
	}

	@Override
	public String toString() {
		StringBuilder stb = new StringBuilder();
		stb.append("\nParcelas : \n");
		for (Parcelamento parcela : parcelasDoContrato) {
			stb.append(parcela.toString() + "\n");
		}

		return stb.toString();
	}

}
