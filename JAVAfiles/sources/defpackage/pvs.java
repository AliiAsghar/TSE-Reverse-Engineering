package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public class pvs extends algf {
    @Override // defpackage.algf
    protected final /* synthetic */ Object a(Object obj) {
        qej qejVar = (qej) obj;
        ajur ajurVar = new ajur(null);
        if ((qejVar.b & 1) != 0) {
            algf algfVar = pwa.a;
            qel qelVar = qejVar.c;
            if (qelVar == null) {
                qelVar = qel.a;
            }
            ajurVar.g((ContentType) algfVar.fu(qelVar));
        }
        if ((qejVar.b & 2) != 0) {
            ajurVar.f(qejVar.d);
        }
        return ajurVar.e();
    }

    @Override // defpackage.algf
    protected final /* synthetic */ Object b(Object obj) {
        ajrt ajrtVar = (ajrt) obj;
        aozy createBuilder = qej.a.createBuilder();
        aozb aozbVar = ajrtVar.a;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qej qejVar = (qej) createBuilder.b;
        aozbVar.getClass();
        qejVar.b |= 2;
        qejVar.d = aozbVar;
        qel qelVar = (qel) pwa.a.m().fu(ajrtVar.b);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qej qejVar2 = (qej) createBuilder.b;
        qelVar.getClass();
        qejVar2.c = qelVar;
        qejVar2.b |= 1;
        return (qej) createBuilder.s();
    }
}
