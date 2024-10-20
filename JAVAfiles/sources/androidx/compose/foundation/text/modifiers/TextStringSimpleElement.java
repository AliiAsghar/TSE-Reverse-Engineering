package androidx.compose.foundation.text.modifiers;

import defpackage.a;
import defpackage.awn;
import defpackage.bcc;
import defpackage.cga;
import defpackage.ckx;
import defpackage.cwy;
import defpackage.cxl;
import defpackage.cyg;
import defpackage.czl;
import defpackage.d;
import defpackage.dje;
import defpackage.dli;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class TextStringSimpleElement extends cyg<bcc> {
    private final String a;
    private final dje b;
    private final dli.a c;
    private final int d;
    private final boolean f;
    private final int g;
    private final int h;
    private final ckx i;
    private final awn j = null;

    public TextStringSimpleElement(String str, dje djeVar, dli.a aVar, int i, boolean z, int i2, int i3, ckx ckxVar) {
        this.a = str;
        this.b = djeVar;
        this.c = aVar;
        this.d = i;
        this.f = z;
        this.g = i2;
        this.h = i3;
        this.i = ckxVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new bcc(this.a, this.b, this.c, this.d, this.f, this.g, this.h, this.i);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        boolean z;
        bcc bccVar = (bcc) cVar;
        ckx ckxVar = bccVar.h;
        ckx ckxVar2 = this.i;
        boolean F = d.F(ckxVar2, ckxVar);
        bccVar.h = ckxVar2;
        boolean z2 = false;
        if (F && this.b.w(bccVar.b)) {
            z = false;
        } else {
            z = true;
        }
        String str = this.a;
        if (!d.F(bccVar.a, str)) {
            bccVar.a = str;
            bccVar.h();
            z2 = true;
        }
        dje djeVar = this.b;
        int i = this.h;
        int i2 = this.g;
        boolean z3 = this.f;
        dli.a aVar = this.c;
        int i3 = this.d;
        boolean z4 = !bccVar.b.x(djeVar);
        bccVar.b = djeVar;
        if (bccVar.g != i) {
            bccVar.g = i;
            z4 = true;
        }
        if (bccVar.f != i2) {
            bccVar.f = i2;
            z4 = true;
        }
        if (bccVar.e != z3) {
            bccVar.e = z3;
            z4 = true;
        }
        if (!d.F(bccVar.c, aVar)) {
            bccVar.c = aVar;
            z4 = true;
        }
        if (!a.bA(bccVar.d, i3)) {
            bccVar.d = i3;
            z4 = true;
        }
        boolean F2 = (true ^ d.F(null, null)) | z4;
        if (z2 || F2) {
            bccVar.a().e(bccVar.a, bccVar.b, bccVar.c, bccVar.d, bccVar.e, bccVar.f);
        }
        if (bccVar.z) {
            if (z2 || (z && bccVar.i != null)) {
                czl.a(bccVar);
            }
            if (z2 || F2) {
                cxl.b(bccVar);
                cwy.a(bccVar);
            }
            if (z) {
                cwy.a(bccVar);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        if (!d.F(this.i, textStringSimpleElement.i) || !d.F(this.a, textStringSimpleElement.a) || !d.F(this.b, textStringSimpleElement.b) || !d.F(this.c, textStringSimpleElement.c)) {
            return false;
        }
        awn awnVar = textStringSimpleElement.j;
        if (d.F(null, null) && a.bA(this.d, textStringSimpleElement.d) && this.f == textStringSimpleElement.f && this.g == textStringSimpleElement.g && this.h == textStringSimpleElement.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        ckx ckxVar = this.i;
        if (ckxVar != null) {
            i = ckxVar.hashCode();
        } else {
            i = 0;
        }
        return ((((((((((hashCode * 31) + this.d) * 31) + a.v(this.f)) * 31) + this.g) * 31) + this.h) * 31) + i) * 31;
    }
}
