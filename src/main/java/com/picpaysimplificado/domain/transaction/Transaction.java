package com.picpaysimplificado.domain.transaction;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.h2.engine.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "transactions")
@Table(name = "transactions")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Transaction {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private BigDecimal amount;

  @ManyToOne
  @JoinColumn(name = "receiver_id")
  private User receiver;

  @ManyToOne
  @JoinColumn(name = "sender_id")
  private User sender;

  private LocalDateTime timestmap;

  public void setReceiver(com.picpaysimplificado.domain.user.User receiver2) {
  }

  public void setSender(com.picpaysimplificado.domain.user.User sender2) {
  }

}