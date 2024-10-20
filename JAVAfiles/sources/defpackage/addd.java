package defpackage;

import com.google.android.rcs.client.messaging.data.TraceId;

/* compiled from: PG */
/* loaded from: classes.dex */
class addd extends algf {
    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aodz b = TraceId.b();
        b.m(((atok) obj).b);
        return b.l();
    }

    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        aozy createBuilder = atok.a.createBuilder();
        String a = ((TraceId) obj).a();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((atok) createBuilder.b).b = a;
        return (atok) createBuilder.s();
    }
}
