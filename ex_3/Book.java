//Завдання 3
//
//
//Використовуючи IDEA, створіть проект із пакетом.
// Потрібно: Створити клас Book (Main). Створити класи Title, Author та Content,
// кожен з яких повинен містити одне рядкове поле та метод void show().
// Реалізуйте можливість додавання до книги назви книги, імені автора та змісту.
// Виведіть на екран за допомогою методу show() назву книги, ім'я автора та Зміст.

package ex_3;

public class Book {
    static void show(String title, String author, String content){
        System.out.println("Назва книги: " + title  + "\nАвтор книги: " + author + "\nЗміст: " + content);
    }
    public static void main(String[] args) {
        Title title = new Title();
        Author author = new Author();
        Content content = new Content();
        show(title.title, author.author, content.content);

    }
}
