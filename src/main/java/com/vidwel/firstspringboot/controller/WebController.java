package com.vidwel.firstspringboot.controller;

/**
 * Created by cube on 12.02.2018.
 */

import com.vidwel.firstspringboot.repository.RequestTableRepository;
import com.vidwel.firstspringboot.dto.request.Request;
import com.vidwel.firstspringboot.dto.response.Response;
import com.vidwel.firstspringboot.entity.RequestTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

import static com.sun.xml.internal.ws.api.message.Packet.Status.Response;

@Controller
public class WebController {

    private RequestTableRepository requestTableRepository;

    @Autowired
    public WebController(RequestTableRepository requestTableRepository){
        this.requestTableRepository = requestTableRepository;
    }
    private static int gameNumber;

    static {
        Random random = new Random();
        gameNumber = random.nextInt(10) + 1;
    }

    @PostMapping(path = "/doGame")
    @ResponseBody
    public Response doGame(Request request) {
        RequestTable requestTable = new RequestTable();
        requestTable.setRequestNumber(request.getNumber());
        requestTable.setRealNumber(gameNumber);
        requestTableRepository.save(requestTable);
        return new Response(request.getNumber() == gameNumber);
    }
}
