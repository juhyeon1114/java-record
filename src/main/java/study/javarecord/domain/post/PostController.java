package study.javarecord.domain.post;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @GetMapping("/record")
    public RecordDTO record() {
        return new RecordDTO("Title", "Content");
    }

    @GetMapping("/record/string")
    public String recordToString() {
        return new RecordDTO("Title", "Content").toString(); // RecordDTO[title=Title, content=Content]
    }

}
