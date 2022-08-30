package desconto_aplicado;

import java.util.Scanner;

/**
 * Ler o valor de uma compra, aplicar um desconto progressivo: 
 * 
 * até 200 reais 4%.
 * até 500 reais, 6%. 
 * acima de 500, 8%.
 * 
 * Mostrar o valor do desconto e o valor a pagar.
 */
public class Desonto {
	public static void main(String[] args) {
		double desconto;
		double valorCompra, valorDescontado;
		boolean contComprando = true;
		int opcao;

		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("");
			System.out.println("Digite o valor da sua compra: ");
			valorCompra = teclado.nextDouble();

			if (valorCompra <= 200) {
				desconto = valorCompra * 0.04;
				valorDescontado = valorCompra - desconto;
				System.out.print("Seu desconto foi de " + desconto);
				System.out.println(" |desconto em porcentagem = 4%");
				System.out.println("Valor total R$: " + valorDescontado);
			} else if (valorCompra <= 500) {
				desconto = valorCompra * 0.06;
				valorDescontado = valorCompra - desconto;
				System.out.print("Seu desconto foi de " + desconto);
				System.out.println(" |desconto em porcentagem = 6%");
				System.out.println("Valor total R$: " + valorDescontado);
			} else {
				desconto = valorCompra * 0.08;
				valorDescontado = valorCompra - desconto;
				System.out.print("Seu desconto foi de " + desconto);
				System.out.println(" |desconto em porcentagem = 8%");
				System.out.println("Valor total R$: " + valorDescontado);
			}
			System.out.println("");
			System.out.println("Digite 0 para parar ou 1 para continuar: ");
			opcao = teclado.nextInt();
			if (opcao == 0) {
				contComprando = false;
			}
		} while (contComprando == true);

		teclado.close();
	}
}
