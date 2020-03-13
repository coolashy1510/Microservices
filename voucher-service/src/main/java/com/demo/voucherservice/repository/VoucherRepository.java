package com.demo.voucherservice.repository;

import com.demo.voucherservice.model.Voucher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface VoucherRepository extends JpaRepository<Voucher,Long> {


    Voucher findByVoucherIdentifier(Long voucherIdentifier);
}
