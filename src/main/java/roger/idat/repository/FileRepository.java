package roger.idat.repository;

import roger.idat.entity.File;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface FileRepository extends CrudRepository<File, Long> {
    //metodo para listar las imagenes
    @Query("SELECT da FROM File da WHERE da.estado = 'A' AND da.eliminado = false")
    Iterable<File> list();
    //listando las iamgenes por nombre
    @Query("SELECT da FROM File da WHERE da.fileName = :fileName AND da.estado = 'A' AND da.eliminado = false")
    Optional<File> findByFileName(String fileName);
}
