package defpackage;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.kids.internal.IParentalControlsService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class accf extends abug {
    public accf(Context context, Looper looper, abua abuaVar, absf absfVar, abtc abtcVar) {
        super(context, looper, 42, abuaVar, absfVar, abtcVar);
    }

    @Override // defpackage.abug, com.google.android.gms.common.internal.BaseGmsClient, defpackage.abqz
    public final int a() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* bridge */ /* synthetic */ IInterface b(IBinder iBinder) {
        iBinder.getClass();
        return IParentalControlsService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.kids.internal.IParentalControlsService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.kids.parentalcontrols.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean gn() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] go() {
        return new Feature[]{acbx.a};
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final boolean h() {
        return false;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String y() {
        if (!abvk.d() || true != ((DevicePolicyManager) this.b.getSystemService(DevicePolicyManager.class)).isProfileOwnerApp("com.google.android.gms.supervision")) {
            return "com.google.android.gms";
        }
        return "com.google.android.gms.supervision";
    }
}
