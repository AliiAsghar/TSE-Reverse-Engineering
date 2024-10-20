package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmx extends Drawable.ConstantState {
    int a;
    gmw b;
    ColorStateList c;
    PorterDuff.Mode d;
    boolean e;
    Bitmap f;
    ColorStateList g;
    PorterDuff.Mode h;
    int i;
    boolean j;
    boolean k;
    Paint l;

    public gmx() {
        this.c = null;
        this.d = gmz.a;
        this.b = new gmw();
    }

    public final void a(int i, int i2) {
        this.f.eraseColor(0);
        Canvas canvas = new Canvas(this.f);
        gmw gmwVar = this.b;
        gmwVar.a(gmwVar.d, gmw.a, canvas, i, i2);
    }

    public final boolean b() {
        gmw gmwVar = this.b;
        if (gmwVar.k == null) {
            gmwVar.k = Boolean.valueOf(gmwVar.d.e());
        }
        return gmwVar.k.booleanValue();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new gmz(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new gmz(this);
    }

    public gmx(gmx gmxVar) {
        this.c = null;
        this.d = gmz.a;
        if (gmxVar != null) {
            this.a = gmxVar.a;
            this.b = new gmw(gmxVar.b);
            Paint paint = gmxVar.b.c;
            if (paint != null) {
                this.b.c = new Paint(paint);
            }
            Paint paint2 = gmxVar.b.b;
            if (paint2 != null) {
                this.b.b = new Paint(paint2);
            }
            this.c = gmxVar.c;
            this.d = gmxVar.d;
            this.e = gmxVar.e;
        }
    }
}
