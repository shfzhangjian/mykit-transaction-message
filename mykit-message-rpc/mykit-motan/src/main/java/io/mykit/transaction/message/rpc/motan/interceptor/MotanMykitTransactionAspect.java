/**
 * Copyright 2020-9999 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.mykit.transaction.message.rpc.motan.interceptor;

import io.mykit.transaction.message.core.interceptor.AbstractMykitTransactionAspect;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * @author binghe
 * @version 1.0.0
 * @description MotanMykitTransactionAspect
 */
@Aspect
@Component
public class MotanMykitTransactionAspect extends AbstractMykitTransactionAspect implements Ordered {

    /**
     * Instantiates a new Motan mykit transaction aspect.
     *
     * @param motanMykitTransactionInterceptor the motan mykit transaction interceptor
     */
    @Autowired
    public MotanMykitTransactionAspect(final MotanMykitTransactionInterceptor motanMykitTransactionInterceptor) {
        super.setMythTransactionInterceptor(motanMykitTransactionInterceptor);
    }

    @Override
    public int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE;
    }
}
