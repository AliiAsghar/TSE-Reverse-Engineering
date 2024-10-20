package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class psr extends IllegalArgumentException {
    public psr(String str) {
        super(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static psr a(String str, Throwable th) {
        return new psr(String.format("%s cannot be converted into a ChatEndpoint.", str), th);
    }

    private psr(String str, Throwable th) {
        super(str, th);
    }
}
