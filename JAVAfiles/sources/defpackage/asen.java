package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asen {
    public static final asfn a = new asfn("CLOSED");

    public static final Object a(aseo aseoVar, long j, arqv arqvVar) {
        while (true) {
            if (aseoVar.b >= j && !aseoVar.u()) {
                return aseoVar;
            }
            Object m = aseoVar.m();
            asfn asfnVar = a;
            if (m == asfnVar) {
                return asfnVar;
            }
            aseo aseoVar2 = (aseo) m;
            if (aseoVar2 == null) {
                aseoVar2 = (aseo) arqvVar.a(Long.valueOf(aseoVar.b + 1), aseoVar);
                if (aseoVar.a.d(null, aseoVar2)) {
                    if (aseoVar.u()) {
                        aseoVar.q();
                    }
                }
            }
            aseoVar = aseoVar2;
        }
    }
}
