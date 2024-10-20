package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.gmscompliance.IGmsDeviceComplianceService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acab extends abug {
    public acab(Context context, Looper looper, abua abuaVar, absf absfVar, abtc abtcVar) {
        super(context, looper, 257, abuaVar, absfVar, abtcVar);
    }

    @Override // defpackage.abug, com.google.android.gms.common.internal.BaseGmsClient, defpackage.abqz
    public final int a() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return IGmsDeviceComplianceService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.gmscompliance.IGmsDeviceComplianceService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.gmscompliance.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean gn() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] go() {
        return abzq.b;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final boolean h() {
        return true;
    }
}
