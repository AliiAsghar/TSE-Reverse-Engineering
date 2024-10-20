package defpackage;

import android.os.Parcel;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import j$.util.Objects;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agye implements agyb {
    private static final int c = agyi.values().length;
    public final String a;
    public final Class b;
    private volatile agyg d;
    private final Object[] e;
    private boolean[] f;
    private Map g;

    public agye(String str, Class cls) {
        this.a = str;
        this.b = cls;
        this.e = (Object[]) Array.newInstance((Class<?>) cls, c);
    }

    private final synchronized agyg j() {
        int i = c;
        while (true) {
            i--;
            if (i >= 0) {
                Object obj = this.e[i];
                if (obj != null && !m(i)) {
                    return new agyg(obj, i);
                }
            } else {
                return null;
            }
        }
    }

    private static Object k(Object obj) {
        if (obj instanceof byte[]) {
            return amcn.e.j((byte[]) obj);
        }
        return obj;
    }

    private final void l() {
        if (ahaw.a && this.d == null) {
            throw new IllegalStateException("Flag: " + this.a + " is invalid.");
        }
    }

    private final synchronized boolean m(int i) {
        boolean[] zArr = this.f;
        if (zArr != null) {
            if (zArr[i]) {
                return true;
            }
        }
        return false;
    }

    private static boolean n(int i) {
        if (i != 3 && i != 2) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0029, code lost:
    
        if (n(r1) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized boolean o() {
        /*
            r4 = this;
            monitor-enter(r4)
            agyg r0 = r4.d     // Catch: java.lang.Throwable -> L34
            agyg r1 = r4.j()     // Catch: java.lang.Throwable -> L34
            r4.d = r1     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L31
            if (r1 == 0) goto L31
            java.lang.Object r2 = r1.a     // Catch: java.lang.Throwable -> L34
            java.lang.Object r3 = r0.a     // Catch: java.lang.Throwable -> L34
            boolean r2 = j$.util.Objects.deepEquals(r3, r2)     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto L18
            goto L2b
        L18:
            int r0 = r0.b     // Catch: java.lang.Throwable -> L34
            int r1 = r1.b     // Catch: java.lang.Throwable -> L34
            if (r0 != r1) goto L1f
            goto L31
        L1f:
            boolean r0 = n(r0)     // Catch: java.lang.Throwable -> L34
            if (r0 != 0) goto L2b
            boolean r0 = n(r1)     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L31
        L2b:
            r4.e()     // Catch: java.lang.Throwable -> L34
            monitor-exit(r4)
            r0 = 1
            return r0
        L31:
            monitor-exit(r4)
            r0 = 0
            return r0
        L34:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L34
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agye.o():boolean");
    }

    @Override // defpackage.agyb
    public final synchronized Object a(agyi agyiVar, boolean z) {
        if (z) {
            if (m(agyiVar.g)) {
                return null;
            }
        }
        return this.e[agyiVar.g];
    }

    @Override // defpackage.agyb
    public final Object b() {
        agyg agygVar = this.d;
        if (agygVar != null) {
            return agygVar.a;
        }
        throw new IllegalStateException("Invalid flag: ".concat(toString()));
    }

    @Override // defpackage.agyb
    public final synchronized void c(agya agyaVar) {
        f(agyaVar, agtz.b);
    }

    @Override // defpackage.agyb
    public final synchronized void d(agya agyaVar) {
        l();
        Map map = this.g;
        if (map != null) {
            map.remove(agyaVar);
            if (this.g.isEmpty()) {
                this.g = null;
            }
        }
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    final synchronized void e() {
        Map map = this.g;
        if (map != null) {
            Set entrySet = map.entrySet();
            alpu alpuVar = new alpu();
            Iterator it = entrySet.iterator();
            while (it.hasNext()) {
                alpuVar.h((Map.Entry) it.next());
            }
            alpx p = alpuVar.a().p();
            aluq listIterator = p.u().listIterator();
            while (listIterator.hasNext()) {
                Executor executor = (Executor) listIterator.next();
                executor.execute(new agqd(p.b(executor), 8));
            }
        }
    }

    public final synchronized void f(agya agyaVar, Executor executor) {
        l();
        if (this.g == null) {
            this.g = new WeakHashMap();
        }
        this.g.put(agyaVar, executor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void g(agyi agyiVar) {
        if (agyiVar != agyi.DEFAULT) {
            if (this.f == null) {
                this.f = new boolean[c];
            }
            boolean[] zArr = this.f;
            int i = agyiVar.g;
            zArr[i] = true;
            if (this.e[i] != null && zArr != null) {
                o();
                return;
            }
            return;
        }
        throw new IllegalStateException("Ignoring default value is disallowed [" + this.a + "].");
    }

    public final synchronized void h(agyi agyiVar, Object obj) {
        if (agyiVar == agyi.DEFAULT) {
            i(obj);
        } else {
            this.e[agyiVar.g] = obj;
            o();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void i(Object obj) {
        int i = agyi.DEFAULT.g;
        Object[] objArr = this.e;
        Object obj2 = objArr[i];
        if (obj2 != null) {
            if (!Objects.deepEquals(obj2, obj)) {
                throw new IllegalStateException("Resetting default value is disallowed [" + this.a + "].");
            }
            throw new IllegalStateException("Flag [" + this.a + "] was already created.");
        }
        objArr[i] = obj;
        o();
    }

    public final synchronized String toString() {
        algv algvVar;
        Object obj;
        String simpleName = this.b.getSimpleName();
        agyg agygVar = this.d;
        algvVar = new algv(this.a);
        algvVar.b(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, simpleName);
        if (agygVar != null) {
            obj = k(agygVar.a);
        } else {
            obj = null;
        }
        algvVar.b("finalValue", obj);
        for (agyi agyiVar : agyi.values()) {
            Object a = a(agyiVar, true);
            if (a != null) {
                algvVar.b(agyiVar.name(), k(a));
            }
        }
        return algvVar.toString();
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
