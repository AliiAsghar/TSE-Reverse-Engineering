package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hxi implements hxq {
    public hwx c;

    public hxi() {
        this(null);
    }

    @Override // defpackage.hxq
    public final hwx c() {
        return this.c;
    }

    @Override // defpackage.hxq
    public final void d(hxp hxpVar) {
        hxpVar.g(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // defpackage.hxq
    public final void h(hwx hwxVar) {
        this.c = hwxVar;
    }

    public hxi(byte[] bArr) {
        if (!hyv.n(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
    }

    @Override // defpackage.hwb
    public final void k() {
    }

    @Override // defpackage.hwb
    public final void l() {
    }

    @Override // defpackage.hwb
    public final void m() {
    }

    @Override // defpackage.hxq
    public final void a(Drawable drawable) {
    }

    @Override // defpackage.hxq
    public final void f(Drawable drawable) {
    }

    @Override // defpackage.hxq
    public final void g(hxp hxpVar) {
    }
}
