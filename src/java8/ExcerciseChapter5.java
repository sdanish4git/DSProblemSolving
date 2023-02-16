package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ExcerciseChapter5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trader raoul=new Trader("Raoul","Cambridge");
		Trader mario=new Trader("Mario","Milan");
		Trader alan=new Trader("Alan","Cambridge");
		Trader brian=new Trader("Brian","Cambridge");
		
		List<Transaction>  transactions=Arrays.asList(
				
				new Transaction(raoul, 2012, 1000),
				new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710),
				new Transaction(mario, 2012, 700),
				new Transaction(alan, 2012, 950),
				new Transaction(brian, 2011, 300)
				);
		//Find all transactions in the year 2011 and sort them by value(small to high)
		transactions.stream().filter(trans -> trans.getYear()==2011)
					//.sorted((e1,e2) -> e1.getValue()>e2.getValue()?1:-1)
					.sorted(Comparator.comparing(Transaction::getValue))
					.collect(Collectors.toList())
					.forEach(System.out::println);
		
		//What are the unique cities where the traders work ?
		System.out.println("What are the unique cities where the traders work ?");
		transactions.stream().map(t -> t.getTrader().getCity())
					.distinct()
					.collect(Collectors.toList())
					.forEach(System.out::println);
		//Find all Traders from Cambridge and sort them by name ?
		System.out.println("Find all Traders from Cambridge and sort them by name ?");
		transactions.stream().map(t -> t.getTrader())
					.filter(t -> t.getCity().equals("Cambridge"))
					.distinct()
					.sorted(Comparator.comparing(Trader::getName))
					.collect(Collectors.toList())
					.forEach(System.out::println);
		
		//Returns a String of all traders' name sorted alphabetically
		System.out.println("Returns a String of all traders' name sorted alphabetically");
		String traderNames=transactions.stream().map(t -> t.getTrader().getName())
					.distinct()
					.sorted()
					.collect(Collectors.joining(" "));
		System.out.println(traderNames);
		
		//Are any traders based in Milan city?
		System.out.println("Are any traders based in Milan city?");
		boolean anyTraders=transactions.stream()
							.anyMatch(e -> e.getTrader().getCity().equals("Milan"));
		System.out.println(anyTraders);
		
		//Print All transactions value from the traders living in Cambridge
		System.out.println("Print All transactions value from the traders living in Cambridge?");
		
		transactions.stream().filter(t -> t.getTrader().getCity().equals("Cambridge"))
		.map(t -> t.getValue())
		.forEach(System.out::println);
		
		//What is the highest value of all the transactions?
		System.out.println("What is the highest value of all the transactions?");
		Optional<Integer> maxTr=transactions.stream().map(Transaction::getValue)
			//.reduce(Integer::max);
		//		.collect(Collectors.maxBy(Integer::max));
				.max((a,b) -> a>b ?1:-1);
		
		System.out.println(maxTr.get());
		
	}

}

class Trader{
	private final String name;
	private final String city;
	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	
	
	
	public String getName() {
		return name;
	}



	public String getCity() {
		return city;
	}



	@Override
	public String toString() {
		return "Trader: name=" + name + ", city=" + city + "";
	}
	
	
}

class Transaction{
	private final Trader trader;
	private final int year;
	private final int value;
	public Transaction(Trader trader, int year, int value) {
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	public Trader getTrader() {
		return trader;
	}
	public int getYear() {
		return year;
	}
	public int getValue() {
		return value;
	}
	@Override
	public String toString() {
		return "Transaction: trader=" + trader + ", year=" + year + ", value=" + value + "";
	}
	
	
}
