package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class algq extends algs {
    final /* synthetic */ algs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public algq(algs algsVar, algs algsVar2) {
        super(algsVar2);
        this.a = algsVar;
    }

    @Override // defpackage.algs
    public final void b(Appendable appendable, Iterator it) {
        it.getClass();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next != null) {
                appendable.append(this.a.a(next));
                break;
            }
        }
        while (it.hasNext()) {
            Object next2 = it.next();
            if (next2 != null) {
                appendable.append(this.a.c);
                appendable.append(this.a.a(next2));
            }
        }
    }
}
