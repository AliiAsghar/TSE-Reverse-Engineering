package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class pvt extends algf {
    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        ContentType contentType = (ContentType) obj;
        aozy createBuilder = qel.a.createBuilder();
        String c = contentType.c();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        qel qelVar = (qel) apagVar;
        c.getClass();
        qelVar.b |= 1;
        qelVar.c = c;
        String b = contentType.b();
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        qel qelVar2 = (qel) createBuilder.b;
        b.getClass();
        qelVar2.b |= 2;
        qelVar2.d = b;
        c(contentType, createBuilder);
        return (qel) createBuilder.s();
    }

    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        qel qelVar = (qel) obj;
        aoad g = ContentType.g();
        if ((qelVar.b & 1) != 0) {
            g.C(qelVar.c);
        }
        if ((qelVar.b & 2) != 0) {
            g.B(qelVar.d);
        }
        d(qelVar, g);
        return g.y();
    }

    public void c(ContentType contentType, aozy aozyVar) {
        throw null;
    }

    public abstract void d(qel qelVar, aoad aoadVar);
}
