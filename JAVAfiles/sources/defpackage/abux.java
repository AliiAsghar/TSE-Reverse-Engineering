package defpackage;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.TelemetryData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abux extends abrc implements abut {
    public static final /* synthetic */ int a = 0;
    private static final abqt b;
    private static final aaoc m;
    private static final abmt n;

    static {
        abmt abmtVar = new abmt();
        n = abmtVar;
        abuw abuwVar = new abuw();
        b = abuwVar;
        m = new aaoc("ClientTelemetry.API", abuwVar, abmtVar);
    }

    public abux(Context context, abuu abuuVar) {
        super(context, m, abuuVar, abrb.a);
    }

    @Override // defpackage.abut
    public final void a(TelemetryData telemetryData) {
        ajxp ajxpVar = new ajxp(null);
        ajxpVar.d = new Feature[]{abpb.a};
        ajxpVar.c();
        ajxpVar.c = new abot(telemetryData, 2);
        f(ajxpVar.b());
    }
}
