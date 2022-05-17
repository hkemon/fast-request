/*
 * End-User License Agreement (EULA) of Restful Fast Request
 * This End-User License Agreement ("EULA") is a legal agreement between you and KingSoft. Our EULA was created by EULA Template for Restful Fast Request.
 *
 * This EULA agreement governs your acquisition and use of our Restful Fast Request software ("Software") directly from KingSoft or indirectly through a KingSoft authorized reseller or distributor (a "Reseller").
 *
 * Please read this EULA agreement carefully before completing the installation process and using the Restful Fast Request software. It provides a license to use the Restful Fast Request software and contains warranty information and liability disclaimers.
 *
 * If you register for a free trial of the Restful Fast Request software, this EULA agreement will also govern that trial. By clicking "accept" or installing and/or using the Restful Fast Request software, you are confirming your acceptance of the Software and agreeing to become bound by the terms of this EULA agreement.
 *
 * If you are entering into this EULA agreement on behalf of a company or other legal entity, you represent that you have the authority to bind such entity and its affiliates to these terms and conditions. If you do not have such authority or if you do not agree with the terms and conditions of this EULA agreement, do not install or use the Software, and you must not accept this EULA agreement.
 *
 * This EULA agreement shall apply only to the Software supplied by KingSoft herewith regardless of whether other software is referred to or described herein. The terms also apply to any KingSoft updates, supplements, Internet-based services, and support services for the Software, unless other terms accompany those items on delivery. If so, those terms apply.
 *
 * License Grant
 * KingSoft hereby grants you a personal, non-transferable, non-exclusive licence to use the Restful Fast Request software on your devices in accordance with the terms of this EULA agreement.
 *
 * You are permitted to load the Restful Fast Request software (for example a PC, laptop, mobile or tablet) under your control. You are responsible for ensuring your device meets the minimum requirements of the Restful Fast Request software.
 *
 * You are not permitted to:
 *
 * Edit, alter, modify, adapt, translate or otherwise change the whole or any part of the Software nor permit the whole or any part of the Software to be combined with or become incorporated in any other software, nor decompile, disassemble or reverse engineer the Software or attempt to do any such things
 * Reproduce, copy, distribute, resell or otherwise use the Software for any commercial purpose
 * Allow any third party to use the Software on behalf of or for the benefit of any third party
 * Use the Software in any way which breaches any applicable local, national or international law
 * use the Software for any purpose that KingSoft considers is a breach of this EULA agreement
 * Intellectual Property and Ownership
 * KingSoft shall at all times retain ownership of the Software as originally downloaded by you and all subsequent downloads of the Software by you. The Software (and the copyright, and other intellectual property rights of whatever nature in the Software, including any modifications made thereto) are and shall remain the property of KingSoft.
 *
 * KingSoft reserves the right to grant licences to use the Software to third parties.
 *
 * Termination
 * This EULA agreement is effective from the date you first use the Software and shall continue until terminated. You may terminate it at any time upon written notice to KingSoft.
 *
 * It will also terminate immediately if you fail to comply with any term of this EULA agreement. Upon such termination, the licenses granted by this EULA agreement will immediately terminate and you agree to stop all access and use of the Software. The provisions that by their nature continue and survive will survive any termination of this EULA agreement.
 *
 * Governing Law
 * This EULA agreement, and any dispute arising out of or in connection with this EULA agreement, shall be governed by and construed in accordance with the laws of cn.
 */

package io.github.kings1990.plugin.fastrequest.model;

import java.io.Serializable;
import java.util.LinkedHashMap;

public class ParamGroup implements Serializable {
    private String originUrl;
    private String url;
    private String methodType;
    private String postType = "json";
    private LinkedHashMap<String, Object> pathParamMap = new LinkedHashMap<>();
    private LinkedHashMap<String, Object> requestParamMap = new LinkedHashMap<>();
    private LinkedHashMap<String, Object> bodyParamMap = new LinkedHashMap<>();
    private String methodDescription;
    private String className;
    private String method;
    private String module;

    public String getOriginUrl() {
        return originUrl;
    }

    public void setOriginUrl(String originUrl) {
        this.originUrl = originUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethodType() {
        return methodType;
    }

    public void setMethodType(String methodType) {
        this.methodType = methodType;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public LinkedHashMap<String, Object> getPathParamMap() {
        return pathParamMap;
    }

    public void setPathParamMap(LinkedHashMap<String, Object> pathParamMap) {
        this.pathParamMap = pathParamMap;
    }

    public LinkedHashMap<String, Object> getRequestParamMap() {
        return requestParamMap;
    }

    public void setRequestParamMap(LinkedHashMap<String, Object> requestParamMap) {
        this.requestParamMap = requestParamMap;
    }

    public LinkedHashMap<String, Object> getBodyParamMap() {
        return bodyParamMap;
    }

    public void setBodyParamMap(LinkedHashMap<String, Object> bodyParamMap) {
        this.bodyParamMap = bodyParamMap;
    }

    public String getMethodDescription() {
        return methodDescription;
    }

    public void setMethodDescription(String methodDescription) {
        this.methodDescription = methodDescription;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }
}
