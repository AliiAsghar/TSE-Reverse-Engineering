package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asnc {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public asnc(asnh asnhVar, asnd asndVar, asnt asntVar) {
        this.b = asnhVar;
        this.c = asndVar;
        this.d = asntVar;
        this.e = asntVar.c();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [asnt, java.lang.Object] */
    public final asml a(boolean z) {
        try {
            asml b = this.d.b(z);
            if (b != null) {
                b.k = this;
            }
            return b;
        } catch (IOException e) {
            d(e);
            throw e;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [asnt, java.lang.Object] */
    public final void b() {
        this.d.c().e();
    }

    public final void c() {
        ((asnh) this.b).a(this, true, false, null);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [asnt, java.lang.Object] */
    public final void d(IOException iOException) {
        this.a = true;
        ((asnd) this.c).a(iOException);
        this.d.c().g((asnh) this.b, iOException);
    }

    public final IOException e(boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            d(iOException);
        }
        return ((asnh) this.b).a(this, z2, z, iOException);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    public final void f(Object obj) {
        ?? r0 = this.e;
        boolean z = true;
        if (r0 != 0 && ((Boolean) r0.a()).booleanValue()) {
            h();
        }
        if (this.a) {
            this.d.a(obj);
            return;
        }
        Object obj2 = this.b;
        try {
            ((ReentrantLock) obj2).lock();
            if (!this.a) {
                this.c.add(obj);
                z = false;
            }
            if (z) {
                this.d.a(obj);
            }
        } finally {
            ((ReentrantLock) obj2).unlock();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.lang.Object] */
    public final void g(Object obj) {
        Object obj2 = this.b;
        try {
            ((ReentrantLock) obj2).lock();
            this.c.remove(obj);
        } finally {
            ((ReentrantLock) obj2).unlock();
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List, java.lang.Object] */
    public final boolean h() {
        if (this.a) {
            return false;
        }
        Object obj = this.b;
        try {
            ((ReentrantLock) obj).lock();
            if (this.a) {
                return false;
            }
            this.a = true;
            List ax = aqjn.ax(this.c);
            this.c.clear();
            ((ReentrantLock) obj).unlock();
            ?? r0 = this.d;
            Iterator it = ax.iterator();
            while (it.hasNext()) {
                r0.a(it.next());
            }
            return true;
        } finally {
            ((ReentrantLock) obj).unlock();
        }
    }

    public asnc(arqr arqrVar, arqg arqgVar) {
        this.d = arqrVar;
        this.e = arqgVar;
        this.b = new ReentrantLock();
        this.c = new ArrayList();
    }
}
