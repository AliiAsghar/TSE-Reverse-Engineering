package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ath {
    public long a;
    public long b;
    public final uy c;
    public final uy d;

    public ath() {
        byte[] bArr = null;
        this.c = new uy(bArr);
        this.d = new uy(bArr);
    }

    public static final long a(long j, long j2) {
        if (j2 == 0) {
            return j;
        }
        return ((j2 / 4) * 3) + (j / 4);
    }
}
