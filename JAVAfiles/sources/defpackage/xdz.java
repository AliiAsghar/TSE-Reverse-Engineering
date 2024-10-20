package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class xdz implements algk {
    @Override // defpackage.algk
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final qeg apply(anit anitVar) {
        aozy createBuilder = qeg.a.createBuilder();
        b(anitVar, createBuilder);
        Object apply = xel.a.apply(anitVar.b);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qeg qegVar = (qeg) createBuilder.b;
        qegVar.d = ((qee) apply).p;
        qegVar.b |= 2;
        Object apply2 = xel.b.apply(anitVar.c);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qeg qegVar2 = (qeg) createBuilder.b;
        qegVar2.e = ((qfu) apply2).g;
        qegVar2.b |= 4;
        return (qeg) createBuilder.s();
    }

    public abstract void b(anit anitVar, aozy aozyVar);
}
