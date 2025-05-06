package cat.itacademy.s04.t02.n02.S04T02N02.repository;

import cat.itacademy.s04.t02.n02.S04T02N02.model.Fruit;
import org.springframework.data.repository.CrudRepository;

public interface FruitsRepository extends CrudRepository<Fruit, Integer> {

}
