package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_Conversation;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adbw extends apyn {
    private final apyi b;
    private final apyi c;
    private final apyi d;
    private final apyi e;
    private final apyi f;
    private final apyi g;
    private final apyi h;

    public adbw(armf armfVar, armf armfVar2, apyi apyiVar, apyi apyiVar2, apyi apyiVar3, apyi apyiVar4, apyi apyiVar5, apyi apyiVar6, apyi apyiVar7) {
        super(armfVar2, new apyv(adbw.class), armfVar);
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
        Optional optional;
        List list = (List) obj;
        adcc adccVar = (adcc) list.get(0);
        apyh apyhVar = (apyh) list.get(1);
        apyh apyhVar2 = (apyh) list.get(2);
        Optional optional2 = (Optional) list.get(3);
        addy addyVar = (addy) list.get(4);
        aday adayVar = (aday) list.get(5);
        adea adeaVar = (adea) list.get(6);
        Optional optional3 = adccVar.b;
        advp advpVar = adbs.a;
        adrc adrcVar = (adrc) optional3.orElseThrow(new zhh(18));
        if (optional2.isPresent()) {
            adrcVar.j();
            adrcVar.aO((adra) optional2.get());
            optional = Optional.empty();
        } else {
            adcx.e(apyhVar);
            Optional optional4 = (Optional) adcx.e(apyhVar2);
            Conversation w = adcx.w(adrcVar);
            addz b = addyVar.b(w, (adrv) adrcVar);
            advr.d(adbs.a.b("produceIncomingSessionResult"), "Incoming session added to session store with result: %s", b);
            adax a = adayVar.a(adrcVar);
            if (((AutoValue_Conversation) w).c == 1) {
                int i = b.b;
                int i2 = i - 1;
                if (i != 0) {
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2) {
                                b.a.n(5, 57);
                            }
                        } else {
                            adrcVar.j();
                            adrcVar.ah(5, 57);
                        }
                    }
                    adrcVar.aG(a);
                    adrcVar.j();
                    adrcVar.C();
                } else {
                    throw null;
                }
            } else {
                int i3 = b.b;
                int i4 = i3 - 1;
                if (i3 != 0) {
                    if (i4 != 0) {
                        if (i4 != 1) {
                            if (i4 == 2) {
                                b.a.n(5, 57);
                            }
                        } else {
                            adrcVar.j();
                            adrcVar.ah(5, 57);
                        }
                    }
                    adrcVar.aG(a);
                    adrcVar.aG(adeaVar.b(adrcVar));
                    adrcVar.j();
                    adrcVar.C();
                } else {
                    throw null;
                }
            }
            optional = optional4;
        }
        return albo.bI(optional);
    }

    @Override // defpackage.apyn
    protected final ListenableFuture c() {
        apyi apyiVar = this.c;
        ListenableFuture d = this.b.d();
        ListenableFuture a = apys.a(apyiVar.d());
        ListenableFuture a2 = apys.a(this.d.d());
        apyi apyiVar2 = this.h;
        apyi apyiVar3 = this.g;
        return albo.bF(d, a, a2, this.e.d(), this.f.d(), apyiVar3.d(), apyiVar2.d());
    }
}
