<<<<<<< HEAD
package ma.octo.assignement.web;

import ma.octo.assignement.domain.Utilisateur;
import ma.octo.assignement.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("utilisateurs")
public class UtilisateurController {

    @Autowired
    UtilisateurRepository utilisateurRepository;

    @GetMapping
    List<Utilisateur> loadAllUtilisateur() {
        List<Utilisateur> all = utilisateurRepository.findAll();

        if (CollectionUtils.isEmpty(all)) {
            return null;
        } else {
            return all;
        }
    }
}
=======
package ma.octo.assignement.web;

import ma.octo.assignement.domain.Utilisateur;
import ma.octo.assignement.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("utilisateurs")
public class UtilisateurController {

    @Autowired
    UtilisateurRepository utilisateurRepository;

    @GetMapping
    List<Utilisateur> loadAllUtilisateur() {
        List<Utilisateur> all = utilisateurRepository.findAll();

        if (CollectionUtils.isEmpty(all)) {
            return null;
        } else {
            return all;
        }
    }
}
>>>>>>> b99430640569ed20c2c038a834893ce93b33adbc
