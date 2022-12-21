package org.ltejeda.springdata.jpa.repositories;

import org.ltejeda.springdata.jpa.enitities.StudentIdCard;
import org.springframework.data.repository.CrudRepository;

public interface StudentIdCardRepository extends CrudRepository<StudentIdCard, Long> {
}
