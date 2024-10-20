package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aics extends RuntimeException {
    public aics(String str) {
        super(str);
    }

    public aics(Throwable th) {
        super("Cobalt registry could not be parsed from base64 string", th);
    }
}
