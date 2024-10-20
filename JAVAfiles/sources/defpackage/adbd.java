package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_GroupNotification;
import com.google.android.rcs.client.messaging.data.GroupEvent;
import com.google.android.rcs.client.messaging.data.GroupInformation;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adbd extends apyn {
    private final apyi b;
    private final apyi c;
    private final apyi d;
    private final apyi e;
    private final apyi f;

    public adbd(armf armfVar, armf armfVar2, apyi apyiVar, apyi apyiVar2, apyi apyiVar3, apyi apyiVar4, apyi apyiVar5) {
        super(armfVar2, new apyv(adbd.class), armfVar);
        this.b = apys.c(apyiVar);
        this.c = apys.c(apyiVar2);
        this.d = apys.c(apyiVar3);
        this.e = apys.c(apyiVar4);
        this.f = apys.c(apyiVar5);
    }

    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object, aegu] */
    @Override // defpackage.apyn
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        List list = (List) obj;
        addl addlVar = (addl) list.get(0);
        adqg adqgVar = (adqg) list.get(1);
        ajtk ajtkVar = (ajtk) list.get(2);
        ajto ajtoVar = (ajto) list.get(3);
        ajsu ajsuVar = (ajsu) list.get(4);
        if (!((Boolean) adbc.a.a()).booleanValue()) {
            return albo.bI(wcs.a);
        }
        aozy createBuilder = wct.a.createBuilder();
        wbk wbkVar = (wbk) ajtkVar.m().fu(((AutoValue_GroupNotification) addlVar.a).a);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wct wctVar = (wct) createBuilder.b;
        wbkVar.getClass();
        wctVar.e = wbkVar;
        wctVar.b |= 2;
        if (((AutoValue_GroupNotification) addlVar.a).b.isPresent()) {
            wbx a = ajtoVar.apply((GroupInformation) ((AutoValue_GroupNotification) addlVar.a).b.get());
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wct wctVar2 = (wct) createBuilder.b;
            a.getClass();
            wctVar2.d = a;
            wctVar2.c = 4;
        }
        if (((AutoValue_GroupNotification) addlVar.a).c.isPresent()) {
            wbw apply = ajsuVar.apply((GroupEvent) ((AutoValue_GroupNotification) addlVar.a).c.get());
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wct wctVar3 = (wct) createBuilder.b;
            apply.getClass();
            wctVar3.d = apply;
            wctVar3.c = 3;
        }
        wct wctVar4 = (wct) createBuilder.s();
        aozy createBuilder2 = wcr.a.createBuilder();
        wbk wbkVar2 = wctVar4.e;
        if (wbkVar2 == null) {
            wbkVar2 = wbk.a;
        }
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar = createBuilder2.b;
        wcr wcrVar = (wcr) apagVar;
        wbkVar2.getClass();
        wcrVar.e = wbkVar2;
        wcrVar.b = 1 | wcrVar.b;
        if (!apagVar.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar2 = createBuilder2.b;
        wcr wcrVar2 = (wcr) apagVar2;
        wctVar4.getClass();
        wcrVar2.d = wctVar4;
        wcrVar2.c = 3;
        if (!apagVar2.isMutable()) {
            createBuilder2.u();
        }
        wcr wcrVar3 = (wcr) createBuilder2.b;
        wcrVar3.b |= 8;
        wcrVar3.h = 0;
        apct j = aotl.j(adqgVar.c.f());
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        wcr wcrVar4 = (wcr) createBuilder2.b;
        j.getClass();
        wcrVar4.f = j;
        wcrVar4.b |= 2;
        return adqgVar.g((wcr) createBuilder2.s());
    }

    @Override // defpackage.apyn
    protected final ListenableFuture c() {
        apyi apyiVar = this.f;
        apyi apyiVar2 = this.e;
        apyi apyiVar3 = this.d;
        return albo.bF(this.b.d(), this.c.d(), apyiVar3.d(), apyiVar2.d(), apyiVar.d());
    }
}
