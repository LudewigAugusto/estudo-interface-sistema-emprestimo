package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcelamento {
	
	private Date dataVencimentoParcela;
	private Double valorParcela;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Parcelamento(Date dataVencimentoParcela, Double valorParcela) {
		this.dataVencimentoParcela = dataVencimentoParcela;
		this.valorParcela = valorParcela;
	}

	@Override
	public String toString() {
		return sdf.format(dataVencimentoParcela) + String.format(" - R$ %.2f",valorParcela);
	}
	
	
}
