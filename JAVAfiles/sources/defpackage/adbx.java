package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adbx extends apyn {
    private final apyi b;
    private final apyi c;
    private final apyi d;

    public adbx(armf armfVar, armf armfVar2, apyi apyiVar, apyi apyiVar2, apyi apyiVar3) {
        super(armfVar2, new apyv(adbx.class), armfVar);
        this.b = apys.c(apyiVar);
        this.c = apys.c(apyiVar2);
        this.d = apys.c(apyiVar3);
    }

    @Override // defpackage.apyn
    public final /* synthetic */ ListenableFuture b(Object obj) {
        Object obj2;
        adcc adccVar = (adcc) obj;
        advp b = adbs.a.b("produceReceiveMessageResult");
        boolean isPresent = adccVar.b.isPresent();
        apyi apyiVar = this.c;
        if (isPresent) {
            if (adccVar.a.isPresent()) {
                ListenableFuture d = apyiVar.d();
                advr.l(b, "received in-session message, sessionId: %s, messageId: %s", ((adoz) adccVar.b.get()).k, ((adqu) adccVar.a.get()).k);
                return d;
            }
            ListenableFuture d2 = this.d.d();
            advr.l(b, "producing initial message, sessionId: %s", ((adoz) adccVar.b.get()).k);
            return d2;
        }
        ListenableFuture d3 = apyiVar.d();
        if (adccVar.a.isPresent()) {
            obj2 = ((adqu) adccVar.a.get()).k;
        } else {
            obj2 = -1;
        }
        advr.l(b, "producing standalone message, messageId: %s", obj2);
        return d3;
    }

    @Override // defpackage.apyn
    protected final ListenableFuture c() {
        return this.b.d();
    }
}
