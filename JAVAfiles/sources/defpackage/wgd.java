package defpackage;

import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wgd {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/rcsdata/PhoneNumberInputUIPresenter");
    public static final xze b = xze.g("Bugle", "PhoneNumberInputUIPresenter");
    public final xnv c;
    public final xyt d;
    public final anen e;
    public final anen f;
    public final ykw g;
    public final wwn h;
    public final armf i;
    public final armf j;
    public final ahiy m;
    public final ansy n;
    public final ansy o;
    public final ansy p;
    private final whj q;
    private final anen r;
    public final AtomicReference l = new AtomicReference(Optional.empty());
    public final AtomicBoolean k = new AtomicBoolean(false);

    public wgd(whj whjVar, ansy ansyVar, ansy ansyVar2, ansy ansyVar3, xnv xnvVar, xyt xytVar, anen anenVar, anen anenVar2, anen anenVar3, ykw ykwVar, ahiy ahiyVar, wwn wwnVar, armf armfVar, armf armfVar2) {
        this.q = whjVar;
        this.n = ansyVar;
        this.o = ansyVar2;
        this.p = ansyVar3;
        this.c = xnvVar;
        this.d = xytVar;
        this.r = anenVar;
        this.e = anenVar2;
        this.f = anenVar3;
        this.g = ykwVar;
        this.m = ahiyVar;
        this.h = wwnVar;
        this.i = armfVar;
        this.j = armfVar2;
    }

    public static int a(alog alogVar) {
        int co = albo.co(b(alogVar, new vmc(19)));
        b.l(String.format("countRepromptNumber: Counted %s already completed PhoneNumberInput reprompts.", String.valueOf(co)));
        return co;
    }

    public static long b(alog alogVar, Predicate predicate) {
        return Collection.EL.stream(alogVar).filter(predicate).count();
    }

    public static Optional e(alog alogVar, Predicate predicate) {
        return Collection.EL.stream(alogVar).filter(predicate).max(Comparator.CC.comparing(new wga(3), new lvh(14)));
    }

    public static Optional f(alog alogVar, Predicate predicate) {
        return e(alogVar, predicate).map(new wga(1));
    }

    public static Optional g(alog alogVar) {
        return f(alogVar, new vmc(19));
    }

    public final akul c(String str) {
        return this.q.e().h(new weh(str, 16), andi.a);
    }

    public final akul d(String str) {
        if (!this.k.get()) {
            return aktp.ag(Optional.empty());
        }
        return akul.g(this.e.submit(akto.k(new vze(this, str, 6)))).i(new vfj(this, str, 18, null), this.r).i(new vfj(this, str, 19, null), this.f);
    }
}
