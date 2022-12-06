package problem6;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeCalculator {
	public static void main(String[] args) {

		System.out.println("Welcome to Age Calculator Space");
		System.out.println("Enter your Date of Birth in DD-MM-YYYY format");

		try (Scanner scanner = new Scanner(System.in)) {
			String dateOfBirth = scanner.next();
			DateTimeFormatter dateformatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			Period period = Period.between(LocalDate.parse(dateOfBirth, dateformatter), LocalDate.now());
			System.out.println("You are " + period.getYears() + " years, " + period.getMonths() + " months and "
					+ period.getDays() + " days old");
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
