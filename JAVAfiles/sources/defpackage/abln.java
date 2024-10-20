package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.credentials.internal.ICredentialsService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abln extends abug {
    private final ablh a;

    public abln(Context context, Looper looper, abua abuaVar, ablh ablhVar, abre abreVar, abrf abrfVar) {
        super(context, looper, 68, abuaVar, abreVar, abrfVar);
        ablg ablgVar = new ablg(ablhVar == null ? ablh.a : ablhVar);
        ablgVar.b = acbj.a();
        this.a = new ablh(ablgVar);
    }

    @Override // defpackage.abug, com.google.android.gms.common.internal.BaseGmsClient, defpackage.abqz
    public final int a() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return ICredentialsService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        ablh ablhVar = this.a;
        bundle.putBoolean("force_save_dialog", ablhVar.c);
        bundle.putString("log_session_id", ablhVar.d);
        return bundle;
    }
}
