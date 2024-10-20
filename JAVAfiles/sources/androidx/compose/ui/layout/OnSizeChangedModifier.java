package androidx.compose.ui.layout;

import defpackage.arqr;
import defpackage.cga;
import defpackage.cux;
import defpackage.cyg;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class OnSizeChangedModifier extends cyg<cux> {
    private final arqr a;

    public OnSizeChangedModifier(arqr arqrVar) {
        this.a = arqrVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new cux(this.a);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        cux cuxVar = (cux) cVar;
        cuxVar.a = this.a;
        cuxVar.b = -9223372034707292160L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof OnSizeChangedModifier) && this.a == ((OnSizeChangedModifier) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
