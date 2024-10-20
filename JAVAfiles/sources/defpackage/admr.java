package defpackage;

import j$.util.Optional;
import java.util.function.Function;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class admr implements advb {
    private final Function a;
    private final Function b;
    private final wwn c;
    private final wyp d;

    public admr(Function function, Function function2, wwn wwnVar, wyp wypVar) {
        this.a = function;
        this.b = function2;
        this.c = wwnVar;
        this.d = wypVar;
    }

    @Override // defpackage.advb
    public final /* synthetic */ void a(Object obj) {
        Object apply;
        admo admoVar = (admo) obj;
        if (admoVar == null) {
            return;
        }
        adjl adjlVar = admoVar.b;
        if (!adjlVar.c()) {
            advr.l(adms.a, "Cannot notify RcsVerifiedPhoneNumberListener because current availability is %s instead of AVAILABLE.", adjlVar.a.name());
            return;
        }
        adiw adiwVar = new adiw(admoVar.a);
        if (((wxb) this.c.j(adiwVar).orElse(null)) != null) {
            apply = this.b.apply(admoVar.a);
            Optional flatMap = ((Optional) apply).flatMap(this.a);
            if (flatMap.isEmpty()) {
                advr.r(adms.a, "No verified phone number for sim with id: %s", advq.SIM_ID.c(admoVar.a));
                this.d.u(16, adiwVar);
                return;
            } else {
                return;
            }
        }
        advr.r(adms.a, "No SimSubscriptionInfo for sim with id: %s", advq.SIM_ID.c(admoVar.a));
        this.d.u(15, adiwVar);
    }
}
