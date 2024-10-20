package defpackage;

import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adlq extends adll {
    public final /* synthetic */ adlw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adlq(adlw adlwVar) {
        super(adlwVar);
        this.a = adlwVar;
    }

    @Override // defpackage.admi, defpackage.acyh
    public final String a() {
        return "WaitingForGoogleTosState";
    }

    @Override // defpackage.adll, defpackage.acyh
    public final void b() {
        super.b();
        this.a.D(apjx.GOOGLE_TOS_STAGE);
        adlw adlwVar = this.a;
        if (adlwVar.z.A(adlwVar.s)) {
            this.a.U(adjj.MSG_GOOGLE_TOS_ACCEPTED);
            return;
        }
        adlw adlwVar2 = this.a;
        adlwVar2.aE.r(adlwVar2.s, 3, adlwVar2.r, new adiw(adlwVar2.n));
        this.a.aD(6);
        this.a.P();
        adjk.c(this.a.s, 5, null);
        this.a.K.ifPresent(new adgr(this, 20));
    }

    @Override // defpackage.adll
    public final adjj f() {
        return adjj.MSG_TRANSITION_TO_WAITING_FOR_GOOGLE_TOS;
    }

    @Override // defpackage.adll
    public final apkn g() {
        return apkn.RCS_PROVISIONING_WAITING_FOR_GOOGLE_TOS_STATE;
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
        this.a.J("WaitingForGoogleTosState", message);
        int ordinal = adlw.av(message).ordinal();
        if (ordinal != 2) {
            if (ordinal != 16) {
                if (ordinal != 28) {
                    return super.o(message, adjjVar);
                }
                this.a.D.d("Rcs is disabled because user decline tos", new Object[0]);
                this.a.aD(36);
                adlw adlwVar = this.a;
                adlwVar.x.b(adlwVar.n);
                this.a.K.ifPresent(new adgr(this, 19));
                this.a.I();
                this.a.aB(7);
                return true;
            }
        } else {
            this.a.D.e("%s: received provisioning request message while blocked.", "WaitingForGoogleTosState");
            adlw adlwVar2 = this.a;
            adlwVar2.aE.i(adlwVar2.s, apkn.RCS_PROVISIONING_WAITING_FOR_GOOGLE_TOS_STATE, adlwVar2.r, new adiw(adlwVar2.n));
        }
        adlw adlwVar3 = this.a;
        if (adlwVar3.z.A(adlwVar3.s)) {
            this.a.aD(7);
            if (aczv.F()) {
                if (!this.a.aJ.m() && aczv.A()) {
                    this.a.z();
                }
                adlw adlwVar4 = this.a;
                adlwVar4.ac(adlwVar4.aB);
            } else {
                adlw adlwVar5 = this.a;
                adlwVar5.ac(adlwVar5.ai);
            }
        } else {
            this.a.P();
            adjk.c(this.a.s, 5, null);
        }
        return true;
    }
}
