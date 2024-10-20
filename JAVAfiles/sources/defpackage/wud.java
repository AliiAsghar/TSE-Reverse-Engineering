package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wud implements ajoa {
    private final List a = new CopyOnWriteArrayList();

    @Override // defpackage.ajoa
    public final void c(String str) {
        akrh e = aktp.e("JibeServiceListenerPropagator#handleServiceDisconnected");
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((ajoa) it.next()).c(str);
            }
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void d(ajoa ajoaVar) {
        this.a.add(ajoaVar);
    }

    @Override // defpackage.ajoa
    public final void fG(String str, ajnz ajnzVar) {
        akrh e = aktp.e("JibeServiceListenerPropagator#handleServiceConnectFailed");
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((ajoa) it.next()).fG(str, ajnzVar);
            }
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajoa
    public final void fH(String str) {
        akrh e = aktp.e("JibeServiceListenerPropagator#handleServiceConnected");
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((ajoa) it.next()).fH(str);
            }
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
