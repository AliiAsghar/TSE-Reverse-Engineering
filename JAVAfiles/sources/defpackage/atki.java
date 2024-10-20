package defpackage;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atki {
    public atke a;
    public int b;
    public int c;

    public atki() {
        this(null);
    }

    public static int a(long j, long j2) {
        if (j2 >= 0 && j2 < j) {
            j = j2;
        }
        long currentTimeMillis = (System.currentTimeMillis() / 1000) + j;
        if (currentTimeMillis >= 0 && currentTimeMillis <= 2147483647L) {
            return (int) currentTimeMillis;
        }
        return Integer.MAX_VALUE;
    }

    public static void f(atmu atmuVar, Set set) {
        if (atmuVar.h().hr() != null) {
            Iterator f = atmuVar.f();
            while (f.hasNext()) {
                atmk hr = ((atmx) f.next()).hr();
                if (hr != null) {
                    set.add(hr);
                }
            }
        }
    }

    public static final int g(int i, boolean z) {
        if (i != 1 && i != 2) {
            return 1;
        }
        if (z) {
            return 4;
        }
        return 3;
    }

    private final synchronized Object h(atmk atmkVar) {
        return this.a.get(atmkVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x002a, code lost:
    
        if (r2.c() != r7) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized defpackage.atkg i(defpackage.atmk r5, java.lang.Object r6, int r7, int r8) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 255(0xff, float:3.57E-43)
            if (r7 == r0) goto L47
            boolean r0 = r6 instanceof java.util.List     // Catch: java.lang.Throwable -> L45
            r1 = 0
            if (r0 == 0) goto L23
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L45
            r0 = 0
        Ld:
            int r2 = r6.size()     // Catch: java.lang.Throwable -> L45
            if (r0 >= r2) goto L2c
            java.lang.Object r2 = r6.get(r0)     // Catch: java.lang.Throwable -> L45
            atkg r2 = (defpackage.atkg) r2     // Catch: java.lang.Throwable -> L45
            int r3 = r2.c()     // Catch: java.lang.Throwable -> L45
            if (r3 != r7) goto L20
            goto L2d
        L20:
            int r0 = r0 + 1
            goto Ld
        L23:
            r2 = r6
            atkg r2 = (defpackage.atkg) r2     // Catch: java.lang.Throwable -> L45
            int r6 = r2.c()     // Catch: java.lang.Throwable -> L45
            if (r6 == r7) goto L2d
        L2c:
            r2 = r1
        L2d:
            if (r2 != 0) goto L31
            monitor-exit(r4)
            return r1
        L31:
            boolean r6 = r2.b()     // Catch: java.lang.Throwable -> L45
            if (r6 == 0) goto L3c
            r4.k(r5, r7)     // Catch: java.lang.Throwable -> L45
            monitor-exit(r4)
            return r1
        L3c:
            int r5 = r2.a(r8)     // Catch: java.lang.Throwable -> L45
            monitor-exit(r4)
            if (r5 >= 0) goto L44
            return r1
        L44:
            return r2
        L45:
            r5 = move-exception
            goto L4f
        L47:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L45
            java.lang.String r6 = "oneElement(ANY)"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L45
            throw r5     // Catch: java.lang.Throwable -> L45
        L4f:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L45
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atki.i(atmk, java.lang.Object, int, int):atkg");
    }

    private final synchronized void j(atmk atmkVar, atkg atkgVar) {
        Object obj = this.a.get(atmkVar);
        if (obj == null) {
            this.a.put(atmkVar, atkgVar);
            return;
        }
        int c = atkgVar.c();
        if (obj instanceof List) {
            List list = (List) obj;
            for (int i = 0; i < list.size(); i++) {
                if (((atkg) list.get(i)).c() == c) {
                    list.set(i, atkgVar);
                    return;
                }
            }
            list.add(atkgVar);
            return;
        }
        atkg atkgVar2 = (atkg) obj;
        if (atkgVar2.c() == c) {
            this.a.put(atmkVar, atkgVar);
            return;
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(atkgVar2);
        linkedList.add(atkgVar);
        this.a.put(atmkVar, linkedList);
    }

    private final synchronized void k(atmk atmkVar, int i) {
        Object obj = this.a.get(atmkVar);
        if (obj != null) {
            if (obj instanceof List) {
                List list = (List) obj;
                int i2 = 0;
                while (true) {
                    if (i2 >= list.size()) {
                        break;
                    }
                    if (((atkg) list.get(i2)).c() == i) {
                        list.remove(i2);
                        if (list.size() == 0) {
                            this.a.remove(atmkVar);
                            return;
                        }
                    } else {
                        i2++;
                    }
                }
            } else if (((atkg) obj).c() == i) {
                this.a.remove(atmkVar);
            }
        }
    }

    private final synchronized atkg[] l(Object obj) {
        if (obj instanceof List) {
            List list = (List) obj;
            return (atkg[]) list.toArray(new atkg[list.size()]);
        }
        return new atkg[]{(atkg) obj};
    }

    private final synchronized atkg m(atmk atmkVar, int i) {
        Object h = h(atmkVar);
        if (h == null) {
            return null;
        }
        return i(atmkVar, h, i, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00dc, code lost:
    
        if (i(r5, r8, 0, r20) == null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e1, code lost:
    
        return defpackage.atnj.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0096, code lost:
    
        return new defpackage.atnj(2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized defpackage.atnj b(defpackage.atmk r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atki.b(atmk, int, int):atnj");
    }

    public final synchronized void c(atmk atmkVar, int i, atne atneVar, int i2) {
        long j;
        if (atneVar != null) {
            try {
                j = atneVar.i;
            } catch (Throwable th) {
                throw th;
            }
        } else {
            j = 0;
        }
        atkg m = m(atmkVar, i);
        if (j == 0) {
            if (m != null && m.a(i2) <= 0) {
                k(atmkVar, i);
            }
        } else {
            if (m == null || m.a(i2) <= 0) {
                m = null;
            }
            if (m == null) {
                j(atmkVar, new atkh(atmkVar, i, atneVar, i2, this.b));
            }
        }
    }

    public final synchronized void d(atmu atmuVar, int i) {
        atkf atkfVar;
        long e = atmuVar.e();
        atmk g = atmuVar.g();
        int c = atmuVar.c();
        atkg m = m(g, c);
        if (e == 0) {
            if (m != null && m.a(i) <= 0) {
                k(g, c);
            }
        } else {
            if (m == null || m.a(i) <= 0) {
                m = null;
            }
            if (m == null) {
                if (atmuVar instanceof atkf) {
                    atkfVar = (atkf) atmuVar;
                } else {
                    atkfVar = new atkf(atmuVar, i, this.c);
                }
                j(g, atkfVar);
            }
        }
    }

    public final synchronized void e() {
        this.a.clear();
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        synchronized (this) {
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                for (atkg atkgVar : l(it.next())) {
                    stringBuffer.append(atkgVar);
                    stringBuffer.append("\n");
                }
            }
        }
        return stringBuffer.toString();
    }

    public atki(byte[] bArr) {
        this.b = -1;
        this.c = -1;
        this.a = new atke();
    }
}
