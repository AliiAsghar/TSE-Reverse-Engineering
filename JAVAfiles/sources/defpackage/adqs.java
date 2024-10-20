package defpackage;

import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adqs extends adou {
    public final aduo g;
    private final armf h;
    private final yjr i;
    private final InstantMessageConfiguration j;

    public adqs(adew adewVar, adqg adqgVar, armf armfVar, yjr yjrVar, adwe adweVar, aduo aduoVar) {
        super(adewVar, adqgVar, adweVar);
        this.h = armfVar;
        this.i = yjrVar;
        this.j = adewVar.d();
        this.g = aduoVar;
    }

    @Override // defpackage.adou
    protected final void e() {
        if (!((Boolean) aduo.a.a()).booleanValue()) {
            this.g.b();
        }
    }

    @Override // defpackage.adou
    protected final void g(acok acokVar) {
        ArrayList arrayList;
        if (!acokVar.b()) {
            aduo aduoVar = this.g;
            synchronized (aduoVar.b) {
                arrayList = new ArrayList(aduoVar.b.values());
            }
            Collection.EL.stream(arrayList).map(new adof(8)).forEach(new aavc(13));
            return;
        }
        advr.c("Skipping call to unsubscribe to groups due to %s", acokVar);
    }

    public final void p(long j) {
        String[] C;
        Long valueOf = Long.valueOf(j);
        advr.c("Updating subscription for session %d", valueOf);
        Optional a = this.g.a(j);
        if (a.isEmpty()) {
            advr.g("No group found for session %d. Cannot update subscription", valueOf);
            return;
        }
        adum adumVar = (adum) a.get();
        if (adumVar.e.isPresent()) {
            String str = (String) adumVar.e.get();
            if (adumVar.c.isPresent()) {
                adpe adpeVar = (adpe) adumVar.c.get();
                adpeVar.n(false);
                adpeVar.h = str;
                try {
                    adpeVar.d = adpeVar.a(adpeVar.c);
                    adpeVar.o();
                    return;
                } catch (aild e) {
                    advr.i(e, "Error calling createOriginatingDialogPath(): %s", e.getMessage());
                    adpeVar.h(new aduh("Error calling createOriginatingDialogPath(): ".concat(String.valueOf(e.getMessage())), e));
                    return;
                }
            }
            adqr adqrVar = new adqr(this, adumVar.a);
            try {
                adpe adpeVar2 = new adpe(this.a, this.h, adwf.l(str, this.a.c(), this.i), "conference", this.c, this.d, this.e);
                adpeVar2.e = "application/conference-info+xml";
                if (aczf.F()) {
                    C = (String[]) Collection.EL.toArray(new adrj(this.j.mMessageTech, 1).b(), new adak(3));
                } else {
                    C = adwf.C(this.j.a());
                }
                adpeVar2.i = C;
                adpeVar2.d(adqrVar);
                adumVar.c = Optional.of(adpeVar2);
                adpeVar2.o();
                return;
            } catch (aild e2) {
                advr.g("Error subscribing to conference: %s", e2.getMessage());
                return;
            }
        }
        advr.g("Group with ID %d has no valid conference URI. Cannot update subscription", valueOf);
    }

    @Override // defpackage.adou
    public final void m() {
    }

    @Override // defpackage.adou
    public final void n() {
    }
}
