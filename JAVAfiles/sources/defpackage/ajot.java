package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ajot extends ajpk {
    private final boolean a;

    public ajot(boolean z) {
        this.a = z;
    }

    @Override // defpackage.ajpk
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ajpk) && this.a == ((ajpk) obj).a()) {
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
        return "GroupRemoteCapabilities{supportsSubjectManagement=" + this.a + "}";
    }
}
