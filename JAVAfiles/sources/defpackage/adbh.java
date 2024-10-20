package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adbh extends apyn {
    private final apyi b;

    public adbh(armf armfVar, armf armfVar2, apyi apyiVar) {
        super(armfVar2, new apyv(adbh.class), armfVar);
        this.b = apys.c(apyiVar);
    }

    @Override // defpackage.apyn
    public final /* synthetic */ ListenableFuture b(Object obj) {
        wbk wbkVar;
        String str;
        wcz s;
        String str2;
        adcc adccVar = (adcc) obj;
        Optional optional = adccVar.b;
        acyz acyzVar = adbf.a;
        int i = 3;
        if (optional.isPresent()) {
            Object obj2 = adccVar.b.get();
            adoz adozVar = (adoz) obj2;
            if (adozVar.ak()) {
                str = adozVar.A;
            } else {
                str = adozVar.z;
            }
            if (str == null) {
                if (true != adozVar.ak()) {
                    str2 = "contributionId is null in SIMPLE-IM session";
                } else {
                    str2 = "conversationId is null in CPM session";
                }
                throw new IllegalArgumentException(str2);
            }
            aozy createBuilder = wbk.a.createBuilder();
            aozy createBuilder2 = wcy.a.createBuilder();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            wcy wcyVar = (wcy) createBuilder2.b;
            wcyVar.b |= 1;
            wcyVar.c = str;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wbk wbkVar2 = (wbk) createBuilder.b;
            wcy wcyVar2 = (wcy) createBuilder2.s();
            wcyVar2.getClass();
            wbkVar2.e = wcyVar2;
            wbkVar2.b |= 4;
            adrc adrcVar = (adrc) obj2;
            if (!adrcVar.F) {
                if (adrcVar.K) {
                    i = 4;
                } else {
                    i = 2;
                }
            }
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wbk wbkVar3 = (wbk) createBuilder.b;
            wbkVar3.c = i - 1;
            wbkVar3.b |= 1;
            if (adrcVar.F) {
                s = adcx.t(adrcVar.J);
            } else {
                s = adcx.s(adozVar.y());
            }
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wbk wbkVar4 = (wbk) createBuilder.b;
            s.getClass();
            wbkVar4.d = s;
            wbkVar4.b |= 2;
            wbkVar = (wbk) createBuilder.s();
        } else if (adccVar.a.isPresent()) {
            adqu adquVar = (adqu) adccVar.a.get();
            if (!adquVar.o) {
                String uuid = UUID.randomUUID().toString();
                aozy createBuilder3 = wbk.a.createBuilder();
                if (!adquVar.o) {
                    if (adquVar.q) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                }
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                wbk wbkVar5 = (wbk) createBuilder3.b;
                wbkVar5.c = i - 1;
                wbkVar5.b |= 1;
                aozy createBuilder4 = wcy.a.createBuilder();
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                wcy wcyVar3 = (wcy) createBuilder4.b;
                uuid.getClass();
                wcyVar3.b = 1 | wcyVar3.b;
                wcyVar3.c = uuid;
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                wbk wbkVar6 = (wbk) createBuilder3.b;
                wcy wcyVar4 = (wcy) createBuilder4.s();
                wcyVar4.getClass();
                wbkVar6.e = wcyVar4;
                wbkVar6.b |= 4;
                wcz s2 = adcx.s(adquVar.c);
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                wbk wbkVar7 = (wbk) createBuilder3.b;
                s2.getClass();
                wbkVar7.d = s2;
                wbkVar7.b |= 2;
                wbkVar = (wbk) createBuilder3.s();
            } else {
                throw new IllegalArgumentException("Group message was not sent/received with a session!");
            }
        } else {
            throw new IllegalArgumentException("No message or session presented");
        }
        return albo.bI(wbkVar);
    }

    @Override // defpackage.apyn
    protected final ListenableFuture c() {
        return this.b.d();
    }
}
