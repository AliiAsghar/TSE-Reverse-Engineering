package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jts {
    public final afyo a;
    public final aeoa b;

    public jts(afyo afyoVar, aeoa aeoaVar) {
        this.a = afyoVar;
        this.b = aeoaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jts)) {
            return false;
        }
        jts jtsVar = (jts) obj;
        if (d.F(this.a, jtsVar.a) && d.F(this.b, jtsVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        aeoa aeoaVar = this.b;
        if (aeoaVar == null) {
            hashCode = 0;
        } else {
            hashCode = aeoaVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "InputsData(hugoUiData=" + this.a + ", inputsUiData=" + this.b + ")";
    }
}
