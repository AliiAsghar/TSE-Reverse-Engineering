package j$.time.temporal;

/* loaded from: classes5.dex */
public final /* synthetic */ class l implements k {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ l(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // j$.time.temporal.k
    public final Temporal G(Temporal temporal) {
        int i;
        int i2;
        switch (this.a) {
            case 0:
                int i3 = temporal.get(ChronoField.DAY_OF_WEEK);
                int i4 = this.b;
                if (i3 != i4) {
                    int i5 = i3 - i4;
                    if (i5 >= 0) {
                        i = 7 - i5;
                    } else {
                        i = -i5;
                    }
                    return temporal.d(i, ChronoUnit.DAYS);
                }
                return temporal;
            default:
                int i6 = temporal.get(ChronoField.DAY_OF_WEEK);
                int i7 = this.b;
                if (i6 != i7) {
                    int i8 = i7 - i6;
                    if (i8 >= 0) {
                        i2 = 7 - i8;
                    } else {
                        i2 = -i8;
                    }
                    return temporal.n(i2, ChronoUnit.DAYS);
                }
                return temporal;
        }
    }
}
