package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aohy {
    public String a;
    public int b;
    private long c;
    private byte d;

    public final aohz a() {
        if (this.d == 1) {
            return new aohz(this.a, this.c, this.b);
        }
        throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
    }

    public final void b(long j) {
        this.c = j;
        this.d = (byte) 1;
    }
}
