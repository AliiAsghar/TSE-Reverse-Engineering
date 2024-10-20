package androidx.compose.ui;

import defpackage.cga;
import defpackage.cgf;
import defpackage.cwp;
import defpackage.cyg;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SensitiveNodeElement extends cyg<cgf> {
    private final boolean a = true;

    @Override // defpackage.cyg
    public final /* synthetic */ cga.c d() {
        return new cgf();
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        cgf cgfVar = (cgf) cVar;
        cgfVar.b = true;
        if (!cgfVar.a) {
            cwp.g(cgfVar).p();
            cgfVar.a = true;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SensitiveNodeElement)) {
            return false;
        }
        boolean z = ((SensitiveNodeElement) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1231;
    }

    public final String toString() {
        return "SensitiveNodeElement(isContentSensitive=true)";
    }
}
