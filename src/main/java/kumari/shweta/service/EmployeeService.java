/**
 * 
 */
package kumari.shweta.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kumari.shweta.dao.EmployeeDAO;
import kumari.shweta.model.EmployeeDTO;

/**
 * @author Shweta kumari
 *
 */
@Service
public class EmployeeService {
	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Transactional
	public Integer addNewEmployee(EmployeeDTO employeeDTO) {
		return this.employeeDAO.saveEmployeeDetails(employeeDTO);
	}

}
