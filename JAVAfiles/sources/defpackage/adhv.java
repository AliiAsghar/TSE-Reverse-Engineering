package defpackage;

import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adhv extends adhd {
    public final /* synthetic */ adhw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adhv(adhw adhwVar) {
        super(adhwVar);
        this.b = adhwVar;
    }

    @Override // defpackage.acyi, defpackage.acyh
    public final String a() {
        return "WaitForNetworkState";
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005f, code lost:
    
        if (r0.P.a(r0.o) != null) goto L17;
     */
    @Override // defpackage.adhd, defpackage.acyi, defpackage.acyh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adhv.b():void");
    }

    @Override // defpackage.adhd, defpackage.acyi, defpackage.acyh
    public final boolean e(Message message) {
        int i = message.what;
        if (i != 4) {
            if (i != 8) {
                if (i != 17) {
                    switch (i) {
                        case 20:
                            adfn adfnVar = (adfn) message.obj;
                            adhw adhwVar = this.b;
                            adhwVar.z = adfnVar;
                            adhwVar.w(adhwVar.V);
                            return true;
                        case 21:
                            advr.r(this.b.m, "Network is lost.", new Object[0]);
                            this.b.O();
                            adhw adhwVar2 = this.b;
                            adhwVar2.w(adhwVar2.ag);
                            return true;
                        case 22:
                            advr.r(this.b.m, "Network is not available.", new Object[0]);
                            this.b.y.set(null);
                            adhw adhwVar3 = this.b;
                            adhwVar3.w(adhwVar3.ag);
                            return true;
                        default:
                            return super.e(message);
                    }
                }
                this.b.N(acok.SIM_REMOVED);
                adhw adhwVar4 = this.b;
                adhwVar4.w(adhwVar4.af);
                return true;
            }
            this.b.N(message.obj);
            adhw adhwVar5 = this.b;
            adhwVar5.w(adhwVar5.S);
            return true;
        }
        g();
        return true;
    }

    public final void g() {
        adhw adhwVar = this.b;
        boolean z = adhwVar.l;
        advp advpVar = adhwVar.m;
        if (z) {
            advr.r(advpVar, "Do not use ImsNetworkInterface.", new Object[0]);
            return;
        }
        advr.d(advpVar, "Selecting Network Interface.", new Object[0]);
        this.b.al.h();
        adey f = this.b.al.f();
        if (f == null) {
            advr.d(this.b.m, "ImsNetworkInterface is not available.", new Object[0]);
            return;
        }
        advr.d(this.b.m, "Registering over %s (%s)", f.d(), f);
        this.b.u = f;
        adhw adhwVar2 = this.b;
        advr.d(adhwVar2.m, "Notify ImsNetworkInterface selected. selected=%s", f);
        adhwVar2.N.execute(new acaj(adhwVar2, f, 19));
        adhw adhwVar3 = this.b;
        adhwVar3.w(adhwVar3.V);
    }
}
