package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aryq extends asfk {
    private final ThreadLocal b;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public aryq(defpackage.arpi r2, defpackage.arpe r3) {
        /*
            r1 = this;
            aryr r0 = defpackage.aryr.a
            arpg r0 = r2.get(r0)
            if (r0 != 0) goto Lf
            aryr r0 = defpackage.aryr.a
            arpi r0 = r2.plus(r0)
            goto L10
        Lf:
            r0 = r2
        L10:
            r1.<init>(r0, r3)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r1.b = r0
            arpi r3 = r3.u()
            akty r0 = defpackage.arpf.k
            arpg r3 = r3.get(r0)
            boolean r3 = r3 instanceof defpackage.arwb
            if (r3 != 0) goto L33
            r3 = 0
            java.lang.Object r3 = defpackage.asfq.b(r2, r3)
            defpackage.asfq.c(r2, r3)
            r1.e(r2, r3)
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aryq.<init>(arpi, arpe):void");
    }

    public final void e(arpi arpiVar, Object obj) {
        this.threadLocalIsSet = true;
        this.b.set(new armo(arpiVar, obj));
    }

    public final boolean f() {
        boolean z;
        if (this.threadLocalIsSet && this.b.get() == null) {
            z = true;
        } else {
            z = false;
        }
        this.b.remove();
        if (!z) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.asfk, defpackage.arvg
    public final void hh(Object obj) {
        if (this.threadLocalIsSet) {
            armo armoVar = (armo) this.b.get();
            if (armoVar != null) {
                asfq.c((arpi) armoVar.a, armoVar.b);
            }
            this.b.remove();
        }
        Object n = arro.n(obj, this.e);
        arpe arpeVar = this.e;
        arpi u = arpeVar.u();
        aryq aryqVar = null;
        Object b = asfq.b(u, null);
        if (b != asfq.a) {
            aryqVar = arwa.c(arpeVar, u, b);
        }
        try {
            this.e.w(n);
            if (aryqVar != null && !aryqVar.f()) {
                return;
            }
            asfq.c(u, b);
        } catch (Throwable th) {
            if (aryqVar == null || aryqVar.f()) {
                asfq.c(u, b);
            }
            throw th;
        }
    }
}
