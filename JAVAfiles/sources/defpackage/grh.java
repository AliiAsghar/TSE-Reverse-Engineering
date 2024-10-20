package defpackage;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class grh extends grg {
    private final ReentrantLock b;
    private final Map c;
    private final Map d;

    public grh(WindowLayoutComponent windowLayoutComponent, goq goqVar) {
        super(windowLayoutComponent, goqVar);
        this.b = new ReentrantLock();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
    }

    @Override // defpackage.grg, defpackage.gre
    public final void a(ecd ecdVar) {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            Context context = (Context) this.d.get(ecdVar);
            if (context == null) {
                return;
            }
            gri griVar = (gri) this.c.get(context);
            if (griVar == null) {
                return;
            }
            griVar.removeListener(ecdVar);
            this.d.remove(ecdVar);
            if (griVar.isEmpty()) {
                this.c.remove(context);
                this.a.removeWindowLayoutInfoListener(griVar);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.grg, defpackage.gre
    public final void b(Context context, ecd ecdVar) {
        arnb arnbVar;
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            gri griVar = (gri) this.c.get(context);
            if (griVar != null) {
                griVar.addListener(ecdVar);
                this.d.put(ecdVar, context);
                arnbVar = arnb.a;
            } else {
                arnbVar = null;
            }
            if (arnbVar == null) {
                gri griVar2 = new gri(context);
                this.c.put(context, griVar2);
                this.d.put(ecdVar, context);
                griVar2.addListener(ecdVar);
                this.a.addWindowLayoutInfoListener(context, griVar2);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
