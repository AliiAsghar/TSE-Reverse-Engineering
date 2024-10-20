package defpackage;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abdb {
    public int a = -1;
    final /* synthetic */ abdc b;
    private final String c;

    public abdb(abdc abdcVar, String str) {
        this.b = abdcVar;
        this.c = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i) {
        if (this.a != i) {
            this.a = i;
            abdc abdcVar = this.b;
            abdcVar.d.j(this.c, i);
            Iterator it = this.b.c.iterator();
            while (it.hasNext()) {
                ((abcy) it.next()).a(this.a);
            }
        }
    }
}
