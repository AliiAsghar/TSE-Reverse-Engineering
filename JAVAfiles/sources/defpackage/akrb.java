package defpackage;

import android.os.Build;
import java.lang.ref.Reference;
import java.util.UUID;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akrb implements akry {
    public final akuf a;
    public final akry b;
    public Thread c;
    public aktx d;
    private final akue e;

    private akrb(akue akueVar, akrb akrbVar, akru akruVar) {
        this.e = akueVar;
        this.a = akrbVar.a;
        this.b = akrbVar;
        aktx aktxVar = akruVar.e;
        if (aktxVar == null) {
            this.d = null;
            this.c = Thread.currentThread();
        } else {
            this.d = aktxVar;
            this.c = null;
        }
    }

    private final void g() {
        if (Build.VERSION.SDK_INT < 28) {
            return;
        }
        Reference.reachabilityFence(this);
    }

    @Override // defpackage.akry
    public final akry a() {
        return this.b;
    }

    @Override // defpackage.akry
    public final aktx b() {
        return this.d;
    }

    @Override // defpackage.akry
    public final String c() {
        return this.e.c;
    }

    @Override // defpackage.aksa, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        akqj.o(this);
        this.c = null;
        this.d = null;
    }

    @Override // defpackage.akry
    public final Thread d() {
        return this.c;
    }

    @Override // defpackage.akry
    public final UUID e() {
        return this.a.b;
    }

    public final int f() {
        return this.e.f;
    }

    @Override // defpackage.akry
    public final akrl i() {
        akue akueVar = this.e;
        return akrl.e(akueVar.e, akueVar.c());
    }

    @Override // defpackage.akry
    public final akri j(aktp aktpVar) {
        return akrl.j(aktpVar, i());
    }

    @Override // defpackage.akry
    public final akrl l() {
        throw null;
    }

    @Override // defpackage.akry
    public final akry m(String str, akrl akrlVar, akru akruVar) {
        boolean z;
        boolean z2;
        akuf akufVar = this.a;
        akue akueVar = new akue(this.e, str, akufVar.a(), akrlVar);
        while (true) {
            akue akueVar2 = (akue) akufVar.e.get();
            z = true;
            int i = akueVar2.f + 1;
            if (i >= akufVar.a.f) {
                akueVar.d(Integer.MIN_VALUE, null);
                synchronized (akufVar) {
                    akufVar.g++;
                }
                break;
            }
            akueVar.d(i, akueVar2);
            if (a.bC(akufVar.e, akueVar2, akueVar)) {
                break;
            }
        }
        akrb akrbVar = new akrb(akueVar, this, akruVar);
        akry akryVar = akrbVar.b;
        boolean z3 = akqj.a;
        akryVar.getClass();
        if (akrbVar.c == null && akrbVar.d == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        albo.U(z2, "isSynchronousChild should not be called if the trace has been closed on its creation thread.");
        aktx aktxVar = akrbVar.d;
        if (aktxVar == null ? ((akrb) akrbVar.b).c != akrbVar.c : aktxVar != ((akrb) akrbVar.b).d) {
            z = false;
        }
        akueVar.h = z;
        return akrbVar;
    }

    @Override // defpackage.akry
    public final void n(int i) {
        akue akueVar = this.e;
        if (akueVar.f()) {
            akueVar = akueVar.b;
        }
        akueVar.addAndGet(i);
        g();
    }

    @Override // defpackage.akry
    public final void o(boolean z) {
        long j;
        long a = this.a.a();
        akue akueVar = this.e;
        long j2 = a - akueVar.d;
        albo.T(!akueVar.e());
        if (true != z) {
            j = 0;
        } else {
            j = 4611686018427387904L;
        }
        akueVar.i = (j2 & 4611686018427387903L) | j | Long.MIN_VALUE;
        g();
    }

    @Override // defpackage.akry
    public final boolean p() {
        return this.a.c;
    }

    @Override // defpackage.akry
    public final void r() {
        this.e.j = 3;
    }

    @Override // defpackage.akry
    public final void s(aktp aktpVar, Object obj) {
        akue akueVar;
        akub a;
        akub akubVar = new akub(aktpVar, obj);
        do {
            akueVar = this.e;
            a = akue.a.a(akueVar);
            if (a != null) {
                akubVar.c = a;
            }
        } while (!akue.a.b(akueVar, a, akubVar));
        g();
    }

    public final String toString() {
        return akqj.n(this);
    }

    public akrb(akue akueVar, akuf akufVar, akru akruVar) {
        this.e = akueVar;
        this.a = akufVar;
        Thread thread = null;
        this.b = null;
        aktx aktxVar = akruVar.e;
        if (aktxVar == null) {
            this.d = null;
            thread = Thread.currentThread();
        } else {
            this.d = aktxVar;
        }
        this.c = thread;
    }
}
