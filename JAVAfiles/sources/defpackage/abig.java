package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abig extends Exception {
    public abig(String str) {
        super(str);
    }

    public abig(Throwable th) {
        super("Failed to make IPC to Fi app", th);
    }
}
