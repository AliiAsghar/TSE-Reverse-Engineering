package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ycf {
    public String a;
    private long b;
    private byte c;

    public final ycg a() {
        if (this.c == 1) {
            return new ycg(this.b, this.a);
        }
        throw new IllegalStateException("Missing required properties: id");
    }

    public final void b(long j) {
        this.b = j;
        this.c = (byte) 1;
    }
}
