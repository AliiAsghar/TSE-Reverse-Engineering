package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajxa implements ahcd {
    public final Object a;
    public final Object b;
    private final /* synthetic */ int c;

    public ajxa(ahiy ahiyVar, Executor executor, int i) {
        this.c = i;
        this.a = ahiyVar;
        this.b = executor;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.ahcd
    public final ListenableFuture a(ahci ahciVar) {
        apae checkIsLite;
        Object c;
        if (this.c != 0) {
            return albo.bN(akto.c(new xpx(this, ahciVar, 9)), this.a);
        }
        if (ahciVar instanceof ahcb) {
            return ((ahcb) ahciVar).a();
        }
        if (ahciVar instanceof ahdu) {
            ahcw a = ((ahdu) ahciVar).a();
            checkIsLite = apag.checkIsLite(ajww.a);
            a.b(checkIsLite);
            Object l = a.l.l(checkIsLite.d);
            if (l == null) {
                c = checkIsLite.b;
            } else {
                c = checkIsLite.c(l);
            }
            ajwv ajwvVar = (ajwv) c;
            if (ajwvVar.d) {
                return albo.bI(new ahcc(3, null));
            }
            if ((ajwvVar.b & 1) != 0) {
                return ancj.f(ancd.f(anee.o(((ahiy) this.a).C(ajwt.a(ajwvVar.c))), Exception.class, new ajwz(0), this.b), akto.a(new ajwz(2)), this.b);
            }
        }
        return albo.bI(null);
    }

    public ajxa(anen anenVar, Set set, int i) {
        this.c = i;
        this.a = anenVar;
        this.b = set;
    }
}
