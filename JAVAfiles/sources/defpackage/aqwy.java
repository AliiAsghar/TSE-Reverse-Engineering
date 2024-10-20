package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aqwy implements arhc {
    public final arhc a;
    public boolean b = false;
    public int c = 0;
    private final Runnable d;

    public aqwy(arhc arhcVar, Runnable runnable) {
        this.a = arhcVar;
        this.d = runnable;
    }

    public final Runnable a() {
        if (this.b && this.c == 0) {
            return this.d;
        }
        return null;
    }
}
