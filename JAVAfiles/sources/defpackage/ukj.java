package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ukj {
    public static final alpt a = alpt.t(Status.Code.UNAVAILABLE, Status.Code.RESOURCE_EXHAUSTED, Status.Code.INTERNAL, Status.Code.DEADLINE_EXCEEDED);
    public static final alpt b = alpt.u("vsms_sender_id", "vsms_message_body", "vsms_mcc_key", "vsms_mnc_key", "vsms_imsi_key");
    public static final xze c = xze.g("Bugle", "VerifiedSmsRemoteVerificationWorkHelper");
    public final mbl d;
    public final uhs e;
    public final xnv f;
    public final ukd g;
    public final yuu h;
    public final yul i;
    public final anen j;
    public final anen k;
    public final armf l;
    private final mho m;

    public ukj(mbl mblVar, uhs uhsVar, xnv xnvVar, mho mhoVar, ukd ukdVar, anen anenVar, anen anenVar2, yul yulVar, yuu yuuVar, armf armfVar) {
        this.d = mblVar;
        this.e = uhsVar;
        this.f = xnvVar;
        this.m = mhoVar;
        this.g = ukdVar;
        this.j = anenVar;
        this.k = anenVar2;
        this.h = yuuVar;
        this.i = yulVar;
        this.l = armfVar;
    }

    public final void a(amir amirVar, yua yuaVar, long j) {
        this.m.aa(amirVar, yuaVar, this.f.f().toEpochMilli() - j);
    }
}
