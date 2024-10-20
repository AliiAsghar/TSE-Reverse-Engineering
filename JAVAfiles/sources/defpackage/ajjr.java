package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajjr extends ajjn {
    public final ajjp a;
    public final ajjq b;
    public Drawable c;

    public ajjr(Context context, ajiv ajivVar, ajjp ajjpVar, ajjq ajjqVar) {
        super(context, ajivVar);
        this.a = ajjpVar;
        this.b = ajjqVar;
        ajjqVar.j = this;
    }

    private final boolean a() {
        if (this.o == null || ajgk.k(this.i.getContentResolver()) != brg.a) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        boolean z2;
        Drawable drawable;
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            if (a() && (drawable = this.c) != null) {
                drawable.setBounds(getBounds());
                this.c.setTint(this.j.c[0]);
                this.c.draw(canvas);
                return;
            }
            canvas.save();
            this.a.a(canvas, getBounds(), f(), k(), j());
            ajiv ajivVar = this.j;
            int i = ajivVar.g;
            int i2 = this.n;
            if ((ajivVar instanceof ajjg) && ((ajjg) ajivVar).p) {
                z = true;
            } else {
                z = false;
            }
            if (z && i == 0) {
                if (!ajivVar.b(false)) {
                    i = 0;
                    z2 = true;
                } else {
                    z2 = false;
                    i = 0;
                }
            } else {
                z2 = false;
            }
            if (z2) {
                this.a.d(canvas, this.m, brg.a, 1.0f, this.j.d, i2, 0);
            } else if (z) {
                ajjo ajjoVar = (ajjo) this.b.k.get(0);
                ajjo ajjoVar2 = (ajjo) this.b.k.get(r4.size() - 1);
                canvas.save();
                canvas.rotate(ajjoVar2.g);
                this.a.d(canvas, this.m, ajjoVar2.b, ajjoVar.a + 1.0f, this.j.d, i2, i);
                canvas.restore();
            }
            for (int i3 = 0; i3 < this.b.k.size(); i3++) {
                ajjo ajjoVar3 = (ajjo) this.b.k.get(i3);
                ajjoVar3.f = g();
                this.a.c(canvas, this.m, ajjoVar3, this.n);
                if (i3 > 0 && !z2 && z) {
                    this.a.d(canvas, this.m, ((ajjo) this.b.k.get(i3 - 1)).b, ajjoVar3.a, this.j.d, i2, i);
                }
            }
            canvas.restore();
        }
    }

    @Override // defpackage.ajjn
    public final boolean e(boolean z, boolean z2, boolean z3) {
        Drawable drawable;
        boolean e = super.e(z, z2, z3);
        if (a() && (drawable = this.c) != null) {
            return drawable.setVisible(z, z2);
        }
        if (!isRunning()) {
            this.b.a();
        }
        if (z && z3) {
            this.b.d();
        }
        return e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.b();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.b();
    }

    @Override // defpackage.ajjn, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getOpacity() {
        return -3;
    }
}
