package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aozu {
    public static final aozu a = new aozu(null);
    final apco b = new apco();
    public boolean c;
    private boolean d;

    private aozu() {
    }

    public static int a(apdf apdfVar, int i, Object obj) {
        int Z = aozl.Z(i);
        if (apdfVar == apdf.GROUP) {
            apay.c((apbt) obj);
            Z += Z;
        }
        return Z + b(apdfVar, obj);
    }

    static int b(apdf apdfVar, Object obj) {
        apdf apdfVar2 = apdf.DOUBLE;
        apdg apdgVar = apdg.INT;
        switch (apdfVar) {
            case DOUBLE:
                ((Double) obj).doubleValue();
                boolean z = aozl.e;
                return 8;
            case FLOAT:
                ((Float) obj).floatValue();
                boolean z2 = aozl.e;
                return 4;
            case INT64:
                return aozl.ad(((Long) obj).longValue());
            case UINT64:
                return aozl.ad(((Long) obj).longValue());
            case INT32:
                return aozl.L(((Integer) obj).intValue());
            case FIXED64:
                ((Long) obj).longValue();
                boolean z3 = aozl.e;
                return 8;
            case FIXED32:
                ((Integer) obj).intValue();
                boolean z4 = aozl.e;
                return 4;
            case BOOL:
                ((Boolean) obj).booleanValue();
                boolean z5 = aozl.e;
                return 1;
            case STRING:
                if (obj instanceof aozb) {
                    return aozl.H((aozb) obj);
                }
                return aozl.Y((String) obj);
            case GROUP:
                boolean z6 = aozl.e;
                return ((apbt) obj).getSerializedSize();
            case MESSAGE:
                if (obj instanceof apbf) {
                    return aozl.O((apbf) obj);
                }
                return aozl.Q((apbt) obj);
            case BYTES:
                if (obj instanceof aozb) {
                    return aozl.H((aozb) obj);
                }
                boolean z7 = aozl.e;
                return aozl.P(((byte[]) obj).length);
            case UINT32:
                return aozl.ab(((Integer) obj).intValue());
            case ENUM:
                if (obj instanceof apak) {
                    return aozl.L(((apak) obj).a());
                }
                return aozl.L(((Integer) obj).intValue());
            case SFIXED32:
                ((Integer) obj).intValue();
                boolean z8 = aozl.e;
                return 4;
            case SFIXED64:
                ((Long) obj).longValue();
                boolean z9 = aozl.e;
                return 8;
            case SINT32:
                return aozl.U(((Integer) obj).intValue());
            case SINT64:
                return aozl.W(((Long) obj).longValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static void h(aozl aozlVar, apdf apdfVar, int i, Object obj) {
        if (apdfVar != apdf.GROUP) {
            aozlVar.A(i, apdfVar.t);
            apdg apdgVar = apdg.INT;
            switch (apdfVar) {
                case DOUBLE:
                    aozlVar.ak(((Double) obj).doubleValue());
                    return;
                case FLOAT:
                    aozlVar.am(((Float) obj).floatValue());
                    return;
                case INT64:
                    aozlVar.E(((Long) obj).longValue());
                    return;
                case UINT64:
                    aozlVar.E(((Long) obj).longValue());
                    return;
                case INT32:
                    aozlVar.t(((Integer) obj).intValue());
                    return;
                case FIXED64:
                    aozlVar.r(((Long) obj).longValue());
                    return;
                case FIXED32:
                    aozlVar.p(((Integer) obj).intValue());
                    return;
                case BOOL:
                    aozlVar.j(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                    return;
                case STRING:
                    if (obj instanceof aozb) {
                        aozlVar.n((aozb) obj);
                        return;
                    } else {
                        aozlVar.z((String) obj);
                        return;
                    }
                case GROUP:
                    aozlVar.an((apbt) obj);
                    return;
                case MESSAGE:
                    aozlVar.v((apbt) obj);
                    return;
                case BYTES:
                    if (obj instanceof aozb) {
                        aozlVar.n((aozb) obj);
                        return;
                    } else {
                        byte[] bArr = (byte[]) obj;
                        aozlVar.F(bArr, bArr.length);
                        return;
                    }
                case UINT32:
                    aozlVar.C(((Integer) obj).intValue());
                    return;
                case ENUM:
                    if (obj instanceof apak) {
                        aozlVar.t(((apak) obj).a());
                        return;
                    } else {
                        aozlVar.t(((Integer) obj).intValue());
                        return;
                    }
                case SFIXED32:
                    aozlVar.p(((Integer) obj).intValue());
                    return;
                case SFIXED64:
                    aozlVar.r(((Long) obj).longValue());
                    return;
                case SINT32:
                    aozlVar.ap(((Integer) obj).intValue());
                    return;
                case SINT64:
                    aozlVar.ar(((Long) obj).longValue());
                    return;
                default:
                    return;
            }
        }
        apbt apbtVar = (apbt) obj;
        apay.c(apbtVar);
        aozlVar.A(i, 3);
        aozlVar.an(apbtVar);
        aozlVar.A(i, 4);
    }

    public static int k(apad apadVar, Object obj) {
        apdf apdfVar = apadVar.c;
        int i = apadVar.b;
        if (apadVar.d) {
            List list = (List) obj;
            int size = list.size();
            int i2 = 0;
            if (apadVar.e) {
                if (list.isEmpty()) {
                    return 0;
                }
                int i3 = 0;
                while (i2 < size) {
                    i3 += b(apdfVar, list.get(i2));
                    i2++;
                }
                return aozl.Z(i) + i3 + aozl.ab(i3);
            }
            int i4 = 0;
            while (i2 < size) {
                i4 += a(apdfVar, i, list.get(i2));
                i2++;
            }
            return i4;
        }
        return a(apdfVar, i, obj);
    }

    private static Object p(Object obj) {
        if (obj instanceof apby) {
            return ((apby) obj).a();
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return bArr2;
        }
        return obj;
    }

    private static boolean q(Map.Entry entry) {
        apad apadVar = (apad) entry.getKey();
        if (apadVar.a() == apdg.MESSAGE) {
            if (apadVar.d) {
                List list = (List) entry.getValue();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (!r(list.get(i))) {
                        return false;
                    }
                }
                return true;
            }
            return r(entry.getValue());
        }
        return true;
    }

    private static boolean r(Object obj) {
        if (obj instanceof apbu) {
            return ((apbu) obj).isInitialized();
        }
        if (obj instanceof apbf) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void s(defpackage.apad r4, java.lang.Object r5) {
        /*
            defpackage.apay.b(r5)
            apdf r0 = defpackage.apdf.DOUBLE
            apdg r0 = defpackage.apdg.INT
            apdf r0 = r4.c
            apdg r0 = r0.s
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L3d;
                case 1: goto L3a;
                case 2: goto L37;
                case 3: goto L34;
                case 4: goto L31;
                case 5: goto L2e;
                case 6: goto L25;
                case 7: goto L1c;
                case 8: goto L13;
                default: goto L12;
            }
        L12:
            goto L42
        L13:
            boolean r0 = r5 instanceof defpackage.apbt
            if (r0 != 0) goto L41
            boolean r0 = r5 instanceof defpackage.apbf
            if (r0 == 0) goto L42
            goto L41
        L1c:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L41
            boolean r0 = r5 instanceof defpackage.apak
            if (r0 == 0) goto L42
            goto L41
        L25:
            boolean r0 = r5 instanceof defpackage.aozb
            if (r0 != 0) goto L41
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L42
            goto L41
        L2e:
            boolean r0 = r5 instanceof java.lang.String
            goto L3f
        L31:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L3f
        L34:
            boolean r0 = r5 instanceof java.lang.Double
            goto L3f
        L37:
            boolean r0 = r5 instanceof java.lang.Float
            goto L3f
        L3a:
            boolean r0 = r5 instanceof java.lang.Long
            goto L3f
        L3d:
            boolean r0 = r5 instanceof java.lang.Integer
        L3f:
            if (r0 == 0) goto L42
        L41:
            return
        L42:
            int r0 = r4.b
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            apdf r4 = r4.c
            apdg r4 = r4.s
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r4
            r4 = 2
            r2[r4] = r5
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r2)
            r1.<init>(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aozu.s(apad, java.lang.Object):void");
    }

    public final int c(Map.Entry entry) {
        int aa;
        int Z;
        apad apadVar = (apad) entry.getKey();
        Object value = entry.getValue();
        if (apadVar.a() == apdg.MESSAGE && !apadVar.d && !apadVar.e) {
            if (value instanceof apbf) {
                int i = ((apad) entry.getKey()).b;
                int Z2 = aozl.Z(1);
                aa = Z2 + Z2 + aozl.aa(2, i);
                Z = aozl.N(3, (apbf) value);
            } else {
                int i2 = ((apad) entry.getKey()).b;
                int Z3 = aozl.Z(1);
                aa = Z3 + Z3 + aozl.aa(2, i2);
                Z = aozl.Z(3) + aozl.Q((apbt) value);
            }
            return aa + Z;
        }
        return k(apadVar, value);
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final aozu clone() {
        aozu aozuVar = new aozu();
        int i = this.b.b;
        for (int i2 = 0; i2 < i; i2++) {
            apcl apclVar = (apcl) this.b.d(i2);
            aozuVar.n((apad) apclVar.a, apclVar.b);
        }
        for (Map.Entry entry : this.b.a()) {
            aozuVar.n((apad) entry.getKey(), entry.getValue());
        }
        aozuVar.d = this.d;
        return aozuVar;
    }

    public final Iterator e() {
        if (i()) {
            return Collections.emptyIterator();
        }
        if (this.d) {
            return new apbe(this.b.entrySet().iterator());
        }
        return this.b.entrySet().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aozu)) {
            return false;
        }
        return this.b.equals(((aozu) obj).b);
    }

    public final void f() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (this.c) {
            return;
        }
        int i = this.b.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((apcl) this.b.d(i2)).b;
            if (obj instanceof apag) {
                ((apag) obj).makeImmutable();
            }
        }
        Iterator it = this.b.a().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof apag) {
                ((apag) value).makeImmutable();
            }
        }
        apco apcoVar = this.b;
        if (!apcoVar.d) {
            for (int i3 = 0; i3 < apcoVar.b; i3++) {
                Map.Entry d = apcoVar.d(i3);
                apcl apclVar = (apcl) d;
                if (((apad) apclVar.a).d) {
                    d.setValue(DesugarCollections.unmodifiableList((List) apclVar.b));
                }
            }
            for (Map.Entry entry : apcoVar.a()) {
                if (((apad) entry.getKey()).d) {
                    entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!apcoVar.d) {
            if (apcoVar.c.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = DesugarCollections.unmodifiableMap(apcoVar.c);
            }
            apcoVar.c = unmodifiableMap;
            if (apcoVar.e.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = DesugarCollections.unmodifiableMap(apcoVar.e);
            }
            apcoVar.e = unmodifiableMap2;
            apcoVar.d = true;
        }
        this.c = true;
    }

    public final void g(Map.Entry entry) {
        apad apadVar = (apad) entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof apbf;
        if (apadVar.d) {
            if (!z) {
                Object l = l(apadVar);
                List list = (List) value;
                int size = list.size();
                if (l == null) {
                    l = new ArrayList(size);
                }
                List list2 = (List) l;
                for (int i = 0; i < size; i++) {
                    list2.add(p(list.get(i)));
                }
                this.b.put(apadVar, l);
                return;
            }
            throw new IllegalStateException("Lazy fields can not be repeated");
        }
        if (apadVar.a() == apdg.MESSAGE) {
            Object l2 = l(apadVar);
            if (l2 == null) {
                this.b.put(apadVar, p(value));
                if (z) {
                    this.d = true;
                    return;
                }
                return;
            }
            if (!z) {
                if (!(l2 instanceof apby)) {
                    aozy aozyVar = (aozy) ((apbt) l2).toBuilder();
                    aozyVar.w((apag) ((apbt) value));
                    this.b.put(apadVar, aozyVar.s());
                    return;
                } else {
                    throw new UnsupportedOperationException();
                }
            }
            throw null;
        }
        if (!z) {
            this.b.put(apadVar, p(value));
            return;
        }
        throw new IllegalStateException("Lazy fields must be message-valued");
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean i() {
        return this.b.isEmpty();
    }

    public final boolean j() {
        int i = this.b.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (!q(this.b.d(i2))) {
                return false;
            }
        }
        Iterator it = this.b.a().iterator();
        while (it.hasNext()) {
            if (!q((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Object l(apad apadVar) {
        Object obj = this.b.get(apadVar);
        if (!(obj instanceof apbf)) {
            return obj;
        }
        throw null;
    }

    public final void m(apad apadVar, Object obj) {
        List list;
        if (apadVar.d) {
            s(apadVar, obj);
            Object l = l(apadVar);
            if (l == null) {
                list = new ArrayList();
                this.b.put(apadVar, list);
            } else {
                list = (List) l;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    public final void n(apad apadVar, Object obj) {
        if (apadVar.d) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    Object obj2 = list.get(i);
                    s(apadVar, obj2);
                    arrayList.add(obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            s(apadVar, obj);
        }
        if (obj instanceof apbf) {
            this.d = true;
        }
        this.b.put(apadVar, obj);
    }

    public final boolean o(apad apadVar) {
        if (!apadVar.d) {
            if (this.b.get(apadVar) != null) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
    }

    private aozu(byte[] bArr) {
        f();
        f();
    }
}
