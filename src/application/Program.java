package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		List<Produto> list = new ArrayList<>();

		System.out.print("Entre com o numero de produtos: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Datos do produto #" + i + ":");
			System.out.print("Comum, usado, importado (c/u/i)? ");
			char type = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Preco: ");
			double price = sc.nextDouble();
			
			if (type == 'c') {
				list.add(new Produto(name, price));
			} else if (type == 'u') {
				System.out.print("Data de fabricacao (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new ProdutoUsado(name, price, date));
			} else {
				System.out.print("Taxa de importacao: ");
				double taxaAfandega = sc.nextDouble();
				list.add(new ProdutoImportado(name, price, taxaAfandega));
			}
		}

		System.out.println();
		System.out.println("ETIQUETAS DE PRECO:");
		for (Produto prod : list) {
			System.out.println(prod.precoTag());
		}

		sc.close();

	}

}
