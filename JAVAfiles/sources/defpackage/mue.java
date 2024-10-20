package defpackage;

import j$.util.Collection;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mue implements mjf {
    public final Object a = new Object();
    public final ArrayList b = new ArrayList();
    final /* synthetic */ mui c;

    public mue(mui muiVar) {
        this.c = muiVar;
    }

    @Override // defpackage.yfv
    public final /* bridge */ /* synthetic */ akul a(Object obj) {
        alog n;
        mzi mziVar = (mzi) obj;
        synchronized (this.a) {
            n = alog.n(this.b);
        }
        alog alogVar = (alog) Collection.EL.stream(n).map(new mtl(mziVar, 7)).collect(alls.a);
        if (!alogVar.isEmpty()) {
            qiu.h(aktp.aj(new ikm(alogVar, 5), this.c.b));
        }
        return aktp.ag(null);
    }

    @Override // defpackage.mjf
    public final akul b() {
        alog n;
        synchronized (this.a) {
            n = alog.n(this.b);
        }
        alog alogVar = (alog) Collection.EL.stream(n).map(new mtm(8)).collect(alls.a);
        if (!alogVar.isEmpty()) {
            qiu.h(aktp.aj(new ikm(alogVar, 6), this.c.b));
        }
        return aktp.ag(null);
    }
}
