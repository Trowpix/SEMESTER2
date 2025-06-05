package Latihans.LatihanUTS.Soal1;

public class Main {
    public static void main(String[] args) {
        Library L = new Library();
        Menu:
        while (true){
            System.out.println("1. Add Book \n" + "2. delete book by title \n" +
                                "3. search book by title \n" + "4. search book by author \n" +
                                "5. search book by year( from … until … ) \n" + "6. show all book \n" + "0. exit");
            System.out.print(">> ");
            int choice = L.Sc.nextInt();
            switch (choice){
                case 1:
                    L.AddBook();
                    break;
                case 2:
                    L.DeleteByTitle(L.getShelf());
                    break;
                case 3:
                    L.SearchByTitle(L.getShelf());
                    break;
                case 4:
                    L.SearchByAuthor(L.getShelf());
                    break;
                case 5:
                    L.SearchByYear(L.getShelf());
                    break;
                case 6:
                    L.DisplayAll(L.getShelf());
                    break;
                case 0:
                    break Menu;
            }
        }
        System.out.println("Bye Bye");
    }
}
