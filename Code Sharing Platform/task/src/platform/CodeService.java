package platform;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeService {

    public List<Code> getCodes() {
        return List.of(new Code("public static void main(String[] args) {\n" +
                        "    SpringApplication.run(CodeSharingPlatform.class, args);"
                )
        );
    }

}
