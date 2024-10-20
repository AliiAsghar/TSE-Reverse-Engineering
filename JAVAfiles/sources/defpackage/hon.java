package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hon extends WeakReference {
    final hne a;
    final boolean b;
    hpt c;

    public hon(hne hneVar, hpn hpnVar, ReferenceQueue referenceQueue) {
        super(hpnVar, referenceQueue);
        hwr.i(hneVar);
        this.a = hneVar;
        this.c = null;
        this.b = hpnVar.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.c = null;
        clear();
    }
}
