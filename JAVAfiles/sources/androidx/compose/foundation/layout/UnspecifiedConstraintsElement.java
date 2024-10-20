package androidx.compose.foundation.layout;

import defpackage.ana;
import defpackage.cga;
import defpackage.cyg;
import defpackage.dqy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class UnspecifiedConstraintsElement extends cyg<ana> {
    private final float a;
    private final float b;

    public UnspecifiedConstraintsElement(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new ana(this.a, this.b);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        ana anaVar = (ana) cVar;
        anaVar.a = this.a;
        anaVar.b = this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        if (!dqy.b(this.a, unspecifiedConstraintsElement.a) || !dqy.b(this.b, unspecifiedConstraintsElement.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }
}
