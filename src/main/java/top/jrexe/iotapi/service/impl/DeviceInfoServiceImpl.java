package top.jrexe.iotapi.service.impl;

import top.jrexe.iotapi.dao.DeviceInfoMapper;
import top.jrexe.iotapi.model.DeviceInfo;
import top.jrexe.iotapi.service.DeviceInfoService;
import top.jrexe.iotapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/10/23.
 */
@Service
@Transactional
public class DeviceInfoServiceImpl extends AbstractService<DeviceInfo> implements DeviceInfoService {
    @Resource
    private DeviceInfoMapper deviceInfoMapper;

}
