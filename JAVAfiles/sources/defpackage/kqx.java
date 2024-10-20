package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kqx implements apya {
    private final krv a;
    private final int b;
    private final kqp c;
    private final kqi d;

    public kqx(krv krvVar, kqp kqpVar, kqi kqiVar, int i) {
        this.a = krvVar;
        this.c = kqpVar;
        this.d = kqiVar;
        this.b = i;
    }

    @Override // defpackage.armf, defpackage.arme
    public final Object b() {
        switch (this.b) {
            case 0:
                return new apxa();
            case 1:
                return new lkd((lkt) this.d.d.b());
            case 2:
                return new lkt((arwe) this.d.c.b());
            case 3:
                arpi arpiVar = (arpi) this.d.b.b();
                apxa apxaVar = (apxa) this.d.a.b();
                arpiVar.getClass();
                apxaVar.getClass();
                if (aiut.g()) {
                    arwe e = arwi.e(arpiVar.plus(new aryj(null)));
                    apxaVar.a(new akdu(e, 1));
                    return e;
                }
                throw new IllegalStateException("The ActivityRetained coroutine scope cannot be initialized/provided on any thread other than the main thread, because initializing it on a different thread isn't safe. See b/157167956 for background.");
            case 4:
                krv krvVar = this.a;
                return akdp.s(krvVar.Rh(), (aneo) krvVar.ba.b());
            case 5:
                return new zge((Context) this.a.n.b());
            case 6:
                ajwt ajwtVar = (ajwt) this.c.b.b();
                ahqr ahqrVar = (ahqr) this.a.id.b();
                ahpf ahpfVar = (ahpf) this.a.py.b();
                xcj xcjVar = (xcj) this.a.a.p.b();
                krv krvVar2 = this.a;
                ohm G = krvVar2.a.G();
                mgu mguVar = (mgu) krvVar2.tV.b();
                xcs xcsVar = (xcs) this.a.ih.b();
                kor korVar = (kor) this.a.f8if.b();
                apxv.a(this.a.a.dH);
                krv krvVar3 = this.a;
                krx krxVar = krvVar3.a;
                Optional empty = Optional.empty();
                apya apyaVar = krxVar.dI;
                apya apyaVar2 = krvVar3.on;
                arwe arweVar = (arwe) krvVar3.bQ.b();
                krv krvVar4 = this.a;
                apya apyaVar3 = krvVar4.ig;
                AtomicReference atomicReference = (AtomicReference) krvVar4.om.b();
                krv krvVar5 = this.a;
                return new khm(ajwtVar, ahqrVar, ahpfVar, xcjVar, G, mguVar, xcsVar, korVar, empty, apyaVar, apyaVar2, arweVar, apyaVar3, atomicReference, krvVar5.tC, this.d.g, krvVar5.a.dJ);
            case 7:
                return new hmk((short[]) null);
            case 8:
                return new kjc((arpi) this.a.bP.b(), (arwe) this.d.c.b(), this.a.cj);
            case 9:
                krv krvVar6 = this.a;
                return new lim(krvVar6.id, (ahpf) krvVar6.py.b());
            case 10:
                return new zcu((ahqr) this.a.id.b(), (ahpf) this.a.py.b(), (kor) this.a.f8if.b());
            case 11:
                return new vyv(this.d.l, (boolean[]) null);
            default:
                return new vyv((yyb) this.a.au.b());
        }
    }
}
