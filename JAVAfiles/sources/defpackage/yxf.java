package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yxf extends Exception {
    static final long serialVersionUID = 1;

    public yxf() {
        super("Null content type");
    }

    public yxf(Throwable th) {
        super("Unable to parse MMS content type", th);
    }
}
