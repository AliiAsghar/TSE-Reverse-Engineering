package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aebt extends adcx {
    public final String a;
    public final ByteBuffer b;

    public aebt(String str, ByteBuffer byteBuffer) {
        super(null, null);
        this.a = str;
        this.b = byteBuffer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aebt)) {
            return false;
        }
        aebt aebtVar = (aebt) obj;
        if (d.F(this.a, aebtVar.a) && d.F(this.b, aebtVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }
}
