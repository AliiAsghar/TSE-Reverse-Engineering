package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asqe {
    public final Object a;
    public final Object b;
    public final Object c;

    public asqe(aknr aknrVar, aohs aohsVar, String str) {
        this.b = aknrVar;
        this.a = aohsVar;
        this.c = str;
    }

    static String i(String str) {
        return str.concat("|S|cre");
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.Queue] */
    public static final aiwu r(String str, aazm aazmVar, agcp agcpVar, arqr arqrVar, String str2, arqr arqrVar2) {
        anel anelVar = new anel(new aofm(arqrVar, arqrVar2, str2, 1));
        aazmVar.d.add(anelVar);
        aozy createBuilder = akie.a.createBuilder();
        createBuilder.getClass();
        akie k = akec.k(createBuilder);
        aozs aozsVar = aozs.a;
        apcc apccVar = apcc.a;
        return ahmc.ao(str, anelVar, k, aozs.a, new fcv(aazmVar, 8), algw.h(new aiww(akie.a)), agcpVar);
    }

    public static void s(asqe asqeVar, ansy ansyVar) {
        Object obj = ((asqe) ansyVar.b).a;
        long[] jArr = (long[]) ansyVar.a;
        ansz.b((long[]) asqeVar.a, (long[]) obj, jArr);
        asqe asqeVar2 = (asqe) ansyVar.b;
        Object obj2 = asqeVar2.b;
        long[] jArr2 = (long[]) asqeVar2.c;
        ansz.b((long[]) asqeVar.b, (long[]) obj2, jArr2);
        Object obj3 = ((asqe) ansyVar.b).c;
        long[] jArr3 = (long[]) ansyVar.a;
        ansz.b((long[]) asqeVar.c, (long[]) obj3, jArr3);
    }

    private final Method t(Class cls) {
        Object obj;
        Method u = u(cls, (String) this.a, (Class[]) this.b);
        if (u != null && (obj = this.c) != null) {
            if (!((Class) obj).isAssignableFrom(u.getReturnType())) {
                return null;
            }
            return u;
        }
        return u;
    }

    private static Method u(Class cls, String str, Class[] clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            if ((cls.getModifiers() & 1) == 0) {
                return u(cls.getSuperclass(), str, clsArr);
            }
            Method method = cls.getMethod(str, clsArr);
            try {
                if (1 != (method.getModifiers() & 1)) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [aost, java.lang.Object] */
    private final synchronized void v(String str) {
        InputStream inputStream;
        List list;
        if (!this.a.contains(str)) {
            try {
                try {
                    inputStream = ((aosm) this.c).b.open(str, 3);
                } catch (FileNotFoundException unused) {
                    aosm.a.logp(Level.WARNING, "com.google.i18n.phonenumbers.metadata.init.AndroidAssetMetadataLoader", "loadMetadata", String.format("File %s not found", str));
                    inputStream = null;
                } catch (IOException e) {
                    throw new aosn(String.format("Error while opening %s: ", str), e);
                }
                if (inputStream == null) {
                    list = Collections.emptyList();
                } else {
                    try {
                        try {
                            apax apaxVar = ((aosd) apag.parseFrom(aosd.a, inputStream, aozs.a())).b;
                            d.t(true ^ apaxVar.isEmpty(), "Empty metadata");
                            try {
                                inputStream.close();
                            } catch (IOException e2) {
                                aoso.a.logp(Level.WARNING, "com.google.i18n.phonenumbers.metadata.init.MetadataParser", "parse", "Error closing input stream (ignored)", (Throwable) e2);
                            }
                            list = apaxVar;
                        } catch (IOException e3) {
                            throw new IllegalStateException("Unable to parse metadata file", e3);
                        }
                    } catch (Throwable th) {
                        try {
                            inputStream.close();
                        } catch (IOException e4) {
                            aoso.a.logp(Level.WARNING, "com.google.i18n.phonenumbers.metadata.init.MetadataParser", "parse", "Error closing input stream (ignored)", (Throwable) e4);
                        }
                        throw th;
                    }
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.b.a((aosc) it.next());
                }
                this.a.add(str);
            } catch (IllegalArgumentException | IllegalStateException e5) {
                throw new IllegalStateException("Failed to read file ".concat(str), e5);
            }
        }
    }

    private static final String w(String str, String str2, String str3) {
        return str + "|T|" + str2 + "|" + str3;
    }

    public final Object a(Object obj, Object... objArr) {
        try {
            Method t = t(obj.getClass());
            if (t != null) {
                try {
                    return t.invoke(obj, objArr);
                } catch (IllegalAccessException e) {
                    AssertionError assertionError = new AssertionError("Unexpectedly could not call: ".concat(t.toString()));
                    assertionError.initCause(e);
                    throw assertionError;
                }
            }
            Object obj2 = this.a;
            throw new AssertionError("Method " + ((String) obj2) + " not supported for object " + String.valueOf(obj));
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError2 = new AssertionError("Unexpected exception");
            assertionError2.initCause(targetException);
            throw assertionError2;
        }
    }

    public final boolean b(Object obj) {
        if (t(obj.getClass()) != null) {
            return true;
        }
        return false;
    }

    public final void c(Object obj, Object... objArr) {
        try {
            Method t = t(obj.getClass());
            if (t == null) {
                return;
            }
            try {
                t.invoke(obj, objArr);
            } catch (IllegalAccessException unused) {
            }
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [aost, java.lang.Object] */
    public final aost d(String str) {
        if (!this.a.contains(str)) {
            v(str);
        }
        return this.b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized aohb e(String str, String str2, String str3) {
        aohb aohbVar;
        ?? r0 = this.b;
        String w = w(str, str2, str3);
        aohbVar = null;
        String string = r0.getString(w, null);
        if (!TextUtils.isEmpty(string)) {
            if (string.startsWith("{")) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    aohbVar = new aohb(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
                } catch (JSONException e) {
                    Log.w("FirebaseInstanceId", "Failed to parse token: ".concat(e.toString()));
                }
            } else {
                aohbVar = new aohb(string, null, 0L);
            }
        }
        return aohbVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void f() {
        this.c.clear();
        this.b.edit().clear().commit();
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void g(String str, String str2, String str3, String str4, String str5) {
        String str6;
        long currentTimeMillis = System.currentTimeMillis();
        long j = aohb.a;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str4);
            jSONObject.put("appVersion", str5);
            jSONObject.put("timestamp", currentTimeMillis);
            str6 = jSONObject.toString();
        } catch (JSONException e) {
            Log.w("FirebaseInstanceId", "Failed to encode token: ".concat(e.toString()));
            str6 = null;
        }
        if (str6 == null) {
            return;
        }
        SharedPreferences.Editor edit = this.b.edit();
        edit.putString(w(str, str2, str3), str6);
        edit.commit();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized boolean h() {
        return this.b.getAll().isEmpty();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void j(String str) {
        ?? r0 = this.b;
        long currentTimeMillis = System.currentTimeMillis();
        if (!r0.contains(i(str))) {
            ?? r02 = this.b;
            String i = i(str);
            SharedPreferences.Editor edit = r02.edit();
            edit.putString(i, String.valueOf(currentTimeMillis));
            edit.commit();
        } else {
            String string = this.b.getString(i(str), null);
            currentTimeMillis = 0;
            if (string != null) {
                try {
                    currentTimeMillis = Long.parseLong(string);
                } catch (NumberFormatException unused) {
                }
            }
        }
        this.c.put(str, Long.valueOf(currentTimeMillis));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set, java.lang.Object] */
    public final boolean k() {
        return this.c.isEmpty();
    }

    public final byte[] l() {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        ansz.a(jArr, (long[]) this.c);
        ansz.b(jArr2, (long[]) this.a, jArr);
        ansz.b(jArr3, (long[]) this.b, jArr);
        byte[] k = ansz.k(jArr3);
        k[31] = (byte) ((ansu.a(jArr2) << 7) ^ k[31]);
        return k;
    }

    public final IllegalArgumentException m() {
        Object obj = this.c;
        Object obj2 = this.b;
        Object obj3 = this.a;
        return new IllegalArgumentException("Multiple entries with same key: " + obj3.toString() + "=" + obj2.toString() + " and " + obj3.toString() + "=" + obj.toString());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final ListenableFuture n(ListenableFuture listenableFuture, ancs ancsVar) {
        Set set = (Set) this.c.b();
        alpr i = alpt.i(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            i.c(new akpf(ancsVar, (akph) it.next(), 0));
        }
        return ((alhm) this.a).c(new akdj(listenableFuture, 18), i.g());
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map, java.lang.Object] */
    public final ListenableFuture o(String str, ahtu ahtuVar) {
        int i;
        char c;
        long j;
        boolean z;
        double d;
        String str2;
        aozb aozbVar;
        aozb aozbVar2;
        Object obj = this.b.get(str);
        obj.getClass();
        akjb akjbVar = (akjb) obj;
        Object b = akjbVar.g.b();
        b.getClass();
        akij akijVar = (akij) b;
        aozy createBuilder = akie.a.createBuilder();
        createBuilder.getClass();
        int i2 = akjbVar.a;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        akie akieVar = (akie) apagVar;
        akieVar.b |= 8;
        akieVar.h = i2;
        if ((ahtuVar.b & 2) != 0) {
            aozb aozbVar3 = ahtuVar.d;
            aozbVar3.getClass();
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            akie akieVar2 = (akie) createBuilder.b;
            akieVar2.b |= 4;
            akieVar2.e = aozbVar3;
        }
        String str3 = ahtuVar.c;
        str3.getClass();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        akie akieVar3 = (akie) apagVar2;
        akieVar3.b |= 2;
        akieVar3.d = str3;
        String str4 = ahtuVar.e;
        str4.getClass();
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        akie akieVar4 = (akie) createBuilder.b;
        akieVar4.b |= 1;
        akieVar4.c = str4;
        long epochMilli = akjbVar.c.f().toEpochMilli();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        akie akieVar5 = (akie) createBuilder.b;
        akieVar5.b |= 16;
        akieVar5.i = epochMilli;
        apax apaxVar = ahtuVar.f;
        apaxVar.getClass();
        Iterator<E> it = apaxVar.iterator();
        while (true) {
            i = 3;
            if (!it.hasNext()) {
                break;
            }
            ahtw ahtwVar = (ahtw) it.next();
            apuv b2 = akijVar.b(ahtwVar.e);
            if (b2 != null) {
                DesugarCollections.unmodifiableList(((akie) createBuilder.b).f).getClass();
                ahtwVar.getClass();
                aozy createBuilder2 = akif.a.createBuilder();
                createBuilder2.getClass();
                String str5 = ahtwVar.e;
                str5.getClass();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                apag apagVar3 = createBuilder2.b;
                akif akifVar = (akif) apagVar3;
                akifVar.b |= 1;
                akifVar.e = str5;
                int i3 = b2.a - 1;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 != 4) {
                                    if (ahtwVar.c == 5) {
                                        aozbVar2 = (aozb) ahtwVar.d;
                                    } else {
                                        aozbVar2 = aozb.b;
                                    }
                                    aozbVar2.getClass();
                                    if (!createBuilder2.b.isMutable()) {
                                        createBuilder2.u();
                                    }
                                    akif akifVar2 = (akif) createBuilder2.b;
                                    akifVar2.c = 6;
                                    akifVar2.d = aozbVar2;
                                } else {
                                    if (ahtwVar.c == 5) {
                                        aozbVar = (aozb) ahtwVar.d;
                                    } else {
                                        aozbVar = aozb.b;
                                    }
                                    aozbVar.getClass();
                                    if (!createBuilder2.b.isMutable()) {
                                        createBuilder2.u();
                                    }
                                    akif akifVar3 = (akif) createBuilder2.b;
                                    akifVar3.c = 5;
                                    akifVar3.d = aozbVar;
                                }
                                c = 4;
                            } else {
                                if (ahtwVar.c == 4) {
                                    str2 = (String) ahtwVar.d;
                                } else {
                                    str2 = "";
                                }
                                str2.getClass();
                                if (!apagVar3.isMutable()) {
                                    createBuilder2.u();
                                }
                                akif akifVar4 = (akif) createBuilder2.b;
                                c = 4;
                                akifVar4.c = 4;
                                akifVar4.d = str2;
                            }
                        } else {
                            c = 4;
                            if (ahtwVar.c == 3) {
                                d = ((Double) ahtwVar.d).doubleValue();
                            } else {
                                d = 0.0d;
                            }
                            if (!createBuilder2.b.isMutable()) {
                                createBuilder2.u();
                            }
                            akif akifVar5 = (akif) createBuilder2.b;
                            akifVar5.c = 3;
                            akifVar5.d = Double.valueOf(d);
                        }
                    } else {
                        c = 4;
                        if (ahtwVar.c == 2) {
                            z = ((Boolean) ahtwVar.d).booleanValue();
                        } else {
                            z = false;
                        }
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        akif akifVar6 = (akif) createBuilder2.b;
                        akifVar6.c = 2;
                        akifVar6.d = Boolean.valueOf(z);
                    }
                } else {
                    c = 4;
                    if (ahtwVar.c == 1) {
                        j = ((Long) ahtwVar.d).longValue();
                    } else {
                        j = 0;
                    }
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    akif akifVar7 = (akif) createBuilder2.b;
                    akifVar7.c = 1;
                    akifVar7.d = Long.valueOf(j);
                }
                apag s = createBuilder2.s();
                s.getClass();
                akif akifVar8 = (akif) s;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                akie akieVar6 = (akie) createBuilder.b;
                apax apaxVar2 = akieVar6.f;
                if (!apaxVar2.c()) {
                    akieVar6.f = apag.mutableCopy(apaxVar2);
                }
                akieVar6.f.add(akifVar8);
            }
        }
        DesugarCollections.unmodifiableList(((akie) createBuilder.b).g).getClass();
        apax apaxVar3 = ahtuVar.g;
        apaxVar3.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : apaxVar3) {
            if (akijVar.b.containsKey((String) obj2)) {
                arrayList.add(obj2);
            }
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        akie akieVar7 = (akie) createBuilder.b;
        apax apaxVar4 = akieVar7.g;
        if (!apaxVar4.c()) {
            akieVar7.g = apag.mutableCopy(apaxVar4);
        }
        aoyj.addAll(arrayList, akieVar7.g);
        akie k = akec.k(createBuilder);
        try {
            return ancj.g(akjbVar.q.a(akjbVar.b, new akiq(akjbVar, k, i, null)), akto.d(new xrd((Object) akjbVar, (Object) k, (Object) akjbVar.a(k), 19, (byte[]) null)), akjbVar.h);
        } catch (apba e) {
            return albo.bH(e);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    public final List p() {
        ListenableFuture a;
        ?? r1 = this.b;
        ArrayList arrayList = new ArrayList(r1.size());
        for (Map.Entry entry : r1.entrySet()) {
            String str = (String) entry.getKey();
            akjb akjbVar = (akjb) entry.getValue();
            if (akjbVar.m.e()) {
                a = akjbVar.m.c();
            } else {
                a = akjbVar.q.a(akjbVar.b, new akdj(akjbVar, 7));
            }
            ListenableFuture Y = aktp.Y(a, new akez(agdl.p, 10), andi.a);
            akjb akjbVar2 = (akjb) entry.getValue();
            aozb aozbVar = null;
            if (akjbVar2.m.e()) {
                try {
                    aozbVar = ((akix) albo.bQ(akjbVar2.m.c())).a().a;
                } catch (ExecutionException unused) {
                }
            }
            arrayList.add(new asqe(str, Y, aozbVar));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final boolean q() {
        Collection values = this.b.values();
        if ((values instanceof Collection) && values.isEmpty()) {
            return false;
        }
        Iterator it = values.iterator();
        while (it.hasNext()) {
            if (((akjb) it.next()).b()) {
                return true;
            }
        }
        return false;
    }

    public asqe(alhm alhmVar, armf armfVar, armf armfVar2) {
        this.a = alhmVar;
        this.c = armfVar;
        this.b = armfVar2;
    }

    public asqe(arbj arbjVar) {
        this.a = arbjVar.a;
        this.c = arbjVar.b;
        this.b = arbjVar.c;
    }

    public asqe(Status status, arak arakVar, aqut aqutVar) {
        this.c = status;
        this.b = arakVar;
        this.a = aqutVar;
    }

    public asqe(Class cls, String str, Class... clsArr) {
        this.c = cls;
        this.a = str;
        this.b = clsArr;
    }

    public asqe(Object obj, arqw arqwVar, arqw arqwVar2) {
        this.c = obj;
        this.b = arqwVar;
        this.a = arqwVar2;
    }

    public asqe(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public asqe(Object obj, Object obj2, Object obj3, byte[] bArr) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public asqe(Map map, Map map2, aoga aogaVar) {
        this.b = map;
        this.c = map2;
        this.a = aogaVar;
    }

    public asqe() {
        this(new long[10], new long[10], new long[10]);
    }

    public asqe(Context context) {
        this.c = new tm();
        this.a = context;
        this.b = context.getSharedPreferences("com.google.android.gms.appid", 0);
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || h()) {
                return;
            }
            Log.i("FirebaseInstanceId", "App restored, clearing state");
            f();
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Error creating file in no backup dir: ".concat(String.valueOf(e.getMessage())));
            }
        }
    }

    public asqe(cg cgVar, aohs aohsVar, algw algwVar) {
        this.a = cgVar.x();
        this.b = aohsVar;
        this.c = algwVar;
    }

    public asqe(String str, ListenableFuture listenableFuture, aozb aozbVar) {
        str.getClass();
        this.b = str;
        this.c = listenableFuture;
        this.a = aozbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public asqe(android.content.Context r34, defpackage.qdq r35, java.util.Map r36, defpackage.asqc r37, defpackage.anen r38, defpackage.agcp r39, defpackage.algw r40, java.util.Map r41, defpackage.akic r42, defpackage.arqr r43, java.util.concurrent.Executor r44, java.util.Map r45, defpackage.arqv r46, defpackage.arqr r47, defpackage.ancs r48, defpackage.arqg r49) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asqe.<init>(android.content.Context, qdq, java.util.Map, asqc, anen, agcp, algw, java.util.Map, akic, arqr, java.util.concurrent.Executor, java.util.Map, arqv, arqr, ancs, arqg):void");
    }

    public asqe(ansy ansyVar) {
        this();
        s(this, ansyVar);
    }

    public asqe(asqe asqeVar) {
        this.a = Arrays.copyOf((long[]) asqeVar.a, 10);
        this.b = Arrays.copyOf((long[]) asqeVar.b, 10);
        this.c = Arrays.copyOf((long[]) asqeVar.c, 10);
    }

    public asqe(aoen aoenVar) {
        this.b = new HashSet();
        this.c = new HashSet();
        this.a = aoenVar;
    }

    public asqe(aory aoryVar, aost aostVar) {
        this.c = aoryVar;
        this.b = aostVar;
        this.a = alzz.N();
    }

    public asqe(Context context, PackageManager packageManager, anen anenVar) {
        context.getClass();
        anenVar.getClass();
        this.a = context;
        this.b = packageManager;
        this.c = anenVar;
    }

    public asqe(byte[] bArr) {
        this.a = new alob();
        this.b = new alob();
        this.c = "DEFAULT";
    }
}
