package androidx.compose.foundation.lazy.layout;

import defpackage.a;
import defpackage.ahp;
import defpackage.are;
import defpackage.arg;
import defpackage.arh;
import defpackage.cga;
import defpackage.cyg;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LazyLayoutBeyondBoundsModifierElement extends cyg<arg> {
    private final arh a;
    private final are b;
    private final boolean c;
    private final ahp d;

    public LazyLayoutBeyondBoundsModifierElement(arh arhVar, are areVar, boolean z, ahp ahpVar) {
        this.a = arhVar;
        this.b = areVar;
        this.c = z;
        this.d = ahpVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new arg(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        arg argVar = (arg) cVar;
        argVar.a = this.a;
        argVar.b = this.b;
        argVar.c = this.c;
        argVar.d = this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutBeyondBoundsModifierElement)) {
            return false;
        }
        LazyLayoutBeyondBoundsModifierElement lazyLayoutBeyondBoundsModifierElement = (LazyLayoutBeyondBoundsModifierElement) obj;
        if (d.F(this.a, lazyLayoutBeyondBoundsModifierElement.a) && d.F(this.b, lazyLayoutBeyondBoundsModifierElement.b) && this.c == lazyLayoutBeyondBoundsModifierElement.c && this.d == lazyLayoutBeyondBoundsModifierElement.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + a.v(this.c)) * 31) + this.d.hashCode();
    }
}
