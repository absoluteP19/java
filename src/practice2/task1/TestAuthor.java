package practice2.task1;

import practice2.Author.Author;

public class TestAuthor {
    public static void main(String[] args){
        Author author = new Author("Anton", "antona@yandex.ru", 'M');
        System.out.println(author);
        author.setEmail("antoonprosh@yandex.ru");
        System.out.println(author);

    }
}
