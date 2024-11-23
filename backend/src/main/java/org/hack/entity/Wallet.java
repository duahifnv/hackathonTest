package org.hack.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "wallet")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wallet_id")
    private Long id;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "user_id")
    private User userId;
    @Column(name = "total")
    private double total;
}