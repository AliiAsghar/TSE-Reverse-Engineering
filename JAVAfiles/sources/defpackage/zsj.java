package defpackage;

import defpackage.ztc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zsj extends ztc.b {
    private final int a;
    private final int b;

    public zsj(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // ztc.b
    public final int a() {
        return this.b;
    }

    @Override // ztc.b
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ztc.b) {
            ztc.b bVar = (ztc.b) obj;
            if (this.a == bVar.b() && this.b == bVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "BannerLayoutChangedEvent{width=" + this.a + ", height=" + this.b + "}";
    }
}
