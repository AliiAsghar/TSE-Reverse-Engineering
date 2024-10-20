package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.search.queries.internal.ISearchQueriesService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class achq extends achg<ISearchQueriesService> {
    public achq(Context context, Looper looper, abua abuaVar, absf absfVar, abtc abtcVar, achu achuVar) {
        super(context, looper, 32, abuaVar, absfVar, abtcVar, achuVar);
    }

    @Override // defpackage.abug, com.google.android.gms.common.internal.BaseGmsClient, defpackage.abqz
    public final int a() {
        return 12600000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return ISearchQueriesService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.search.queries.internal.ISearchQueriesService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean gn() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] go() {
        return acbh.i;
    }

    public achq(Context context, abua abuaVar, absf absfVar, abtc abtcVar, achu achuVar) {
        super(context, context.getMainLooper(), 32, abuaVar, absfVar, abtcVar, achuVar);
    }
}
