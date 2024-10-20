package defpackage;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.ContentProviderOperation;
import android.content.Context;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.media.MediaActionSound;
import android.os.Bundle;
import android.provider.ContactsContract;
import com.google.android.libraries.appdoctor.AppDoctorReceiver;
import j$.util.Collection;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import org.apache.http.impl.client.DefaultHttpClient;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aakf implements Callable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ aakf(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v103, types: [ancr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v124, types: [java.lang.Object, apbt] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object, org.apache.http.client.methods.HttpUriRequest] */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Object, org.apache.http.client.methods.HttpUriRequest] */
    /* JADX WARN: Type inference failed for: r0v72, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [msk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [ykb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v54, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.List, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        RandomAccessFile randomAccessFile;
        FileOutputStream fileOutputStream;
        int i = 5;
        int i2 = 4;
        boolean z = true;
        switch (this.c) {
            case 0:
                return ((vbu) ((aalt) this.a).T.b()).l(this.b.a());
            case 1:
                Object obj = this.b;
                int i3 = 0;
                while (i3 < 1500) {
                    Object obj2 = this.a;
                    Locale locale = Locale.US;
                    Integer valueOf = Integer.valueOf(i3);
                    String format = String.format(locale, "FakePerfContact %04d", valueOf);
                    zxy zxyVar = (zxy) obj2;
                    msh n = zxyVar.d.n(String.format(Locale.US, "555555%04d", valueOf));
                    ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
                    arrayList.add(ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI).withValue("account_type", null).withValue("account_name", null).build());
                    arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", n.d(((Boolean) new mst(8).get()).booleanValue()).get()).withValue("data2", 2).build());
                    arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/name").withValue("data1", format).build());
                    try {
                        ((Context) obj).getContentResolver().applyBatch("com.android.contacts", arrayList);
                    } catch (Exception e) {
                        xzb.i("Bugle", e, "createContactWithPhoneNumber caught");
                        ((abbu) zxyVar.c).l("create contact " + String.valueOf(n.d(((Boolean) new mst(8).get()).booleanValue())) + " caught " + e.toString());
                    }
                    i3++;
                    xzb.m("Bugle", "Created contact %d of %d", Integer.valueOf(i3), 1500);
                    if (i3 % 100 == 0) {
                        ((abbu) zxyVar.c).l(a.cb(i3, "Created contact ", " of 1500"));
                    }
                }
                return null;
            case 2:
                Bundle bundle = (Bundle) albo.bQ(this.a);
                StringBuilder sb = new StringBuilder();
                if (bundle == null) {
                    sb.append("NULL bundle result. Requires sdk U+");
                } else {
                    sb.append("Number of part files: ");
                    sb.append(bundle.getInt("part_file_count"));
                    sb.append("\nNumber of MMS parts: ");
                    sb.append(bundle.getInt("part_table_entry_count"));
                    sb.append("\nNumber of dangling files to delete: ");
                    sb.append(bundle.getInt("deleted_count"));
                    sb.append("\n");
                }
                AlertDialog.Builder builder = (AlertDialog.Builder) this.b;
                builder.setTitle("Dangling MMS Parts Results");
                builder.setMessage(sb.toString());
                builder.setNegativeButton("Close", new iws(17));
                xyo d = aalt.c.d();
                d.H("Dangling MMS Parts Results:");
                d.H(sb.toString());
                d.q();
                return null;
            case 3:
                ?? r0 = this.a;
                List list = (List) albo.bQ(this.b);
                List list2 = (List) albo.bQ(r0);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Active Executions:\n");
                Collection.EL.forEach(list, new aakw(sb2, i2));
                sb2.append("\nInactive Executions:\n");
                Collection.EL.forEach(list2, new aakw(sb2, i));
                return sb2.toString();
            case 4:
                ved vedVar = (ved) albo.bQ(this.b);
                byte[] bArr = (byte[]) albo.bQ(this.a);
                int ordinal = vedVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2 && ordinal != 3) {
                            if (ordinal != 4) {
                                return "";
                            }
                        } else {
                            return "REGISTERED";
                        }
                    } else {
                        if (true != Arrays.equals(bArr, new byte[0])) {
                            return "WAITING_FOR_VERIFICATION";
                        }
                        return "NOT REGISTERED";
                    }
                }
                return "UNKNOWN";
            case 5:
                int[] iArr = aava.c;
                int length = iArr.length;
                for (int i4 = 0; i4 < 3; i4++) {
                    Object obj3 = this.b;
                    Object obj4 = this.a;
                    int i5 = iArr[i4];
                    if (obj3 == ((aava) obj4).j) {
                        ((MediaActionSound) obj3).load(i5);
                    }
                }
                return null;
            case 6:
                aozy createBuilder = amib.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                Object obj5 = this.a;
                Object obj6 = this.b;
                amib amibVar = (amib) createBuilder.b;
                obj5.getClass();
                amibVar.d = obj5;
                amibVar.c = 6;
                abau abauVar = (abau) obj6;
                long epochMilli = abauVar.d.f().toEpochMilli();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amib amibVar2 = (amib) createBuilder.b;
                amibVar2.b = 8 | amibVar2.b;
                amibVar2.e = epochMilli;
                if (!((mho) abauVar.b.b()).al()) {
                    abau.a.l("Clearcut loggings are disabled.");
                } else {
                    amfq amfqVar = (amfq) amfr.a.createBuilder();
                    amfp amfpVar = amfp.BUGLE_SEARCH;
                    if (!amfqVar.b.isMutable()) {
                        amfqVar.u();
                    }
                    amfr amfrVar = (amfr) amfqVar.b;
                    amfrVar.i = amfpVar.dg;
                    amfrVar.b |= 1;
                    if (!amfqVar.b.isMutable()) {
                        amfqVar.u();
                    }
                    amfr amfrVar2 = (amfr) amfqVar.b;
                    amib amibVar3 = (amib) createBuilder.s();
                    amibVar3.getClass();
                    amfrVar2.n = amibVar3;
                    amfrVar2.b |= 32;
                    ((maq) abauVar.c.b()).j(amfqVar);
                }
                return true;
            case 7:
                abcu abcuVar = (abcu) this.b;
                ShortcutManager m343m = ead$$ExternalSyntheticApiModelOutline0.m343m(abcuVar.d.getSystemService(ead$$ExternalSyntheticApiModelOutline0.m()));
                ArrayList arrayList2 = new ArrayList();
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    ShortcutInfo m = ead$$ExternalSyntheticApiModelOutline0.m(albo.bQ((akul) it.next()));
                    if (m != null) {
                        arrayList2.add(m);
                    }
                }
                abcu.a.o("Setting dynamic shortcuts: size=" + arrayList2.size());
                m343m.setDynamicShortcuts(arrayList2);
                return null;
            case 8:
                aozy createBuilder2 = apik.a.createBuilder();
                aozy createBuilder3 = apil.a.createBuilder();
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                apil apilVar = (apil) createBuilder3.b;
                apilVar.c = 6;
                apilVar.b |= 1;
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                Object obj7 = this.b;
                Object obj8 = this.a;
                apik apikVar = (apik) createBuilder2.b;
                apil apilVar2 = (apil) createBuilder3.s();
                apilVar2.getClass();
                apikVar.c = apilVar2;
                apikVar.b = 3;
                ((acny) obj8).x((Context) obj7, (apik) createBuilder2.s());
                return null;
            case 9:
                advp advpVar = acta.a;
                return ((DefaultHttpClient) this.a).execute(this.b);
            case 10:
                return ((DefaultHttpClient) this.a).execute(this.b);
            case 11:
                Object obj9 = this.b;
                altx altxVar = new altx(obj9);
                String str = ((adiw) obj9).a;
                adms admsVar = (adms) this.a;
                admsVar.n.v(4, altxVar, alor.l(obj9, admsVar.y(str)));
                return null;
            case 12:
                Object obj10 = this.b;
                wyp wypVar = ((adms) this.a).n;
                qjh.l(wypVar.a, null, new uog(wypVar, (adit) obj10, (arpe) null, 10), 3);
                return null;
            case 13:
                return ((adnk) this.b).f((String) this.a);
            case 14:
                return ((adrc) this.b).aw(((adsd) this.a).a);
            case 15:
                return ((adrc) this.b).aw(((adsd) this.a).a);
            case 16:
                AppDoctorReceiver.a(this.a, (BroadcastReceiver.PendingResult) this.b);
                return null;
            case 17:
                Object obj11 = this.a;
                boolean isEmpty = ((alor) obj11).isEmpty();
                Object obj12 = this.b;
                if (isEmpty) {
                    ((alvg) ((alvg) aegy.a.g()).h("com/google/android/libraries/communications/mobileconfiguration/api/MobileConfigurationApi", "logRegisterParametersSuccessNoParameters", 134, "MobileConfigurationApi.java")).q("registerParameters called with no parameters");
                    ((aegy) obj12).f.f(aetn.aS(0, 3));
                } else {
                    try {
                        aehm aehmVar = ((aegy) obj12).e;
                        alpr alprVar = new alpr();
                        aluq listIterator = ((alor) obj11).entrySet().listIterator();
                        while (listIterator.hasNext()) {
                            Map.Entry entry = (Map.Entry) listIterator.next();
                            String str2 = (String) entry.getKey();
                            aehn aehnVar = (aehn) aehmVar.c(str2).orElse(aehn.a);
                            aotx aotxVar = aehnVar.c;
                            if (aotxVar == null) {
                                aotxVar = aotx.a;
                            }
                            if (!aotxVar.equals(entry.getValue())) {
                                alprVar.c((String) entry.getKey());
                                aozy builder2 = aehnVar.toBuilder();
                                aotx aotxVar2 = (aotx) entry.getValue();
                                if (!builder2.b.isMutable()) {
                                    builder2.u();
                                }
                                aehn aehnVar2 = (aehn) builder2.b;
                                aotxVar2.getClass();
                                aehnVar2.c = aotxVar2;
                                aehnVar2.b |= 1;
                                aehmVar.d(str2, (aehn) builder2.s());
                            }
                        }
                        alpt g = alprVar.g();
                        int i6 = ((altc) obj11).d;
                        ((alvg) ((alvg) aegy.a.g()).h("com/google/android/libraries/communications/mobileconfiguration/api/MobileConfigurationApi", "logRegisterParametersSuccessWithParameters", 121, "MobileConfigurationApi.java")).r("registerParameters successfully stored %d parameters", i6);
                        aegy aegyVar = (aegy) obj12;
                        aegyVar.f.f(aetn.aS(i6, 4));
                        if (!g.isEmpty()) {
                            aegyVar.d.b(gso.REPLACE);
                        }
                    } catch (aehc e2) {
                        int i7 = ((altc) obj11).d;
                        ((alvg) ((alvg) ((alvg) aegy.a.i()).g(e2)).h("com/google/android/libraries/communications/mobileconfiguration/api/MobileConfigurationApi", "logRegisterParametersFailure", (char) 128, "MobileConfigurationApi.java")).q("registerParameters failed to store parameters");
                        ((aegy) obj12).f.f(aetn.aS(i7, 5));
                    }
                    ((aegy) obj12).d.b(gso.KEEP);
                }
                return null;
            case 18:
                return ((aazm) this.b).b(this.a);
            case 19:
                Object obj13 = this.b;
                File file = new File(((agsw) obj13).a().b, (String) this.a);
                if (!file.isFile()) {
                    return null;
                }
                try {
                    randomAccessFile = new RandomAccessFile(file, "r");
                } catch (IOException unused) {
                }
                try {
                    long length2 = randomAccessFile.length() - 4;
                    randomAccessFile.seek(length2);
                    long readInt = randomAccessFile.readInt();
                    randomAccessFile.close();
                    if (readInt == length2) {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(file);
                            long length3 = file.length() - 4;
                            int i8 = amcp.a;
                            aoib aoibVar = new aoib(fileInputStream, length3, 1);
                            try {
                                Object a = ((agsw) obj13).c.a(aoibVar);
                                aoibVar.close();
                                return a;
                            } finally {
                            }
                        } catch (IOException e3) {
                            ((alvg) ((alvg) ((alvg) agsw.a.h()).g(e3)).h("com/google/android/libraries/inputmethod/cache/FileCache", "getInternal", 117, "FileCache.java")).t("Failed to deserialize file: %s", file);
                            return null;
                        }
                    }
                    ahbi.b.b(file);
                    ((alvg) ((alvg) agsw.a.h()).h("com/google/android/libraries/inputmethod/cache/FileCache", "getInternal", 109, "FileCache.java")).t("Delete malformed file: %s", file);
                    return null;
                } finally {
                }
            default:
                ?? r02 = this.a;
                Object obj14 = this.b;
                synchronized (((aguk) obj14).e) {
                    ahbi ahbiVar = aguk.b;
                    File a2 = ((aguk) obj14).a();
                    File parentFile = a2.getParentFile();
                    if (parentFile != null && ahbiVar.a(parentFile)) {
                        if (a2.isDirectory()) {
                            ((alvg) ((alvg) ahbi.a.h()).h("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "writeProto", 720, "FileOperationUtils.java")).t("Cannot write bytes to directory %s", a2.getPath());
                        } else {
                            try {
                                fileOutputStream = new FileOutputStream(a2);
                            } catch (IOException | IllegalStateException e4) {
                                ((alvg) ((alvg) ((alvg) ahbi.a.h()).g(e4)).h("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "writeProto", 729, "FileOperationUtils.java")).t("Failed to write to %s", a2.getPath());
                            }
                            try {
                                r02.writeTo(fileOutputStream);
                                fileOutputStream.close();
                            } finally {
                            }
                        }
                    }
                    z = false;
                }
                if (z) {
                    return null;
                }
                throw new IOException("Failed to write sticky preferences to disk");
        }
    }

    public /* synthetic */ aakf(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
