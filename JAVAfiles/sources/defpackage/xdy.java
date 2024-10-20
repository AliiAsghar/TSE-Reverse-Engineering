package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class xdy extends algf {
    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aqfn aqfnVar = (aqfn) obj;
        aozy createBuilder = qei.a.createBuilder();
        c(aqfnVar, createBuilder);
        String str = aqfnVar.c;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qei qeiVar = (qei) createBuilder.b;
        str.getClass();
        qeiVar.b |= 2;
        qeiVar.d = str;
        return (qei) createBuilder.s();
    }

    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        qei qeiVar = (qei) obj;
        aozy e = e();
        if ((qeiVar.b & 1) != 0) {
            d(qeiVar, e);
        }
        if ((qeiVar.b & 2) != 0) {
            String str = qeiVar.d;
            if (!e.b.isMutable()) {
                e.u();
            }
            aqfn aqfnVar = (aqfn) e.b;
            aqfn aqfnVar2 = aqfn.a;
            str.getClass();
            aqfnVar.c = str;
        }
        return (aqfn) e.s();
    }

    public abstract void c(aqfn aqfnVar, aozy aozyVar);

    public abstract void d(qei qeiVar, aozy aozyVar);

    public aozy e() {
        throw null;
    }
}
