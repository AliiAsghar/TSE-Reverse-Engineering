package defpackage;

import android.graphics.ColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iau extends cor implements bzt {
    public final Drawable a;
    public final byn c;
    public final byn b = new byu(0, cav.a);
    private final arml d = armd.a(new gqu(this, 16));

    public iau(Drawable drawable) {
        this.a = drawable;
        this.c = new byu(new cjt(iav.a(drawable)), cav.a);
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    @Override // defpackage.cor
    public final long a() {
        return ((cjt) this.c.a()).a;
    }

    @Override // defpackage.cor
    protected final void b(cny cnyVar) {
        ckr b = cnyVar.q().b();
        j();
        this.a.setBounds(0, 0, arsk.g(Float.intBitsToFloat((int) (cnyVar.o() >> 32))), arsk.g(Float.intBitsToFloat((int) (cnyVar.o() & 4294967295L))));
        try {
            b.l();
            this.a.draw(cjx.a(b));
        } finally {
            b.j();
        }
    }

    @Override // defpackage.cor
    protected final void c(float f) {
        this.a.setAlpha(arrn.u(arsk.g(f * 255.0f), 0, 255));
    }

    @Override // defpackage.cor
    protected final void d(ckv ckvVar) {
        ColorFilter colorFilter;
        if (ckvVar != null) {
            colorFilter = ckvVar.b;
        } else {
            colorFilter = null;
        }
        this.a.setColorFilter(colorFilter);
    }

    @Override // defpackage.cor
    protected final void f(drk drkVar) {
        int i;
        drkVar.getClass();
        drk drkVar2 = drk.a;
        int ordinal = drkVar.ordinal();
        if (ordinal != 0) {
            i = 1;
            if (ordinal != 1) {
                throw new armm();
            }
        } else {
            i = 0;
        }
        this.a.setLayoutDirection(i);
    }

    @Override // defpackage.bzt
    public final void g() {
        h();
    }

    @Override // defpackage.bzt
    public final void h() {
        Object obj = this.a;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
        this.a.setVisible(false, false);
        this.a.setCallback(null);
    }

    @Override // defpackage.bzt
    public final void i() {
        this.a.setCallback((Drawable.Callback) this.d.a());
        this.a.setVisible(true, true);
        Object obj = this.a;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }

    public final int j() {
        return ((Number) this.b.a()).intValue();
    }
}
