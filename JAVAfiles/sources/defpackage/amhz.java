package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amhz implements apak {
    UNKNOWN(0),
    TEXT(1),
    ATTACHMENT(2),
    SUCCESS_RECEIPT(3),
    FTD_RECEIPT(4),
    LOCATION(5),
    READ_REPORT(6),
    TYPING_INDICATOR(7);

    public final int i;

    amhz(int i) {
        this.i = i;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.i);
    }
}
