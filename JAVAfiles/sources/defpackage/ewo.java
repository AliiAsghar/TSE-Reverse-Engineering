package defpackage;

import com.android.vcard.VCardConfig;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ewo implements ewi {
    public final ewl[] a;
    public int b;
    private final Thread c;
    private final ewm[] g;
    private int h;
    private ewl i;
    private ewj j;
    private boolean k;
    private boolean l;
    private int m;
    private final Object d = new Object();
    private long n = -9223372036854775807L;
    private final ArrayDeque e = new ArrayDeque();
    private final ArrayDeque f = new ArrayDeque();

    /* JADX INFO: Access modifiers changed from: protected */
    public ewo(ewl[] ewlVarArr, ewm[] ewmVarArr) {
        this.a = ewlVarArr;
        this.b = ewlVarArr.length;
        for (int i = 0; i < this.b; i++) {
            this.a[i] = i();
        }
        this.g = ewmVarArr;
        this.h = ewmVarArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.g[i2] = k();
        }
        ewn ewnVar = new ewn(this);
        this.c = ewnVar;
        ewnVar.start();
    }

    private final void p() {
        if (s()) {
            this.d.notify();
        }
    }

    private final void q() {
        ewj ewjVar = this.j;
        if (ewjVar == null) {
        } else {
            throw ewjVar;
        }
    }

    private final void r(ewl ewlVar) {
        ewlVar.eO();
        int i = this.b;
        this.b = i + 1;
        this.a[i] = ewlVar;
    }

    private final boolean s() {
        if (!this.e.isEmpty() && this.h > 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ewi
    public final void c() {
        synchronized (this.d) {
            this.k = true;
            this.m = 0;
            ewl ewlVar = this.i;
            if (ewlVar != null) {
                r(ewlVar);
                this.i = null;
            }
            while (!this.e.isEmpty()) {
                r((ewl) this.e.removeFirst());
            }
            while (!this.f.isEmpty()) {
                ((ewm) this.f.removeFirst()).h();
            }
        }
    }

    @Override // defpackage.ewi
    public final void e() {
        synchronized (this.d) {
            this.l = true;
            this.d.notify();
        }
        try {
            this.c.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // defpackage.ewi
    public final void f(long j) {
        synchronized (this.d) {
            boolean z = true;
            if (this.b != this.a.length && !this.k) {
                z = false;
            }
            dzg.d(z);
            this.n = j;
        }
    }

    protected abstract ewj g(Throwable th);

    protected abstract ewj h(ewl ewlVar, ewm ewmVar, boolean z);

    protected abstract ewl i();

    @Override // defpackage.ewi
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final ewl a() {
        boolean z;
        ewl ewlVar;
        synchronized (this.d) {
            q();
            if (this.i == null) {
                z = true;
            } else {
                z = false;
            }
            dzg.d(z);
            int i = this.b;
            if (i == 0) {
                ewlVar = null;
            } else {
                ewl[] ewlVarArr = this.a;
                int i2 = i - 1;
                this.b = i2;
                ewlVar = ewlVarArr[i2];
            }
            this.i = ewlVar;
        }
        return ewlVar;
    }

    protected abstract ewm k();

    @Override // defpackage.ewi
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final ewm b() {
        synchronized (this.d) {
            q();
            if (this.f.isEmpty()) {
                return null;
            }
            return (ewm) this.f.removeFirst();
        }
    }

    @Override // defpackage.ewi
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void d(ewl ewlVar) {
        boolean z;
        synchronized (this.d) {
            q();
            if (ewlVar == this.i) {
                z = true;
            } else {
                z = false;
            }
            d.s(z);
            this.e.addLast(ewlVar);
            p();
            this.i = null;
        }
    }

    public final void n(ewm ewmVar) {
        synchronized (this.d) {
            ewmVar.eO();
            ewm[] ewmVarArr = this.g;
            int i = this.h;
            this.h = i + 1;
            ewmVarArr[i] = ewmVar;
            p();
        }
    }

    public final boolean o() {
        boolean z;
        ewj g;
        synchronized (this.d) {
            while (!this.l && !s()) {
                this.d.wait();
            }
            if (this.l) {
                return false;
            }
            ewl ewlVar = (ewl) this.e.removeFirst();
            ewm[] ewmVarArr = this.g;
            int i = this.h - 1;
            this.h = i;
            ewm ewmVar = ewmVarArr[i];
            boolean z2 = this.k;
            this.k = false;
            if (ewlVar.eR()) {
                ewmVar.eP(4);
            } else {
                ewmVar.b = ewlVar.f;
                if (ewlVar.eQ(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS)) {
                    ewmVar.eP(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS);
                }
                long j = ewlVar.f;
                synchronized (this.d) {
                    long j2 = this.n;
                    if (j2 != -9223372036854775807L && j < j2) {
                        z = false;
                    }
                    z = true;
                }
                if (!z) {
                    ewmVar.d = true;
                }
                try {
                    g = h(ewlVar, ewmVar, z2);
                } catch (OutOfMemoryError e) {
                    g = g(e);
                } catch (RuntimeException e2) {
                    g = g(e2);
                }
                if (g != null) {
                    synchronized (this.d) {
                        this.j = g;
                    }
                    return false;
                }
            }
            synchronized (this.d) {
                if (this.k) {
                    ewmVar.h();
                } else if (ewmVar.d) {
                    this.m++;
                    ewmVar.h();
                } else {
                    ewmVar.c = this.m;
                    this.m = 0;
                    this.f.addLast(ewmVar);
                }
                r(ewlVar);
            }
            return true;
        }
    }
}
