package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahwt implements acig {
    @Override // defpackage.acig
    public final /* bridge */ /* synthetic */ Object a(acir acirVar) {
        acit acitVar = new acit();
        if (((aciv) acirVar).c) {
            acitVar.c(new abra(new Status(16, "Location request was cancelled. Please try again.")));
        } else if (acirVar.g() == null && acirVar.h() == null) {
            acitVar.c(new abra(new Status(8, "Location unavailable.")));
        }
        if (((acir) acitVar.a).g() != null) {
            return acitVar.a;
        }
        return acirVar;
    }
}
