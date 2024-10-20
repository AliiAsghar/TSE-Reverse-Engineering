package defpackage;

import com.google.android.rcs.client.messaging.RemoveUserFromGroupRequest;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adch extends apyn {
    private final apyi b;
    private final apyi c;
    private final apyi d;
    private final apyi e;

    public adch(armf armfVar, armf armfVar2, apyi apyiVar, apyi apyiVar2, apyi apyiVar3, apyi apyiVar4) {
        super(armfVar2, new apyv(adch.class), armfVar);
        this.b = apys.c(apyiVar);
        this.c = apys.c(apyiVar2);
        this.d = apys.c(apyiVar3);
        this.e = apys.c(apyiVar4);
    }

    @Override // defpackage.apyn
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        List list = (List) obj;
        if (!((RemoveUserFromGroupRequest) list.get(0)).c().a().equals(((adnk) list.get(1)).j().map(new acpr(19)).map(new acpr(20)).orElse(""))) {
            return this.d.d();
        }
        return this.c.d();
    }

    @Override // defpackage.apyn
    protected final ListenableFuture c() {
        return albo.bF(this.b.d(), this.e.d());
    }
}
