package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiko extends aiku {
    public aikw a;
    public aikt b;

    public final Optional a() {
        return Optional.ofNullable(this.b);
    }

    public final String b() {
        aikt aiktVar = this.b;
        if (aiktVar == null) {
            return null;
        }
        return aiktVar.a;
    }

    @Override // defpackage.aiku
    public final String c() {
        String stringBuffer;
        aikt aiktVar = this.b;
        if (aiktVar != null) {
            if (aiktVar.b == null) {
                stringBuffer = aiktVar.a;
            } else {
                StringBuffer stringBuffer2 = new StringBuffer(aiktVar.a);
                stringBuffer2.append(":");
                stringBuffer2.append(aiktVar.b);
                stringBuffer = stringBuffer2.toString();
            }
            return stringBuffer + "@" + this.a.a();
        }
        String a = this.a.a();
        if (a == null) {
            return "";
        }
        return a;
    }

    @Override // defpackage.aiku
    public final Object clone() {
        aiko aikoVar = new aiko();
        String b = b();
        if (b != null) {
            aikoVar.d(b);
        }
        aikoVar.a = this.a;
        return aikoVar;
    }

    public final void d(String str) {
        if (str == null) {
            return;
        }
        if (this.b == null) {
            this.b = new aikt();
        }
        this.b.a(str);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof aiko)) {
            return false;
        }
        aiko aikoVar = (aiko) obj;
        aikw aikwVar = this.a;
        if (aikwVar == null && aikoVar.a != null) {
            return false;
        }
        if (aikwVar != null && !aikwVar.equals(aikoVar.a)) {
            return false;
        }
        aikt aiktVar = this.b;
        if (aiktVar == null && aikoVar.b != null) {
            return false;
        }
        if (aiktVar != null && !aiktVar.equals(aikoVar.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        aikw aikwVar = this.a;
        if (aikwVar != null) {
            i = aikwVar.hashCode();
        } else {
            i = 0;
        }
        aikt aiktVar = this.b;
        if (aiktVar != null) {
            return (i * 37) + aiktVar.hashCode();
        }
        return i;
    }
}
