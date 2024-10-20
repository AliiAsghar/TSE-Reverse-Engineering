package defpackage;

import com.google.android.rcs.client.messaging.CreateGroupRequest;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adal extends apyn {
    private final apyi b;
    private final apyi c;
    private final apyi d;

    public adal(armf armfVar, armf armfVar2, apyi apyiVar, apyi apyiVar2, apyi apyiVar3) {
        super(armfVar2, new apyv(adal.class), armfVar);
        this.b = apys.c(apyiVar);
        this.c = apys.c(apyiVar2);
        this.d = apys.c(apyiVar3);
    }

    @Override // defpackage.apyn
    public final /* synthetic */ ListenableFuture b(Object obj) {
        List list = (List) obj;
        CreateGroupRequest createGroupRequest = (CreateGroupRequest) list.get(0);
        addt addtVar = (addt) list.get(1);
        adnk adnkVar = (adnk) list.get(2);
        ajur ajurVar = new ajur(null);
        if (addtVar.a.isPresent()) {
            ajurVar.q(adcx.w((adrc) addtVar.a.get()));
            ajurVar.r(MessagingResult.d);
        } else {
            atkm atkmVar = new atkm();
            atkmVar.c(createGroupRequest.d());
            atkv atkvVar = new atkv((byte[]) null);
            atkvVar.j(adcx.gw(adnkVar));
            atkvVar.k(2);
            atkmVar.b(atkvVar.i());
            atkmVar.d(2);
            ajurVar.q(atkmVar.a());
            ajurVar.r(adcx.v(addtVar));
        }
        return albo.bI(ajurVar.p());
    }

    @Override // defpackage.apyn
    protected final ListenableFuture c() {
        apyi apyiVar = this.d;
        return albo.bF(this.b.d(), this.c.d(), apyiVar.d());
    }
}
