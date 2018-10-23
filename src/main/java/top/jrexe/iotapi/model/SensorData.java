package top.jrexe.iotapi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sensor_data")
public class SensorData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "from_chip_id")
    private String fromChipId;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "sensor_data")
    private String sensorData;

    @Column(name = "sensor_type")
    private String sensorType;

    @Column(name = "upload_time")
    private Date uploadTime;

    @Column(name = "from_sensor_id")
    private String fromSensorId;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return from_chip_id
     */
    public String getFromChipId() {
        return fromChipId;
    }

    /**
     * @param fromChipId
     */
    public void setFromChipId(String fromChipId) {
        this.fromChipId = fromChipId;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return sensor_data
     */
    public String getSensorData() {
        return sensorData;
    }

    /**
     * @param sensorData
     */
    public void setSensorData(String sensorData) {
        this.sensorData = sensorData;
    }

    /**
     * @return sensor_type
     */
    public String getSensorType() {
        return sensorType;
    }

    /**
     * @param sensorType
     */
    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    /**
     * @return upload_time
     */
    public Date getUploadTime() {
        return uploadTime;
    }

    /**
     * @param uploadTime
     */
    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    /**
     * @return from_sensor_id
     */
    public String getFromSensorId() {
        return fromSensorId;
    }

    /**
     * @param fromSensorId
     */
    public void setFromSensorId(String fromSensorId) {
        this.fromSensorId = fromSensorId;
    }
}