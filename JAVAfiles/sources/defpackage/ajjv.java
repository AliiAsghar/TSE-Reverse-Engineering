package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajjv extends ajka {
    private final Typeface a;
    private boolean b;
    private final asqc c;

    public ajjv(asqc asqcVar, Typeface typeface) {
        this.a = typeface;
        this.c = asqcVar;
    }

    private final void d(Typeface typeface) {
        if (!this.b) {
            ajhu ajhuVar = (ajhu) this.c.a;
            if (ajhuVar.n(typeface)) {
                ajhuVar.d();
            }
        }
    }

    @Override // defpackage.ajka
    public final void a(int i) {
        d(this.a);
    }

    @Override // defpackage.ajka
    public final void b(Typeface typeface, boolean z) {
        d(typeface);
    }

    public final void c() {
        this.b = true;
    }
}
