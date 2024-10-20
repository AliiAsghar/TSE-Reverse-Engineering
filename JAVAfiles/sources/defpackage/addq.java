package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class addq implements addv {
    private final adod a;

    public addq(adod adodVar) {
        this.a = adodVar;
    }

    @Override // defpackage.addv
    public final adrv createIncomingSession(aion aionVar) {
        throw null;
    }

    @Override // defpackage.addv
    public final adrq createOutgoingSession(String str) {
        return this.a.createOutgoingSession(str);
    }

    @Override // defpackage.addv
    public final adrq createOutgoingSlmSession(String str) {
        return this.a.createOutgoingSlmSession(str);
    }
}
