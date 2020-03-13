package com.demo.voucheradapter;

import com.demo.voucheradapter.model.Voucher;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

//@FeignClient(name = "voucher-service",url="localhost:8000")
@FeignClient(name = "voucher-service")
@RibbonClient(name = "voucher-service")
public interface VoucherServiceProxy {

    @PostMapping(value = "/voucherService/issueVoucher", produces = "application/json")
    ResponseEntity<Voucher> issueVoucher(@RequestBody final Voucher voucher);

    @GetMapping(value = "/voucherService/getVoucher/{voucherIdentifier}", produces = "application/json")
    ResponseEntity<Voucher> getVoucher(@PathVariable("voucherIdentifier") Long voucherIdentifier);
}
