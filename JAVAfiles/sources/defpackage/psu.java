package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class psu extends psx {
    public psu(ahby ahbyVar) {
        super("Jibe ContactsService failed.");
        albo.U(!ahbyVar.succeeded(), "Should not create exception with a successful result.");
    }

    public psu(String str, Throwable th) {
        super(str, th);
    }
}
