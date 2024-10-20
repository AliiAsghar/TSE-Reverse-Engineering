package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amyh implements apak {
    UNKNOWN(0),
    BUCKET_ZERO(1),
    BUCKET_1_TO_2(2),
    BUCKET_2_TO_4(3),
    BUCKET_4_TO_8(4),
    BUCKET_8_TO_16(5),
    BUCKET_16_TO_32(6),
    BUCKET_32_TO_64(7),
    BUCKET_64_TO_128(8),
    BUCKET_128_TO_256(9),
    BUCKET_256_TO_512(10),
    BUCKET_512_TO_1024(11),
    BUCKET_1024_OR_MORE(12);

    public final int n;

    amyh(int i) {
        this.n = i;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.n;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.n);
    }
}
