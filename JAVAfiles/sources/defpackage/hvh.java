package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvh extends huy implements hpq {
    public hvh(hvf hvfVar) {
        super(hvfVar);
    }

    @Override // defpackage.hpt
    public final int a() {
        hvl hvlVar = ((hvf) this.a).a.a;
        hmf hmfVar = (hmf) hvlVar.a;
        return hmfVar.a.limit() + hmfVar.c.length + (hmfVar.d.length * 4) + hvlVar.j;
    }

    @Override // defpackage.hpt
    public final Class b() {
        return hvf.class;
    }

    @Override // defpackage.huy, defpackage.hpq
    public final void d() {
        ((hvf) this.a).a().prepareToDraw();
    }

    @Override // defpackage.hpt
    public final void e() {
        Object obj;
        ((hvf) this.a).stop();
        hvf hvfVar = (hvf) this.a;
        hvfVar.b = true;
        hvl hvlVar = hvfVar.a.a;
        hvlVar.b.clear();
        hvlVar.d();
        hvlVar.f();
        hvj hvjVar = hvlVar.e;
        if (hvjVar != null) {
            hvlVar.c.j(hvjVar);
            hvlVar.e = null;
        }
        hvj hvjVar2 = hvlVar.g;
        if (hvjVar2 != null) {
            hvlVar.c.j(hvjVar2);
            hvlVar.g = null;
        }
        hvj hvjVar3 = hvlVar.i;
        if (hvjVar3 != null) {
            hvlVar.c.j(hvjVar3);
            hvlVar.i = null;
        }
        hmf hmfVar = (hmf) hvlVar.a;
        hmfVar.f = null;
        byte[] bArr = hmfVar.c;
        if (bArr != null) {
            hmfVar.j.l(bArr);
        }
        int[] iArr = hmfVar.d;
        if (iArr != null && (obj = hmfVar.j.a) != null) {
            ((hqh) obj).c(iArr);
        }
        Bitmap bitmap = hmfVar.g;
        if (bitmap != null) {
            hmfVar.j.k(bitmap);
        }
        hmfVar.g = null;
        hmfVar.a = null;
        hmfVar.h = null;
        byte[] bArr2 = hmfVar.b;
        if (bArr2 != null) {
            hmfVar.j.l(bArr2);
        }
        hvlVar.f = true;
    }
}
