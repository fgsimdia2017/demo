package com.demo.controller;

import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.demo.model.ChartConfigDo;
import com.demo.model.ChartConfigDoQO;
import com.demo.model.EsMultiLanguageConfigDo;
import com.demo.model.MultiLanguageConfigDoQO;
import com.demo.model.MultiLanguageConfigDoVO;
import com.demo.model.UserEs;
import com.demo.model.es.EsChartConfigDo;
import com.demo.service.ChartConfigService;
import com.demo.service.impl.AzureTransferService;
import com.demo.service.impl.DemoService;
import com.demo.service.impl.EsCharConfigServiceImpl;
import com.demo.service.impl.EsUserService;
import com.demo.service.impl.IEsMultiLanguageConfigService;
import com.demo.service.impl.OpenAiTransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Author huangfeng
 * @Date 2023/9/14 11:29
 * @description
 * @Version 1.0
 */
@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;
    @Autowired
    private OpenAiTransferService openAiTransferService;
    @Autowired
    AzureTransferService azureTransferService;
    @Autowired
    private EsUserService esUserService;
    @Autowired
    private IEsMultiLanguageConfigService esMultiLanguageConfigService;
    @Autowired
    private ChartConfigService chartConfigService;
    @Autowired
    private EsCharConfigServiceImpl esCharConfigService;

    @RequestMapping(path = "/redis")
    public String getRedisData(@RequestParam(value = "param", required = false) String param) {
        return "";
    }


    //@RequestMapping(path = "/export",)
    @PostMapping(value = "/export", produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public void export(HttpServletRequest request, HttpServletResponse response) {
        demoService.exportScanCodePage(request, response);

    }

    @RequestMapping(path = "/getUser")
    public Object getUser() {
        return demoService.getUser();
    }

    @RequestMapping(path = "/getUserByGoogle")
    public Object getUserByGoogle(@RequestParam(value = "google") String google) {
        return demoService.getUserByGoogle(google);
    }

    @RequestMapping(path = "/transitionTest")
    public String transitionTest() {
        return azureTransferService.transfer();
    }

    @RequestMapping(path = "/transfer")
    public String transfer(@RequestParam(value = "q", required = false) String q) {
        return openAiTransferService.request2OpenAi(q);
    }

    @RequestMapping(path = "/esTestSave")
    public String esTestSave() {
        esUserService.save();
        return "success";
    }

    @RequestMapping(path = "/esTestUpdate")
    public String esTestUpdate() {
        esUserService.update();
        return "success";
    }

    @RequestMapping(path = "/findById")
    public UserEs findById(@RequestParam(value = "id") Long id) {
        return esUserService.findById(id);
    }

    @RequestMapping(path = "/findByName")
    public Page<UserEs> findById(@RequestParam(value = "name") String name) {
        return esUserService.findByName(name);
    }

    @RequestMapping(path = "/saveAll2Es")
    public void saveAll2Es() {
        esMultiLanguageConfigService.saveAll2Es();
    }

    @RequestMapping(path = "/dellAllEs")
    public void dellAllEs() {
        esMultiLanguageConfigService.deleteAll();
    }

    @RequestMapping(path = "/getByEsId")
    public MultiLanguageConfigDoVO getByEsId(@RequestParam(value = "id") Long id) {
        return esMultiLanguageConfigService.getById(id);
    }

    @RequestMapping(path = "/find")
    public List<EsMultiLanguageConfigDo> findEsOne(@RequestBody MultiLanguageConfigDoQO qo) {
        return esMultiLanguageConfigService.find(qo);
    }


    @RequestMapping(path = "/findList")
    public List<ChartConfigDo> findList(@RequestBody ChartConfigDoQO qo) {
        return chartConfigService.findList(qo);
    }

    @RequestMapping(path = "/findChartConfigById")
    public ChartConfigDo findChartConfigById(@RequestParam(value = "id") Long id) {
        return chartConfigService.getById(id);
    }

    @RequestMapping(path = "/saveAll")
    public void saveAll() {
        esCharConfigService.saveAll();
    }

    @PostMapping("/findChartConfigBySearch")
    public List<String> find(@RequestBody ChartConfigDoQO qo){
        return esCharConfigService.find(qo);
    }

    @PostMapping("/findFuzzy")
    public List<String> findFuzzy(@RequestBody ChartConfigDoQO qo){
        return esCharConfigService.findFuzzy(qo);
    }

    @PostMapping("/testList")
    public List<String> testList(@RequestBody List<ChartConfigDoQO> list){
        if (null == list) {
            return null;
        }
        return null;
    }

}
