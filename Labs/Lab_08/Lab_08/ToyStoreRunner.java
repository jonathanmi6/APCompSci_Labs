public class ToyStoreRunner
{
    public static void main(String[] args) 
		{
        String ts = "Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF";
        ToyStore toyStore = new ToyStore(ts);

        System.out.println(toyStore);
        System.out.println("Most Frequent Toy: " + toyStore.getMostFrequentToy());
        System.out.println("Most Frequent Type of Toy: " + toyStore.getMostFrequentType());
    }
}