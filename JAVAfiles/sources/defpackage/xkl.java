package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xkl extends Exception {
    public xkl(String str, Throwable th) {
        super("A delay was requested while running processBatch. Reason: ".concat(str), th);
    }
}
