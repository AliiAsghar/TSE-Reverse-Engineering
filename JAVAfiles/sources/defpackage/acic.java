package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.spatula.settings.internal.ISpatulaSettingsService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acic extends abug {
    public acic(Context context, Looper looper, abua abuaVar, absf absfVar, abtc abtcVar) {
        super(context, looper, 386, abuaVar, absfVar, abtcVar);
    }

    @Override // defpackage.abug, com.google.android.gms.common.internal.BaseGmsClient, defpackage.abqz
    public final int a() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* bridge */ /* synthetic */ IInterface b(IBinder iBinder) {
        iBinder.getClass();
        return ISpatulaSettingsService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.spatula.settings.internal.ISpatulaSettingsService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.spatula.settings.api.SpatulaSettingsApiService.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean gn() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] go() {
        return acid.b;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final boolean h() {
        return true;
    }
}
