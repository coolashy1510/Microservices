package com.demo.voucherservice.controller;

import com.demo.voucherservice.model.Voucher;
import com.demo.voucherservice.repository.VoucherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/voucherService")
public class VoucherController {

    @Autowired
    private VoucherRepository voucherRepository;

    @Autowired
    private Environment environment;

    @PostMapping(value="/issueVoucher",produces = "application/json")
    public Voucher issueVoucher(@RequestBody final Voucher voucher){
        voucherRepository.save(voucher);
        voucher.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
        return voucherRepository.findByVoucherIdentifier(voucher.getVoucherIdentifier());
    }

    @GetMapping(value="/getVoucher/{voucherIdentifier}")
    public Voucher findByVoucherIdentifier(@PathVariable final Long voucherIdentifier){
        return voucherRepository.findByVoucherIdentifier(voucherIdentifier);
    }
}
