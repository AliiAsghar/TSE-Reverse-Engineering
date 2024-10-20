package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class txf implements akgr {
    final /* synthetic */ qei a;
    final /* synthetic */ String b;
    final /* synthetic */ txg c;

    public txf(txg txgVar, qei qeiVar, String str) {
        this.a = qeiVar;
        this.b = str;
        this.c = txgVar;
    }

    @Override // defpackage.akgr
    public final /* bridge */ /* synthetic */ akfd a() {
        return new akgc("identity_details_data_service_" + this.a.d + "_" + this.b);
    }

    @Override // defpackage.akgr
    public final ListenableFuture b() {
        txg txgVar = this.c;
        if (!txgVar.d.p()) {
            return aktp.ag(Optional.empty());
        }
        String str = this.b;
        qei qeiVar = this.a;
        akul i = aktp.ai(new qpk(txgVar, str, 20), txgVar.b).i(new tsz(txgVar, 13), txgVar.c);
        akul b = ((ttb) txgVar.e.b()).b(qeiVar.d);
        akul ag = aktp.ag(qeiVar.d);
        return aktp.an(ag, b, i).h(new imh((Object) txgVar, (Object) ag, (Object) b, (Object) i, 8), txgVar.b);
    }
}
