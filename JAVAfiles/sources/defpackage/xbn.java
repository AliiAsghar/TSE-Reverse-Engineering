package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xbn implements xbm {
    public static final uuf a = uuh.g(uuh.b, "server_side_carrier_config_override", apeq.a);
    private final wfh b;

    public xbn(wfh wfhVar) {
        this.b = wfhVar;
    }

    @Override // defpackage.xbm
    public final Bundle a(int i) {
        uuf uufVar = a;
        uufVar.getClass();
        if (((yjy) this.b.a).a() > 1) {
            return new Bundle();
        }
        Object e = uufVar.e();
        e.getClass();
        apeq apeqVar = (apeq) e;
        if (d.F(apeqVar, ((utx) uufVar).c)) {
            return new Bundle();
        }
        return yyb.cO(apeqVar);
    }
}
