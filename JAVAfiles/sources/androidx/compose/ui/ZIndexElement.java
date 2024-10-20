package androidx.compose.ui;

import defpackage.cga;
import defpackage.cgi;
import defpackage.cyg;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ZIndexElement extends cyg<cgi> {
    private final float a;

    public ZIndexElement(float f) {
        this.a = f;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new cgi(this.a);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        ((cgi) cVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ZIndexElement) && Float.compare(this.a, ((ZIndexElement) obj).a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "ZIndexElement(zIndex=" + this.a + ')';
    }
}
