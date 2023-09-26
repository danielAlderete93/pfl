package com.danielalderete.fashionlike.core.model;

import java.util.Date;

public interface Trackable {

    Date getCreatedDate();

    void setCreatedDate(Date date);

    Date getUpdatedDate();

    void setUpdatedDate(Date date);

    void setActive(Boolean isActive);

    Boolean getActive();


}
