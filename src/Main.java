public class Main {
    /*Дан массив пар названий книг и авторов,
    необходимо привести каждую пару в строку вида:
    «Название книги» И.О.Автора.
     */
    public static void main(String[] args) {
String [] book = {"\"Вий\" Н.В. Гоголь", "\"Мгла\" С. Кинг", "\"Мать\" М. Горький"};
        for (int i = 0; i < book.length ; i++) {
            System.out.println(book[i]);
        }
    }
}
