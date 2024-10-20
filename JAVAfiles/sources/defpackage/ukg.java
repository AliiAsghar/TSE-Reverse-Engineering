package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ukg {
    public static final xze a = xze.g("Bugle", "UpdateMessageVerificationStatusWorkHelper");
    public static final alvi b = alvi.m("com/google/android/apps/messaging/shared/datamodel/verifiedsmsworkers/UpdateMessageVerificationStatusWorkHelper");
    public final qyn c;
    public final mbl d;
    public final armf e;
    public final armf f;
    public final xnv g;
    public final uhj h;
    public final agnq i;
    public final mho j;
    public final armf k;
    public final armf l;
    public final xvc m;

    public ukg(qyn qynVar, mbl mblVar, xvc xvcVar, armf armfVar, armf armfVar2, xnv xnvVar, uhj uhjVar, agnq agnqVar, mho mhoVar, armf armfVar3, armf armfVar4) {
        this.c = qynVar;
        this.d = mblVar;
        this.m = xvcVar;
        this.e = armfVar;
        this.f = armfVar2;
        this.g = xnvVar;
        this.h = uhjVar;
        this.i = agnqVar;
        this.j = mhoVar;
        this.k = armfVar3;
        this.l = armfVar4;
    }

    public final void a(long j, boolean z) {
        long j2;
        String str;
        if (j > 0) {
            j2 = this.g.f().toEpochMilli() - j;
        } else {
            j2 = -1;
        }
        mbl mblVar = this.d;
        if (true != z) {
            str = "Bugle.VerifiedSms.WorkManager.VerificationChain.V2.Failure.Latency";
        } else {
            str = "Bugle.VerifiedSms.WorkManager.VerificationChain.V2.Success.Latency";
        }
        mblVar.g(str, j2);
    }

    public final void b(boolean z, long j) {
        String str;
        long epochMilli = this.g.f().toEpochMilli() - j;
        if (true != z) {
            str = "Bugle.VerifiedSms.WorkManager.UpdateVerificationStatus.Failure.Latency";
        } else {
            str = "Bugle.VerifiedSms.WorkManager.UpdateVerificationStatus.Success.Latency";
        }
        this.d.g(str, epochMilli);
    }
}
