package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpd extends gpg {
    private final gpc d;
    private final boolean e;

    public gpd(int i, int i2, gpc gpcVar, boolean z) {
        super(i, i2);
        this.d = gpcVar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gpd) {
            gpd gpdVar = (gpd) obj;
            if (this.b == gpdVar.b && this.c == gpdVar.c && d.F(this.d, gpdVar.d) && this.e == gpdVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b * 31) + this.c) * 31) + this.d.hashCode()) * 31) + a.v(this.e);
    }

    @Override // defpackage.gpg
    public final String toString() {
        return "gpd{width=" + this.b + ", color=" + this.c + ", primaryContainerDragRange=" + this.d + ", isDraggingToFullscreenAllowed=" + this.e + '}';
    }
}
