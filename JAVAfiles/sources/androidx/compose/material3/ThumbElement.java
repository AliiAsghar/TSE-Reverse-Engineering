package androidx.compose.material3;

import defpackage.a;
import defpackage.aap;
import defpackage.ajq;
import defpackage.bry;
import defpackage.cga;
import defpackage.cxl;
import defpackage.cyg;
import defpackage.d;
import defpackage.zk;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ThumbElement extends cyg<bry> {
    private final ajq a;
    private final boolean b;
    private final aap c;

    public ThumbElement(ajq ajqVar, boolean z, aap aapVar) {
        this.a = ajqVar;
        this.b = z;
        this.c = aapVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new bry(this.a, this.b, this.c);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        bry bryVar = (bry) cVar;
        bryVar.a = this.a;
        if (bryVar.b != this.b) {
            cxl.b(bryVar);
        }
        bryVar.b = this.b;
        bryVar.c = this.c;
        if (bryVar.f == null && !Float.isNaN(bryVar.h)) {
            bryVar.f = zk.a(bryVar.h);
        }
        if (bryVar.e == null && !Float.isNaN(bryVar.g)) {
            bryVar.e = zk.a(bryVar.g);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThumbElement)) {
            return false;
        }
        ThumbElement thumbElement = (ThumbElement) obj;
        if (d.F(this.a, thumbElement.a) && this.b == thumbElement.b && d.F(this.c, thumbElement.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + a.v(this.b)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.a + ", checked=" + this.b + ", animationSpec=" + this.c + ')';
    }
}
