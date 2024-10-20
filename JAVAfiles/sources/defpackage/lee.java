package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lee {
    public boolean a;
    public boolean b;
    public boolean c;
    public byte d;

    public final void a(boolean z) {
        this.b = z;
        this.d = (byte) (this.d | 2);
    }

    public final void b(boolean z) {
        this.a = z;
        this.d = (byte) (this.d | 1);
    }

    public final void c(boolean z) {
        this.c = z;
        this.d = (byte) (this.d | 4);
    }
}
