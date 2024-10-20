package com.google.android.ims.businessinfo.json;

import com.google.android.ims.businessinfo.json.BusinessInfoJsonData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import defpackage.advr;
import defpackage.albo;
import defpackage.aoop;
import defpackage.aoor;
import defpackage.yjr;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BusinessInfoJson {
    private static final String SIP_URI = "SIP-URI";
    private static final String SIP_URI_PREFIX = "sip:";

    @aoor(a = "colour")
    @aoop
    String colour;

    @aoor(a = "custom-pcc")
    @aoop
    BusinessInfoCustomJsonData customPccData;

    @aoor(a = "pcc")
    @aoop
    StandardData pccData;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static class StandardData {

        @aoor(a = "org-details")
        @aoop
        BusinessInfoStandardJsonData standardData;

        @aoor(a = "pcc-type")
        @aoop
        String type;

        StandardData() {
        }
    }

    public BusinessInfoData buildBusinessInfoData(String str, yjr yjrVar) {
        if (str == null || BusinessInfoJson$$ExternalSyntheticBackport0.m(str)) {
            str = albo.ag(getBotId());
        }
        advr.k("Building business info data object for %s", str);
        BusinessInfoData.Builder builder = BusinessInfoData.builder(str);
        if (parseJsonToBuilder(builder, str, yjrVar)) {
            return builder.build();
        }
        return null;
    }

    public String getBotId() {
        BusinessInfoStandardJsonData businessInfoStandardJsonData;
        String uri;
        StandardData standardData = this.pccData;
        if (standardData != null && (businessInfoStandardJsonData = standardData.standardData) != null) {
            for (BusinessInfoJsonData.UriEntryData uriEntryData : businessInfoStandardJsonData.getUriEntries()) {
                if (Objects.equals(uriEntryData.getType(), SIP_URI) && (uri = uriEntryData.getUri()) != null) {
                    return uri.replaceFirst(SIP_URI_PREFIX, "");
                }
            }
            return null;
        }
        return null;
    }

    public String getColour() {
        return this.colour;
    }

    public String getName() {
        StandardData standardData = this.pccData;
        standardData.getClass();
        return standardData.standardData.getName();
    }

    public boolean parseJsonToBuilder(BusinessInfoData.Builder builder, String str, yjr yjrVar) {
        BusinessInfoStandardJsonData businessInfoStandardJsonData;
        StandardData standardData = this.pccData;
        if (standardData != null && (businessInfoStandardJsonData = standardData.standardData) != null) {
            businessInfoStandardJsonData.parseJsonToBuilder(builder, str, yjrVar);
            BusinessInfoCustomJsonData businessInfoCustomJsonData = this.customPccData;
            if (businessInfoCustomJsonData != null) {
                businessInfoCustomJsonData.parseJsonToBuilder(builder, yjrVar);
            }
            return true;
        }
        advr.q("Could not create business info data object from invalid json: %s", advr.a(standardData));
        return false;
    }
}
