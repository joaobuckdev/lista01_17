import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o tamanho em metros quadrados da área a ser pintada: ");
        double tamanhoArea = teclado.nextDouble();
        teclado.close();

        double litrosTinta = tamanhoArea / 6.0;

        litrosTinta *= 1.1;

        int quantidadeLatas = (int) Math.ceil(litrosTinta / 18.0);
        int quantidadeGaloes = (int) Math.ceil(litrosTinta / 3.6);

        double precoLatas = quantidadeLatas * 80.0;
        double precoGaloes = quantidadeGaloes * 25.0;

        int quantidadeLatasMistura = (int) (litrosTinta / 18.0);
        double restoLitrosTinta = litrosTinta % 18.0;
        int quantidadeGaloesMistura = (int) Math.ceil(restoLitrosTinta / 3.6);
        double precoMistura = quantidadeLatasMistura * 80.0;
        precoMistura += quantidadeGaloesMistura * 25.0;

        System.out.println(" ");
        System.out.println("Quantidade de tinta necessária: " + litrosTinta + " litros");
        System.out.println("Opção 1 - Comprar apenas latas de 18 litros: " + quantidadeLatas + " latas de tinta, preço = R$" + precoLatas);
        System.out.println("Opção 2 - Comprar apenas galões de 3,6 litros: " + quantidadeGaloes + " galões de tinta, preço = R$" + precoGaloes);
        System.out.println("Opção 3 - Misturar latas e galões: " + quantidadeLatasMistura + " latas e " + quantidadeGaloesMistura + " galões de tinta, preço = R$" + precoMistura);
    }
}
