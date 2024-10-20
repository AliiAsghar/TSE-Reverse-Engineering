package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agpd extends Exception {
    public agpd() {
    }

    public agpd(byte[] bArr) {
        super("Cannot set query for invalid data source.");
    }

    public agpd(Throwable th) {
        super("db query cancelled", th);
    }
}
