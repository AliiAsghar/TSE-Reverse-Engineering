package androidx.compose.foundation.layout;

import defpackage.a;
import defpackage.amw;
import defpackage.cga;
import defpackage.cyg;
import defpackage.dqy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SizeElement extends cyg<amw> {
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final boolean f;

    public SizeElement(float f, float f2, float f3, float f4, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.f = z;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new amw(this.a, this.b, this.c, this.d, this.f);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        amw amwVar = (amw) cVar;
        amwVar.a = this.a;
        amwVar.b = this.b;
        amwVar.c = this.c;
        amwVar.d = this.d;
        amwVar.e = this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        if (dqy.b(this.a, sizeElement.a) && dqy.b(this.b, sizeElement.b) && dqy.b(this.c, sizeElement.c) && dqy.b(this.d, sizeElement.d) && this.f == sizeElement.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + a.v(this.f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ SizeElement(float r9, float r10, float r11, float r12, boolean r13, int r14) {
        /*
            r8 = this;
            r0 = r14 & 8
            r1 = 2143289344(0x7fc00000, float:NaN)
            if (r0 == 0) goto L8
            r6 = r1
            goto L9
        L8:
            r6 = r12
        L9:
            r12 = r14 & 4
            if (r12 == 0) goto Lf
            r5 = r1
            goto L10
        Lf:
            r5 = r11
        L10:
            r11 = r14 & 2
            if (r11 == 0) goto L16
            r4 = r1
            goto L17
        L16:
            r4 = r10
        L17:
            r10 = 1
            r11 = r14 & 1
            if (r10 != r11) goto L1e
            r3 = r1
            goto L1f
        L1e:
            r3 = r9
        L1f:
            r2 = r8
            r7 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.SizeElement.<init>(float, float, float, float, boolean, int):void");
    }
}
