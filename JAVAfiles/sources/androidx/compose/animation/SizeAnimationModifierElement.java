package androidx.compose.animation;

import defpackage.aap;
import defpackage.arqv;
import defpackage.cfq;
import defpackage.cga;
import defpackage.cyg;
import defpackage.d;
import defpackage.yx;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SizeAnimationModifierElement extends cyg<yx> {
    private final aap a;
    private final cfq b;
    private final arqv c = null;

    public SizeAnimationModifierElement(aap aapVar, cfq cfqVar) {
        this.a = aapVar;
        this.b = cfqVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new yx(this.a, this.b);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        yx yxVar = (yx) cVar;
        yxVar.a = this.a;
        yxVar.b = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeAnimationModifierElement)) {
            return false;
        }
        SizeAnimationModifierElement sizeAnimationModifierElement = (SizeAnimationModifierElement) obj;
        if (!d.F(this.a, sizeAnimationModifierElement.a) || !d.F(this.b, sizeAnimationModifierElement.b)) {
            return false;
        }
        arqv arqvVar = sizeAnimationModifierElement.c;
        if (d.F(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
    }

    public final String toString() {
        return "SizeAnimationModifierElement(animationSpec=" + this.a + ", alignment=" + this.b + ", finishedListener=null)";
    }
}
