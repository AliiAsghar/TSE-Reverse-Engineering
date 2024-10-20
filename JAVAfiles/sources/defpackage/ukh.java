package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.verifiedsmsworkers.CleanupVerifiedSmsDataWork;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ukh {
    public static final xze a = xze.g("Bugle", "VerifiedSmsCleanupHelper");
    public final Context b;
    public final agnq c;
    public final armf d;
    public final armf e;
    public final qyn f;
    public final yul g;
    public final uhj h;
    public final anen i;
    public final zxy j;

    public ukh(Context context, agnq agnqVar, armf armfVar, armf armfVar2, qyn qynVar, yul yulVar, zxy zxyVar, uhj uhjVar, anen anenVar) {
        this.b = context;
        this.c = agnqVar;
        this.d = armfVar;
        this.e = armfVar2;
        this.f = qynVar;
        this.g = yulVar;
        this.j = zxyVar;
        this.h = uhjVar;
        this.i = anenVar;
    }

    public final akul a() {
        return this.g.d().i(new tsz(this, 18), this.i);
    }

    public final void b() {
        xyo c = a.c();
        c.H("Requesting Verified SMS data cleanup.");
        c.q();
        gtm ar = gvf.ar(this.b);
        ar.a("verified_sms_work_manager_tag");
        ar.b("verified_sms_request_verified_senders_unique_work_name");
        ar.b("verified_sms_key_rotation_unique_work_name");
        gsz gszVar = new gsz(CleanupVerifiedSmsDataWork.class);
        gszVar.c("verified_sms_cleanup_work_tag");
        ar.l("verified_sms_cleanup_work_tag", gso.REPLACE, gszVar.j());
    }
}
