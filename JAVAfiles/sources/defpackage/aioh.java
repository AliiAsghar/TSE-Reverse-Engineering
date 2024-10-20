package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aioh extends ailc {
    @Override // defpackage.ailc
    public final aimh h() {
        aikz aikzVar;
        String str;
        ainc aincVar = new ainc();
        this.a.a(2064);
        this.a.h();
        this.a.a(58);
        this.a.h();
        do {
            ainb ainbVar = new ainb();
            this.a.a(4095);
            aiky aikyVar = this.a;
            ailg ailgVar = aikyVar.e;
            aikyVar.h();
            this.a.a(47);
            this.a.h();
            this.a.a(4095);
            this.a.h();
            aiky aikyVar2 = this.a;
            ailg ailgVar2 = aikyVar2.e;
            aikyVar2.h();
            this.a.a(47);
            this.a.h();
            this.a.a(4095);
            this.a.h();
            aiky aikyVar3 = this.a;
            ailg ailgVar3 = aikyVar3.e;
            aikyVar3.h();
            aimn aimnVar = new aimn();
            aimnVar.a = ailgVar.a;
            aimnVar.b = ailgVar2.a;
            aimnVar.c = ailgVar3.a;
            ainbVar.a = aimnVar;
            ainbVar.b = new ailc(this.a).d();
            this.a.h();
            while (true) {
                boolean z = false;
                if (this.a.q(0) != ';') {
                    break;
                }
                this.a.a(59);
                this.a.h();
                this.a.a(4095);
                aiky aikyVar4 = this.a;
                ailg ailgVar4 = aikyVar4.e;
                aikyVar4.h();
                try {
                    if (this.a.q(0) == '=') {
                        this.a.s(1);
                        this.a.h();
                        if (ailgVar4.a.compareToIgnoreCase("received") == 0) {
                            aiky aikyVar5 = this.a;
                            StringBuilder sb = new StringBuilder();
                            while (true) {
                                try {
                                    char q = aikyVar5.q(0);
                                    if (q == '\n' || q == ';') {
                                        break;
                                    }
                                    aikyVar5.s(1);
                                    sb.append(q);
                                } catch (ailb unused) {
                                    str = sb.toString();
                                }
                            }
                            str = sb.toString();
                        } else if (this.a.q(0) == '\"') {
                            str = this.a.e();
                            z = true;
                        } else {
                            this.a.a(4095);
                            str = this.a.e.a;
                        }
                        aikzVar = new aikz(ailgVar4.a.toLowerCase(), str);
                        if (z) {
                            aikzVar.b();
                        }
                    } else {
                        aikzVar = new aikz(ailgVar4.a.toLowerCase(), null);
                    }
                } catch (ailb unused2) {
                    aikzVar = new aikz(ailgVar4.a, null);
                }
                aikzVar.d = aikzVar.a().toLowerCase(Locale.US);
                ainbVar.j(aikzVar);
                this.a.h();
            }
            if (this.a.q(0) == '(') {
                this.a.n("charLexer");
                this.a.s(1);
                StringBuffer stringBuffer = new StringBuffer();
                while (true) {
                    char q2 = this.a.q(0);
                    if (q2 == ')') {
                        this.a.s(1);
                        break;
                    }
                    if (q2 == '\\') {
                        stringBuffer.append(this.a.e.a);
                        this.a.s(1);
                        stringBuffer.append(this.a.e.a);
                        this.a.s(1);
                    } else {
                        if (q2 == '\n') {
                            break;
                        }
                        stringBuffer.append(q2);
                        this.a.s(1);
                    }
                }
                ainbVar.f = stringBuffer.toString();
            }
            aincVar.g(ainbVar);
            this.a.h();
            if (this.a.q(0) == ',') {
                this.a.s(1);
                this.a.h();
            }
        } while (this.a.q(0) != '\n');
        this.a.a(10);
        return aincVar;
    }
}
