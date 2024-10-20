package androidx.compose.foundation.relocation;

import defpackage.avj;
import defpackage.avm;
import defpackage.cga;
import defpackage.cyg;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class BringIntoViewRequesterElement extends cyg<avm> {
    private final avj a;

    public BringIntoViewRequesterElement(avj avjVar) {
        this.a = avjVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new avm(this.a);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        ((avm) cVar).a(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof BringIntoViewRequesterElement) && d.F(this.a, ((BringIntoViewRequesterElement) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
