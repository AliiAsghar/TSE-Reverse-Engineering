package defpackage;

import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adbk extends apyn {
    private final apyi b;
    private final apyi c;
    private final apyi d;
    private final apyi e;
    private final apyi f;
    private final apyi g;
    private final apyi h;

    public adbk(armf armfVar, armf armfVar2, apyi apyiVar, apyi apyiVar2, apyi apyiVar3, apyi apyiVar4, apyi apyiVar5, apyi apyiVar6, apyi apyiVar7) {
        super(armfVar2, new apyv(adbk.class), armfVar);
        this.b = apys.c(apyiVar);
        this.c = apys.c(apyiVar2);
        this.d = apys.c(apyiVar3);
        this.e = apys.c(apyiVar4);
        this.f = apys.c(apyiVar5);
        this.g = apys.c(apyiVar6);
        this.h = apys.c(apyiVar7);
    }

    @Override // defpackage.apyn
    public final /* synthetic */ ListenableFuture b(Object obj) {
        Optional of;
        List list = (List) obj;
        adcc adccVar = (adcc) list.get(0);
        apyh apyhVar = (apyh) list.get(1);
        Conversation conversation = (Conversation) list.get(2);
        Optional optional = (Optional) list.get(3);
        addy addyVar = (addy) list.get(4);
        aday adayVar = (aday) list.get(5);
        adea adeaVar = (adea) list.get(6);
        Optional optional2 = adccVar.b;
        acyz acyzVar = adbf.a;
        if (optional2.isEmpty()) {
            of = Optional.empty();
        } else {
            Object obj2 = adccVar.b.get();
            adoz adozVar = (adoz) obj2;
            if (adozVar.p) {
                of = Optional.of(obj2);
            } else if (optional.isPresent()) {
                ((adon) obj2).j();
                ((adrc) obj2).aO((adra) optional.get());
                of = Optional.empty();
            } else {
                adcx.e(apyhVar);
                addz b = addyVar.b(conversation, (adrv) obj2);
                advr.c("Incoming session added to session store with result: %s", b);
                if (b.b != 1 && obj2.equals(b.a)) {
                    of = Optional.of(obj2);
                } else {
                    adrc adrcVar = (adrc) obj2;
                    adax a = adayVar.a(adrcVar);
                    adrc adrcVar2 = b.a;
                    if (conversation.c() == 1) {
                        int i = b.b;
                        int i2 = i - 1;
                        if (i != 0) {
                            if (i2 != 0) {
                                if (i2 != 1) {
                                    if (i2 == 2) {
                                        adrcVar2.n(5, 57);
                                    }
                                } else {
                                    ((adon) obj2).j();
                                    adozVar.ah(5, 57);
                                }
                                of = Optional.of(obj2);
                            }
                            adrcVar.aG(a);
                            ((adon) obj2).j();
                            adozVar.C();
                            of = Optional.of(obj2);
                        } else {
                            throw null;
                        }
                    } else if (conversation.c() == 2) {
                        int i3 = b.b;
                        int i4 = i3 - 1;
                        if (i3 != 0) {
                            if (i4 != 0) {
                                if (i4 != 1) {
                                    if (i4 == 2) {
                                        adrcVar2.n(5, 57);
                                    }
                                } else {
                                    ((adon) obj2).j();
                                    adozVar.ah(5, 57);
                                }
                                of = Optional.of(obj2);
                            }
                            adrcVar.aG(a);
                            adrcVar.aG(adeaVar.b(adrcVar));
                            ((adon) obj2).j();
                            adozVar.C();
                            of = Optional.of(obj2);
                        } else {
                            throw null;
                        }
                    } else {
                        throw new IllegalStateException("Unexpected conversation type ".concat(ajgk.E(conversation.c())));
                    }
                }
            }
        }
        return albo.bI(of);
    }

    @Override // defpackage.apyn
    protected final ListenableFuture c() {
        apyi apyiVar = this.c;
        ListenableFuture d = this.b.d();
        ListenableFuture a = apys.a(apyiVar.d());
        apyi apyiVar2 = this.h;
        apyi apyiVar3 = this.g;
        apyi apyiVar4 = this.f;
        return albo.bF(d, a, this.d.d(), this.e.d(), apyiVar4.d(), apyiVar3.d(), apyiVar2.d());
    }
}
