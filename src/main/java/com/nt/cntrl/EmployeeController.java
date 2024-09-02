package com.nt.cntrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Employee;

@RestController
public class EmployeeController {

	@GetMapping("/sam")
	public Employee employee() {
		Employee e = new Employee(1, "sam", 10000);
		return e;

	}

	@PostMapping("/add")
	public Employee add(@RequestBody Employee e) {
		
		System.out.println(e.getId() + "" + e.getName() + "" + e.getSal());
		return e;
	}

	@GetMapping("/get/id/{ii}")
	public Employee getById(@PathVariable("ii") int id) {
		System.out.println(id);
		Employee e = new Employee(id, "sam", id * 10);
		return e;
	}

	@GetMapping("/emp/id/{i}")
	public Employee getById1(@PathVariable("i") int id) {
		System.out.println(id);
		Employee e = new Employee(id, "sam", id * 100);
		return e;
	}

}
