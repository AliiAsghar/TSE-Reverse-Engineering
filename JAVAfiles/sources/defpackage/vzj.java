package defpackage;

import com.google.android.rcs.client.messaging.data.TraceId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vzj extends algf {
    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aozy createBuilder = qgr.a.createBuilder();
        String a = ((TraceId) obj).a();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qgr qgrVar = (qgr) createBuilder.b;
        qgrVar.b |= 1;
        qgrVar.c = a;
        return (qgr) createBuilder.s();
    }

    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        qgr qgrVar = (qgr) obj;
        aodz b = TraceId.b();
        if ((qgrVar.b & 1) != 0) {
            b.m(qgrVar.c);
        }
        return b.l();
    }
}
