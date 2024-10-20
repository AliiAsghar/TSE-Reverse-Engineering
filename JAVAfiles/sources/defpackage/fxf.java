package defpackage;

import android.os.Looper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxf implements fvd, fvc {
    public final List a;
    public final fvb b;
    public final etu c;
    public final Map d;
    public final alob e;
    public final AtomicInteger f;
    public boolean g;
    public int h;
    public fvd i;
    public boolean j;
    public int k;
    public volatile boolean l;
    public volatile long m;
    public volatile long n;
    public volatile boolean o;
    public final ita p;
    private final fvc q;
    private final Map r;
    private final AtomicInteger s;
    private boolean t;
    private boolean u;
    private int v;
    private volatile long w;

    static {
        eqm eqmVar = new eqm();
        eqmVar.b("audio/mp4a-latm");
        eqmVar.C = 44100;
        eqmVar.B = 2;
        new eqn(eqmVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public fxf(atkn atknVar, fvb fvbVar, ita itaVar, fvc fvcVar, eti etiVar, Looper looper) {
        ?? r0 = atknVar.b;
        this.a = r0;
        boolean z = atknVar.a;
        fxc fxcVar = new fxc(this, fvbVar);
        this.b = fxcVar;
        this.p = itaVar;
        this.q = fvcVar;
        this.c = etiVar.b(looper, null);
        this.r = new HashMap();
        this.d = new HashMap();
        this.e = new alob();
        this.s = new AtomicInteger();
        this.f = new AtomicInteger();
        this.g = true;
        this.i = fxcVar.a((fvz) r0.get(0), looper, this, itaVar);
    }

    private final void k(int i, eqn eqnVar) {
        boolean z;
        fwz fwzVar = (fwz) this.d.get(Integer.valueOf(i));
        if (fwzVar == null) {
            return;
        }
        fvz fvzVar = (fvz) this.a.get(this.h);
        long j = this.w;
        if (true == fvzVar.b()) {
            eqnVar = null;
        }
        if (this.h == ((alsx) this.a).c - 1) {
            z = true;
        } else {
            z = false;
        }
        fwzVar.e(fvzVar, j, eqnVar, z);
    }

    @Override // defpackage.fvc
    public final void a(long j) {
        boolean z = true;
        if (j == -9223372036854775807L) {
            if (this.h != ((alsx) this.a).c - 1) {
                z = false;
            }
            j = -9223372036854775807L;
        }
        d.t(z, "Could not retrieve required duration for EditedMediaItem " + this.h);
        this.m = ((fvz) this.a.get(this.h)).a(j);
        this.w = j;
        int i = ((alsx) this.a).c;
    }

    @Override // defpackage.fvc
    public final void b(fwo fwoVar) {
        this.q.b(fwoVar);
    }

    @Override // defpackage.fvc
    public final void c(int i) {
        this.s.set(i);
        this.f.set(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02ef A[Catch: all -> 0x0318, TryCatch #0 {, blocks: (B:38:0x00a1, B:40:0x00da, B:41:0x00e4, B:43:0x00ec, B:45:0x0108, B:48:0x011b, B:50:0x012c, B:53:0x028f, B:55:0x0294, B:57:0x029c, B:63:0x02c2, B:65:0x02d0, B:69:0x02d8, B:71:0x02df, B:73:0x02ef, B:76:0x0300, B:77:0x030f, B:83:0x0304, B:85:0x013d, B:87:0x015d, B:90:0x0170, B:93:0x0177, B:95:0x017b, B:98:0x0184, B:100:0x0188, B:103:0x0191, B:106:0x01b0, B:110:0x01be, B:112:0x01ca, B:114:0x01ec, B:117:0x0200, B:120:0x0210, B:123:0x0216, B:125:0x021a, B:128:0x0224, B:130:0x0228, B:133:0x0232, B:136:0x023c, B:138:0x026f, B:141:0x027b), top: B:37:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0304 A[Catch: all -> 0x0318, TryCatch #0 {, blocks: (B:38:0x00a1, B:40:0x00da, B:41:0x00e4, B:43:0x00ec, B:45:0x0108, B:48:0x011b, B:50:0x012c, B:53:0x028f, B:55:0x0294, B:57:0x029c, B:63:0x02c2, B:65:0x02d0, B:69:0x02d8, B:71:0x02df, B:73:0x02ef, B:76:0x0300, B:77:0x030f, B:83:0x0304, B:85:0x013d, B:87:0x015d, B:90:0x0170, B:93:0x0177, B:95:0x017b, B:98:0x0184, B:100:0x0188, B:103:0x0191, B:106:0x01b0, B:110:0x01be, B:112:0x01ca, B:114:0x01ec, B:117:0x0200, B:120:0x0210, B:123:0x0216, B:125:0x021a, B:128:0x0224, B:130:0x0228, B:133:0x0232, B:136:0x023c, B:138:0x026f, B:141:0x027b), top: B:37:0x00a1 }] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.fvc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(defpackage.eqn r14, int r15) {
        /*
            Method dump skipped, instructions count: 795
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fxf.d(eqn, int):boolean");
    }

    @Override // defpackage.fvd
    public final alor e() {
        return this.i.e();
    }

    @Override // defpackage.fvd
    public final void f() {
        this.i.f();
        this.l = true;
    }

    @Override // defpackage.fvd
    public final void g() {
        this.i.g();
        int i = ((alsx) this.a).c;
    }

    @Override // defpackage.fvd
    public final int h(arjs arjsVar) {
        int h = this.i.h(arjsVar);
        int i = ((alsx) this.a).c;
        if (i != 1 && h != 0) {
            int i2 = (this.h * 100) / i;
            if (h == 2) {
                i2 += arjsVar.a / i;
            }
            arjsVar.a = i2;
            return 2;
        }
        return h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x038d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x038f  */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v34, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v36, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [eyy, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.fxe i(defpackage.eqn r35) {
        /*
            Method dump skipped, instructions count: 1065
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fxf.i(eqn):fxe");
    }

    public final void j() {
        List list = this.a;
        int i = this.k * ((alsx) list).c;
        int i2 = this.h;
        if (i + i2 >= this.v) {
            ere ereVar = ((fvz) list.get(i2)).a;
            alor e = e();
            this.e.h(new ico(e.get(1), e.get(2), (char[]) null));
            this.v++;
        }
    }
}
