package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apxa implements apwu, apxo {
    public final Set a = new HashSet();
    private boolean b = false;

    @Override // defpackage.apxo
    public final void a(apxn apxnVar) {
        aowt.o();
        c();
        this.a.add(apxnVar);
    }

    public final void b() {
        aowt.o();
        this.b = true;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((apxn) it.next()).a();
        }
    }

    public final void c() {
        if (!this.b) {
        } else {
            throw new IllegalStateException("There was a race between the call to add/remove an OnClearedListener and onCleared(). This can happen when posting to the Main thread from a background thread, which is not supported.");
        }
    }
}
