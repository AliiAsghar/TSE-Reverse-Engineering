package androidx.compose.foundation;

import defpackage.a;
import defpackage.aft;
import defpackage.afv;
import defpackage.cga;
import defpackage.cyg;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ScrollingLayoutElement extends cyg<aft> {
    private final afv a;
    private final boolean b;
    private final boolean c;

    public ScrollingLayoutElement(afv afvVar, boolean z, boolean z2) {
        this.a = afvVar;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new aft(this.a, this.b, this.c);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        aft aftVar = (aft) cVar;
        aftVar.a = this.a;
        aftVar.b = this.b;
        aftVar.c = this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        if (!d.F(this.a, scrollingLayoutElement.a) || this.b != scrollingLayoutElement.b || this.c != scrollingLayoutElement.c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + a.v(this.b)) * 31) + a.v(this.c);
    }
}
