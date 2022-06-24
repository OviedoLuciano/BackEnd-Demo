
package com.ap.ap.services;
import com.ap.ap.models.Skills;
import com.ap.ap.repository.SkillsRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SkillsService {
    private final SkillsRepo skillsRepo;
    
    @Autowired
    public SkillsService(SkillsRepo skillsRepo){
        this.skillsRepo = skillsRepo;
    }
    public Skills addSkills(Skills skills){
        return skillsRepo.save(skills);
    }
    public List<Skills>  buscarSkills(){
        return skillsRepo.findAll();
    }
    public Skills editarSkills(Skills skills){
        return skillsRepo.save(skills);
    }
    public void borrarSkills(Long id){
        skillsRepo.deleteById(id);
    }
}
