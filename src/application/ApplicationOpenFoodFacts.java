package application;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

import produit.Stock;

public class ApplicationOpenFoodFacts {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path path = Paths.get("C:/Users/benja/OneDrive/Bureau/Diginamic/JAVA/open-food-facts.csv");
		boolean estFichier = Files.isRegularFile(path);
		boolean estLisible = Files.isReadable(path);

		Scanner sc = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);

		if (estFichier) {
			if (estLisible) {
				List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
				Stock stock = new Stock(lines);
				System.out.println(stock.toString());
			}
		}

	}

}
