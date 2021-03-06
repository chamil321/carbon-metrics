/*
 * Copyright 2015 WSO2 Inc. (http://wso2.org)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.carbon.metrics.data.service.dao.converter;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Percentage Converter
 */
public class PercentageConverter implements ValueConverter {

    private final BigDecimal HUNDRED = BigDecimal.valueOf(100);

    @Override
    public BigDecimal convert(BigDecimal value) {
        return value.multiply(HUNDRED).setScale(2, RoundingMode.CEILING);
    }
}
