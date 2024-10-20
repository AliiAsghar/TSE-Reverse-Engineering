package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adph extends Exception {
    private static final long serialVersionUID = 1;

    public adph() {
    }

    public adph(Throwable th) {
        super("Unable to parse remote SDP", th);
    }
}
