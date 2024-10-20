package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agll {
    public final Context a;
    public final algw b;
    private final algw c;
    private final algw d;

    public agll() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agll) {
            agll agllVar = (agll) obj;
            if (this.a.equals(agllVar.a) && this.c.equals(agllVar.c) && this.d.equals(agllVar.d) && this.b.equals(agllVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 1237) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        algw algwVar = this.b;
        algw algwVar2 = this.d;
        algw algwVar3 = this.c;
        return "CollectionBasisContext{context=" + String.valueOf(this.a) + ", accountNames=" + String.valueOf(algwVar3) + ", stacktrace=" + String.valueOf(algwVar2) + ", googlerOverridesCheckbox=false, executor=" + String.valueOf(algwVar) + "}";
    }

    public agll(Context context, algw algwVar, algw algwVar2, algw algwVar3) {
        this.a = context;
        this.c = algwVar;
        this.d = algwVar2;
        this.b = algwVar3;
    }
}
