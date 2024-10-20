package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acrf implements qvr {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public acrf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.qvr
    public final uac a(qvo qvoVar) {
        if (this.b != 0) {
            return new uac(qvoVar, (yjy) ((kru) this.a).a.aF.b());
        }
        return new uac(qvoVar, (yjy) ((acrg) this.a).a.f.b());
    }
}
