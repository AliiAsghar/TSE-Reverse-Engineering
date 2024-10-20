package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class unr extends Exception {
    public unr() {
        super("queue is null");
    }

    public unr(IllegalArgumentException illegalArgumentException) {
        super("no handler", illegalArgumentException);
    }
}
