package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahfb implements ahdy {
    private final ahdy a = new ahfa(0);
    private final ahdy b;
    private final Map c;

    public ahfb(ahdy ahdyVar, Map map) {
        this.b = ahdyVar;
        this.c = map;
    }

    private final ahdy i(ahci ahciVar) {
        apae checkIsLite;
        apae checkIsLite2;
        Object c;
        if (ahciVar instanceof ahdu) {
            ahdu ahduVar = (ahdu) ahciVar;
            ahcw a = ahduVar.a();
            checkIsLite = apag.checkIsLite(ahfd.a);
            a.b(checkIsLite);
            if (a.l.o(checkIsLite.d)) {
                ahcw a2 = ahduVar.a();
                checkIsLite2 = apag.checkIsLite(ahfd.a);
                a2.b(checkIsLite2);
                Object l = a2.l.l(checkIsLite2.d);
                if (l == null) {
                    c = checkIsLite2.b;
                } else {
                    c = checkIsLite2.c(l);
                }
                ahdy ahdyVar = (ahdy) this.c.get(((ahfc) c).b);
                ahdyVar.getClass();
                return ahdyVar;
            }
            return this.b;
        }
        return this.a;
    }

    @Override // defpackage.ahdy
    public final algw a(ahci ahciVar) {
        return i(ahciVar).a(ahciVar);
    }

    @Override // defpackage.ahdy
    public final algw b(ahci ahciVar) {
        return i(ahciVar).b(ahciVar);
    }

    @Override // defpackage.ahdy
    public final algw c(ahci ahciVar) {
        return i(ahciVar).c(ahciVar);
    }

    @Override // defpackage.ahdy
    public final ListenableFuture d(ahci ahciVar, ListenableFuture listenableFuture) {
        return i(ahciVar).d(ahciVar, listenableFuture);
    }

    @Override // defpackage.ahdy
    public final ListenableFuture e(ahci ahciVar, ListenableFuture listenableFuture) {
        return i(ahciVar).e(ahciVar, listenableFuture);
    }

    @Override // defpackage.ahdy
    public final apwa f(ahci ahciVar) {
        return i(ahciVar).f(ahciVar);
    }

    @Override // defpackage.ahdy
    public final String g(ahci ahciVar) {
        return i(ahciVar).g(ahciVar);
    }

    @Override // defpackage.ahdy
    public final ListenableFuture h() {
        return albo.bI(null);
    }
}
