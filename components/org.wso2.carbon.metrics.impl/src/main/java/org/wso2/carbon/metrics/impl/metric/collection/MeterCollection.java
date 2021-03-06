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
package org.wso2.carbon.metrics.impl.metric.collection;

import java.util.List;

import org.wso2.carbon.metrics.manager.Meter;

/**
 * Implementation class wrapping {@link List<Meter>} metrics
 */
public class MeterCollection implements Meter {

    private Meter meter;
    private List<Meter> affected;

    public MeterCollection(Meter meter, List<Meter> affectedMeters) {
        this.meter = meter;
        this.affected = affectedMeters;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.wso2.carbon.metrics.manager.Meter#mark()
     */
    @Override
    public void mark() {
        meter.mark();
        for (Meter m : affected) {
            m.mark();
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see org.wso2.carbon.metrics.manager.Meter#mark(long)
     */
    @Override
    public void mark(long n) {
        meter.mark(n);
        for (Meter m : affected) {
            m.mark(n);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.wso2.carbon.metrics.manager.Meter#getCount()
     */
    @Override
    public long getCount() {
        return meter.getCount();
    }
}
