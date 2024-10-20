package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkz extends eal {
    final /* synthetic */ arvo a;
    final /* synthetic */ dmi b;

    public dkz(arvo arvoVar, dmi dmiVar) {
        this.a = arvoVar;
        this.b = dmiVar;
    }

    @Override // defpackage.eal
    public final void a(int i) {
        this.a.h(new IllegalStateException("Unable to load font " + this.b + " (reason=" + i + ')'));
    }

    @Override // defpackage.eal
    public final void b(Typeface typeface) {
        this.a.w(typeface);
    }
}
