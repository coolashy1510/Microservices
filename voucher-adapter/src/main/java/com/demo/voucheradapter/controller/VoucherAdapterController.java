package com.demo.voucheradapter.controller;

import com.demo.voucheradapter.VoucherServiceProxy;
import com.demo.voucheradapter.model.Voucher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/voucherAdapter")
public class VoucherAdapterController {

    @Autowired
    private VoucherServiceProxy voucherServiceProxy;

    @PostMapping(value = "/issueVoucher", produces = "application/json")
    private ResponseEntity<Voucher> issueVoucher(@RequestBody final Voucher voucher) {
        ResponseEntity<Voucher> voucherResponse = voucherServiceProxy.issueVoucher(voucher);
        return voucherResponse;
    }

    @GetMapping(value = "/getVoucher/{voucherIdentifier}", produces = "application/json")
    private ResponseEntity<Voucher> getVoucher(@PathVariable Long voucherIdentifier) {
        ResponseEntity<Voucher> voucherResponse = voucherServiceProxy.getVoucher(voucherIdentifier);
        return voucherResponse;
    }

}
