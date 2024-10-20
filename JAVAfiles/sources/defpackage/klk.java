package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class klk extends klq {
    private final boolean a;

    public klk(boolean z) {
        this.a = z;
    }

    @Override // defpackage.klq
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof klq) && this.a == ((klq) obj).a()) {
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
        return "ChangeAllSelectionEvent{selected=" + this.a + "}";
    }
}
