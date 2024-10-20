package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class altr extends alkg {
    final /* synthetic */ Iterator a;
    final /* synthetic */ Set b;
    final /* synthetic */ Iterator c;
    final /* synthetic */ Set d;

    public altr(Iterator it, Set set, Iterator it2, Set set2) {
        this.a = it;
        this.b = set;
        this.c = it2;
        this.d = set2;
    }

    @Override // defpackage.alkg
    public final Object a() {
        while (this.a.hasNext()) {
            Iterator it = this.a;
            Set set = this.b;
            Object next = it.next();
            if (!set.contains(next)) {
                return next;
            }
        }
        while (this.c.hasNext()) {
            Iterator it2 = this.c;
            Set set2 = this.d;
            Object next2 = it2.next();
            if (!set2.contains(next2)) {
                return next2;
            }
        }
        b();
        return null;
    }
}
