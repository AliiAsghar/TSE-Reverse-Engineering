package defpackage;

import com.google.android.gms.auth.api.signin.internal.ISignInService;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abmb extends abmc {
    public abmb(abrg abrgVar) {
        super(abrgVar);
    }

    @Override // defpackage.abry
    protected final /* bridge */ /* synthetic */ void b(abqu abquVar) {
        ablx ablxVar = (ablx) abquVar;
        ((ISignInService) ablxVar.w()).revokeAccessFromGoogle(new abma(this), ablxVar.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ abrm a(Status status) {
        return status;
    }
}
