package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class krp implements qsp {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public krp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.qsp
    public final lgg a(qso qsoVar) {
        if (this.b != 0) {
            krg krgVar = (krg) this.a;
            kqp kqpVar = krgVar.b;
            krv krvVar = krgVar.a;
            return new lgg(qsoVar, krvVar.cF, kqpVar.V, krvVar.bs(), (arwe) krvVar.dO.b());
        }
        krv krvVar2 = ((kru) this.a).a;
        return new lgg(qsoVar, krvVar2.cF, krvVar2.wC, krvVar2.bs(), (arwe) krvVar2.dO.b());
    }
}
