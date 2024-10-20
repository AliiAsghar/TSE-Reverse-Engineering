package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zxe {
    public final boolean a;

    public zxe() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zxe) && this.a == ((zxe) obj).a) {
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
        return "ConversationBottomBarData{shouldShowBar=" + this.a + "}";
    }

    public zxe(boolean z) {
        this.a = z;
    }
}
