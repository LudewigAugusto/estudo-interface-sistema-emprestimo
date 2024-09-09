package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contrato;
import model.entities.Paypal;
import model.services.ServicoContrato;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);;
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero: ");
		int numero = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		Date data = null;
		try {
			data = sdf.parse(sc.next());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.print("Valor do contrato: ");
		double valorTotalContrato = sc.nextDouble();
		System.out.print("Entre com o número de parcelas: ");
		int parcelas = sc.nextInt();
		
		Contrato contrato = new Contrato(numero, data, valorTotalContrato);
		
		ServicoContrato service = new ServicoContrato(new Paypal());
		
		service.processarContrato(contrato, parcelas);
		
		System.out.println(contrato.toString());
		
		sc.close();
		
	}

}
