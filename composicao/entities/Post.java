package nelioAlves.composicao.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Post {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private String title;
    private String content;
    private Integer likes;
    private List<Comment> comments = new ArrayList();

    public Post() {
    }

    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getMoment() {
        return this.moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return this.likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return this.comments;
    }

    public void addComent(Comment commenta) {
        this.comments.add(commenta);
    }

    public void removeComent(Comment commenta) {
        this.comments.remove(commenta);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.title + "\n");
        sb.append(this.likes + " Likes ");
        sb.append(sdf.format(this.moment) + "\n");
        sb.append(this.content + "\n");
        sb.append("Comments: \n");
        Iterator var2 = this.comments.iterator();

        while(var2.hasNext()) {
            Comment c = (Comment)var2.next();
            sb.append(c.getText() + "\n");
        }

        return sb.toString();
    }
}
