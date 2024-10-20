package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agko implements ThreadFactory {
    public final Object a = new Object();
    public final Set b = Collections.newSetFromMap(new WeakHashMap());
    public final Set c = new to();
    private int d;

    public agko(int i) {
        this.d = i;
    }

    public final void a(int i) {
        synchronized (this.a) {
            if (this.d == i) {
                return;
            }
            this.d = i;
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((agkn) it.next()).a(i);
            }
            tn tnVar = new tn((to) this.c);
            while (tnVar.hasNext()) {
                ((agkn) tnVar.next()).a(i);
            }
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        agkn agknVar;
        synchronized (this.a) {
            agknVar = new agkn(this.d, runnable);
            this.b.add(agknVar);
            agknVar.a = new adhc(this, agknVar, 10);
            agknVar.b = new adhc(this, agknVar, 11);
        }
        return agknVar;
    }
}
