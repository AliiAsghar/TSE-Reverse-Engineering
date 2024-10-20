package defpackage;

import java.io.Closeable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ucz implements Closeable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ucz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [agng, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, akry] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List, java.lang.Object] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = 0;
        boolean z = false;
        switch (this.b) {
            case 0:
                this.a.a();
                return;
            case 1:
                ((uck) this.a).c.readLock().unlock();
                return;
            case 2:
                utz utzVar = udk.a;
                while (true) {
                    ?? r0 = this.a;
                    if (i < ((alsx) r0).c) {
                        ((Runnable) r0.get(i)).run();
                        i++;
                    } else {
                        return;
                    }
                }
            case 3:
                udm udmVar = (udm) this.a;
                albo.T(!((Boolean) udmVar.b.get()).booleanValue());
                udmVar.b.set(true);
                return;
            case 4:
                udm udmVar2 = (udm) this.a;
                albo.T(((Boolean) udmVar2.b.get()).booleanValue());
                udmVar2.b.set(false);
                return;
            case 5:
                ((udm) this.a).a.release();
                return;
            case 6:
                ((ued) this.a).g();
                return;
            case 7:
                ((ued) this.a).g();
                return;
            case 8:
                arjs arjsVar = (arjs) this.a;
                arjsVar.a -= 3;
                return;
            case 9:
                synchronized (this.a) {
                    ((vby) this.a).s = null;
                }
                return;
            case 10:
                agcp agcpVar = (agcp) this.a;
                if (((AtomicInteger) agcpVar.c).decrementAndGet() == 0) {
                    ((AtomicReference) agcpVar.a).set(null);
                    return;
                }
                return;
            case 11:
                ((aixe) this.a).c = true;
                return;
            case 12:
                Object obj = this.a;
                synchronized (((aixj) obj).h) {
                    int i2 = ((aixj) obj).k;
                    if (i2 > 0) {
                        z = true;
                    }
                    albo.V(z, "Refcount went negative!", i2);
                    ((aixj) obj).k--;
                    ((aixj) obj).c();
                }
                return;
            case 13:
                albo.U(((ajxb) this.a).a.compareAndSet(true, false), "AccountOperationContext is already in the immutable state. This may be caused by concurrent access to the object, which is forbidden.");
                return;
            default:
                akqj.g(this.a);
                return;
        }
    }

    public ucz(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
