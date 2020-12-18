package ma.fstt.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*",allowedHeaders="*")
public class AuthService {
	
	private String RFID = "active";
//	private String s2 = "active";
//	private String s3 = "active";
	
	@RequestMapping(value="/data", method=RequestMethod.POST)
	public boolean setData(@RequestParam String RFID) {
		this.RFID = RFID;
//		this.s2 = e2;
//		this.s3 = e3;
		System.err.println(this.RFID);
//		System.err.println(this.s2);
//		System.err.println(this.s3);
		return true;
		
	}
	@RequestMapping(value="/data", method=RequestMethod.GET)
	public String getData() {
//		String> list = new ArrayList<>();
//		list.add(this.RFID);
//		list.add(this.s2);
//		list.add(this.s3);
		return RFID;
		
	}
	
}

