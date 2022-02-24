package pe.joelneyramos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.joelneyramos.entity.Colaborador;
import pe.joelneyramos.entity.Login;
import pe.joelneyramos.service.ColaboradorService;

@RestController
@RequestMapping("/colaborador")
public class ColaboradorRestController {

    @Autowired
    private ColaboradorService colaboradorService;

    public ColaboradorRestController() {
    }

    @PostMapping("/listar")
    public ResponseEntity<?> listar_GET(@RequestBody Login login){

        String username=login.getUsername();
        String password=login.getPassword();

        if((username.equals("Joel"))&&(password.equals("j123"))) {

            //Collection<Colaborador> collection=colaboradorService.findAll();

            //if(collection.size()!=0) {

            return new ResponseEntity<>(colaboradorService.findAll(), HttpStatus.OK);

        }

        return new ResponseEntity<>("¡Acceso Denegado!",HttpStatus.UNAUTHORIZED);

    }

    @PostMapping("/registrar")
    public ResponseEntity<?>registrar_POST(@RequestBody Colaborador colaborador){

        colaboradorService.insert(colaborador);
        return new ResponseEntity<>("¡Colaborador Registrado!",HttpStatus.CREATED);
    }

    @PutMapping("/editar/{colaboradorId}")
    public ResponseEntity<?>editar_PUT(@RequestBody Colaborador colaborador, @PathVariable Integer colaboradorId){

        Colaborador colaboradorDb=colaboradorService.findById(colaboradorId);

        if(colaboradorDb!=null)
        {
            colaboradorDb.setNombres(colaborador.getNombres());
            colaboradorDb.setApellidos(colaborador.getApellidos());
            colaboradorDb.setCelular(colaborador.getCelular());
            colaboradorDb.setEmail(colaborador.getEmail());

            colaboradorService.update(colaboradorDb);
            return new ResponseEntity<>("¡Colaborador Actualizado!",HttpStatus.OK);

        }

        return new ResponseEntity<>("¡Colaborador no Existe!",HttpStatus.NOT_FOUND);

    }



    @DeleteMapping("/borrar/{colaboradorId}")
    public ResponseEntity<?>borrar_DELETE(@PathVariable Integer colaboradorId){

        Colaborador colaboradorDb=colaboradorService.findById(colaboradorId);

        if(colaboradorDb!=null) {
            colaboradorService.delete(colaboradorId);
            return new ResponseEntity<>("¡Colaborador Borrado!",HttpStatus.OK);
        }

        return new ResponseEntity<>("¡Colaborador no Existe!",HttpStatus.NOT_FOUND);

    }


    @GetMapping("/buscar/{colaboradorId}")
    public ResponseEntity<?>buscar_GET(@PathVariable Integer colaboradorId){

        Colaborador colaboradorDb=colaboradorService.findById(colaboradorId);

        if(colaboradorDb!=null) {

            return new ResponseEntity<>(colaboradorDb,HttpStatus.OK);
        }

        return new ResponseEntity<>("¡Colaborador no Existe!",HttpStatus.NOT_FOUND);

    }

}
