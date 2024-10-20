package defpackage;

import com.google.android.rcs.client.messaging.CreateGroupRequest;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adam extends apyn {
    private final apyi b;
    private final apyi c;
    private final apyi d;
    private final apyi e;
    private final apyi f;

    public adam(armf armfVar, armf armfVar2, apyi apyiVar, apyi apyiVar2, apyi apyiVar3, apyi apyiVar4, apyi apyiVar5) {
        super(armfVar2, new apyv(adam.class), armfVar);
        this.b = apys.c(apyiVar);
        this.c = apys.c(apyiVar2);
        this.d = apys.c(apyiVar3);
        this.e = apys.c(apyiVar4);
        this.f = apys.c(apyiVar5);
    }

    /* JADX WARN: Type inference failed for: r10v6, types: [addv, java.lang.Object] */
    @Override // defpackage.apyn
    public final /* synthetic */ ListenableFuture b(Object obj) {
        addz o;
        List list = (List) obj;
        CreateGroupRequest createGroupRequest = (CreateGroupRequest) list.get(0);
        addy addyVar = (addy) list.get(1);
        adnk adnkVar = (adnk) list.get(2);
        aday adayVar = (aday) list.get(3);
        adea adeaVar = (adea) list.get(4);
        String[] strArr = (String[]) Collection.EL.stream(createGroupRequest.b()).map(new acpr(14)).toArray(new adak(0));
        String d = createGroupRequest.d();
        String e = createGroupRequest.e();
        String gw = adcx.gw(adnkVar);
        synchronized (addyVar.a) {
            atkv atkvVar = new atkv((byte[]) null);
            adrc adrcVar = (adrc) ((addw) addyVar.c).get(d);
            if (adrcVar == null) {
                adrcVar = addyVar.b.createOutgoingSession(gw);
                adrcVar.bo();
                adrcVar.aV(strArr);
                adrcVar.O = adqq.CONFERENCE_FACTORY_URI;
                adrcVar.q = e;
                adrcVar.z = d;
                if (adrcVar.ak()) {
                    adrcVar.A = d;
                }
                atkvVar.a = 1;
                adrcVar.aG(new addx(addyVar, d, adrcVar));
                ((addw) addyVar.c).put(d, adrcVar);
            } else {
                atkvVar.a = 2;
            }
            atkvVar.p(adrcVar);
            o = atkvVar.o();
        }
        if (o.b == 2) {
            adrc adrcVar2 = o.a;
            adds a = addt.a();
            a.e(adrcVar2);
            return albo.bI(a.a());
        }
        adrc adrcVar3 = o.a;
        SettableFuture settableFuture = new addr(adrcVar3).a;
        adrcVar3.aG(adayVar.a(adrcVar3));
        adrcVar3.aG(adeaVar.b(adrcVar3));
        adrcVar3.j();
        return settableFuture;
    }

    @Override // defpackage.apyn
    protected final ListenableFuture c() {
        apyi apyiVar = this.f;
        apyi apyiVar2 = this.e;
        apyi apyiVar3 = this.d;
        return albo.bF(this.b.d(), this.c.d(), apyiVar3.d(), apyiVar2.d(), apyiVar.d());
    }
}
