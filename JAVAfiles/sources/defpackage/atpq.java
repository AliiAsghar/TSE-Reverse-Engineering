package defpackage;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atpq extends atqh {
    final /* synthetic */ atqh a;

    public atpq(atqh atqhVar) {
        this.a = atqhVar;
    }

    @Override // defpackage.atqh
    public final /* bridge */ /* synthetic */ void a(atql atqlVar, Object obj) {
        Iterable iterable = (Iterable) obj;
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                this.a.a(atqlVar, it.next());
            }
        }
    }
}
