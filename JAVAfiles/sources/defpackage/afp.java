package defpackage;

import android.view.View;
import android.widget.Magnifier;
import defpackage.afo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afp implements afn {
    public static final afp a = new afp();

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a extends afo.a {
        public a(Magnifier magnifier) {
            super(magnifier);
        }

        @Override // afo.a, defpackage.afm
        public final void d(long j, float f) {
            if (!Float.isNaN(f)) {
                this.a.setZoom(f);
            }
            this.a.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)));
        }
    }

    private afp() {
    }

    @Override // defpackage.afn
    public final /* bridge */ /* synthetic */ afm a(View view, boolean z, long j, float f, float f2, boolean z2, dqv dqvVar, float f3) {
        Magnifier build;
        if (z) {
            return new a(new Magnifier(view));
        }
        long eq = dqvVar.eq(j);
        float em = dqvVar.em(f);
        float em2 = dqvVar.em(f2);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (eq != 9205357640488583168L) {
            builder.setSize(arsk.g(Float.intBitsToFloat((int) (eq >> 32))), arsk.g(Float.intBitsToFloat((int) (eq & 4294967295L))));
        }
        if (!Float.isNaN(em)) {
            builder.setCornerRadius(em);
        }
        if (!Float.isNaN(em2)) {
            builder.setElevation(em2);
        }
        if (!Float.isNaN(f3)) {
            builder.setInitialZoom(f3);
        }
        builder.setClippingEnabled(z2);
        build = builder.build();
        return new a(build);
    }

    @Override // defpackage.afn
    public final boolean b() {
        return true;
    }
}
