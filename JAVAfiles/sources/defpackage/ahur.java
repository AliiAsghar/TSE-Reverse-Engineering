package defpackage;

import com.google.android.gms.phenotype.ExperimentTokens;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahur {
    public final ExperimentTokens a;
    public final String b;

    public ahur(ExperimentTokens experimentTokens, String str) {
        this.a = experimentTokens;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahur)) {
            return false;
        }
        ahur ahurVar = (ahur) obj;
        if (d.F(this.a, ahurVar.a) && d.F(this.b, ahurVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ExperimentTokenData(experimentToken=" + this.a + ", configPackageName=" + this.b + ")";
    }
}
