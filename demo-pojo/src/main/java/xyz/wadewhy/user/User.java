package xyz.wadewhy.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * @PACKAGE_NAME: xyz.wadewhy.user
 * @NAME: User
 * @Author: 钟子豪
 * @DATE: 2019/12/29
 * @MONTH_NAME_FULL: 十二月
 * @DAY: 29
 * @DAY_NAME_FULL: 星期日
 * @PROJECT_NAME: springboot-models
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity //标注之后，启动会自动创建实体类数据表
@Table(name = "user")//表示指定关联的数据库表名
public class User {
    @Id
    @Column(name = "id")
    private Integer userId;
    @Column(name = "age")
    private Integer age;
    @Column(name = "birthday")
    private Date birthday;
}
