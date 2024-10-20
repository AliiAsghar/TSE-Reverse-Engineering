package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agqi {
    private final algw a = alfd.a;
    private final algw b = algw.i(-1);

    public final boolean equals(Object obj) {
        if (obj instanceof agqi) {
            agqi agqiVar = (agqi) obj;
            if (this.a.equals(agqiVar.a) && this.b.equals(agqiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return ((Integer) ((alha) this.b).a).toString();
    }
}
