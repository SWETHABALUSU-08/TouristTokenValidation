package com.example.touristapi.controller;

import com.example.touristapi.entity.Tourist;
import com.example.touristapi.repository.TouristRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tourists")
public class TouristController {
    private static final String VALID_TOKEN = "tourist123";
    private final TouristRepository touristRepository;

    public TouristController(TouristRepository touristRepository) {
        this.touristRepository = touristRepository;
    }

    @GetMapping
    public List<Tourist> getAllTourists(
            @RequestHeader(value = "Token", required = false) String token) {
        if (token == null || !VALID_TOKEN.equals(token)) {
            throw new InvalidTokenException();
        }
        return touristRepository.findAll();
    }

    @ExceptionHandler(InvalidTokenException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponse handleInvalidToken(InvalidTokenException exception) {
        return new ErrorResponse("Unauthorized: Invalid Token Provided");
    }

    public record ErrorResponse(String message) {}

    public static class InvalidTokenException extends RuntimeException {}
}
