package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ahto {
    public final Context a;
    public final alhr b;

    public ahto() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahto) {
            ahto ahtoVar = (ahto) obj;
            if (this.a.equals(ahtoVar.a)) {
                alhr alhrVar = this.b;
                alhr alhrVar2 = ahtoVar.b;
                if (alhrVar != null ? alhrVar.equals(alhrVar2) : alhrVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() ^ 1000003;
        alhr alhrVar = this.b;
        if (alhrVar == null) {
            hashCode = 0;
        } else {
            hashCode = alhrVar.hashCode();
        }
        return (hashCode2 * 1000003) ^ hashCode;
    }

    public final String toString() {
        alhr alhrVar = this.b;
        return "FlagsContext{context=" + this.a.toString() + ", hermeticFileOverrides=" + String.valueOf(alhrVar) + "}";
    }

    public ahto(Context context, alhr alhrVar) {
        this.a = context;
        this.b = alhrVar;
    }
}
