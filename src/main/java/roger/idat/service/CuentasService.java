package roger.idat.service;

import roger.idat.repository.CuentasRepository;
import roger.idat.util.GenericResponse;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

import static roger.idat.util.Global.*;

@Service
@Transactional
public class CuentasService {
    private final CuentasRepository repository;

    public CuentasService(CuentasRepository repository) {
        this.repository = repository;
    }
    public GenericResponse listarCuentas(){
        return new GenericResponse(TIPO_DATA, RPTA_OK, OPERACION_CORRECTA, this.repository.listarCuentas());
    }
}