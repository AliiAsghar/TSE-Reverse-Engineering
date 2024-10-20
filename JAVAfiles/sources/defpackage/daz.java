package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class daz extends arrp implements arqr<cxn, Boolean> {
    public static final daz a = new daz();

    public daz() {
        super(1);
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        dgy z = ((cxn) obj).z();
        boolean z2 = false;
        if (z != null && z.a) {
            dhn dhnVar = dhh.a;
            if (z.d(dhh.A)) {
                z2 = true;
            }
        }
        return Boolean.valueOf(z2);
    }
}
