package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aiom {
    public final ainh a;
    public String b;
    private List c;

    public aiom(ainh ainhVar) {
        this.a = ainhVar;
    }

    public final int a() {
        ailt ailtVar = this.a.g;
        if (ailtVar == null) {
            return -1;
        }
        return ailtVar.b();
    }

    public final ailx b() {
        return (ailx) this.a.d("Contact");
    }

    public final aiok c(String str) {
        List<aiok> o = o();
        if (o != null && !o.isEmpty()) {
            for (aiok aiokVar : o) {
                if (aiokVar.b.equals(str)) {
                    return aiokVar;
                }
            }
        }
        return null;
    }

    public final String d() {
        return this.a.h();
    }

    public final String e() {
        ailx b = b();
        if (b != null) {
            return b.a();
        }
        return null;
    }

    public final String f() {
        ailx b = b();
        if (b != null) {
            return b.a.b.toString();
        }
        return null;
    }

    public final String g() {
        byte[] bArr = this.a.k;
        if (bArr != null) {
            return new String(bArr);
        }
        return null;
    }

    public final String h() {
        aimh d = this.a.d(assi.a);
        if (d != null) {
            return d.a();
        }
        return null;
    }

    public final String i() {
        aimg aimgVar = this.a.e;
        if (aimgVar == null) {
            return null;
        }
        return aimgVar.a();
    }

    public final String j(String str) {
        if (this.a.q(str)) {
            return this.a.e(str).a();
        }
        return null;
    }

    public final String k(String str, String str2) {
        aila d;
        aimh d2 = this.a.d(str);
        if (d2 != null && (d = d2.d()) != null) {
            return d.d(str2);
        }
        return null;
    }

    public final String l() {
        aimy aimyVar = this.a.f;
        if (aimyVar == null) {
            return null;
        }
        return aimyVar.a();
    }

    public final String m() {
        aimy aimyVar = this.a.f;
        if (aimyVar == null) {
            return null;
        }
        return aimyVar.a.b.toString();
    }

    public final String n() {
        StringBuilder sb = new StringBuilder();
        if (x()) {
            sb.append(((ainj) this.a).a.a());
        } else {
            aini ainiVar = (aini) this.a;
            sb.append(ainiVar.i());
            sb.append(" ");
            if (((Boolean) acpy.g.a()).booleanValue()) {
                sb.append(ainiVar.w());
            } else {
                sb.append("(redacted)");
            }
            sb.append(" SIP/2.0\n");
        }
        for (aimh aimhVar : this.a.d) {
            sb.append(aimhVar.c);
            sb.append(": ");
            if (!albo.ah(aimhVar.c) && ((albo.ar(aimhVar.c, "To") || albo.ar(aimhVar.c, "From") || albo.ar(aimhVar.c, "Via") || albo.ar(aimhVar.c, "Call-Id") || albo.ar(aimhVar.c, "Subject") || albo.ar(aimhVar.c, "Contact") || albo.ar(aimhVar.c, "Authorization") || albo.ar(aimhVar.c, "Reason") || albo.ar(aimhVar.c, "Refer-To") || albo.ar(aimhVar.c, "Referred-By") || albo.ar(aimhVar.c, "Refer-Sub") || albo.ar(aimhVar.c, "Security-Verify") || albo.ar(aimhVar.c, "P-Preferred-Identity") || albo.ar(aimhVar.c, "P-Asserted-Identity") || albo.ar(aimhVar.c, "P-Called-Party-ID") || albo.ar(aimhVar.c, "P-Associated-Uri") || albo.ar(aimhVar.c, "P-Associated-To") || albo.ar(aimhVar.c, "P-Access-Network-Info") || albo.ar(aimhVar.c, "P-Last-Access-Network-Info")) && !((Boolean) acpy.g.a()).booleanValue())) {
                sb.append("(redacted)");
            } else {
                sb.append(aimhVar.a());
            }
            sb.append("\n");
        }
        byte[] bArr = this.a.k;
        if (bArr != null && bArr.length > 0) {
            sb.append("\n");
            if (((Boolean) acpy.g.a()).booleanValue()) {
                sb.append(g());
                sb.append("\n");
            } else {
                String str = this.b;
                if (str != null) {
                    sb.append(str);
                } else {
                    List o = o();
                    for (int i = 0; i < o.size(); i++) {
                        if (o.get(i) != null) {
                            sb.append(((aiok) o.get(i)).c());
                        }
                        if (i != o.size() - 1) {
                            sb.append("\n");
                        }
                    }
                }
            }
        }
        return sb.toString();
    }

    public final List o() {
        ArrayList arrayList;
        if (this.c == null) {
            try {
                byte[] bArr = this.a.k;
                if ("0".equals(j("Content-Length"))) {
                    arrayList = new ArrayList();
                } else {
                    aiok[] e = aiok.e(bArr, h());
                    ArrayList arrayList2 = new ArrayList();
                    for (aiok aiokVar : e) {
                        arrayList2.add(aiokVar);
                    }
                    arrayList = arrayList2;
                }
                this.c = arrayList;
            } catch (Exception unused) {
                this.c = new ArrayList();
            }
        }
        return this.c;
    }

    public final List p() {
        return this.a.g().a;
    }

    public final void q(aimh aimhVar) {
        this.a.k(aimhVar);
    }

    public final void r(String str) {
        ahmc.Q(this.a, str);
    }

    public final void s(String str, String str2) {
        this.a.k(ahmc.X(str, str2));
    }

    public final void t(String str) {
        this.a.m(str);
    }

    public final void u(aimh aimhVar) {
        this.a.p(aimhVar);
    }

    public final boolean v(String str) {
        return this.a.q(str);
    }

    public final boolean w() {
        String j = j("Contact");
        if (j == null) {
            return false;
        }
        return j.contains("automata");
    }

    public abstract boolean x();
}
