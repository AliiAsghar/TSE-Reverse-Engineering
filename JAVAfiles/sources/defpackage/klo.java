package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class klo extends kmn {
    private final boolean a;

    public klo(boolean z) {
        this.a = z;
    }

    @Override // defpackage.kmn
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof kmn) && this.a == ((kmn) obj).a()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        if (true != this.a) {
            i = 1237;
        } else {
            i = 1231;
        }
        return i ^ 1000003;
    }

    public final String toString() {
        return "UpdateConfirmButtonEvent{anySelected=" + this.a + "}";
    }
}
