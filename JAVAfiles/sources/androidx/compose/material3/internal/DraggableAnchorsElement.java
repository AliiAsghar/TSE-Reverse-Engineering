package androidx.compose.material3.internal;

import defpackage.ahp;
import defpackage.arqv;
import defpackage.bsr;
import defpackage.bsz;
import defpackage.cga;
import defpackage.cyg;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class DraggableAnchorsElement<T> extends cyg<bsz<T>> {
    private final bsr a;
    private final arqv b;
    private final ahp c;

    public DraggableAnchorsElement(bsr bsrVar, arqv arqvVar, ahp ahpVar) {
        this.a = bsrVar;
        this.b = arqvVar;
        this.c = ahpVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new bsz(this.a, this.b, this.c);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        bsz bszVar = (bsz) cVar;
        bszVar.a = this.a;
        bszVar.b = this.b;
        bszVar.c = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraggableAnchorsElement)) {
            return false;
        }
        DraggableAnchorsElement draggableAnchorsElement = (DraggableAnchorsElement) obj;
        if (d.F(this.a, draggableAnchorsElement.a) && this.b == draggableAnchorsElement.b && this.c == draggableAnchorsElement.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }
}
