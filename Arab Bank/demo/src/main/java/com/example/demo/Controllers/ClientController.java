package com.example.demo.Controllers;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Child;
import com.example.demo.Models.Client;
import com.example.demo.Models.Recommendation;
import com.example.demo.Repository.ChildRepository;
import com.example.demo.Repository.ClientRepository;
import com.example.demo.Repository.LoyaltyPointRepository;
import com.example.demo.Services.RecommendationService;

@RestController
@RequestMapping("/api/clients")
public class ClientController {
    
     @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private RecommendationService recommendationService;

    @Autowired
    private LoyaltyPointRepository loyaltyPointRepository;

    @Autowired
    private ChildRepository childRepository;

    @GetMapping("/{clientId}")
    public ResponseEntity<Client> getClientById(@PathVariable Long clientId) {
        Optional<Client> client = clientRepository.findById(clientId);
        if (client.isPresent()) {
            return ResponseEntity.ok(client.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{clientId}/balance")
    public ResponseEntity<BigDecimal> getClientBalance(@PathVariable Long clientId) {
        Optional<Client> client = clientRepository.findById(clientId);
        if (client.isPresent()) {
            return ResponseEntity.ok(client.get().getBalance());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // @GetMapping("/{clientId}/recommendations")
    // public ResponseEntity<List<Recommendation>> getRecommendations(@PathVariable Long clientId) {
    //     List<Recommendation> recommendations = recommendationService.generateRecommendations(clientId);
    //     return ResponseEntity.ok(recommendations);
    // }

    @GetMapping("/{clientId}/loyalty-points")
    public ResponseEntity<Integer> getLoyaltyPoints(@PathVariable Long clientId) {
        Optional<Client> client = clientRepository.findById(clientId);
        if (client.isPresent()) {
            return ResponseEntity.ok(client.get().getLoyaltyPoints());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // @GetMapping("/{clientId}/children")
    // public ResponseEntity<List<Child>> getClientChildren(@PathVariable Long clientId) {
    //    // List<Child> children = childRepository.findByClientId(clientId);
    //    // return ResponseEntity.ok(children);
    // }
    
}
