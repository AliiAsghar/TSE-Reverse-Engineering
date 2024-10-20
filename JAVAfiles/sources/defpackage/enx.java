package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class enx extends eny {
    public final ta g = new ta();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.env
    public final void f() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((enw) ((sw) ((sy) it).next()).b).b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.env
    public final void g() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            enw enwVar = (enw) ((sw) ((sy) it).next()).b;
            enwVar.a.i(enwVar);
        }
    }
}
