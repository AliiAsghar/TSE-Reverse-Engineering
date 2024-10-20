package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ady extends arrp implements arqr<czp, Boolean> {
    final /* synthetic */ arrx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ady(arrx arrxVar) {
        super(1);
        this.a = arrxVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        boolean z;
        czp czpVar = (czp) obj;
        arrx arrxVar = this.a;
        if (!arrxVar.a) {
            czpVar.getClass();
            if (!((ahw) czpVar).b) {
                z = false;
                arrxVar.a = z;
                return Boolean.valueOf(!z);
            }
        }
        z = true;
        arrxVar.a = z;
        return Boolean.valueOf(!z);
    }
}
