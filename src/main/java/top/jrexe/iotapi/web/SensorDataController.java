package top.jrexe.iotapi.web;
import top.jrexe.iotapi.core.Result;
import top.jrexe.iotapi.core.ResultGenerator;
import top.jrexe.iotapi.model.SensorData;
import top.jrexe.iotapi.service.SensorDataService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by Jrexe on 2018/10/24.
*/
@RestController
@RequestMapping("/sensor/data")
public class SensorDataController {
    @Resource
    private SensorDataService sensorDataService;

    @PostMapping("/add")
    public Result add(SensorData sensorData) {
        sensorDataService.save(sensorData);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        sensorDataService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(SensorData sensorData) {
        sensorDataService.update(sensorData);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        SensorData sensorData = sensorDataService.findById(id);
        return ResultGenerator.genSuccessResult(sensorData);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<SensorData> list = sensorDataService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
    @PostMapping("/history")
    public Result history(){
        return ResultGenerator.genSuccessResult();
    }
}
