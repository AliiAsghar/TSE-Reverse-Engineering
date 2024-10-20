package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aikn extends aiku {
    public String a;
    public aiks b;
    public int c = 1;

    public final int a() {
        aiks aiksVar = this.b;
        if (aiksVar instanceof aikp) {
            aikw a = ((aikp) aiksVar).a();
            if (a != null) {
                return a.b;
            }
            throw new IllegalArgumentException("SipURI does not have host port.");
        }
        throw new IllegalArgumentException("address is not a SipURI");
    }

    @Override // defpackage.aiku
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final aikn clone() {
        aikn aiknVar = new aikn();
        aiknVar.c = this.c;
        String str = this.a;
        if (str != null) {
            aiknVar.a = str;
        }
        aiks aiksVar = this.b;
        if (aiksVar != null) {
            aiknVar.b = (aiks) aiksVar.clone();
        }
        return aiknVar;
    }

    @Override // defpackage.aiku
    public final String c() {
        if (this.c == 3) {
            return "*";
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (this.a != null) {
            stringBuffer.append("\"");
            stringBuffer.append(this.a);
            stringBuffer.append("\" ");
        }
        if (this.b != null) {
            if (this.c == 1 || this.a != null) {
                stringBuffer.append("<");
            }
            stringBuffer.append(this.b.c());
            if (this.c == 1 || this.a != null) {
                stringBuffer.append(">");
            }
        }
        return stringBuffer.toString();
    }

    public final void d(String str) {
        this.a = str;
        this.c = 1;
    }

    public final void e(String str) {
        this.b.h(str);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof aikn)) {
            return false;
        }
        aikn aiknVar = (aikn) obj;
        if (this.c != aiknVar.c) {
            return false;
        }
        aiks aiksVar = this.b;
        if (aiksVar == null && aiknVar.b != null) {
            return false;
        }
        if (aiksVar != null && !aiksVar.equals(aiknVar.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.c;
        int i2 = i - 1;
        if (i != 0) {
            aiks aiksVar = this.b;
            if (aiksVar != null) {
                return (i2 * 37) + aiksVar.hashCode();
            }
            return i2;
        }
        throw null;
    }
}
