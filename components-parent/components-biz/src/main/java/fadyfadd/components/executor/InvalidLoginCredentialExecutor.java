/*
 * Copyright (C) 2019 Fastjrun, Inc. All Rights Reserved.
 */
package fadyfadd.components.executor;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fastjrun.executor.BaseSimpleJobExecutor;
import fadyfadd.components.service.CoreUserService;

@Component("invalidLoginCredentialExecutor")
public class InvalidLoginCredentialExecutor extends BaseSimpleJobExecutor {
    @Autowired
    private CoreUserService coreUserService;

    @Override
    public void execute() {
        this.coreUserService.inValidUserLoginCredential(new Date());
    }
}
