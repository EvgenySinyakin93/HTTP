package org.example;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@Data
public class Post {
    int userId;
    String id;
    String title;
    String body;

    public Post(
            @JsonProperty("userId") int userId,
            @JsonProperty("id") String id,
            @JsonProperty("title") String title,
            @JsonProperty("body") String body
    ) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
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
