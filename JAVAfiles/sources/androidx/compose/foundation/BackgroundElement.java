package androidx.compose.foundation;

import defpackage.a;
import defpackage.adh;
import defpackage.cga;
import defpackage.cko;
import defpackage.cku;
import defpackage.cmb;
import defpackage.cyg;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class BackgroundElement extends cyg<adh> {
    private final long a;
    private final cko b;
    private final cmb c;

    public /* synthetic */ BackgroundElement(long j, cko ckoVar, cmb cmbVar, int i) {
        j = (i & 1) != 0 ? cku.h : j;
        ckoVar = (i & 2) != 0 ? null : ckoVar;
        this.a = j;
        this.b = ckoVar;
        this.c = cmbVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new adh(this.a, this.b, this.c);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        adh adhVar = (adh) cVar;
        adhVar.a = this.a;
        adhVar.b = this.b;
        adhVar.c = 1.0f;
        adhVar.d = this.c;
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement;
        if (obj instanceof BackgroundElement) {
            backgroundElement = (BackgroundElement) obj;
        } else {
            backgroundElement = null;
        }
        if (backgroundElement == null || !a.bB(this.a, backgroundElement.a) || !d.F(this.b, backgroundElement.b) || !d.F(this.c, backgroundElement.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        long j = cku.a;
        cko ckoVar = this.b;
        if (ckoVar != null) {
            i = ckoVar.hashCode();
        } else {
            i = 0;
        }
        return (((((a.A(this.a) * 31) + i) * 31) + Float.floatToIntBits(1.0f)) * 31) + this.c.hashCode();
    }
}
