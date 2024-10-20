package defpackage;

import android.os.Bundle;
import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adhh extends adhd {
    final /* synthetic */ adhw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adhh(adhw adhwVar) {
        super(adhwVar);
        this.b = adhwVar;
    }

    @Override // defpackage.acyi, defpackage.acyh
    public final String a() {
        return "DeregisteringState";
    }

    @Override // defpackage.adhd, defpackage.acyi, defpackage.acyh
    public final void b() {
        super.b();
        this.b.F(new adha(this, 9));
    }

    @Override // defpackage.adhd, defpackage.acyi, defpackage.acyh
    public final boolean e(Message message) {
        int i = message.what;
        if (i != 2) {
            if (i != 3) {
                if (i != 5) {
                    if (i != 8) {
                        if (i != 17) {
                            return super.e(message);
                        }
                        this.b.N(acok.SIM_REMOVED);
                        return true;
                    }
                    this.b.N(message.obj);
                    advr.d(this.b.m, "Deregistration in progress.", new Object[0]);
                    return true;
                }
                Bundle bundle = (Bundle) message.obj;
                this.b.C(bundle.getString("transport_id"), (Throwable) bundle.getSerializable("transport_error_cause"));
                return true;
            }
            advr.h(this.b.m, "Deregistration timeout.", new Object[0]);
            adhw adhwVar = this.b;
            adhwVar.w(adhwVar.ad);
            return true;
        }
        if (message.obj instanceof aioo) {
            aioo aiooVar = (aioo) message.obj;
            if (aiooVar.y() == 200) {
                adhw adhwVar2 = this.b;
                adhwVar2.w(adhwVar2.ad);
            } else {
                if (aiooVar.y() == 401) {
                    advr.d(this.b.m, "401 response received", new Object[0]);
                    try {
                        this.b.aj.d(aiooVar);
                        advr.d(this.b.m, "Send second de-REGISTER", new Object[0]);
                        this.b.L();
                    } catch (adfj | aild e) {
                        advr.j(e, this.b.m, "Send second de-REGISTER failed.", new Object[0]);
                    }
                }
                advr.h(this.b.m, "Deregistration failed (%d %s).", Integer.valueOf(aiooVar.y()), aiooVar.A());
                adhw adhwVar3 = this.b;
                adhwVar3.w(adhwVar3.ad);
            }
        } else {
            advr.j((aild) message.obj, this.b.m, "Deregistration failed.", new Object[0]);
            adhw adhwVar4 = this.b;
            adhwVar4.w(adhwVar4.ad);
        }
        return true;
    }
}
