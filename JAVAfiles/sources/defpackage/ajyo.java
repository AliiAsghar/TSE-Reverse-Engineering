package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajyo {
    public final int a;
    public int b;

    public ajyo(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajyo)) {
            return false;
        }
        ajyo ajyoVar = (ajyo) obj;
        if (this.a == ajyoVar.a && this.b == ajyoVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "ActiveCallbacks(callbacksId=" + this.a + ", callbacksState=" + this.b + ")";
    }
}
