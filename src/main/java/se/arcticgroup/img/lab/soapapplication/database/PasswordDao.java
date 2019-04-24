package se.arcticgroup.img.lab.soapapplication.database;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface PasswordDao extends CrudRepository<PasswordModel, String> {

}