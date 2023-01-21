import java.io.*;
import java.util.*;

class quiz {
	public static void main(String args[]) throws IOException {
		int num;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String s;
		System.out.println("Enter the password: ");
		s = br.readLine();
		num = Integer.parseInt(s);

		if (num == 6184) {

			System.out.println("You have successfully logged in the test!! ");
			System.out.println("\n");
			questions();

		}

		else {
			System.out.println("\n");
			System.out.println("Wrong pass...try again");
		}

	}// main

	public static void questions() {

		System.out.println("Welcome to the quiz!!!");

		try (Scanner type = new Scanner(System.in)) {
			int score = 0;
			String q1 = "first question: what is the name of longest river in india ? \n"
					+ "(a)yamuna\n(b)godavari\n(c)ganga\n(d)raavi\n";
			System.out.println(q1);
			String ans1 = type.nextLine();
			if (ans1.equals("c")) {
				score++;
			}

			String q2 = "\nsecond question: who is the owner of tesla ? \n"
					+ "(a)sundar pichai\n(b)mark zuckerberg\n(c)elon musk\n(d)jeff bezos\n";
			System.out.println(q2);
			String ans2 = type.nextLine();
			if (ans2.equals("c")) {
				score++;
			}

			String q3 = "\n third question: who is the first chief minister of maharashtra ? \n"
					+ "(a)vasantrao naik\n(b)yashwantrao chavan\n(c)sharad pawar\n(d)narayan rane\n";
			System.out.println(q3);
			String ans3 = type.nextLine();
			if (ans3.equals("a")) {
				score++;
			}

			String q4 = "\nfourth question: when marathwada mukti sangramdin is celebrated ?\n"
					+ "(a)15 jan\n(b)17 oct\n(c)17 sep\n(d)25 aug\n";
			System.out.println(q4);
			String ans4 = type.nextLine();
			if (ans4.equals("c")) {
				score++;
			}

			String q5 = "\nfifth question: what is the name of our galaxy ?\n"
					+ "(a)andromeda\n(b)milky way\n(c)alpha century\n(d)W104\n";
			System.out.println(q5);
			String ans5 = type.nextLine();
			if (ans5.equals("b")) {
				score++;
			}

			String q6 = "\nsixth question: which is the biggest lake in india ?\n"
					+ "(a)dudhsagar lake\n(b)chilka lake\n(c)das lake\n(d)woolen lake\n";
			System.out.println(q6);
			String ans6 = type.nextLine();
			if (ans6.equals("d")) {
				score++;
			}

			String q7 = "\nseventh question: who was the first female prime minister of india ?\n"
					+ "(a)sarojini naidu\n(b)vijayalakshmi pandit\n(c)indira gandhi\n(d)sonia gandhi\n";
			System.out.println(q7);
			String ans7 = type.nextLine();
			if (ans7.equals("c")) {
				score++;
			}

			String q8 = "\neighth question: which is the national fruit of india ?\n"
					+ "(a)mango\n(b)apple\n(c)pomagranede\n(d)pineapple\n";
			System.out.println(q8);
			String ans8 = type.nextLine();
			if (ans8.equals("a")) {
				score++;
			}

			String q9 = "\nninth question: where is the india's national musesum located ?\n"
					+ "(a)hyderabad\n(b)new delhi\n(c)kolkata\n(d)mumbai\n";
			System.out.println(q9);
			String ans9 = type.nextLine();
			if (ans9.equals("c")) {
				score++;
			}

			String q10 = "\ntenth question: when teachers day is celebrated ?\n"
					+ "(a)11 aug\n(b)7 oct\n(c)18 dec\n(d)5 sep\n";
			System.out.println(q10);
			String ans10 = type.nextLine();
			if (ans10.equals("d")) {
				score++;

			}

			System.out.println("\nThank you for participating");

			System.out.println("you have scored:" + score + "/10");
		}
	}// questions
}// class