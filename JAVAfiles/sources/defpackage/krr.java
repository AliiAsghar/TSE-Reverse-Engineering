package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class krr implements wep {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public krr(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.wep
    public final /* synthetic */ wes a(nfw nfwVar) {
        if (this.b != 0) {
            krg krgVar = (krg) this.a;
            return new wes(krgVar.b.F, (anen) krgVar.a.z.b(), nfwVar);
        }
        krv krvVar = ((kru) this.a).a;
        return new wes(krvVar.iD, (anen) krvVar.z.b(), nfwVar);
    }
}
