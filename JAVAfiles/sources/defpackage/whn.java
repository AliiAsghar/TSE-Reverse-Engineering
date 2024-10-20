package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class whn implements apal {
    private final /* synthetic */ int a;

    public whn(int i) {
        this.a = i;
    }

    @Override // defpackage.apal
    public final /* synthetic */ apak a(int i) {
        int i2 = this.a;
        if (i2 != 0) {
            if (i2 != 1) {
                return wja.b(i);
            }
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return wfn.FI_MULTI_SYNC_STATUS_DISABLED;
                }
                return wfn.FI_MULTI_SYNC_STATUS_ENABLED;
            }
            return wfn.FI_MULTI_SYNC_STATUS_UNSPECIFIED;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return who.RCS_SUCCESS_NOTIFICATION_STATE_NOTIFIED;
            }
            return who.RCS_SUCCESS_NOTIFICATION_STATE_SUCCESS_AWAITING_NOTIFY;
        }
        return who.RCS_SUCCESS_NOTIFICATION_STATE_UNSPECIFIED;
    }
}
