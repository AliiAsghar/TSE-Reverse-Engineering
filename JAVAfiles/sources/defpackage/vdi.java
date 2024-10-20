package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vdi {
    public static final /* synthetic */ int b = 0;
    private static final utz c = uuh.e(uuh.b, "tachyon_streaming_grpc_deadline_seconds", 900);
    static final utz a = uuh.e(uuh.b, "tachyon_grpc_deadline_seconds", 30);

    public static arlb a(arlb arlbVar, boolean z) {
        int intValue;
        if (((Boolean) utw.h.e()).booleanValue()) {
            aqrs aqrsVar = arlbVar.a;
            aqrp a2 = aqrr.a(arlbVar.b);
            a2.c = "gzip";
            arlbVar = arlbVar.a(aqrsVar, new aqrr(a2));
        }
        if (z) {
            intValue = ((Integer) c.e()).intValue();
        } else {
            intValue = ((Integer) a.e()).intValue();
        }
        if (intValue > 0) {
            return arlbVar.h(intValue, TimeUnit.SECONDS);
        }
        return arlbVar;
    }

    public static arlb b(arlb arlbVar, aqut aqutVar, boolean z) {
        return a(arlbVar.i(new arll(aqutVar, 0)), z);
    }
}
