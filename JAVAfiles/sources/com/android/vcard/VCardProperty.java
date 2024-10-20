package com.android.vcard;

import android.util.Log;
import defpackage.hjf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class VCardProperty {
    private static final String LOG_TAG = "vCard";
    private byte[] byteValue;
    private hjf dataUri;
    private List<String> groupList;
    private String name;
    private final Map<String, Collection<String>> parameterMap = new HashMap();
    private String rawValue;
    private List<String> valueList;

    public void addGroup(String str) {
        if (this.groupList == null) {
            this.groupList = new ArrayList();
        }
        this.groupList.add(str);
    }

    public void addParameter(String str, String str2) {
        Collection<String> collection;
        if (!this.parameterMap.containsKey(str)) {
            if (str.equals(VCardConstants.PARAM_TYPE)) {
                collection = new HashSet<>();
            } else {
                collection = new ArrayList<>();
            }
            this.parameterMap.put(str, collection);
        } else {
            collection = this.parameterMap.get(str);
        }
        collection.add(str2);
    }

    public void addValues(List<String> list) {
        List<String> list2 = this.valueList;
        if (list2 == null) {
            this.valueList = new ArrayList(list);
        } else {
            list2.addAll(list);
        }
    }

    public byte[] getByteValue() {
        return this.byteValue;
    }

    public hjf getDataUri() {
        return this.dataUri;
    }

    public List<String> getGroupList() {
        return this.groupList;
    }

    public String getName() {
        return this.name;
    }

    public Map<String, Collection<String>> getParameterMap() {
        return this.parameterMap;
    }

    public Collection<String> getParameters(String str) {
        return this.parameterMap.get(str);
    }

    public String getRawValue() {
        return this.rawValue;
    }

    public List<String> getValueList() {
        return this.valueList;
    }

    public void setByteValue(byte[] bArr) {
        this.byteValue = bArr;
    }

    public void setDataUri(hjf hjfVar) {
        this.dataUri = hjfVar;
    }

    public void setName(String str) {
        String str2 = this.name;
        if (str2 != null) {
            Log.w("vCard", String.format("Property name is re-defined (existing: %s, requested: %s", str2, str));
        }
        this.name = str;
    }

    public void setParameter(String str, String str2) {
        this.parameterMap.clear();
        addParameter(str, str2);
    }

    public void setRawValue(String str) {
        this.rawValue = str;
    }

    public void setValues(List<String> list) {
        this.valueList = list;
    }

    public void setValues(String... strArr) {
        this.valueList = Arrays.asList(strArr);
    }

    public void addValues(String... strArr) {
        List<String> list = this.valueList;
        if (list == null) {
            this.valueList = Arrays.asList(strArr);
        } else {
            Collections.addAll(list, strArr);
        }
    }
}
