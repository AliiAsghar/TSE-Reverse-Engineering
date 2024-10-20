package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.verifiedsmsworkers.VerifiedSmsKeyRotationWork;
import io.grpc.Status;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uki {
    public static final xze a = xze.g("Bugle", "VerifiedSmsKeyRotationWorkHelper");
    public static final alpt b = alpt.t(Status.Code.UNAVAILABLE, Status.Code.RESOURCE_EXHAUSTED, Status.Code.INTERNAL, Status.Code.DEADLINE_EXCEEDED);
    public final yul c;
    public final ytw d;
    public final mbl e;
    public final anen f;

    public uki(yul yulVar, ytw ytwVar, mbl mblVar, anen anenVar) {
        this.c = yulVar;
        this.d = ytwVar;
        this.e = mblVar;
        this.f = anenVar;
    }

    public final void a(Context context, long j) {
        gtm ar = gvf.ar(context);
        gtg gtgVar = new gtg(VerifiedSmsKeyRotationWork.class, Duration.ofMillis(j));
        hgi hgiVar = new hgi((char[]) null);
        hgiVar.q("vsms_key_rotation_work_frequency", j);
        gtgVar.i(hgiVar.j());
        gsd gsdVar = new gsd();
        gsdVar.c(2);
        gtgVar.f(gsdVar.a());
        gtgVar.c("verified_sms_key_rotation_unique_work_tag");
        ar.j("verified_sms_key_rotation_unique_work_name", 1, gtgVar.j());
        xyo c = a.c();
        c.H("Enqueued request for Verified SMS key rotation.");
        c.y("interval frequency", j);
        c.q();
    }
}
