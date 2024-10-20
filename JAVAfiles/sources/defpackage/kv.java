package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kv extends kr {
    public final SeekBar b;
    public Drawable c;
    private ColorStateList d;
    private PorterDuff.Mode e;
    private boolean f;
    private boolean g;

    public kv(SeekBar seekBar) {
        super(seekBar);
        this.d = null;
        this.e = null;
        this.f = false;
        this.g = false;
        this.b = seekBar;
    }

    private final void c() {
        Drawable drawable = this.c;
        if (drawable != null) {
            if (this.f || this.g) {
                Drawable mutate = drawable.mutate();
                this.c = mutate;
                if (this.f) {
                    mutate.setTintList(this.d);
                }
                if (this.g) {
                    this.c.setTintMode(this.e);
                }
                if (this.c.isStateful()) {
                    this.c.setState(this.b.getDrawableState());
                }
            }
        }
    }

    @Override // defpackage.kr
    public final void b(AttributeSet attributeSet, int i) {
        super.b(attributeSet, i);
        ktk A = ktk.A(this.b.getContext(), attributeSet, gc.h, i, 0);
        Object obj = A.b;
        SeekBar seekBar = this.b;
        eek.m(seekBar, seekBar.getContext(), gc.h, attributeSet, (TypedArray) obj, i, 0);
        Drawable q = A.q(0);
        if (q != null) {
            this.b.setThumb(q);
        }
        Drawable p = A.p(1);
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.c = p;
        if (p != null) {
            p.setCallback(this.b);
            p.setLayoutDirection(this.b.getLayoutDirection());
            if (p.isStateful()) {
                p.setState(this.b.getDrawableState());
            }
            c();
        }
        this.b.invalidate();
        if (A.v(3)) {
            this.e = a.u(A.k(3, -1), this.e);
            this.g = true;
        }
        if (A.v(2)) {
            this.d = A.o(2);
            this.f = true;
        }
        A.t();
        c();
    }
}
