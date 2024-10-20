package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afw {
    public static final cga a(cga cgaVar, aig aigVar, ahp ahpVar, boolean z, boolean z2, ahl ahlVar, ajr ajrVar, agq agqVar, afl aflVar) {
        cga cgaVar2;
        cga c;
        cga cgaVar3 = aed.a;
        if (ahpVar == ahp.a) {
            cgaVar2 = aed.b;
        } else {
            cgaVar2 = aed.a;
        }
        cga a = cgaVar.a(cgaVar2);
        if (aflVar == null) {
            c = cga.e;
        } else {
            c = aflVar.c();
        }
        return ahy.a(a.a(c), aigVar, ahpVar, aflVar, z, z2, ahlVar, ajrVar, agqVar);
    }

    public static /* synthetic */ cga b(cga cgaVar, aig aigVar, ahp ahpVar, boolean z, boolean z2, ahl ahlVar, ajr ajrVar, afl aflVar) {
        return a(cgaVar, aigVar, ahpVar, z, z2, ahlVar, ajrVar, null, aflVar);
    }
}
