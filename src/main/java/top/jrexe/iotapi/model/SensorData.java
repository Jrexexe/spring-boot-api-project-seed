package top.jrexe.iotapi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sensor_data")
public class SensorData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "from_chip_id")
    private String fromChipId;

    @Column(name = "sensor_data")
    private String sensorData;

    @Column(name = "sensor_type")
    private String sensorType;

    @Column(name = "upload_time")
    private Date uploadTime;

    @Column(name = "sensor_id")
    private Integer sensorId;

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
     * @return sensor_id
     */
    public Integer getSensorId() {
        return sensorId;
    }

    /**
     * @param sensorId
     */
    public void setSensorId(Integer sensorId) {
        this.sensorId = sensorId;
    }
}