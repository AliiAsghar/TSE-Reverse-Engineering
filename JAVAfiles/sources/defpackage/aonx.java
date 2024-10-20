package defpackage;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.ObjectTypeAdapter$1;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.TypeAdapters$29;
import com.google.gson.internal.bind.TypeAdapters$30;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aonx {
    static final aonr a = aonr.a;
    static final int d = 1;
    static final int e = 1;
    static final int f = 2;
    public static final /* synthetic */ int g = 0;
    final List b;
    final aonr c;
    private final ThreadLocal h;
    private final ConcurrentMap i;
    private final aooy j;
    private final JsonAdapterAnnotationTypeAdapterFactory k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public aonx() {
        /*
            r9 = this;
            com.google.gson.internal.Excluder r1 = com.google.gson.internal.Excluder.a
            int r2 = defpackage.aonx.d
            java.util.Map r3 = java.util.Collections.emptyMap()
            aonr r4 = defpackage.aonx.a
            java.util.Collections.emptyList()
            java.util.Collections.emptyList()
            java.util.List r5 = java.util.Collections.emptyList()
            int r6 = defpackage.aonx.e
            int r7 = defpackage.aonx.f
            java.util.List r8 = java.util.Collections.emptyList()
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aonx.<init>():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void k(double d2) {
        if (!Double.isNaN(d2) && !Double.isInfinite(d2)) {
            return;
        }
        throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
    }

    public static final aoro m(Reader reader) {
        aoro aoroVar = new aoro(reader);
        aoroVar.u(2);
        return aoroVar;
    }

    public static final void n(aood aoodVar, aorp aorpVar) {
        int i = aorpVar.d;
        boolean z = aorpVar.b;
        boolean z2 = aorpVar.c;
        aorpVar.b = true;
        aorpVar.c = false;
        if (i == 2) {
            aorpVar.d(1);
        }
        try {
            try {
                aotl.s(aoodVar, aorpVar);
            } catch (IOException e2) {
                throw new aooe(e2);
            } catch (AssertionError e3) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e3.getMessage(), e3);
            }
        } finally {
            aorpVar.d(i);
            aorpVar.b = z;
            aorpVar.c = z2;
        }
    }

    public final aoon a(aorn aornVar) {
        boolean z;
        aoon aoonVar = (aoon) this.i.get(aornVar);
        if (aoonVar != null) {
            return aoonVar;
        }
        Map map = (Map) this.h.get();
        boolean z2 = false;
        if (map == null) {
            map = new HashMap();
            this.h.set(map);
            z = true;
        } else {
            aoon aoonVar2 = (aoon) map.get(aornVar);
            if (aoonVar2 == null) {
                z = false;
            } else {
                return aoonVar2;
            }
        }
        try {
            aonw aonwVar = new aonw();
            map.put(aornVar, aonwVar);
            Iterator it = this.b.iterator();
            aoon aoonVar3 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                aoonVar3 = ((aooo) it.next()).a(this, aornVar);
                if (aoonVar3 != null) {
                    if (aonwVar.a == null) {
                        aonwVar.a = aoonVar3;
                        map.put(aornVar, aoonVar3);
                    } else {
                        throw new AssertionError("Delegate is already set");
                    }
                }
            }
            if (z) {
                this.h.remove();
                z2 = true;
            }
            if (aoonVar3 != null) {
                if (z2) {
                    this.i.putAll(map);
                }
                return aoonVar3;
            }
            throw new IllegalArgumentException("GSON (2.10.1) cannot handle ".concat(aornVar.toString()));
        } catch (Throwable th) {
            if (z) {
                this.h.remove();
            }
            throw th;
        }
    }

    public final aoon b(Class cls) {
        return a(new aorn(cls));
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0034, code lost:
    
        if (r0.c(r1, (defpackage.aooo) com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.e(r0.b, r2)) == r5) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r2 == r5) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.aoon c(defpackage.aooo r5, defpackage.aorn r6) {
        /*
            r4 = this;
            aooo r0 = com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.a
            if (r5 != r0) goto L5
            goto L36
        L5:
            com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory r0 = r4.k
            java.lang.Class r1 = r6.a
            java.util.concurrent.ConcurrentMap r2 = r0.c
            java.lang.Object r2 = r2.get(r1)
            aooo r2 = (defpackage.aooo) r2
            if (r2 == 0) goto L16
            if (r2 != r5) goto L38
            goto L36
        L16:
            aooq r2 = com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.d(r1)
            if (r2 == 0) goto L38
            java.lang.Class r2 = r2.a()
            java.lang.Class<aooo> r3 = defpackage.aooo.class
            boolean r3 = r3.isAssignableFrom(r2)
            if (r3 == 0) goto L38
            aooy r3 = r0.b
            java.lang.Object r2 = com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.e(r3, r2)
            aooo r2 = (defpackage.aooo) r2
            aooo r0 = r0.c(r1, r2)
            if (r0 != r5) goto L38
        L36:
            com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory r5 = r4.k
        L38:
            java.util.List r0 = r4.b
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L3f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L58
            java.lang.Object r2 = r0.next()
            aooo r2 = (defpackage.aooo) r2
            if (r1 != 0) goto L51
            if (r2 != r5) goto L3f
            r1 = 1
            goto L3f
        L51:
            aoon r2 = r2.a(r4, r6)
            if (r2 == 0) goto L3f
            return r2
        L58:
            if (r1 != 0) goto L5f
            aoon r5 = r4.a(r6)
            return r5
        L5f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            java.lang.String r0 = "GSON cannot serialize or deserialize "
            java.lang.String r6 = r0.concat(r6)
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aonx.c(aooo, aorn):aoon");
    }

    public final aorp d(Writer writer) {
        aorp aorpVar = new aorp(writer);
        aorpVar.b(this.c);
        aorpVar.b = true;
        aorpVar.d(2);
        aorpVar.c = false;
        return aorpVar;
    }

    public final Object e(aoro aoroVar, aorn aornVar) {
        Object obj;
        int i = aoroVar.i;
        boolean z = true;
        if (i == 2) {
            aoroVar.u(1);
        }
        try {
            try {
                try {
                    try {
                        aoroVar.t();
                        try {
                            obj = a(aornVar).a(aoroVar);
                        } catch (EOFException e2) {
                            e = e2;
                            z = false;
                            if (z) {
                                obj = null;
                                return obj;
                            }
                            throw new aook(e);
                        }
                    } catch (IOException e3) {
                        throw new aook(e3);
                    } catch (AssertionError e4) {
                        throw new AssertionError("AssertionError (GSON 2.10.1): " + e4.getMessage(), e4);
                    }
                } catch (IllegalStateException e5) {
                    throw new aook(e5);
                }
            } finally {
                aoroVar.u(i);
            }
        } catch (EOFException e6) {
            e = e6;
        }
        return obj;
    }

    public final Object f(Reader reader, aorn aornVar) {
        aoro m = m(reader);
        Object e2 = e(m, aornVar);
        if (e2 != null) {
            try {
                if (m.t() != 10) {
                    throw new aook("JSON document was not fully consumed.");
                }
            } catch (aorq e3) {
                throw new aook(e3);
            } catch (IOException e4) {
                throw new aooe(e4);
            }
        }
        return e2;
    }

    public final Object g(Reader reader, Class cls) {
        return aotl.v(cls).cast(f(reader, new aorn(cls)));
    }

    public final Object h(String str, aorn aornVar) {
        if (str == null) {
            return null;
        }
        return f(new StringReader(str), aornVar);
    }

    public final Object i(String str, Class cls) {
        return aotl.v(cls).cast(h(str, new aorn(cls)));
    }

    public final String j(Object obj) {
        if (obj == null) {
            aoof aoofVar = aoof.a;
            StringWriter stringWriter = new StringWriter();
            try {
                n(aoofVar, d(stringWriter));
                return stringWriter.toString();
            } catch (IOException e2) {
                throw new aooe(e2);
            }
        }
        StringWriter stringWriter2 = new StringWriter();
        try {
            l(obj, obj.getClass(), d(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e3) {
            throw new aooe(e3);
        }
    }

    public final void l(Object obj, Type type, aorp aorpVar) {
        aoon a2 = a(new aorn(type));
        int i = aorpVar.d;
        if (i == 2) {
            aorpVar.d(1);
        }
        boolean z = aorpVar.b;
        boolean z2 = aorpVar.c;
        aorpVar.b = true;
        aorpVar.c = false;
        try {
            try {
                a2.b(aorpVar, obj);
            } catch (IOException e2) {
                throw new aooe(e2);
            } catch (AssertionError e3) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e3.getMessage(), e3);
            }
        } finally {
            aorpVar.d(i);
            aorpVar.b = z;
            aorpVar.c = z2;
        }
    }

    public final String toString() {
        aooy aooyVar = this.j;
        return "{serializeNulls:false,factories:" + String.valueOf(this.b) + ",instanceCreators:" + aooyVar.toString() + "}";
    }

    public aonx(Excluder excluder, int i, Map map, aonr aonrVar, List list, int i2, int i3, List list2) {
        this.h = new ThreadLocal();
        this.i = new ConcurrentHashMap();
        aooy aooyVar = new aooy(map, list2);
        this.j = aooyVar;
        this.c = aonrVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(aorg.U);
        arrayList.add(i2 == 1 ? aopw.a : new ObjectTypeAdapter$1(0));
        arrayList.add(excluder);
        arrayList.addAll(list);
        arrayList.add(aorg.A);
        arrayList.add(aorg.m);
        arrayList.add(aorg.g);
        arrayList.add(aorg.i);
        arrayList.add(aorg.k);
        aoon aoonVar = aorg.t;
        arrayList.add(new TypeAdapters$30(Long.TYPE, Long.class, aoonVar));
        arrayList.add(new TypeAdapters$30(Double.TYPE, Double.class, new aons()));
        arrayList.add(new TypeAdapters$30(Float.TYPE, Float.class, new aont()));
        arrayList.add(i3 == 2 ? aopv.a : aopv.c(i3));
        arrayList.add(aorg.o);
        arrayList.add(aorg.q);
        arrayList.add(new TypeAdapters$29(AtomicLong.class, new aonu(aoonVar).d()));
        arrayList.add(new TypeAdapters$29(AtomicLongArray.class, new aonv(aoonVar).d()));
        arrayList.add(aorg.s);
        arrayList.add(aorg.v);
        arrayList.add(aorg.C);
        arrayList.add(aorg.E);
        arrayList.add(new TypeAdapters$29(BigDecimal.class, aorg.x));
        arrayList.add(new TypeAdapters$29(BigInteger.class, aorg.y));
        arrayList.add(new TypeAdapters$29(aopb.class, aorg.z));
        arrayList.add(aorg.G);
        arrayList.add(aorg.I);
        arrayList.add(aorg.M);
        arrayList.add(aorg.O);
        arrayList.add(aorg.S);
        arrayList.add(aorg.K);
        arrayList.add(aorg.d);
        arrayList.add(DefaultDateTypeAdapter.a);
        arrayList.add(aorg.Q);
        if (aorm.a) {
            arrayList.add(aorm.c);
            arrayList.add(aorm.b);
            arrayList.add(aorm.d);
        }
        arrayList.add(ArrayTypeAdapter.a);
        arrayList.add(aorg.b);
        arrayList.add(new CollectionTypeAdapterFactory(aooyVar));
        arrayList.add(new MapTypeAdapterFactory(aooyVar));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(aooyVar);
        this.k = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(aorg.V);
        arrayList.add(new ReflectiveTypeAdapterFactory(aooyVar, i, excluder, jsonAdapterAnnotationTypeAdapterFactory, list2));
        this.b = DesugarCollections.unmodifiableList(arrayList);
    }
}
