package com.xworkz.newyear.services;

import com.xworkz.newyear.constant.ServicesConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

import static com.xworkz.newyear.constant.ServicesConstant.FROM_NAME;

@Service
public class MailServicesImpl implements MailServices{


    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public boolean sendRegistrationMessage(String subject, String body, String email) {

        MimeMessagePreparator preparator = mimeMessage -> {
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage);
            mimeMessageHelper.setFrom(ServicesConstant.FROM_EMAIL.getPath(),FROM_NAME.getPath());
            mimeMessageHelper.addTo(email);
            mimeMessageHelper.setSubject(subject);
            mimeMessageHelper.setText(body);
        };
        javaMailSender.send(preparator);
        return true;
    }
}
