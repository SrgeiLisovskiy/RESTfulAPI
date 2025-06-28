package ru.netology.sitebff;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/site-bff")
public class BffController {

    private final BffService service;

    public BffController(BffService service) {
        this.service = service;
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<UserOrders> getById(@PathVariable int userId) {
        try {
            UserOrders userAndOrder = service.getById(userId);
            return new ResponseEntity<>(userAndOrder, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
