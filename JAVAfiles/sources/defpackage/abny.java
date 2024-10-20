package defpackage;

import android.util.Log;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class abny {
    public final String a;
    public final Object b;
    vl c;
    public int d;
    final /* synthetic */ aboj e;

    /* JADX INFO: Access modifiers changed from: protected */
    public abny(aboj abojVar, abny abnyVar) {
        this(abojVar, abnyVar.a);
        synchronized (abnyVar.b) {
            this.d = abnyVar.d;
            vl vlVar = this.c;
            this.c = abnyVar.c;
            abnyVar.c = vlVar;
            abnyVar.d = 0;
        }
    }

    public final void a(final long j, final long j2, abod abodVar) {
        if (abodVar == null) {
            abodVar = aboj.a;
        }
        algk algkVar = new algk() { // from class: abnx
            @Override // defpackage.algk
            public final Object apply(Object obj) {
                boolean z;
                long j3 = j;
                abod abodVar2 = (abod) obj;
                abny abnyVar = abny.this;
                synchronized (abnyVar.b) {
                    uj ujVar = (uj) abnyVar.c.get(abodVar2);
                    if (ujVar == null) {
                        ujVar = new uj();
                        abnyVar.c.put(abodVar2, ujVar);
                    }
                    int i = abnyVar.d;
                    int i2 = abnyVar.e.c;
                    if (i >= i2) {
                        if (i == i2 && Log.isLoggable("Counters", 3)) {
                            Log.d("Counters", "exceeded sample count in " + abnyVar.a);
                        }
                        z = false;
                    } else {
                        abnyVar.d = i + 1;
                        long[] jArr = (long[]) ujVar.d(j3);
                        long j4 = j2;
                        if (jArr == null) {
                            ujVar.h(j3, new long[]{j4});
                        } else {
                            jArr[0] = jArr[0] + j4;
                        }
                        z = false;
                    }
                }
                return z;
            }
        };
        abhg.m(abodVar);
        if (aboj.b.equals(abodVar)) {
            abodVar = this.e.i;
        }
        ReentrantReadWriteLock.ReadLock readLock = this.e.d.readLock();
        readLock.lock();
        try {
            if (!this.e.j.contains(abodVar)) {
                readLock.unlock();
                ReentrantReadWriteLock.WriteLock writeLock = this.e.d.writeLock();
                writeLock.lock();
                readLock.lock();
                try {
                    this.e.j.add(abodVar);
                    writeLock.unlock();
                } catch (Throwable th) {
                    writeLock.unlock();
                    throw th;
                }
            }
            ((Boolean) algkVar.apply(abodVar)).booleanValue();
            Future future = this.e.f;
            readLock.unlock();
            if (this.e.e > 0 && future == null) {
                this.e.g();
            }
        } catch (Throwable th2) {
            readLock.unlock();
            throw th2;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AbstractCounter(");
        sb.append(this.a);
        sb.append(")[");
        synchronized (this.b) {
            int i = 0;
            while (true) {
                vl vlVar = this.c;
                if (i < vlVar.d) {
                    uj ujVar = (uj) vlVar.g(i);
                    sb.append(this.c.d(i));
                    sb.append(" -> [");
                    for (int i2 = 0; i2 < ujVar.b(); i2++) {
                        sb.append(ujVar.c(i2));
                        sb.append(" = ");
                        sb.append(((long[]) ujVar.e(i2))[0]);
                        sb.append(", ");
                    }
                    sb.append("], ");
                    i++;
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abny(aboj abojVar, String str) {
        this.e = abojVar;
        this.b = new Object();
        this.c = new vl();
        abhg.j(!abojVar.h.containsKey(str), "counter/histogram already exists: %s", str);
        this.a = str;
    }
}
