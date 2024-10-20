package defpackage;

import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.stream.Stream;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vzp extends algf {
    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        wbi wbiVar = (wbi) obj;
        aozy createBuilder = qel.a.createBuilder();
        if ((wbiVar.b & 1) != 0) {
            String str = wbiVar.c;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qel qelVar = (qel) createBuilder.b;
            str.getClass();
            qelVar.b |= 1;
            qelVar.c = str;
        }
        if ((wbiVar.b & 2) != 0) {
            String str2 = wbiVar.d;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qel qelVar2 = (qel) createBuilder.b;
            str2.getClass();
            qelVar2.b |= 2;
            qelVar2.d = str2;
        }
        createBuilder.A((Map) Collection.EL.stream(wbiVar.e).collect(alls.a(new vvi(10), new vvi(11))));
        return (qel) createBuilder.s();
    }

    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        qel qelVar = (qel) obj;
        aozy createBuilder = wbi.a.createBuilder();
        if ((qelVar.b & 1) != 0) {
            String str = qelVar.c;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wbi wbiVar = (wbi) createBuilder.b;
            str.getClass();
            wbiVar.b |= 1;
            wbiVar.c = str;
        }
        if ((qelVar.b & 2) != 0) {
            String str2 = qelVar.d;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wbi wbiVar2 = (wbi) createBuilder.b;
            str2.getClass();
            wbiVar2.b |= 2;
            wbiVar2.d = str2;
        }
        Stream map = Collection.EL.stream(DesugarCollections.unmodifiableMap(qelVar.e).entrySet()).map(new vvi(12));
        int i = alog.d;
        createBuilder.X((Iterable) map.collect(alls.a));
        return (wbi) createBuilder.s();
    }
}
