package defpackage;

import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Optional;
import java.util.Comparator;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wft {
    public static final xze a = xze.g("Bugle", "GoogleTosUiPresenter");
    public static final Comparator b = Comparator.CC.comparing(new vvi(20), new lvh(13));
    public final whj c;
    public final xvu d;
    public final xvs e;
    public final anen f;
    public final anen g;
    public final xnv h;

    public wft(whj whjVar, xvu xvuVar, xvs xvsVar, anen anenVar, anen anenVar2, xnv xnvVar) {
        this.c = whjVar;
        this.d = xvuVar;
        this.e = xvsVar;
        this.f = anenVar;
        this.g = anenVar2;
        this.h = xnvVar;
    }

    public static long a(alog alogVar, Predicate predicate) {
        return Collection.EL.stream(alogVar).filter(predicate).count();
    }

    public static long b(alog alogVar, int i) {
        return a(alogVar, new vmc(12)) + i;
    }

    public static Optional d(alog alogVar) {
        return Collection.EL.stream(alogVar).filter(new vmc(14)).max(b).map(new vvi(19));
    }

    public static boolean e(wfq wfqVar) {
        int T;
        int aT = a.aT(wfqVar.c);
        if (aT != 0 && aT == 3 && (T = a.T(wfqVar.e)) != 0 && T == 6) {
            return true;
        }
        return false;
    }

    public final akul c() {
        xvu xvuVar = this.d;
        xvuVar.getClass();
        return aktp.ai(new vib(xvuVar, 19), this.f);
    }
}
