

public class PRNG {
// Psuedo-Random Number Generator

	public static void main(String[] args) {
		// TODO - Test & Cleanup
		long InitSeed;
		long Seed;
		long SeedStep1;
		long SeedStep2;
		
		InitSeed = System.nanoTime();
			// Call System Time
		SeedStep1 = InitSeed * 1103515245;
			// Multiply 4 byte long by 1103515245
		SeedStep2 = SeedStep1 + 24691;
			// Adding 24691 to long
		Seed = Math.abs(SeedStep2) % 65535;
			// Result converted to 2 byte long
		System.out.println("Step 1: " + InitSeed);
		System.out.println("Step 2: ???"); // South Park joke
		System.out.println("Step 3: " + Seed);
		System.out.println("Roll 1d20: " + ((Seed % 20) + 1));
	}

}
