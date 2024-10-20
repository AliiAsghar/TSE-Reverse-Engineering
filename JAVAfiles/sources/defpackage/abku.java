package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import com.google.android.auth.IAuthManagerService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abku implements abkv {
    final /* synthetic */ String a;
    final /* synthetic */ Bundle b;

    public abku(String str, Bundle bundle) {
        this.a = str;
        this.b = bundle;
    }

    @Override // defpackage.abkv
    public final /* bridge */ /* synthetic */ Object a(IBinder iBinder) {
        Bundle clearToken = IAuthManagerService.Stub.asInterface(iBinder).clearToken(this.a, this.b);
        abkw.j(clearToken);
        String string = clearToken.getString("Error");
        if (clearToken.getBoolean("booleanResult")) {
            return null;
        }
        throw new abks(string);
    }
}
