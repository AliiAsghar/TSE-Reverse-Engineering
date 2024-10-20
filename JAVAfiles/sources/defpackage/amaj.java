package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class amaj extends alkg {
    public final amaf a;
    public final Iterator b;
    Object c = null;
    Iterator d = altg.a.listIterator();

    public amaj(amaf amafVar) {
        this.a = amafVar;
        this.b = amafVar.d().iterator();
    }

    @Override // defpackage.alkg
    protected final /* synthetic */ Object a() {
        while (!this.d.hasNext()) {
            albo.T(!this.d.hasNext());
            if (!this.b.hasNext()) {
                b();
                return null;
            }
            Object next = this.b.next();
            this.c = next;
            this.d = this.a.e(next).iterator();
        }
        Object obj = this.c;
        obj.getClass();
        return new amai(obj, this.d.next());
    }
}
