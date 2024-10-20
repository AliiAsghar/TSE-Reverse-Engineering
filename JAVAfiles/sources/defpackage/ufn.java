package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ufn extends ufu {
    public final byte[] a;
    public final yfo b;

    public ufn(String str, byte[] bArr, int i, xnv xnvVar, yfo yfoVar) {
        super(str, i, xnvVar);
        this.a = bArr;
        this.b = yfoVar;
    }

    @Override // defpackage.ugg
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.ufu
    public final Bitmap d() {
        o();
        try {
            xyl.h();
            byte[] bArr = this.a;
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        } finally {
            r();
        }
    }

    @Override // defpackage.ufu
    public final Bitmap e() {
        return null;
    }

    @Override // defpackage.ufu
    public final Drawable f(Resources resources) {
        return null;
    }

    @Override // defpackage.ufu
    public final boolean i() {
        return false;
    }

    @Override // defpackage.ufu
    public final byte[] j() {
        o();
        try {
            byte[] bArr = this.a;
            return Arrays.copyOf(bArr, bArr.length);
        } finally {
            r();
        }
    }

    @Override // defpackage.ugg
    public final boolean k() {
        return true;
    }

    @Override // defpackage.ugg
    public final ufw l() {
        xyl.k(true);
        return new ufm(this);
    }

    @Override // defpackage.ugg
    protected final void b() {
    }
}
