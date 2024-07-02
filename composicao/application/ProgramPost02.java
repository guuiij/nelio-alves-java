package nelioAlves.composicao.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import nelioAlves.composicao.entities.Comment;
import nelioAlves.composicao.entities.Post;

public class ProgramPost02 {
    public ProgramPost02() {
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment comment01 = new Comment("Have a nice trip !");
        Comment comment02 = new Comment("WOW that's awesome !");
        Post post01 = new Post(sdf.parse("21/06/2018 13:05:44"),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country !", 12);
        post01.addComent(comment01);
        post01.addComent(comment02);

        Comment comment03 = new Comment("Good night !");
        Comment comment04 = new Comment("May the force be with you !");
        Post post02 = new Post(sdf.parse("28/07/2018 23:14:19"),
                "Good night guys",
                "See you tomorrow!", 5);

        post02.addComent(comment03);
        post02.addComent(comment04);

        System.out.println(post01);
        System.out.println(post02);
    }
}
