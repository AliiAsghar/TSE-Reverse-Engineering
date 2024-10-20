package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ksp {
    public final Optional a;
    public final Optional b;
    public final amek c;
    private final Optional d;

    public ksp() {
        throw null;
    }

    public final boolean equals(Object obj) {
        Optional optional;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ksp) {
            ksp kspVar = (ksp) obj;
            if (this.a.equals(kspVar.a) && ((optional = this.d) != null ? optional.equals(kspVar.d) : kspVar.d == null) && this.b.equals(kspVar.b) && this.c.equals(kspVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() ^ 1000003;
        Optional optional = this.d;
        if (optional == null) {
            hashCode = 0;
        } else {
            hashCode = optional.hashCode();
        }
        return (((((hashCode2 * 1000003) ^ hashCode) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        amek amekVar = this.c;
        Optional optional = this.b;
        Optional optional2 = this.d;
        return "AdvancedFeedbackLauncherConfigData{throwable=" + String.valueOf(this.a) + ", psdMap=" + String.valueOf(optional2) + ", reportIssueType=" + String.valueOf(optional) + ", bugleAdvancedFeedbackSource=" + String.valueOf(amekVar) + "}";
    }

    public ksp(Optional optional, Optional optional2, Optional optional3, amek amekVar) {
        this.a = optional;
        this.d = optional2;
        this.b = optional3;
        this.c = amekVar;
    }
}
