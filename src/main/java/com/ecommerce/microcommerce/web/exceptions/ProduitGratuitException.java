/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.microcommerce.web.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Exception ProduitGratuitException
 *
 * @author Laurent Egbakou
 * @version 1.0 : 15 oct. 2018 à 09:00:16
 * @since 1.0
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ProduitGratuitException extends RuntimeException {

    public ProduitGratuitException(String s) {
        super(s);
    }
}
