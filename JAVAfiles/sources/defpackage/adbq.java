package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.ims.rcsservice.ims.ImsEvent;
import com.google.android.ims.util.common.RcsIntents;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adbq extends apyn {
    private final apyi b;
    private final apyi c;
    private final apyi d;
    private final apyi e;
    private final apyi f;

    public adbq(armf armfVar, armf armfVar2, apyi apyiVar, apyi apyiVar2, apyi apyiVar3, apyi apyiVar4, apyi apyiVar5) {
        super(armfVar2, new apyv(adbq.class), armfVar);
        this.b = apys.c(apyiVar);
        this.c = apys.c(apyiVar2);
        this.d = apys.c(apyiVar3);
        this.e = apys.c(apyiVar4);
        this.f = apys.c(apyiVar5);
    }

    @Override // defpackage.apyn
    public final /* synthetic */ ListenableFuture b(Object obj) {
        List list = (List) obj;
        adcc adccVar = (adcc) list.get(0);
        boolean z = true;
        Optional optional = (Optional) list.get(1);
        acqy acqyVar = (acqy) list.get(3);
        Context context = (Context) list.get(4);
        Optional optional2 = adccVar.b;
        acyz acyzVar = adbf.a;
        if (!optional2.isEmpty() && !adccVar.a.isPresent()) {
            if (((Boolean) adbf.a.a()).booleanValue()) {
                if (!optional.isEmpty()) {
                    anjs anjsVar = new anjs((char[]) null, (byte[]) null);
                    anjsVar.a = 30015;
                    anjsVar.e = (String) optional.get();
                    ImsEvent i = anjsVar.i();
                    Intent intent = new Intent(RcsIntents.ACTION_NEW_EVENT);
                    intent.putExtra(RcsIntents.EXTRA_EVENT, i);
                    advz.a(context, intent, advy.RECEIVE_MESSAGE_PRODUCER_MODULE2);
                }
            } else {
                z = acqyVar.l((String) optional.orElse(null));
            }
        }
        return albo.bI(Boolean.valueOf(z));
    }

    @Override // defpackage.apyn
    protected final ListenableFuture c() {
        apyi apyiVar = this.f;
        apyi apyiVar2 = this.e;
        apyi apyiVar3 = this.d;
        return albo.bF(this.b.d(), this.c.d(), apyiVar3.d(), apyiVar2.d(), apyiVar.d());
    }
}
