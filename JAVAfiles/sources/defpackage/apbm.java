package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class apbm implements apbr {
    private final apbr[] a;

    public apbm(apbr... apbrVarArr) {
        this.a = apbrVarArr;
    }

    @Override // defpackage.apbr
    public final apbq a(Class cls) {
        for (int i = 0; i < 2; i++) {
            apbr apbrVar = this.a[i];
            if (apbrVar.b(cls)) {
                return apbrVar.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(cls.getName())));
    }

    @Override // defpackage.apbr
    public final boolean b(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.a[i].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
