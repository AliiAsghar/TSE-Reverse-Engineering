package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aodg implements abrw {
    public static final AtomicReference a = new AtomicReference();

    @Override // defpackage.abrw
    public final void a(boolean z) {
        synchronized (aodi.a) {
            Iterator it = new ArrayList(aodi.b.values()).iterator();
            while (it.hasNext()) {
                aodi aodiVar = (aodi) it.next();
                if (aodiVar.d.get()) {
                    Log.d("FirebaseApp", "Notifying background state change listeners.");
                    Iterator it2 = aodiVar.g.iterator();
                    while (it2.hasNext()) {
                        ((asqc) it2.next()).e(z);
                    }
                }
            }
        }
    }
}
