package top.jrexe.iotapi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "device_info")
public class DeviceInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "chip_id")
    private String chipId;

    @Column(name = "chip_type")
    private String chipType;

    @Column(name = "last_online")
    private Date lastOnline;

    private String name;

    private String version;

    @Column(name = "create_time")
    private Date createTime;

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
     * @return chip_id
     */
    public String getChipId() {
        return chipId;
    }

    /**
     * @param chipId
     */
    public void setChipId(String chipId) {
        this.chipId = chipId;
    }

    /**
     * @return chip_type
     */
    public String getChipType() {
        return chipType;
    }

    /**
     * @param chipType
     */
    public void setChipType(String chipType) {
        this.chipType = chipType;
    }

    /**
     * @return last_online
     */
    public Date getLastOnline() {
        return lastOnline;
    }

    /**
     * @param lastOnline
     */
    public void setLastOnline(Date lastOnline) {
        this.lastOnline = lastOnline;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version
     */
    public void setVersion(String version) {
        this.version = version;
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
}