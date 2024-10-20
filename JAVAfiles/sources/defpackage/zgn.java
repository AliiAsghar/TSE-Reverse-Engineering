package defpackage;

import android.app.Activity;
import android.os.UserManager;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.PermissionCheckActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zgn extends zgo {
    public TextView a;
    public TextView b;
    public final wnw c;
    public final UserManager d;
    public final Activity e;
    public final armf f;
    public final xcj g;
    public final lpg h;
    private final yjf j;
    private final armf k;
    private final qoq l;
    private final zas m;

    public zgn(xcj xcjVar, yjf yjfVar, armf armfVar, qoq qoqVar, wnw wnwVar, zas zasVar, UserManager userManager, PermissionCheckActivity permissionCheckActivity, lpg lpgVar, armf armfVar2) {
        this.g = xcjVar;
        this.j = yjfVar;
        this.k = armfVar;
        this.l = qoqVar;
        this.c = wnwVar;
        this.m = zasVar;
        this.d = userManager;
        this.e = permissionCheckActivity;
        this.h = lpgVar;
        this.f = armfVar2;
    }

    public final void a() {
        if (!this.e.isFinishing()) {
            this.l.f(this.e);
            this.e.finish();
            this.e.setTitle("");
        }
    }

    public final void b() {
        this.a.setVisibility(8);
        this.b.setVisibility(0);
        ((TextView) this.e.findViewById(R.id.enable_permission_title)).setText(R.string.required_permissions_no_promptable_title);
        ((TextView) this.e.findViewById(R.id.enable_permission_procedure)).setText(R.string.required_permissions_no_promptable_promo);
    }

    public final void c() {
        if (this.j.h()) {
            a();
            return;
        }
        ((yjl) this.k.b()).f(yjh.MINIMUM_REQUIRED_PERMISSIONS, new aafq(this, 1));
    }

    public final boolean d() {
        if (this.m.h()) {
            return false;
        }
        a();
        return true;
    }
}
