package study.javarecord.domain.post;

public record AdvancedRecordDTO(
        String title,
        String content
) {

    public static AdvancedRecordDTO create(String t, String c) {
        return new AdvancedRecordDTO(t, c);
    }
    
    public String getFullText() {
        return title + " " + content;
    }

    // 원하는대로 필요한 메서드나 Override하고 싶은 메서드 작성 가능

}
