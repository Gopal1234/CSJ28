package pack1.Csj28SpringRestDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pack1.Csj28SpringRestDemo.entity.Train;

@Repository
public interface TrainRepos  extends JpaRepository<Train, Integer> {

}
