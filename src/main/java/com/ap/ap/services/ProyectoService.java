
package com.ap.ap.services;

import com.ap.ap.models.Proyecto;
import com.ap.ap.repository.ProyectoRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProyectoService {
    private final ProyectoRepo proyectoRepo;
    
    
    @Autowired
    public ProyectoService(ProyectoRepo proyectoRepo){
        this.proyectoRepo = proyectoRepo;
    }
    public Proyecto addProyecto(Proyecto proyecto){
        return proyectoRepo.save(proyecto);
    }
    public List<Proyecto>  buscarProyectos(){
        return proyectoRepo.findAll();
    }
    public Proyecto editarProyecto(Proyecto proyecto){
        return proyectoRepo.save(proyecto);
    }
    public void borrarProyecto(Long id){
       proyectoRepo.deleteById(id);
    }
}
