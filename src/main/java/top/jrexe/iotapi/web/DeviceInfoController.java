package top.jrexe.iotapi.web;
import top.jrexe.iotapi.core.Result;
import top.jrexe.iotapi.core.ResultGenerator;
import top.jrexe.iotapi.model.DeviceInfo;
import top.jrexe.iotapi.service.DeviceInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/10/23.
*/
@RestController
@RequestMapping("/device/info")
public class DeviceInfoController {
    @Resource
    private DeviceInfoService deviceInfoService;

    @PostMapping("/add")
    public Result add(DeviceInfo deviceInfo) {
        deviceInfoService.save(deviceInfo);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        deviceInfoService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(DeviceInfo deviceInfo) {
        deviceInfoService.update(deviceInfo);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        DeviceInfo deviceInfo = deviceInfoService.findById(id);
        return ResultGenerator.genSuccessResult(deviceInfo);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<DeviceInfo> list = deviceInfoService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
