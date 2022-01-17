package kimjoohe.springproject.controller;

import kimjoohe.springproject.domain.Member;
import kimjoohe.springproject.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MemberController {

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("memberTest")
    public String hello(Model model) throws Exception{
        List<Member> members = memberService.memberList();
        model.addAttribute("datas", members);
        return "memberTest";
    }
}
