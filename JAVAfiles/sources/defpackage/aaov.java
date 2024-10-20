package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaov extends eor {
    public boolean a = true;
    public boolean b = false;
    private boolean d = false;
    public final eny c = new eny(false);

    public final void a() {
        this.b = !this.b;
        b();
    }

    public final void b() {
        boolean z = false;
        if (this.b && this.a) {
            z = true;
        }
        if (this.d != z) {
            this.d = z;
            this.c.h(Boolean.valueOf(z));
        }
    }
}
