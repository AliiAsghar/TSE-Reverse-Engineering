package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fzb extends gch {
    final /* synthetic */ fzd a;

    public fzb(fzd fzdVar) {
        this.a = fzdVar;
    }

    @Override // defpackage.gch
    public final void a(gbb gbbVar, gaz gazVar) {
        Iterator it = this.a.i.iterator();
        while (it.hasNext()) {
            ((arqv) it.next()).a(gbbVar, gazVar);
        }
    }
}
