package defpackage;

import android.app.Activity;
import android.view.View;
import android.widget.EditText;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ink {
    public final Activity a;
    public final agak b;
    public agar c;
    public EditText d;

    public ink(Activity activity, agak agakVar) {
        this.a = activity;
        this.b = agakVar;
    }

    public final int a() {
        return this.b.a();
    }

    public final int b() {
        return this.b.b();
    }

    public final void c(View view) {
        this.b.e(view, false);
    }

    public final boolean d() {
        return this.b.h();
    }

    public final boolean e() {
        if (this.b.d() == agaq.a) {
            return true;
        }
        return false;
    }

    public final boolean f(EditText editText) {
        if (e() && this.d == editText) {
            return true;
        }
        return false;
    }

    public final void g() {
        this.d = null;
        agar agarVar = this.c;
        if (agarVar != null) {
            this.c = null;
            this.b.n(agarVar);
        }
    }
}
