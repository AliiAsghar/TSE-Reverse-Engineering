package defpackage;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aopi extends AbstractMap implements Serializable {
    public static final Comparator a = new mm(17);
    aoph b;
    int c;
    int d;
    final aoph e;
    private final Comparator f;
    private final boolean g;
    private aopd h;
    private aopf i;

    public aopi() {
        this(a, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        if (r10 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005a, code lost:
    
        if (r10 == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void f(defpackage.aoph r9, boolean r10) {
        /*
            r8 = this;
        L0:
            if (r9 == 0) goto L84
            aoph r0 = r9.b
            aoph r1 = r9.c
            r2 = 0
            if (r0 == 0) goto Lc
            int r3 = r0.i
            goto Ld
        Lc:
            r3 = r2
        Ld:
            if (r1 == 0) goto L12
            int r4 = r1.i
            goto L13
        L12:
            r4 = r2
        L13:
            int r5 = r3 - r4
            r6 = -2
            r7 = 1
            if (r5 != r6) goto L42
            aoph r0 = r1.b
            aoph r3 = r1.c
            if (r3 == 0) goto L22
            int r3 = r3.i
            goto L23
        L22:
            r3 = r2
        L23:
            if (r0 == 0) goto L28
            int r0 = r0.i
            goto L29
        L28:
            r0 = r2
        L29:
            int r0 = r0 - r3
            r3 = -1
            if (r0 == r3) goto L3a
            if (r0 != 0) goto L32
            if (r10 != 0) goto L33
            goto L3b
        L32:
            r7 = r10
        L33:
            r8.i(r1)
            r8.h(r9)
            goto L3f
        L3a:
            r2 = r10
        L3b:
            r8.h(r9)
            r7 = r2
        L3f:
            if (r7 != 0) goto L84
            goto L80
        L42:
            r1 = 2
            if (r5 != r1) goto L6d
            aoph r1 = r0.b
            aoph r3 = r0.c
            if (r3 == 0) goto L4e
            int r3 = r3.i
            goto L4f
        L4e:
            r3 = r2
        L4f:
            if (r1 == 0) goto L54
            int r1 = r1.i
            goto L55
        L54:
            r1 = r2
        L55:
            int r1 = r1 - r3
            if (r1 == r7) goto L65
            if (r1 != 0) goto L5d
            if (r10 != 0) goto L5e
            goto L66
        L5d:
            r7 = r10
        L5e:
            r8.h(r0)
            r8.i(r9)
            goto L6a
        L65:
            r2 = r10
        L66:
            r8.i(r9)
            r7 = r2
        L6a:
            if (r7 == 0) goto L80
            goto L84
        L6d:
            if (r5 != 0) goto L76
            int r3 = r3 + 1
            r9.i = r3
            if (r10 == 0) goto L80
            goto L84
        L76:
            int r0 = java.lang.Math.max(r3, r4)
            int r0 = r0 + r7
            r9.i = r0
            if (r10 != 0) goto L80
            goto L84
        L80:
            aoph r9 = r9.a
            goto L0
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aopi.f(aoph, boolean):void");
    }

    private final void g(aoph aophVar, aoph aophVar2) {
        aoph aophVar3 = aophVar.a;
        aophVar.a = null;
        if (aophVar2 != null) {
            aophVar2.a = aophVar3;
        }
        if (aophVar3 != null) {
            if (aophVar3.b == aophVar) {
                aophVar3.b = aophVar2;
                return;
            } else {
                aophVar3.c = aophVar2;
                return;
            }
        }
        this.b = aophVar2;
    }

    private final void h(aoph aophVar) {
        int i;
        int i2;
        aoph aophVar2 = aophVar.b;
        aoph aophVar3 = aophVar.c;
        aoph aophVar4 = aophVar3.b;
        aoph aophVar5 = aophVar3.c;
        aophVar.c = aophVar4;
        if (aophVar4 != null) {
            aophVar4.a = aophVar;
        }
        g(aophVar, aophVar3);
        aophVar3.b = aophVar;
        aophVar.a = aophVar3;
        int i3 = 0;
        if (aophVar2 != null) {
            i = aophVar2.i;
        } else {
            i = 0;
        }
        if (aophVar4 != null) {
            i2 = aophVar4.i;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        aophVar.i = max;
        if (aophVar5 != null) {
            i3 = aophVar5.i;
        }
        aophVar3.i = Math.max(max, i3) + 1;
    }

    private final void i(aoph aophVar) {
        int i;
        int i2;
        aoph aophVar2 = aophVar.b;
        aoph aophVar3 = aophVar.c;
        aoph aophVar4 = aophVar2.b;
        aoph aophVar5 = aophVar2.c;
        aophVar.b = aophVar5;
        if (aophVar5 != null) {
            aophVar5.a = aophVar;
        }
        g(aophVar, aophVar2);
        aophVar2.c = aophVar;
        aophVar.a = aophVar2;
        int i3 = 0;
        if (aophVar3 != null) {
            i = aophVar3.i;
        } else {
            i = 0;
        }
        if (aophVar5 != null) {
            i2 = aophVar5.i;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        aophVar.i = max;
        if (aophVar4 != null) {
            i3 = aophVar4.i;
        }
        aophVar2.i = Math.max(max, i3) + 1;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    final aoph a(Object obj, boolean z) {
        int i;
        aoph aophVar;
        Comparable comparable;
        aoph aophVar2;
        Comparator comparator = this.f;
        aoph aophVar3 = this.b;
        if (aophVar3 != null) {
            if (comparator == a) {
                comparable = (Comparable) obj;
            } else {
                comparable = null;
            }
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(aophVar3.f);
                } else {
                    i = comparator.compare(obj, aophVar3.f);
                }
                if (i == 0) {
                    return aophVar3;
                }
                if (i < 0) {
                    aophVar2 = aophVar3.b;
                } else {
                    aophVar2 = aophVar3.c;
                }
                if (aophVar2 == null) {
                    break;
                }
                aophVar3 = aophVar2;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        aoph aophVar4 = this.e;
        if (aophVar3 == null) {
            if (comparator == a && !(obj instanceof Comparable)) {
                throw new ClassCastException(String.valueOf(obj.getClass().getName()).concat(" is not Comparable"));
            }
            aophVar = new aoph(this.g, null, obj, aophVar4, aophVar4.e);
            this.b = aophVar;
        } else {
            aophVar = new aoph(this.g, aophVar3, obj, aophVar4, aophVar4.e);
            if (i < 0) {
                aophVar3.b = aophVar;
            } else {
                aophVar3.c = aophVar;
            }
            f(aophVar3, true);
        }
        this.c++;
        this.d++;
        return aophVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final aoph b(Map.Entry entry) {
        aoph c = c(entry.getKey());
        if (c != null && Objects.equals(c.h, entry.getValue())) {
            return c;
        }
        return null;
    }

    final aoph c(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return a(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.b = null;
        this.c = 0;
        this.d++;
        aoph aophVar = this.e;
        aophVar.e = aophVar;
        aophVar.d = aophVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (c(obj) != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final aoph d(Object obj) {
        aoph c = c(obj);
        if (c != null) {
            e(c, true);
        }
        return c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        e(r0, false);
        r8 = r7.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r8 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        r1 = r8.i;
        r0.b = r8;
        r8.a = r0;
        r7.b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        r8 = r7.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        if (r8 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        r2 = r8.i;
        r0.c = r8;
        r8.a = r0;
        r7.c = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        r0.i = java.lang.Math.max(r1, r2) + 1;
        g(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0026, code lost:
    
        r5 = r0;
        r0 = r0.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002b, code lost:
    
        if (r0 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002e, code lost:
    
        r0 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        if (r8.i > r0.i) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        r0 = r8;
        r8 = r8.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r8 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(defpackage.aoph r7, boolean r8) {
        /*
            r6 = this;
            if (r8 == 0) goto Lc
            aoph r8 = r7.e
            aoph r0 = r7.d
            r8.d = r0
            aoph r0 = r7.d
            r0.e = r8
        Lc:
            aoph r8 = r7.b
            aoph r0 = r7.c
            aoph r1 = r7.a
            r2 = 0
            r3 = 0
            if (r8 == 0) goto L58
            if (r0 == 0) goto L58
            int r1 = r8.i
            int r4 = r0.i
            if (r1 <= r4) goto L26
        L1e:
            aoph r0 = r8.c
            r5 = r0
            r0 = r8
            r8 = r5
            if (r8 == 0) goto L2f
            goto L1e
        L26:
            aoph r8 = r0.b
            r5 = r0
            r0 = r8
            r8 = r5
            if (r0 == 0) goto L2e
            goto L26
        L2e:
            r0 = r8
        L2f:
            r6.e(r0, r2)
            aoph r8 = r7.b
            if (r8 == 0) goto L3f
            int r1 = r8.i
            r0.b = r8
            r8.a = r0
            r7.b = r3
            goto L40
        L3f:
            r1 = r2
        L40:
            aoph r8 = r7.c
            if (r8 == 0) goto L4c
            int r2 = r8.i
            r0.c = r8
            r8.a = r0
            r7.c = r3
        L4c:
            int r8 = java.lang.Math.max(r1, r2)
            int r8 = r8 + 1
            r0.i = r8
            r6.g(r7, r0)
            return
        L58:
            if (r8 == 0) goto L60
            r6.g(r7, r8)
            r7.b = r3
            goto L6b
        L60:
            if (r0 == 0) goto L68
            r6.g(r7, r0)
            r7.c = r3
            goto L6b
        L68:
            r6.g(r7, r3)
        L6b:
            r6.f(r1, r2)
            int r7 = r6.c
            int r7 = r7 + (-1)
            r6.c = r7
            int r7 = r6.d
            int r7 = r7 + 1
            r6.d = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aopi.e(aoph, boolean):void");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        aopd aopdVar = this.h;
        if (aopdVar != null) {
            return aopdVar;
        }
        aopd aopdVar2 = new aopd(this);
        this.h = aopdVar2;
        return aopdVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        aoph c = c(obj);
        if (c != null) {
            return c.h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        aopf aopfVar = this.i;
        if (aopfVar != null) {
            return aopfVar;
        }
        aopf aopfVar2 = new aopf(this);
        this.i = aopfVar2;
        return aopfVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 == null && !this.g) {
                throw new NullPointerException("value == null");
            }
            aoph a2 = a(obj, true);
            Object obj3 = a2.h;
            a2.h = obj2;
            return obj3;
        }
        throw new NullPointerException("key == null");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        aoph d = d(obj);
        if (d != null) {
            return d.h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c;
    }

    public aopi(Comparator comparator, boolean z) {
        this.c = 0;
        this.d = 0;
        this.f = comparator;
        this.g = z;
        this.e = new aoph(z);
    }
}
