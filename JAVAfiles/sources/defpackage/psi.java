package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class psi {
    public static final xze a = xze.g("Bugle", "RbmBusinessLogger");
    public final armf b;
    public final anen c;
    public final mbl d;

    public psi(armf armfVar, anen anenVar, mbl mblVar) {
        this.b = armfVar;
        this.c = anenVar;
        this.d = mblVar;
    }

    public static String a(String str) {
        String str2;
        int indexOf = str.indexOf(64);
        if (indexOf >= 0) {
            str2 = str.substring(0, indexOf);
        } else {
            str2 = str;
        }
        if (Pattern.matches("\\+[01234567890]+", str2)) {
            return "REDACTED-phone number";
        }
        return str;
    }

    private final void l(amte amteVar) {
        aozy createBuilder = amtg.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amtg amtgVar = (amtg) createBuilder.b;
        amteVar.getClass();
        amtgVar.d = amteVar;
        amtgVar.c = 12;
        f((amtg) createBuilder.s());
    }

    private final void m(amtl amtlVar) {
        aozy createBuilder = amtg.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amtg amtgVar = (amtg) createBuilder.b;
        amtlVar.getClass();
        amtgVar.d = amtlVar;
        amtgVar.c = 9;
        f((amtg) createBuilder.s());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int n(String str) {
        char c;
        if (str == null) {
            return 1;
        }
        switch (str.hashCode()) {
            case 112701:
                if (str.equals("rbm")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 114009:
                if (str.equals("sms")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3213448:
                if (str.equals("http")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 99617003:
                if (str.equals("https")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1) {
            return 2;
        }
        if (c == 2) {
            return 3;
        }
        if (c != 3) {
            return 1;
        }
        return 4;
    }

    public final void b(String str) {
        aozy createBuilder = amte.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amte amteVar = (amte) apagVar;
        amteVar.c = 1;
        amteVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        amte amteVar2 = (amte) apagVar2;
        amteVar2.f = 1;
        amteVar2.b |= 8;
        if (str != null) {
            if (!apagVar2.isMutable()) {
                createBuilder.u();
            }
            amte amteVar3 = (amte) createBuilder.b;
            amteVar3.b |= 4;
            amteVar3.e = str;
        }
        l((amte) createBuilder.s());
    }

    public final void c(String str, String str2) {
        aozy createBuilder = amte.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amte amteVar = (amte) apagVar;
        amteVar.c = 2;
        amteVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        amte amteVar2 = (amte) apagVar2;
        amteVar2.f = 1;
        amteVar2.b |= 8;
        if (str != null) {
            if (!apagVar2.isMutable()) {
                createBuilder.u();
            }
            amte amteVar3 = (amte) createBuilder.b;
            amteVar3.b |= 4;
            amteVar3.e = str;
        }
        aozy createBuilder2 = amtg.a.createBuilder();
        amte amteVar4 = (amte) createBuilder.s();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        amtg amtgVar = (amtg) createBuilder2.b;
        amteVar4.getClass();
        amtgVar.d = amteVar4;
        amtgVar.c = 12;
        String a2 = a(str2);
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        amtg amtgVar2 = (amtg) createBuilder2.b;
        a2.getClass();
        amtgVar2.b |= 1;
        amtgVar2.e = a2;
        f((amtg) createBuilder2.s());
    }

    public final void d(amtf amtfVar, String str) {
        e(amtfVar, str, null);
    }

    public final void e(amtf amtfVar, String str, String str2) {
        aozy createBuilder = amtg.a.createBuilder();
        aozy builder = amtfVar.toBuilder();
        if (!builder.b.isMutable()) {
            builder.u();
        }
        int n = n(str2);
        amtf amtfVar2 = (amtf) builder.b;
        amtfVar2.f = n - 1;
        amtfVar2.b |= 8;
        amtf amtfVar3 = (amtf) builder.s();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amtg amtgVar = (amtg) createBuilder.b;
        amtfVar3.getClass();
        amtgVar.d = amtfVar3;
        amtgVar.c = 14;
        if (str != null) {
            String a2 = a(str);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amtg amtgVar2 = (amtg) createBuilder.b;
            a2.getClass();
            amtgVar2.b |= 1;
            amtgVar2.e = a2;
        }
        f((amtg) createBuilder.s());
    }

    public final void f(amtg amtgVar) {
        maq maqVar = (maq) this.b.b();
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.RBM_EVENT;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amtgVar.getClass();
        amfrVar2.az = amtgVar;
        amfrVar2.e |= 2048;
        maqVar.o(amfqVar);
    }

    public final void g(amtm amtmVar) {
        aozy createBuilder = amtl.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amtl amtlVar = (amtl) createBuilder.b;
        amtmVar.getClass();
        amtlVar.c = amtmVar;
        amtlVar.b = 2;
        m((amtl) createBuilder.s());
    }

    public final void h(amtn amtnVar) {
        aozy createBuilder = amtl.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amtl amtlVar = (amtl) createBuilder.b;
        amtnVar.getClass();
        amtlVar.c = amtnVar;
        amtlVar.b = 1;
        m((amtl) createBuilder.s());
    }

    public final void i(int i, String str) {
        aozy createBuilder = amtg.a.createBuilder();
        aozy createBuilder2 = amsx.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        amsx amsxVar = (amsx) createBuilder2.b;
        amsxVar.c = i - 1;
        amsxVar.b |= 1;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amtg amtgVar = (amtg) createBuilder.b;
        amsx amsxVar2 = (amsx) createBuilder2.s();
        amsxVar2.getClass();
        amtgVar.d = amsxVar2;
        amtgVar.c = 3;
        if (!TextUtils.isEmpty(str)) {
            String a2 = a(str);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amtg amtgVar2 = (amtg) createBuilder.b;
            a2.getClass();
            amtgVar2.b |= 1;
            amtgVar2.e = a2;
        }
        maq maqVar = (maq) this.b.b();
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.RBM_EVENT;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amtg amtgVar3 = (amtg) createBuilder.s();
        amtgVar3.getClass();
        amfrVar2.az = amtgVar3;
        amfrVar2.e |= 2048;
        maqVar.j(amfqVar);
    }

    public final void j(String str, int i) {
        aozy createBuilder = amte.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amte amteVar = (amte) apagVar;
        amteVar.c = 3;
        amteVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        amte amteVar2 = (amte) apagVar2;
        amteVar2.d = i - 1;
        amteVar2.b |= 2;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apag apagVar3 = createBuilder.b;
        amte amteVar3 = (amte) apagVar3;
        amteVar3.f = 1;
        amteVar3.b |= 8;
        if (str != null) {
            if (!apagVar3.isMutable()) {
                createBuilder.u();
            }
            amte amteVar4 = (amte) createBuilder.b;
            amteVar4.b |= 4;
            amteVar4.e = str;
        }
        l((amte) createBuilder.s());
    }

    public final void k(int i, String str, String str2) {
        aozy createBuilder = amtf.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amtf amtfVar = (amtf) apagVar;
        amtfVar.c = 4;
        amtfVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        amtf amtfVar2 = (amtf) apagVar2;
        amtfVar2.d = i - 1;
        amtfVar2.b |= 2;
        int n = n(str2);
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        amtf amtfVar3 = (amtf) createBuilder.b;
        amtfVar3.f = n - 1;
        amtfVar3.b |= 8;
        e((amtf) createBuilder.s(), str, str2);
    }
}
