package com.ross.user.service.impl;

import com.ross.ticket.service.TicketService;
import com.ross.user.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Reference
    TicketService ticketService;

    @Override
    public void hello() {
        String ticket = ticketService.getTicket();
        System.out.println("买到"+ticket+"的票了");
    }
}
