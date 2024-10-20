package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jkd {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/DirectSendInputsUiAdapter");
    public final armf b;
    public final afkq c;
    public final arqr d = jbs.l;

    public jkd(armf armfVar, afkq afkqVar) {
        this.b = armfVar;
        this.c = afkqVar;
    }

    public static final aeny a(agfm agfmVar) {
        if (agfmVar instanceof agfj) {
            return aenx.a;
        }
        if (agfmVar instanceof agfi) {
            return aenw.e;
        }
        if (agfmVar instanceof agfk) {
            return b(((agfk) agfmVar).a.a);
        }
        if (agfmVar instanceof agfl) {
            return b(((agfl) agfmVar).b);
        }
        throw new armm();
    }

    private static final aenw b(agek agekVar) {
        int ordinal = agekVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1 && ordinal != 2) {
                if (ordinal != 4) {
                    if (ordinal != 5) {
                        if (ordinal != 6) {
                            if (ordinal != 8) {
                                return null;
                            }
                        } else {
                            return aenw.f;
                        }
                    }
                } else {
                    return aenw.e;
                }
            }
            return aenw.d;
        }
        return aenw.c;
    }
}
