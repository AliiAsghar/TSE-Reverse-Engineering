package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uga {
    private static final xze b = xze.g("Bugle", "MediaResourceManager");
    public final Executor a;
    private final Executor c;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        void OU();
    }

    public uga(Context context) {
        ((a) akec.w(context, a.class)).OU();
        this.c = yyb.bb("MediaLoading", 10, 10);
        this.a = Executors.newSingleThreadExecutor(new ahkg("MediaBackgroundThread", 1, 1));
    }

    public static void d(ufy ufyVar, boolean z, ufw ufwVar, rra rraVar) {
        boolean z2 = false;
        if (ufyVar != null) {
            xyl.k(!z);
            if (ufyVar.a.n() > 0) {
                z2 = true;
            }
            xyl.k(z2);
            if (rraVar != null) {
                try {
                    rraVar.fD(rraVar, ufyVar.a, ufyVar.b);
                } finally {
                    ufyVar.a.q();
                    ufyVar.a();
                }
            }
            return;
        }
        if (z) {
            xyo e = b.e();
            e.H("Asynchronous media loading failed.");
            e.z("key", ufwVar.m());
            e.q();
            if (rraVar != null) {
                rraVar.fC(rraVar);
                return;
            }
            return;
        }
        if (rraVar == null || !rraVar.h()) {
            z2 = true;
        }
        xyl.k(z2);
        xyo d = b.d();
        d.H("media request not processed, no longer bound.");
        d.C("key", ufwVar.m());
        d.q();
    }

    private final ufy f(ufw ufwVar) {
        ugg uggVar;
        ugg h;
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (ufwVar.c() == 0) {
            uggVar = g(ufwVar);
        } else {
            uggVar = null;
        }
        if (uggVar != null) {
            if (uggVar.k()) {
                ufw l = uggVar.l();
                xyl.l(l);
                uggVar.q();
                h = h(l, arrayList);
            } else {
                h = uggVar;
            }
        } else {
            h = h(ufwVar, arrayList);
        }
        if (uggVar != null) {
            z = true;
        } else {
            z = false;
        }
        return new ufy(this, h, z, arrayList);
    }

    private static ugg g(ufw ufwVar) {
        ufv j;
        ugg b2;
        if (ufwVar.d() == 3 && (j = ufwVar.j()) != null && (b2 = j.b(ufwVar.m())) != null) {
            return b2;
        }
        return null;
    }

    private static final ugg h(ufw ufwVar, List list) {
        ugg l = ufwVar.l(list);
        xyl.l(l);
        l.p();
        if (l.h() && ufwVar.c() == 0) {
            xyl.k(true);
            ufv j = ufwVar.j();
            if (j != null) {
                j.a(ufwVar.m(), l);
                xyo d = b.d();
                d.H("added media resource to");
                d.H(j.a);
                d.C("key", ufwVar.m());
                d.q();
            }
        }
        return l;
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x001d: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:30), block:B:22:0x001d */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ugg a(defpackage.ufw r6) {
        /*
            r5 = this;
            defpackage.xyl.h()
            r0 = 0
            ufy r1 = r5.f(r6)     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L25 java.lang.Exception -> L27
            ugg r2 = r1.a     // Catch: java.lang.Throwable -> L1c java.lang.OutOfMemoryError -> L1f java.lang.Exception -> L21
            int r2 = r2.n()     // Catch: java.lang.Throwable -> L1c java.lang.OutOfMemoryError -> L1f java.lang.Exception -> L21
            if (r2 <= 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            defpackage.xyl.k(r2)     // Catch: java.lang.Throwable -> L1c java.lang.OutOfMemoryError -> L1f java.lang.Exception -> L21
            ugg r6 = r1.a     // Catch: java.lang.Throwable -> L1c java.lang.OutOfMemoryError -> L1f java.lang.Exception -> L21
            r1.a()
            return r6
        L1c:
            r6 = move-exception
            r0 = r1
            goto L47
        L1f:
            r2 = move-exception
            goto L2a
        L21:
            r2 = move-exception
            goto L2a
        L23:
            r6 = move-exception
            goto L47
        L25:
            r1 = move-exception
            goto L28
        L27:
            r1 = move-exception
        L28:
            r2 = r1
            r1 = r0
        L2a:
            xze r3 = defpackage.uga.b     // Catch: java.lang.Throwable -> L1c
            xyo r3 = r3.e()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = "Synchronous media loading failed."
            r3.H(r4)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = "key"
            java.lang.String r6 = r6.m()     // Catch: java.lang.Throwable -> L1c
            r3.z(r4, r6)     // Catch: java.lang.Throwable -> L1c
            r3.r(r2)     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L46
            r1.a()
        L46:
            return r0
        L47:
            if (r0 == 0) goto L4c
            r0.a()
        L4c:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uga.a(ufw):ugg");
    }

    public final void b(ufw ufwVar) {
        c(ufwVar, this.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.ufw r11, java.util.concurrent.Executor r12) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.rra
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r11
            rra r0 = (defpackage.rra) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 == 0) goto L14
            boolean r2 = r0.h()
            if (r2 == 0) goto L13
            goto L14
        L13:
            return
        L14:
            int r2 = r11.c()
            r3 = 1
            if (r2 == 0) goto L1d
        L1b:
            r4 = r1
            goto L3f
        L1d:
            java.lang.String r2 = r11.m()
            if (r2 != 0) goto L29
            java.lang.String r2 = "mediaRequest with cache policy has no key!"
            defpackage.xyl.c(r2)
            goto L1b
        L29:
            ugg r2 = g(r11)
            if (r2 == 0) goto L1b
            boolean r4 = r2.k()
            if (r4 != 0) goto L1b
            ufy r4 = new ufy
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.<init>(r10, r2, r3, r5)
        L3f:
            r8 = 0
            if (r4 == 0) goto L58
            ufy r12 = r10.f(r11)     // Catch: java.lang.OutOfMemoryError -> L4a java.lang.Exception -> L4c
            d(r12, r8, r11, r0)     // Catch: java.lang.OutOfMemoryError -> L4a java.lang.Exception -> L4c
            return
        L4a:
            r12 = move-exception
            goto L4d
        L4c:
            r12 = move-exception
        L4d:
            xze r2 = defpackage.uga.b
            java.lang.String r4 = "Media Request Failed."
            r2.r(r4, r12)
            d(r1, r3, r11, r0)
            return
        L58:
            tdw r9 = new tdw
            r6 = 6
            r7 = 0
            r2 = r9
            r3 = r10
            r4 = r0
            r5 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            raw r2 = new raw
            r3 = 15
            r2.<init>(r11, r0, r3, r1)
            ugb r11 = new ugb
            r11.<init>(r9, r2)
            java.lang.Void[] r0 = new java.lang.Void[r8]
            r11.executeOnExecutor(r12, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uga.c(ufw, java.util.concurrent.Executor):void");
    }

    public final /* synthetic */ atkn e(rra rraVar, ufw ufwVar) {
        if (rraVar != null && !rraVar.h()) {
            return new atkn(false, (Object) null);
        }
        try {
            return new atkn(false, (Object) f(ufwVar));
        } catch (Exception | OutOfMemoryError e) {
            b.r("Media Request Failed.", e);
            return new atkn(true, (Object) null);
        }
    }
}
