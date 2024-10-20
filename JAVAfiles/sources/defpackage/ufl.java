package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ufl extends ufu {
    private final byte[] a;

    public ufl(String str, byte[] bArr, xnv xnvVar) {
        super(str, 1, xnvVar);
        this.a = bArr;
    }

    @Override // defpackage.ugg
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.ufu
    public final Bitmap d() {
        throw new uft();
    }

    @Override // defpackage.ufu
    public final Bitmap e() {
        return null;
    }

    @Override // defpackage.ufu
    public final Drawable f(Resources resources) {
        throw new uft();
    }

    @Override // defpackage.ugg
    public final boolean h() {
        return true;
    }

    @Override // defpackage.ufu
    public final boolean i() {
        return false;
    }

    @Override // defpackage.ufu
    public final byte[] j() {
        return this.a;
    }

    @Override // defpackage.ugg
    protected final void b() {
    }
}
