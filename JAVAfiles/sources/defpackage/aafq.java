package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aafq implements yjj {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public aafq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.yjj
    public final void d() {
        if (this.b != 0) {
            qiu.h(((zgn) this.a).g.d());
            ((zgn) this.a).c.a();
            ((zgn) this.a).a();
            return;
        }
        ((aafr) this.a).o.z();
    }

    @Override // defpackage.yjj
    public final boolean e() {
        if (this.b != 0) {
            ((zgn) this.a).b();
            return false;
        }
        cj fe = ((aafr) this.a).o.v().fe();
        new AlertDialog.Builder(fe).setMessage(R.string.enable_location_permissions).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(android.R.string.ok, new ivs(fe, 7)).create().show();
        return false;
    }

    @Override // defpackage.yjj
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.yjj
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.yjj
    public final /* synthetic */ void c() {
    }
}
