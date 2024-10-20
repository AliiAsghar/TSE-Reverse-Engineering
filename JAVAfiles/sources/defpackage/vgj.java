package defpackage;

import j$.util.Optional;
import java.io.Closeable;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vgj implements Closeable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ vgj(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List, java.lang.Object] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                Object obj = this.b;
                if (obj != null) {
                    ((aees) obj).a.close();
                }
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    ((aefd) it.next()).b.close();
                }
                return;
            }
            Object obj2 = this.b;
            synchronized (uek.c) {
                ((uek) obj2).g = true;
            }
            Object obj3 = this.a;
            Thread currentThread = Thread.currentThread();
            StackTraceElement[] stackTrace = currentThread.getStackTrace();
            uek uekVar = (uek) obj2;
            xnv xnvVar = uekVar.d;
            uekVar.f = uekVar.e.schedule(new ugx(uekVar, xnvVar.a(), xnvVar.d().toMillis(), currentThread, stackTrace, (Optional) obj3, 1), ((Long) uek.b.e()).longValue(), TimeUnit.MILLISECONDS);
            return;
        }
        synchronized (((vgk) this.b).b) {
            Object obj4 = this.a;
            Object obj5 = this.b;
            if (obj4 == ((vgk) obj5).g) {
                ((vgk) obj5).g = null;
            }
        }
    }

    public vgj(vgk vgkVar, akul akulVar, int i) {
        this.c = i;
        this.a = akulVar;
        this.b = vgkVar;
    }
}
