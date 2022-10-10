package com.example.study.repository;

import com.example.study.StudyApplicationTests;
import com.example.study.model.entity.Partner;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class PartnerRepositoryTest extends StudyApplicationTests {

    @Autowired
    private PartnerRepository partnerRepository;
    @Test
    public void create(){

        Partner partner = new Partner();
        partner.setName("Partner01");
        partner.setStatus("REGISTERED");
        partner.setAddress("서울 서초구");
        partner.setCallCenter("070-111-1111");
        partner.setPartnerNumber("010-1110-1111");
        partner.setBusinessNumber("123456789");
        partner.setCeoName("홍길동");
        partner.setRegisteredAt(LocalDateTime.now());
        partner.setCreatedAt(LocalDateTime.now());
        partner.setCreatedBy("Admin");

        partnerRepository.save(partner);
    }
}
