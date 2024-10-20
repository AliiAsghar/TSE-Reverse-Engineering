package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akfy {
    public static final akfy a = new akfy(akfw.LOCAL_STATE_CHANGE);
    public static final akfy b = new akfy(akfw.REMOTE_STATE_CHANGE);
    public final akfw c;

    private akfy(akfw akfwVar) {
        this.c = akfwVar;
    }

    public final String toString() {
        return "ResultPropagator.Update for CallReason ".concat(String.valueOf(String.valueOf(this.c)));
    }
}
