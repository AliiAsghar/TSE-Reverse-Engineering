package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uvc {
    private static final xze a = xze.g("BugleNetwork", "ReceiverIdParser");

    public static aqfn a(String str) {
        if (TextUtils.isEmpty(str)) {
            a.m("Empty receiver ID in firebase tickle.");
            return null;
        }
        try {
            byte[] decode = Base64.decode(str, 0);
            try {
                aqfn aqfnVar = (aqfn) apag.parseFrom(aqfn.a, decode, aozs.a());
                xyo c = a.c();
                c.H("Extracted receiver id from firebase tickle");
                c.L("receiverId", aqfnVar.c);
                asku b = asku.b(aqfnVar.b);
                if (b == null) {
                    b = asku.UNRECOGNIZED;
                }
                c.z(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, b);
                c.q();
                return aqfnVar;
            } catch (apba unused) {
                a.m("Could not decode receiver ID. Invalid protobuf.");
                return null;
            }
        } catch (IllegalArgumentException unused2) {
            a.m("Could not decode receiver ID. Invalid base64.");
            return null;
        }
    }
}
