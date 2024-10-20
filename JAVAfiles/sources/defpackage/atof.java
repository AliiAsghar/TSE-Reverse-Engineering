package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class atof {
    public List a;
    public List b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.lang.Object] */
    public final void a(atmx atmxVar) {
        List list;
        List list2 = this.b;
        if (list2 != null) {
            atog atogVar = (atog) list2.get(list2.size() - 1);
            if (atogVar.b.size() > 0) {
                list = atogVar.b;
            } else {
                list = atogVar.c;
            }
        } else {
            list = this.a;
        }
        list.add(atmxVar);
    }
}
