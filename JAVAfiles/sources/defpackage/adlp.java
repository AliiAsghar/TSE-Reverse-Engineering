package defpackage;

import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adlp extends adll {
    final /* synthetic */ adlw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adlp(adlw adlwVar) {
        super(adlwVar);
        this.a = adlwVar;
    }

    @Override // defpackage.admi, defpackage.acyh
    public final String a() {
        return "WaitingForBatteryOptimizationExemptionState";
    }

    @Override // defpackage.adll, defpackage.acyh
    public final void b() {
        super.b();
        this.a.D(apjx.BATTERY_OPT_EXEMPTION_STAGE);
        n(this.a.af, apkn.RCS_PROVISIONING_ENABLED_STATE);
    }

    @Override // defpackage.adll
    public final adjj f() {
        return adjj.MSG_TRANSITION_TO_WAITING_FOR_BATTERY_OPT;
    }

    @Override // defpackage.adll
    public final apkn g() {
        return apkn.RCS_PROVISIONING_WAITING_FOR_BATTERY_OPTIMIZATION_STATE;
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
        this.a.J("WaitingForBatteryOptimizationExemptionState", message);
        int ordinal = adlw.av(message).ordinal();
        if (ordinal != 2) {
            if (ordinal != 19) {
                return super.o(message, adjjVar);
            }
        } else {
            this.a.D.e("%s: received provisioning request message while blocked.", "WaitingForBatteryOptimizationExemptionState");
            adlw adlwVar = this.a;
            adlwVar.aE.i(adlwVar.s, apkn.RCS_PROVISIONING_WAITING_FOR_BATTERY_OPTIMIZATION_STATE, adlwVar.r, new adiw(adlwVar.n));
        }
        this.a.aD(10);
        adlw adlwVar2 = this.a;
        adlwVar2.ac(adlwVar2.af);
        return true;
    }
}
