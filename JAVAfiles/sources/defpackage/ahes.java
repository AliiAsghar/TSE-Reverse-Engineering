package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ahes implements Callable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ahes(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r0v74, types: [akew, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v112, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, apbt] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v52, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v57, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v58, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v56, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v64, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v72, types: [java.util.Set, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        ailh ailhVar;
        boolean z;
        boolean z2;
        akie k;
        alor a;
        alor g;
        int i = 4;
        int i2 = 3;
        switch (this.c) {
            case 0:
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    ((ahed) albo.bQ((ListenableFuture) it.next())).a(null);
                }
                return this.b;
            case 1:
                ?? r0 = this.b;
                ArrayList arrayList = new ArrayList(r0.size());
                for (ahci ahciVar : r0) {
                    Object obj = this.a;
                    arrayList.add(new agrk(ahciVar, ((ahcg) obj).b.a(ahciVar)));
                }
                return arrayList;
            case 2:
                return Boolean.valueOf(((aiim) this.a).b.containsKey(this.b));
            case 3:
                return algw.h((ListenableFuture) ((aiim) this.a).b.get(this.b));
            case 4:
                ajur ajurVar = new ajur(null);
                ?? r2 = this.b;
                Object obj2 = this.a;
                try {
                    agcp f = ((ahta) ((akkw) obj2).a).f();
                    Object obj3 = ((akkw) obj2).d;
                    aiwb aiwbVar = new aiwb(r2);
                    aiwbVar.a = new ajur[]{ajurVar};
                } catch (IOException | RuntimeException e) {
                    akkw akkwVar = (akkw) obj2;
                    ahof.b(Level.WARNING, ((ahta) akkwVar.a).d(), e, "Failed to update snapshot for %s flags may be stale.", akkwVar.c);
                }
                return null;
            case 5:
                ?? r02 = this.b;
                ?? r22 = this.a;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll((Collection) Collection.EL.stream((List) albo.bQ(r22)).map(new aiec(i2)).collect(Collectors.toList()));
                arrayList2.addAll((java.util.Collection) Collection.EL.stream((List) albo.bQ(r02)).map(new aiec(i)).collect(Collectors.toList()));
                return arrayList2;
            case 6:
                Object obj4 = this.b;
                advr.c("LegacyDiscoveryStrategy: looking up proxy %s", obj4);
                ailn ailnVar = (ailn) this.a;
                List<atmb> list = (List) ailnVar.a.b((String) obj4).get();
                ArrayList arrayList3 = new ArrayList();
                for (atmb atmbVar : list) {
                    if (atmbVar == null) {
                        advr.q("Skipping invalid NAPTR null record", new Object[0]);
                    } else {
                        arrayList3.add(atmbVar.c.toString());
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    List<atng> list2 = (List) ailnVar.a.c((String) it2.next()).get();
                    ArrayList<arbj> arrayList5 = new ArrayList();
                    for (atng atngVar : list2) {
                        if (atngVar == null) {
                            advr.q("Skipping invalid SRV null record", new Object[0]);
                        } else {
                            arbj c = ailnVar.c(atngVar);
                            if (c != null) {
                                arrayList5.add(c);
                            }
                        }
                    }
                    for (arbj arbjVar : arrayList5) {
                        arbjVar.getClass();
                        Object obj5 = arbjVar.c;
                        obj5.getClass();
                        String atmkVar = ((atmx) obj5).f.toString();
                        if (atmkVar.startsWith("_sip._udp")) {
                            ailhVar = ailh.UDP;
                        } else if (atmkVar.startsWith("_sip._tcp")) {
                            ailhVar = ailh.TCP;
                        } else if (atmkVar.startsWith("_sips._tcp")) {
                            ailhVar = ailh.TLS;
                        } else {
                            advr.q("NAPTR response contains unknown protocol: %s", atmkVar);
                            ailhVar = null;
                        }
                        if (ailhVar == null) {
                            ailhVar = ailh.TCP;
                        }
                        arrayList4.add(new aili((String) arbjVar.a, (String) arbjVar.b, ((atng) obj5).c, ailhVar));
                    }
                }
                return arrayList4;
            case 7:
                Iterator it3 = this.b.iterator();
                while (true) {
                    Object obj6 = this.a;
                    if (it3.hasNext()) {
                        ((agcp) ((aiqj) obj6).k).w((String) it3.next(), true);
                    } else {
                        ((agcp) ((aiqj) obj6).k).x(true);
                        return null;
                    }
                }
            case 8:
                URL url = new URL((String) this.b);
                Object obj7 = this.a;
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection(((airn) obj7).b);
                try {
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setConnectTimeout(((airn) obj7).c);
                    httpURLConnection.setInstanceFollowRedirects(true);
                    for (Map.Entry entry : ((airn) obj7).d.entrySet()) {
                        httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Log.d("HttpFetcherImpl", "HTTP: " + responseCode + " " + httpURLConnection.getResponseMessage());
                    if (responseCode >= 200 && responseCode <= 299) {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr = new byte[16384];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read > 0) {
                                byteArrayOutputStream.write(bArr, 0, read);
                            } else {
                                inputStream.close();
                                byteArrayOutputStream.close();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                Log.d("HttpFetcherImpl", "HTTP: response size=" + byteArray.length);
                                return byteArray;
                            }
                        }
                    } else {
                        throw new IOException(a.bV(responseCode, "HTTP request failed with code: "));
                    }
                } finally {
                    httpURLConnection.disconnect();
                }
                break;
            case 9:
                byte[] bArr2 = aiwh.a;
                Object obj8 = this.a;
                try {
                    aoaz aoazVar = new aoaz((byte[]) this.b, aocj.b(new byte[0]));
                    byte[] b = amcp.b((InputStream) obj8);
                    if (b != null) {
                        byte[] bArr3 = aoazVar.b;
                        int length = bArr3.length + 28;
                        if (b.length >= length) {
                            if (anuk.e(bArr3, b)) {
                                AlgorithmParameterSpec b2 = anpq.b(b, aoazVar.b.length, 12);
                                SecretKey secretKey = aoazVar.a;
                                Cipher c2 = anpq.c();
                                c2.init(2, secretKey, b2);
                                return c2.doFinal(b, aoazVar.b.length + 12, (r6 - r3) - 12);
                            }
                            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
                        }
                        throw new GeneralSecurityException("ciphertext too short");
                    }
                    throw new NullPointerException("ciphertext is null");
                } finally {
                    ((InputStream) obj8).close();
                }
            case 10:
                aixe aixeVar = (aixe) this.a;
                aixeVar.d.s();
                try {
                    return this.b.call();
                } finally {
                    aixeVar.d.r();
                }
            case 11:
                ajzl ajzlVar = (ajzl) albo.bQ(this.a);
                List list3 = (List) albo.bQ(this.b);
                if ((ajzlVar.b & 1) != 0) {
                    return akfa.a(list3, Instant.ofEpochMilli(ajzlVar.c));
                }
                return akfa.a;
            case 12:
                akac akacVar = (akac) this.a;
                File file = new File(akacVar.d.A((aknr) this.b), akac.a(akacVar.b));
                file.mkdirs();
                return file;
            case 13:
                ?? r03 = this.b;
                albo.bQ(this.a);
                albo.bQ(r03);
                return null;
            case 14:
                this.b.run();
                return this.a;
            case 15:
                Set set = (Set) albo.bQ(this.a);
                java.util.Collection collection = (java.util.Collection) albo.bQ(this.b);
                alob alobVar = new alob();
                Iterator it4 = collection.iterator();
                while (it4.hasNext()) {
                    Integer num = null;
                    for (String str : ((gtl) it4.next()).c) {
                        if (str.startsWith("account_id_")) {
                            if (num == null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            albo.U(z2, "Account ID already found. This work is tagged for two accounts.");
                            num = Integer.valueOf(Integer.parseInt(str.replace("account_id_", "")));
                        }
                    }
                    if (num != null && num.intValue() != -1) {
                        ajwt a2 = ajwt.a(num.intValue());
                        if (!set.contains(a2)) {
                            d.s(true);
                            if (a2.a != -1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            d.s(z);
                            alobVar.h("account_id_" + a2.a);
                        }
                    } else {
                        throw new IllegalArgumentException("Input set had no valid account in it.");
                    }
                }
                return alobVar.g();
            case 16:
                ?? r04 = this.b;
                Object obj9 = this.a;
                Object call = r04.call();
                akdq akdqVar = (akdq) obj9;
                Throwable th = (Throwable) akdqVar.a.get();
                akdqVar.a.remove();
                if (th == null) {
                    return call;
                }
                throw th;
            case 17:
                return this.a.a((ansy) ((atsg) this.b).a);
            case 18:
                Object obj10 = this.a;
                try {
                    k = (akie) albo.bQ(this.b);
                } catch (ExecutionException e2) {
                    if ((e2.getCause() instanceof IOException) && !(e2.getCause() instanceof aive)) {
                        aozy createBuilder = akie.a.createBuilder();
                        createBuilder.getClass();
                        k = akec.k(createBuilder);
                    } else {
                        throw e2;
                    }
                }
                aozy createBuilder2 = ahts.a.createBuilder();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                ahts ahtsVar = (ahts) createBuilder2.b;
                ahtsVar.c = a.ak(4);
                ahtsVar.b |= 1;
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                ahts ahtsVar2 = (ahts) createBuilder2.b;
                ahtsVar2.d = a.au(15);
                ahtsVar2.b |= 2;
                try {
                    a = ((akjb) obj10).a(k);
                } catch (apba e3) {
                    Log.e("MendelPackageState", "Failed to parse flag", e3);
                    aozy createBuilder3 = akie.a.createBuilder();
                    createBuilder3.getClass();
                    k = akec.k(createBuilder3);
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    ahts ahtsVar3 = (ahts) createBuilder2.b;
                    ahtsVar3.c = a.ak(3);
                    ahtsVar3.b |= 1;
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    ahts ahtsVar4 = (ahts) createBuilder2.b;
                    ahtsVar4.d = a.au(13);
                    ahtsVar4.b |= 2;
                    a = ((akjb) obj10).a(k);
                } catch (RuntimeException e4) {
                    Log.e("MendelPackageState", "Failed to parse flag", e4);
                    aozy createBuilder4 = akie.a.createBuilder();
                    createBuilder4.getClass();
                    k = akec.k(createBuilder4);
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    ahts ahtsVar5 = (ahts) createBuilder2.b;
                    ahtsVar5.c = a.ak(3);
                    ahtsVar5.b |= 1;
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    ahts ahtsVar6 = (ahts) createBuilder2.b;
                    ahtsVar6.d = a.au(11);
                    ahtsVar6.b |= 2;
                    a = ((akjb) obj10).a(k);
                }
                aozy createBuilder5 = ahtt.a.createBuilder();
                if (!createBuilder5.b.isMutable()) {
                    createBuilder5.u();
                }
                ahtt ahttVar = (ahtt) createBuilder5.b;
                ahts ahtsVar7 = (ahts) createBuilder2.s();
                ahtsVar7.getClass();
                ahttVar.d = ahtsVar7;
                ahttVar.b |= 2;
                akjb akjbVar = (akjb) obj10;
                akjbVar.c(createBuilder5);
                return (akix) akjbVar.f.a(a, akec.C(k, createBuilder5, akjbVar.r, akjbVar.e));
            case 19:
                asqe asqeVar = (asqe) this.a;
                arrt arrtVar = new arrt((PackageManager) asqeVar.b);
                ?? r3 = arrtVar.c;
                String packageName = ((Context) asqeVar.a).getPackageName();
                ahvw ahvwVar = (ahvw) r3.get(packageName);
                if (ahvwVar == null) {
                    ahvwVar = new ahvw(arrtVar, packageName, new ahvt(new ylq(arrtVar, packageName, 19)));
                    arrtVar.c.put(packageName, ahvwVar);
                }
                alob alobVar2 = new alob();
                Intent intent = new Intent("com.google.android.libraries.phenotype.registration.PhenotypeMetadataHolderService");
                String str2 = ahvwVar.a;
                while (true) {
                    ServiceInfo serviceInfo = null;
                    for (ResolveInfo resolveInfo : ((PackageManager) ahvwVar.e.b).queryIntentServices(intent.setPackage(str2), 787072)) {
                        if (serviceInfo == null) {
                            if (resolveInfo.serviceInfo != null && resolveInfo.serviceInfo.metaData != null && "com.google.android.libraries.phenotype.registration.PhenotypeMetadataHolderService".equals(resolveInfo.serviceInfo.name)) {
                                serviceInfo = resolveInfo.serviceInfo;
                            }
                        }
                    }
                    if (serviceInfo == null) {
                        Log.i("PhenotypeResourceReader", "unable to find any Phenotype resource metadata for ".concat(String.valueOf(str2)));
                        g = altc.a;
                    } else {
                        tm tmVar = new tm();
                        tm tmVar2 = new tm();
                        Bundle bundle = serviceInfo.metaData;
                        for (String str3 : bundle.keySet()) {
                            boolean startsWith = str3.startsWith("com.google.android.gms.phenotype.registration.binarypb:");
                            boolean startsWith2 = str3.startsWith("com.google.android.gms.phenotype.heterodyne_info.binarypb:");
                            if (startsWith || startsWith2) {
                                int i3 = bundle.getInt(str3, 0);
                                if (i3 != 0) {
                                    String str4 = (String) alzz.aM(anna.e(':').a(str3), 1);
                                    if (startsWith) {
                                        tmVar.put(str4, Integer.valueOf(i3));
                                    } else {
                                        tmVar2.put(str4, Integer.valueOf(i3));
                                    }
                                }
                            }
                        }
                        alok h = alor.h(tmVar.d);
                        for (Map.Entry entry2 : tmVar.entrySet()) {
                            String str5 = (String) entry2.getKey();
                            h.h(str5, new antv(ahvwVar, str5, ((Integer) entry2.getValue()).intValue(), ((Integer) tmVar2.getOrDefault(str5, 0)).intValue()));
                        }
                        g = h.g();
                    }
                    aluq listIterator = g.values().listIterator();
                    while (listIterator.hasNext()) {
                        aocw aocwVar = (aocw) ((antv) listIterator.next()).a.get();
                        if (aocwVar != null) {
                            alobVar2.h(aocwVar);
                        }
                    }
                    return (aocw) alzz.af(alobVar2.g(), new akez(agdl.r, 14)).get(this.b);
                }
            default:
                Object obj11 = this.a;
                akom akomVar = (akom) obj11;
                akomVar.b.writeLock().lock();
                ?? r4 = this.b;
                try {
                    akpk akpkVar = akpk.a;
                    try {
                        akpkVar = ((akom) obj11).a();
                    } catch (IOException e5) {
                        if (!((akom) obj11).f(e5)) {
                            ((alvg) ((alvg) ((alvg) akom.a.h()).g(e5)).h("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "updateScheduledAccountIds", (char) 435, "SyncManagerDataStore.java")).q("Unable to read or clear store, will not update scheduled account ids. ");
                        }
                    }
                    aozy builder = akpkVar.toBuilder();
                    if (!builder.b.isMutable()) {
                        builder.u();
                    }
                    ((akpk) builder.b).f = akpk.emptyIntList();
                    TreeSet treeSet = new TreeSet();
                    for (akot akotVar : r4) {
                        if (akotVar.a()) {
                            treeSet.add(Integer.valueOf(akotVar.c.a));
                        }
                    }
                    if (!builder.b.isMutable()) {
                        builder.u();
                    }
                    akpk akpkVar2 = (akpk) builder.b;
                    apao apaoVar = akpkVar2.f;
                    if (!apaoVar.c()) {
                        akpkVar2.f = apag.mutableCopy(apaoVar);
                    }
                    aoyj.addAll(treeSet, akpkVar2.f);
                    try {
                        ((akom) obj11).e((akpk) builder.s());
                    } catch (IOException e6) {
                        ((alvg) ((alvg) ((alvg) akom.a.h()).g(e6)).h("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "updateScheduledAccountIds", (char) 456, "SyncManagerDataStore.java")).q("Error writing scheduled account ids");
                    }
                    return null;
                } finally {
                    akomVar.b.writeLock().unlock();
                }
        }
    }

    public /* synthetic */ ahes(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
