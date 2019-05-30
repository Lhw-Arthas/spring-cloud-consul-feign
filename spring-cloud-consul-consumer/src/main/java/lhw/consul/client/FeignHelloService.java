package lhw.consul.client;

import lhw.consul.model.TestConsulModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lhwarthas on 19/5/30.
 */
@FeignClient("service-producer")
@Component
public interface FeignHelloService {

    @RequestMapping("/hello")
    String hello();

    @RequestMapping("/model")
    TestConsulModel model();

}
