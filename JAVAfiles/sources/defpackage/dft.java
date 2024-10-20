package defpackage;

import android.view.ViewStructure;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dft {
    public final Object a;

    public dft(ViewStructure viewStructure) {
        this.a = viewStructure;
    }

    public final void a(String str) {
        ((ViewStructure) this.a).setClassName(str);
    }

    public final void b(CharSequence charSequence) {
        ((ViewStructure) this.a).setText(charSequence);
    }
}
