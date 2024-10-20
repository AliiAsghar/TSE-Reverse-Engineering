package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dzk {
    public dyu g;
    CharSequence h;
    public CharSequence i;
    public boolean j = false;

    protected String a() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(Bundle bundle) {
        bundle.remove("android.summaryText");
        bundle.remove("android.title.big");
        bundle.remove("android.support.v4.app.extra.COMPAT_TEMPLATE");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(Bundle bundle) {
        if (bundle.containsKey("android.summaryText")) {
            this.i = bundle.getCharSequence("android.summaryText");
            this.j = true;
        }
        this.h = bundle.getCharSequence("android.title.big");
    }

    public void f(fqf fqfVar) {
        throw null;
    }

    public final void h(dyu dyuVar) {
        if (this.g != dyuVar) {
            this.g = dyuVar;
            if (dyuVar != null) {
                dyuVar.t(this);
            }
        }
    }

    public void i(Bundle bundle) {
        if (this.j) {
            bundle.putCharSequence("android.summaryText", this.i);
        }
        CharSequence charSequence = this.h;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        bundle.putString("android.support.v4.app.extra.COMPAT_TEMPLATE", a());
    }

    public void j() {
    }
}
