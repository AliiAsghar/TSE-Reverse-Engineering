package com.google.android.ims.businessinfo.json;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import defpackage.advr;
import defpackage.aonx;
import defpackage.aony;
import defpackage.aook;
import defpackage.yjr;
import java.io.Reader;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BusinessInfoJsonParser {
    private static final aonx marshaller;

    static {
        aony aonyVar = new aony();
        aonyVar.b();
        marshaller = aonyVar.a();
    }

    private BusinessInfoJsonParser() {
    }

    public static BusinessInfoData legacyParse(String str, Reader reader, yjr yjrVar) {
        advr.k("Attempting to parse json for %s...", advr.a(str));
        try {
            BusinessInfoJson businessInfoJson = (BusinessInfoJson) marshaller.g(reader, BusinessInfoJson.class);
            advr.k("Done parsing json for %s.", advr.a(str));
            if (businessInfoJson == null) {
                advr.g("Received null json object from parsing rbmBotId %s", advr.a(str));
                return null;
            }
            return businessInfoJson.buildBusinessInfoData(str, yjrVar);
        } catch (aook unused) {
            advr.g("Unable to parse business info for rbmBotId %s due to invalid JSON", advr.a(str));
            return null;
        }
    }

    public static BusinessInfoData parse(String str, Reader reader, yjr yjrVar) {
        advr.k("Attempting to parse json for %s...", advr.a(str));
        try {
            CombinedBusinessInfoAndVerifierInfoJson combinedBusinessInfoAndVerifierInfoJson = (CombinedBusinessInfoAndVerifierInfoJson) marshaller.g(reader, CombinedBusinessInfoAndVerifierInfoJson.class);
            advr.k("Done parsing json for %s.", advr.a(str));
            if (combinedBusinessInfoAndVerifierInfoJson == null) {
                advr.g("Received null json object from parsing rbmBotId %s", advr.a(str));
                return null;
            }
            return combinedBusinessInfoAndVerifierInfoJson.buildBusinessInfoData(str, yjrVar);
        } catch (aook unused) {
            advr.g("Unable to parse business info for rbmBotId %s due to invalid JSON", advr.a(str));
            return null;
        }
    }
}
