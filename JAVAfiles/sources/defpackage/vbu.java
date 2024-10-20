package defpackage;

import android.text.TextUtils;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class vbu {
    public static final xze a = xze.g("BugleNetwork", "RcsMsisdnAccessor");
    public final armf b;
    public final armf c;
    public final anen d;
    public final anen e;
    private final armf j;
    private final armf k;
    private final armf l;
    private final armf m;
    private final armf n;
    private final armf o;
    private final armf p;
    public int g = -2;
    public final AtomicReference h = new AtomicReference(null);
    public final AtomicReference i = new AtomicReference();
    public final ConcurrentMap f = new ConcurrentHashMap(2);

    public vbu(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, anen anenVar, anen anenVar2, armf armfVar7, armf armfVar8, armf armfVar9) {
        this.b = armfVar;
        this.j = armfVar2;
        this.c = armfVar3;
        this.k = armfVar4;
        this.l = armfVar5;
        this.m = armfVar6;
        this.d = anenVar;
        this.e = anenVar2;
        this.n = armfVar7;
        this.o = armfVar8;
        this.p = armfVar9;
    }

    public static Optional g(Optional optional) {
        return optional.map(new vbi(7)).filter(new uzr(5));
    }

    private final void o(int i) {
        ((mbl) this.l.b()).e("Bugle.Rcs.PhoneNumber.Invalid.Counts", i);
    }

    @Deprecated
    public final akul a() {
        return b().h(new vbj(7), this.e);
    }

    @Deprecated
    public final akul b() {
        return aktp.ai(new uvp(this, 14), this.d);
    }

    @Deprecated
    public final akul c() {
        akrh e = aktp.e("RcsMsisdnAccessor::getRcsMsisdnAsync");
        try {
            akul ai = aktp.ai(new uvp(this, 15), this.d);
            e.b(ai);
            e.close();
            return ai;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final alhr d() {
        uqw uqwVar = new uqw(this, 15);
        armf armfVar = this.p;
        armfVar.getClass();
        return albo.E(uqwVar, Duration.ofSeconds(((Long) armfVar.b()).longValue()));
    }

    @Deprecated
    public final Optional e() {
        return h().flatMap(new vbi(8));
    }

    public final Optional f(int i) {
        return i(i).flatMap(new vbi(8));
    }

    @Deprecated
    public final Optional h() {
        Optional o = ((vqu) this.b.b()).o();
        if (o.isPresent()) {
            return o;
        }
        return j(((yyt) this.c.b()).Q(vqk.m), true);
    }

    public final Optional i(int i) {
        return j(i, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        if (((defpackage.vqu) r5.b.b()).J(r6) != false) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v19, types: [msh, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.util.Optional j(int r6, boolean r7) {
        /*
            r5 = this;
            java.lang.String r0 = "RcsMsisdnAccessor::getRcsMessagingIdentityWithFallback"
            akrh r0 = defpackage.aktp.e(r0)
            java.util.concurrent.ConcurrentMap r1 = r5.f     // Catch: java.lang.Throwable -> Le4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Le4
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> Le4
            j$.util.Optional r1 = (j$.util.Optional) r1     // Catch: java.lang.Throwable -> Le4
            if (r1 == 0) goto L1a
            r6 = 7
            r5.o(r6)     // Catch: java.lang.Throwable -> Le4
            goto Le0
        L1a:
            j$.util.Optional r1 = j$.util.Optional.empty()     // Catch: java.lang.Throwable -> Le4
            if (r7 != 0) goto L2d
            armf r7 = r5.b     // Catch: java.lang.Throwable -> Le4
            java.lang.Object r7 = r7.b()     // Catch: java.lang.Throwable -> Le4
            vqu r7 = (defpackage.vqu) r7     // Catch: java.lang.Throwable -> Le4
            j$.util.Optional r7 = r7.o()     // Catch: java.lang.Throwable -> Le4
            r1 = r7
        L2d:
            j$.util.Optional r7 = g(r1)     // Catch: java.lang.Throwable -> Le4
            boolean r7 = r7.isPresent()     // Catch: java.lang.Throwable -> Le4
            if (r7 == 0) goto L3e
            java.util.concurrent.ConcurrentMap r6 = r5.f     // Catch: java.lang.Throwable -> Le4
            r6.putIfAbsent(r2, r1)     // Catch: java.lang.Throwable -> Le4
            goto Le0
        L3e:
            armf r7 = r5.n     // Catch: java.lang.Throwable -> Le4
            java.lang.Object r7 = r7.b()     // Catch: java.lang.Throwable -> Le4
            olv r7 = (defpackage.olv) r7     // Catch: java.lang.Throwable -> Le4
            boolean r7 = r7.a()     // Catch: java.lang.Throwable -> Le4
            if (r7 == 0) goto L5b
            armf r7 = r5.j     // Catch: java.lang.Throwable -> Le4
            java.lang.Object r7 = r7.b()     // Catch: java.lang.Throwable -> Le4
            adjc r7 = (defpackage.adjc) r7     // Catch: java.lang.Throwable -> Le4
            boolean r7 = r7.w(r6)     // Catch: java.lang.Throwable -> Le4
            if (r7 == 0) goto Ldc
            goto L69
        L5b:
            armf r7 = r5.b     // Catch: java.lang.Throwable -> Le4
            java.lang.Object r7 = r7.b()     // Catch: java.lang.Throwable -> Le4
            vqu r7 = (defpackage.vqu) r7     // Catch: java.lang.Throwable -> Le4
            boolean r7 = r7.J(r6)     // Catch: java.lang.Throwable -> Le4
            if (r7 == 0) goto Ldc
        L69:
            armf r7 = r5.k     // Catch: java.lang.Throwable -> Le4
            java.lang.Object r7 = r7.b()     // Catch: java.lang.Throwable -> Le4
            yjy r7 = (defpackage.yjy) r7     // Catch: java.lang.Throwable -> Le4
            ykb r7 = r7.h(r6)     // Catch: java.lang.Throwable -> Le4
            r1 = 0
            j$.util.Optional r7 = r7.j(r1)     // Catch: java.lang.Throwable -> Le4
            vbi r1 = new vbi     // Catch: java.lang.Throwable -> Le4
            r3 = 6
            r1.<init>(r3)     // Catch: java.lang.Throwable -> Le4
            j$.util.Optional r1 = r7.map(r1)     // Catch: java.lang.Throwable -> Le4
            uzr r3 = new uzr     // Catch: java.lang.Throwable -> Le4
            r4 = 4
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Le4
            j$.util.Optional r1 = r1.filter(r3)     // Catch: java.lang.Throwable -> Le4
            boolean r3 = r1.isPresent()     // Catch: java.lang.Throwable -> Le4
            if (r3 == 0) goto Lc0
            java.lang.Object r6 = r1.get()     // Catch: java.lang.Throwable -> Le4
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> Le4
            armf r1 = r5.m     // Catch: java.lang.Throwable -> Le4
            java.lang.Object r1 = r1.b()     // Catch: java.lang.Throwable -> Le4
            mre r1 = (defpackage.mre) r1     // Catch: java.lang.Throwable -> Le4
            java.lang.Object r7 = r7.get()     // Catch: java.lang.Throwable -> Le4
            uqw r3 = new uqw     // Catch: java.lang.Throwable -> Le4
            r4 = 16
            r3.<init>(r6, r4)     // Catch: java.lang.Throwable -> Le4
            msh r6 = r1.g(r7, r3)     // Catch: java.lang.Throwable -> Le4
            j$.util.Optional r1 = j$.util.Optional.of(r6)     // Catch: java.lang.Throwable -> Le4
            java.util.concurrent.ConcurrentMap r6 = r5.f     // Catch: java.lang.Throwable -> Le4
            r6.putIfAbsent(r2, r1)     // Catch: java.lang.Throwable -> Le4
            r6 = 8
            r5.o(r6)     // Catch: java.lang.Throwable -> Le4
            goto Le0
        Lc0:
            xze r7 = defpackage.vbu.a     // Catch: java.lang.Throwable -> Le4
            xyo r7 = r7.e()     // Catch: java.lang.Throwable -> Le4
            java.lang.String r1 = "Failed to access Rcs msisdn or Rcs MessagingIdentity."
            r7.H(r1)     // Catch: java.lang.Throwable -> Le4
            java.lang.String r1 = "subId"
            r7.x(r1, r6)     // Catch: java.lang.Throwable -> Le4
            r7.q()     // Catch: java.lang.Throwable -> Le4
            r6 = 2
            r5.o(r6)     // Catch: java.lang.Throwable -> Le4
            j$.util.Optional r1 = j$.util.Optional.empty()     // Catch: java.lang.Throwable -> Le4
            goto Le0
        Ldc:
            j$.util.Optional r1 = j$.util.Optional.empty()     // Catch: java.lang.Throwable -> Le4
        Le0:
            r0.close()
            return r1
        Le4:
            r6 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> Le9
            goto Led
        Le9:
            r7 = move-exception
            r6.addSuppressed(r7)
        Led:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vbu.j(int, boolean):j$.util.Optional");
    }

    @Deprecated
    public final String k() {
        if (this.i.get() == null) {
            this.i.set(d());
        }
        String str = (String) ((alhr) this.i.get()).get();
        if (((Boolean) this.o.b()).booleanValue() && TextUtils.isEmpty(str)) {
            return m();
        }
        return str;
    }

    public final String l(int i) {
        return (String) g(j(i, false)).orElse("");
    }

    public final String m() {
        akrh e = aktp.e("RcsMsisdnAccessor::getRcsMsisdn");
        try {
            String t = ((vqu) this.b.b()).t();
            if (TextUtils.isEmpty(t)) {
                t = (String) g(j(((yyt) this.c.b()).Q(vqk.l), true)).orElse("");
            }
            e.close();
            return t;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final String n(int i) {
        a.bE(this.h, aktp.ah(new ebm(this, i, 9), this.d));
        return "";
    }
}
