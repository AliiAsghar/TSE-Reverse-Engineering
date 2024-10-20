package defpackage;

import com.google.android.rcs.client.messaging.data.TraceId;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajtc extends algf {
    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aozy createBuilder = wdu.a.createBuilder();
        String a = ((TraceId) obj).a();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wdu wduVar = (wdu) createBuilder.b;
        wduVar.b |= 1;
        wduVar.c = a;
        return (wdu) createBuilder.s();
    }

    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        wdu wduVar = (wdu) obj;
        aodz b = TraceId.b();
        if ((wduVar.b & 1) != 0) {
            b.m(wduVar.c);
        }
        return b.l();
    }
}
