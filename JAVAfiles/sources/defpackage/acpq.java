package defpackage;

import android.content.Context;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class acpq {
    private static final advp x = new advp("RcsFlags");
    private static final Object y = new Object();
    public static volatile acpq a = null;
    public static volatile acpt b = null;
    private static volatile Optional z = Optional.empty();
    static final Boolean c = true;
    static final Boolean d = true;
    static final Long e = Long.valueOf(TimeUnit.SECONDS.toMillis(10));
    static final Long f = Long.valueOf(TimeUnit.MINUTES.toMillis(20));
    static final Integer g = 102400;
    static final Integer h = 10240;
    static final Integer i = Integer.valueOf((int) TimeUnit.SECONDS.toMillis(10));
    static final Long j = Long.valueOf(TimeUnit.MINUTES.toSeconds(30));
    static final Long k = 5L;
    static final Integer l = -1;
    static final Integer m = -1;
    static final Boolean n = true;
    static final Boolean o = false;
    static final Boolean p = false;
    static final Boolean q = false;
    static final Boolean r = false;
    static final Boolean s = false;
    static final Boolean t = true;
    static final Boolean u = false;
    public static final long v = TimeUnit.MINUTES.toMillis(15);
    public static final long w = TimeUnit.HOURS.toMillis(24);

    public static acpq E() {
        if (a == null) {
            H(((acpo) acrk.a(acpo.class)).a());
        }
        if (((Boolean) aczv.s().a.T.a()).booleanValue() && (!((Boolean) aczv.s().a.V.a()).booleanValue() || adwi.f(((acpo) acrk.a(acpo.class)).a()))) {
            if (b == null) {
                advr.d(x, "Amber enabled, setting mobileConfigurationInstance", new Object[0]);
                b = ((acpo) acrk.a(acpo.class)).b();
            }
            if (((Boolean) aczv.s().a.S.a()).booleanValue()) {
                advr.d(x, "logging RcsFlags.get() call stack", new Object[0]);
                Thread.dumpStack();
            }
            if (aczv.x()) {
                if (b != null) {
                    return b;
                }
                throw new IllegalStateException("RcsFlags is not initialized!");
            }
        }
        if (a != null) {
            return a;
        }
        throw new IllegalStateException("Legacy RcsFlags is not initialized!");
    }

    public static void H(Context context) {
        synchronized (y) {
            advr.d(x, "createFlags", new Object[0]);
            acpw acpwVar = new acpw(context);
            z.isPresent();
            StringBuilder sb = new StringBuilder();
            sb.append("<<< RcsFlags::");
            sb.append(String.format("Phenotype (%s)", "com.google.android.ims.library"));
            sb.append(" >>>");
            for (acpp acppVar : acpwVar.G()) {
                sb.append(System.lineSeparator());
                sb.append(acppVar.b());
                sb.append("=");
                sb.append(acppVar.a());
            }
            advr.d(x, "%s", sb.toString());
            a = acpwVar;
        }
    }

    public static void I(Context context) {
        advr.d(x, "initialize RcsFlags", new Object[0]);
        new acpn(context).execute(new Void[0]);
    }

    public static void J(Context context) {
        advr.d(x, "synchronously initialize RcsFlags", new Object[0]);
        H(context);
    }

    public abstract acpp A();

    public abstract acpp B();

    @Deprecated
    public abstract acpp C();

    public abstract acpp D();

    public apkb F() {
        List list = (List) Collection.EL.stream(G()).map(new acnk(8)).collect(Collectors.toList());
        aozy createBuilder = apkb.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        int L = L();
        apag apagVar = createBuilder.b;
        apkb apkbVar = (apkb) apagVar;
        apkbVar.c = L - 1;
        apkbVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apkb apkbVar2 = (apkb) createBuilder.b;
        apax apaxVar = apkbVar2.e;
        if (!apaxVar.c()) {
            apkbVar2.e = apag.mutableCopy(apaxVar);
        }
        aoyj.addAll(list, apkbVar2.e);
        int hashCode = list.hashCode();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        apkb apkbVar3 = (apkb) apagVar2;
        apkbVar3.b |= 4;
        apkbVar3.f = hashCode;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apkb apkbVar4 = (apkb) createBuilder.b;
        apkbVar4.b = 8 | apkbVar4.b;
        apkbVar4.g = true;
        return (apkb) createBuilder.s();
    }

    public final List G() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(a());
        arrayList.add(c());
        arrayList.add(e());
        arrayList.add(f());
        arrayList.add(h());
        arrayList.add(i());
        arrayList.add(j());
        arrayList.add(k());
        arrayList.add(l());
        arrayList.add(m());
        arrayList.add(n());
        arrayList.add(p());
        arrayList.add(B());
        arrayList.add(q());
        arrayList.add(s());
        arrayList.add(r());
        arrayList.add(t());
        arrayList.add(u());
        arrayList.add(w());
        arrayList.add(z());
        arrayList.add(A());
        arrayList.add(D());
        arrayList.add(C());
        arrayList.add(d());
        arrayList.add(b());
        arrayList.add(x());
        arrayList.add(g());
        arrayList.add(y());
        arrayList.add(v());
        arrayList.add(o());
        return arrayList;
    }

    public abstract boolean K();

    public abstract int L();

    @Deprecated
    public abstract acpp a();

    @Deprecated
    public abstract acpp b();

    public abstract acpp c();

    @Deprecated
    public abstract acpp d();

    public abstract acpp e();

    public abstract acpp f();

    @Deprecated
    public abstract acpp g();

    public abstract acpp h();

    public abstract acpp i();

    @Deprecated
    public abstract acpp j();

    public abstract acpp k();

    public abstract acpp l();

    @Deprecated
    public abstract acpp m();

    @Deprecated
    public abstract acpp n();

    @Deprecated
    public abstract acpp o();

    public abstract acpp p();

    @Deprecated
    public abstract acpp q();

    public abstract acpp r();

    public abstract acpp s();

    public abstract acpp t();

    public abstract acpp u();

    @Deprecated
    public abstract acpp v();

    public abstract acpp w();

    @Deprecated
    public abstract acpp x();

    @Deprecated
    public abstract acpp y();

    public abstract acpp z();
}
