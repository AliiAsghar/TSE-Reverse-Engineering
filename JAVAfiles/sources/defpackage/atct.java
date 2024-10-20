package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atct extends astl {
    public int b;
    public byte[] c;

    public atct(int i, byte[] bArr) {
        super(false);
        int i2;
        if (i != 5) {
            if (i == 6) {
                i2 = 38432;
            } else {
                throw new IllegalArgumentException(a.bV(i, "unknown security category: "));
            }
        } else {
            i2 = 14880;
        }
        if (bArr.length == i2) {
            this.b = i;
            this.c = atow.O(bArr);
            return;
        }
        throw new IllegalArgumentException("invalid key size for security category");
    }
}
