package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.usagereporting.internal.UsageReportingClientImpl;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acje extends abqt {
    @Override // defpackage.abqt
    public final /* synthetic */ abqz w(Context context, Looper looper, abua abuaVar, Object obj, abre abreVar, abrf abrfVar) {
        return new UsageReportingClientImpl(context, looper, abuaVar, abreVar, abrfVar);
    }
}
