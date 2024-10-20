package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class krq implements vdk {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public krq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.vdk
    public final /* synthetic */ vco a() {
        if (this.b != 0) {
            krg krgVar = (krg) this.a;
            return new vco(krgVar.b.jC(), (arpi) krgVar.a.bP.b());
        }
        krv krvVar = ((kru) this.a).a;
        return new vco(krvVar.PG(), (arpi) krvVar.bP.b());
    }
}
