package defpackage;

import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aadd {
    public final TextView a;
    public final TextView b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    private final TextView n;

    @Deprecated
    private final ImageView o;
    private final ImageView p;
    private final ImageView q;

    public aadd(TextView textView, ImageView imageView, TextView textView2, ImageView imageView2, TextView textView3, ImageView imageView3) {
        this.n = textView;
        this.o = imageView;
        this.a = textView2;
        this.p = imageView2;
        this.b = textView3;
        this.q = imageView3;
    }

    private final int f(int i) {
        int i2;
        if (this.c) {
            i2 = this.a.getMeasuredHeight();
        } else {
            i2 = this.h;
        }
        return (i2 - i) / 2;
    }

    private final void g(int i) {
        if (this.c) {
            if (this.d || this.f + i > this.e) {
                this.d = true;
                this.f = this.j;
                this.g += this.h;
            }
        }
    }

    public final void a() {
        if (this.o.getVisibility() == 8) {
            return;
        }
        ImageView imageView = this.o;
        int measuredWidth = imageView.getMeasuredWidth();
        int measuredHeight = imageView.getMeasuredHeight();
        int i = this.i - measuredHeight;
        if (this.c && this.p.getVisibility() == 8 && (this.d || this.f + measuredWidth > this.e)) {
            this.d = true;
            this.f = this.j;
            this.g += this.h;
        }
        ImageView imageView2 = this.o;
        int i2 = this.f;
        int i3 = this.g;
        imageView2.layout(i2, i3 + i, i2 + measuredWidth, i3 + measuredHeight + i);
        this.f += measuredWidth;
    }

    public final void b() {
        if (this.p.getVisibility() == 8) {
            return;
        }
        ImageView imageView = this.p;
        int measuredWidth = imageView.getMeasuredWidth();
        int measuredHeight = imageView.getMeasuredHeight();
        g(measuredWidth);
        int f = f(measuredHeight);
        ImageView imageView2 = this.p;
        int i = this.f;
        int i2 = this.g;
        imageView2.layout(i, i2 + f, i + measuredWidth, i2 + measuredHeight + f);
        this.f += measuredWidth;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if ((r2 + r1) > r7.e) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            r7 = this;
            android.widget.TextView r0 = r7.n
            int r0 = r0.getVisibility()
            r1 = 8
            if (r0 != r1) goto Lb
            goto L60
        Lb:
            android.widget.TextView r0 = r7.n
            int r1 = r0.getMeasuredWidth()
            int r0 = r0.getMeasuredHeight()
            boolean r2 = r7.d
            if (r2 != 0) goto L21
            int r2 = r7.f
            int r3 = r2 + r1
            int r4 = r7.e
            if (r3 <= r4) goto L2f
        L21:
            r2 = 1
            r7.d = r2
            int r2 = r7.j
            r7.f = r2
            int r3 = r7.g
            int r4 = r7.h
            int r3 = r3 + r4
            r7.g = r3
        L2f:
            android.widget.TextView r3 = r7.n
            int r4 = r7.g
            int r5 = r2 + r1
            int r6 = r4 + r0
            r3.layout(r2, r4, r5, r6)
            int r2 = r7.f
            int r2 = r2 + r1
            r7.f = r2
            boolean r1 = r7.c
            if (r1 == 0) goto L60
            android.widget.TextView r1 = r7.n
            int r2 = r7.j
            int r3 = r7.k
            int r4 = r7.m
            int r5 = r7.l
            r1.setPadding(r2, r3, r4, r5)
            int r1 = r7.h
            int r0 = java.lang.Math.max(r0, r1)
            r7.h = r0
            android.widget.TextView r0 = r7.n
            int r0 = r0.getBaseline()
            r7.i = r0
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aadd.c():void");
    }

    public final void d() {
        if (this.q.getVisibility() == 8) {
            return;
        }
        ImageView imageView = this.q;
        ImageView imageView2 = this.p;
        int measuredWidth = imageView.getMeasuredWidth();
        int measuredHeight = imageView.getMeasuredHeight();
        if (imageView2.getVisibility() == 8) {
            g(measuredWidth);
        }
        int f = f(measuredHeight);
        ImageView imageView3 = this.q;
        int i = this.f;
        int i2 = this.g;
        imageView3.layout(i, i2 + f, i + measuredWidth, i2 + measuredHeight + f);
        this.f += measuredWidth;
    }

    public final void e() {
        if (this.a.getVisibility() != 8) {
            TextView textView = this.a;
            ImageView imageView = this.q;
            int measuredWidth = textView.getMeasuredWidth();
            int measuredHeight = textView.getMeasuredHeight();
            if (imageView.getVisibility() == 8 && ((this.c && this.o.getVisibility() == 8 && this.p.getVisibility() == 8 && (this.d || this.f + measuredWidth > this.e)) || (!this.c && (this.d || this.f + measuredWidth > this.e)))) {
                this.d = true;
                this.f = this.j;
                this.g += this.h;
            }
            TextView textView2 = this.a;
            int i = this.f;
            int i2 = this.g;
            textView2.layout(i, i2, i + measuredWidth, i2 + measuredHeight);
            this.f += measuredWidth;
            if (!this.c) {
                this.h = measuredHeight;
                this.i = this.a.getBaseline();
            }
        }
    }
}
