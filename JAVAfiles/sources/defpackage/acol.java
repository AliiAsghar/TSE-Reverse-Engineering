package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acol {
    public final acpf a;

    public acol(acpf acpfVar) {
        this.a = acpfVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof acol) || !this.a.equals(((acol) obj).a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return "SipDialogId: ".concat(this.a.toString());
    }
}
