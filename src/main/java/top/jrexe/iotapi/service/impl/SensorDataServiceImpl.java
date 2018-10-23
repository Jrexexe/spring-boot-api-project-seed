package top.jrexe.iotapi.service.impl;

import top.jrexe.iotapi.dao.SensorDataMapper;
import top.jrexe.iotapi.model.SensorData;
import top.jrexe.iotapi.service.SensorDataService;
import top.jrexe.iotapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/10/23.
 */
@Service
@Transactional
public class SensorDataServiceImpl extends AbstractService<SensorData> implements SensorDataService {
    @Resource
    private SensorDataMapper sensorDataMapper;

}
