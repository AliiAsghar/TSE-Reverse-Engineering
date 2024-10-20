package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.search.ime.internal.IIMEUpdatesService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class achk extends achg {
    public achk(Context context, abua abuaVar, absf absfVar, abtc abtcVar, achu achuVar) {
        super(context, context.getMainLooper(), 66, abuaVar, absfVar, abtcVar, achuVar);
    }

    @Override // defpackage.abug, com.google.android.gms.common.internal.BaseGmsClient, defpackage.abqz
    public final int a() {
        return 12600000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return IIMEUpdatesService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.search.ime.internal.IIMEUpdatesService";
    }
}
