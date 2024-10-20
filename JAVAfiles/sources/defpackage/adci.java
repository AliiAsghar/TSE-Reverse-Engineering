package defpackage;

import com.google.android.rcs.client.messaging.RemoveUserFromGroupRequest;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adci extends apyn {
    private final apyi b;
    private final apyi c;

    public adci(armf armfVar, armf armfVar2, apyi apyiVar, apyi apyiVar2) {
        super(armfVar2, new apyv(adci.class), armfVar);
        this.b = apys.c(apyiVar);
        this.c = apys.c(apyiVar2);
    }

    @Override // defpackage.apyn
    public final /* synthetic */ ListenableFuture b(Object obj) {
        List list = (List) obj;
        addz a = ((addy) list.get(1)).a((RemoveUserFromGroupRequest) list.get(0));
        if (a.b == 2) {
            adrc adrcVar = a.a;
            adds a2 = addt.a();
            a2.e(adrcVar);
            return albo.bI(a2.a());
        }
        adrc adrcVar2 = a.a;
        SettableFuture settableFuture = new addr(adrcVar2).a;
        adrcVar2.j();
        return settableFuture;
    }

    @Override // defpackage.apyn
    protected final ListenableFuture c() {
        return albo.bF(this.b.d(), this.c.d());
    }
}
