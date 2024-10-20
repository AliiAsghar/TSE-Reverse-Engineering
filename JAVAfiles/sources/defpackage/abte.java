package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abte {
    public abtf a;
    public abtf b;
    public absy c;
    public Feature[] d;
    public int e;
    private final Runnable f = new zth(6);
    private boolean g = true;

    public final void a() {
        this.g = false;
    }

    public final addy b() {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (this.a != null) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "Must set register function");
        if (this.b != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        d.t(z2, "Must set unregister function");
        if (this.c == null) {
            z3 = false;
        }
        d.t(z3, "Must set holder");
        d.aC(this.c.b, "Key must not be null");
        return new addy(new abtd(this, this.c, this.d, this.g, this.e), new ahjj(this, (byte[]) null), this.f);
    }
}
