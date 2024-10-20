package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum tql {
    SUCCEEDED(0),
    FAILED(1),
    TOO_LARGE(2),
    PENDING(3);

    public final int e;

    tql(int i) {
        this.e = i;
    }

    public final boolean a() {
        if (this.e > 0) {
            return true;
        }
        return false;
    }
}
