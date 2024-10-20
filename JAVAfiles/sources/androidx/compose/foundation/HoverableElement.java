package androidx.compose.foundation;

import defpackage.aes;
import defpackage.ajr;
import defpackage.cga;
import defpackage.cyg;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class HoverableElement extends cyg<aes> {
    private final ajr a;

    public HoverableElement(ajr ajrVar) {
        this.a = ajrVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new aes(this.a);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        aes aesVar = (aes) cVar;
        ajr ajrVar = aesVar.a;
        ajr ajrVar2 = this.a;
        if (!d.F(ajrVar, ajrVar2)) {
            aesVar.d();
            aesVar.a = ajrVar2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof HoverableElement) && d.F(((HoverableElement) obj).a, this.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
