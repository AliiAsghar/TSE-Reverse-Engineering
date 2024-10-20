package defpackage;

import java.util.Locale;
import java.util.Vector;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ailc {
    public aiky a;

    public ailc() {
    }

    private final void s(aikn aiknVar) {
        this.a.a(60);
        this.a.n("sip_urlLexer");
        this.a.h();
        aiks n = new ailc(this.a, (char[]) null).n();
        aiknVar.c = 1;
        aiknVar.b = n;
        this.a.h();
        this.a.a(62);
    }

    private final aila t() {
        aikz aikzVar;
        String str;
        aila ailaVar = new aila();
        while (true) {
            String v = v();
            if (v.equalsIgnoreCase("phone-context")) {
                this.a.a(61);
                char q = this.a.q(0);
                if (q == '+') {
                    this.a.s(1);
                    str = "+".concat(u());
                } else if (aile.v(q)) {
                    str = this.a.a(4095).a;
                } else {
                    throw new ailb("Invalid phone-context:" + q);
                }
                aikzVar = new aikz("phone-context", str);
            } else if (this.a.q(0) == '=') {
                this.a.s(1);
                aikzVar = new aikz(v, v());
            } else {
                aikzVar = new aikz(v, "");
            }
            ailaVar.g(aikzVar);
            if (this.a.q(0) == ';') {
                this.a.s(1);
            } else {
                return ailaVar;
            }
        }
    }

    private final String u() {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        while (true) {
            if (!this.a.t()) {
                break;
            }
            char q = this.a.q(0);
            if (!Character.isDigit(q) && q != '-' && q != '.' && q != '(' && q != ')') {
                if (i <= 0) {
                    throw a("unexpected " + q);
                }
            } else {
                this.a.s(1);
                stringBuffer.append(q);
                i++;
            }
        }
        return stringBuffer.toString();
    }

    private final String v() {
        StringBuffer stringBuffer = new StringBuffer();
        while (this.a.t()) {
            char q = this.a.q(0);
            if (q != '[' && q != ']' && q != '/' && q != ':' && q != '&' && q != '+' && q != '$' && !y(q)) {
                if (!x()) {
                    break;
                }
                String o = this.a.o();
                this.a.s(3);
                stringBuffer.append(o);
            } else {
                stringBuffer.append(q);
                this.a.s(1);
            }
        }
        return stringBuffer.toString();
    }

    private final String w() {
        StringBuffer stringBuffer = new StringBuffer();
        while (this.a.t()) {
            char q = this.a.q(0);
            if (!y(q) && q != '&' && q != '?' && q != '+' && q != '$' && q != '#' && q != '/' && q != ',' && q != ';' && q != '=') {
                if (!x()) {
                    break;
                }
                String o = this.a.o();
                this.a.s(3);
                stringBuffer.append(o);
            } else {
                stringBuffer.append(q);
                this.a.s(1);
            }
        }
        return stringBuffer.toString();
    }

    private final boolean x() {
        try {
            char q = this.a.q(0);
            char q2 = this.a.q(1);
            char q3 = this.a.q(2);
            if (q == '%' && aile.w(q2)) {
                if (aile.w(q3)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private static boolean y(char c) {
        if (!aile.u(c) && !Character.isDigit(c) && c != '-' && c != '_' && c != '.' && c != '!' && c != '~' && c != '*' && c != '\'' && c != '(' && c != ')') {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ailb a(String str) {
        String str2 = this.a.f + ":" + str;
        int i = this.a.g;
        return new ailb(str2);
    }

    public final String b() {
        ailg ailgVar = (ailg) this.a.g(1).elementAt(0);
        int i = ailgVar.b;
        if (i != 2053 && i != 2054 && i != 2056 && i != 2055 && i != 2052 && i != 2057 && i != 2101 && i != 2102 && i != 4095) {
            throw a("Invalid Method");
        }
        aiky aikyVar = this.a;
        aikyVar.g = aikyVar.h;
        return ailgVar.a;
    }

    protected final aikz c() {
        String str;
        this.a.a(4095);
        aiky aikyVar = this.a;
        ailg ailgVar = aikyVar.e;
        aikyVar.h();
        try {
            boolean z = false;
            if (this.a.q(0) == '=') {
                this.a.s(1);
                this.a.h();
                if (this.a.q(0) == '\"') {
                    str = this.a.e();
                    z = true;
                } else {
                    this.a.a(4095);
                    str = this.a.e.a;
                }
                aikz aikzVar = new aikz(ailgVar.a, str);
                if (z) {
                    aikzVar.b();
                }
                return aikzVar;
            }
            return new aikz(ailgVar.a, null);
        } catch (ailb unused) {
            return new aikz(ailgVar.a, null);
        }
    }

    public final aikw d() {
        StringBuilder sb = new StringBuilder();
        if (this.a.q(0) == '[') {
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                if (!this.a.t()) {
                    break;
                }
                char q = this.a.q(0);
                if (aile.w(q)) {
                    this.a.s(1);
                    sb2.append(q);
                } else if (q != '.' && q != ':' && q != '[') {
                    if (q == ']') {
                        this.a.s(1);
                        sb2.append(']');
                        sb.append(sb2.toString());
                    }
                } else {
                    this.a.s(1);
                    sb2.append(q);
                }
            }
            aiky aikyVar = this.a;
            String valueOf = String.valueOf(aikyVar.f);
            int i = aikyVar.g;
            throw new ailb(valueOf.concat(": Illegal Host name "));
        }
        sb.append(e());
        while (this.a.t() && this.a.q(0) == '.') {
            this.a.s(1);
            String e = e();
            sb.append(".");
            sb.append(e);
        }
        String sb3 = sb.toString();
        if (!sb3.equals("")) {
            aikv aikvVar = new aikv(sb3);
            aikw aikwVar = new aikw();
            aikwVar.a = aikvVar;
            if (this.a.t() && this.a.q(0) == ':') {
                this.a.s(1);
                try {
                    aikwVar.b = Integer.parseInt(this.a.d());
                } catch (NumberFormatException unused) {
                    aiky aikyVar2 = this.a;
                    String valueOf2 = String.valueOf(aikyVar2.f);
                    int i2 = aikyVar2.g;
                    throw new ailb(valueOf2.concat(" :Error parsing port "));
                }
            }
            return aikwVar;
        }
        aiky aikyVar3 = this.a;
        String valueOf3 = String.valueOf(aikyVar3.f);
        int i3 = aikyVar3.g;
        throw new ailb(valueOf3.concat(": Illegal Host name "));
    }

    protected final String e() {
        StringBuilder sb = new StringBuilder();
        while (this.a.t()) {
            char q = this.a.q(0);
            if (aile.u(q)) {
                this.a.s(1);
                sb.append(q);
            } else if (Character.isDigit(q)) {
                this.a.s(1);
                sb.append(q);
            } else {
                if (q != '-') {
                    break;
                }
                this.a.s(1);
                sb.append('-');
            }
        }
        return sb.toString();
    }

    public final aikn f() {
        return g(false);
    }

    public final aikn g(boolean z) {
        int i = 0;
        while (this.a.t() && this.a.q(i) != '<' && this.a.q(i) != '\"' && this.a.q(i) != ':' && this.a.q(i) != '/') {
            if (this.a.q(i) != 0) {
                i++;
            } else {
                throw a("unexpected EOL");
            }
        }
        if (this.a.q(i) != '<' && this.a.q(i) != '\"') {
            if (this.a.q(i) != ':' && this.a.q(i) != '/') {
                throw a("Bad address spec");
            }
            aikn aiknVar = new aikn();
            aiks o = new ailc(this.a, (char[]) null).o(z);
            aiknVar.c = 2;
            aiknVar.b = o;
            return aiknVar;
        }
        aikn aiknVar2 = new aikn();
        if (this.a.q(0) == '\"') {
            String e = this.a.e();
            if (e != null) {
                aiknVar2.d(e.trim());
                this.a.h();
            } else {
                throw new ailb("Name is null");
            }
        }
        if (this.a.q(0) == '<') {
            s(aiknVar2);
        } else if (aiknVar2.a == null) {
            aiky aikyVar = this.a;
            int i2 = aikyVar.g;
            StringBuilder sb = new StringBuilder();
            while (true) {
                char q = aikyVar.q(0);
                if (q != 0) {
                    if (q == ' ') {
                        aikyVar.s(1);
                        String sb2 = sb.toString();
                        this.a.h();
                        if (this.a.q(0) == '<') {
                            aiknVar2.d(sb2);
                            s(aiknVar2);
                        } else {
                            throw a("Bad address spec");
                        }
                    } else if (q == '\\') {
                        aikyVar.s(1);
                        char q2 = aikyVar.q(0);
                        if (q2 != 0) {
                            aikyVar.s(1);
                            sb.append(q2);
                        } else {
                            String valueOf = String.valueOf(aikyVar.f);
                            int i3 = aikyVar.g;
                            ailb ailbVar = new ailb(valueOf.concat("unexpected EOL"));
                            aikyVar.g = i2;
                            throw ailbVar;
                        }
                    } else {
                        aikyVar.s(1);
                        sb.append(q);
                    }
                } else {
                    String valueOf2 = String.valueOf(aikyVar.f);
                    int i4 = aikyVar.g;
                    ailb ailbVar2 = new ailb(valueOf2.concat("unexpected EOL"));
                    aikyVar.g = i2;
                    throw ailbVar2;
                }
            }
        } else {
            this.a.n("sip_urlLexer");
            this.a.h();
            aiks o2 = new ailc(this.a, (char[]) null).o(false);
            aiknVar2.c = 1;
            aiknVar2.b = o2;
            this.a.h();
        }
        return aiknVar2;
    }

    public aimh h() {
        String r = this.a.r(':');
        this.a.s(1);
        aiky aikyVar = this.a;
        StringBuilder sb = new StringBuilder();
        while (aikyVar.g < aikyVar.f.length() && aikyVar.f.charAt(aikyVar.g) != '\n') {
            sb.append(aikyVar.f.charAt(aikyVar.g));
            aikyVar.g++;
        }
        if (aikyVar.g < aikyVar.f.length() && aikyVar.f.charAt(aikyVar.g) == '\n') {
            sb.append('\n');
            aikyVar.g++;
        }
        return new aimf(r, sb.toString().trim());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i(int i) {
        this.a.a(i);
        this.a.h();
        this.a.a(58);
        this.a.h();
    }

    public final void j(String str) {
        if (this.a == null) {
            this.a = new aiky("command_keywordLexer", str);
            return;
        }
        throw a("header already set");
    }

    public final aikp k() {
        return l(true);
    }

    public final aikp l(boolean z) {
        String str;
        aikp aikpVar = new aikp();
        this.a.a(2051);
        char c = ':';
        this.a.a(58);
        aikpVar.e = "SIP".toLowerCase(Locale.US);
        int i = this.a.g;
        char c2 = '$';
        char c3 = '+';
        char c4 = '=';
        try {
            try {
                String w = w();
                this.a.q(0);
                this.a.a(58);
                StringBuffer stringBuffer = new StringBuffer();
                while (true) {
                    char q = this.a.q(0);
                    if (!y(q) && q != '&' && q != '=' && q != '+' && q != '$' && q != ',') {
                        if (!x()) {
                            break;
                        }
                        stringBuffer.append(this.a.o());
                        this.a.s(3);
                    }
                    stringBuffer.append(q);
                    this.a.s(1);
                }
                String stringBuffer2 = stringBuffer.toString();
                this.a.a(64);
                aikw d = new ailc(this.a).d();
                aikpVar.k(w);
                if (aikpVar.a == null) {
                    aikpVar.a = new aiko();
                }
                aiko aikoVar = aikpVar.a;
                if (aikoVar.b == null) {
                    aikoVar.b = new aikt();
                }
                aikoVar.b.b = stringBuffer2;
                aikpVar.g(d);
            } catch (ailb unused) {
                this.a.g = i;
                String w2 = w();
                this.a.a(64);
                aikw d2 = new ailc(this.a).d();
                aikpVar.k(w2);
                aikpVar.g(d2);
            }
        } catch (ailb unused2) {
            aiky aikyVar = this.a;
            aikyVar.g = i;
            aikpVar.g(new ailc(aikyVar).d());
        }
        if (z) {
            this.a.n("charLexer");
            while (this.a.t() && this.a.q(0) == ';') {
                this.a.s(1);
                String v = v();
                if (this.a.q(0) == '=') {
                    this.a.s(1);
                    str = v();
                } else {
                    str = null;
                }
                aikpVar.b.g(new aikz(v, str));
            }
            if (this.a.t() && this.a.q(0) == '?') {
                this.a.s(1);
                while (this.a.t()) {
                    String r = this.a.r(c4);
                    this.a.s(1);
                    StringBuffer stringBuffer3 = new StringBuffer();
                    while (this.a.t()) {
                        char q2 = this.a.q(0);
                        if (q2 != c3 && q2 != '?' && q2 != c && q2 != '@' && q2 != '[' && q2 != ']' && q2 != '/' && q2 != c2 && q2 != '_' && q2 != '-' && q2 != '\"' && q2 != '!' && q2 != '~' && q2 != '*' && q2 != '.' && q2 != '(' && q2 != ')' && !aile.u(q2) && !Character.isDigit(q2)) {
                            if (q2 != '%') {
                                break;
                            }
                            StringBuffer stringBuffer4 = new StringBuffer();
                            char q3 = this.a.q(0);
                            char q4 = this.a.q(1);
                            char q5 = this.a.q(2);
                            if (q3 == '%' && aile.w(q4) && aile.w(q5)) {
                                this.a.s(3);
                                stringBuffer4.append('%');
                                stringBuffer4.append(q4);
                                stringBuffer4.append(q5);
                                stringBuffer3.append(stringBuffer4.toString());
                            } else {
                                throw a("escaped");
                            }
                        } else {
                            this.a.s(1);
                            stringBuffer3.append(q2);
                        }
                        c = ':';
                        c2 = '$';
                        c3 = '+';
                    }
                    aikpVar.c.g(new aikz(r, stringBuffer3.toString()));
                    if (this.a.t() && this.a.q(0) != '&') {
                        break;
                    }
                    this.a.s(1);
                    c = ':';
                    c2 = '$';
                    c3 = '+';
                    c4 = '=';
                }
            }
        }
        return aikpVar;
    }

    public final aikq m() {
        aikr aikrVar;
        this.a.a(2105);
        this.a.a(58);
        this.a.n("charLexer");
        char q = this.a.q(0);
        if (q == '+') {
            aikrVar = new aikr();
            aikrVar.a = true;
            this.a.a(43);
            aikrVar.b = u();
            if (this.a.t() && this.a.q(0) == ';') {
                this.a.s(1);
                aikrVar.c = t();
            }
        } else {
            if (!aile.u(q) && !Character.isDigit(q) && q != '-' && q != '*' && q != '.' && q != '(' && q != ')' && q != '#') {
                throw a("unexpected char " + q);
            }
            aikrVar = new aikr();
            aikrVar.a = false;
            StringBuffer stringBuffer = new StringBuffer();
            int i = 0;
            while (true) {
                if (!this.a.t()) {
                    break;
                }
                char q2 = this.a.q(0);
                if (q2 != '*' && q2 != '#' && q2 != '-' && q2 != '.' && q2 != '(') {
                    if (q2 != ')') {
                        if (!Character.isDigit(q2)) {
                            if (i <= 0) {
                                throw a("unexepcted " + q2);
                            }
                        }
                    } else {
                        q2 = ')';
                    }
                }
                this.a.s(1);
                stringBuffer.append(q2);
                i++;
            }
            aikrVar.b = stringBuffer.toString();
            if (this.a.t() && ((ailg) this.a.g(1).elementAt(0)).b == 59) {
                this.a.s(1);
                aikrVar.c = t();
            }
        }
        aikq aikqVar = new aikq();
        aikqVar.a = aikrVar;
        return aikqVar;
    }

    public final aiks n() {
        return o(true);
    }

    public final aiks o(boolean z) {
        Vector g = this.a.g(2);
        ailg ailgVar = (ailg) g.elementAt(0);
        ailg ailgVar2 = (ailg) g.elementAt(1);
        int i = ailgVar.b;
        if (i == 2051) {
            if (ailgVar2.b == 58) {
                return l(z);
            }
            throw a("Expecting ':'");
        }
        if (i == 2105) {
            if (ailgVar2.b == 58) {
                return m();
            }
            throw a("Expecting ':'");
        }
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            String str = null;
            try {
                char q = this.a.q(0);
                if (y(q)) {
                    this.a.s(1);
                    str = aiky.b(q);
                } else {
                    if (q != ';' && q != '/' && q != '?' && q != ':' && q != '@' && q != '&' && q != '+' && q != '$' && q != '=' && q != ',') {
                        if (x()) {
                            String o = this.a.o();
                            this.a.s(3);
                            str = o;
                        }
                    }
                    this.a.s(1);
                    str = aiky.b(q);
                }
            } catch (Exception unused) {
            }
            if (str == null) {
                try {
                    return new aiks(stringBuffer.toString());
                } catch (ailb e) {
                    throw a(e.getMessage());
                }
            }
            stringBuffer.append(str);
        }
    }

    public final void p() {
        if (!this.a.a(2051).a.equals("SIP")) {
            a("Expecting SIP");
        }
        this.a.a(47);
        if (!this.a.a(4095).a.equals("2.0")) {
            a("Expecting SIP/2.0");
        }
    }

    public final void q(ailr ailrVar) {
        this.a.h();
        this.a.a(4095);
        aiky aikyVar = this.a;
        ailg ailgVar = aikyVar.e;
        aikyVar.h();
        ailrVar.a = ailgVar.a;
        while (this.a.q(0) != '\n') {
            ailrVar.j(c());
            this.a.h();
            if (this.a.q(0) != '\n' && this.a.q(0) != 0) {
                this.a.a(44);
                this.a.h();
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void r(aimm aimmVar) {
        this.a.h();
        while (this.a.q(0) == ';') {
            this.a.s(1);
            this.a.h();
            aikz c = c();
            if (this.a.q(0) == '/') {
                c.e = String.valueOf(String.valueOf(c.e)).concat(this.a.r(';'));
            }
            aimmVar.j(c);
            this.a.h();
        }
    }

    public ailc(byte[] bArr) {
        this();
    }

    public ailc(aiky aikyVar) {
        this.a = aikyVar;
        aikyVar.n("charLexer");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ailc(aiky aikyVar, byte[] bArr) {
        this.a = aikyVar;
        aikyVar.n("charLexer");
    }

    public ailc(String str, byte[] bArr) {
        this.a = new aiky("command_keywordLexer", str);
    }

    public ailc(String str) {
        this.a = new aiky("charLexer", str);
    }

    public ailc(String str, char[] cArr) {
        this.a = new aiky("method_keywordLexer", str);
    }

    public ailc(String str, short[] sArr) {
        this.a = new aiky("status_lineLexer", str);
    }

    public ailc(aiky aikyVar, char[] cArr) {
        this.a = aikyVar;
        aikyVar.n("sip_urlLexer");
    }

    public ailc(String str, int[] iArr) {
        this.a = new aiky("sip_urlLexer", str);
    }
}
