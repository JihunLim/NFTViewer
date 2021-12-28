package com.nouvelle.nftviewer.repository;

import com.nouvelle.nftviewer.entity.Nft;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NftRepository extends JpaRepository<Nft, Long>{
    
}
