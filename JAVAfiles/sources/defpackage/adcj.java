package defpackage;

import com.google.android.rcs.client.messaging.RemoveUserFromGroupRequest;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adcj extends apyn {
    private final apyi b;
    private final apyi c;

    public adcj(armf armfVar, armf armfVar2, apyi apyiVar, apyi apyiVar2) {
        super(armfVar2, new apyv(adcj.class), armfVar);
        this.b = apys.c(apyiVar);
        this.c = apys.c(apyiVar2);
    }

    @Override // defpackage.apyn
    public final /* synthetic */ ListenableFuture b(Object obj) {
        List list = (List) obj;
        RemoveUserFromGroupRequest removeUserFromGroupRequest = (RemoveUserFromGroupRequest) list.get(0);
        addt addtVar = (addt) list.get(1);
        if (addtVar.a.isPresent()) {
            Object obj2 = addtVar.a.get();
            adon adonVar = (adon) obj2;
            if (adonVar.a != adpk.STOPPED && adonVar.a != adpk.STOPPING) {
                adrc adrcVar = (adrc) obj2;
                adce adceVar = new adce(adrcVar, removeUserFromGroupRequest.b());
                adrcVar.aG(adceVar.c);
                adrcVar.aW(adpi.LEAVE);
                adoz adozVar = (adoz) obj2;
                if (adozVar.p) {
                    adonVar.l();
                    return adceVar;
                }
                adozVar.ah(5, 29);
                return adceVar;
            }
        }
        ajur ajurVar = new ajur(null);
        ajurVar.q(removeUserFromGroupRequest.b());
        ajurVar.r(adcx.v(addtVar));
        return albo.bI(ajurVar.p());
    }

    @Override // defpackage.apyn
    protected final ListenableFuture c() {
        return albo.bF(this.b.d(), this.c.d());
    }
}
