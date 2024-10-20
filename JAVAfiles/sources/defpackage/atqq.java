package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atqq {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public atqq(Context context, armf armfVar, armf armfVar2, armf armfVar3, ahlp ahlpVar) {
        context.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        this.c = context;
        this.d = armfVar;
        this.a = armfVar3;
        this.b = ahlpVar;
        this.e = new ahvr(context, new ahsz(armfVar, 15), new ahsz(armfVar2, 16), new ahsz(armfVar3, 17));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List, java.lang.Object] */
    public final atox a(Type type, Annotation[] annotationArr) {
        type.getClass();
        annotationArr.getClass();
        int indexOf = this.d.indexOf(null) + 1;
        int size = this.d.size();
        for (int i = indexOf; i < size; i++) {
            atox a = ((atow) this.d.get(i)).a(type, annotationArr, this);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = this.d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((atow) this.d.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List, java.lang.Object] */
    public final atox b(Type type) {
        type.getClass();
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
        }
        return atom.d;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List, java.lang.Object] */
    public final atox c(Type type, Annotation[] annotationArr) {
        type.getClass();
        annotationArr.getClass();
        int indexOf = this.d.indexOf(null) + 1;
        int size = this.d.size();
        for (int i = indexOf; i < size; i++) {
            atox b = ((atow) this.d.get(i)).b(type);
            if (b != null) {
                return b;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = this.d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((atow) this.d.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final int d() {
        return ((arvc) this.b).b - ((arvc) this.a).b;
    }

    public final asga e(asga asgaVar) {
        if (d() == 127) {
            return asgaVar;
        }
        if (asgaVar.h) {
            ((arvc) this.d).b();
        }
        int i = ((arvc) this.b).b & 127;
        while (((AtomicReferenceArray) this.e).get(i) != null) {
            Thread.yield();
        }
        ((AtomicReferenceArray) this.e).lazySet(i, asgaVar);
        ((arvc) this.b).b();
        return null;
    }

    public final asga f() {
        asga asgaVar;
        while (true) {
            Object obj = this.a;
            Object obj2 = this.b;
            int i = ((arvc) obj).b;
            if (i - ((arvc) obj2).b == 0) {
                return null;
            }
            int i2 = i & 127;
            if (((arvc) this.a).c(i, i + 1) && (asgaVar = (asga) ((AtomicReferenceArray) this.e).getAndSet(i2, null)) != null) {
                if (asgaVar.h) {
                    ((arvc) this.d).a();
                    boolean z = arwh.a;
                }
                return asgaVar;
            }
        }
    }

    public final asga g(int i, boolean z) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = i & 127;
        asga asgaVar = (asga) ((AtomicReferenceArray) this.e).get(i2);
        if (asgaVar != null && asgaVar.h == z) {
            Object obj = this.e;
            do {
                atomicReferenceArray = (AtomicReferenceArray) obj;
                if (atomicReferenceArray.compareAndSet(i2, asgaVar, null)) {
                    if (z) {
                        ((arvc) this.d).a();
                    }
                    return asgaVar;
                }
            } while (atomicReferenceArray.get(i2) == asgaVar);
        }
        return null;
    }

    public final akjf h(String str) {
        akjf akjfVar;
        if (((ahlp) this.b).h(str)) {
            ahuk b = ((ahvr) this.e).b();
            if (b.e) {
                new apaq(b.i, ahuk.a).contains(aocu.TIKTOK);
            }
            b.d.getClass();
            b.f.getClass();
            apax apaxVar = b.g;
            apaxVar.getClass();
            aqjn.aE(apaxVar);
            apax apaxVar2 = b.h;
            apaxVar2.getClass();
            aqjn.aE(apaxVar2);
            ahul ahulVar = b.j;
            if (ahulVar == null) {
                ahulVar = ahul.a;
            }
            ahulVar.getClass();
            boolean z = b.k;
            ((ahvr) this.e).d();
            akjfVar = new akjf(z, b.l);
        } else {
            ahuj a = ((ahvr) this.e).a();
            if (a.e) {
                new apaq(a.j, ahuj.a).contains(aocu.TIKTOK);
            }
            a.d.getClass();
            a.f.getClass();
            apax apaxVar3 = a.h;
            apaxVar3.getClass();
            aqjn.aE(apaxVar3);
            apax apaxVar4 = a.i;
            apaxVar4.getClass();
            aqjn.aE(apaxVar4);
            ahul ahulVar2 = a.k;
            if (ahulVar2 == null) {
                ahulVar2 = ahul.a;
            }
            ahulVar2.getClass();
            boolean z2 = a.l;
            ((ahvr) this.e).e();
            akjfVar = new akjf(z2, a.m);
        }
        return akjfVar;
    }

    public final ListenableFuture i() {
        return ((ahvr) this.e).c(false);
    }

    public atqq(SharedPreferences sharedPreferences, Executor executor) {
        this.d = new ArrayDeque();
        this.a = sharedPreferences;
        this.e = "topic_operation_queue";
        this.c = ",";
        this.b = executor;
    }

    public atqq(Class cls, ClassLoader classLoader) {
        Class asSubclass = cls.asSubclass(albv.class);
        this.a = asSubclass;
        this.e = asSubclass.getMethod("getScopes", null);
        Method declaredMethod = Class.forName("alcg", false, classLoader).asSubclass(albv.class).getDeclaredMethod("newBuilder", null);
        this.d = declaredMethod;
        Class<?> returnType = declaredMethod.getReturnType();
        this.c = returnType.getMethod("build", null);
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        Method method = asSubclass.getMethod("getClientId", null);
        arrayList.add(new asmb(method, returnType.getMethod("setClientId", method.getReturnType())));
        Method method2 = asSubclass.getMethod("getClientEmail", null);
        arrayList.add(new asmb(method2, returnType.getMethod("setClientEmail", method2.getReturnType())));
        Method method3 = asSubclass.getMethod("getPrivateKey", null);
        arrayList.add(new asmb(method3, returnType.getMethod("setPrivateKey", method3.getReturnType())));
        Method method4 = asSubclass.getMethod("getPrivateKeyId", null);
        arrayList.add(new asmb(method4, returnType.getMethod("setPrivateKeyId", method4.getReturnType())));
        Method method5 = asSubclass.getMethod("getQuotaProjectId", null);
        arrayList.add(new asmb(method5, returnType.getMethod("setQuotaProjectId", method5.getReturnType())));
    }

    public atqq() {
        this.e = new AtomicReferenceArray(128);
        this.c = new arve(null, arvf.a);
        this.b = new arvc(0, arvf.a);
        arvf arvfVar = arvf.a;
        this.a = new arvc(0, arvfVar);
        this.d = new arvc(0, arvfVar);
    }

    public atqq(aslf aslfVar, aslx aslxVar, List list, List list2) {
        this.a = new ConcurrentHashMap();
        this.b = aslfVar;
        this.c = aslxVar;
        this.d = list;
        this.e = list2;
    }
}
