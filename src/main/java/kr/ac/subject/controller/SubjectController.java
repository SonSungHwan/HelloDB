package kr.ac.subject.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.subject.model.Subject;
import kr.ac.subject.model.Sum;
import kr.ac.subject.service.SubjectService;

@Controller
public class SubjectController {

	private SubjectService subjectsService;

	@Autowired
	public void setSubjectsService(SubjectService subjectsService) {
		this.subjectsService = subjectsService;
	}

	@RequestMapping("/totalPoint")
	public String showTotalPoint() {

		return "totalPoint";
	}

	@RequestMapping("/inquiry")
	public String showInquiry(Model model, int year, int semester) {

		List<Subject> subjects = subjectsService.getCurrent(year, semester);
		model.addAttribute("subjects", subjects);

		return "inquiry";
	}

	@RequestMapping("/enrollComplete")
	public String enrollComplete(Model model, @Valid Subject subject, BindingResult result) {
		
		
		if(result.hasErrors()){
			List<ObjectError> errors = result.getAllErrors();
			for(ObjectError error : errors){
				error.getDefaultMessage();
			}
			return "enrollSubject";
		}
		subject.setYear(2017);
		subject.setSemester(1);
		
		subjectsService.insert(subject);

		return "enrollComplete";
	}
	
	@RequestMapping("/outputSubject")
	public String outputSubject(Model model) {

		List<Subject> subjects = subjectsService.getCurrent2017();
		model.addAttribute("subjects", subjects);

		return "outputSubject";
	}
	
	@RequestMapping("/totalPointInfo")
	public String showTotalPointInfo(Model model) {

		List<Subject> subjects = subjectsService.getCurrentAll();
		Sum sum = new Sum();

		int tmp = 0;
		for (int i = 0; i < subjects.size(); i++) {
			if (subjects.get(i).getSubjectCode().equals("전선")) {
				
				tmp = sum.getSubj1();
				tmp += subjects.get(i).getCredit();
				sum.setSubj1(tmp);
				
			} else if (subjects.get(i).getSubjectCode().equals("전기")) {
				
				tmp = sum.getSubj2();
				tmp += subjects.get(i).getCredit();
				sum.setSubj2(tmp);

			} else if (subjects.get(i).getSubjectCode().equals("전지")) {
				
				tmp = sum.getSubj3();
				tmp += subjects.get(i).getCredit();
				sum.setSubj3(tmp);

			}  else if (subjects.get(i).getSubjectCode().equals("핵교")) {
				
				tmp = sum.getSubj4();
				tmp += subjects.get(i).getCredit();
				sum.setSubj4(tmp);

			} else if (subjects.get(i).getSubjectCode().equals("교필")) {
				
				tmp = sum.getSubj5();
				tmp += subjects.get(i).getCredit();
				sum.setSubj5(tmp);
			}
			
			tmp = 0;
			tmp = sum.getSum();
			tmp += subjects.get(i).getCredit();
			sum.setSum(tmp);
		}
		model.addAttribute("sum", sum);

		return "totalPointInfo";
	}
	
	@RequestMapping("/enrollSubject")
	public String enrollSubject(Model model) {

		model.addAttribute(new Subject());
		return "enrollSubject";
	}
	
}
