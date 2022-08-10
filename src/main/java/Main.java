public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.birthday.day = Integer.parseInt(String.valueOf(13));
        post.birthday.month = Integer.parseInt(String.valueOf(6));
        post.birthday.year = Integer.parseInt(String.valueOf(1999));
        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.phone = "+7 (999)-999-99-99";
        post.patronymic = "Иванович";
        post.surname = "Иванов";
        post.subscription = Boolean.parseBoolean("true");
    }
}
