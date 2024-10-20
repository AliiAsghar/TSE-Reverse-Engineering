package androidx.compose.ui.platform;

import defpackage.cga;
import defpackage.cyg;
import defpackage.d;
import defpackage.deb;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class TestTagElement extends cyg<deb> {
    private final String a;

    public TestTagElement(String str) {
        this.a = str;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new deb(this.a);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        ((deb) cVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TestTagElement)) {
            return false;
        }
        return d.F(this.a, ((TestTagElement) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
