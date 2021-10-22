package service;

import java.util.Scanner;

import produit.Stock;

public abstract class MenuService {
	public abstract void traiter(Stock stock, Scanner scanner);
}
