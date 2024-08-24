package com.example.demo.Services;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Client;
import com.example.demo.Models.Recommendation;
import com.example.demo.Repository.ClientRepository;
import com.example.demo.Repository.LoanRepository;

@Service
public class RecommendationService {
    @Autowired
    private ClientRepository clientRepository;

//@Autowired
    //private LoanRepository loanRepository;

    // public List<Recommendation> generateRecommendations(Long clientId) {
    //     List<Recommendation> recommendations = new ArrayList<>();
    //     Optional<Client> clientOpt = clientRepository.findById(clientId);

    //     if (clientOpt.isPresent()) {
    //         Client client = clientOpt.get();
    //         BigDecimal balance = client.getBalance();

        //     // Example conditions for generating recommendations
        //     if (balance.compareTo(new BigDecimal("1000")) < 0) {
        //         recommendations.add(new Recommendation(client, "Consider depositing more funds", LocalDateTime.now()));
        //     }

        //     if (loanRepository.existsByClientAndDueDateBefore(client, LocalDateTime.now())) {
        //         recommendations.add(new Recommendation(client, "Loan payment due soon", LocalDateTime.now()));
        //     }

        //     if (client.getHasCreditCard().equalsIgnoreCase("NO")) {
        //         recommendations.add(new Recommendation(client, "Apply for a credit card", LocalDateTime.now()));
        //     } else {
        //         recommendations.add(new Recommendation(client, "Consider an Easy Payment Plan (EPP)", LocalDateTime.now()));
        //     }

        //     if (client.getChildrenCount() > 0) {
        //         recommendations.add(new Recommendation(client, "Explore Junior/Youth Programs", LocalDateTime.now()));
        //     }

        //     // Other custom logic to generate recommendations
        // }

       // return recommendations;
    }

