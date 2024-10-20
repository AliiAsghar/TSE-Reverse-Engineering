package defpackage;

import j$.util.Optional;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xhq implements uvn {
    private static final xze a = xze.g("Bugle", "LastWipeoutService");
    private final wul b;
    private final anen c;
    private final xnv d;

    public xhq(wul wulVar, anen anenVar, xnv xnvVar) {
        this.b = wulVar;
        this.c = anenVar;
        this.d = xnvVar;
    }

    public final xhp a() {
        try {
            return (xhp) this.b.l();
        } catch (apba e) {
            xyo b = a.b();
            b.H("Couldn't load LastWipeout from store");
            b.r(e);
            return xhp.a;
        }
    }

    @Override // defpackage.uvn
    public final /* synthetic */ akul b() {
        return uvl.b();
    }

    @Override // defpackage.uvn
    public final /* synthetic */ akul c() {
        return uvl.c();
    }

    @Override // defpackage.uvn
    public final akul d() {
        int i = 4;
        return this.b.h().i(new xfn(this, i), this.c).h(new xgu(i), this.c);
    }

    public final String e(apct apctVar) {
        if (apctVar != null && apctVar.b != 0) {
            long days = TimeUnit.SECONDS.toDays(this.d.f().getEpochSecond() - apctVar.b);
            if (days >= 0 && days < 3) {
                return Long.toString(days);
            }
            if (days >= 3 && days < 8) {
                return "3_TO_7";
            }
            if (days >= 7) {
                return "MORE_THAN_SEVEN";
            }
            return "NEVER";
        }
        return "NEVER";
    }

    public final void f(apct apctVar) {
        g(Optional.empty(), Optional.of(apctVar));
    }

    public final void g(Optional optional, Optional optional2) {
        Object obj;
        Object obj2;
        aozy createBuilder = xhp.a.createBuilder();
        xhp a2 = a();
        if (optional.isPresent()) {
            obj = optional.get();
        } else {
            obj = a2.c;
            if (obj == null) {
                obj = apct.a;
            }
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        xhp xhpVar = (xhp) createBuilder.b;
        obj.getClass();
        xhpVar.c = (apct) obj;
        xhpVar.b |= 1;
        if (optional2.isPresent()) {
            obj2 = optional2.get();
        } else {
            obj2 = a2.d;
            if (obj2 == null) {
                obj2 = apct.a;
            }
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        xhp xhpVar2 = (xhp) createBuilder.b;
        obj2.getClass();
        xhpVar2.d = (apct) obj2;
        xhpVar2.b |= 2;
    }
}
