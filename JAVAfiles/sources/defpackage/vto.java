package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class vto extends algf {
    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        amma ammaVar = (amma) obj;
        int ordinal = ammaVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            return vxn.INVALID_RECIPIENT_ADDRESS_FORMAT;
                        }
                        throw new IllegalArgumentException("unknown enum value: ".concat(ammaVar.toString()));
                    }
                    return vxn.MULTIPLE_RECIPIENTS_PARSED;
                }
                return vxn.MULTIPLE_RECIPIENT_IDS_RETURNED;
            }
            return vxn.NO_RECIPIENT_IDS_FOR_THREAD_ID;
        }
        return vxn.UNKNOWN_PARSE_ERROR;
    }

    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        vxn vxnVar = (vxn) obj;
        int ordinal = vxnVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            return amma.INVALID_RECIPIENT_ADDRESS_FORMAT;
                        }
                        throw new IllegalArgumentException("unknown enum value: ".concat(vxnVar.toString()));
                    }
                    return amma.MULTIPLE_RECIPIENTS_PARSED;
                }
                return amma.MULTIPLE_RECIPIENT_IDS_RETURNED;
            }
            return amma.NO_RECIPIENT_IDS_FOR_THREAD_ID;
        }
        return amma.UNKNOWN_RCS_GROUP_TELEPHONY_DATA_FAILURE_REASON;
    }
}
