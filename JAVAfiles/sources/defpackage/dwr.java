package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwr extends dwq {
    public int m;

    public dwr(dwy dwyVar) {
        super(dwyVar);
        int i;
        if (true != (dwyVar instanceof dwv)) {
            i = 3;
        } else {
            i = 2;
        }
        this.l = i;
    }

    @Override // defpackage.dwq
    public final void c(int i) {
        if (!this.i) {
            this.i = true;
            this.f = i;
            Iterator it = this.j.iterator();
            while (it.hasNext()) {
                ((dwo) it.next()).f();
            }
        }
    }
}
