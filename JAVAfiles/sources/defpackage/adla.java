package defpackage;

import android.os.Message;
import com.google.android.ims.provisioning.config.Configuration;
import j$.util.Optional;
import java.net.MalformedURLException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adla extends adll {
    final /* synthetic */ adlw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adla(adlw adlwVar) {
        super(adlwVar);
        this.a = adlwVar;
    }

    private final void q() {
        boolean booleanValue;
        String str;
        if (aczv.x() && aczv.W()) {
            adlw adlwVar = this.a;
            booleanValue = adlwVar.ae.c(adlwVar.n).K;
        } else {
            booleanValue = ((Boolean) acpq.E().o().a()).booleanValue();
        }
        try {
            str = this.a.v();
        } catch (MalformedURLException e) {
            this.a.D.f(e, "failed to get ACS URL for ProvisioningSuccessData", new Object[0]);
            str = "";
            booleanValue = false;
        }
        aozy createBuilder = wgl.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        wgl wglVar = (wgl) apagVar;
        wglVar.b |= 1;
        wglVar.c = booleanValue;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        wgl wglVar2 = (wgl) apagVar2;
        str.getClass();
        wglVar2.b |= 2;
        wglVar2.d = str;
        adlw adlwVar2 = this.a;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        String str2 = adlwVar2.p;
        apag apagVar3 = createBuilder.b;
        wgl wglVar3 = (wgl) apagVar3;
        str2.getClass();
        wglVar3.b |= 4;
        wglVar3.e = str2;
        String str3 = this.a.n;
        if (!apagVar3.isMutable()) {
            createBuilder.u();
        }
        wgl wglVar4 = (wgl) createBuilder.b;
        str3.getClass();
        wglVar4.b |= 8;
        wglVar4.f = str3;
        wgl wglVar5 = (wgl) createBuilder.s();
        adlw adlwVar3 = this.a;
        try {
            adlwVar3.z.b.p(aduw.h("provisioning_success_data_for_sim_", adlwVar3.n), wglVar5);
        } catch (adux e2) {
            advr.j(e2, adnk.a, "Error while putting provisioningSuccessData into Bugle storage for SIM", new Object[0]);
        }
        adlw adlwVar4 = this.a;
        try {
            adlwVar4.z.b.p(aduw.h("provisioning_success_data_for_imsi_", adlwVar4.p), wglVar5);
        } catch (adux e3) {
            advr.j(e3, adnk.a, "Error while putting provisioningSuccessData into Bugle storage for IMSI", new Object[0]);
        }
    }

    @Override // defpackage.admi, defpackage.acyh
    public final String a() {
        return "ProcessConfigurationState";
    }

    @Override // defpackage.adll, defpackage.acyh
    public final void b() {
        super.b();
        this.a.D(apjx.PROCESS_CONFIGURATION_STAGE);
    }

    @Override // defpackage.adll
    public final adjj f() {
        return adjj.MSG_TRANSITION_TO_PROCESS_CONFIGURATION;
    }

    @Override // defpackage.adll
    public final apkn g() {
        return apkn.RCS_PROVISIONING_PROCESS_CONFIGURATION_STATE;
    }

    @Override // defpackage.adll
    public final boolean h() {
        return true;
    }

    @Override // defpackage.adll
    public final boolean i() {
        return false;
    }

    @Override // defpackage.adll
    public final boolean j() {
        return true;
    }

    @Override // defpackage.admi
    public final boolean k(Message message, adjj adjjVar) {
        int i;
        this.a.J("ProcessConfigurationState", message);
        int i2 = 12;
        if (adlw.av(message).ordinal() != 12) {
            return super.o(message, adjjVar);
        }
        Configuration configuration = (Configuration) message.obj;
        try {
            adlw adlwVar = this.a;
            String f = adlwVar.w.f();
            if (adlwVar.n.isEmpty()) {
                i = 2;
            } else if (f.isEmpty()) {
                i = 3;
            } else if (adlwVar.n.equals(f)) {
                i = 4;
            } else {
                i = 5;
            }
            Optional p = adlwVar.p();
            adnt adntVar = adlwVar.A;
            if (!adntVar.i(adntVar.e(p))) {
                long longValue = agkx.W().longValue();
                aozy createBuilder = apju.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apju apjuVar = (apju) createBuilder.b;
                apjuVar.c = i - 1;
                apjuVar.b |= 1;
                apju apjuVar2 = (apju) createBuilder.s();
                aozy createBuilder2 = apjv.a.createBuilder();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                apag apagVar = createBuilder2.b;
                apjv apjvVar = (apjv) apagVar;
                apjvVar.c = 25;
                apjvVar.b |= 1;
                if (!apagVar.isMutable()) {
                    createBuilder2.u();
                }
                apag apagVar2 = createBuilder2.b;
                apjv apjvVar2 = (apjv) apagVar2;
                apjvVar2.b = 2 | apjvVar2.b;
                apjvVar2.d = longValue;
                if (!apagVar2.isMutable()) {
                    createBuilder2.u();
                }
                apjv apjvVar3 = (apjv) createBuilder2.b;
                apjuVar2.getClass();
                apjvVar3.f = apjuVar2;
                apjvVar3.b |= 8;
                adntVar.s(new adhe(createBuilder2, i2), p);
            }
            adlw adlwVar2 = this.a;
            Configuration g = adlwVar2.x.g(configuration, apkn.RCS_PROVISIONING_PROCESS_CONFIGURATION_STATE, adlwVar2.r, adlwVar2.aE, adlwVar2.n);
            adlw adlwVar3 = this.a;
            if (adlwVar3.ad) {
                adlwVar3.z.u(adlwVar3.w.f(), g);
            }
            q();
            if (this.a.x.f(configuration, g)) {
                this.a.P();
                adlw adlwVar4 = this.a;
                adlwVar4.ac(adlwVar4.ay);
            } else {
                adlw adlwVar5 = this.a;
                adlwVar5.ac(adlwVar5.au);
            }
            return true;
        } catch (adux e) {
            this.a.A.o(43);
            this.a.D.f(e, "persistConfigFile by RcsUserId fail, abort the provisioning and transition to retryState", new Object[0]);
            adlw adlwVar6 = this.a;
            adlwVar6.ac(adlwVar6.an);
            return true;
        }
    }
}
