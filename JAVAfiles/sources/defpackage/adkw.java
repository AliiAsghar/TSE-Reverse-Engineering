package defpackage;

import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adkw extends adll {
    public final /* synthetic */ adlw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adkw(adlw adlwVar) {
        super(adlwVar);
        this.a = adlwVar;
    }

    @Override // defpackage.admi, defpackage.acyh
    public final String a() {
        return "DisabledState";
    }

    @Override // defpackage.adll, defpackage.acyh
    public final void b() {
        super.b();
        this.a.D(apjx.DISABLED_STAGE);
        this.a.K.ifPresent(new adgr(this, 14));
        adom.b();
        adom.a(this.a.s, 2);
        this.a.aB(6);
    }

    @Override // defpackage.adll
    public final adjj f() {
        return adjj.MSG_TRANSITION_TO_DISABLED;
    }

    @Override // defpackage.adll
    public final apkn g() {
        return apkn.RCS_PROVISIONING_DISABLED_STATE;
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
        int i;
        this.a.J("DisabledState", message);
        int ordinal = adlw.av(message).ordinal();
        if (ordinal != 1 && ordinal != 2) {
            return super.o(message, adjjVar);
        }
        if (this.a.j().e()) {
            this.a.aA();
            this.a.ab(apjx.DISABLED_STAGE);
            adlw adlwVar = this.a;
            if (message.what == adjj.MSG_RCS_AVAILABILITY_UPDATED.a()) {
                i = 46;
            } else {
                i = 44;
            }
            adlwVar.aD(i);
            adlw adlwVar2 = this.a;
            adlwVar2.ac(adlwVar2.af);
        }
        return true;
    }
}
