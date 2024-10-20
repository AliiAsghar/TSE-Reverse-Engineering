package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alvk extends alvz {
    public alvk(Class cls) {
        super("group_by", cls, true);
    }

    @Override // defpackage.alvz
    public final void b(Iterator it, alvy alvyVar) {
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                alvyVar.a(this.a, next);
                return;
            }
            StringBuilder sb = new StringBuilder("[");
            sb.append(next);
            do {
                sb.append(',');
                sb.append(it.next());
            } while (it.hasNext());
            String str = this.a;
            sb.append(']');
            alvyVar.a(str, sb.toString());
        }
    }
}
