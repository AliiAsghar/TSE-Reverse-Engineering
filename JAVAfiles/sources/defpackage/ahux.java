package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahux {
    public static final ConcurrentMap a = new ConcurrentHashMap();
    private static final aiww b = new aiww(ahup.a);
    private static final Object c = new Object();
    private static volatile atsg d = null;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0023, code lost:
    
        if (r4 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(java.io.File r6) {
        /*
            boolean r0 = r6.isDirectory()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L25
            java.io.File[] r0 = r6.listFiles()
            if (r0 == 0) goto L25
            r4 = r1
            r3 = r2
        L10:
            int r5 = r0.length
            if (r3 >= r5) goto L23
            r5 = r0[r3]
            if (r4 == 0) goto L1f
            boolean r4 = a(r5)
            if (r4 == 0) goto L1f
            r4 = r1
            goto L20
        L1f:
            r4 = r2
        L20:
            int r3 = r3 + 1
            goto L10
        L23:
            if (r4 == 0) goto L2c
        L25:
            boolean r6 = r6.delete()
            if (r6 == 0) goto L2c
            return r1
        L2c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahux.a(java.io.File):boolean");
    }

    public static aiwu b(ahta ahtaVar) {
        Context context = ahtaVar.d;
        aiwl a2 = aiwm.a();
        aiuz aiuzVar = new aiuz(context);
        aiuzVar.c("phenotype");
        aiuzVar.d("all_accounts.pb");
        a2.e(aiuzVar.a());
        a2.d(ahup.a);
        a2.c(b);
        a2.b();
        aiwm a3 = a2.a();
        atsg atsgVar = d;
        if (atsgVar == null) {
            synchronized (c) {
                atsgVar = d;
                if (atsgVar == null) {
                    aiwx aiwxVar = aiwx.a;
                    HashMap hashMap = new HashMap();
                    aneo d2 = ahtaVar.d();
                    agcp f = ahtaVar.f();
                    ahmc.ae(aiwr.a, hashMap);
                    atsg atsgVar2 = new atsg(d2, f, aiwxVar, hashMap);
                    d = atsgVar2;
                    atsgVar = atsgVar2;
                }
            }
        }
        return atsgVar.n(a3);
    }
}
