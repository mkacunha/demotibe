package com.demotibe.demotibe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("motos")
public class MotoController {

    @Autowired
    private MotoRepository motoRepository;

    @GetMapping
    public List<Moto> motos() {
        return motoRepository.findAll();
    }

    @GetMapping("nova")
    public Moto moto(@RequestParam("nome") String nome){
        Moto moto = new Moto();
        moto.setNome(nome);
        return motoRepository.save(moto);
    }

}
