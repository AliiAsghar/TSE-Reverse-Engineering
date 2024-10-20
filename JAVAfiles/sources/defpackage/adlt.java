package defpackage;

import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adlt extends adll {
    final /* synthetic */ adlw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adlt(adlw adlwVar) {
        super(adlwVar);
        this.a = adlwVar;
    }

    private final void q() {
        long longValue = ((Long) aczf.o().a.ab.a()).longValue();
        long longValue2 = agkx.W().longValue() + longValue;
        adlw adlwVar = this.a;
        adlwVar.R(adlwVar.s, adlwVar.n, longValue2);
        this.a.X(adjj.MSG_OTP_TIMEOUT, longValue);
    }

    private final boolean r() {
        adlw adlwVar = this.a;
        long i = adlwVar.i(adlwVar.s, adlwVar.n);
        if (i != -1 && i < agkx.W().longValue()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.admi, defpackage.acyh
    public final String a() {
        return "WaitingForOtpState";
    }

    @Override // defpackage.adll, defpackage.acyh
    public final void b() {
        super.b();
        this.a.D(apjx.WAITING_FOR_OTP_STAGE);
        if (((Boolean) adlw.b.a()).booleanValue()) {
            q();
        } else if (r()) {
            n(this.a.an, apkn.RCS_PROVISIONING_RETRY_STATE);
        } else {
            q();
        }
    }

    @Override // defpackage.adll, defpackage.acyh
    public final void c() {
        super.c();
        adlw adlwVar = this.a;
        adlwVar.R(adlwVar.s, adlwVar.n, -1L);
    }

    @Override // defpackage.adll
    public final adjj f() {
        return adjj.MSG_TRANSITION_TO_WAITING_FOR_OTP;
    }

    @Override // defpackage.adll
    public final apkn g() {
        return apkn.RCS_PROVISIONING_WAITING_FOR_OTP_STATE;
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
        return false;
    }

    @Override // defpackage.admi
    public final boolean k(Message message, adjj adjjVar) {
        this.a.J("WaitingForOtpState", message);
        this.a.M();
        int ordinal = adlw.av(message).ordinal();
        if (ordinal != 2) {
            if (ordinal != 7) {
                if (ordinal != 27) {
                    return super.o(message, adjjVar);
                }
                this.a.aD(30);
                adlw.aG(this.a);
                this.a.D.e("Timed out waiting for OTP SMS", new Object[0]);
                adlw adlwVar = this.a;
                adlwVar.aE.h(adlwVar.s, apkn.RCS_PROVISIONING_WAITING_FOR_OTP_STATE, adlwVar.r, new adiw(adlwVar.n));
                this.a.aC(apkn.RCS_PROVISIONING_WAITING_FOR_OTP_STATE, 5);
                if (this.a.ae()) {
                    adlw adlwVar2 = this.a;
                    adlwVar2.G.b(adlwVar2.n, apjo.SIM, adlwVar2.r, wgf.OTP_TIMEOUT);
                }
                adlw adlwVar3 = this.a;
                adlwVar3.ac(adlwVar3.an);
                return true;
            }
            this.a.aD(29);
            adlw adlwVar4 = this.a;
            adlwVar4.Q(adlwVar4.s, adlwVar4.n, adlw.s(message));
            acyz acyzVar = admf.a;
            if (adom.i()) {
                this.a.B(adjj.MSG_VERIFY_OTP, message.obj);
                adlw adlwVar5 = this.a;
                adlwVar5.ac(adlwVar5.aq);
            } else {
                this.a.V(adjj.MSG_VERIFY_OTP, message.obj);
                adlw adlwVar6 = this.a;
                adlwVar6.ac(adlwVar6.aq);
            }
        } else {
            adlw adlwVar7 = this.a;
            if (adlwVar7.i(adlwVar7.s, adlwVar7.n) == -1 || r()) {
                this.a.D.d("Provisioning requested in WaitingForOtp state but OTP timed out", new Object[0]);
                adlw adlwVar8 = this.a;
                adlwVar8.ac(adlwVar8.an);
                adlw.aG(this.a);
            }
        }
        return true;
    }
}
