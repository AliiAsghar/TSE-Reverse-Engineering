package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class vby implements vba {
    public static final xze m = xze.g("BugleNetwork", "RegistrationProvider");
    public final anen n;
    public final anen o;
    public final veo p;
    public final xnv q;
    protected final Optional r;
    public akul s;
    protected final wpp t;

    public vby(anen anenVar, anen anenVar2, veo veoVar, xnv xnvVar, wpp wppVar, Optional optional) {
        this.n = anenVar;
        this.o = anenVar2;
        this.p = veoVar;
        this.q = xnvVar;
        this.t = wppVar;
        this.r = optional;
    }

    public static final void w(aqfz aqfzVar) {
        askw b = askw.b(aqfzVar.b);
        if (b == null) {
            b = askw.UNRECOGNIZED;
        }
        if (!b.equals(askw.UNKNOWN)) {
            xyo e = m.e();
            e.H("Received warning during tachyon registration: ");
            askw b2 = askw.b(aqfzVar.b);
            if (b2 == null) {
                b2 = askw.UNRECOGNIZED;
            }
            e.H(b2);
            e.q();
        }
    }

    protected abstract vfc a(long j);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract vgp b();

    public abstract akul c();

    public abstract akul d();

    protected abstract akul e();

    public abstract akul f();

    protected abstract akul g(byte[] bArr);

    protected abstract akul h(long j);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract akul i(aqer aqerVar);

    @Override // defpackage.vba
    public final akul k() {
        return l(vaz.CACHE_ALLOWED);
    }

    @Override // defpackage.vba
    public final akul l(vaz vazVar) {
        akul h;
        akrh e = aktp.e("RegistrationProvider#getAuthToken");
        try {
            if (vazVar.d) {
                h = aktp.ag(null);
            } else {
                h = h(0L);
            }
            akul i = h.i(new vbl(this, vazVar, 9), andi.a);
            e.b(i);
            e.close();
            return i;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public akul n(byte[] bArr) {
        return aktp.ag(bArr);
    }

    @Deprecated
    public final synchronized akul q() {
        return r(true);
    }

    public final synchronized akul r(boolean z) {
        if (this.s != null) {
            m.o("returning already existing registration future");
            return this.s;
        }
        m.o("Getting Tachyon registration");
        return akuk.c(new izd(this, e().i(new vbn(this, 9), this.o).i(new led(this, z, 5), andi.a).f(Throwable.class, new vbn(this, 8), andi.a), 7), andi.a).f();
    }

    public final akul s() {
        return akul.g(e()).h(new vbj(8), andi.a);
    }

    public final akul t(final long j, final boolean z) {
        akrh e = aktp.e("RegistrationProvider#refreshTachyonRegistration");
        try {
            xze xzeVar = m;
            xzeVar.l("starting refresh of tachyon registration");
            vfc a = a(j);
            aqgb aqgbVar = (aqgb) this.t.S(j()).s();
            xyo c = xzeVar.c();
            c.z("RefreshRequestId", aqgbVar.c);
            c.q();
            akul f = akul.g(a.c(aqgbVar)).i(new vbl(this, a, 10, null), this.n).i(new vbn(a, 11), this.n).i(new ancs() { // from class: vbv
                @Override // defpackage.ancs
                public final ListenableFuture a(Object obj) {
                    aqer aqerVar = (aqer) obj;
                    vby.m.o("Received Tachyon registration refresh token");
                    if (aqerVar == null) {
                        vby.m.m("Tachyon register refresh response was null");
                        return aktp.af(new IllegalArgumentException("Tachyon register refresh response was null"));
                    }
                    vby vbyVar = vby.this;
                    if ((aqerVar.b & 8) != 0) {
                        aqfz aqfzVar = aqerVar.g;
                        if (aqfzVar == null) {
                            aqfzVar = aqfz.a;
                        }
                        vby.w(aqfzVar);
                    }
                    if ((aqerVar.b & 2) != 0) {
                        return akul.g(vbyVar.i(aqerVar)).h(new uzs(aqerVar, 12), andi.a);
                    }
                    vby.m.q("Tachyon register refresh response has no auth token");
                    if (aqerVar.e && aqerVar.f != 0 && j == 0) {
                        boolean z2 = z;
                        xyo c2 = vby.m.c();
                        c2.H("Retrying RegisterRefresh with server timestamp");
                        c2.y("timestamp", aqerVar.f);
                        c2.q();
                        return vbyVar.t(aqerVar.f, z2);
                    }
                    return aktp.af(new IllegalArgumentException("Tachyon register refresh response has no auth token"));
                }
            }, andi.a).f(aqwb.class, new led(this, z, 6), andi.a);
            e.b(f);
            e.close();
            return f;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Deprecated
    public final synchronized akul u() {
        m.o("Refresh Tachyon Registration Now");
        return s().i(new vbn(this, 10), andi.a);
    }

    public final akul v(aqfg aqfgVar) {
        m.l("Storing Tachyon auth token");
        return akul.g(aktp.as(g(aqfgVar.b.H()), h(this.q.f().toEpochMilli() + TimeUnit.MICROSECONDS.toMillis(aqfgVar.c))).m(new kli(20), andi.a));
    }
}
