package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aryv extends aryw implements arwm {
    public final Handler a;
    public final aryv b;
    private final String c;
    private final boolean d;

    public aryv(Handler handler, String str) {
        this(handler, str, false);
    }

    private final void j(arpi arpiVar, Runnable runnable) {
        arwi.w(arpiVar, new CancellationException(a.cc(this, "The task was rejected, the handler underlying the dispatcher '", "' was closed")));
        arwb arwbVar = arws.a;
        asfx.a.a(arpiVar, runnable);
    }

    @Override // defpackage.arwb
    public final void a(arpi arpiVar, Runnable runnable) {
        if (!this.a.post(runnable)) {
            j(arpiVar, runnable);
        }
    }

    @Override // defpackage.aryw, defpackage.arwm
    public final arwu c(long j, final Runnable runnable, arpi arpiVar) {
        if (this.a.postDelayed(runnable, arrn.w(j, 4611686018427387903L))) {
            return new arwu() { // from class: aryu
                @Override // defpackage.arwu
                public final void hd() {
                    aryv.this.a.removeCallbacks(runnable);
                }
            };
        }
        j(arpiVar, runnable);
        return aryd.a;
    }

    @Override // defpackage.arwm
    public final void d(long j, arvo arvoVar) {
        ardm ardmVar = new ardm(arvoVar, this, 9);
        if (this.a.postDelayed(ardmVar, arrn.w(j, 4611686018427387903L))) {
            arvoVar.d(new akko(this, ardmVar, 4, null));
        } else {
            j(((arvp) arvoVar).b, ardmVar);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aryv) {
            aryv aryvVar = (aryv) obj;
            if (aryvVar.a == this.a && aryvVar.d == this.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.arwb
    public final boolean ey(arpi arpiVar) {
        if (this.d) {
            if (d.F(Looper.myLooper(), this.a.getLooper())) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        boolean z = this.d;
        int identityHashCode = System.identityHashCode(this.a);
        if (true != z) {
            i = 1237;
        } else {
            i = 1231;
        }
        return i ^ identityHashCode;
    }

    @Override // defpackage.arya
    public final /* synthetic */ arya i() {
        return this.b;
    }

    @Override // defpackage.arya, defpackage.arwb
    public final String toString() {
        String g = g();
        if (g == null) {
            String str = this.c;
            if (str == null) {
                str = this.a.toString();
            }
            if (this.d) {
                return String.valueOf(str).concat(".immediate");
            }
            return str;
        }
        return g;
    }

    private aryv(Handler handler, String str, boolean z) {
        this.a = handler;
        this.c = str;
        this.d = z;
        this.b = z ? this : new aryv(handler, str, true);
    }
}
