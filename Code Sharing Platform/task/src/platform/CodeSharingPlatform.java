package platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CodeSharingPlatform {
//    HttpHeaders httpHeaders = new HttpHeaders();
//    String code = "public static void main(String[] args) {\n" +
//            "    SpringApplication.run(CodeSharingPlatform.class, args);";
//
//    @GetMapping("/code")
//    public String getHTMLCode(){
//        httpHeaders.setContentType(MediaType.TEXT_HTML);
//        return code;
//    }



    public static void main(String[] args) {
        SpringApplication.run(CodeSharingPlatform.class, args);
    }

}
