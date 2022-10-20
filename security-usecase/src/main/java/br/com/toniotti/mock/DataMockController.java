package br.com.toniotti.mock;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/data")
public class DataMockController {

    @GetMapping("/mock")
    public List<Integer> getMockedData() {
        return List.of(1, 2, 3, 4, 5);
    }
}
