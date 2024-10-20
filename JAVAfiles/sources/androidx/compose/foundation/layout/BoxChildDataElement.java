package androidx.compose.foundation.layout;

import defpackage.a;
import defpackage.akb;
import defpackage.cfq;
import defpackage.cga;
import defpackage.cyg;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class BoxChildDataElement extends cyg<akb> {
    private final cfq a;
    private final boolean b;

    public BoxChildDataElement(cfq cfqVar, boolean z) {
        this.a = cfqVar;
        this.b = z;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new akb(this.a, this.b);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        akb akbVar = (akb) cVar;
        akbVar.a = this.a;
        akbVar.b = this.b;
    }

    public final boolean equals(Object obj) {
        BoxChildDataElement boxChildDataElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof BoxChildDataElement) {
            boxChildDataElement = (BoxChildDataElement) obj;
        } else {
            boxChildDataElement = null;
        }
        if (boxChildDataElement != null && d.F(this.a, boxChildDataElement.a) && this.b == boxChildDataElement.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.v(this.b);
    }
}
