package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class annb {
    public final anxi a;
    public final List b;
    private final anth c;

    public annb(anxi anxiVar, List list, anth anthVar) {
        this.a = anxiVar;
        this.b = list;
        this.c = anthVar;
    }

    public static final annb b(anxi anxiVar) {
        e(anxiVar);
        return new annb(anxiVar, i(anxiVar));
    }

    @Deprecated
    public static final annb d(byte[] bArr) {
        try {
            aozs aozsVar = aozs.a;
            apcc apccVar = apcc.a;
            anxi anxiVar = (anxi) apag.parseFrom(anxi.a, bArr, aozs.a);
            f(anxiVar);
            return b(anxiVar);
        } catch (apba unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }

    public static void e(anxi anxiVar) {
        if (anxiVar != null && anxiVar.c.size() > 0) {
        } else {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void f(defpackage.anxi r6) {
        /*
            apax r6 = r6.c
            java.util.Iterator r6 = r6.iterator()
        L6:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L8f
            java.lang.Object r0 = r6.next()
            anxh r0 = (defpackage.anxh) r0
            anxf r1 = r0.c
            if (r1 != 0) goto L18
            anxf r1 = defpackage.anxf.a
        L18:
            int r1 = r1.d
            int r1 = defpackage.a.T(r1)
            r2 = 4
            r3 = 3
            r4 = 2
            if (r1 != 0) goto L24
            goto L26
        L24:
            if (r1 == r4) goto L47
        L26:
            anxf r1 = r0.c
            if (r1 != 0) goto L2d
            anxf r5 = defpackage.anxf.a
            goto L2e
        L2d:
            r5 = r1
        L2e:
            int r5 = r5.d
            int r5 = defpackage.a.T(r5)
            if (r5 != 0) goto L37
            goto L39
        L37:
            if (r5 == r3) goto L47
        L39:
            if (r1 != 0) goto L3d
            anxf r1 = defpackage.anxf.a
        L3d:
            int r1 = r1.d
            int r1 = defpackage.a.T(r1)
            if (r1 == 0) goto L6
            if (r1 != r2) goto L6
        L47:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException
            anxf r0 = r0.c
            if (r0 != 0) goto L50
            anxf r1 = defpackage.anxf.a
            goto L51
        L50:
            r1 = r0
        L51:
            int r1 = r1.d
            int r1 = defpackage.a.T(r1)
            if (r1 != 0) goto L5a
            goto L66
        L5a:
            if (r1 == r4) goto L75
            if (r1 == r3) goto L72
            if (r1 == r2) goto L6f
            r2 = 5
            if (r1 == r2) goto L6c
            r2 = 6
            if (r1 == r2) goto L69
        L66:
            java.lang.String r1 = "UNRECOGNIZED"
            goto L77
        L69:
            java.lang.String r1 = "REMOTE"
            goto L77
        L6c:
            java.lang.String r1 = "ASYMMETRIC_PUBLIC"
            goto L77
        L6f:
            java.lang.String r1 = "ASYMMETRIC_PRIVATE"
            goto L77
        L72:
            java.lang.String r1 = "SYMMETRIC"
            goto L77
        L75:
            java.lang.String r1 = "UNKNOWN_KEYMATERIAL"
        L77:
            if (r0 != 0) goto L7b
            anxf r0 = defpackage.anxf.a
        L7b:
            java.lang.String r0 = r0.b
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r3 = 0
            r2[r3] = r1
            r1 = 1
            r2[r1] = r0
            java.lang.String r0 = "keyset contains key material of type %s for type url %s"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r6.<init>(r0)
            throw r6
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.annb.f(anxi):void");
    }

    public static anxh g(anme anmeVar, anmx anmxVar, int i) {
        int i2;
        anua anuaVar = (anua) antq.a.b(anmeVar, anua.class, annj.a);
        Integer num = anuaVar.e;
        if (num != null && num.intValue() != i) {
            throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
        }
        if (anmx.a.equals(anmxVar)) {
            i2 = 3;
        } else if (anmx.b.equals(anmxVar)) {
            i2 = 4;
        } else if (anmx.c.equals(anmxVar)) {
            i2 = 5;
        } else {
            throw new IllegalStateException("Unknown key status");
        }
        aozy createBuilder = anxh.a.createBuilder();
        aozy createBuilder2 = anxf.a.createBuilder();
        String str = anuaVar.a;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar = createBuilder2.b;
        str.getClass();
        ((anxf) apagVar).b = str;
        aozb aozbVar = anuaVar.c;
        if (!apagVar.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar2 = createBuilder2.b;
        aozbVar.getClass();
        ((anxf) apagVar2).c = aozbVar;
        int i3 = anuaVar.f;
        if (!apagVar2.isMutable()) {
            createBuilder2.u();
        }
        ((anxf) createBuilder2.b).d = a.am(i3);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        anxh anxhVar = (anxh) createBuilder.b;
        anxf anxfVar = (anxf) createBuilder2.s();
        anxfVar.getClass();
        anxhVar.c = anxfVar;
        anxhVar.b |= 1;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((anxh) createBuilder.b).d = a.ak(i2);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar3 = createBuilder.b;
        ((anxh) apagVar3).e = i;
        anxp anxpVar = anuaVar.d;
        if (!apagVar3.isMutable()) {
            createBuilder.u();
        }
        ((anxh) createBuilder.b).f = anxpVar.a();
        return (anxh) createBuilder.s();
    }

    private static List i(anxi anxiVar) {
        ArrayList arrayList = new ArrayList(anxiVar.c.size());
        for (anxh anxhVar : anxiVar.c) {
            int i = anxhVar.e;
            try {
                anme l = l(anxhVar);
                int Z = a.Z(anxhVar.d);
                boolean z = true;
                if (Z == 0) {
                    Z = 1;
                }
                anmx j = j(Z);
                if (i != anxiVar.b) {
                    z = false;
                }
                arrayList.add(new anna(l, j, i, z));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    private static anmx j(int i) {
        int i2 = i - 2;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    return anmx.c;
                }
                throw new GeneralSecurityException("Unknown key status");
            }
            return anmx.b;
        }
        return anmx.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.util.Map, java.lang.Object] */
    private final Object k(Class cls, Class cls2) {
        boolean z;
        int i = annl.a;
        anxi anxiVar = this.a;
        int i2 = anxiVar.b;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = true;
        for (anxh anxhVar : anxiVar.c) {
            int i4 = anxhVar.d;
            int Z = a.Z(i4);
            if (Z != 0 && Z == 3) {
                if ((anxhVar.b & 1) != 0) {
                    anxp b = anxp.b(anxhVar.f);
                    if (b == null) {
                        b = anxp.UNRECOGNIZED;
                    }
                    if (b != anxp.UNKNOWN_PREFIX) {
                        int Z2 = a.Z(i4);
                        if (Z2 == 0 || Z2 != 2) {
                            if (anxhVar.e == i2) {
                                if (!z2) {
                                    z2 = true;
                                } else {
                                    throw new GeneralSecurityException("keyset contains multiple primary keys");
                                }
                            }
                            anxf anxfVar = anxhVar.c;
                            if (anxfVar == null) {
                                anxfVar = anxf.a;
                            }
                            int T = a.T(anxfVar.d);
                            if (T != 0 && T == 5) {
                                z = true;
                            } else {
                                z = false;
                            }
                            z3 &= z;
                            i3++;
                        } else {
                            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(anxhVar.e)));
                        }
                    } else {
                        throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(anxhVar.e)));
                    }
                } else {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(anxhVar.e)));
                }
            }
        }
        if (i3 != 0) {
            if (!z2 && !z3) {
                throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
            }
            antx antxVar = new antx(cls2);
            anth anthVar = this.c;
            if (antxVar.b != null) {
                antxVar.e = anthVar;
                for (int i5 = 0; i5 < a(); i5++) {
                    anxh anxhVar2 = (anxh) this.a.c.get(i5);
                    int Z3 = a.Z(anxhVar2.d);
                    if (Z3 != 0 && Z3 == 3) {
                        anna annaVar = (anna) this.b.get(i5);
                        if (annaVar == null) {
                            anxf anxfVar2 = anxhVar2.c;
                            if (anxfVar2 == null) {
                                anxfVar2 = anxf.a;
                            }
                            throw new GeneralSecurityException("Key parsing of key with index " + i5 + " and type_url " + anxfVar2.b + " failed, unable to get primitive");
                        }
                        try {
                            Object c = antp.a.c((anme) annaVar.c, cls2);
                            if (anxhVar2.e == this.a.b) {
                                antxVar.a(c, anxhVar2, true);
                            } else {
                                antxVar.a(c, anxhVar2, false);
                            }
                        } catch (GeneralSecurityException e) {
                            String obj = cls2.toString();
                            anxf anxfVar3 = anxhVar2.c;
                            if (anxfVar3 == null) {
                                anxfVar3 = anxf.a;
                            }
                            throw new GeneralSecurityException("Unable to get primitive " + obj + " for key of type " + anxfVar3.b + ", see https://developers.google.com/tink/faq/registration_errors", e);
                        }
                    }
                }
                Map map = antxVar.b;
                if (map != null) {
                    atii atiiVar = new atii(map, antxVar.d, antxVar.e, antxVar.a);
                    antxVar.b = null;
                    int i6 = anni.a;
                    asmb asmbVar = (asmb) antp.a.b.get();
                    if (asmbVar.a.containsKey(cls)) {
                        antz antzVar = (antz) asmbVar.a.get(cls);
                        if (atiiVar.b.equals(antzVar.a()) && antzVar.a().equals(atiiVar.b)) {
                            return antzVar.c(atiiVar);
                        }
                        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
                    }
                    throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
                }
                throw new IllegalStateException("build cannot be called twice");
            }
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }
        throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.Map, java.lang.Object] */
    private static anme l(anxh anxhVar) {
        Integer valueOf;
        anxf anxfVar;
        int i = anxhVar.e;
        anxp b = anxp.b(anxhVar.f);
        if (b == null) {
            b = anxp.UNRECOGNIZED;
        }
        if (b == anxp.RAW) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(i);
        }
        anxf anxfVar2 = anxhVar.c;
        if (anxfVar2 == null) {
            anxfVar2 = anxf.a;
        }
        String str = anxfVar2.b;
        anxf anxfVar3 = anxhVar.c;
        if (anxfVar3 == null) {
            anxfVar = anxf.a;
        } else {
            anxfVar = anxfVar3;
        }
        aozb aozbVar = anxfVar.c;
        if (anxfVar3 == null) {
            anxfVar3 = anxf.a;
        }
        int T = a.T(anxfVar3.d);
        if (T == 0) {
            T = 1;
        }
        anxp b2 = anxp.b(anxhVar.f);
        if (b2 == null) {
            b2 = anxp.UNRECOGNIZED;
        }
        anua a = anua.a(str, aozbVar, T, b2, valueOf);
        antq antqVar = antq.a;
        AtomicReference atomicReference = antqVar.b;
        annj annjVar = annj.a;
        atii atiiVar = (atii) atomicReference.get();
        if (!atiiVar.c.containsKey(new anug(a.getClass(), a.b))) {
            return new antf(a);
        }
        return antqVar.a(a, annjVar);
    }

    public final int a() {
        return this.b.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final annb c() {
        anna annaVar;
        anxh anxhVar;
        if (this.a != null) {
            aozy createBuilder = anxi.a.createBuilder();
            ArrayList arrayList = new ArrayList(this.b.size());
            int i = 0;
            for (anna annaVar2 : this.b) {
                if (annaVar2 != null) {
                    Object obj = annaVar2.c;
                    if (obj instanceof annf) {
                        anme b = ((annf) obj).b();
                        annaVar = new anna(b, (anmx) annaVar2.d, annaVar2.a, annaVar2.b);
                        anxhVar = g(b, (anmx) annaVar2.d, annaVar2.a);
                        createBuilder.aU(anxhVar);
                        arrayList.add(annaVar);
                        i++;
                    }
                }
                anxh anxhVar2 = (anxh) this.a.c.get(i);
                anxf anxfVar = anxhVar2.c;
                if (anxfVar == null) {
                    anxfVar = anxf.a;
                }
                int T = a.T(anxfVar.d);
                if (T != 0 && T == 4) {
                    String str = anxfVar.b;
                    aozb aozbVar = anxfVar.c;
                    int i2 = anni.a;
                    anmw a = anta.a.a(str);
                    if (a instanceof antd) {
                        antd antdVar = (antd) a;
                        annaVar = null;
                        Object a2 = antq.a.a(anua.a(antdVar.a, aozbVar, antdVar.c, anxp.RAW, null), annj.a);
                        if (a2 instanceof annf) {
                            anuf b2 = antq.a.b(((annf) a2).b(), anua.class, annj.a);
                            aozy createBuilder2 = anxf.a.createBuilder();
                            anua anuaVar = (anua) b2;
                            String str2 = anuaVar.a;
                            if (!createBuilder2.b.isMutable()) {
                                createBuilder2.u();
                            }
                            apag apagVar = createBuilder2.b;
                            str2.getClass();
                            ((anxf) apagVar).b = str2;
                            aozb aozbVar2 = anuaVar.c;
                            if (!apagVar.isMutable()) {
                                createBuilder2.u();
                            }
                            apag apagVar2 = createBuilder2.b;
                            aozbVar2.getClass();
                            ((anxf) apagVar2).c = aozbVar2;
                            int i3 = anuaVar.f;
                            if (!apagVar2.isMutable()) {
                                createBuilder2.u();
                            }
                            ((anxf) createBuilder2.b).d = a.am(i3);
                            anxf anxfVar2 = (anxf) createBuilder2.s();
                            aozy builder = anxhVar2.toBuilder();
                            if (!builder.b.isMutable()) {
                                builder.u();
                            }
                            anxh anxhVar3 = (anxh) builder.b;
                            anxfVar2.getClass();
                            anxhVar3.c = anxfVar2;
                            boolean z = true;
                            anxhVar3.b |= 1;
                            anxhVar = (anxh) builder.s();
                            try {
                                anme l = l(anxhVar);
                                int i4 = anxhVar.e;
                                int Z = a.Z(anxhVar.d);
                                if (Z == 0) {
                                    Z = 1;
                                }
                                anmx j = j(Z);
                                if (i4 != this.a.b) {
                                    z = false;
                                }
                                annaVar = new anna(l, j, i4, z);
                            } catch (GeneralSecurityException unused) {
                            }
                            createBuilder.aU(anxhVar);
                            arrayList.add(annaVar);
                            i++;
                        } else {
                            throw new GeneralSecurityException("Key not private key");
                        }
                    } else {
                        throw new GeneralSecurityException("manager for key type " + str + " is not a PrivateKeyManager");
                    }
                } else {
                    throw new GeneralSecurityException("The keyset contains a non-private key");
                }
            }
            int i5 = this.a.b;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((anxi) createBuilder.b).b = i5;
            return new annb((anxi) createBuilder.s(), arrayList, this.c);
        }
        throw new GeneralSecurityException("cleartext keyset is not available");
    }

    public final Object h(anme anmeVar, Class cls) {
        Class a = anni.a(cls);
        if (a != null) {
            return k(cls, a);
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(String.valueOf(cls.getName())));
    }

    public final String toString() {
        return annl.a(this.a).toString();
    }

    private annb(anxi anxiVar, List list) {
        this.a = anxiVar;
        this.b = list;
        this.c = anth.a;
    }
}
