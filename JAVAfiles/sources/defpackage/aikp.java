package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aikp extends aiks {
    public aiko a;
    public aila b;
    public aila c;
    private aikr f;

    public aikp() {
        this.e = "sip";
        this.b = new aila(null);
        aila ailaVar = new aila(null);
        this.c = ailaVar;
        ailaVar.b = "&";
    }

    public final aikw a() {
        aiko aikoVar = this.a;
        if (aikoVar == null) {
            return null;
        }
        return aikoVar.a;
    }

    public final String b() {
        aikv aikvVar;
        aikw aikwVar = this.a.a;
        if (aikwVar == null) {
            aikvVar = null;
        } else {
            aikvVar = aikwVar.a;
        }
        if (aikvVar == null) {
            return null;
        }
        return aikvVar.a;
    }

    @Override // defpackage.aiks, defpackage.aiku
    public final String c() {
        StringBuffer stringBuffer = new StringBuffer(this.e);
        stringBuffer.append(":");
        aiko aikoVar = this.a;
        if (aikoVar != null) {
            stringBuffer.append(aikoVar.c());
        }
        if (!this.b.h()) {
            stringBuffer.append(";");
            stringBuffer.append(this.b.c());
        }
        if (!this.c.h()) {
            stringBuffer.append("?");
            stringBuffer.append(this.c.c());
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.aiks, defpackage.aiku
    public final Object clone() {
        aikp aikpVar = new aikp();
        aikpVar.e = this.e;
        aikpVar.a = (aiko) this.a.clone();
        aikpVar.b = (aila) this.b.clone();
        aila ailaVar = this.c;
        if (ailaVar != null) {
            aikpVar.c = (aila) ailaVar.clone();
        }
        aikr aikrVar = this.f;
        if (aikrVar != null) {
            aikpVar.f = (aikr) aikrVar.clone();
        }
        return aikpVar;
    }

    @Override // defpackage.aiks
    public final String d() {
        return this.e;
    }

    public final String e() {
        return this.a.b();
    }

    @Override // defpackage.aiks
    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof aikp)) {
            aikp aikpVar = (aikp) obj;
            aiko aikoVar = this.a;
            if (aikoVar != null || aikpVar.a == null) {
                if (aikoVar == null || aikoVar.equals(aikpVar.a)) {
                    aila ailaVar = this.c;
                    if (ailaVar != null || aikpVar.c == null) {
                        if (ailaVar == null || ailaVar.equals(aikpVar.c)) {
                            aikr aikrVar = this.f;
                            if (aikrVar != null || aikpVar.f == null) {
                                if (aikrVar == null || aikrVar.equals(aikpVar.f)) {
                                    aila ailaVar2 = this.b;
                                    if (ailaVar2 != null || aikpVar.b == null) {
                                        if (ailaVar2 == null || ailaVar2.equals(aikpVar.b)) {
                                            return super.equals(obj);
                                        }
                                        return false;
                                    }
                                    return false;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void f() {
        this.b = new aila();
    }

    public final void g(aikw aikwVar) {
        if (this.a == null) {
            this.a = new aiko();
        }
        this.a.a = aikwVar;
    }

    @Override // defpackage.aiks
    public final void h(String str) {
        this.b.f("method", str);
    }

    @Override // defpackage.aiks
    public final int hashCode() {
        int hashCode = super.hashCode();
        aiko aikoVar = this.a;
        if (aikoVar != null) {
            hashCode = (hashCode * 37) + aikoVar.hashCode();
        }
        if (this.c != null) {
            hashCode = (hashCode * 37) + 187654;
        }
        aikr aikrVar = this.f;
        if (aikrVar != null) {
            hashCode = (hashCode * 37) + aikrVar.hashCode();
        }
        if (this.b != null) {
            return (hashCode * 37) + 187654;
        }
        return hashCode;
    }

    public final void i(int i) {
        if (this.a == null) {
            this.a = new aiko();
        }
        aiko aikoVar = this.a;
        if (aikoVar.a == null) {
            aikoVar.a = new aikw();
        }
        aikoVar.a.b = i;
    }

    public final void j(String str) {
        if (str != null) {
            if (!str.equalsIgnoreCase("UDP") && !str.equalsIgnoreCase("TCP") && !str.equalsIgnoreCase("TLS")) {
                throw new ailb("bad transport ".concat(str));
            }
            aikz aikzVar = new aikz("transport", str.toLowerCase(Locale.US));
            this.b.i("transport");
            this.b.e(aikzVar);
            return;
        }
        throw new NullPointerException("null arg");
    }

    public final void k(String str) {
        if (this.a == null) {
            this.a = new aiko();
        }
        this.a.d(str);
    }

    @Override // defpackage.aiks
    public final boolean l() {
        return true;
    }

    public final String m() {
        Object b = this.b.b("user");
        if (b == null) {
            return null;
        }
        if (b instanceof aiku) {
            return ((aiku) b).c();
        }
        return b.toString();
    }

    @Override // defpackage.aiks
    public final String toString() {
        return c();
    }
}
