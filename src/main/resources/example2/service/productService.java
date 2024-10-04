// package com.snehit.crud.example.service;

// import java.util.Collections;
// import java.util.Comparator;
// import java.util.List;
// import java.util.Optional;

// import org.hibernate.transform.ToListResultTransformer;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
// import com.snehit.crud.example.entity.product;
// import com.snehit.crud.example.repository.productRepository;

// @Service
// public class productService {

// 	@Autowired
// 	private productRepository repo ;
// 	static public List<product>answer; 
// 	static public Comparator<product> cmp = (o1, o2) ->{
// 		  return o1.getCost()-o2.getCost() ;
// 		  };
// 		  static public Comparator<product> cmp2 = (o1, o2) ->{
// 			  return o1.getName().compareTo(o2.getName());
// 			  };
	
// 			  static public Comparator<product> cmp3 = (o1, o2) ->{
// 				  return o2.getQuantity()-o1.getQuantity() ;
// 				  };
		

// 	public product save (product p)
// 	{
// 		return repo.save(p) ; 
// 	}
// 	public List<product> sort_cost()
// 	{
// 		answer=repo.findAll() ;
// 		Collections.sort(answer,cmp);
// 		 return answer; 
// 	}
// 	public List<product> sort_name()
// 	{
// 		answer=repo.findAll() ; 
// 		Collections.sort(answer,cmp2);
// 		return answer; 
// 	}
// 	public List<product> sort_name_desc()
// 	{
// 		answer=repo.findAll() ; 
// 		Collections.sort(answer,cmp2);
// 		Collections.reverse(answer); 
// 		return answer; 
// 	}
// 	public List<product> sort_quantity()
// 	{
// 		answer=repo.findAll() ; 
// 		Collections.sort(answer,cmp3);
// 		return answer; 
// 	}
// 	public List<product> get_product()
// 	{
	
// 	 return repo.findAll()  ; 		
// 	}
// 	public Optional<product> get_by_id(int a)
// 	{
// 		try {
// 			Optional<product> p=repo.findById(a) ;
// 			return p ;
// 		}
// 		catch(Exception e)
// 		{
// 			Optional<product> p=null  ;
// 			return p; 
// 		}
// 	}
// 	public product get_by_name(String s)
// 	{
		
// 			answer=repo.findAll() ; 
// 			for(product p:answer)
// 			{
				
// 				if(s.equals(p.getName()))
// 					return p;
// 			}
			
// 			return null ;	
		
// 	}
// 	public String delete_by_id(int id)
// 	{
// 		try {repo.deleteById(id);}
// 		catch(Exception e)
// 		{
// 			return "no element with the given ID found" ; 
// 		}
// 		return "successfully deleted"  ;
		
// 	}
// 	public String delete_by_name(String name)
// 	{
// 	try {
// 		product nameProduct=get_by_name(name) ; 
// 		repo.delete(nameProduct);
// 		return "successfully deleted"  ; 
// 	} catch ( Exception e) {
// 		// TODO: handle exception
// 		return "no such product found"  ; 
// 	}
// 	}
// 	public String update_product(product p)
// 	{
		
// 			product target=get_by_name(p.getName()); 
// 			if(target!=null)
// 			{
// 				target.setName(p.getName()); 
// 				target.setCost(p.getCost());
// 				target.setQuantity(p.getQuantity()); 
// 				repo.save(target) ;
// 				return "successfully implemented the changes" ;
// 			}
// 			else
// 			{
// 			save(p) ;
// 			return "no such entry existed. Created a new entry" ; 
// 			}
		
// 	}
// 	public String[] update_products(List<product> list)
// 	{
// 		String[] answer=new String[list.size()]; 
// 		int index=0; 
// 		for(product p:list)
// 		{
// 		answer[index]=update_product(p) ; 
// 		index++;  
// 		}
// 		return answer ; 
		
// 	}
	
// }
