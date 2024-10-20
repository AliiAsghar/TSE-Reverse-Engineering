package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.cobalt.internal.ICobaltLoggerService;
import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abps extends abug {
    public abps(Context context, Looper looper, abua abuaVar, absf absfVar, abtc abtcVar) {
        super(context, looper, 364, abuaVar, absfVar, abtcVar);
    }

    @Override // defpackage.abug, com.google.android.gms.common.internal.BaseGmsClient, defpackage.abqz
    public final int a() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return ICobaltLoggerService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.cobalt.internal.ICobaltLoggerService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.cobalt.api.CobaltLoggerApiService.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] go() {
        return abpr.b;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final boolean h() {
        return true;
    }
}
