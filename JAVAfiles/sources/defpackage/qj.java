package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qj implements ql {
    final ni a;
    final /* synthetic */ qk b;

    public qj(qk qkVar, ni niVar) {
        this.b = qkVar;
        this.a = niVar;
    }

    @Override // defpackage.ql
    public final int b(int i) {
        List list = (List) this.b.a.get(i);
        if (list == null) {
            list = new ArrayList();
            this.b.a.put(i, list);
        }
        if (!list.contains(this.a)) {
            list.add(this.a);
        }
        return i;
    }

    @Override // defpackage.ql
    public final int a(int i) {
        return i;
    }
}
