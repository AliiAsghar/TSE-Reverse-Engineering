package defpackage;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xbill.DNS2.ResolverConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atlr {
    static Class a;
    private static atna e;
    private static atmk[] f;
    private static Map g;
    private static int h;
    public atna b;
    public atki c;
    public int d;
    private atmk[] i;
    private int j;
    private atmk k;
    private int l;
    private boolean m;
    private int n;
    private boolean o;
    private boolean p;
    private boolean q;
    private List r;
    private atmx[] s;
    private int t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    static {
        c();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public atlr(java.lang.String r3, int r4) {
        /*
            r2 = this;
            r0 = 0
            atmk r3 = defpackage.atmk.e(r3, r0)
            r2.<init>()
            defpackage.atnu.b(r4)
            r0 = 1
            defpackage.atkp.b(r0)
            r1 = 41
            if (r4 == r1) goto L17
            switch(r4) {
                case 249: goto L17;
                case 250: goto L17;
                case 251: goto L17;
                case 252: goto L17;
                case 253: goto L17;
                case 254: goto L17;
                case 255: goto L17;
                default: goto L16;
            }
        L16:
            goto L1b
        L17:
            r1 = 255(0xff, float:3.57E-43)
            if (r4 != r1) goto L5f
        L1b:
            r2.k = r3
            r2.l = r4
            r2.d = r0
            java.lang.Class r3 = defpackage.atlr.a
            if (r3 != 0) goto L39
            java.lang.String r3 = "atlr"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L2e
            defpackage.atlr.a = r3
            goto L39
        L2e:
            r3 = move-exception
            java.lang.NoClassDefFoundError r4 = new java.lang.NoClassDefFoundError
            r4.<init>()
            java.lang.Throwable r3 = r4.initCause(r3)
            throw r3
        L39:
            monitor-enter(r3)
            atna r4 = b()     // Catch: java.lang.Throwable -> L5c
            r2.b = r4     // Catch: java.lang.Throwable -> L5c
            atmk[] r4 = d()     // Catch: java.lang.Throwable -> L5c
            r2.i = r4     // Catch: java.lang.Throwable -> L5c
            atki r4 = f()     // Catch: java.lang.Throwable -> L5c
            r2.c = r4     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L5c
            r3 = 3
            r2.j = r3
            java.lang.String r3 = "verbose"
            boolean r3 = defpackage.atmp.a(r3)
            r2.m = r3
            r3 = -1
            r2.t = r3
            return
        L5c:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L5c
            throw r4
        L5f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Cannot query for meta-types other than ANY"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atlr.<init>(java.lang.String, int):void");
    }

    public static synchronized atna b() {
        atna atnaVar;
        synchronized (atlr.class) {
            atnaVar = e;
        }
        return atnaVar;
    }

    public static synchronized void c() {
        synchronized (atlr.class) {
            try {
                e = new atlb();
                f = ResolverConfig.b().c;
                g = new HashMap();
                int i = ResolverConfig.b().d;
                if (i < 0) {
                    i = 1;
                }
                h = i;
            } catch (UnknownHostException unused) {
                throw new RuntimeException("Failed to initialize resolver");
            }
        }
    }

    public static synchronized atmk[] d() {
        atmk[] atmkVarArr;
        synchronized (atlr.class) {
            atmkVarArr = f;
        }
        return atmkVarArr;
    }

    public static synchronized atki f() {
        synchronized (atlr.class) {
            atkp.b(1);
            atki atkiVar = (atki) g.get(atma.b(1));
            if (atkiVar == null) {
                atki atkiVar2 = new atki(null);
                g.put(atma.b(1), atkiVar2);
                return atkiVar2;
            }
            return atkiVar;
        }
    }

    private final void g(atmk atmkVar, atmk atmkVar2) {
        this.o = true;
        this.v = false;
        this.w = false;
        this.x = false;
        this.u = false;
        this.z = false;
        int i = this.n + 1;
        this.n = i;
        if (i < 6 && !atmkVar.equals(atmkVar2)) {
            if (this.r == null) {
                this.r = new ArrayList();
            }
            this.r.add(atmkVar2);
            h(atmkVar);
            return;
        }
        this.t = 1;
        this.p = true;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private final void h(defpackage.atmk r22) {
        /*
            Method dump skipped, instructions count: 667
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atlr.h(atmk):void");
    }

    private final void i(atmk atmkVar, atnj atnjVar) {
        int i = atnjVar.d;
        if (i == 6) {
            List list = (List) atnjVar.e;
            atmu[] atmuVarArr = (atmu[]) list.toArray(new atmu[list.size()]);
            ArrayList arrayList = new ArrayList();
            for (atmu atmuVar : atmuVarArr) {
                Iterator f2 = atmuVar.f();
                while (f2.hasNext()) {
                    arrayList.add(f2.next());
                }
            }
            this.t = 0;
            this.s = (atmx[]) arrayList.toArray(new atmx[arrayList.size()]);
            this.p = true;
            return;
        }
        if (i == 1) {
            this.u = true;
            this.q = true;
            if (this.n > 0) {
                this.t = 3;
                this.p = true;
                return;
            }
            return;
        }
        if (i != 2) {
            if (i == 4) {
                g(((atkd) ((atmu) atnjVar.e).h()).a, atmkVar);
                return;
            }
            if (i == 5) {
                try {
                    g(atmkVar.d((atks) ((atmu) atnjVar.e).h()), atmkVar);
                    return;
                } catch (atml unused) {
                    this.t = 1;
                    this.p = true;
                    return;
                }
            }
            if (i == 3) {
                this.z = true;
                return;
            }
            return;
        }
        this.t = 4;
        this.s = null;
        this.p = true;
    }

    private final void j(atmk atmkVar, atmk atmkVar2) {
        this.q = false;
        if (atmkVar2 != null) {
            try {
                atmkVar = atmk.c(atmkVar, atmkVar2);
            } catch (atml unused) {
                this.y = true;
                return;
            }
        }
        h(atmkVar);
    }

    public final int a() {
        int i;
        if (this.p && (i = this.t) != -1) {
            return i;
        }
        StringBuffer stringBuffer = new StringBuffer("Lookup of ");
        stringBuffer.append(this.k);
        stringBuffer.append(" ");
        StringBuffer stringBuffer2 = new StringBuffer(stringBuffer.toString());
        if (this.d != 1) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(atkp.a(this.d));
            stringBuffer3.append(" ");
            stringBuffer2.append(stringBuffer3.toString());
        }
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append(atnu.a(this.l));
        stringBuffer4.append(" isn't done");
        stringBuffer2.append(stringBuffer4.toString());
        throw new IllegalStateException(stringBuffer2.toString());
    }

    public final atmx[] e() {
        int i = 0;
        if (this.p) {
            this.n = 0;
            this.o = false;
            this.p = false;
            this.q = false;
            this.r = null;
            this.s = null;
            this.t = -1;
            this.u = false;
            this.v = false;
            this.w = false;
            this.x = false;
            this.y = false;
            this.z = false;
        }
        if (this.k.j()) {
            j(this.k, null);
        } else if (this.i == null) {
            j(this.k, atmk.a);
        } else {
            if (this.k.a() > h) {
                j(this.k, atmk.a);
            }
            if (!this.p) {
                while (true) {
                    atmk[] atmkVarArr = this.i;
                    if (i >= atmkVarArr.length) {
                        break;
                    }
                    j(this.k, atmkVarArr[i]);
                    if (!this.p) {
                        if (this.o) {
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
            }
            return this.s;
        }
        if (!this.p) {
            if (this.v || this.x || this.w) {
                this.t = 2;
            } else if (this.u) {
                this.t = 3;
            } else if (this.z || this.y) {
                this.t = 1;
            }
            this.p = true;
        }
        return this.s;
    }
}
