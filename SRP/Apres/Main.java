public class Main {
    public static void main(String[] args) {
        // Création du livre
        BookSRP book = new BookSRP("Les principes SOLID", "Étudiants de M1-GL", "Révision des principes SOLID");

        //  Instanciation 
        BookPrinter printer = new BookPrinter();
        BookSaver saver = new BookSaver();
        BookbusinessLogic logic = new BookbusinessLogic();

        // 3. Appels des méthodes
        printer.printToScreen(book);
        printer.printToHTML(book); 
        
        saver.saveToDatabase(book);
        
        logic.emprunter(book, "Marcial");
    }
}