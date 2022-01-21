package roger.idat.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import roger.idat.entity.Cuentas;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CuentasRepository extends CrudRepository<Cuentas, Integer> {
    @Query("SELECT C FROM Cuentas C WHERE C.listado IS 1")
    Iterable<Cuentas> listarCuentas();

}
