package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public class acns {
    public final amnn a;
    private final adtn b;
    private final adeo c;
    private final anen d;
    private final acnu e;

    public acns(adeo adeoVar, adtn adtnVar, amnn amnnVar, anen anenVar, acnu acnuVar) {
        this.b = adtnVar;
        this.c = adeoVar;
        this.a = amnnVar;
        this.d = anenVar;
        this.e = acnuVar;
    }

    public final void a(Callable callable, Function function) {
        albo.bR(anee.o(this.d.submit(callable)), new xch(function, 2), this.d);
    }

    public final void b(Context context, amno amnoVar, apkj apkjVar) {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return;
        }
        this.e.b(context, amnoVar, apkjVar);
    }

    public final aozy c(Context context) {
        int i;
        apfc apfcVar;
        apfr apfrVar = null;
        if (context == null) {
            advr.q("Unable to create CarrierServices clearcut event. Context is null!", new Object[0]);
            return null;
        }
        if (this.e.c(this.b.k())) {
            return null;
        }
        aozy createBuilder = amno.a.createBuilder();
        if (true != "com.google.android.apps.messaging".equals(context.getPackageName())) {
            i = 3;
        } else {
            i = 2;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amno amnoVar = (amno) apagVar;
        amnoVar.k = i - 1;
        amnoVar.b |= 256;
        amnn amnnVar = this.a;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        amno amnoVar2 = (amno) createBuilder.b;
        amnoVar2.j = amnnVar.e;
        amnoVar2.b |= 128;
        adeo adeoVar = this.c;
        String b = adeoVar.b();
        String d = adeoVar.d();
        String c = adeoVar.c();
        aozy createBuilder2 = apfc.a.createBuilder();
        boolean f = this.c.f();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apfc apfcVar2 = (apfc) createBuilder2.b;
        apfcVar2.b |= 16;
        apfcVar2.g = f;
        if (this.c.a() == 0 && b == null && d == null && c == null) {
            if (((Boolean) aczf.o().a.I.a()).booleanValue() && !aczf.o().M()) {
                apfcVar = (apfc) createBuilder2.s();
            } else {
                apfcVar = null;
            }
        } else {
            if (this.c.a() >= 0) {
                int a = this.c.a();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                apfc apfcVar3 = (apfc) createBuilder2.b;
                apfcVar3.b |= 4;
                apfcVar3.e = a;
            }
            if (b != null) {
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                apfc apfcVar4 = (apfc) createBuilder2.b;
                apfcVar4.b |= 1;
                apfcVar4.c = b;
            }
            if (d != null) {
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                apfc apfcVar5 = (apfc) createBuilder2.b;
                apfcVar5.b |= 2;
                apfcVar5.d = d;
            }
            if (c != null) {
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                apfc apfcVar6 = (apfc) createBuilder2.b;
                apfcVar6.b |= 8;
                apfcVar6.f = c;
            }
            apfcVar = (apfc) createBuilder2.s();
        }
        if (apfcVar != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amno amnoVar3 = (amno) createBuilder.b;
            amnoVar3.i = apfcVar;
            amnoVar3.b |= 64;
        }
        this.e.f(createBuilder, context);
        String m = this.b.m();
        if (TextUtils.isEmpty(m)) {
            advr.o("Unable to retrieve SIM operator information for metrics!", new Object[0]);
        } else {
            adtn adtnVar = this.b;
            String n = adtnVar.n();
            String i2 = adtnVar.i();
            aozy createBuilder3 = apfr.a.createBuilder();
            String substring = m.substring(0, 3);
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            apfr apfrVar2 = (apfr) createBuilder3.b;
            substring.getClass();
            apfrVar2.b = 1 | apfrVar2.b;
            apfrVar2.c = substring;
            String substring2 = m.substring(3);
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            apfr apfrVar3 = (apfr) createBuilder3.b;
            substring2.getClass();
            apfrVar3.b |= 2;
            apfrVar3.d = substring2;
            boolean u = this.b.u();
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            apfr apfrVar4 = (apfr) createBuilder3.b;
            apfrVar4.b |= 16;
            apfrVar4.g = u;
            if (!TextUtils.isEmpty(i2)) {
                String i3 = this.b.i();
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                apfr apfrVar5 = (apfr) createBuilder3.b;
                i3.getClass();
                apfrVar5.b |= 8;
                apfrVar5.f = i3;
            }
            if (!TextUtils.isEmpty(n)) {
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                apfr apfrVar6 = (apfr) createBuilder3.b;
                n.getClass();
                apfrVar6.b |= 4;
                apfrVar6.e = n;
            }
            apfrVar = (apfr) createBuilder3.s();
        }
        if (apfrVar != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amno amnoVar4 = (amno) createBuilder.b;
            amnoVar4.d = apfrVar;
            amnoVar4.c = 6;
        }
        if (!TextUtils.isEmpty((String) aduv.i.d())) {
            String str = (String) aduv.i.d();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amno amnoVar5 = (amno) createBuilder.b;
            str.getClass();
            amnoVar5.b |= 512;
            amnoVar5.l = str;
        }
        return createBuilder;
    }
}
