package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ugp implements Closeable {
    final /* synthetic */ int a;
    private final Set b;
    private final alwo c;
    private final List d = new ArrayList();

    public ugp(Set set, alwo alwoVar, int i) {
        this.a = i;
        this.b = set;
        this.c = alwoVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        if (this.d.isEmpty()) {
            return;
        }
        aluq listIterator = ((altx) this.b).listIterator();
        while (listIterator.hasNext()) {
            ugm ugmVar = (ugm) listIterator.next();
            aozy createBuilder = ugn.a.createBuilder();
            List list = this.d;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ugn ugnVar = (ugn) createBuilder.b;
            apax apaxVar = ugnVar.c;
            if (!apaxVar.c()) {
                ugnVar.c = apag.mutableCopy(apaxVar);
            }
            aoyj.addAll(list, ugnVar.c);
            int i = this.a;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((ugn) createBuilder.b).b = i;
            ugmVar.a((ugn) createBuilder.s());
        }
        this.d.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(int i, String str) {
        String str2;
        alvw n = this.c.n();
        alvz alvzVar = new alvz("operation", String.class, false, false);
        if (i != 1) {
            if (i != 2) {
                str2 = "DELETE";
            } else {
                str2 = "UPDATE";
            }
        } else {
            str2 = "INSERT";
        }
        n.X(alvzVar, str2);
        n.X(new alvz("table_type", Integer.class, false, false), Integer.valueOf(this.a));
        n.X(new alvz("item_id", String.class, false, false), str);
        n.X(ydl.M, "ugp");
        ((alwl) n.h("com/google/android/apps/messaging/shared/datamodel/observer/TableContentChangeObserver$ClosableBatchScheduler", "queue", 446, "TableContentChangeObserver.java")).q("Change in transaction is observed. Queues work item.");
        this.d.add(str);
        if (this.d.size() >= ((Integer) ugm.a.e()).intValue()) {
            a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }
}
