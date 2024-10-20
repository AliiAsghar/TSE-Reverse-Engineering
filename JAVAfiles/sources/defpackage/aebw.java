package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aebw extends adcx {
    public final boolean a;

    public aebw(boolean z) {
        super(null, null);
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof aebw) && this.a == ((aebw) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.v(this.a);
    }
}
