package org.example;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;



@Data
public class Post {
        private final String id;
        private final String text;
        private final String type;
        private final String user;
        private final Integer upvotes;
        public Post(
                @JsonProperty("id") String id,
                @JsonProperty("text") String text,
                @JsonProperty("type") String type,
                @JsonProperty("user") String user,
                @JsonProperty("upvotes") Integer upvotes
        ) {
            this.id = id;
            this.text = text;
            this.type = type;
            this.user = user;
            this.upvotes = upvotes;
        }
    }
