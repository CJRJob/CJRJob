package com.cjrjob.controller;

import com.cjrjob.common.ServerResponse;
import com.cjrjob.pojo.Recruiter;
import com.cjrjob.service.ICompanyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/manage/company")
public class CompanyController {

    private static final Logger log = LoggerFactory.getLogger(CompanyController.class);
    @Autowired
    private ICompanyService iCompanyService;

    //添加公司
    @RequestMapping("add.do")
    @ResponseBody
    public ServerResponse<String> addCompany(MultipartFile file, Recruiter recruiter) {
        return iCompanyService.addCompany(file, recruiter); 
    }

    //根据id查询公司信息
    @RequestMapping("jobDetail.do")
    @ResponseBody
    public ServerResponse showCompanyInfo(int id) {
        return iCompanyService.showCompanyInfo(id);
    }

    //分页查询公司信息-第一次查询，返回页面数量
    @RequestMapping("selectAllFirst.do")
    @ResponseBody
    public ServerResponse showCompanyInfoFirst(int pageSize) {
        return iCompanyService.showCompanyInfoFirst(pageSize);
    }

    //分页查询公司信息
    @RequestMapping("selectAllByPage.do")
    @ResponseBody
    public ServerResponse showCompanyInfoByPage(int currentPage, int pageSize) {
        return iCompanyService.showCompanyInfoByPage(currentPage, pageSize);
    }
}
