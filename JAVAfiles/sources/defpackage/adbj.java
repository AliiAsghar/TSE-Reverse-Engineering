package defpackage;

import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adbj extends apyn {
    private final apyi b;
    private final apyi c;
    private final apyi d;

    public adbj(armf armfVar, armf armfVar2, apyi apyiVar, apyi apyiVar2, apyi apyiVar3) {
        super(armfVar2, new apyv(adbj.class), armfVar);
        this.b = apys.c(apyiVar);
        this.c = apys.c(apyiVar2);
        this.d = apys.c(apyiVar3);
    }

    @Override // defpackage.apyn
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        List list = (List) obj;
        Conversation conversation = (Conversation) list.get(0);
        Optional optional = (Optional) list.get(1);
        addi addiVar = (addi) list.get(2);
        acyz acyzVar = adbf.a;
        return albo.bI(optional.map(new yuq(addiVar, conversation, 12, null)));
    }

    @Override // defpackage.apyn
    protected final ListenableFuture c() {
        apyi apyiVar = this.d;
        return albo.bF(this.b.d(), this.c.d(), apyiVar.d());
    }
}
