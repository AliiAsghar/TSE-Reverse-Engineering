package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fkh {
    private final fkg c;
    private final fkk d;
    private boolean e;
    private long g;
    private boolean j;
    public int a = 0;
    private long f = -9223372036854775807L;
    private long h = -9223372036854775807L;
    private long i = -9223372036854775807L;
    private float k = 1.0f;
    public eti b = eti.a;

    public fkh(Context context, fkg fkgVar) {
        this.c = fkgVar;
        this.d = new fkk(context);
    }

    private final void o(int i) {
        this.a = Math.min(this.a, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0104, code lost:
    
        if (r11 > 100000) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x010f, code lost:
    
        if (r28 >= r32) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0114, code lost:
    
        if (r25.e != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
    
        if (r7.c[defpackage.fjs.a(r9 - 1)] == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(long r26, long r28, long r30, long r32, boolean r34, defpackage.fkf r35) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fkh.a(long, long, long, long, boolean, fkf):int");
    }

    public final void b() {
        if (this.a == 0) {
            this.a = 1;
        }
    }

    public final void c(boolean z) {
        this.j = z;
        this.i = SystemClock.elapsedRealtime() + 5000;
    }

    public final void d() {
        o(0);
    }

    public final void e() {
        o(2);
    }

    public final void f() {
        this.e = true;
        this.g = eul.u(SystemClock.elapsedRealtime());
        fkk fkkVar = this.d;
        fkkVar.d = true;
        fkkVar.b();
        if (fkkVar.b != null) {
            fkj fkjVar = fkkVar.c;
            dzg.g(fkjVar);
            fkjVar.c.sendEmptyMessage(2);
            fki fkiVar = fkkVar.b;
            fkiVar.a.registerDisplayListener(fkiVar, eul.C());
            fkiVar.b.c(fkiVar.a());
        }
        fkkVar.e(false);
    }

    public final void g() {
        this.e = false;
        this.i = -9223372036854775807L;
        fkk fkkVar = this.d;
        fkkVar.d = false;
        fki fkiVar = fkkVar.b;
        if (fkiVar != null) {
            fkiVar.a.unregisterDisplayListener(fkiVar);
            fkj fkjVar = fkkVar.c;
            dzg.g(fkjVar);
            fkjVar.c.sendEmptyMessage(3);
        }
        fkkVar.a();
    }

    public final void h() {
        this.d.b();
        this.h = -9223372036854775807L;
        this.f = -9223372036854775807L;
        o(1);
        this.i = -9223372036854775807L;
    }

    public final void i(int i) {
        fkk fkkVar = this.d;
        if (fkkVar.h == i) {
            return;
        }
        fkkVar.h = i;
        fkkVar.e(true);
    }

    public final void j(float f) {
        fkk fkkVar = this.d;
        fkkVar.f = f;
        fjt fjtVar = fkkVar.a;
        fjtVar.a.d();
        fjtVar.b.d();
        fjtVar.c = false;
        fjtVar.d = -9223372036854775807L;
        fjtVar.e = 0;
        fkkVar.d();
    }

    public final void k(Surface surface) {
        fkk fkkVar = this.d;
        if (fkkVar.e != surface) {
            fkkVar.a();
            fkkVar.e = surface;
            fkkVar.e(true);
        }
        o(1);
    }

    public final void l(float f) {
        if (f == this.k) {
            return;
        }
        this.k = f;
        fkk fkkVar = this.d;
        fkkVar.g = f;
        fkkVar.b();
        fkkVar.e(false);
    }

    public final boolean m(boolean z) {
        boolean z2 = true;
        if (!z || this.a != 3) {
            if (this.i == -9223372036854775807L) {
                return false;
            }
            if (SystemClock.elapsedRealtime() >= this.i) {
                z2 = false;
            }
            return z2;
        }
        this.i = -9223372036854775807L;
        return z2;
    }

    public final boolean n() {
        int i = this.a;
        this.a = 3;
        this.g = eul.u(SystemClock.elapsedRealtime());
        if (i != 3) {
            return true;
        }
        return false;
    }
}
