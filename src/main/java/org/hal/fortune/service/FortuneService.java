package org.hal.fortune.service;

import org.hal.fortune.exception.NoFortuneException;
import org.hal.fortune.model.Fortune;
import org.hal.fortune.repository.FortuneRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FortuneService {

    private final FortuneRepository repository;
    private NoFortuneException exception;

    public FortuneService(FortuneRepository repository) {
        this.repository = repository;
        exception = new NoFortuneException();
    }

    public Fortune getRandom() throws NoFortuneException {
        List<Fortune> list = repository.findAll();
        if(list.size()==0) throw exception;
        int i = (int) (Math.random() * list.size());
        System.out.println(list.size()+">>>"+i);
        return list.get(i);
    }

    public Fortune save(String fortune) {
        Fortune newFortune = new Fortune(fortune);
        return repository.save(newFortune);
    }

    public Fortune save(Fortune fortune) {
        return repository.save(fortune);
    }
}
