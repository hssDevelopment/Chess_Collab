package com.hssdevelopment.configuration;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * Created by mhensley on 12/27/16.
 */
public class SecurityApiInitializer extends AbstractSecurityWebApplicationInitializer {

    public SecurityApiInitializer() {
        super(SecurityConfig.class);
    }
}
