package defpackage;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.reflection.Consumer2;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gri implements Consumer2, ecd {
    private final Context a;
    private final ReentrantLock b;
    private gqz c;
    private final Set d;

    public gri(Context context) {
        context.getClass();
        this.a = context;
        this.b = new ReentrantLock();
        this.d = new LinkedHashSet();
    }

    @Override // androidx.window.reflection.Consumer2, androidx.window.extensions.core.util.function.Consumer
    public void accept(WindowLayoutInfo windowLayoutInfo) {
        windowLayoutInfo.getClass();
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            gqz aO = gvf.aO(this.a, windowLayoutInfo);
            this.c = aO;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((ecd) it.next()).accept(aO);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void addListener(ecd<gqz> ecdVar) {
        ecdVar.getClass();
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            gqz gqzVar = this.c;
            if (gqzVar != null) {
                ecdVar.accept(gqzVar);
            }
            this.d.add(ecdVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    public final void removeListener(ecd<gqz> ecdVar) {
        ecdVar.getClass();
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            this.d.remove(ecdVar);
        } finally {
            reentrantLock.unlock();
        }
    }
}
