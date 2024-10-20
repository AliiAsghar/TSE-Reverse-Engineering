package defpackage;

import android.content.Context;
import android.os.Process;
import android.os.UserManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yib implements yia {
    final UserManager a;
    private final /* synthetic */ int b;

    public yib(Context context, int i, byte[] bArr) {
        this.b = i;
        d.t(context != null, "Context cannot be null.");
        this.a = (UserManager) context.getSystemService("user");
    }

    @Override // defpackage.yia
    public final boolean a() {
        if (this.b != 0) {
            UserManager userManager = this.a;
            userManager.getClass();
            return userManager.isMainUser();
        }
        UserManager userManager2 = this.a;
        userManager2.getClass();
        if (userManager2.getSerialNumberForUser(Process.myUserHandle()) == 0) {
            return true;
        }
        return false;
    }

    public yib(Context context, int i) {
        this.b = i;
        d.t(context != null, "Context cannot be null.");
        this.a = (UserManager) context.getSystemService("user");
    }
}
