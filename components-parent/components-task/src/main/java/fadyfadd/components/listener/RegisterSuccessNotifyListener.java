/*
 * Copyright (C) 2019 Fastjrun, Inc. All Rights Reserved.
 */
package fadyfadd.components.listener;

import com.fastjrun.listener.BaseListener;
import fadyfadd.components.entity.User;

public class RegisterSuccessNotifyListener extends BaseListener {
    public void processUser(User user) {
        log.info(" user :" + user);
    }
}

