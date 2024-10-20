package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asmx {
    public final asmy a;
    public final String b;
    public boolean c;
    public asmv d;
    public final List e = new ArrayList();
    public boolean f;

    public asmx(asmy asmyVar, String str) {
        this.a = asmyVar;
        this.b = str;
    }

    public final void a() {
        byte[] bArr = asmt.a;
        synchronized (this.a) {
            if (c()) {
                this.a.c(this);
            }
        }
    }

    public final void b() {
        byte[] bArr = asmt.a;
        synchronized (this.a) {
            this.c = true;
            if (c()) {
                this.a.c(this);
            }
        }
    }

    public final boolean c() {
        if (this.d != null) {
            this.f = true;
        }
        int size = this.e.size() - 1;
        boolean z = false;
        while (size >= 0) {
            asmv asmvVar = (asmv) this.e.get(size);
            if (asmy.b.isLoggable(Level.FINE)) {
                aotl.ai(asmvVar, this, "canceled");
            }
            this.e.remove(size);
            size--;
            z = true;
        }
        return z;
    }

    public final boolean d(asmv asmvVar, long j, boolean z) {
        String concat;
        asmx asmxVar = asmvVar.b;
        if (asmxVar != this) {
            if (asmxVar == null) {
                asmvVar.b = this;
            } else {
                throw new IllegalStateException("task is in multiple queues");
            }
        }
        long nanoTime = System.nanoTime();
        long j2 = nanoTime + j;
        int indexOf = this.e.indexOf(asmvVar);
        if (indexOf != -1) {
            if (asmvVar.c <= j2) {
                if (asmy.b.isLoggable(Level.FINE)) {
                    aotl.ai(asmvVar, this, "already scheduled");
                }
                return false;
            }
            this.e.remove(indexOf);
        }
        asmvVar.c = j2;
        if (asmy.b.isLoggable(Level.FINE)) {
            long j3 = j2 - nanoTime;
            if (z) {
                concat = "run again after ".concat(aotl.ah(j3));
            } else {
                concat = "scheduled after ".concat(aotl.ah(j3));
            }
            aotl.ai(asmvVar, this, concat);
        }
        Iterator it = this.e.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (((asmv) it.next()).c - nanoTime > j) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i == -1) {
            i = this.e.size();
        }
        this.e.add(i, asmvVar);
        if (i != 0) {
            return false;
        }
        return true;
    }

    public final void f(asmv asmvVar) {
        asmvVar.getClass();
        synchronized (this.a) {
            if (this.c) {
                if (asmy.b.isLoggable(Level.FINE)) {
                    aotl.ai(asmvVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (d(asmvVar, 0L, false)) {
                    this.a.c(this);
                }
            }
        }
    }

    public final String toString() {
        return this.b;
    }
}
