package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aefc extends abug {
    public aefc(Context context, Looper looper, abua abuaVar, absf absfVar, abtc abtcVar) {
        super(context, looper, 397, abuaVar, absfVar, abtcVar);
    }

    @Override // defpackage.abug, com.google.android.gms.common.internal.BaseGmsClient, defpackage.abqz
    public final int a() {
        return 243300000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* bridge */ /* synthetic */ IInterface b(IBinder iBinder) {
        iBinder.getClass();
        return ISafetyCoreService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.apps.safetycore.classification.BIND";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean gn() {
        return false;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] go() {
        return new Feature[0];
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final boolean h() {
        return true;
    }
}
