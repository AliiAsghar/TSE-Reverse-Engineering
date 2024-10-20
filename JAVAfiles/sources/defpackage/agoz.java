package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.aglz;
import defpackage.agmh;
import defpackage.agmq;
import defpackage.agnc;
import defpackage.agoz;
import defpackage.agpc;
import j$.util.Collection;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class agoz<C extends agmq<C, Q, B, D, RT>, Q extends agoz<C, Q, B, D, RT>, B extends agpc<C, Q, B, D, RT>, D extends aglz<C, Q, B, D, RT>, RT extends agmh<RT>> implements agpj {
    public static final ThreadLocal a = new agos();
    protected static final Pattern b = Pattern.compile("%([a-zA-Z_][a-zA-Z_0-9]+)%");
    public static final alvi c = alvi.m("com/google/android/libraries/databaseannotations/support/QueryBase");
    public static final Level d = Level.FINEST;
    public final agpf e;
    protected final Map f;
    protected final Supplier g;
    public final Supplier h;
    public final String[] i;
    public final String j;
    public final String k;
    public final List l = new CopyOnWriteArrayList();
    public adwp m;
    public final akkw n;
    private final List o;
    private final String[] p;
    private final String q;
    private final String r;
    private final String s;
    private final String t;
    private adwp u;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    public agoz(agpf agpfVar) {
        this.e = agpfVar;
        akkw akkwVar = new akkw(agpo.b(), agpfVar, I());
        this.n = akkwVar;
        this.f = ((agnc.a) akec.w(agnc.b, agnc.a.class)).Ld();
        agmt agmtVar = agnc.c;
        this.g = agmtVar.k;
        this.h = agmtVar.i;
        ac(akkwVar, new HashSet());
        this.i = N(agpo.b());
        String f = f(agpfVar.l);
        this.r = f;
        String f2 = f(agpfVar.k);
        this.s = f2;
        this.t = f(agpfVar.j);
        this.k = f(agpfVar.a);
        if (!TextUtils.isEmpty(f) && !TextUtils.isEmpty(f2)) {
            this.j = f + ", " + f2;
        } else if (!TextUtils.isEmpty(f2)) {
            this.j = f2;
        } else if (TextUtils.isEmpty(f)) {
            this.j = null;
        } else {
            throw new IllegalStateException("offset requires limit");
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        if (!agpfVar.n.isEmpty()) {
            O(sb, C(arrayList));
        } else {
            sb.append(C(arrayList));
        }
        if (!TextUtils.isEmpty(null)) {
            sb.append(" ORDER BY ");
            sb.append(agnc.l(f(null)));
        }
        agni agniVar = agpfVar.r;
        if (agniVar != null && !agniVar.b() && agnc.c.d()) {
            String agniVar2 = agniVar.toString();
            agniVar2 = agniVar2.startsWith("+") ? agniVar2.substring(1) : agniVar2;
            sb.append("/* ");
            sb.append(agniVar2);
            sb.append(" */");
        }
        this.q = sb.toString();
        this.p = (String[]) arrayList.toArray(new String[0]);
        ArrayList arrayList2 = new ArrayList();
        this.o = arrayList2;
        alog alogVar = agpfVar.f;
        alog alogVar2 = agpfVar.p;
        if (alogVar != null) {
            arrayList2.addAll(alogVar);
        }
        int i = ((alsx) alogVar2).c;
        for (int i2 = 0; i2 < i; i2++) {
            alog alogVar3 = ((agoa) alogVar2.get(i2)).a.e.f;
            if (alogVar3 != null) {
                arrayList2.addAll(alogVar3);
            }
        }
    }

    protected static final void O(StringBuilder sb, String str) {
        sb.append("SELECT * FROM (");
        sb.append(str);
        sb.append(")");
    }

    public static String R(String str) {
        if (str.length() <= 25) {
            return str;
        }
        return str.substring(0, 25);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void W(agpo agpoVar, boolean z, List list, StringBuilder sb) {
        String d2;
        if (z) {
            d2 = y(agpoVar);
        } else {
            algs algsVar = new algs(" AND ");
            agpf agpfVar = this.e;
            d2 = algsVar.d(alzz.as(agpfVar.h, new abdo(agpoVar, list, 8)));
        }
        agpoVar.c();
        if (!d2.isEmpty()) {
            if (sb.length() > 0) {
                sb.append(" AND ");
            }
            sb.append(d2);
        }
        alog i = this.n.i();
        int i2 = ((alsx) i).c;
        for (int i3 = 0; i3 < i2; i3++) {
            ((agoa) i.get(i3)).a.W(agpoVar, z, list, sb);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void X(agpo agpoVar, AtomicReference atomicReference) {
        if (!TextUtils.isEmpty(this.t) && !TextUtils.isEmpty(this.t) && atomicReference.getAndSet(akkw.g(agpoVar.a).apply(this.t)) != null) {
            throw new IllegalArgumentException("multiple group bys");
        }
        alog i = this.n.i();
        int i2 = ((alsx) i).c;
        for (int i3 = 0; i3 < i2; i3++) {
            agoa agoaVar = (agoa) i.get(i3);
            agpoVar.a++;
            agoaVar.a.X(agpoVar, atomicReference);
        }
    }

    private final void Y() {
        if (this.i.length == 0 && this.o.isEmpty()) {
            throw new IllegalStateException("need at least one column in projection");
        }
    }

    private final boolean Z(agmc agmcVar) {
        for (Pair pair : this.l) {
            if (pair.first == agmcVar) {
                ((alvg) c.a(d).h("com/google/android/libraries/databaseannotations/support/QueryBase", "incrementExistingListener", 797, "QueryBase.java")).B("addChangeListener: %s %s (INCREMENT <<<<<<)", R(this.e.a), agmcVar.d);
                ((AtomicInteger) pair.second).incrementAndGet();
                return true;
            }
        }
        return false;
    }

    private static final Cursor aa(agnw agnwVar, String str, String[] strArr, agpf agpfVar) {
        return agnwVar.h(str, strArr, agpfVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ab(akkw akkwVar, agpo agpoVar, List list) {
        alog i = this.n.i();
        int i2 = ((alsx) i).c;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            agoa agoaVar = (agoa) i.get(i4);
            agpoVar.c();
            if (!agpoVar.d) {
                if (akkwVar.b) {
                    Object apply = agpoVar.a().apply(agoaVar.a.k);
                    list.add("COUNT(" + ((String) apply) + ".rowid) AS " + agoaVar.e + "_count");
                    Object apply2 = agpoVar.a().apply(agoaVar.a.k);
                    list.add("group_concat(quote(" + ((String) apply2) + ".rowid), '|') AS " + agoaVar.e + "_rowid");
                } else {
                    list.add("1 AS " + agoaVar.e + "_count");
                    Object apply3 = agpoVar.a().apply(agoaVar.a.k);
                    list.add(((String) apply3) + ".rowid AS " + agoaVar.e + "_rowid");
                }
            }
            agoaVar.h = list.size() - 2;
            list.addAll((Collection) Collection.EL.stream(agoaVar.a.D(agpoVar)).map(new agoq(akkwVar, 1)).map(new agoq(this, i3)).collect(Collectors.toCollection(new agmr(10))));
            agoaVar.a.ab(akkwVar, agpoVar, list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void ac(akkw akkwVar, Set set) {
        alog i = akkwVar.i();
        int i2 = ((alsx) i).c;
        for (int i3 = 0; i3 < i2; i3++) {
            agoa agoaVar = (agoa) i.get(i3);
            if (!set.contains(agoaVar.e)) {
                set.add(agoaVar.e);
                ac(agoaVar.a.n, set);
            } else {
                throw new IllegalArgumentException("duplicate tag: ".concat(String.valueOf(agoaVar.e)));
            }
        }
    }

    private final String f(String str) {
        alor alorVar;
        if (str != null && (alorVar = this.e.o) != null && !alorVar.isEmpty()) {
            Matcher matcher = b.matcher(str);
            if (matcher.find()) {
                StringBuffer stringBuffer = new StringBuffer();
                do {
                    String group = matcher.group(1);
                    String str2 = (String) alorVar.get(group);
                    if (str2 == null && !alorVar.containsKey(group)) {
                        throw new IllegalStateException("no substitution for ".concat(String.valueOf(group)));
                    }
                    if (str2 == null) {
                        str2 = "0";
                    }
                    matcher.appendReplacement(stringBuffer, str2);
                } while (matcher.find());
                matcher.appendTail(stringBuffer);
                return stringBuffer.toString();
            }
            return str;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List h(agpo agpoVar, List list, boolean z, List list2) {
        alog alogVar = this.e.f;
        if (alogVar != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            alur it = alogVar.iterator();
            while (it.hasNext()) {
                arrayList.add(((agpj) it.next()).ad(agpoVar));
            }
            list = arrayList;
        }
        alog i = this.n.i();
        int i2 = ((alsx) i).c;
        for (int i3 = 0; i3 < i2; i3++) {
            list = ((agoa) i.get(i3)).a.h(agpoVar, list, z, list2);
        }
        return list;
    }

    public static Object x(Supplier supplier) {
        Object obj;
        agoy agoyVar = new agoy();
        try {
            obj = supplier.get();
            agoyVar.close();
            return obj;
        } catch (Throwable th) {
            try {
                agoyVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    final String A(agpo agpoVar, boolean z, List list, alog alogVar) {
        String bW;
        StringBuilder sb = new StringBuilder();
        agpoVar.a = 0;
        W(agpoVar, z, list, sb);
        int length = sb.length();
        if (!TextUtils.isEmpty(this.e.g)) {
            if (length != 0) {
                sb.append(" AND ");
            }
            sb.append("(");
            sb.append(this.e.g);
            sb.append(")");
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(d()));
        arrayList.add(this.k);
        int size = arrayList.size();
        agpoVar.a = 0;
        arrayList.addAll(this.n.a);
        int size2 = arrayList.size();
        for (int i = 0; i < size2; i++) {
            String str = (String) arrayList.get(i);
            size--;
            if (size < 0) {
                agpoVar.c();
            }
            if (!this.e.m.booleanValue() && this.f.containsKey(str)) {
                if (sb.length() != 0) {
                    sb.append(" AND ");
                }
                sb.append("(");
                sb.append(uzz.e().a(agpoVar));
                sb.append(")");
            }
        }
        if (sb.length() == 0) {
            sb.append("1");
        }
        String f = f(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT ");
        if (this.e.b) {
            sb2.append("DISTINCT ");
        }
        new algs(",").h(sb2, alogVar);
        sb2.append(" FROM ");
        sb2.append(this.k);
        if (this.e.e != null) {
            sb2.append(" INDEXED BY ");
            sb2.append(this.e.e);
        }
        if (this.e.t != null) {
            sb2.append(" AS ");
            sb2.append(this.e.t);
        }
        sb2.append(" ");
        agpoVar.a = 1;
        agox g = akkw.g(0);
        akkw akkwVar = this.n;
        V(agpoVar, sb2, g, akkwVar, akkwVar.i());
        if (!TextUtils.isEmpty(f)) {
            sb2.append("WHERE ");
            sb2.append(f(f));
            sb2.append(" ");
        }
        agpoVar.a = 0;
        String str2 = null;
        AtomicReference atomicReference = new AtomicReference(null);
        X(agpoVar, atomicReference);
        String str3 = (String) atomicReference.get();
        if (str3 == null) {
            bW = "";
        } else {
            bW = a.bW(str3, "GROUP BY ", " ");
        }
        sb2.append(bW);
        agpj agpjVar = this.e.i;
        if (agpjVar != null) {
            str2 = f(agpjVar.ad(agpoVar));
        }
        if (!TextUtils.isEmpty(str2)) {
            sb2.append("ORDER BY ");
            sb2.append(str2);
            sb2.append(" ");
        }
        if (!TextUtils.isEmpty(this.s)) {
            sb2.append("LIMIT ");
            sb2.append(this.s);
            sb2.append(" ");
        }
        String str4 = this.e.l;
        if (!TextUtils.isEmpty(str4)) {
            sb2.append("OFFSET ");
            sb2.append(str4);
            sb2.append(" ");
        }
        alog alogVar2 = this.e.n;
        if (!alogVar2.isEmpty()) {
            int length2 = this.i.length;
            String sb3 = sb2.toString();
            sb2.setLength(0);
            O(sb2, sb3);
            int i2 = ((alsx) alogVar2).c;
            for (int i3 = 0; i3 < i2; i3++) {
                agoz agozVar = (agoz) alogVar2.get(i3);
                if (agozVar.N(agpoVar).length == length2) {
                    sb2.append(" UNION ");
                    O(sb2, agozVar.z(agpoVar, z, list));
                } else {
                    throw new IllegalStateException("all queries in union must have the same size projection");
                }
            }
        }
        return sb2.toString().trim();
    }

    public final String B() {
        return z(new agpo(this.n, this.e, false), true, null);
    }

    public final String C(List list) {
        return z(new agpo(this.n, this.e, false), false, list);
    }

    final List D(agpo agpoVar) {
        Object qqvVar;
        agpf agpfVar = this.e;
        boolean z = agpfVar.s;
        boolean L = L();
        if (z) {
            return new ArrayList();
        }
        alog alogVar = agpfVar.d;
        if (alogVar == null || alogVar.isEmpty()) {
            alogVar = this.e.c;
        }
        Stream stream = Collection.EL.stream(alogVar);
        int i = agpoVar.a;
        int i2 = 10;
        if (i == 0) {
            qqvVar = new agnz(3);
        } else {
            qqvVar = new qqv(i, i2);
        }
        return (List) stream.map(qqvVar).map(new lcg(L, 6)).collect(Collectors.toCollection(new agmr(i2)));
    }

    public final void E(agmc agmcVar) {
        Object obj;
        Object obj2;
        synchronized (agnc.a) {
            if (Z(agmcVar)) {
                return;
            }
            ((alvg) c.a(d).h("com/google/android/libraries/databaseannotations/support/QueryBase", "addChangeListener", 753, "QueryBase.java")).B("addChangeListener: %s %s", R(this.e.a), agmcVar.d);
            this.l.add(Pair.create(agmcVar, new AtomicInteger(1)));
            aglo.o(this);
            agmt agmtVar = agnc.c;
            if (agmtVar.e() && !agmtVar.b() && agmcVar.e != null) {
                aefw aefwVar = new aefw(this, 20);
                obj = this.g.get();
                akul g = akul.g(albo.bL(aefwVar, (Executor) obj));
                abdo abdoVar = new abdo(this, agmcVar, 9, null);
                obj2 = this.g.get();
                g.h(abdoVar, (Executor) obj2);
            }
        }
    }

    public final void F(enh enhVar, agmc agmcVar) {
        synchronized (agnc.a) {
            if (Z(agmcVar)) {
                return;
            }
            ((alvg) c.a(d).h("com/google/android/libraries/databaseannotations/support/QueryBase", "addChangeListener", 827, "QueryBase.java")).B("addChangeListener: %s %s (LIFECYCLE)", R(this.e.a), agmcVar.d);
            this.l.add(Pair.create(agmcVar, new AtomicInteger(0)));
            aglo.u().m(this);
            if (enhVar != null) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    enhVar.c(new agot(this, agmcVar));
                } else {
                    throw new IllegalStateException("cannot add observable query with lifecycle from other than main thread");
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.Set, java.lang.Object] */
    public final void G(agmc agmcVar) {
        synchronized (agnc.a) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.l.size()) {
                    break;
                }
                Pair pair = (Pair) this.l.get(i);
                if (pair.first == agmcVar && ((AtomicInteger) pair.second).decrementAndGet() == 0) {
                    this.l.remove(i);
                    z = true;
                    break;
                }
                i++;
            }
            ((alvg) c.a(d).h("com/google/android/libraries/databaseannotations/support/QueryBase", "removeChangeListener", 861, "QueryBase.java")).B("removeChangeListener: %s %s", R(this.e.a), agmcVar.d);
            if (z && this.l.isEmpty()) {
                adwp u = aglo.u();
                synchronized (agnc.a) {
                    u.a.remove(this);
                }
            }
        }
    }

    public final boolean H(String str) {
        return T().p(str, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final boolean I() {
        agpf agpfVar = this.e;
        if (agpfVar.j != null) {
            return true;
        }
        alog alogVar = agpfVar.p;
        if (alogVar != null) {
            int i = 0;
            while (i < ((alsx) alogVar).c) {
                boolean I = ((agoa) alogVar.get(i)).a.I();
                i++;
                if (I) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean J(List list) {
        int i;
        agxw S = S();
        int i2 = 0;
        while (true) {
            alog alogVar = this.e.h;
            if (i2 >= ((alsx) alogVar).c) {
                return false;
            }
            agpw agpwVar = (agpw) alogVar.get(i2);
            Iterator it = list.iterator();
            while (true) {
                i = i2 + 1;
                if (it.hasNext()) {
                    Iterator it2 = ((agpw) it.next()).a.iterator();
                    while (it2.hasNext()) {
                        if (agpwVar.e(S, (agpy) it2.next())) {
                            return true;
                        }
                    }
                }
            }
            i2 = i;
        }
    }

    public final boolean K() {
        ArrayList arrayList = new ArrayList();
        agnw p = p();
        String str = "SELECT EXISTS (" + C(arrayList) + ")";
        boolean z = false;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        agpe agpeVar = new agpe(this.e);
        agpeVar.t = new ynw(this, 18);
        Cursor aa = aa(p, str, strArr, agpeVar.b());
        try {
            if (aa.moveToFirst()) {
                if (aa.getInt(0) == 1) {
                    z = true;
                }
                if (aa != null) {
                    aa.close();
                }
                return z;
            }
            throw new agpi("got cursor with no rows");
        } catch (Throwable th) {
            if (aa != null) {
                try {
                    aa.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final boolean L() {
        return this.e.w;
    }

    public final boolean M() {
        ArrayList arrayList = new ArrayList();
        agnw p = p();
        String str = "SELECT EXISTS (" + C(arrayList) + ")";
        boolean z = false;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        agpe agpeVar = new agpe(this.e);
        agpeVar.t = new ynw(this, 18);
        Cursor aa = aa(p, str, strArr, agpeVar.b());
        try {
            if (aa.moveToFirst()) {
                if (aa.getInt(0) == 0) {
                    z = true;
                }
                if (aa != null) {
                    aa.close();
                }
                return z;
            }
            throw new agpi("got cursor with no rows which should be impossible");
        } catch (Throwable th) {
            if (aa != null) {
                try {
                    aa.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final String[] N(agpo agpoVar) {
        agpoVar.a = 0;
        List D = D(agpoVar);
        agpoVar.a = 0;
        ab(this.n, agpoVar, D);
        String[] strArr = (String[]) D.toArray(new String[0]);
        if (agpoVar.b.w) {
            Object obj = agnc.a;
            String[] strArr2 = new String[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                strArr2[i] = agnc.k(strArr[i]);
            }
            return strArr2;
        }
        return strArr;
    }

    public final alog P() {
        alog alogVar;
        agpf agpfVar = this.e;
        if (agpfVar.s) {
            int i = alog.d;
            alogVar = alsx.a;
        } else {
            alogVar = agpfVar.d;
        }
        if (alogVar == null || alogVar.isEmpty()) {
            agpf agpfVar2 = this.e;
            if (!agpfVar2.s) {
                return agpfVar2.c;
            }
            return alogVar;
        }
        return alogVar;
    }

    protected final agxw S() {
        return new agxw(a());
    }

    public final adwp T() {
        if (this.m == null) {
            adwp adwpVar = new adwp((byte[]) null);
            af(adwpVar);
            this.m = adwpVar;
        }
        return this.m;
    }

    public final adwp U() {
        if (this.u == null) {
            adwp adwpVar = new adwp((byte[]) null);
            Collection.EL.stream(this.e.h).forEach(new adoj(adwpVar, 19));
            this.u = adwpVar;
        }
        return this.u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void V(agpo agpoVar, StringBuilder sb, agox agoxVar, akkw akkwVar, alog alogVar) {
        String str;
        Object apply;
        boolean z;
        for (int i = 0; i < ((alsx) alogVar).c; i++) {
            agoa agoaVar = (agoa) alogVar.get(i);
            String str2 = agoaVar.a.k;
            agox g = akkw.g(agpoVar.a);
            akkwVar.k(agoaVar.e);
            int i2 = agoaVar.i;
            Object obj = agnc.a;
            int i3 = i2 - 1;
            boolean z2 = true;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        str = "JOIN";
                    } else {
                        str = "INNER JOIN";
                    }
                } else {
                    str = "LEFT OUTER JOIN";
                }
            } else {
                str = "LEFT JOIN";
            }
            sb.append(str);
            sb.append(" ");
            sb.append(str2);
            sb.append(" AS ");
            sb.append((String) g.apply(str2));
            sb.append(" ");
            agmh agmhVar = agoaVar.b;
            Object obj2 = null;
            if (agmhVar == null) {
                apply = null;
            } else {
                apply = g.apply(agmhVar.toString());
            }
            agmh agmhVar2 = agoaVar.c;
            if (agmhVar2 != null) {
                obj2 = agoxVar.apply(agmhVar2.toString());
            }
            if (apply != null && obj2 != null) {
                z = true;
            } else {
                z = false;
            }
            if (agoaVar.g == null) {
                z2 = false;
            }
            if (z || z2) {
                sb.append("ON (");
            }
            if (z) {
                sb.append("(");
                sb.append((String) apply);
                sb.append(" ");
                sb.append(agoaVar.d);
                sb.append(" ");
                sb.append((String) obj2);
                sb.append(")");
            }
            if (z2) {
                if (z) {
                    sb.append(" AND ");
                }
                sb.append("(");
                sb.append(agoaVar.g.a(agpoVar));
                sb.append(") ");
            }
            if (z || z2) {
                sb.append(") ");
            }
            agpoVar.c();
            V(agpoVar, sb, g, akkwVar, agoaVar.a.n.i());
        }
    }

    protected abstract Map a();

    @Override // defpackage.agpj
    public final String ad(agpo agpoVar) {
        return "(" + B() + ")";
    }

    @Override // defpackage.agpj
    public final String ae(agpo agpoVar, List list) {
        return "(" + C(list) + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.agpj
    public final void af(adwp adwpVar) {
        agpf agpfVar = this.e;
        alog alogVar = agpfVar.d;
        agxw S = S();
        if (alogVar == null) {
            if (agpfVar.s) {
                int i = alog.d;
                alogVar = alsx.a;
            } else {
                alogVar = agpfVar.c;
            }
        }
        int size = alogVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            adwpVar.o(S.b((String) alogVar.get(i2)), this.k);
        }
        alog alogVar2 = this.e.n;
        if (alogVar2 != null) {
            for (int i3 = 0; i3 < ((alsx) alogVar2).c; i3++) {
                ((agoz) alogVar2.get(i3)).af(adwpVar);
            }
        }
        List list = this.o;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((agpj) it.next()).af(adwpVar);
            }
        }
        for (String str : c()) {
            String b2 = S.b(str);
            if (b2 != null) {
                str = b2;
            }
            adwpVar.o(str, this.k);
        }
        agpf agpfVar2 = this.e;
        int i4 = 0;
        while (true) {
            alog alogVar3 = agpfVar2.h;
            if (i4 >= ((alsx) alogVar3).c) {
                break;
            }
            ((agpw) alogVar3.get(i4)).f(adwpVar);
            i4++;
        }
        alog i5 = this.n.i();
        int i6 = ((alsx) i5).c;
        for (int i7 = 0; i7 < i6; i7++) {
            ((agoa) i5.get(i7)).a.af(adwpVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean b();

    protected abstract String[] c();

    protected abstract String[] d();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract agmq e(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar);

    public final int i() {
        ArrayList arrayList = new ArrayList();
        agnw p = p();
        String str = "SELECT COUNT(*) FROM (" + C(arrayList) + ")";
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        agpe agpeVar = new agpe(this.e);
        agpeVar.t = new ynw(this, 18);
        Cursor aa = aa(p, str, strArr, agpeVar.b());
        try {
            if (aa.moveToFirst()) {
                int i = aa.getInt(0);
                if (aa != null) {
                    aa.close();
                }
                return i;
            }
            throw new agpi("got cursor with no rows");
        } catch (Throwable th) {
            if (aa != null) {
                try {
                    aa.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final long j(agmh agmhVar, String str) {
        ArrayList arrayList = new ArrayList();
        String A = A(agpo.b(), false, arrayList, alog.r(String.format(Locale.US, "%s(%s)", str, agnc.l(agmhVar.toString()))));
        agnw p = p();
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        agpe agpeVar = new agpe(this.e);
        agpeVar.t = new ynw(this, 18);
        Cursor aa = aa(p, A, strArr, agpeVar.b());
        try {
            if (aa.moveToFirst()) {
                long j = aa.getLong(0);
                if (aa != null) {
                    aa.close();
                }
                return j;
            }
            throw new agpi("got cursor with no rows");
        } catch (Throwable th) {
            if (aa != null) {
                try {
                    aa.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final long k(agmh agmhVar) {
        return j(agmhVar, "MAX");
    }

    public final long l(agmh agmhVar) {
        return j(agmhVar, "MIN");
    }

    public final agmq m(agmh agmhVar) {
        Y();
        String l = agnc.l(agmhVar.toString());
        if (Arrays.asList(this.i).contains(agmhVar.toString())) {
            agnw p = p();
            String format = String.format(Locale.US, "SELECT %s FROM (%s)", l, this.q);
            String[] strArr = this.p;
            agpe agpeVar = new agpe(this.e);
            agpeVar.r = new agni("queryForSingleColumn-", agmhVar.toString());
            agpeVar.t = new ynw(this, 18);
            return e(p, aa(p, format, strArr, agpeVar.b()), new String[]{agmhVar.toString()}, (agpj[]) this.o.toArray(new agpj[0]), new sab(6), this.n);
        }
        throw new IllegalArgumentException("cannot slice on column which is not part of the projection");
    }

    public final agmq n() {
        agnw p = p();
        Y();
        agpe agpeVar = new agpe(this.e);
        agpeVar.t = new ynw(this, 18);
        agmq e = e(p, aa(p, this.q, this.p, agpeVar.b()), this.i, (agpj[]) this.o.toArray(new agpj[0]), new sab(7), this.n);
        akkw akkwVar = this.n;
        e.dw(akkwVar, akkwVar.i(), I());
        return e;
    }

    public final agmq o(CancellationSignal cancellationSignal) {
        agnw p = p();
        Y();
        agpe agpeVar = new agpe(this.e);
        agpeVar.t = new ynw(this, 18);
        agmq e = e(p, p.i(this.q, this.p, agpeVar.b(), cancellationSignal), this.i, (agpj[]) this.o.toArray(new agpj[0]), new sab(8), this.n);
        akkw akkwVar = this.n;
        e.dw(akkwVar, akkwVar.i(), I());
        return e;
    }

    public final agnw p() {
        return agnc.d(this.e.v);
    }

    public final agog q(agmh agmhVar, agmh agmhVar2, agpw agpwVar) {
        agog b2 = agoh.b(this, agmhVar, agmhVar2);
        b2.e = agpwVar;
        return b2;
    }

    public final agpj r() {
        return new agpk("SELECT COUNT(*) FROM ($R)", new Object[]{B()});
    }

    public final akul s() {
        return akul.g(u(new adpp(this, 4)));
    }

    public final alog t() {
        return n().cR();
    }

    public final ListenableFuture u(Supplier supplier) {
        Object obj;
        akul o = p().o();
        adhe adheVar = new adhe(supplier, 20);
        obj = this.h.get();
        return o.h(adheVar, (Executor) obj);
    }

    public final ListenableFuture v() {
        return u(new adpp(this, 5));
    }

    public final Stream w() {
        return n().cT();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String y(agpo agpoVar) {
        return new algs(" AND ").d(alzz.as(this.e.h, new adhe(agpoVar, 19)));
    }

    public final String z(agpo agpoVar, boolean z, List list) {
        return A(agpoVar, z, list, alog.n(h(agpoVar, Arrays.asList(N(agpoVar)), z, list)));
    }

    public final void Q() {
    }
}
