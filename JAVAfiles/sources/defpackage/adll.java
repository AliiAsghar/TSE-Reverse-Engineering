package defpackage;

import android.content.Context;
import android.os.Message;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class adll extends admi {
    final /* synthetic */ adlw d;

    public adll(adlw adlwVar) {
        this.d = adlwVar;
    }

    private final boolean q(Message message, adll adllVar) {
        if (message.obj != this && message.obj != this.d.W.d()) {
            this.d.D.d("%s: ignoring %s", a(), adlw.aw(adlw.av(message)));
            return false;
        }
        this.d.D.d("%s: %s", a(), adlw.aw(adlw.av(message)));
        this.d.ac(adllVar);
        return true;
    }

    @Override // defpackage.acyh
    public void b() {
        this.d.y.ifPresent(new adgr(this, 18));
        this.d.D.d("Enter %s", a());
        adlw adlwVar = this.d;
        String str = adlwVar.n;
        boolean a = ((acxv) adlwVar.N.b()).a();
        String a2 = a();
        if (a) {
            ((aday) adlwVar.O.b()).t(str, a2);
        } else {
            Context context = adlwVar.s;
            adnu.a();
            adnu.q(context, str, a2);
        }
        if (h()) {
            adlw adlwVar2 = this.d;
            apkn g = g();
            String str2 = adlwVar2.r;
            adiw adiwVar = new adiw(adlwVar2.n);
            acnz acnzVar = adlwVar2.aE;
            acnzVar.z(adlwVar2.s, acnzVar.j(g, 2, adiwVar), str2);
        }
        this.d.X(adjj.MSG_TIMEOUT, l().toMillis());
    }

    @Override // defpackage.acyh
    public void c() {
        this.d.y.ifPresent(new adgr(this, 17));
        this.d.D.d("Exit %s", a());
        this.d.W.p(adjj.MSG_TIMEOUT.a());
        if (h()) {
            adlw adlwVar = this.d;
            apkn g = g();
            String str = adlwVar.r;
            adiw adiwVar = new adiw(adlwVar.n);
            acnz acnzVar = adlwVar.aE;
            acnzVar.z(adlwVar.s, acnzVar.j(g, 3, adiwVar), str);
        }
    }

    public abstract adjj f();

    public abstract apkn g();

    public abstract boolean h();

    public boolean i() {
        this.d.Z(this);
        return true;
    }

    public abstract boolean j();

    public Duration l() {
        return Duration.ofMillis(((Long) aczv.s().a.c.a()).longValue());
    }

    public boolean m() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(adll adllVar, apkn apknVar) {
        this.d.D.d("transitionViaMessage, srcState=%s, destState = %s", a(), adllVar.a());
        acyz acyzVar = admf.a;
        if (adom.k()) {
            qiu.h(this.d.X.c(apknVar));
        }
        if (adom.j()) {
            this.d.W(adllVar.f(), adjj.MSG_ARG_TRANSITION_MSG.a(), 0, this);
        }
    }

    public final boolean o(Message message, adjj adjjVar) {
        acyz acyzVar = admf.a;
        if (adom.j()) {
            adjjVar = adlw.av(message);
        }
        int ordinal = adjjVar.ordinal();
        if (ordinal != 8) {
            switch (ordinal) {
                case 52:
                    return q(message, this.d.af);
                case 53:
                    return q(message, this.d.ag);
                case 54:
                    return q(message, this.d.ah);
                case 55:
                    return q(message, this.d.ai);
                case 56:
                    return q(message, this.d.aj);
                case 57:
                    return q(message, this.d.am);
                case 58:
                    return q(message, this.d.an);
                case 59:
                    return q(message, this.d.ao);
                default:
                    switch (ordinal) {
                        case 61:
                            return q(message, this.d.ap);
                        case 62:
                            return q(message, this.d.aq);
                        case 63:
                            return q(message, this.d.ar);
                        case 64:
                            return q(message, this.d.as);
                        case 65:
                            return q(message, this.d.at);
                        case 66:
                            return q(message, this.d.au);
                        case 67:
                            return q(message, this.d.av);
                        case 68:
                            return q(message, this.d.aw);
                        case 69:
                            return q(message, this.d.ax);
                        case 70:
                            return q(message, this.d.ay);
                        case 71:
                            return q(message, this.d.az);
                        case 72:
                            return q(message, this.d.aA);
                        default:
                            switch (ordinal) {
                                case 74:
                                    return q(message, this.d.aB);
                                case 75:
                                    return q(message, this.d.aC);
                                case 76:
                                    return q(message, this.d.al);
                                case 77:
                                    return q(message, this.d.ak);
                                case 78:
                                    return q(message, this.d.aD);
                                default:
                                    return false;
                            }
                    }
            }
        }
        if (j()) {
            adlw adlwVar = this.d;
            adlwVar.D.e("Timed out in state %s", adlwVar.r());
            adlwVar.aE.h(adlwVar.s, adlwVar.n(), adlwVar.r, new adiw(adlwVar.n));
            adlwVar.ac(adlwVar.an);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p(adll adllVar, apkn apknVar, int i) {
        if (i == 1) {
            n(adllVar, apknVar);
        } else {
            this.d.ac(adllVar);
        }
    }
}
