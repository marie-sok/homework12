public class Main {
        public static void main(String[] args) {
            Book trainspotting = new Book("Trainspotting", new Author("Irwin", "Welsh"), 1993);
            Book theFearAndLoathingInLasVegas = new Book("The fear and the loathing in Las Vegas", new Author("Hunter", "Thompson"), 1971);

            Author samuil = new Author("Samuil", "Marshak");
            Author agnia = new Author("Agnia", "Barto");

            trainspotting.setYearOfPublication(1993);
        }
    }
