package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public class xdw extends algf {
    @Override // defpackage.algf
    protected final /* synthetic */ Object a(Object obj) {
        anja anjaVar = (anja) obj;
        aozy createBuilder = qej.a.createBuilder();
        aozb aozbVar = anjaVar.a;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qej qejVar = (qej) createBuilder.b;
        aozbVar.getClass();
        qejVar.b |= 2;
        qejVar.d = aozbVar;
        qel qelVar = (qel) xeb.a.m().fu(anjaVar.b);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qej qejVar2 = (qej) createBuilder.b;
        qelVar.getClass();
        qejVar2.c = qelVar;
        qejVar2.b |= 1;
        return (qej) createBuilder.s();
    }

    @Override // defpackage.algf
    protected final /* synthetic */ Object b(Object obj) {
        qej qejVar = (qej) obj;
        aqrk aqrkVar = new aqrk((byte[]) null);
        if ((qejVar.b & 1) != 0) {
            algf algfVar = xeb.a;
            qel qelVar = qejVar.c;
            if (qelVar == null) {
                qelVar = qel.a;
            }
            aqrkVar.m((anip) algfVar.fu(qelVar));
        }
        if ((qejVar.b & 2) != 0) {
            aqrkVar.l(qejVar.d);
        }
        return aqrkVar.k();
    }
}
