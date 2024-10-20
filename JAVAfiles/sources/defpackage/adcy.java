package defpackage;

import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.TriggerGroupNotificationRequest;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adcy extends apyn {
    private final apyi b;
    private final apyi c;

    public adcy(armf armfVar, armf armfVar2, apyi apyiVar, apyi apyiVar2) {
        super(armfVar2, new apyv(adcy.class), armfVar);
        this.b = apys.c(apyiVar);
        this.c = apys.c(apyiVar2);
    }

    @Override // defpackage.apyn
    public final /* synthetic */ ListenableFuture b(Object obj) {
        List list = (List) obj;
        TriggerGroupNotificationRequest triggerGroupNotificationRequest = (TriggerGroupNotificationRequest) list.get(0);
        addt addtVar = (addt) list.get(1);
        if (addtVar.a.isPresent()) {
            ajur ajurVar = new ajur(null);
            ajurVar.q(triggerGroupNotificationRequest.b());
            ajurVar.r(MessagingResult.e);
            return albo.bI(ajurVar.p());
        }
        ajur ajurVar2 = new ajur(null);
        ajurVar2.r(adcx.v(addtVar));
        ajurVar2.q(triggerGroupNotificationRequest.b());
        return albo.bI(ajurVar2.p());
    }

    @Override // defpackage.apyn
    protected final ListenableFuture c() {
        return albo.bF(this.b.d(), this.c.d());
    }
}
