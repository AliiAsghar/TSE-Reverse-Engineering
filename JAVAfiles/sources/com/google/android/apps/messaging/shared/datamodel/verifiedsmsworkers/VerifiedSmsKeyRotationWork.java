package com.google.android.apps.messaging.shared.datamodel.verifiedsmsworkers;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.akec;
import defpackage.andi;
import defpackage.gsi;
import defpackage.gsx;
import defpackage.tsz;
import defpackage.uht;
import defpackage.uki;
import defpackage.xyo;
import defpackage.xze;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class VerifiedSmsKeyRotationWork extends gsx {
    private static final xze e = xze.g("Bugle", "VerifiedSmsKeyRotationWork");
    private final uki f;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        uki dR();
    }

    public VerifiedSmsKeyRotationWork(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f = ((a) akec.w(context, a.class)).dR();
        e.l("VerifiedSmsKeyRotationWork created.");
    }

    @Override // defpackage.gsx
    public final ListenableFuture b() {
        e.l("Beginning VerifiedSmsKeyRotationWork work");
        gsi f = f();
        uki.a.l("Beginning VerifiedSmsKeyRotationWork work");
        long b = f.b("vsms_key_rotation_work_frequency", -1L);
        xyo a2 = uki.a.a();
        a2.H("Updating shared prefs with new VSMS Key Rotation interval schedule.");
        a2.y("interval schedule", b);
        a2.q();
        uki ukiVar = this.f;
        return ukiVar.c.h(b).i(new tsz(ukiVar, 19), ukiVar.f).h(new uht(ukiVar, 18), ukiVar.f).e(Throwable.class, new uht(ukiVar, 19), andi.a);
    }
}
