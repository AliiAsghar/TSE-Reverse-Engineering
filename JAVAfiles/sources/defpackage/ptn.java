package defpackage;

import j$.util.Collection;
import java.util.AbstractMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ptn {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/chatapi/capabilities/cache/database/RcsCapabilitiesDatabaseOperations");
    public final agnq b;

    public ptn(agnq agnqVar) {
        this.b = agnqVar;
    }

    public static ptp a(Map.Entry entry) {
        tmc d = pty.d();
        d.o(((qei) entry.getKey()).d);
        d.p(((pto) entry.getValue()).a());
        d.n(((pto) entry.getValue()).b());
        return d.m();
    }

    public static alor b(Iterable iterable) {
        final alor alorVar = (alor) alzz.C(iterable).collect(alls.a(new prj(12), new prj(13)));
        ptv ptvVar = new ptv(pty.a);
        ptvVar.w("getRcsCapabilities");
        ptvVar.c(new ptm(alorVar, 1));
        return (alor) Collection.EL.stream(((ptr) ptvVar.b().n()).cS(new agmo() { // from class: ptl
            @Override // defpackage.agmo
            public final Object a(Object obj) {
                ptp ptpVar = (ptp) obj;
                pvm pvmVar = new pvm();
                pvmVar.i(ptpVar.d());
                pvmVar.h(ptpVar.e());
                pto g = pvmVar.g();
                qei qeiVar = (qei) alorVar.get(ptpVar.h());
                qeiVar.getClass();
                return new AbstractMap.SimpleImmutableEntry(qeiVar, g);
            }
        })).collect(alor.t());
    }
}
