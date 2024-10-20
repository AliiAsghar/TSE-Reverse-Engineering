package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hkp {
    public long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final List h;

    public hkp(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.b = str;
        this.c = true == "".equals(str2) ? null : str2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = list;
    }

    public static hkp a(hkq hkqVar) {
        List arrayList;
        if (atog.a(hkqVar) == 538247942) {
            String e = atog.e(hkqVar);
            String e2 = atog.e(hkqVar);
            long b = atog.b(hkqVar);
            long b2 = atog.b(hkqVar);
            long b3 = atog.b(hkqVar);
            long b4 = atog.b(hkqVar);
            int a = atog.a(hkqVar);
            if (a >= 0) {
                if (a == 0) {
                    arrayList = Collections.emptyList();
                } else {
                    arrayList = new ArrayList();
                }
                List list = arrayList;
                for (int i = 0; i < a; i++) {
                    list.add(new hjx(atog.e(hkqVar).intern(), atog.e(hkqVar).intern()));
                }
                return new hkp(e, e2, b, b2, b3, b4, list);
            }
            throw new IOException(a.bV(a, "readHeaderList size="));
        }
        throw new IOException();
    }
}
