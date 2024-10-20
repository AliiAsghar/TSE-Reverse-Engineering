package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alqn extends alkg {
    final /* synthetic */ Iterator a;
    final /* synthetic */ algy b;

    public alqn(Iterator it, algy algyVar) {
        this.a = it;
        this.b = algyVar;
    }

    @Override // defpackage.alkg
    protected final Object a() {
        while (this.a.hasNext()) {
            Iterator it = this.a;
            algy algyVar = this.b;
            Object next = it.next();
            if (algyVar.a(next)) {
                return next;
            }
        }
        b();
        return null;
    }
}
