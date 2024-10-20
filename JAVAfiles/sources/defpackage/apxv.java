package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apxv implements apya, apwt {
    private static final Object a = new Object();
    private volatile apya b;
    private volatile Object c = a;

    private apxv(apya apyaVar) {
        this.b = apyaVar;
    }

    public static apwt a(apya apyaVar) {
        if (apyaVar instanceof apwt) {
            return (apwt) apyaVar;
        }
        apyaVar.getClass();
        return new apxv(apyaVar);
    }

    public static apya c(apya apyaVar) {
        apyaVar.getClass();
        if (apyaVar instanceof apxv) {
            return apyaVar;
        }
        return new apxv(apyaVar);
    }

    private final synchronized Object d() {
        Object obj = this.c;
        Object obj2 = a;
        if (obj == obj2) {
            Object b = this.b.b();
            Object obj3 = this.c;
            if (obj3 != obj2 && obj3 != b) {
                throw new IllegalStateException(a.ce(b, obj3, "Scoped provider was invoked recursively returning different results: ", " & ", ". This is likely due to a circular dependency."));
            }
            this.c = b;
            this.b = null;
            return b;
        }
        return obj;
    }

    @Override // defpackage.armf, defpackage.arme
    public final Object b() {
        Object obj = this.c;
        if (obj == a) {
            return d();
        }
        return obj;
    }
}
