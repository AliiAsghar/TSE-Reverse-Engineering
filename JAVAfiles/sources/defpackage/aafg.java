package defpackage;

import android.widget.TextView;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.ui.debug.DebugGServiceKeysFragment;
import com.google.android.apps.messaging.ui.debug.LoadLinkPreviewsReceiver;
import com.google.android.apps.messaging.ui.debug.LoadRepliesReceiver;
import j$.util.Optional;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aafg implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ aafg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, aafw] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r3v41, types: [java.util.Iterator, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.Iterator, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        Object apply;
        String str;
        ltm ltmVar;
        agnw d;
        agnw d2;
        int i = 10;
        int i2 = 3;
        int i3 = 4;
        int i4 = 2;
        byte[] bArr = null;
        int i5 = 1;
        int i6 = 0;
        switch (this.b) {
            case 0:
                this.a.d();
                return;
            case 1:
                ((aabp) this.a).B(false);
                return;
            case 2:
                ((aagk) this.a).b();
                return;
            case 3:
                this.a.a();
                return;
            case 4:
                alvg alvgVar = (alvg) ((alvg) aajg.a.g()).h("com/google/android/apps/messaging/ui/debug/CronetDebugUtils", "stopCronetNetLog", 69, "CronetDebugUtils.java");
                aajg aajgVar = (aajg) this.a;
                alvgVar.t("Stopping Cronet NetLog. Output file: %s", aajgVar.e);
                ((CronetEngine) ((ghw) aajgVar.c.b()).q().get()).stopNetLog();
                return;
            case 5:
                Object obj = this.a;
                try {
                    ((aajg) obj).e = File.createTempFile("netlog-", ".json", ((aajg) obj).b.getCacheDir());
                    aajg aajgVar2 = (aajg) obj;
                    ((alvg) ((alvg) aajg.a.g()).h("com/google/android/apps/messaging/ui/debug/CronetDebugUtils", "startCronetNetLog", 55, "CronetDebugUtils.java")).t("Starting Cronet NetLog. Output file: %s", aajgVar2.e);
                    ((CronetEngine) ((ghw) aajgVar2.c.b()).q().get()).startNetLogToFile(aajgVar2.e.toString(), true);
                    return;
                } catch (IOException e) {
                    ((alvg) ((alvg) ((alvg) aajg.a.i()).g(e)).h("com/google/android/apps/messaging/ui/debug/CronetDebugUtils", "startCronetNetLog", '4', "CronetDebugUtils.java")).q("Cannot start Cronet NetLog");
                    return;
                }
            case 6:
                Object obj2 = this.a;
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File((String) ((zjq) obj2).a)));
                    try {
                        for (String str2 : ((zjq) obj2).c.keySet()) {
                            bufferedWriter.write(str2);
                            bufferedWriter.write(" : ");
                            bufferedWriter.write((String) ((zjq) obj2).c.get(str2));
                            bufferedWriter.write("\n");
                        }
                        bufferedWriter.close();
                        return;
                    } finally {
                    }
                } catch (IOException e2) {
                    alvw i7 = DebugGServiceKeysFragment.a.i();
                    i7.X(alwp.a, "BugleDiagnostics");
                    ((alvg) ((alvg) ((alvg) i7).g(e2)).h("com/google/android/apps/messaging/ui/debug/DebugGServiceKeysFragment$AutorampFlagWriter", "writeAutorampFlagsToFile", (char) 358, "DebugGServiceKeysFragment.java")).q("Failed to dump autoramp flags to file");
                    return;
                }
            case 7:
                ((vyv) ((aalt) this.a).ba.b()).R(null);
                return;
            case 8:
                xnm xnmVar = (xnm) ((aalt) this.a).bb.b();
                aozy createBuilder = aplc.a.createBuilder();
                createBuilder.getClass();
                aozy createBuilder2 = aplb.a.createBuilder();
                createBuilder2.getClass();
                apag s = createBuilder2.s();
                s.getClass();
                aplb aplbVar = (aplb) s;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                aplc aplcVar = (aplc) createBuilder.b;
                aplcVar.c = aplbVar;
                aplcVar.b = 1;
                apag s2 = createBuilder.s();
                s2.getClass();
                aozy builder = ((aplc) s2).toBuilder();
                builder.getClass();
                qjh.l(xnmVar.b, null, new uog(xnmVar, builder, (arpe) null, 18), 3);
                return;
            case 9:
                Object obj3 = this.a;
                ((vno) ((Optional) ((apxx) ((aalt) obj3).aL).a).get()).b();
                sla a = sld.a();
                a.f(new aaky(obj3, 4));
                skx skxVar = (skx) a.b().m((agmh) sld.e.c);
                try {
                    alob alobVar = new alob();
                    while (skxVar.moveToNext()) {
                        if (skxVar.h() != null) {
                            alobVar.h(skxVar.h());
                        }
                    }
                    alog g = alobVar.g();
                    skxVar.close();
                    if (((alsx) g).c > 0) {
                        aiut.e(new aafg(obj3, 10));
                        return;
                    }
                    taw tawVar = new taw();
                    apply = new aaky(obj3, 8).apply(new tbd());
                    tawVar.a = new tbc((tbd) apply);
                    if (tawVar.d() > 0) {
                        str = "Penpal bot is removed.";
                    } else {
                        str = "No recipient is removed.";
                    }
                    aiut.e(new aaki(obj3, str, 17, bArr));
                    return;
                } finally {
                }
            case 10:
                ((abbu) ((aalt) this.a).Z.b()).l("Failed: please delete all Penpal conversations and try again.");
                return;
            case 11:
                ((xhl) ((aalt) this.a).aw.b()).a();
                return;
            case 12:
                ((ykw) ((udr) ((aalt) this.a).bc.b()).a.b()).g("sound_for_debug_plugin_enabled_key", !((ykw) r0.a.b()).q("sound_for_debug_plugin_enabled_key", false));
                return;
            case 13:
                ((TextView) this.a).setText("Result: verified");
                return;
            case 14:
                ((TextView) this.a).setText("Result: unverified");
                return;
            case 15:
                ((wzp) ((aalz) this.a).x.j.b()).k(amvm.FAKE_MESSAGE_GENERATOR);
                return;
            case 16:
                ssn ssnVar = new ssn();
                ssnVar.f("LoadLinkPreviewReceiver#processBroadcast.delete");
                ssnVar.e();
                ssnVar.d();
                sxy d3 = MessagesTable.d();
                d3.w("LoadLinkPreviewsReceiver.processBroadcast");
                d3.h(new atkn((Object) MessagesTable.c.i, false));
                alog g2 = d3.b().g();
                int i8 = ((alsx) g2).c;
                for (int i9 = 0; i9 < i8; i9++) {
                    ?? r6 = this.a;
                    MessageIdType messageIdType = (MessageIdType) g2.get(i9);
                    if (r6.hasNext()) {
                        List<String> ab = arsd.ab((String) r6.next(), new String[]{","}, 5, 2);
                        ArrayList arrayList = new ArrayList(aqjn.J(ab, 10));
                        for (String str3 : ab) {
                            if (true == d.F(str3, "null")) {
                                str3 = null;
                            }
                            arrayList.add(str3);
                        }
                        LoadLinkPreviewsReceiver.a.o("Trying to insert preview " + messageIdType + " " + arrayList.get(2) + " " + arrayList.size());
                        CharSequence charSequence = (CharSequence) arrayList.get(4);
                        if (charSequence != null && !arsd.M(charSequence)) {
                            ssj a2 = sss.a();
                            a2.k((String) arrayList.get(0));
                            a2.f((String) arrayList.get(1));
                            a2.h((String) arrayList.get(2));
                            a2.e((String) arrayList.get(2));
                            a2.g((String) arrayList.get(3));
                            a2.l(messageIdType);
                            a2.d(2000L);
                            a2.m((String) arrayList.get(4));
                            a2.i(false);
                            a2.i(false);
                            a2.j(false);
                            a2.c();
                        } else {
                            LoadLinkPreviewsReceiver.a.o("Skipping inserting preview: link preview has no target url");
                        }
                    } else {
                        LoadLinkPreviewsReceiver.a.o("Done inserting preview");
                        return;
                    }
                }
                LoadLinkPreviewsReceiver.a.o("Done inserting preview");
                return;
            case 17:
                svv svvVar = new svv();
                svvVar.f("LoadRepliesReceiver#processBroadcast.delete");
                svvVar.e();
                svvVar.d();
                sxy d4 = MessagesTable.d();
                d4.w("LoadRepliesReceiver.processBroadcast");
                d4.d(new aand(i4));
                d4.h(new atkn((Object) MessagesTable.c.i, false));
                sxt sxtVar = (sxt) d4.b().n();
                while (sxtVar.moveToNext()) {
                    ?? r3 = this.a;
                    if (r3.hasNext()) {
                        MessagesTable.BindData bindData = (MessagesTable.BindData) sxtVar.cK();
                        List<String> ab2 = arsd.ab((CharSequence) r3.next(), new String[]{", "}, i3, i4);
                        ArrayList arrayList2 = new ArrayList(aqjn.J(ab2, i));
                        for (String str4 : ab2) {
                            if (true == d.F(str4, "null")) {
                                str4 = null;
                            }
                            arrayList2.add(str4);
                        }
                        CharSequence charSequence2 = (CharSequence) arrayList2.get(i6);
                        if (charSequence2 != null && !arsd.M(charSequence2)) {
                            LoadRepliesReceiver.a.o("Processing reply data " + arrayList2.get(i6) + " " + arrayList2.get(1) + ", " + arrayList2.get(i4) + ", " + arrayList2.get(i2) + " for message " + bindData.A());
                            int i10 = svc.a;
                            tpu tpuVar = new tpu(null, null);
                            tpuVar.l(rvc.b((String) arrayList2.get(1)));
                            tpuVar.m(rvc.b((String) arrayList2.get(2)));
                            if (d.F(arrayList2.get(3), "0")) {
                                ltmVar = ltm.UNSPECIFIED;
                            } else {
                                ltmVar = ltm.REPLIED_TO_MESSAGE_NOT_FOUND;
                            }
                            tpuVar.n(ltmVar);
                            svr k = tpuVar.k(new svc(12));
                            d = agnc.d("$primary");
                            d2 = agnc.d("$primary");
                            agnc.a(d2, "message_replies", k, new spl(d, 13), new swb(i5));
                            xze xzeVar = LoadRepliesReceiver.a;
                            k.ao(0, "message_id");
                            MessageIdType messageIdType2 = k.a;
                            k.ao(1, "replied_to_message_id");
                            xzeVar.o("Inserted reply " + messageIdType2 + " to message " + k.b);
                        } else {
                            LoadRepliesReceiver.a.o("Skipping: the message " + arrayList2.get(1) + " is not indicated a reply");
                        }
                        i = 10;
                        i2 = 3;
                        i3 = 4;
                        i4 = 2;
                        i6 = 0;
                    } else {
                        sxtVar.close();
                        LoadRepliesReceiver.a.o("Done inserting replies");
                        return;
                    }
                }
                sxtVar.close();
                LoadRepliesReceiver.a.o("Done inserting replies");
                return;
            case 18:
                abay.c(((aaoq) this.a).i, "WearOS DataClient cleared");
                return;
            case 19:
                abay.c(((aaoq) this.a).i, "Wear sync queued");
                return;
            default:
                abay.c(((aaoq) this.a).i, "Wear sync deduped to existing queue");
                return;
        }
    }
}
