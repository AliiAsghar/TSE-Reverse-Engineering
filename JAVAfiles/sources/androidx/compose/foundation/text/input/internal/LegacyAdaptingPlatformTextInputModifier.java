package androidx.compose.foundation.text.input.internal;

import defpackage.ayd;
import defpackage.bbh;
import defpackage.bbk;
import defpackage.bfb;
import defpackage.cga;
import defpackage.cyg;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LegacyAdaptingPlatformTextInputModifier extends cyg<bbh> {
    private final bbk a;
    private final ayd b;
    private final bfb c;

    public LegacyAdaptingPlatformTextInputModifier(bbk bbkVar, ayd aydVar, bfb bfbVar) {
        this.a = bbkVar;
        this.b = aydVar;
        this.c = bfbVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new bbh(this.a, this.b, this.c);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        bbh bbhVar = (bbh) cVar;
        if (bbhVar.z) {
            bbhVar.a.f();
            bbhVar.a.l(bbhVar);
        }
        bbhVar.a = this.a;
        if (bbhVar.z) {
            bbhVar.a.j(bbhVar);
        }
        bbhVar.b = this.b;
        bbhVar.c = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) obj;
        if (d.F(this.a, legacyAdaptingPlatformTextInputModifier.a) && d.F(this.b, legacyAdaptingPlatformTextInputModifier.b) && d.F(this.c, legacyAdaptingPlatformTextInputModifier.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.a + ", legacyTextFieldState=" + this.b + ", textFieldSelectionManager=" + this.c + ')';
    }
}
