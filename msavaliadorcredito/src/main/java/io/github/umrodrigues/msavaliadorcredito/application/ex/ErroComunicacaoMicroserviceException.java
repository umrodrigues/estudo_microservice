package io.github.umrodrigues.msavaliadorcredito.application.ex;

import lombok.Getter;

public class ErroComunicacaoMicroserviceException extends  Exception{

    @Getter
    private Integer status;

    public ErroComunicacaoMicroserviceException(String msg, Integer status) {
        super(msg);
        this.status = status;
    }
}
