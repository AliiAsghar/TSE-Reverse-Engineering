package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atcs extends astl {
    public int b;
    public byte[] c;

    public atcs(int i, byte[] bArr) {
        super(true);
        int i2;
        int length = bArr.length;
        if (i != 5) {
            if (i == 6) {
                i2 = 12392;
            } else {
                throw new IllegalArgumentException(a.bV(i, "unknown security category: "));
            }
        } else {
            i2 = 5224;
        }
        if (length == i2) {
            this.b = i;
            this.c = atow.O(bArr);
            return;
        }
        throw new IllegalArgumentException("invalid key size for security category");
    }
}
