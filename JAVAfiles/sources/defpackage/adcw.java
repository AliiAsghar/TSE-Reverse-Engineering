package defpackage;

import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adcw extends apyn {
    private final apyi b;
    private final apyi c;
    private final apyi d;
    private final apyi e;

    public adcw(armf armfVar, armf armfVar2, apyi apyiVar, apyi apyiVar2, apyi apyiVar3, apyi apyiVar4) {
        super(armfVar2, new apyv(adcw.class), armfVar);
        this.b = apys.c(apyiVar);
        this.c = apys.c(apyiVar2);
        this.d = apys.c(apyiVar3);
        this.e = apys.c(apyiVar4);
    }

    @Override // defpackage.apyn
    public final /* synthetic */ ListenableFuture b(Object obj) {
        Optional ofNullable;
        List list = (List) obj;
        ajpe ajpeVar = (ajpe) list.get(0);
        addy addyVar = (addy) list.get(1);
        aday adayVar = (aday) list.get(2);
        adea adeaVar = (adea) list.get(3);
        Conversation b = ajpeVar.b();
        if (b.c() != 2) {
            ofNullable = Optional.empty();
        } else {
            String c = addy.c(b);
            synchronized (addyVar.a) {
                ofNullable = Optional.ofNullable((adrc) ((addw) addyVar.c).get(c));
            }
        }
        if (ofNullable.isPresent()) {
            if (aczf.G()) {
                return new addr((adrc) ofNullable.get()).a;
            }
            adds a = addt.a();
            a.e((adrc) ofNullable.get());
            return albo.bI(a.a());
        }
        if (!ajpeVar.f()) {
            return albo.bI(addt.a().a());
        }
        addz a2 = addyVar.a(ajpeVar);
        if (a2.b == 2) {
            if (aczf.G()) {
                return new addr(a2.a).a;
            }
            adrc adrcVar = a2.a;
            adds a3 = addt.a();
            a3.e(adrcVar);
            return albo.bI(a3.a());
        }
        adrc adrcVar2 = a2.a;
        adrcVar2.aG(adeaVar.b(adrcVar2));
        SettableFuture settableFuture = new addr(adrcVar2).a;
        adrcVar2.aG(adayVar.a(adrcVar2));
        adrcVar2.j();
        return settableFuture;
    }

    @Override // defpackage.apyn
    protected final ListenableFuture c() {
        apyi apyiVar = this.e;
        apyi apyiVar2 = this.d;
        return albo.bF(this.b.d(), this.c.d(), apyiVar2.d(), apyiVar.d());
    }
}
