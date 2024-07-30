package com.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bank.entity.Peoplesbank;
import com.bank.model.Deleteaccount;
import com.bank.model.Depositaccount;
import com.bank.model.Newaccount;
import com.bank.model.Transferaccount;
import com.bank.model.Withdrawaccount;
import com.bank.repo.Bankrepo;

@org.springframework.stereotype.Controller
public class Controller {
	@Autowired
	private Bankrepo brepo;
@RequestMapping("/")
public String home() {
	return "home";
}
@RequestMapping("/createaccount")
public String create() {

	return "signup";
}
@RequestMapping("/save")
public String save(Newaccount newaccount) {
	Peoplesbank pb= new Peoplesbank(); 
	if(newaccount.getPassword().equals(newaccount.getConfirmpassword())) {
		pb.setAccountno(newaccount.getAccountno());
		pb.setName(newaccount.getName());
		pb.setPassword(newaccount.getPassword());
		pb.setAmount(newaccount.getAmount());
		pb.setMobileno(newaccount.getMobileno());
		brepo.save(pb);
		return "success";
		
	}
	else {
		return "fail";
	}
	}
@RequestMapping("/depositamount")
public String deposit() {

	return "deposit";
}
@RequestMapping("/depositamt")
public String depositamt(Depositaccount depositaccount) {
	Peoplesbank pb=brepo.findById(depositaccount.getAccountno()).get();
	if(pb.getPassword().equals(depositaccount.getPassword())&& pb.getPassword().equals(depositaccount.getConfirmpassword())) {
	double amt= pb.getAmount();
	double amt1= amt+ depositaccount.getAmount();
	pb.setAmount(amt1);
	brepo.save(pb);
		return "success";
}
	else {
		return "fail";
	}
}
@RequestMapping("/withdrawamount")
public String withdraw() {
  return "withdraw";
}
@RequestMapping("/withdrawamt")
public String withdrawamt(Withdrawaccount withdrawaccount) {
	Peoplesbank pb=brepo.findById(withdrawaccount.getAccountno()).get();
	if(pb.getPassword().equals(withdrawaccount.getPassword())&& pb.getPassword().equals(withdrawaccount.getConfirmpassword())) {
	double amt= pb.getAmount();
	double amt1= amt-withdrawaccount.getAmount();
	pb.setAmount(amt1);
	brepo.save(pb);
	return "success";
}
	else {
		return "fail";
	}

}
@RequestMapping("/transferamount")
public String transfer() {
  return "Transfer";
}
@RequestMapping("/transferamt")
public String transferamt(Transferaccount transferaccount) {
	Peoplesbank pb=brepo.findById(transferaccount.getAccountno()).get();
	Peoplesbank pb1= brepo.findById(transferaccount.getTransferaccountno()).get();
	if(pb.getName().equalsIgnoreCase(transferaccount.getName())&& pb.getPassword().equals(transferaccount.getPassword())&&pb.getPassword().equals(transferaccount.getConfirmpassword())) {
		
		double amt1= pb.getAmount()-transferaccount.getAmount();
		double amt2= pb1.getAmount()+transferaccount.getAmount();
		pb.setAmount(amt1);
		pb1.setAmount(amt2);
		brepo.save(pb);
		brepo.save(pb1);
		
		return "success";
	}
	

else {
	return "fail";
}

}
@RequestMapping("/deleteaccount")
public String delete() {
  return "delete";
}
@RequestMapping("/deleteact")
public String deleteact(Deleteaccount deleteaccount) {
	Peoplesbank pb=brepo.findById(deleteaccount.getAccountno()).get();
	if(pb.getName().equalsIgnoreCase(deleteaccount.getName())&& pb.getPassword().equals(deleteaccount.getPassword())&&pb.getPassword().equals(deleteaccount.getConfirmpassword())) {
		brepo.delete(pb);
		return "success";
	}
	else {
		return "fail";
	}
	
}
@RequestMapping("/aboutus")
public String about() {
  return "about";
}

}
