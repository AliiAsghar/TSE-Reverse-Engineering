package defpackage;

import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amb extends cga.c implements czf {
    public float a;
    public boolean b;

    public amb(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    @Override // defpackage.czf
    public final /* bridge */ /* synthetic */ Object ea(Object obj) {
        amp ampVar;
        if (obj instanceof amp) {
            ampVar = (amp) obj;
        } else {
            ampVar = null;
        }
        if (ampVar == null) {
            ampVar = new amp(null);
        }
        ampVar.a = this.a;
        ampVar.b = this.b;
        return ampVar;
    }
}
