package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPOutputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class agui implements algk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ agui(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v152, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r2v54, types: [android.content.ComponentCallbacks, java.lang.Object] */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        int i;
        int i2;
        Object obj2;
        aouy aouyVar;
        SQLiteDatabase e;
        aguw aguwVar = null;
        int i3 = 0;
        boolean z = false;
        switch (this.b) {
            case 0:
                aguj agujVar = (aguj) this.a;
                aguw aguwVar2 = (aguw) obj;
                String o = agujVar.c.a().o("emoji_variant_global_prefs");
                try {
                    aguwVar = (aguw) apag.parseFrom(aguw.a, amcn.e.k(o), aozs.a());
                } catch (apba | IllegalArgumentException e2) {
                    ((alvg) ((alvg) ((alvg) agur.a.h()).g(e2)).h("com/google/android/libraries/inputmethod/emoji/data/EmojiVariantPreferencesBackupHelper", "retrieveBackupForGlobalPreference", ']', "EmojiVariantPreferencesBackupHelper.java")).q("Unable to parse the retrieved backup proto");
                }
                if (!TextUtils.isEmpty(o)) {
                    alvi alviVar = agzo.a;
                    agzn.a.b(aguu.a, 3);
                }
                HashMap hashMap = new HashMap();
                if (((Boolean) agur.c.b()).booleanValue() && aguwVar != null) {
                    agve agveVar = aguwVar.c;
                    if (agveVar == null) {
                        agveVar = agve.a;
                    }
                    alog n = alog.n(agveVar.b);
                    i3 = aguj.c(n);
                    i = aguj.b(n);
                    hashMap.putAll(DesugarCollections.unmodifiableMap(aguwVar.d));
                } else {
                    i = 0;
                }
                agve agveVar2 = aguwVar2.c;
                if (agveVar2 == null) {
                    agveVar2 = agve.a;
                }
                alog n2 = alog.n(agveVar2.b);
                int c = aguj.c(n2);
                if (c != 0) {
                    i3 = c;
                }
                int b = aguj.b(n2);
                if (b != 0) {
                    i = b;
                }
                hashMap.putAll(DesugarCollections.unmodifiableMap(aguwVar2.d));
                aozy createBuilder = aguw.a.createBuilder();
                aozy createBuilder2 = agve.a.createBuilder();
                if (i3 != 0) {
                    aozy createBuilder3 = agvd.a.createBuilder();
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    agvd agvdVar = (agvd) createBuilder3.b;
                    agvdVar.c = Integer.valueOf(i3 - 1);
                    agvdVar.b = 1;
                    createBuilder2.bm(createBuilder3);
                }
                if (i != 0) {
                    aozy createBuilder4 = agvd.a.createBuilder();
                    if (!createBuilder4.b.isMutable()) {
                        createBuilder4.u();
                    }
                    agvd agvdVar2 = (agvd) createBuilder4.b;
                    agvdVar2.c = Integer.valueOf(i - 1);
                    agvdVar2.b = 2;
                    createBuilder2.bm(createBuilder4);
                }
                agve agveVar3 = (agve) createBuilder2.s();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                aguw aguwVar3 = (aguw) createBuilder.b;
                agveVar3.getClass();
                aguwVar3.c = agveVar3;
                aguwVar3.b |= 1;
                createBuilder.aq(hashMap);
                aguw aguwVar4 = (aguw) createBuilder.s();
                if (!aguwVar4.equals(aguwVar2)) {
                    agujVar.a(aguwVar4);
                }
                return aguwVar4;
            case 1:
                return this.a;
            case 2:
                Object obj3 = this.a;
                alor alorVar = (alor) obj;
                alpr alprVar = new alpr();
                for (Integer num : agul.b((Context) obj3, agul.a())) {
                    num.intValue();
                    alog alogVar = (alog) alorVar.get(num);
                    if (alogVar != null) {
                        int size = alogVar.size();
                        int i4 = 0;
                        while (i4 < size) {
                            agun agunVar = (agun) alogVar.get(i4);
                            alprVar.c(agunVar.a);
                            alprVar.c(agunVar.a);
                            alog alogVar2 = agunVar.b;
                            int size2 = alogVar2.size();
                            int i5 = 0;
                            while (true) {
                                i2 = i4 + 1;
                                if (i5 < size2) {
                                    alprVar.c((String) alogVar2.get(i5));
                                    i5++;
                                }
                            }
                            i4 = i2;
                        }
                    }
                }
                return alprVar.g();
            case 3:
                try {
                    return new ProcessBuilder("/system/bin/trigger_perfetto", (String) obj).start();
                } catch (IOException unused) {
                    ((ahna) this.a).b = true;
                    return null;
                }
            case 4:
                acjk acjkVar = (acjk) ((adjw) obj).a;
                abhg.m(acjkVar.a);
                int i6 = acjkVar.a.a;
                if (i6 == 1 || i6 == 3) {
                    z = true;
                }
                Object obj4 = this.a;
                Boolean valueOf = Boolean.valueOf(z);
                ((AtomicReference) ((aquq) obj4).a).set(valueOf);
                return valueOf;
            case 5:
                return (ahur) ((adef) this.a).b.get((String) obj);
            case 6:
                ConcurrentMap concurrentMap = ahux.a;
                aozy createBuilder5 = ahup.a.createBuilder();
                for (Map.Entry entry : DesugarCollections.unmodifiableMap(((ahup) obj).b).entrySet()) {
                    Object obj5 = this.a;
                    ahun ahunVar = (ahun) entry.getValue();
                    aozy createBuilder6 = ahun.a.createBuilder();
                    if (!ahunVar.d.equals(obj5)) {
                        String str = ahunVar.d;
                        if (!createBuilder6.b.isMutable()) {
                            createBuilder6.u();
                        }
                        ahun ahunVar2 = (ahun) createBuilder6.b;
                        str.getClass();
                        ahunVar2.b |= 1;
                        ahunVar2.d = str;
                    }
                    for (String str2 : ahunVar.c) {
                        if (!str2.equals(obj5)) {
                            createBuilder6.at(str2);
                        }
                    }
                    createBuilder5.au((String) entry.getKey(), (ahun) createBuilder6.s());
                }
                return (ahup) createBuilder5.s();
            case 7:
                ConcurrentMap concurrentMap2 = ahux.a;
                ahun ahunVar3 = ahun.a;
                apbo apboVar = ((ahup) obj).b;
                Object obj6 = this.a;
                if (apboVar.containsKey(obj6)) {
                    ahunVar3 = (ahun) apboVar.get(obj6);
                }
                return ahunVar3.c;
            case 8:
                ConcurrentMap concurrentMap3 = ahux.a;
                Object obj7 = this.a;
                ahun ahunVar4 = ahun.a;
                obj7.getClass();
                apbo apboVar2 = ((ahup) obj).b;
                if (apboVar2.containsKey(obj7)) {
                    ahunVar4 = (ahun) apboVar2.get(obj7);
                }
                return ahunVar4.d;
            case 9:
                ahum ahumVar = (ahum) obj;
                ajur ajurVar = new ajur(null);
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskWrites().build());
                Object obj8 = this.a;
                try {
                    try {
                        synchronized (ahvr.a) {
                            agcp agcpVar = (agcp) ((ahvr) obj8).f.get();
                            Uri uri = ((ahvr) obj8).h;
                            ahuj ahujVar = ahumVar.c;
                            if (ahujVar == null) {
                                ahujVar = ahuj.b;
                            }
                            aiwb aiwbVar = new aiwb(ahujVar);
                            aiwbVar.a = new ajur[]{ajurVar};
                            agcpVar.s(uri, aiwbVar);
                            ahuj ahujVar2 = ahumVar.c;
                            if (ahujVar2 == null) {
                                ahujVar2 = ahuj.b;
                            }
                            ((ahvr) obj8).i = ahujVar2;
                        }
                        synchronized (ahvr.b) {
                            agcp agcpVar2 = (agcp) ((ahvr) obj8).f.get();
                            Uri uri2 = ((ahvr) obj8).j;
                            ahuk ahukVar = ahumVar.d;
                            if (ahukVar == null) {
                                ahukVar = ahuk.b;
                            }
                            aiwb aiwbVar2 = new aiwb(ahukVar);
                            aiwbVar2.a = new ajur[]{ajurVar};
                            agcpVar2.s(uri2, aiwbVar2);
                            ahuk ahukVar2 = ahumVar.d;
                            if (ahukVar2 == null) {
                                ahukVar2 = ahuk.b;
                            }
                            ((ahvr) obj8).k = ahukVar2;
                        }
                        return null;
                    } catch (IOException e3) {
                        throw new RuntimeException(e3);
                    }
                } finally {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
            case 10:
                ((alvg) ((alvg) ((alvg) aiea.a.h()).g((Throwable) obj)).h("com/google/android/libraries/privatetelemetry/mobalt/impl/MobaltPeriodicJobImpl", "recordSaveFailure", 354, "MobaltPeriodicJobImpl.java")).q("Mobalt: one or more reports failed observation generation");
                aiea aieaVar = (aiea) this.a;
                aieaVar.o.A(aieaVar.c, (int) aieaVar.d, "SAVE_ERROR");
                return null;
            case 11:
                aiea aieaVar2 = (aiea) this.a;
                RuntimeException runtimeException = (RuntimeException) obj;
                aieaVar2.o.A(aieaVar2.c, (int) aieaVar2.d, "UPLOAD_ERROR");
                throw runtimeException;
            case 12:
                aidt aidtVar = (aidt) obj;
                aiek aiekVar = (aiek) this.a;
                aids.a.put(new aidr(aiekVar.a, aiekVar.b), aidtVar);
                if (aidtVar.a() != 2) {
                    return aidtVar.b();
                }
                throw new aiej("Error attempting to extract the Experiment IDs from Phenotype");
            case 13:
                aieo aieoVar = (aieo) this.a;
                RuntimeException runtimeException2 = (RuntimeException) obj;
                aieoVar.l.C(aieoVar.f, (int) aieoVar.g, "UNEXPECTED_EXCEPTION");
                throw runtimeException2;
            case 14:
                aieo aieoVar2 = (aieo) this.a;
                IllegalArgumentException illegalArgumentException = (IllegalArgumentException) obj;
                aieoVar2.l.C(aieoVar2.f, (int) aieoVar2.g, "INVALID_METRIC_PARAMS");
                throw illegalArgumentException;
            case 15:
                aieo aieoVar3 = (aieo) this.a;
                aieoVar3.l.C(aieoVar3.f, (int) aieoVar3.g, "EXPERIMENT_IDS_DECODING_ERROR");
                return alth.c;
            case 16:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                ArrayList arrayList = new ArrayList();
                for (String str3 : ((agcp) ((aiqj) this.a).k).v()) {
                    if (linkedHashMap.containsKey(str3)) {
                        arrayList.add((aova) linkedHashMap.get(str3));
                    }
                }
                return arrayList;
            case 17:
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) obj;
                Object obj9 = this.a;
                if (linkedHashMap2.containsKey(obj9)) {
                    return (aova) linkedHashMap2.get(obj9);
                }
                throw new NoSuchElementException(a.bW((String) obj9, "Sticker pack ", " not found."));
            case 18:
                Iterator<E> it = ((aova) obj).h.iterator();
                do {
                    obj2 = this.a;
                    if (it.hasNext()) {
                        aouyVar = (aouy) it.next();
                    } else {
                        throw new NoSuchElementException(a.bW((String) obj2, "Sticker ", " not found."));
                    }
                } while (!((String) obj2).equals(aouyVar.b));
                return aouyVar;
            case 19:
                aouu aouuVar = (aouu) obj;
                Object obj10 = this.a;
                airk airkVar = (airk) obj10;
                File b2 = airkVar.b();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new FileOutputStream(b2), 32768);
                    try {
                        aouuVar.writeTo(gZIPOutputStream);
                        gZIPOutputStream.close();
                        ((Context) ((airk) obj10).g.a).getSharedPreferences("expressive_sticker_client_prefs", 0).edit().putString("last_cached_metadata_version", ((airk) obj10).b).apply();
                        Log.d("MetadataFetcher", "Save last cached metadata version: " + ((airk) obj10).b);
                    } finally {
                    }
                } catch (IOException e4) {
                    Log.w("MetadataFetcher", "Failed to cache ".concat(String.valueOf(b2.getName())), e4);
                    ((airh) airkVar.g.g).c(46);
                }
                return aouuVar;
            default:
                ?? r2 = this.a;
                aixj aixjVar = (aixj) r2;
                File databasePath = aixjVar.b.getDatabasePath((String) obj);
                if (!aixjVar.l) {
                    ahmn ahmnVar = aixjVar.o;
                    String path = databasePath.getPath();
                    if (ahmnVar.a.add(path)) {
                        aixjVar.l = true;
                        boolean f = aixj.f(aixjVar.b, aixjVar.n);
                        aixjVar.m = f;
                        if (f) {
                            try {
                                File cacheDir = ((aixj) r2).b.getCacheDir();
                                if (cacheDir != null) {
                                    ((aixj) r2).m = databasePath.getCanonicalPath().startsWith(cacheDir.getCanonicalPath());
                                }
                            } catch (IOException unused2) {
                            }
                        }
                    } else {
                        throw new IllegalStateException(a.bW(path, "DB ", " opened from different AsyncSQLiteOpenHelper. Are you missing a scope on your binding?"));
                    }
                }
                Set set = aixjVar.g;
                if (!set.isEmpty()) {
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) ((WeakReference) it2.next()).get();
                        if (sQLiteDatabase != null) {
                            if (sQLiteDatabase.isOpen()) {
                                throw new IllegalStateException("Open database reference to " + sQLiteDatabase.getPath() + " already exists. Follow instructions in source to file a bug against TikTok.");
                            }
                        } else {
                            it2.remove();
                        }
                    }
                }
                try {
                    try {
                        e = aixj.e(((aixj) r2).b, databasePath, ((aixj) r2).n, ((aixj) r2).d, ((aixj) r2).e, ((aixj) r2).f);
                    } catch (aixh e5) {
                        ((alvg) ((alvg) ((alvg) aixj.a.h()).g(e5)).h("com/google/android/libraries/storage/sqlite/AsyncSQLiteOpenHelper", "innerOpenDatabase", (char) 447, "AsyncSQLiteOpenHelper.java")).q("Fatal Exception when trying to upgrade database. Proceeding to delete.");
                        try {
                            File file = new File(String.valueOf(databasePath.getPath()).concat("-wal"));
                            File file2 = new File(String.valueOf(databasePath.getPath()).concat("-journal"));
                            File file3 = new File(String.valueOf(databasePath.getPath()).concat("-shm"));
                            try {
                                if ((file.exists() && !file.delete()) || ((file2.exists() && !file2.delete()) || ((file3.exists() && !file3.delete()) || !databasePath.delete()))) {
                                    throw new aixg(String.format("Unable to clean up database %s", databasePath.getAbsolutePath()));
                                }
                                throw new aixf("Failed to open the database with an unrecoverable Exception. Deleted its files so the next open attempt will create a new instance.", e5);
                            } catch (Throwable th) {
                                throw new aixg(String.format("Unable to clean up database %s", databasePath.getAbsolutePath()), th);
                            }
                        } catch (Throwable th2) {
                            throw new aixf("Recovery by deletion failed.", th2);
                        }
                    } catch (aixi e6) {
                        throw new aixf("Probably-recoverable database upgrade failure.", e6);
                    }
                } catch (aixf | aixh | aixi unused3) {
                    e = aixj.e(((aixj) r2).b, databasePath, ((aixj) r2).n, ((aixj) r2).d, ((aixj) r2).e, ((aixj) r2).f);
                }
                aixjVar.g.add(new WeakReference(e));
                aixjVar.b.registerComponentCallbacks(r2);
                return e;
        }
    }
}
