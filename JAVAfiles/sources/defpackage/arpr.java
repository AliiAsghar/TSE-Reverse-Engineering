package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arpr implements arpe {
    public static final arpr a = new arpr();

    private arpr() {
    }

    public final String toString() {
        return "This continuation is already complete";
    }

    @Override // defpackage.arpe
    public final arpi u() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // defpackage.arpe
    public final void w(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }
}
