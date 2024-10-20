package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apcu extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    public apcu() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final apba a() {
        return new apba(getMessage());
    }
}
