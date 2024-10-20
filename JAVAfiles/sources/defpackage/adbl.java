package defpackage;

import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.TraceId;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adbl extends apyn {
    private final apyi b;
    private final apyi c;
    private final apyi d;
    private final apyi e;
    private final apyi f;

    public adbl(armf armfVar, armf armfVar2, apyi apyiVar, apyi apyiVar2, apyi apyiVar3, apyi apyiVar4, apyi apyiVar5) {
        super(armfVar2, new apyv(adbl.class), armfVar);
        this.b = apys.c(apyiVar);
        this.c = apys.c(apyiVar2);
        this.d = apys.c(apyiVar3);
        this.e = apys.c(apyiVar4);
        this.f = apys.c(apyiVar5);
    }

    @Override // defpackage.apyn
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        Optional empty;
        List list = (List) obj;
        Optional optional = (Optional) list.get(0);
        wbk wbkVar = (wbk) list.get(1);
        ajtr ajtrVar = (ajtr) list.get(2);
        TraceId traceId = (TraceId) list.get(3);
        ajtc ajtcVar = (ajtc) list.get(4);
        acyz acyzVar = adbf.a;
        if (optional.isPresent()) {
            aozy createBuilder = wcv.a.createBuilder();
            wdu wduVar = (wdu) ajtcVar.m().fu(traceId);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wcv wcvVar = (wcv) createBuilder.b;
            wduVar.getClass();
            wcvVar.c = wduVar;
            wcvVar.b |= 1;
            wca wcaVar = (wca) ajtrVar.m().fu((Message) optional.get());
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            wcv wcvVar2 = (wcv) apagVar;
            wcaVar.getClass();
            wcvVar2.e = wcaVar;
            wcvVar2.b |= 4;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            wcv wcvVar3 = (wcv) createBuilder.b;
            wbkVar.getClass();
            wcvVar3.d = wbkVar;
            wcvVar3.b |= 2;
            empty = Optional.of((wcv) createBuilder.s());
        } else {
            empty = Optional.empty();
        }
        return albo.bI(empty);
    }

    @Override // defpackage.apyn
    protected final ListenableFuture c() {
        apyi apyiVar = this.f;
        apyi apyiVar2 = this.e;
        apyi apyiVar3 = this.d;
        return albo.bF(this.b.d(), this.c.d(), apyiVar3.d(), apyiVar2.d(), apyiVar.d());
    }
}
