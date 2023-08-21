package aaa.controll;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.regex.Pattern;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import aaa.model.UploadData;

@Controller
@RequestMapping("/file")
public class FileController {
	@RequestMapping(value = "upload", method = RequestMethod.GET)
	String fileForm() {
		System.out.println("file/upload");
		return "file/uploadForm";
	}
	
	@RequestMapping(value = "upload", method = RequestMethod.POST)
	String fileReg(
			Model md,
			@ModelAttribute("id") String id, 
			@ModelAttribute("age") int age,
			MultipartFile ff1,
			MultipartFile ff2) {
		System.out.println("file/reg/upload");
		System.out.println("ff1 " + ff1);
		System.out.println("ff2 " + ff2);
		System.out.println("ff1 " + "getOriginalFilename " + ff1.getOriginalFilename());
		System.out.println("ff1 " + "getName " + ff1.getName());
		System.out.println("ff1 " + "getContentType " + ff1.getContentType());
		System.out.println("ff1 " + "getSize " + ff1.getSize());
		System.out.println("ff1 " + "isEmpty " + ff1.isEmpty());
		
		md.addAttribute("ff1", ff1.getOriginalFilename());
		md.addAttribute("ff2", ff2.getOriginalFilename());
		
		return "file/uploadReg";
	}
	
	@PostMapping("upload2")
	String fileReg2(
			Model md,
			MultipartHttpServletRequest mr) {
		System.out.println("file/reg/upload2");
		
		MultipartFile ff1 = mr.getFile("ff1");
		MultipartFile ff2 = mr.getFile("ff2");
		System.out.println("ff1 " + ff1);
		System.out.println("ff2 " + ff2);
		System.out.println("ff1 " + "getOriginalFilename " + ff1.getOriginalFilename());
		System.out.println("ff1 " + "getName " + ff1.getName());
		System.out.println("ff1 " + "getContentType " + ff1.getContentType());
		System.out.println("ff1 " + "getSize " + ff1.getSize());
		System.out.println("ff1 " + "isEmpty " + ff1.isEmpty());
		
		md.addAttribute("id", mr.getParameter("id"));
		md.addAttribute("age", mr.getParameter("age"));
		 md.addAttribute("ff1", ff1.getOriginalFilename());
		 md.addAttribute("ff2", ff2.getOriginalFilename());
		
		return "file/uploadReg";
	}
	
	@PostMapping("upload3")
	String fileReg3(
			Model md,
			UploadData ud) {
		System.out.println("file/reg/upload2");
		
//		System.out.println("ud : " + ud);
//		System.out.println("ff1 " + ud.getFf1());
//		System.out.println("ff2 " + ud.getFf2());
//		System.out.println("ff1 " + "getOriginalFilename " + ud.getFf1().getOriginalFilename());
//		System.out.println("ff1 " + "getName " + ud.getFf1().getName());
//		System.out.println("ff1 " + "getContentType " + ud.getFf1().getContentType());
//		System.out.println("ff1 " + "getSize " + ud.getFf1().getSize());
//		System.out.println("ff1 " + "isEmpty " + ud.getFf1().isEmpty());
		
		String msg = "파일은 이미지만 가능합니다.";
		
		fileSave(ud.getFf1());
		
		if(checkImg(ud.getFf2().getOriginalFilename())) {
			fileSave2(ud.getFf2(), ud);
		}else {
			md.addAttribute("msg", msg);
			return "file/uploadForm";
		}
		
		return "file/uploadReg3";
	}
	
	void fileSave(MultipartFile mf) {
		String path = "D:\\spring_work\\stsMVCproj\\src\\main\\webapp\\up";
		
		File ff = new File(path+"\\"+mf.getOriginalFilename());
		
		try {
			FileOutputStream fos = new FileOutputStream(ff);
			fos.write(mf.getBytes());
			
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	void fileSave2(MultipartFile mf2, UploadData ud) {
		String path = "D:\\spring_work\\stsMVCproj\\src\\main\\webapp\\up";
		String ptn = ".";
		String ptn2 = null;
		String ptn3 = ".* \\(1\\)$";
		
		File ff = new File(path+"\\"+mf2.getOriginalFilename());
		
		try {
			String fName = mf2.getOriginalFilename();
			String rename = null;
			String exe = null;
			// System.out.println(Pattern.matches(ptn3, rename));
			
			int i = 1;
			while(ff.exists()) {
				rename = fName.substring(0, fName.lastIndexOf(ptn));
				exe = fName.substring(fName.lastIndexOf(ptn), fName.length());
				boolean checkFile = Pattern.matches(ptn3, rename);
				System.out.println(checkFile);
				// System.out.println(fName.lastIndexOf(ptn));
				System.out.println(rename);
				// System.out.println(rename.substring(rename.length()-3));
				System.out.println(i);
				
				if(!checkFile && i==1) {
					// System.out.println("안들어옴?");
					rename += " (1)";
					fName = rename + exe;
					// System.out.println(fName);
					ff = new File(path+"\\"+fName);
					continue;
				}
				
				ptn2 = rename.substring(rename.length()-(3+(i+"").length()));
				
				while(true) {
					if(ptn2.equals(" (" + i + ")")) {
						// System.out.println(i);
						// System.out.println(true);
						i++;
					}else {
						if(i > 1) {
							// System.out.println(i);
							rename = rename.replace(ptn2, (" (" + i + ")"));
							fName = rename + exe;
							break;
						}
					}
					
				}
				
				ff = new File(path+"\\"+fName);
				// System.out.println(exe);
				// System.out.println(fName);
			}
			
			FileOutputStream fos = new FileOutputStream(ff);
			fos.write(mf2.getBytes());
			ud.setFf2Name(fName);
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	boolean checkImg(String fileName) {
		boolean check = Pattern.matches(".*\\.(jpg|bmp|png|gif)$", 
				fileName.toLowerCase()); 
		
		return check;
	}
}
