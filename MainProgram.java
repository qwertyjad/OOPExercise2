public class MainProgram
{
	public static void main(String[] args) {
		MyPet pet;
		Cat cat = new Cat("Hadii", 2, "Egyptian");
		Dog dog = new Dog("Blackie", 5, "Aspin");

		pet = dog;
		System.out.println(pet.makeSound() + " " + "My Name is " + pet.getName());
        System.out.println( " " + dog.getBreed());
		pet = cat;
		System.out.println(pet.makeSound() + " " + "My Name is " + pet.getName());
	    System.out.println(" " + cat.getType());
		}
	
}
