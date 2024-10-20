package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbj implements fan {
    public ero a = ero.a;
    private boolean b;
    private long c;
    private long d;

    @Override // defpackage.fan
    public final long a() {
        long j;
        long j2 = this.c;
        if (this.b) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.d;
            if (this.a.b == 1.0f) {
                j = eul.u(elapsedRealtime);
            } else {
                j = elapsedRealtime * r4.d;
            }
            return j2 + j;
        }
        return j2;
    }

    @Override // defpackage.fan
    public final ero b() {
        return this.a;
    }

    @Override // defpackage.fan
    public final void c(ero eroVar) {
        if (this.b) {
            d(a());
        }
        this.a = eroVar;
    }

    public final void d(long j) {
        this.c = j;
        if (this.b) {
            this.d = SystemClock.elapsedRealtime();
        }
    }

    public final void e() {
        if (!this.b) {
            this.d = SystemClock.elapsedRealtime();
            this.b = true;
        }
    }

    @Override // defpackage.fan
    public final /* synthetic */ boolean f() {
        return false;
    }

    public final void g() {
        if (this.b) {
            d(a());
            this.b = false;
        }
    }
}
