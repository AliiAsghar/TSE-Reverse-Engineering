package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.textfield.TextInputLayout;
import j$.util.Optional;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asqc {
    public final /* synthetic */ Object a;

    public asqc() {
        this.a = "com.google.android.gms.org.conscrypt";
    }

    public static /* synthetic */ void z(asqc asqcVar, aiyz aiyzVar) {
        if (((aiyx) asqcVar.a).c.b(aiyzVar.a) != null) {
            ((aiyx) asqcVar.a).d.a();
        }
    }

    public final boolean a(SSLSocket sSLSocket) {
        String name = sSLSocket.getClass().getName();
        name.getClass();
        return arsd.ad(name, ((String) this.a).concat("."));
    }

    public final void b() {
        if (((aqzu) this.a).c.decrementAndGet() == 0) {
            ((aqzu) this.a).e();
        }
    }

    public final void c(Object obj) {
        ((dtp) this.a).f(obj);
    }

    public final void d(Throwable th) {
        ((dtp) this.a).g(th);
    }

    public final void e(boolean z) {
        if (!z) {
            ((aogo) ((aodi) this.a).f.a()).c();
        }
    }

    public final alqu f() {
        return new alse(((alsd) this.a).a(), new alsc());
    }

    public final /* bridge */ /* synthetic */ Object g(Object obj) {
        int simCarrierId;
        int intValue = ((Integer) obj).intValue();
        lfl lflVar = (lfl) this.a;
        ykb h = ((yjy) lflVar.c).h(intValue);
        int[] H = h.H();
        String w = h.w();
        String s = h.s();
        aozy createBuilder = amhb.a.createBuilder();
        int i = H[0];
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amhb amhbVar = (amhb) apagVar;
        int i2 = 1;
        amhbVar.b |= 1;
        amhbVar.c = i;
        int i3 = H[1];
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        amhb amhbVar2 = (amhb) apagVar2;
        amhbVar2.b |= 2;
        amhbVar2.d = i3;
        if (w == null) {
            w = "UNKNOWN";
        }
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apag apagVar3 = createBuilder.b;
        amhb amhbVar3 = (amhb) apagVar3;
        amhbVar3.b |= 4;
        amhbVar3.e = w;
        if (s == null) {
            s = "UNKNOWN";
        }
        if (!apagVar3.isMutable()) {
            createBuilder.u();
        }
        amhb amhbVar4 = (amhb) createBuilder.b;
        amhbVar4.b |= 8;
        amhbVar4.f = s;
        if (true == ((adtn) lflVar.b).u()) {
            i2 = 2;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amhb amhbVar5 = (amhb) createBuilder.b;
        amhbVar5.g = i2 - 1;
        amhbVar5.b |= 16;
        if (yhx.b) {
            simCarrierId = ((TelephonyManager) lflVar.d).getSimCarrierId();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amhb amhbVar6 = (amhb) createBuilder.b;
            amhbVar6.b |= 32;
            amhbVar6.h = simCarrierId;
        }
        return (amhb) createBuilder.s();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final String h(String str) {
        str.getClass();
        String str2 = (String) this.a.get(str);
        if (str2 != null) {
            return str2;
        }
        throw new IllegalStateException("Unknown package ".concat(str));
    }

    public final void i(TextInputLayout textInputLayout) {
        ajnb ajnbVar = (ajnb) this.a;
        EditText editText = ajnbVar.j;
        if (editText == textInputLayout.c) {
            return;
        }
        if (editText != null) {
            editText.removeTextChangedListener(ajnbVar.k);
            if (((ajnb) this.a).j.getOnFocusChangeListener() == ((ajnb) this.a).c().d()) {
                ((ajnb) this.a).j.setOnFocusChangeListener(null);
            }
        }
        ajnb ajnbVar2 = (ajnb) this.a;
        ajnbVar2.j = textInputLayout.c;
        EditText editText2 = ajnbVar2.j;
        if (editText2 != null) {
            editText2.addTextChangedListener(ajnbVar2.k);
        }
        ajnb ajnbVar3 = (ajnb) this.a;
        ajnbVar3.c().g(ajnbVar3.j);
        ajnb ajnbVar4 = (ajnb) this.a;
        ajnbVar4.n(ajnbVar4.c());
    }

    public final void j(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        ((BaseTransientBottomBar) this.a).f(0);
    }

    public final void k(Drawable drawable) {
        if (drawable != null) {
            FloatingActionButton.c((FloatingActionButton) this.a, drawable);
        }
    }

    public final boolean l() {
        return ((FloatingActionButton) this.a).b;
    }

    public final void m() {
        aiyx.a();
        aiyx aiyxVar = (aiyx) this.a;
        aiyxVar.j = aiyxVar.h.f().toEpochMilli();
        yfc yfcVar = aiyxVar.l;
        if (yfcVar != null) {
            yfcVar.a(aiyxVar.d.a());
        }
    }

    public final void n(aiyz aiyzVar) {
        if (!aiyzVar.b.equals(aizd.EMBEDDED)) {
            aiyx.a();
        }
        Object obj = this.a;
        String str = aiyzVar.a;
        aizd aizdVar = aiyzVar.b;
        aiyx aiyxVar = (aiyx) obj;
        aiyy aiyyVar = aiyxVar.c;
        yfc b = aiyyVar.b(str);
        aizc a = aiyyVar.a(str);
        if (aizdVar != aizd.EMBEDDED) {
            aiyxVar.j = aiyxVar.h.f().toEpochMilli();
        }
        if (b != null && a != null) {
            b.a(a.a());
        }
        aiyy aiyyVar2 = aiyxVar.c;
        aiyyVar2.f.remove(aiyzVar.a);
    }

    public final void o() {
        aiyx.b();
        aiyx aiyxVar = (aiyx) this.a;
        yfc yfcVar = aiyxVar.l;
        if (yfcVar != null) {
            yfcVar.b(aiyxVar.d.a());
        }
    }

    public final void p(aiyz aiyzVar) {
        if (!aiyzVar.b.equals(aizd.EMBEDDED)) {
            aiyx.b();
        }
        Object obj = this.a;
        String str = aiyzVar.a;
        aiyx aiyxVar = (aiyx) obj;
        yfc b = aiyxVar.c.b(str);
        aizc a = aiyxVar.c.a(str);
        if (b != null && a != null) {
            b.b(a.a());
        }
    }

    public final void q(aiyz aiyzVar) {
        if (((aiyx) this.a).c.b(aiyzVar.a) != null) {
            ((aiyx) this.a).d.a();
        }
    }

    public final void r() {
        boolean z;
        synchronized (((aixj) this.a).h) {
            int i = ((aixj) this.a).k;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            albo.V(z, "Refcount went negative!", i);
            ((aixj) r1).k--;
            ((aixj) this.a).c();
        }
    }

    public final void s() {
        boolean z;
        synchronized (((aixj) this.a).h) {
            int i = ((aixj) this.a).k;
            if (i != 0) {
                if (i > 0) {
                    z = true;
                } else {
                    z = false;
                }
                albo.V(z, "Refcount went negative!", i);
                ((aixj) this.a).k++;
            } else {
                throw new CancellationException("database is closed");
            }
        }
    }

    public final void t(String str) {
        advr.d(((aikl) this.a).a, "Transaction aborted for context id: %s", str);
        aikh f = ((aikl) this.a).f(str);
        if (f == null) {
            advr.r(((aikl) this.a).a, "onAbort: No transaction context found for context id: %s", str);
        } else {
            f.d(aikg.ABORTED);
        }
    }

    public final void u(ainh ainhVar) {
        String bc = aetn.bc(ainhVar);
        advr.d(((aikl) this.a).a, "onOutgoingMessage for context id: %s", bc);
        if (!ainhVar.r()) {
            Object obj = this.a;
            String i = ainhVar.i();
            if (bc == null) {
                advr.r(((aikl) obj).a, "Unable to add outgoing context for null context id", new Object[0]);
                return;
            }
            if (i == null) {
                advr.r(((aikl) obj).a, "Unable to add outgoing context for null method for context id: %s", bc);
                return;
            }
            synchronized (((aikl) obj).d) {
                if (((aikl) obj).d.add(bc)) {
                    int i2 = ((aikl) obj).b.a * 50;
                    advr.l(((aikl) obj).a, "Adding transaction context and starting timer with: %d for context id %s, method: %s", Integer.valueOf(i2), bc, i);
                    ((aikl) obj).f.schedule(new aikk((aikl) obj, bc, ((aikl) obj).a), i2);
                }
            }
        }
    }

    public final void v(ainh ainhVar) {
        boolean z;
        Optional map;
        boolean z2 = true;
        advr.d(((aikl) this.a).a, "onReceiveMessage for context id: %s", ainhVar.u(1));
        if (((aikl) this.a).i(ainhVar)) {
            if (!((aikl) this.a).h(ainhVar)) {
                Object obj = this.a;
                String u = ainhVar.u(1);
                if (u == null) {
                    advr.r(((aikl) obj).a, "Unable to add incoming context for null context id", new Object[0]);
                } else {
                    synchronized (((aikl) obj).e) {
                        if (((aikl) obj).e.add(u)) {
                            int i = ((aikl) obj).b.a * 50;
                            advr.l(((aikl) obj).a, "Adding transaction context and starting timer with: %d for context id %s, method %s", Integer.valueOf(i), u, ainhVar.i());
                            ((aikl) obj).f.schedule(new aikj((aikl) obj, u, ((aikl) obj).a), i);
                        }
                    }
                }
            } else {
                return;
            }
        }
        Object obj2 = this.a;
        if (ainhVar.t() && ((ainj) ainhVar).z()) {
            z = true;
        } else {
            z = false;
        }
        if (!ainhVar.s() || !"ACK".equals(((aini) ainhVar).i())) {
            z2 = false;
        }
        if (z || z2) {
            String u2 = ainhVar.u(2);
            synchronized (((aikl) obj2).d) {
                ((aikl) obj2).d.remove(u2);
            }
        }
        aikl aiklVar = (aikl) this.a;
        advr.d(aiklVar.a, "Receiving message", new Object[0]);
        if (ainhVar.r()) {
            aiklVar.h.x(ainhVar);
            return;
        }
        acqj acqjVar = aiklVar.g;
        if (ainhVar.s()) {
            map = Optional.empty();
        } else {
            String j = aikh.j(new aioo((ainj) ainhVar).a);
            if (j == null) {
                map = Optional.empty();
            } else {
                map = Optional.ofNullable(aiklVar.f(j)).map(new aiec(14));
            }
        }
        Optional optional = map;
        aior aiorVar = aiklVar.c;
        if (ainhVar.s()) {
            aion aionVar = new aion((aini) ainhVar);
            acqjVar.c(aionVar, Optional.empty(), 2, 5, aiorVar);
            synchronized (acqjVar.b) {
                acqjVar.b.add(aionVar);
            }
        } else {
            acqjVar.c(new aioo((ainj) ainhVar), optional, 2, 5, aiorVar);
        }
        if (ainhVar.t()) {
            aiklVar.h.x(ainhVar);
            aiklVar.g(ainhVar);
        } else if (ainhVar.s()) {
            if ("ACK".equals(ainhVar.i())) {
                aiklVar.g(ainhVar);
            }
            aiklVar.h.x(ainhVar);
        }
    }

    public final void w() {
        advr.d(((aikl) this.a).a, "onTeardown", new Object[0]);
        ((aikl) this.a).f.cancel();
        Object obj = this.a;
        synchronized (((aikl) obj).d) {
            for (String str : ((aikl) obj).d) {
                advr.d(((aikl) obj).a, "Transaction lost due to transport error for context id: %s", str);
                aikh f = ((aikl) obj).f(str);
                if (f == null) {
                    advr.r(((aikl) obj).a, "onTransactionLostDueToTransportError: No transaction context found for context id: %s", str);
                } else {
                    advr.d(((aikl) obj).a, "Cancelling transaction with context id: %s", str);
                    f.d(aikg.TRANSPORT_ERROR);
                }
            }
            ((aikl) obj).d.clear();
        }
    }

    public final void x(ainh ainhVar) {
        Object obj = this.a;
        if (ainhVar.r()) {
            int i = ainhVar.l;
            aijv aijvVar = ((aikb) obj).b;
            if (aijvVar == null) {
                advr.q("Keep alive listener is null", new Object[0]);
                return;
            } else if (i == 3) {
                aijvVar.e();
                return;
            } else {
                aijvVar.f();
                return;
            }
        }
        try {
            if (ainhVar.s()) {
                aion aionVar = new aion((aini) ainhVar);
                advr.w(25, 3, "SIP request received with method=%s and callid=%s", aionVar.z(), aionVar.d());
                if (((Boolean) acpy.h.a()).booleanValue()) {
                    advr.c("\n%s", aionVar.n());
                }
                advr.l(((aikb) obj).c(), "Notifying %d SIP listener(s) about %s request for %s", Integer.valueOf(((aikb) obj).a.size()), aionVar.z(), aionVar.d());
                Iterator it = ((aikb) obj).a.iterator();
                while (it.hasNext()) {
                    ((aijx) it.next()).f(aionVar);
                }
                return;
            }
            aioo aiooVar = new aioo((ainj) ainhVar);
            advr.w(25, 3, "SIP response received with code=%s and callid=%s", Integer.valueOf(aiooVar.y()), aiooVar.d());
            if (((Boolean) acpy.h.a()).booleanValue()) {
                advr.c("\n%s", aiooVar.n());
            }
            advr.l(((aikb) obj).c(), "Notifying %d SIP listener(s) about %d %s response for %s (CallId=%s)", Integer.valueOf(((aikb) obj).a.size()), Integer.valueOf(aiooVar.y()), aiooVar.A(), aiooVar.z().i(), aiooVar.d());
            Iterator it2 = ((aikb) obj).a.iterator();
            while (it2.hasNext()) {
                ((aijx) it2.next()).g(aiooVar);
            }
        } catch (Exception e) {
            advr.g("Can't process incoming message: %s", e.getMessage());
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v23, types: [java.lang.Object, apbt] */
    public final apuv y(String str) {
        akix akixVar;
        boolean e;
        int S = arsd.S(str, ' ', 0, 6);
        if (S > 0 && S < str.length() - 1) {
            Object obj = this.a;
            String substring = str.substring(0, S);
            substring.getClass();
            String substring2 = str.substring(S + 1);
            substring2.getClass();
            akir akirVar = new akir(substring, substring2);
            String str2 = akirVar.a;
            asqe asqeVar = (asqe) obj;
            boolean f = ((algw) asqeVar.a).f();
            String h = ((asqc) asqeVar.c).h(str2);
            Boolean bool = null;
            if (f) {
                Object obj2 = asqeVar.b.get(h);
                obj2.getClass();
                String str3 = akirVar.b;
                akjb akjbVar = (akjb) obj2;
                ahlp ahlpVar = (ahlp) ((algw) asqeVar.a).b();
                String str4 = akjbVar.n;
                armf armfVar = akjbVar.g;
                Uri a = ahsy.a(str4);
                apuv b = ((akij) armfVar.b()).b(str3);
                if (b != null) {
                    String c = ahlpVar.c(a, null, null, str3);
                    if (c != null) {
                        int i = b.a - 1;
                        if (i != 0) {
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        if (i != 4) {
                                            try {
                                                afzu afzuVar = new afzu(b, c, 10, null);
                                                ?? r8 = b.c;
                                                r8.getClass();
                                                return akec.H(afzuVar, r8);
                                            } catch (apba unused) {
                                                return b;
                                            }
                                        }
                                        return new apuv(new agef(c, 17), 5);
                                    }
                                    return akec.I(c);
                                }
                                return akec.F(Double.parseDouble(c));
                            }
                            if (acme.c.matcher(c).matches()) {
                                bool = true;
                            } else if (acme.d.matcher(c).matches()) {
                                bool = false;
                            }
                            if (bool != null) {
                                e = bool.booleanValue();
                            } else {
                                e = b.e();
                            }
                            return akec.E(e);
                        }
                        return akec.G(Long.parseLong(c));
                    }
                    return b;
                }
                throw new IllegalArgumentException("No known flag " + str3 + ", known flags: " + ((akij) akjbVar.g.b()).a());
            }
            Object obj3 = asqeVar.b.get(h);
            obj3.getClass();
            String str5 = akirVar.b;
            akjb akjbVar2 = (akjb) obj3;
            try {
                if (akjbVar2.m.e()) {
                    akixVar = (akix) albo.bQ(akjbVar2.m.c());
                } else {
                    akrh e2 = aktp.e("Blocking for: " + akjbVar2.n);
                    try {
                        akix akixVar2 = (akix) akjbVar2.q.b(new akdj(akjbVar2, 9));
                        armd.i(e2, null);
                        akixVar = akixVar2;
                    } finally {
                    }
                }
                return akixVar.e(str5, new aggd(akjbVar2, 11));
            } catch (ExecutionException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
        throw new IllegalStateException("Bad flag format for ".concat(str));
    }

    public /* synthetic */ asqc(Object obj) {
        this.a = obj;
    }

    public asqc(Object obj, byte[] bArr) {
        this.a = obj;
    }
}
