
<%
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
%>
<%@page import="java.io.OutputStreamWriter"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://wso2.org/projects/carbon/taglibs/carbontags.jar" prefix="carbon"%>
<%@ page import="java.util.Map"%>
<%@ page import="org.wso2.carbon.metrics.view.ui.ChartView"%>


<%
    request.setAttribute("chartBundle", "org.wso2.carbon.metrics.view.ui.i18n.Resources");
    Map<String, ChartView> viewMap = (Map<String, ChartView>) request.getAttribute("viewMap");
    viewMap.put("CPUView", new ChartView(true, new String[] { "CPU", "LoadAverage" }));
    viewMap.put("MemoryView", new ChartView(true, new String[] { "Memory", "PhysicalMemory" }));
    viewMap.put("ThreadingView", new ChartView(false, new String[] { "Threading" }));
    viewMap.put("ClassLoadingView", new ChartView(false, new String[] { "ClassLoading" }));
    viewMap.put("FileDescriptorView", new ChartView(false, new String[] { "FileDescriptor" }));
%>
