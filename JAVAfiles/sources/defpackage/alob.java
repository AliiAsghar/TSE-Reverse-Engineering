package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alob extends alns {
    public alob() {
        super(4);
    }

    @Override // defpackage.alns, defpackage.alnt
    public final /* synthetic */ void c(Object obj) {
        super.b(obj);
    }

    public final alog g() {
        this.c = true;
        return alog.i(this.a, this.b);
    }

    public final void h(Object obj) {
        super.b(obj);
    }

    public final void i(Object... objArr) {
        super.d(objArr);
    }

    public final void j(Iterable iterable) {
        super.e(iterable);
    }

    public final void k(Iterator it) {
        while (it.hasNext()) {
            super.b(it.next());
        }
    }

    public alob(int i) {
        super(i);
    }
}
