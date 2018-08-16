package net.qiujuer.web.italker.push.service;

import net.qiujuer.web.italker.push.bean.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by zeng.chengquan on 2018/8/16 0016.
 */
//127.0.0.1/api/account/....
@Path("/account")
public class AccountService {

    //127.0.0.1/api/account/login
    @GET
    @Path("/login")
    public String get(){
        return "You get the login.";
    }

    //127.0.0.1/api/account/login
    @POST
    @Path("/login")
    //指定请求与返回的响应体为JSON
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public User post(){
        User user = new User();
        user.setName("美女");
        user.setSex(2);
        return user;
    }
}
