package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajer {
    public final MaterialButton a;
    public ajkr b;
    public ejs c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public PorterDuff.Mode j;
    public ColorStateList k;
    public ColorStateList l;
    public ColorStateList m;
    public Drawable n;
    public boolean q;
    public LayerDrawable s;
    public int t;
    public aksr u;
    public boolean o = false;
    public boolean p = false;
    public boolean r = true;

    public ajer(MaterialButton materialButton, ajkr ajkrVar) {
        this.a = materialButton;
        this.b = ajkrVar;
    }

    private final ajkm f(boolean z) {
        LayerDrawable layerDrawable = this.s;
        if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 0) {
            return (ajkm) ((LayerDrawable) ((InsetDrawable) this.s.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
        }
        return null;
    }

    public final ajkm a() {
        return f(false);
    }

    public final ajkm b() {
        return f(true);
    }

    public final void c() {
        this.o = true;
        this.a.e(this.k);
        this.a.f(this.j);
    }

    public final void d(ajkr ajkrVar) {
        this.b = ajkrVar;
        this.u = null;
        e();
    }

    public final void e() {
        ajkm a = a();
        if (a != null) {
            aksr aksrVar = this.u;
            if (aksrVar != null) {
                a.S(aksrVar);
            } else {
                a.fn(this.b);
            }
            ejs ejsVar = this.c;
            if (ejsVar != null) {
                a.H(ejsVar);
            }
        }
        ajkm b = b();
        if (b != null) {
            aksr aksrVar2 = this.u;
            if (aksrVar2 != null) {
                b.S(aksrVar2);
            } else {
                b.fn(this.b);
            }
            ejs ejsVar2 = this.c;
            if (ejsVar2 != null) {
                b.H(ejsVar2);
            }
        }
        LayerDrawable layerDrawable = this.s;
        ajlc ajlcVar = null;
        if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 1) {
            ajlcVar = this.s.getNumberOfLayers() > 2 ? (ajlc) this.s.getDrawable(2) : (ajlc) this.s.getDrawable(1);
        }
        if (ajlcVar != null) {
            ajlcVar.fn(this.b);
            if (ajlcVar instanceof ajkm) {
                ajkm ajkmVar = (ajkm) ajlcVar;
                aksr aksrVar3 = this.u;
                if (aksrVar3 != null) {
                    ajkmVar.S(aksrVar3);
                }
                ejs ejsVar3 = this.c;
                if (ejsVar3 != null) {
                    ajkmVar.H(ejsVar3);
                }
            }
        }
    }
}
