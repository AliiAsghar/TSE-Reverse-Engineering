package defpackage;

import j$.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rtk {
    public static final smv[] a = {sni.c.M, sni.c.O};
    public static final syb b;

    static {
        Integer valueOf;
        syc sycVar = new syc();
        sycVar.w(3);
        sycVar.b(new rsb(11), new rsb(12), new rsb(13), new rsb(14));
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 37030) {
            agnc.t("report_attempt_acounter", intValue);
        }
        sycVar.U(new agoi("messages.report_attempt_acounter", 10, 10L));
        b = new syb(sycVar);
    }

    public static void a(Set set, sxy sxyVar) {
        alpt alptVar = (alpt) Collection.EL.stream(set).map(new rsb(15)).collect(alls.b);
        syc sycVar = new syc();
        sycVar.b(new rsc(alptVar, 6), new rsc(alptVar, 7));
        sxyVar.k(new syb(sycVar));
    }
}
