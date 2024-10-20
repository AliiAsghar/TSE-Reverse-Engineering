package androidx.window.layout.adapter.extensions;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutInfo;
import defpackage.ecd;
import defpackage.gqz;
import defpackage.gvf;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class MulticastConsumer implements ecd<WindowLayoutInfo> {
    public final ReentrantLock a = new ReentrantLock();
    public final Set b = new LinkedHashSet();
    private final Context c;
    private gqz d;

    public MulticastConsumer(Context context) {
        this.c = context;
    }

    public final void a(ecd ecdVar) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            gqz gqzVar = this.d;
            if (gqzVar != null) {
                ecdVar.accept(gqzVar);
            }
            this.b.add(ecdVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.ecd
    public void accept(WindowLayoutInfo windowLayoutInfo) {
        windowLayoutInfo.getClass();
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            gqz aO = gvf.aO(this.c, windowLayoutInfo);
            this.d = aO;
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((ecd) it.next()).accept(aO);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
