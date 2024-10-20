package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vtj extends algf {
    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        vtl vtlVar = (vtl) obj;
        int ordinal = vtlVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return qes.ICON_UPDATE;
                    }
                    throw new IllegalArgumentException("unknown enum value: ".concat(vtlVar.toString()));
                }
                return qes.REMOVE_PARTICIPANT_BY_ADMIN;
            }
            return qes.REMOVE_PARTICIPANT_BY_ALL;
        }
        return qes.SUBJECT_UPDATE;
    }

    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        qes qesVar = (qes) obj;
        vtl vtlVar = vtl.NAME_CHANGE;
        int ordinal = qesVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        return vtl.ICON_CHANGE;
                    }
                    throw new IllegalArgumentException("unknown enum value: ".concat(qesVar.toString()));
                }
                return vtl.REMOVE_USER_BY_ADMIN;
            }
            return vtl.REMOVE_USER_BY_ALL;
        }
        return vtl.NAME_CHANGE;
    }
}
