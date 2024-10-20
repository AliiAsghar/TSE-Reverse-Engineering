package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class esh extends Exception {
    public esh(String str) {
        super(str);
    }

    public static esh a(Exception exc) {
        if (exc instanceof esh) {
            return (esh) exc;
        }
        return new esh(exc, null);
    }

    public esh(Throwable th) {
        super(th);
    }

    public esh(Throwable th, byte[] bArr) {
        super(th);
    }
}
