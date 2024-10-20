package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vew implements vfc {
    public static final vdd a = vdd.a("Bugle.PhoneRegisterRefreshRpc.Response");
    public static final alwo b = alwo.o("BugleNetwork");
    public final armf c;
    public final anen d;
    public final wpp e;
    private final msk f;
    private final armf g;
    private final nib h;
    private final long i;
    private final Optional j;
    private final Callable k;
    private final Supplier l;
    private final vgm m;
    private final armf n;
    private String o = "";
    private long p = 0;
    private final wyp q;
    private final wpp r;

    public vew(wpp wppVar, wyp wypVar, wpp wppVar2, msk mskVar, armf armfVar, nib nibVar, armf armfVar2, armf armfVar3, anen anenVar, long j, Optional optional, Callable callable, Supplier supplier, vgm vgmVar) {
        this.g = armfVar;
        this.r = wppVar;
        this.q = wypVar;
        this.f = mskVar;
        this.h = nibVar;
        this.c = armfVar2;
        this.d = anenVar;
        this.n = armfVar3;
        this.i = j;
        this.j = optional;
        this.k = callable;
        this.l = supplier;
        this.m = vgmVar;
        this.e = wppVar2;
    }

    public static ved k(aqep aqepVar) {
        if (!aqepVar.k.contains(Integer.valueOf(vbe.ETOUFFEE.g))) {
            aqhz aqhzVar = aqepVar.l;
            if (aqhzVar == null) {
                aqhzVar = aqhz.a;
            }
            if (!aqhzVar.b.contains(Integer.valueOf(vbe.ETOUFFEE.g))) {
                return ved.REGISTERED_WITHOUT_PREKEYS;
            }
        }
        return ved.REGISTERED_WITH_PREKEYS;
    }

    public static akul m(vel velVar, ved vedVar, aqep aqepVar) {
        ved vedVar2;
        ved k = k(aqepVar);
        if (k == ved.REGISTERED_WITHOUT_PREKEYS && vedVar == (vedVar2 = ved.REGISTERED_WITH_PREKEYS)) {
            k = vedVar2;
        }
        return velVar.j(k, q(aqepVar), o(aqepVar), p(aqepVar));
    }

    public static Optional o(aqep aqepVar) {
        if ((aqepVar.b & 16) != 0) {
            aqfj aqfjVar = aqepVar.m;
            if (aqfjVar == null) {
                aqfjVar = aqfj.a;
            }
            return Optional.of(aqfjVar);
        }
        return Optional.empty();
    }

    public static Optional p(aqep aqepVar) {
        if ((aqepVar.b & 8) != 0) {
            aqhz aqhzVar = aqepVar.l;
            if (aqhzVar == null) {
                aqhzVar = aqhz.a;
            }
            return Optional.of(aqhzVar);
        }
        return Optional.empty();
    }

    public static Optional q(aqep aqepVar) {
        if ((aqepVar.b & 128) != 0) {
            aqfk aqfkVar = aqepVar.n;
            if (aqfkVar == null) {
                aqfkVar = aqfk.b;
            }
            return Optional.of(aqfkVar);
        }
        return Optional.empty();
    }

    private final String r() {
        vev vevVar = (vev) this.n.b();
        String str = this.m.a;
        vevVar.a(str, 2);
        return str;
    }

    @Override // defpackage.vgq
    public final long a() {
        return this.p;
    }

    @Override // defpackage.vgq
    public final vgp b() {
        return this.m;
    }

    @Override // defpackage.vgq
    public final ListenableFuture c(aqgb aqgbVar) {
        this.o = aqgbVar.c;
        vfb N = this.r.N(this.i, this.j, this.k, this.l);
        msh r = this.f.r(r());
        vfl a2 = N.a();
        a2.i();
        a2.h();
        a2.g(r, 2);
        a2.e(r);
        a2.f(r);
        return N.b(aqgbVar, a2);
    }

    @Override // defpackage.vgq
    public final /* bridge */ /* synthetic */ ListenableFuture d(veo veoVar, apbt apbtVar) {
        aqeq aqeqVar = (aqeq) apbtVar;
        vel D = this.q.D(r());
        aqep aqepVar = aqeqVar.h;
        if (aqepVar == null) {
            aqepVar = aqep.a;
        }
        aqep aqepVar2 = aqepVar;
        if (this.h.a()) {
            return D.b().i(new qcf(this, veoVar, aqeqVar, D, aqepVar2, 8), this.d);
        }
        return D.e().i(new vfj(D, aqepVar2, 1, null), andi.a).i(new ukk((Object) this, (Object) veoVar, (Object) aqeqVar, 10, (byte[]) null), andi.a);
    }

    @Override // defpackage.vgq
    public final /* bridge */ /* synthetic */ ListenableFuture e(apbt apbtVar) {
        long j;
        aqer aqerVar = (aqer) apbtVar;
        if (aqerVar != null) {
            aqgc aqgcVar = aqerVar.c;
            if (aqgcVar == null) {
                aqgcVar = aqgc.a;
            }
            j = aqgcVar.b;
        } else {
            j = 0;
        }
        this.p = j;
        return albo.bI(aqerVar);
    }

    @Override // defpackage.vgq
    public final String f() {
        return "PhoneRegisterRefreshRpcHandler";
    }

    @Override // defpackage.vgq
    public final String g() {
        return this.o;
    }

    @Override // defpackage.vgq
    public final /* synthetic */ void h(Throwable th) {
        vht.c(this);
    }

    @Override // defpackage.vgq
    public final /* synthetic */ void i() {
        vht.a(this);
    }

    @Override // defpackage.vgq
    public final /* synthetic */ void j() {
        vht.b(this);
    }

    public final akul l(veo veoVar, aqeq aqeqVar) {
        aqfn n = n();
        return this.e.Q(a, akul.g(veoVar.b(n).a().b(aqeqVar)));
    }

    public final aqfn n() {
        return yyb.cI(((psq) this.g.b()).c(r()));
    }
}
