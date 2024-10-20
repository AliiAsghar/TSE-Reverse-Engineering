package com.google.android.apps.messaging.shared.datamodel.verifiedsmsworkers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.akec;
import defpackage.akrc;
import defpackage.aksr;
import defpackage.akul;
import defpackage.albo;
import defpackage.andi;
import defpackage.anen;
import defpackage.gsi;
import defpackage.gsu;
import defpackage.gsx;
import defpackage.twe;
import defpackage.ukj;
import defpackage.vjs;
import defpackage.xnv;
import defpackage.xyo;
import defpackage.xze;
import defpackage.yts;
import defpackage.yul;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class VerifiedSmsRemoteVerificationWork extends gsx {
    private static final xze j = xze.g("Bugle", "VerifiedSmsRemoteVerificationWork");
    public final anen e;
    public final anen f;
    public final ukj g;
    public volatile long h;
    public final vjs i;
    private final xnv k;
    private final yul l;
    private final aksr m;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        vjs Sh();

        aksr a();

        ukj dS();

        xnv fN();

        yul gr();

        anen k();

        anen l();
    }

    public VerifiedSmsRemoteVerificationWork(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        xyo a2 = j.a();
        a2.H("VerifiedSmsRemoteVerificationWork created.");
        a2.q();
        a aVar = (a) akec.w(context, a.class);
        this.i = aVar.Sh();
        this.e = aVar.k();
        this.f = aVar.l();
        this.k = aVar.fN();
        this.g = aVar.dS();
        this.l = aVar.gr();
        this.m = aVar.a();
    }

    @Override // defpackage.gsx
    public final ListenableFuture b() {
        this.h = this.k.f().toEpochMilli();
        xze xzeVar = j;
        xzeVar.l("Beginning vsms remote verification work.");
        gsi f = f();
        xyo a2 = ukj.c.a();
        a2.H("Validating vsms request data.");
        a2.q();
        if (f.e().keySet().containsAll(ukj.b)) {
            xyo a3 = ukj.c.a();
            a3.H("All vsms keys present in input data.");
            a3.q();
            xzeVar.l("Beginning remote verification request.");
            String ag = albo.ag(f.d("vsms_imsi_key"));
            akrc b = this.m.b("VerifiedSmsRemoteVerificationWork");
            try {
                akul i = this.l.f(ag).h(new yts(4), andi.a).i(new twe(this, f, 5, null), this.f);
                b.close();
                return i;
            } catch (Throwable th) {
                try {
                    b.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        xyo a4 = ukj.c.a();
        a4.H("Looking for missing vsms input data key(s)....");
        a4.q();
        if (TextUtils.isEmpty(f.d("vsms_message_body"))) {
            ukj.c.m("Remote verification work was requested but message body was missing.");
        }
        if (TextUtils.isEmpty(f.d("vsms_sender_id"))) {
            ukj.c.m("Remote verification work was requested but sender id was missing.");
        }
        if (f.a("vsms_mcc_key", -1) == -1) {
            ukj.c.m("Remote verification work was requested but mcc was missing.");
        }
        if (f.a("vsms_mnc_key", -1) == -1) {
            ukj.c.m("Remote verification work was requested but mnc was missing.");
        }
        ukj ukjVar = this.g;
        long j2 = -1;
        long b2 = f.b("vsms_verification_chain_start_time_key", -1L);
        long j3 = this.h;
        if (b2 > 0) {
            j2 = ukjVar.f.f().toEpochMilli() - b2;
        }
        ukjVar.d.g("Bugle.VerifiedSms.WorkManager.VerificationChain.V2.Failure.Latency", j2);
        ukjVar.d.g("Bugle.VerifiedSms.WorkManager.RemoteVerification.Failure.Latency", ukjVar.f.f().toEpochMilli() - j3);
        return albo.bI(new gsu());
    }
}
