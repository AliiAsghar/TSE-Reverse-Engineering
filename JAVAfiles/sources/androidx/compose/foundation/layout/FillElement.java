package androidx.compose.foundation.layout;

import defpackage.aks;
import defpackage.aku;
import defpackage.cga;
import defpackage.cyg;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class FillElement extends cyg<aku> {
    private final aks a;
    private final float b;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public static final FillElement a(float f) {
            return new FillElement(aks.c, f);
        }

        public static final FillElement b(float f) {
            return new FillElement(aks.b, f);
        }
    }

    public FillElement(aks aksVar, float f) {
        this.a = aksVar;
        this.b = f;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new aku(this.a, this.b);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        aku akuVar = (aku) cVar;
        akuVar.a = this.a;
        akuVar.b = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        if (this.a == fillElement.a && this.b == fillElement.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + Float.floatToIntBits(this.b);
    }
}
