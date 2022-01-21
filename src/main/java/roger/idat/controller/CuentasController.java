package roger.idat.controller;

import roger.idat.service.CuentasService;
import roger.idat.util.GenericResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/Cuentas")
public class CuentasController {
    private final CuentasService service;

    public CuentasController(CuentasService service) {
        this.service = service;
    }

    @GetMapping
    public GenericResponse listarCuentas(){
        return this.service.listarCuentas();
    }

}
