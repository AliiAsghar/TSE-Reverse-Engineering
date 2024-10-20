package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64OutputStream;
import android.util.Log;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aidu implements Callable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ aidu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.util.Collection, java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v92, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z;
        long epochMilli;
        aozy createBuilder;
        Long valueOf;
        String byteArrayOutputStream;
        boolean z2 = false;
        switch (this.b) {
            case 0:
                alqd alqdVar = new alqd(also.a);
                ?? r1 = this.a;
                int size = r1.size();
                for (int i = 0; i < size; i++) {
                    try {
                        try {
                            alqdVar.o(((alpt) Collection.EL.stream(((ahtv) albo.bQ((ListenableFuture) r1.get(i))).d).map(new agnz(16)).flatMap(new agnz(17)).flatMap(Function$CC.identity()).map(new agnz(18)).collect(alls.b)).g());
                        } catch (Throwable th) {
                            ((alvg) ((alvg) ((alvg) aidv.a.h()).g(th)).h("com/google/android/libraries/privatetelemetry/mobalt/experiments/PhenotypeExperimentIdsExtractor", "getExperimentIds", 'D', "PhenotypeExperimentIdsExtractor.java")).q("Couldn't decode ExperimentToken");
                            return aido.a;
                        }
                    } catch (Throwable th2) {
                        ((alvg) ((alvg) ((alvg) aidv.a.h()).g(th2)).h("com/google/android/libraries/privatetelemetry/mobalt/experiments/PhenotypeExperimentIdsExtractor", "getExperimentIds", '<', "PhenotypeExperimentIdsExtractor.java")).q("Couldn't extract ExperimentTokens");
                    }
                }
                alqf g = alqdVar.g();
                g.getClass();
                return new aidp(g);
            case 1:
                ((BroadcastReceiver.PendingResult) this.a).finish();
                return null;
            case 2:
                return egl.g((Context) this.a);
            case 3:
                int i2 = aipx.a;
                return ((Context) this.a).getExternalCacheDirs();
            case 4:
                return Boolean.valueOf(((agcp) this.a).z());
            case 5:
                airk airkVar = (airk) this.a;
                File b = airkVar.b();
                if (!b.exists()) {
                    aozy l = airkVar.g.l(airkVar.b, airkVar.c, airkVar.e);
                    if (!l.b.isMutable()) {
                        l.u();
                    }
                    aovf aovfVar = (aovf) l.b;
                    aovf aovfVar2 = aovf.a;
                    aovfVar.h = apag.emptyProtobufList();
                    if (!l.b.isMutable()) {
                        l.u();
                    }
                    ((aovf) l.b).e = apag.emptyProtobufList();
                    File file = new File(airkVar.g.f(), ahmc.H(Long.toString(Arrays.hashCode(((aovf) l.s()).toByteArray()))));
                    if (file.exists() && !b.exists()) {
                        try {
                            if (file.renameTo(b)) {
                                Log.d("MetadataFetcher", "Successfully renamed the old cache file.");
                                file = b;
                            } else {
                                Log.w("MetadataFetcher", "Failed to renamed the old cache file.");
                            }
                        } catch (Exception e) {
                            Log.w("MetadataFetcher", "Failed to renamed the old cache file.", e);
                        }
                    }
                    if (file.exists()) {
                        b = file;
                    }
                }
                try {
                    aozy createBuilder2 = aouu.a.createBuilder();
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(new FileInputStream(b), 32768);
                    try {
                        aozg J = aozg.J(gZIPInputStream);
                        createBuilder2.j(J);
                        J.z(0);
                        gZIPInputStream.close();
                        return (aouu) createBuilder2.s();
                    } catch (Throwable th3) {
                        try {
                            gZIPInputStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (FileNotFoundException e2) {
                    Log.d("MetadataFetcher", "Cached file " + b.getName() + " doesn't exist.");
                    throw e2;
                } catch (IOException e3) {
                    Log.w("MetadataFetcher", "Unexpected error reading cached file ".concat(String.valueOf(b.getName())), e3);
                    throw e3;
                }
            case 6:
                aiwp aiwpVar = (aiwp) this.a;
                Set<String> set = aiwpVar.d;
                if (set == null) {
                    set = aiwpVar.e.getAll().keySet();
                }
                SharedPreferences.Editor edit = aiwpVar.e.edit();
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    edit.remove(it.next());
                }
                if (edit.commit()) {
                    return null;
                }
                throw new IOException("Failed to remove migrated SharedPreferences keys: ".concat(String.valueOf(aiwpVar.c)));
            case 7:
                aiwp aiwpVar2 = (aiwp) this.a;
                aiwpVar2.e = aiwpVar2.a.getSharedPreferences(aiwpVar2.c, 0);
                Set set2 = aiwpVar2.d;
                if (set2 == null) {
                    return Boolean.valueOf(!aiwpVar2.e.getAll().isEmpty());
                }
                Iterator it2 = set2.iterator();
                while (it2.hasNext()) {
                    if (aiwpVar2.e.contains((String) it2.next())) {
                        return true;
                    }
                }
                return false;
            case 8:
                Object obj = this.a;
                synchronized (((aiwt) obj).b.c) {
                    ((aiwt) obj).a = null;
                }
                return null;
            case 9:
                alob alobVar = new alob();
                Iterator it3 = this.a.iterator();
                while (it3.hasNext()) {
                    alobVar.j((Iterable) albo.bQ((ListenableFuture) it3.next()));
                }
                return alobVar.g();
            case 10:
                Iterator it4 = this.a.iterator();
                while (it4.hasNext()) {
                    albo.bQ((ListenableFuture) it4.next());
                }
                return null;
            case 11:
                Object obj2 = this.a;
                File file2 = (File) obj2;
                if (file2.exists()) {
                    amat amatVar = amcu.a;
                    amaw amawVar = new amaw(amatVar, amatVar);
                    alpt n = alpt.n(new altx(obj2));
                    aluq listIterator = n.listIterator();
                    while (listIterator.hasNext()) {
                        amawVar.a.b(listIterator.next());
                    }
                    boolean z3 = true;
                    for (File file3 : new amau(amawVar, n)) {
                        if (!file2.equals(file3) && file3.exists()) {
                            file3.setWritable(true, true);
                            z3 &= file3.delete();
                        }
                    }
                    if (!z3 || !file2.setWritable(false, false) || file2.list().length != 0) {
                        file2.setWritable(true, true);
                        throw new RuntimeException("Failed to wipe: ".concat(String.valueOf(String.valueOf(obj2))));
                    }
                }
                return null;
            case 12:
                return albo.bQ(this.a);
            case 13:
                akyr akyrVar = akkp.i;
                ?? r0 = this.a;
                r0.getClass();
                if (!r0.isEmpty()) {
                    Iterator it5 = r0.iterator();
                    while (it5.hasNext()) {
                        Object bQ = albo.bQ((ListenableFuture) it5.next());
                        bQ.getClass();
                        if (!((Boolean) bQ).booleanValue()) {
                            return Boolean.valueOf(z2);
                        }
                    }
                }
                z2 = true;
                return Boolean.valueOf(z2);
            case 14:
                akmq.b();
                Object obj3 = this.a;
                try {
                    PrintWriter printWriter = ((akmq) obj3).h;
                    if (printWriter != null) {
                        printWriter.flush();
                    }
                    ArrayList arrayList = new ArrayList();
                    boolean z4 = false;
                    boolean z5 = false;
                    int i3 = 1;
                    while (i3 <= ((akmq) obj3).g) {
                        try {
                            File a = ((akmq) obj3).a(i3);
                            if (a.exists()) {
                                arrayList.add(new FileInputStream(a));
                                if (z4) {
                                    z = true;
                                    z5 = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = true;
                            }
                            i3++;
                            z4 = z;
                            z5 = z5;
                        } catch (Throwable th5) {
                            Iterator it6 = arrayList.iterator();
                            while (it6.hasNext()) {
                                ((InputStream) it6.next()).close();
                            }
                            throw th5;
                        }
                    }
                    File file4 = (File) ((akmq) obj3).d.get();
                    if (file4.exists()) {
                        arrayList.add(new FileInputStream(file4));
                    }
                    if (z5) {
                        arrayList.add(0, akmq.c);
                    }
                    return new SequenceInputStream(Collections.enumeration(arrayList));
                } catch (IllegalArgumentException e4) {
                    Log.e(akmq.a, "Error while obtaining bytes from internal logs", e4);
                    throw e4;
                }
            case 15:
                alpr alprVar = new alpr();
                Object obj4 = this.a;
                try {
                    Iterator<E> it7 = ((akom) obj4).a().f.iterator();
                    while (it7.hasNext()) {
                        alprVar.c(ajwt.a(((Integer) it7.next()).intValue()));
                    }
                    return alprVar.g();
                } catch (IOException e5) {
                    ((akom) obj4).f(e5);
                    return alprVar.g();
                }
            case 16:
                Object obj5 = this.a;
                akom akomVar = (akom) obj5;
                akomVar.b.writeLock().lock();
                try {
                    if (((akom) obj5).f.get()) {
                        valueOf = Long.valueOf(((akom) obj5).g);
                    } else {
                        try {
                            akpk a2 = ((akom) obj5).a();
                            epochMilli = a2.c;
                            createBuilder = a2.toBuilder();
                        } catch (IOException e6) {
                            ((akom) obj5).f(e6);
                            epochMilli = ((akom) obj5).e.f().toEpochMilli();
                            createBuilder = akpk.a.createBuilder();
                        }
                        if (epochMilli > 0) {
                            ((akom) obj5).g = epochMilli;
                            ((akom) obj5).f.set(true);
                            valueOf = Long.valueOf(((akom) obj5).g);
                        } else {
                            long epochMilli2 = ((akom) obj5).e.f().toEpochMilli();
                            ((akom) obj5).g = epochMilli2;
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            akpk akpkVar = (akpk) createBuilder.b;
                            akpkVar.b |= 1;
                            akpkVar.c = epochMilli2;
                            try {
                                try {
                                    ((akom) obj5).e((akpk) createBuilder.s());
                                    ((akom) obj5).f.set(true);
                                } catch (Throwable th6) {
                                    ((akom) obj5).f.set(true);
                                    throw th6;
                                }
                            } catch (IOException e7) {
                                ((alvg) ((alvg) ((alvg) akom.a.i()).g(e7)).h("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "getSyncEpoch", (char) 139, "SyncManagerDataStore.java")).q("Could not write sync epoch. Using current time but future runs may be delayed.");
                                ((akom) obj5).f.set(false);
                            }
                            valueOf = Long.valueOf(((akom) obj5).g);
                        }
                    }
                    return valueOf;
                } finally {
                    akomVar.b.writeLock().unlock();
                }
            case 17:
                return this.a.keySet();
            case 18:
                return this.a;
            case 19:
                Object obj6 = this.a;
                synchronized (obj6) {
                    Object a3 = ((aogo) obj6).a.a();
                    List p = ((aojh) a3).p();
                    ((aojh) a3).q();
                    JSONArray jSONArray = new JSONArray();
                    for (int i4 = 0; i4 < p.size(); i4++) {
                        aogt aogtVar = (aogt) p.get(i4);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("agent", aogtVar.a);
                        jSONObject.put("dates", new JSONArray((java.util.Collection) aogtVar.b));
                        jSONArray.put(jSONObject);
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("heartbeats", jSONArray);
                    jSONObject2.put(BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION, "2");
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                    try {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                        try {
                            gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                            gZIPOutputStream.close();
                            base64OutputStream.close();
                            byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                        } finally {
                        }
                    } finally {
                    }
                }
                return byteArrayOutputStream;
            default:
                Object obj7 = this.a;
                synchronized (obj7) {
                    ((aojh) ((aogo) obj7).a.a()).s(System.currentTimeMillis(), ((aojm) ((aogo) obj7).b.a()).a());
                }
                return null;
        }
    }
}
