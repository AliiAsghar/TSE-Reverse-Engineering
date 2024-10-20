package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dok {
    public static final dhv a(doj dojVar) {
        long j = dojVar.b;
        return dojVar.a.subSequence(djc.d(j), djc.c(j));
    }

    public static final dhv b(doj dojVar, int i) {
        return dojVar.a.subSequence(djc.c(dojVar.b), Math.min(djc.c(dojVar.b) + i, dojVar.a().length()));
    }

    public static final dhv c(doj dojVar, int i) {
        int d = djc.d(dojVar.b) - i;
        long j = dojVar.b;
        return dojVar.a.subSequence(Math.max(0, d), djc.d(j));
    }
}
