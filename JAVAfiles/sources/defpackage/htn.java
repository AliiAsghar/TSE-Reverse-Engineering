package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class htn extends hts {
    @Override // defpackage.hts
    public final float a(int i, int i2, int i3, int i4) {
        int ceil = (int) Math.ceil(Math.max(i2 / i4, i / i3));
        int i5 = 1;
        if (Math.max(1, Integer.highestOneBit(ceil)) >= ceil) {
            i5 = 0;
        }
        return 1.0f / (r2 << i5);
    }

    @Override // defpackage.hts
    public final int b(int i, int i2, int i3, int i4) {
        return 1;
    }
}
