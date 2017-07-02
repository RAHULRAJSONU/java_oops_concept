package exercise;

public class LoopAssignment {
	public static void main(String[] args) {
		int numOfPats=4;
		int capOfYards=10;
		String status=(numOfPats<4)?"Pats under limit."
				:(capOfYards>numOfPats)?"Yard capacity available"
						:"Tomany Pats";
		System.out.println("Pats Status = "+status);
	}
}
