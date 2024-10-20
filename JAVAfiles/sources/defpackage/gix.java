package defpackage;

import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gix extends ght {
    private final ghv b;
    private final WeakReference c;

    public gix(ghv ghvVar, ght ghtVar) {
        super(ghtVar.a);
        this.b = ghvVar;
        this.c = new WeakReference(ghtVar);
    }

    @Override // defpackage.ght
    public final void a(Set set) {
        set.getClass();
        ght ghtVar = (ght) this.c.get();
        if (ghtVar == null) {
            ghv ghvVar = this.b;
            ReentrantLock reentrantLock = ghvVar.e;
            reentrantLock.lock();
            try {
                gpx gpxVar = (gpx) ghvVar.d.remove(this);
                if (gpxVar != null) {
                    if (ghvVar.c.c.d((int[]) gpxVar.a)) {
                        arrn.G(arpj.a, new eie(ghvVar, (arpe) null, 7, (byte[]) null));
                        return;
                    }
                    return;
                }
                return;
            } finally {
                reentrantLock.unlock();
            }
        }
        ghtVar.a(set);
    }
}
