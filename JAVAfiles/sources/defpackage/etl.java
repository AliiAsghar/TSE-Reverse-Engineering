package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class etl {
    public final long a;
    public int b;
    private final int c;

    public etl(long j) {
        boolean z;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        d.s(false);
        d.s(j > 0);
        this.a = j;
        this.c = Math.round((((float) j) / 1000000.0f) * (-2.1474836E9f));
    }

    public final boolean a() {
        if (this.b < this.c) {
            return true;
        }
        return false;
    }
}
