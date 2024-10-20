package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apye implements apya {
    private static final Object a = new Object();
    private volatile apya b;
    private volatile Object c = a;

    private apye(apya apyaVar) {
        this.b = apyaVar;
    }

    public static apya a(apya apyaVar) {
        if (!(apyaVar instanceof apye) && !(apyaVar instanceof apxv)) {
            apyaVar.getClass();
            return new apye(apyaVar);
        }
        return apyaVar;
    }

    @Override // defpackage.armf, defpackage.arme
    public final Object b() {
        Object obj = this.c;
        if (obj == a) {
            apya apyaVar = this.b;
            if (apyaVar == null) {
                return this.c;
            }
            Object b = apyaVar.b();
            this.c = b;
            this.b = null;
            return b;
        }
        return obj;
    }
}
