package defpackage;

import android.content.Context;
import com.google.android.gms.cobalt.LogOccurrenceRequest;
import com.google.android.gms.cobalt.internal.ICobaltLoggerService;
import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abpw extends abrc implements abpo {
    private static final abqt m;
    private static final aaoc n;
    private static final abmt o;
    public final int a;
    public final int b;

    static {
        abmt abmtVar = new abmt();
        o = abmtVar;
        abpu abpuVar = new abpu();
        m = abpuVar;
        n = new aaoc("CobaltLogger.API", abpuVar, abmtVar);
    }

    public abpw(Context context, abpq abpqVar) {
        super(context, n, abpqVar, abrb.a);
        this.a = abpqVar.a;
        this.b = abpqVar.b;
    }

    @Override // defpackage.abpo
    public final acir a(final int i, final int[] iArr) {
        ajxp ajxpVar = new ajxp(null);
        ajxpVar.d = new Feature[]{abpr.a};
        ajxpVar.c();
        ajxpVar.c = new abtf() { // from class: abpt
            @Override // defpackage.abtf
            public final void a(Object obj, Object obj2) {
                abpv abpvVar = new abpv((acit) obj2);
                LogOccurrenceRequest logOccurrenceRequest = new LogOccurrenceRequest();
                abpw abpwVar = abpw.this;
                logOccurrenceRequest.a = abpwVar.a;
                logOccurrenceRequest.b = abpwVar.b;
                logOccurrenceRequest.c = i;
                logOccurrenceRequest.d = 1L;
                logOccurrenceRequest.e = iArr;
                ((ICobaltLoggerService) ((abps) obj).w()).logOccurrence(logOccurrenceRequest, abpvVar);
            }
        };
        return f(ajxpVar.b());
    }
}
