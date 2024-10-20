package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vup {
    public final boolean a;
    public final boolean b;

    public vup() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vup) {
            vup vupVar = (vup) obj;
            if (this.a == vupVar.a && this.b == vupVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 1237;
        if (true != this.a) {
            i = 1237;
        } else {
            i = 1231;
        }
        if (true == this.b) {
            i2 = 1231;
        }
        return ((i ^ 1000003) * 1000003) ^ i2;
    }

    public final String toString() {
        return "GroupRenameNotifyEventLoggingInfo{causedNameChange=" + this.a + ", containedSubjectExtension=" + this.b + "}";
    }

    public vup(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
