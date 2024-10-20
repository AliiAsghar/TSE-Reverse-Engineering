package defpackage;

import android.telephony.TelephonyManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ykf extends yjn {
    private final TelephonyManager a;

    public ykf(wpp wppVar, ykp ykpVar, yjo yjoVar, int i) {
        super(wppVar.r(yjoVar, i));
        this.a = ykpVar.a(i);
    }

    @Override // defpackage.yjn, defpackage.ykb
    public final int c() {
        int simCarrierId;
        simCarrierId = this.a.getSimCarrierId();
        return simCarrierId;
    }
}
