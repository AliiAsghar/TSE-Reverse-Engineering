package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.wearable.internal.IWearableService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aclw extends abug {
    private final adae A;
    private final adae B;
    private final adae C;
    private final adae D;
    private final adae E;
    private final adae F;
    private final adae G;
    public final ExecutorService a;
    public final alhr v;
    private final acly w;
    private final adae x;
    private final adae y;
    private final adae z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aclw(Context context, Looper looper, abre abreVar, abrf abrfVar, abua abuaVar) {
        super(context, looper, 14, abuaVar, abreVar, abrfVar);
        abgj abgjVar = accz.a;
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        acly a = acly.a(context);
        this.x = new adae();
        this.y = new adae();
        this.z = new adae();
        this.A = new adae();
        this.B = new adae();
        this.C = new adae();
        this.D = new adae();
        this.E = new adae();
        this.F = new adae();
        this.G = new adae();
        new adae();
        new adae();
        abhg.m(unconfigurableExecutorService);
        this.a = unconfigurableExecutorService;
        this.w = a;
        this.v = albo.D(new ynw(context, 15));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final void A(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (Log.isLoggable("WearableClient", 2)) {
            Log.v("WearableClient", a.bV(i, "onPostInitHandler: statusCode "));
        }
        if (i == 0) {
            this.x.e(iBinder);
            this.y.e(iBinder);
            this.z.e(iBinder);
            this.B.e(iBinder);
            this.C.e(iBinder);
            this.D.e(iBinder);
            this.E.e(iBinder);
            this.F.e(iBinder);
            this.G.e(iBinder);
            this.A.e(iBinder);
            i = 0;
        }
        super.A(i, iBinder, bundle, i2);
    }

    @Override // defpackage.abug, com.google.android.gms.common.internal.BaseGmsClient, defpackage.abqz
    public final int a() {
        return 8600000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return IWearableService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.wearable.BIND";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean gn() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] go() {
        return ackg.D;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, defpackage.abqz
    public final void m(abtv abtvVar) {
        if (!r()) {
            try {
                Bundle bundle = this.b.getPackageManager().getApplicationInfo("com.google.android.wearable.app.cn", 128).metaData;
                int i = 0;
                if (bundle != null) {
                    i = bundle.getInt("com.google.android.wearable.api.version", 0);
                }
                if (i < 8600000) {
                    Log.w("WearableClient", a.bV(i, "The Wear OS app is out of date. Requires API version 8600000 but found "));
                    Context context = this.b;
                    Intent intent = new Intent("com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR").setPackage("com.google.android.wearable.app.cn");
                    if (context.getPackageManager().resolveActivity(intent, 65536) == null) {
                        intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.wearable.app.cn").build());
                    }
                    D(abtvVar, 6, accy.a(context, intent, accy.a));
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                D(abtvVar, 16, null);
                return;
            }
        }
        super.m(abtvVar);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, defpackage.abqz
    public final boolean r() {
        if (!this.w.b()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String y() {
        if (this.w.b()) {
            return "com.google.android.wearable.app.cn";
        }
        return "com.google.android.gms";
    }
}
