package defpackage;

import com.google.android.ims.provisioning.config.Configuration;
import j$.util.Optional;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class admp implements advb {
    public final adjd a;
    public final Optional b;
    private final Function c;

    public admp(adjd adjdVar, Optional optional, Function function) {
        this.a = adjdVar;
        this.b = optional;
        this.c = function;
    }

    @Override // defpackage.advb
    public final /* synthetic */ void a(Object obj) {
        Object apply;
        admq admqVar = (admq) obj;
        if (admqVar != null) {
            if (this.b.isEmpty() || ((String) this.b.get()).equals(admqVar.a)) {
                if (admqVar.b.isPresent() && ((Configuration) admqVar.b.get()).p()) {
                    apply = this.c.apply(admqVar);
                    admqVar = (admq) apply;
                }
                this.a.fQ(admqVar.a, admqVar.b);
                advr.l(adms.a, "Notify RcsConfigurationListener %s onRcsConfigurationUpdate, SIM = %s, hasConfiguration = %s", this.a, advq.SIM_ID.c(admqVar.a), Boolean.valueOf(admqVar.b.isPresent()));
            }
        }
    }
}
