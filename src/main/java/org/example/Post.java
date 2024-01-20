package org.example;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Post {
    int userId;
    int id;
    String title;
    String body;

    public Post(
            @JsonProperty("userId") int userId,
            @JsonProperty("id") int id,
            @JsonProperty("title") String title,
            @JsonProperty("body") String body
    ) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }
    public int getUserId() {
        return userId;
    }
    public int getId() {
        return id;
    }
    public String getBody() {
        return body;
    }
    public String getTitle() {
        return title;
    }
    @Override
    public String toString() {
        return "Post" +
                "\n userId=" + userId+
                "\n id=" + id +
                "\n title=" + title +
                "\n body=" + body;
    }
}
