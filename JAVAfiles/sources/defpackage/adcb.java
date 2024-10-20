package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.ims.rcsservice.ims.ImsEvent;
import com.google.android.ims.util.common.RcsIntents;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adcb extends apyn {
    private final apyi b;
    private final apyi c;
    private final apyi d;
    private final apyi e;

    public adcb(armf armfVar, armf armfVar2, apyi apyiVar, apyi apyiVar2, apyi apyiVar3, apyi apyiVar4) {
        super(armfVar2, new apyv(adcb.class), armfVar);
        this.b = apys.c(apyiVar);
        this.c = apys.c(apyiVar2);
        this.d = apys.c(apyiVar3);
        this.e = apys.c(apyiVar4);
    }

    @Override // defpackage.apyn
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        List list = (List) obj;
        boolean z = false;
        Optional optional = (Optional) list.get(0);
        Conversation conversation = (Conversation) list.get(1);
        acqy acqyVar = (acqy) list.get(2);
        Context context = (Context) list.get(3);
        if (!((Boolean) adbs.c.a()).booleanValue() || conversation.c() == 1) {
            if (((Boolean) adbs.b.a()).booleanValue()) {
                if (!optional.isEmpty()) {
                    anjs anjsVar = new anjs((char[]) null, (byte[]) null);
                    anjsVar.a = 30015;
                    anjsVar.e = (String) optional.get();
                    ImsEvent i = anjsVar.i();
                    Intent intent = new Intent(RcsIntents.ACTION_NEW_EVENT);
                    intent.putExtra(RcsIntents.EXTRA_EVENT, i);
                    advz.a(context, intent, advy.RECEIVE_MESSAGE_PRODUCER_MODULE);
                    z = true;
                }
            } else {
                z = acqyVar.l((String) optional.orElse(null));
            }
        }
        return albo.bI(Boolean.valueOf(z));
    }

    @Override // defpackage.apyn
    protected final ListenableFuture c() {
        apyi apyiVar = this.e;
        apyi apyiVar2 = this.d;
        return albo.bF(this.b.d(), this.c.d(), apyiVar2.d(), apyiVar.d());
    }
}
