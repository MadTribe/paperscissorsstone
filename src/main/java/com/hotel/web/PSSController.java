package com.hotel.web;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.entity.PSS;
import com.hotel.entity.User;
import com.hotel.service.PSSService;
import com.hotel.service.UserService;

@RestController
@RequestMapping("/API")
public class PSSController {
	
	int w=0,l=0,d=0;  //Win ,lose and Draw 
	@Autowired
	private UserService userService;
	@Autowired
	private PSSService pssService;
	
	@PostMapping(value ="/wanttoplay") 
	public User wanttoplay(String name) {
	    User user =new User();
		try {
			if(name!=null) {
			    user.setUserName(name);
			    user.setMessage("ok");
				return userService.saveAccount(user);
			}	
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		user.setMessage("Not OK");
		return user;
		}
	
	//choice
	@PostMapping(value ="/choice") 
	public PSS choice(int choice,String name) {
		List<User> listUser=userService.findByUserName(name);
		// Choice Scissor（2） ,Stone and Paper
		 int m =(int)(Math.random()*3+1);  //Logic   user 
		System.out.println(m+"mm");
		PSS pss =new PSS();
			if(listUser.size()!=0) {
				if(choice==m) {
					pss.setUserName(name);
					pss.setChoice("stone");	
					pss.setMessage("draw");
					d++;
				}else if((choice-1)%3 ==(m%3)) {
					w++;
					pss.setUserName(name);
					pss.setChoice("scissor");
					pss.setMessage("win");
				}else if(choice>=4) {
					pss.setMessage("Please Enter Correct Choice 1 to 3");
				}else {
					pss.setUserName(name);
					pss.setChoice("paper");
					pss.setMessage("lose");
					l++;
				}
				
//				switch(choice) {
//				case 1:
//					pss.setChoice1("scissor");
//					pss.setMessage("waiting");
//				case 2:
//					pss.setChoice2("stone");
//					pss.setMessage("loose");
//				case 3:
//					pss.setChoice3("paper");
//					pss.setMessage("ok");
//				 default:
//					  System.out.println(" please Choice pass params between 1 to 3: ");
//				}
			 
			 
				
				
				
//				for(User user:listUser) {
//					String userName=user.getUserName();  //Here Tom
//					if(userName.equals("Tom")) {
//						 String choice1=pss.getChoice1();// Scissor
//						 
//					}else if(userName.equals("Zhen")) {
//						 String choice1=pss.getChoice1();// Scissor
//						
//					}
//				}
			}
			System.out.println(pssService.saveAccount(pss)+"dsdsd");
			return pssService.saveAccount(pss);	
	
		
	}
	
	
	@GetMapping(value = "/result")
	public List<PSS> getResult()  {
		try {
			return pssService.getPSSResult();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
}
