package com.example.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PromotionEngine {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(PromotionEngine.class, args);
		int A = 50;
		int B = 30;
		int C = 20;
		int D = 15;
		int threeA = 130;
		int twoB = 45;
		// int cAndd = 15;
		System.out.print("Enter the A items: ");

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String Aitems = input.readLine();
		System.out.print("Enter the B items: ");
		String Bitems = input.readLine();
		System.out.print("Enter the C items: ");
		String Citems = input.readLine();
		System.out.print("Enter the D items: ");
		String Ditems = input.readLine();
		int Cartvalue = 0;
		if (Integer.parseInt(Aitems) > 3)

		{
			int dividend = Integer.parseInt(Aitems) / 3;
			int Mod = Integer.parseInt(Aitems) % 3;
			Cartvalue = Cartvalue + (dividend * threeA) + (Mod * A);
		}
		if (Integer.parseInt(Aitems) == 3) {
			Cartvalue = Cartvalue + threeA;
		}
		if (Integer.parseInt(Aitems) > 0 && Integer.parseInt(Aitems) < 3) {
			Cartvalue = Cartvalue + (Integer.parseInt(Aitems) * A);
		}
		System.out.println("A  cart value is" + Cartvalue);
		if (Integer.parseInt(Bitems) > 2)

		{
			int dividend = Integer.parseInt(Aitems) / 2;
			int Mod = Integer.parseInt(Aitems) % 2;
			Cartvalue = Cartvalue + (dividend * twoB) + (Mod * B);
		}
		if (Integer.parseInt(Aitems) == 2) {
			Cartvalue = Cartvalue + twoB;
		}
		if (Integer.parseInt(Aitems) > 0 && Integer.parseInt(Aitems) < 2) {
			Cartvalue = Cartvalue + (Integer.parseInt(Bitems) * B);
		}
		System.out.println("A and B value is" + Cartvalue);

		if (Integer.parseInt(Citems) != 0)

		{
			Cartvalue = Cartvalue + (C * Integer.parseInt(Citems));
		}
		if (Integer.parseInt(Ditems) != 0)

		{
			Cartvalue = Cartvalue + (D * Integer.parseInt(Ditems));
		}
		System.out.println("Total cart value is" + Cartvalue);

		// List<String> orderI5tems=

	}

}
