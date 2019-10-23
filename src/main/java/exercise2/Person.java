package exercise2;

class Person {
	private int age;
	private static int totalage = 0;
	private static int populationSize = 0;

	public Person (int age){

		this.age = age;
		totalage += this.age;
		populationSize++;
	}


	public static int computePopulationSize(){return populationSize;}

	public static float computeAveragePopulationAge(){return totalage/populationSize;}

	public static void resetPopulation(){
		totalage = 0;
		populationSize = 0;
	}
}
