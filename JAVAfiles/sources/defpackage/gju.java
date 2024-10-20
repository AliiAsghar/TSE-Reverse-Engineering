package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gju {
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public gju(String str, Map map, Set set, Set set2) {
        set.getClass();
        this.a = str;
        this.b = map;
        this.c = set;
        this.d = set2;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02f6 A[Catch: all -> 0x0320, TryCatch #0 {all -> 0x0320, all -> 0x0306, blocks: (B:44:0x01a9, B:49:0x01c2, B:50:0x01c7, B:52:0x01cd, B:59:0x01d9, B:62:0x01ea, B:98:0x02e3, B:100:0x02f6, B:104:0x02e7, B:107:0x0307, B:108:0x030a, B:112:0x030f, B:64:0x01f4, B:70:0x0219, B:71:0x0225, B:73:0x022b, B:80:0x0236, B:83:0x024e, B:87:0x026a, B:88:0x028e, B:90:0x0294, B:92:0x02a4, B:93:0x02c4, B:95:0x02ca, B:97:0x02da), top: B:43:0x01a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02f5 A[SYNTHETIC] */
    @defpackage.armg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.gju a(defpackage.gkd r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gju.a(gkd, java.lang.String):gju");
    }

    public final boolean equals(Object obj) {
        return gvf.bu(this, obj);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        Collection collection;
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.a);
        sb.append("',\n            |    columns = {");
        sb.append(gvf.bq(aqjn.au(this.b.values(), new ebn(17))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(gvf.bq(this.c));
        sb.append("\n            |    indices = {");
        Set set = this.d;
        if (set != null) {
            collection = aqjn.au(set, new ebn(18));
        } else {
            collection = arnv.a;
        }
        sb.append(gvf.bq(collection));
        sb.append("\n            |}\n        ");
        return arsd.s(sb.toString());
    }
}
