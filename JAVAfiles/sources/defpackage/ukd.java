package defpackage;

import j$.util.DesugarArrays;
import j$.util.stream.Stream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ukd {
    public static final xze a = xze.g("Bugle", "RetrieveBrandPublicKeysWorkHelper");
    public final ukh b;

    public ukd(ukh ukhVar) {
        this.b = ukhVar;
    }

    public final alog a(gsi gsiVar) {
        Object obj = gsiVar.b.get("vsms_brand_public_keys_name_list");
        String[] strArr = null;
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Object[]) {
                int length = objArr.length;
                gsh gshVar = new gsh(obj, 0);
                String[] strArr2 = new String[length];
                for (int i = 0; i < length; i++) {
                    strArr2[i] = (String) gshVar.a(Integer.valueOf(i));
                }
                strArr = strArr2;
            }
        }
        if (strArr != null && strArr.length != 0) {
            Stream map = DesugarArrays.stream(strArr).filter(new trt(9)).map(new uje(gsiVar, 4)).filter(new trt(10)).map(new uid(8));
            int i2 = alog.d;
            alog alogVar = (alog) map.collect(alls.a);
            xyo c = a.c();
            c.x("number of vsms brand keys in output data", alogVar.size());
            c.q();
            return alogVar;
        }
        a.q("No vsms brand keys in output data");
        int i3 = alog.d;
        return alsx.a;
    }
}
