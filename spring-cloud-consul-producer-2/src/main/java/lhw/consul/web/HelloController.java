package lhw.consul.web;

import lhw.consul.model.TestConsulModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello consul two";
    }

    @RequestMapping("/model")
    public TestConsulModel model() {
        TestConsulModel testConsulModel = new TestConsulModel();
        testConsulModel.setNode(2);
        testConsulModel.setName("aaa");
        return testConsulModel;
    }

}
