package com.nouvelle.nftviewer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

//@Table(name = "NFT")
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
@Getter
@Entity
public class Nft {

  // @Column(name = "FIRST_NAME")
   @Id
   @Column(length = 20, nullable = false, unique = true)
   private String nftId;
 
   @Column(length = 20, nullable = false)
   private String nftName;
 
   @Column(length = 30, nullable = false)
   private String nftEtc;
   
   @Builder
   public Nft(String nftId, String nftName, String nftEtc) {
      this.nftId = nftId;
      this.nftName = nftName;
      this.nftEtc = nftEtc;
   }
   
}
