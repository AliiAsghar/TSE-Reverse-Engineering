package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qvj extends agpx {
    @Override // defpackage.agpx
    public final /* synthetic */ agpw a() {
        return new agpw(this);
    }

    public final void b(qvn qvnVar) {
        Integer valueOf;
        int ordinal;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 59980) {
            agnc.t("address_type", intValue);
        }
        if (qvnVar == null) {
            ordinal = 0;
        } else {
            ordinal = qvnVar.ordinal();
        }
        U(new agoi("my_identities.address_type", 1, Integer.valueOf(ordinal)));
    }

    public final void c(Iterable iterable) {
        alob alobVar = new alob();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            alobVar.h(String.valueOf(riw.n((qwe) it.next())));
        }
        U(new agmf("my_identities.token", 3, X(alobVar.g()), false));
    }
}
