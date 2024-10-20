package defpackage;

import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdn extends hcw {
    private final Object e;

    public hdn(hig higVar) {
        this(higVar, null);
    }

    @Override // defpackage.hcw
    public final float a() {
        return 1.0f;
    }

    @Override // defpackage.hcw
    public final Object e() {
        hig higVar = this.d;
        Object obj = this.e;
        float f = this.c;
        return higVar.b(brg.a, brg.a, obj, obj, f, f, f);
    }

    @Override // defpackage.hcw
    public final Object f(hie hieVar, float f) {
        return e();
    }

    @Override // defpackage.hcw
    public final void i() {
        if (this.d != null) {
            super.i();
        }
    }

    @Override // defpackage.hcw
    public final void j(float f) {
        this.c = f;
    }

    public hdn(hig higVar, Object obj) {
        super(Collections.emptyList());
        this.d = higVar;
        this.e = obj;
    }
}
