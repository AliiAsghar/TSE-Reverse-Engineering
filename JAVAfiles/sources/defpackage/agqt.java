package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agqt implements aqrv {
    public static volatile agqt a;
    private static final agqs b = new agqs();
    private final arll c;

    public agqt(arll arllVar) {
        arllVar.getClass();
        this.c = arllVar;
    }

    @Override // defpackage.aqrv
    public final aqru a(aqux aquxVar, aqrr aqrrVar, aqrs aqrsVar) {
        ArrayList arrayList;
        agqs agqsVar = b;
        Collection collection = (Collection) aqrrVar.f(aqyz.c);
        if (collection == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(collection);
        }
        arll arllVar = this.c;
        arrayList.add(agqsVar);
        return arllVar.a(aquxVar, aqrrVar.e(aqyz.c, DesugarCollections.unmodifiableList(arrayList)), aqrsVar);
    }
}
