package androidx.compose.ui.input.nestedscroll;

import defpackage.cga;
import defpackage.cpz;
import defpackage.cqa;
import defpackage.cqc;
import defpackage.cyg;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class NestedScrollElement extends cyg<cqc> {
    private final cpz a;
    private final cqa b;

    public NestedScrollElement(cpz cpzVar, cqa cqaVar) {
        this.a = cpzVar;
        this.b = cqaVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new cqc(this.a, this.b);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        cqc cqcVar = (cqc) cVar;
        cqcVar.a = this.a;
        cqcVar.g();
        cqa cqaVar = this.b;
        if (cqaVar == null) {
            cqcVar.b = new cqa();
        } else if (!d.F(cqaVar, cqcVar.b)) {
            cqcVar.b = cqaVar;
        }
        if (cqcVar.z) {
            cqcVar.h();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        if (!d.F(nestedScrollElement.a, this.a) || !d.F(nestedScrollElement.b, this.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        cqa cqaVar = this.b;
        if (cqaVar != null) {
            i = cqaVar.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }
}
