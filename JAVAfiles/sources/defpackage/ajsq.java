package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;
import j$.util.Collection;
import j$.util.stream.Collectors;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajsq extends algf {
    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        ContentType contentType = (ContentType) obj;
        aozy createBuilder = wbi.a.createBuilder();
        String c = contentType.c();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        wbi wbiVar = (wbi) apagVar;
        c.getClass();
        wbiVar.b |= 1;
        wbiVar.c = c;
        String b = contentType.b();
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        wbi wbiVar2 = (wbi) createBuilder.b;
        b.getClass();
        wbiVar2.b |= 2;
        wbiVar2.d = b;
        createBuilder.X((Iterable) Collection.EL.stream(contentType.a().entrySet()).map(new ajqy(2)).collect(Collectors.toList()));
        return (wbi) createBuilder.s();
    }

    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        wbi wbiVar = (wbi) obj;
        aoad g = ContentType.g();
        if ((wbiVar.b & 1) != 0) {
            g.C(wbiVar.c);
        }
        if ((wbiVar.b & 2) != 0) {
            g.B(wbiVar.d);
        }
        g.A(alor.i((Iterable) Collection.EL.stream(wbiVar.e).map(new ajqy(3)).collect(Collectors.toList())));
        return g.y();
    }
}
