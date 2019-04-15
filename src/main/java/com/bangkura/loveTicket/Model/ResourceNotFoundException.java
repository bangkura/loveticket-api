package com.bangkura.loveTicket.Model;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @description:
 * @author: Bangkura
 * @create: 2019-04-15 13:23
 **/
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "resource not found")
public class ResourceNotFoundException extends RuntimeException {
}
