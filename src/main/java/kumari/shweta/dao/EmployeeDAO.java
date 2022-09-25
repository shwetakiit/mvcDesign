/**
 * 
 */
package kumari.shweta.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import kumari.shweta.model.EmployeeDTO;

/**
 * @author Shweta kumari
 *
 */

@Repository
public class EmployeeDAO {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}


	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	public Integer saveEmployeeDetails(EmployeeDTO employeeDTO) {
	  return (Integer) this.hibernateTemplate.save(employeeDTO);
	}

}
