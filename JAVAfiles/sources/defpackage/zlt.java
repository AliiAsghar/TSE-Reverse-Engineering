package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zlt {
    public static final Uri a = Uri.parse("content://sms/icc");
    public static final String[] b = {"address", "body", "date", "index_on_icc"};
    public final xnv c;
    public final yjy d;
    public final anen e;
    public final armf f;
    public final akfd g = new akgc("SIM_MESSAGES_DATA_SOURCE");
    public final atsg h;
    public final ahiy i;
    private final znj j;

    public zlt(ahiy ahiyVar, atsg atsgVar, xnv xnvVar, znj znjVar, anen anenVar, yjy yjyVar, armf armfVar) {
        this.i = ahiyVar;
        this.h = atsgVar;
        this.c = xnvVar;
        this.j = znjVar;
        this.d = yjyVar;
        this.e = anenVar;
        this.f = armfVar;
    }

    public final String a(long j) {
        if (j > 0) {
            return this.j.z(j).toString();
        }
        return null;
    }
}
