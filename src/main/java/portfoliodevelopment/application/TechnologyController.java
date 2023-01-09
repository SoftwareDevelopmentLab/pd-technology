package portfoliodevelopment.application;

import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/technologies")
@RequiredArgsConstructor
public class TechnologyController {
  private final Environment environment;

  @GetMapping
  String get() {
    System.out.println(environment.getProperty("server.port"));
    return "Technology";
  }
}
