package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dsg extends arrp implements arqv<cxn, drk, arnb> {
    public static final dsg a = new dsg();

    public dsg() {
        super(2);
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        int i;
        dsn a2 = dsa.a((cxn) obj);
        drk drkVar = drk.a;
        int ordinal = ((drk) obj2).ordinal();
        if (ordinal != 0) {
            i = 1;
            if (ordinal != 1) {
                throw new armm();
            }
        } else {
            i = 0;
        }
        a2.setLayoutDirection(i);
        return arnb.a;
    }
}
