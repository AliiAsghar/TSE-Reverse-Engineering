package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zeq {
    public volatile boolean a;

    public final void a() {
        if (!this.a) {
        } else {
            throw new IllegalStateException("Already released");
        }
    }
}
