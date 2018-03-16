package com.akingyin.sample.db;

import java.io.Serializable;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

/**
 * @author king
 * @version V1.0
 * @ Description:
 * @ Date 2018/3/15 17:44
 */


@Entity(nameInDb = "tb_user")
public class UserEntity  implements Serializable {

  @Id(autoincrement = true)
  public     Long    id;

  @Property
  public     String     name;

  @Property
  public     String     account;

  @Property
  public    Integer    age;

  @Property
  public     Long      date;

 
}
