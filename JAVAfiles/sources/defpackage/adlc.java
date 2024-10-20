package defpackage;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.rcsprovisioning.RcsProvisioningListenableWorker;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adlc extends adll {
    actw a;
    String b;
    public final /* synthetic */ adlw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adlc(adlw adlwVar) {
        super(adlwVar);
        this.c = adlwVar;
    }

    private final void q(boolean z) {
        adll adllVar;
        if (((acxv) this.c.N.b()).a()) {
            aday adayVar = (aday) this.c.O.b();
            String str = this.c.n;
            adayVar.j(str).edit().putInt("provisioning_engine_replay_count_key", adayVar.g(str) + 1).commit();
        } else {
            adlw adlwVar = this.c;
            adnu.a();
            Context context = adlwVar.s;
            String str2 = adlwVar.n;
            adnu.e(context, str2).edit().putInt("provisioning_engine_replay_count_key", adnu.m(context, str2) + 1).commit();
        }
        adlw adlwVar2 = this.c;
        if (adlwVar2.j().d()) {
            this.c.D.d("Cannot replay request. RCS is disabled.", new Object[0]);
            adllVar = this.c.ag;
        } else {
            adllVar = adlwVar2.af;
            if (!TextUtils.isEmpty(this.b)) {
                adlw adlwVar3 = this.c;
                adll adllVar2 = (adll) adlwVar3.m.get(this.b);
                if (adllVar2 != null && (adllVar2.m() || adllVar2.i())) {
                    adllVar = adllVar2;
                }
            }
        }
        if (z) {
            n(adllVar, adllVar.g());
        } else {
            this.c.ac(adllVar);
        }
    }

    private final void r(long j) {
        if (this.c.K.isPresent()) {
            adlw adlwVar = this.c;
            adlwVar.S(adlwVar.s, adlwVar.n, true);
            Object obj = this.c.K.get();
            long j2 = j / 1000;
            String str = this.c.n;
            RcsProvisioningListenableWorker rcsProvisioningListenableWorker = (RcsProvisioningListenableWorker) obj;
            rcsProvisioningListenableWorker.m("Provisioning Engine entered ReplayRequestState, request will be re-attempted in %s", Long.valueOf(j2));
            rcsProvisioningListenableWorker.t = 10;
            rcsProvisioningListenableWorker.g.l(str, Duration.ofSeconds(j2), 3, amww.STATE_MACHINE_REPLAY);
            rcsProvisioningListenableWorker.v = new gsw();
            rcsProvisioningListenableWorker.l();
            return;
        }
        actw a = actw.a(this.c.s, "PROVISIONING_REPLAY_TIMER");
        this.a = a;
        a.d(new Thread(new adhp(this, 7)), j / 1000);
    }

    @Override // defpackage.admi, defpackage.acyh
    public final String a() {
        return "ReplayRequestState";
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.adll, defpackage.acyh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adlc.b():void");
    }

    @Override // defpackage.adll, defpackage.acyh
    public final void c() {
        super.c();
        actw actwVar = this.a;
        if (actwVar != null) {
            actwVar.b();
        }
    }

    @Override // defpackage.adll
    public final adjj f() {
        return adjj.MSG_TRANSITION_TO_REPLAY_REQUEST;
    }

    @Override // defpackage.adll
    public final apkn g() {
        return apkn.RCS_PROVISIONING_REPLAY_REQUEST_STATE;
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
        this.c.J("ReplayRequestState", message);
        int ordinal = adlw.av(message).ordinal();
        if (ordinal != 10) {
            if (ordinal != 23) {
                if (ordinal != 25) {
                    if (ordinal != 26) {
                        return super.o(message, adjjVar);
                    }
                } else {
                    this.c.Y();
                    this.c.aD(45);
                    adlw adlwVar = this.c;
                    adlwVar.ac(adlwVar.af);
                    return true;
                }
            }
            q(false);
            return true;
        }
        r(((Integer) message.obj).intValue() * 1000);
        return true;
    }
}
