package defpackage;

import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adlu extends adll {
    final /* synthetic */ adlw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adlu(adlw adlwVar) {
        super(adlwVar);
        this.a = adlwVar;
    }

    @Override // defpackage.admi, defpackage.acyh
    public final String a() {
        return "WaitingForRcsDefaultOnState";
    }

    @Override // defpackage.adll, defpackage.acyh
    public final void b() {
        super.b();
        this.a.D(apjx.RCS_DEFAULT_ON_STAGE);
        if (this.a.aF.a().equals(whk.LEGAL_FYI_SEEN)) {
            n(this.a.aB, apkn.RCS_PROVISIONING_SET_GOOGLE_TOS_CONSENT_STATE);
            return;
        }
        if (((acwl) this.a.U.b()).a() && adww.d(this.a.s)) {
            this.a.D.d("Skipping legal FYI for Wear device", new Object[0]);
            adnk adnkVar = this.a.z;
            aozy builder = adnkVar.e().toBuilder();
            whk whkVar = whk.LEGAL_FYI_SEEN;
            if (!builder.b.isMutable()) {
                builder.u();
            }
            ((whm) builder.b).h = whkVar.a();
            apct j = aotl.j(this.a.M.f());
            if (!builder.b.isMutable()) {
                builder.u();
            }
            whm whmVar = (whm) builder.b;
            j.getClass();
            whmVar.f = j;
            whmVar.b |= 1;
            adnkVar.w((whm) builder.s());
            n(this.a.aB, apkn.RCS_PROVISIONING_SET_GOOGLE_TOS_CONSENT_STATE);
            return;
        }
        adlw adlwVar = this.a;
        adlwVar.aE.r(adlwVar.s, 6, adlwVar.r, new adiw(adlwVar.n));
        this.a.aD(59);
        adjk.c(this.a.s, 24, null);
        if (this.a.as() && this.a.aF.a().equals(whk.RCS_DEFAULT_ON_CONSENT_STATE_UNSPECIFIED)) {
            this.a.aD(62);
            n(this.a.aB, apkn.RCS_PROVISIONING_SET_GOOGLE_TOS_CONSENT_STATE);
        } else {
            this.a.P();
            this.a.K.ifPresent(new adlr(this, 4));
        }
    }

    @Override // defpackage.adll
    public final adjj f() {
        return adjj.MSG_TRANSITION_TO_WAITING_FOR_RCS_DEFAULT_ON;
    }

    @Override // defpackage.adll
    public final apkn g() {
        return apkn.RCS_PROVISIONING_WAITING_FOR_RCS_DEFAULT_ON_STATE;
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
        return super.o(message, adjjVar);
    }
}
