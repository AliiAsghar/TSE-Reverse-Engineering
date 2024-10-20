package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hxl extends hxt implements hxy {
    private Animatable c;

    public hxl(ImageView imageView) {
        super(imageView);
    }

    private final void p(Object obj) {
        if (obj instanceof Animatable) {
            Animatable animatable = (Animatable) obj;
            this.c = animatable;
            animatable.start();
            return;
        }
        this.c = null;
    }

    private final void q(Object obj) {
        i(obj);
        p(obj);
    }

    @Override // defpackage.hxg, defpackage.hxq
    public final void a(Drawable drawable) {
        q(null);
        n(drawable);
    }

    @Override // defpackage.hxq
    public final void b(Object obj, hxz hxzVar) {
        if (hxzVar != null && hxzVar.a(obj, this)) {
            p(obj);
        } else {
            q(obj);
        }
    }

    @Override // defpackage.hxg, defpackage.hxq
    public final void e(Drawable drawable) {
        this.b.c();
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
        q(null);
        n(drawable);
    }

    @Override // defpackage.hxg, defpackage.hxq
    public final void f(Drawable drawable) {
        q(null);
        n(drawable);
    }

    protected abstract void i(Object obj);

    @Override // defpackage.hxy
    public final Drawable j() {
        return ((ImageView) this.a).getDrawable();
    }

    @Override // defpackage.hxg, defpackage.hwb
    public final void l() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // defpackage.hxg, defpackage.hwb
    public final void m() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // defpackage.hxy
    public final void n(Drawable drawable) {
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    @Deprecated
    public hxl(ImageView imageView, byte[] bArr) {
        super(imageView);
        o();
    }
}
