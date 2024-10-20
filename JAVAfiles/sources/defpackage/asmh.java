package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asmh {
    public final aslx a;
    public final String b;
    public final aslv c;
    public final asmk d;
    public final Map e;
    public asle f;

    public asmh(aslx aslxVar, String str, aslv aslvVar, asmk asmkVar, Map map) {
        str.getClass();
        map.getClass();
        this.a = aslxVar;
        this.b = str;
        this.c = aslvVar;
        this.d = asmkVar;
        this.e = map;
    }

    public final String a(String str) {
        return this.c.b(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.a);
        if (this.c.a() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object obj : this.c) {
                int i2 = i + 1;
                if (i < 0) {
                    aqjn.G();
                }
                armo armoVar = (armo) obj;
                String str = (String) armoVar.a;
                String str2 = (String) armoVar.b;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        if (!this.e.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.e);
        }
        sb.append('}');
        return sb.toString();
    }
}
