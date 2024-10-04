// package com.snehit.crud.example.controller;
// import java.util.List;
// import java.util.Optional;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RestController;
// import com.snehit.crud.example.entity.product;
// import com.snehit.crud.example.service.productService;

// @RestController
// public class cont {
// 	@Autowired
// 	private productService servi  ;
	
	
	
// 	@PostMapping("/add")
// 	public product AddProduct(@RequestBody product p)
// 	{
// 	return servi.save(p) ; 
// 	}
	
// 	@GetMapping("/view")
// 	public List<product> dekhoList()
// 	{
// 		List<product> ll=servi.get_product()  ; 
// 		return servi.get_product() ;  
// 	}
// 	@GetMapping("view/sortCost")
// 	public List<product> sortCost()
// 	{
// 		return servi.sort_cost(); 
// 	}
// 	@GetMapping("view/sortName")
// 	public List<product> sortName()
// 	{
// 		return servi.sort_name(); 
// 	}
// 	@GetMapping("view/sortNameDesc")
// 	public List<product> sortNameDesc()
// 	{
// 		return servi.sort_name_desc(); 
// 	}
// 	@GetMapping("view/sortQuantity")
// 	public List<product> sortQuantity()
// 	{
// 		return servi.sort_quantity(); 
// 	}
// 	@GetMapping("view/id/{id}")
// 	public Optional<product>getId(@PathVariable int id)
// 	{
// 		return servi.get_by_id(id) ;
// 	}
// 	@GetMapping("view/name/{s}")
// 	public product getName(@PathVariable String s)
// 	{
// 	return servi.get_by_name(s) ;	
// 	}
// 	@PostMapping("update")
// 	public String update(@RequestBody product p)
// 	{
// 		return servi.update_product(p) ; 
// 	}
// 	@PostMapping("updateProducts")
// 	public String[] update(@RequestBody List<product>p)
// 	{
// 		return servi.update_products(p) ; 
// 	}
	
	
// 	@PostMapping("delete/id/{id}")
// 	public String update(@PathVariable int id)
// 	{
// 		return servi.delete_by_id(id) ; 
// 	}
// 	@PostMapping("delete/name/{name}")
// 	public String update_name(@PathVariable String name)
// 	{
// 		return servi.delete_by_name(name) ; 
// 	}
// }
