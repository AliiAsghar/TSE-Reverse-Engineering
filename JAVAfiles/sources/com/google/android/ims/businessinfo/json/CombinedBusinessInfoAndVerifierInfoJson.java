package com.google.android.ims.businessinfo.json;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import defpackage.advr;
import defpackage.albo;
import defpackage.aoop;
import defpackage.aoor;
import defpackage.yjr;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CombinedBusinessInfoAndVerifierInfoJson {

    @aoor(a = "botinfo")
    @aoop
    private BusinessInfoJson botInfo;

    @aoor(a = "bot-verification")
    @aoop
    private BusinessVerifierInfoJsonData botVerifierInfo;

    public BusinessInfoData buildBusinessInfoData(String str, yjr yjrVar) {
        BusinessVerifierInfoJsonData businessVerifierInfoJsonData;
        if (str == null || CombinedBusinessInfoAndVerifierInfoJson$$ExternalSyntheticBackport0.m(str)) {
            str = albo.ag(getBotId());
        }
        advr.k("Building business info data object with verifier info for %s", str);
        BusinessInfoData.Builder builder = BusinessInfoData.builder(str);
        BusinessInfoJson businessInfoJson = this.botInfo;
        if (businessInfoJson == null) {
            advr.q("Could not create business info data object from invalid json: %s", null);
            return null;
        }
        if (!businessInfoJson.parseJsonToBuilder(builder, str, yjrVar) || ((businessVerifierInfoJsonData = this.botVerifierInfo) != null && !businessVerifierInfoJsonData.parseJsonToBuilder(builder, str))) {
            return null;
        }
        return builder.build();
    }

    public String getBotId() {
        BusinessInfoJson businessInfoJson = this.botInfo;
        if (businessInfoJson != null) {
            return businessInfoJson.getBotId();
        }
        return null;
    }

    public String getColour() {
        BusinessInfoJson businessInfoJson = this.botInfo;
        if (businessInfoJson != null) {
            return businessInfoJson.getColour();
        }
        return null;
    }

    public String getName() {
        BusinessInfoJson businessInfoJson = this.botInfo;
        if (businessInfoJson != null) {
            return businessInfoJson.getName();
        }
        return null;
    }

    public boolean getVerified() {
        BusinessVerifierInfoJsonData businessVerifierInfoJsonData = this.botVerifierInfo;
        if (businessVerifierInfoJsonData != null) {
            return businessVerifierInfoJsonData.getVerified();
        }
        return false;
    }
}
