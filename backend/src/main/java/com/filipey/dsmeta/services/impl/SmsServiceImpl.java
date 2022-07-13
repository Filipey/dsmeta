package com.filipey.dsmeta.services.impl;

import com.filipey.dsmeta.entities.Sale;
import com.filipey.dsmeta.repositories.SaleRepository;
import com.filipey.dsmeta.services.SmsService;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SmsServiceImpl implements SmsService {

    @Value("${twilio.sid}")
    private String twilioSid;

    @Value("${twilio.key}")
    private String twilioKey;

    @Value("${twilio.phone.from}")
    private String twilioPhoneFrom;

    @Value("${twilio.phone.to}")
    private String twilioPhoneTo;

    private final SaleRepository repository;

    public SmsServiceImpl(SaleRepository repository) {
        this.repository = repository;
    }

    public void sendSms(Long saleId) {

        Sale sale = repository.findById(saleId).get();

        String date = sale.getDate().getMonthValue() + "/" + sale.getDate().getYear();

        String msg = "O vendedor " + sale.getSellerName() + " foi destaque em " +date
                + " com um total de R$ " + String.format("%.2f", sale.getAmount());

        Twilio.init(twilioSid, twilioKey);

        PhoneNumber to = new PhoneNumber(twilioPhoneTo);
        PhoneNumber from = new PhoneNumber(twilioPhoneFrom);

        Message message = Message.creator(to, from, msg).create();

        System.out.println(message.getSid());
    }
}
