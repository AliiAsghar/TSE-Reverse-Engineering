package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.asterism.internal.IAsterismApiService;
import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abkp extends abug {
    public abkp(Context context, Looper looper, abua abuaVar, abre abreVar, abrf abrfVar) {
        super(context, looper, 199, abuaVar, abreVar, abrfVar);
    }

    @Override // defpackage.abug, com.google.android.gms.common.internal.BaseGmsClient, defpackage.abqz
    public final int a() {
        return 16200000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return IAsterismApiService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.asterism.internal.IAsterismApiService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.asterism.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean gn() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] go() {
        return abvu.h;
    }
}
