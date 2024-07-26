package study.javarecord.domain.post;

import java.util.Objects;

public class PureDTO {

    private final String title;
    private final String content;

    public PureDTO(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "PostCreateDTO[" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PureDTO that = (PureDTO) o;
        return Objects.equals(title, that.title) && Objects.equals(content, that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, content);
    }

}
