package defpackage;

import android.os.Bundle;
import android.os.Message;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.provisioning.config.ServerMessage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adlv extends adll {
    final /* synthetic */ adlw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adlv(adlw adlwVar) {
        super(adlwVar);
        this.a = adlwVar;
    }

    private final void q() {
        adlw adlwVar = this.a;
        Configuration f = adlwVar.z.f(adlwVar.n);
        f.r();
        adlw adlwVar2 = this.a;
        adlwVar2.z.u(adlwVar2.n, f);
    }

    @Override // defpackage.admi, defpackage.acyh
    public final String a() {
        return "WaitingForTermsAndConditionsState";
    }

    @Override // defpackage.adll, defpackage.acyh
    public final void b() {
        whl whlVar;
        int aT;
        super.b();
        this.a.D(apjx.TERMS_AND_CONDITIONS_STAGE);
        adlw adlwVar = this.a;
        int i = 5;
        adlwVar.aE.r(adlwVar.s, 5, adlwVar.r, new adiw(adlwVar.n));
        adlw adlwVar2 = this.a;
        if (adlwVar2.z.z(adlwVar2.n)) {
            q();
            this.a.aD(17);
            n(this.a.au, apkn.RCS_PROVISIONING_CONFIGURED_STATE);
            return;
        }
        adlw adlwVar3 = this.a;
        if (adlwVar3.T) {
            aT = ((whs) adlwVar3.V.b()).k(new adiw(this.a.n));
        } else {
            try {
                whlVar = (whl) adlwVar3.z.b.o(aduw.h("rcs_provisioning_carrier_tos_configuration_", adlwVar3.n), whl.a);
            } catch (adux e) {
                advr.j(e, adnk.a, "Error while retrieving RcsProvisioningCarrierTosConfiguration from bugle storage.", new Object[0]);
                whlVar = whl.a;
            }
            aT = a.aT(whlVar.b);
            if (aT == 0) {
                aT = 1;
            }
        }
        int i2 = aT - 2;
        if (i2 != 1) {
            if (i2 != 2) {
                ServerMessage serverMessage = this.a.k().mServerMessage;
                if (serverMessage != null) {
                    aozy createBuilder = acun.a.createBuilder();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar = createBuilder.b;
                    acun acunVar = (acun) apagVar;
                    String str = serverMessage.mMessage;
                    str.getClass();
                    acunVar.b = 1 | acunVar.b;
                    acunVar.c = str;
                    if (!apagVar.isMutable()) {
                        createBuilder.u();
                    }
                    String str2 = serverMessage.mTitle;
                    apag apagVar2 = createBuilder.b;
                    acun acunVar2 = (acun) apagVar2;
                    acunVar2.b = 2 | acunVar2.b;
                    acunVar2.d = albo.ag(str2);
                    boolean z = serverMessage.mHasAcceptButton;
                    if (!apagVar2.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar3 = createBuilder.b;
                    acun acunVar3 = (acun) apagVar3;
                    acunVar3.b |= 4;
                    acunVar3.e = z;
                    boolean z2 = serverMessage.mHasRejectButton;
                    if (!apagVar3.isMutable()) {
                        createBuilder.u();
                    }
                    acun acunVar4 = (acun) createBuilder.b;
                    acunVar4.b |= 8;
                    acunVar4.f = z2;
                    acun acunVar5 = (acun) createBuilder.s();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("com.google.android.ims.provisioning.enginge.provisioning_alert_server_message", acunVar5.toByteArray());
                    adlw adlwVar4 = this.a;
                    if (adlwVar4.T) {
                        bundle.putString("com.google.android.ims.provisioning.sim.id.key", adlwVar4.n);
                    }
                    this.a.P();
                    this.a.aD(16);
                    adjk.c(this.a.s, 9, bundle);
                    this.a.K.ifPresent(new adlr(this, i));
                    return;
                }
                return;
            }
            adlw adlwVar5 = this.a;
            if (adlwVar5.T && adlwVar5.R) {
                ((wih) adlwVar5.P.b()).l(new adiw(this.a.n), wja.PER_SIM_TOGGLE_STATE_DISABLED);
                ((wih) this.a.P.b()).j();
            } else {
                ((wih) adlwVar5.P.b()).m(wiz.TOGGLE_STATE_USER_DISABLED);
            }
            this.a.U(adjj.MSG_T_AND_C_REJECTED);
            return;
        }
        q();
        this.a.aD(17);
        n(this.a.au, apkn.RCS_PROVISIONING_CONFIGURED_STATE);
    }

    @Override // defpackage.adll
    public final adjj f() {
        return adjj.MSG_TRANSITION_TO_WAITING_FOR_TOS;
    }

    @Override // defpackage.adll
    public final apkn g() {
        return apkn.RCS_PROVISIONING_WAITING_FOR_TERMS_AND_CONDITIONS_STATE;
    }

    @Override // defpackage.adll
    public final boolean h() {
        return true;
    }

    @Override // defpackage.adll
    public final boolean j() {
        return false;
    }

    @Override // defpackage.admi
    public final boolean k(Message message, adjj adjjVar) {
        this.a.J("WaitingForTermsAndConditionsState", message);
        int ordinal = adlw.av(message).ordinal();
        if (ordinal != 2) {
            if (ordinal != 25) {
                if (ordinal != 17) {
                    if (ordinal != 18) {
                        return super.o(message, adjjVar);
                    }
                    adlw adlwVar = this.a;
                    adlwVar.x.b(adlwVar.n);
                    this.a.aD(37);
                    this.a.I();
                    this.a.D.d("T&Cs rejected. Invoke failure", new Object[0]);
                    adlw adlwVar2 = this.a;
                    adlwVar2.aE.l(adlwVar2.s, apkn.RCS_PROVISIONING_WAITING_FOR_TERMS_AND_CONDITIONS_STATE, 10, adlwVar2.r, new adiw(adlwVar2.n));
                    adlw adlwVar3 = this.a;
                    adlwVar3.ac(adlwVar3.ag);
                    return true;
                }
            } else {
                this.a.aD(45);
                adlw adlwVar4 = this.a;
                adlwVar4.x.b(adlwVar4.n);
                adlw adlwVar5 = this.a;
                adlwVar5.ac(adlwVar5.af);
                return true;
            }
        } else {
            this.a.D.e("%s: received provisioning request message while blocked.", "WaitingForTermsAndConditionsState");
            adlw adlwVar6 = this.a;
            adlwVar6.aE.i(adlwVar6.s, apkn.RCS_PROVISIONING_WAITING_FOR_TERMS_AND_CONDITIONS_STATE, adlwVar6.r, new adiw(adlwVar6.n));
        }
        q();
        this.a.aD(17);
        adlw adlwVar7 = this.a;
        adlwVar7.ac(adlwVar7.au);
        return true;
    }
}
