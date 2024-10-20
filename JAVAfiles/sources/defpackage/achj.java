package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.search.global.internal.IGlobalSearchAdminService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class achj extends achg {
    public achj(Context context, abua abuaVar, absf absfVar, abtc abtcVar, achu achuVar) {
        super(context, context.getMainLooper(), 33, abuaVar, absfVar, abtcVar, achuVar);
    }

    @Override // defpackage.abug, com.google.android.gms.common.internal.BaseGmsClient, defpackage.abqz
    public final int a() {
        return 12600000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return IGlobalSearchAdminService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.search.global.internal.IGlobalSearchAdminService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean gn() {
        return true;
    }
}
