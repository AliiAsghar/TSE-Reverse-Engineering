package defpackage;

import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.Map;
import j$.util.Optional;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xgw implements xgl {
    private final Optional A;
    private final armf B;
    private final armf C;
    private final armf D;
    private final armf E;
    private final armf F;
    private final armf G;
    private final armf H;
    private final armf I;
    public final xnv c;
    public final anen d;
    public final armf e;
    public final armf f;
    private final Context h;
    private final agnq i;
    private final armf j;
    private final armf k;
    private final armf l;
    private final armf m;
    private final wzs n;
    private final tqx o;
    private final rtb p;
    private final ukx q;
    private final wul r;
    private final armf s;
    private final armf t;
    private final armf u;
    private final armf v;
    private final armf w;
    private final armf x;
    private final armf y;
    private final armf z;
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync");
    private static final utz g = uuh.e(uuh.b, "reverse_telephony_sync__max_retries", 30);
    public static final utz b = uuh.e(uuh.b, "reverse_telephony_sync__max_number_of_entries_in_start_times_history", 10);

    public xgw(Context context, agnq agnqVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, wzs wzsVar, tqx tqxVar, rtb rtbVar, ukx ukxVar, znj znjVar, xnv xnvVar, anen anenVar, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, Optional optional, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14, armf armfVar15, armf armfVar16, armf armfVar17, armf armfVar18, armf armfVar19, armf armfVar20, armf armfVar21, armf armfVar22) {
        this.h = context;
        this.i = agnqVar;
        this.j = armfVar;
        this.k = armfVar2;
        this.l = armfVar3;
        this.m = armfVar4;
        this.n = wzsVar;
        this.o = tqxVar;
        this.p = rtbVar;
        this.q = ukxVar;
        this.c = xnvVar;
        this.d = anenVar;
        aiwl a2 = wus.a();
        a2.i(wuk.REVERSE_TELEPHONY_SYNC_STATE);
        a2.k(xgy.a);
        this.r = znjVar.ab(a2.f());
        this.s = armfVar5;
        this.t = armfVar6;
        this.u = armfVar7;
        this.v = armfVar8;
        this.w = armfVar9;
        this.x = armfVar10;
        this.y = armfVar11;
        this.e = armfVar12;
        this.z = armfVar13;
        this.A = optional;
        this.B = armfVar14;
        this.C = armfVar15;
        this.D = armfVar16;
        this.E = armfVar17;
        this.F = armfVar18;
        this.G = armfVar19;
        this.H = armfVar20;
        this.f = armfVar21;
        this.I = armfVar22;
    }

    private final void e() {
        Intent registerReceiver = this.h.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            if (intExtra != 2 && intExtra != 5) {
                throw new xhh("Device is not charging.");
            }
            return;
        }
        throw new xhh("Unable to get device charging state because battery status intent of the device is null.");
    }

    private final void f(Function function, BiFunction biFunction) {
        this.r.m(new whh(biFunction, function, 20, null));
    }

    private final void g() {
        f(new xgv(2), new mle(12));
    }

    private final void h() {
        alvw g2 = a.g();
        g2.X(alwp.a, "BugleBackup");
        ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "resetDataStoreStatus", 530, "ReverseTelephonySync.java")).q("Resetting in progress state");
        this.r.m(new xgu(1));
    }

    private final void i() {
        alvw g2 = a.g();
        g2.X(alwp.a, "BugleBackup");
        ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "resumeForwardSync", 408, "ReverseTelephonySync.java")).q("Reverse Telephony Sync complete. Resuming forward sync.");
        aktp.aj(new vbo(this, 8), this.d).k(qiu.b(), andi.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final MessageCoreData j(sxt sxtVar) {
        MessageCoreData a2 = this.o.a();
        a2.bM((MessagesTable.BindData) sxtVar.cK());
        tbs d = PartsTable.d();
        d.w("getMessageCoreData");
        d.g(new xeo(sxtVar, 20));
        alog t = d.b().t();
        int i = ((alsx) t).c;
        for (int i2 = 0; i2 < i; i2++) {
            a2.aH(this.p.g((PartsTable.BindData) t.get(i2)));
        }
        return a2;
    }

    private static void k(sxt sxtVar) {
        sya syaVar = new sya();
        syaVar.aj("markMessageAsDone");
        syaVar.g(false);
        syaVar.P(new xgt(sxtVar, 7));
        syaVar.a().e();
    }

    private final int l(MessageCoreData messageCoreData, int i) {
        qwm e = ((ryg) this.x.b()).e(messageCoreData.v());
        if (e == null) {
            alvw i2 = a.i();
            i2.X(alwp.a, "BugleBackup");
            ((alvg) ((alvg) i2).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "getSubId", 1312, "ReverseTelephonySync.java")).D("Self id was not found. messageData.getSelfId: %s, MessageId: %s", messageCoreData.v(), messageCoreData.B());
            return ((yjy) this.v.b()).c();
        }
        int e2 = e.e();
        if (i == 2 && e2 > 1073745920) {
            alvw g2 = a.g();
            g2.X(alwp.a, "BugleBackup");
            alvg alvgVar = (alvg) g2;
            alvgVar.V(10, TimeUnit.SECONDS);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "getSubId", 1329, "ReverseTelephonySync.java")).q("D2D message detected. Returning DEFAULT_SUB_ID for Reverse Sync");
            return -1;
        }
        return e2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void m(amfq amfqVar, int i, Optional optional) {
        aozb w;
        try {
            xgy xgyVar = (xgy) this.r.l();
            xgx xgxVar = xgyVar.c;
            if (xgxVar == null) {
                xgxVar = xgx.a;
            }
            aozy createBuilder = ammg.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ammg ammgVar = (ammg) createBuilder.b;
            ammgVar.k = i - 1;
            ammgVar.b |= 256;
            aozn c = apdp.c(this.c.f().toEpochMilli() - apds.a((apct) xgyVar.d.get(xgyVar.d.size() - 1)));
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ammg ammgVar2 = (ammg) createBuilder.b;
            c.getClass();
            ammgVar2.c = c;
            ammgVar2.b |= 1;
            int cG = yyb.cG(xgxVar.f);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ammg ammgVar3 = (ammg) createBuilder.b;
            ammgVar3.f = cG - 1;
            ammgVar3.b |= 8;
            int cG2 = yyb.cG(xgxVar.e);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ammg ammgVar4 = (ammg) createBuilder.b;
            ammgVar4.g = cG2 - 1;
            ammgVar4.b |= 16;
            int cG3 = yyb.cG(xgxVar.d);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ammg ammgVar5 = (ammg) createBuilder.b;
            ammgVar5.h = cG3 - 1;
            ammgVar5.b |= 32;
            int cG4 = yyb.cG(xgxVar.g);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ammg ammgVar6 = (ammg) createBuilder.b;
            ammgVar6.e = cG4 - 1;
            ammgVar6.b |= 4;
            int cG5 = yyb.cG(xgxVar.h);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            ammg ammgVar7 = (ammg) apagVar;
            ammgVar7.d = cG5 - 1;
            ammgVar7.b |= 2;
            int i2 = xgxVar.c;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            apag apagVar2 = createBuilder.b;
            ammg ammgVar8 = (ammg) apagVar2;
            ammgVar8.b |= 64;
            ammgVar8.i = i2;
            int i3 = xgxVar.i;
            if (!apagVar2.isMutable()) {
                createBuilder.u();
            }
            ammg ammgVar9 = (ammg) createBuilder.b;
            ammgVar9.b |= 128;
            ammgVar9.j = i3;
            if (optional.isPresent()) {
                w = aozb.w(ByteBuffer.allocate(16).putLong(r9.getMostSignificantBits()).putLong(((UUID) optional.get()).getLeastSignificantBits()).array());
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ammg ammgVar10 = (ammg) createBuilder.b;
                ammgVar10.b |= 512;
                ammgVar10.l = w;
            }
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar = (amfr) amfqVar.b;
            ammg ammgVar11 = (ammg) createBuilder.s();
            amfr amfrVar2 = amfr.a;
            ammgVar11.getClass();
            amfrVar.am = ammgVar11;
            amfrVar.d |= 262144;
        } catch (apba e) {
            alvw i4 = a.i();
            i4.X(alwp.a, "BugleBackup");
            ((alvg) ((alvg) ((alvg) i4).g(e)).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "fillInSyncDetails", (char) 577, "ReverseTelephonySync.java")).q("Unable to get state from data store");
        }
    }

    private final void n(MessageCoreData messageCoreData, Uri uri, int i) {
        vhg vhgVar;
        gs gsVar;
        for (MessagePartCoreData messagePartCoreData : ((MessageData) messageCoreData).i) {
            albo.y(messageCoreData.B().equals(messagePartCoreData.A()));
            if (!messagePartCoreData.bn()) {
                alvw g2 = a.g();
                g2.X(alwp.a, "BugleBackup");
                alvg alvgVar = (alvg) g2;
                alvgVar.V(10, TimeUnit.SECONDS);
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "insertPartIfNotAlreadyInserted", 1091, "ReverseTelephonySync.java")).q("Part is not missing in telephony, ignoring");
            } else if (!messagePartCoreData.aX()) {
                alvw d = a.d();
                d.X(alwp.a, "BugleBackup");
                alvg alvgVar2 = (alvg) d;
                alvgVar2.V(10, TimeUnit.SECONDS);
                ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "insertPartIfNotAlreadyInserted", 1097, "ReverseTelephonySync.java")).D("Part was already synced, ignoring. Part Id: %s, MessageId: %s", messagePartCoreData.Z(), messageCoreData.B());
            } else {
                HashMap hashMap = new HashMap();
                try {
                    try {
                        gsVar = new gs();
                        String U = messagePartCoreData.U();
                        if (U != null) {
                            gsVar.h(U.getBytes(StandardCharsets.US_ASCII));
                        }
                        String X = messagePartCoreData.X();
                        if (X != null) {
                            gsVar.k(X.getBytes());
                        }
                    } catch (gl | IOException e) {
                        alvw i2 = a.i();
                        i2.X(alwp.a, "BugleBackup");
                        ((alvg) ((alvg) ((alvg) i2).g(e)).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "insertPartIfNotAlreadyInserted", 1180, "ReverseTelephonySync.java")).D("Unable to open input stream. MessageId: %s, PartId: %s", messageCoreData.B(), messagePartCoreData.Z());
                        vhgVar = new vhg(4);
                    }
                    if (messagePartCoreData.t() == null) {
                        String ad = messagePartCoreData.ad();
                        if (ad == null) {
                            ad = "";
                        }
                        gsVar.i(ad.getBytes());
                        gsVar.d(106);
                        gsVar.k("text.txt".getBytes(StandardCharsets.US_ASCII));
                    } else {
                        if (messagePartCoreData.Y() != null) {
                            String Y = messagePartCoreData.Y();
                            albo.C(Y);
                            File file = new File(Y);
                            Uri parse = Uri.parse("fake://uri/because/it/is/unused");
                            if (!file.exists()) {
                                vhgVar = new vhg(4);
                            } else {
                                hashMap.put(parse, new FileInputStream(file));
                                gsVar.e = parse;
                            }
                        } else {
                            alvw g3 = a.g();
                            g3.X(alwp.a, "BugleBackup");
                            ((alvg) ((alvg) g3).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "insertPartIfNotAlreadyInserted", 1145, "ReverseTelephonySync.java")).D("Local copy of part does not exist. MessageId: %s, PartId: %s", messageCoreData.B(), messagePartCoreData.Z());
                            vhgVar = new vhg(4);
                        }
                        Map.EL.forEach(hashMap, vhgVar);
                    }
                    Uri b2 = ((vak) this.w.b()).b(gsVar, ContentUris.parseId(uri), hashMap);
                    alvw d2 = a.d();
                    d2.X(alwp.a, "BugleBackup");
                    ((alvg) ((alvg) d2).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "insertPartIfNotAlreadyInserted", 1160, "ReverseTelephonySync.java")).J("New uri for part. PartId: %s, URI: %s, part.isText: %s", messagePartCoreData.Z(), b2, Boolean.valueOf(messagePartCoreData.bw()));
                    tbt tbtVar = new tbt();
                    tbtVar.aj("insertPartIfNotAlreadyInserted");
                    tbtVar.n(false);
                    tbtVar.c(false);
                    tbtVar.v(new xgt(messagePartCoreData, 3));
                    if (messagePartCoreData.t() != null) {
                        tbtVar.s(b2);
                    }
                    tbtVar.a().e();
                    vhgVar = new vhg(4);
                    Map.EL.forEach(hashMap, vhgVar);
                } catch (Throwable th) {
                    Map.EL.forEach(hashMap, new vhg(4));
                    throw th;
                }
            }
            if (i == 2 && messagePartCoreData.aV()) {
                alvi alviVar = a;
                alvw g4 = alviVar.g();
                g4.X(alwp.a, "BugleBackup");
                alvg alvgVar3 = (alvg) g4;
                alvgVar3.V(10, TimeUnit.SECONDS);
                ((alvg) alvgVar3.h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "deleteCachedFile", 1197, "ReverseTelephonySync.java")).q("Removing local file copy");
                String Y2 = messagePartCoreData.Y();
                if (Y2 != null && !Y2.isEmpty()) {
                    if (Y2.length() == 0) {
                        ((alvg) xgr.a.i().h("com/google/android/apps/messaging/shared/telephony/ReverseSyncAttachmentsHandler", "removeLocalAttachment", 23, "ReverseSyncAttachmentsHandler.kt")).q("Provided uri is null or empty. Skipping deletion for Bugle attachment copy.");
                    } else {
                        File file2 = new File(Y2);
                        if (!file2.exists()) {
                            ((alvg) xgr.a.g().h("com/google/android/apps/messaging/shared/telephony/ReverseSyncAttachmentsHandler", "removeLocalAttachment", 31, "ReverseSyncAttachmentsHandler.kt")).t("File does not exist in directory. Skipping deletion for Bugle attachment copy. uri: %s", Y2);
                        } else if (file2.delete()) {
                            tbt tbtVar2 = new tbt();
                            tbtVar2.aj("updateLocalCachePathAfterLocalCopyDeletion");
                            tbtVar2.m();
                            tbtVar2.v(new xgt(messagePartCoreData, 4));
                            tbtVar2.a().e();
                        }
                    }
                    alvw i3 = alviVar.i();
                    i3.X(alwp.a, "BugleBackup");
                    ((alvg) ((alvg) i3).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "deleteCachedFile", 1220, "ReverseTelephonySync.java")).t("Failed to remove attachment copy. localCachePath: %s", Y2);
                } else {
                    alvw g5 = alviVar.g();
                    g5.X(alwp.a, "BugleBackup");
                    ((alvg) ((alvg) g5).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "deleteCachedFile", 1201, "ReverseTelephonySync.java")).D("Part does not have a local file copy. Skipping cache file deletion. PartId: %s, ContentType: %s", messagePartCoreData.Z(), messagePartCoreData.U());
                }
            }
        }
        tbt tbtVar3 = new tbt();
        tbtVar3.aj("insertRemainingParts");
        tbtVar3.v(new xgt(messageCoreData, 6));
        tbtVar3.c(false);
        tbtVar3.a().e();
    }

    private final void o(int i, int i2, Optional optional) {
        aozb w;
        alvw i3 = a.i();
        i3.X(alwp.a, "BugleBackup");
        int i4 = i - 1;
        ((alvg) ((alvg) i3).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "logSyncFailed", 486, "ReverseTelephonySync.java")).r("Sync throttled or failed. Reason %d", i4);
        aozy createBuilder = ammh.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ammh ammhVar = (ammh) apagVar;
        ammhVar.c = i4;
        ammhVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ammh ammhVar2 = (ammh) createBuilder.b;
        ammhVar2.d = i2 - 1;
        ammhVar2.b |= 2;
        if (optional.isPresent()) {
            w = aozb.w(ByteBuffer.allocate(16).putLong(r6.getMostSignificantBits()).putLong(((UUID) optional.get()).getLeastSignificantBits()).array());
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ammh ammhVar3 = (ammh) createBuilder.b;
            ammhVar3.b |= 4;
            ammhVar3.e = w;
        }
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.TELEPHONY_REVERSE_SYNC_FAILED_EVENT;
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
        ammh ammhVar4 = (ammh) createBuilder.s();
        ammhVar4.getClass();
        amfrVar2.an = ammhVar4;
        amfrVar2.d |= 524288;
        ((mbb) this.s.b()).a().b(amfqVar, mbt.LOG_SPEC_REVERSE_TELEPHONY_SYNC_EVENTS);
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x00af, code lost:
    
        if (r10.getLong(0) == (r41.s() / 1000)) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x04ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean p(defpackage.sxt r41, int r42) {
        /*
            Method dump skipped, instructions count: 1592
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xgw.p(sxt, int):boolean");
    }

    @Override // defpackage.xgl
    public final xhv a(ConversationIdType conversationIdType) {
        return (xhv) this.i.c("fixThread", new ubu(this, conversationIdType, 18, null));
    }

    public final void b() {
        this.r.m(new xeu(this, 14));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01c2 A[Catch: all -> 0x054b, TryCatch #3 {all -> 0x054b, blocks: (B:3:0x0016, B:5:0x0043, B:11:0x0062, B:13:0x006e, B:14:0x0070, B:16:0x0074, B:17:0x01a4, B:19:0x01c2, B:20:0x01c5, B:22:0x01e9, B:23:0x01eb, B:25:0x01f1, B:27:0x0215, B:29:0x0243, B:30:0x0246, B:32:0x0258, B:33:0x025b, B:35:0x026f, B:37:0x0281, B:38:0x0284, B:39:0x0290, B:41:0x02a2, B:42:0x02a5, B:44:0x02ba, B:45:0x02bd, B:48:0x02ef, B:49:0x02f4, B:52:0x0202, B:55:0x02f5, B:90:0x046b, B:96:0x04c9, B:98:0x04de, B:99:0x04e1, B:110:0x053e, B:109:0x053b, B:121:0x054a, B:120:0x0547, B:122:0x00af, B:124:0x00be, B:126:0x00c5, B:128:0x00d3, B:129:0x00eb, B:131:0x0157, B:132:0x015a, B:134:0x0186, B:135:0x0193, B:136:0x018d, B:137:0x00e8, B:140:0x0093, B:92:0x04bf, B:94:0x04c5, B:115:0x0541, B:104:0x0535, B:58:0x0349, B:60:0x034f, B:87:0x0379, B:63:0x0389, B:64:0x03c1, B:66:0x03c8, B:68:0x0409, B:70:0x040b, B:75:0x0430, B:76:0x0444, B:78:0x044b, B:80:0x045f), top: B:2:0x0016, inners: #0, #1, #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01e9 A[Catch: all -> 0x054b, TryCatch #3 {all -> 0x054b, blocks: (B:3:0x0016, B:5:0x0043, B:11:0x0062, B:13:0x006e, B:14:0x0070, B:16:0x0074, B:17:0x01a4, B:19:0x01c2, B:20:0x01c5, B:22:0x01e9, B:23:0x01eb, B:25:0x01f1, B:27:0x0215, B:29:0x0243, B:30:0x0246, B:32:0x0258, B:33:0x025b, B:35:0x026f, B:37:0x0281, B:38:0x0284, B:39:0x0290, B:41:0x02a2, B:42:0x02a5, B:44:0x02ba, B:45:0x02bd, B:48:0x02ef, B:49:0x02f4, B:52:0x0202, B:55:0x02f5, B:90:0x046b, B:96:0x04c9, B:98:0x04de, B:99:0x04e1, B:110:0x053e, B:109:0x053b, B:121:0x054a, B:120:0x0547, B:122:0x00af, B:124:0x00be, B:126:0x00c5, B:128:0x00d3, B:129:0x00eb, B:131:0x0157, B:132:0x015a, B:134:0x0186, B:135:0x0193, B:136:0x018d, B:137:0x00e8, B:140:0x0093, B:92:0x04bf, B:94:0x04c5, B:115:0x0541, B:104:0x0535, B:58:0x0349, B:60:0x034f, B:87:0x0379, B:63:0x0389, B:64:0x03c1, B:66:0x03c8, B:68:0x0409, B:70:0x040b, B:75:0x0430, B:76:0x0444, B:78:0x044b, B:80:0x045f), top: B:2:0x0016, inners: #0, #1, #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0243 A[Catch: all -> 0x054b, TryCatch #3 {all -> 0x054b, blocks: (B:3:0x0016, B:5:0x0043, B:11:0x0062, B:13:0x006e, B:14:0x0070, B:16:0x0074, B:17:0x01a4, B:19:0x01c2, B:20:0x01c5, B:22:0x01e9, B:23:0x01eb, B:25:0x01f1, B:27:0x0215, B:29:0x0243, B:30:0x0246, B:32:0x0258, B:33:0x025b, B:35:0x026f, B:37:0x0281, B:38:0x0284, B:39:0x0290, B:41:0x02a2, B:42:0x02a5, B:44:0x02ba, B:45:0x02bd, B:48:0x02ef, B:49:0x02f4, B:52:0x0202, B:55:0x02f5, B:90:0x046b, B:96:0x04c9, B:98:0x04de, B:99:0x04e1, B:110:0x053e, B:109:0x053b, B:121:0x054a, B:120:0x0547, B:122:0x00af, B:124:0x00be, B:126:0x00c5, B:128:0x00d3, B:129:0x00eb, B:131:0x0157, B:132:0x015a, B:134:0x0186, B:135:0x0193, B:136:0x018d, B:137:0x00e8, B:140:0x0093, B:92:0x04bf, B:94:0x04c5, B:115:0x0541, B:104:0x0535, B:58:0x0349, B:60:0x034f, B:87:0x0379, B:63:0x0389, B:64:0x03c1, B:66:0x03c8, B:68:0x0409, B:70:0x040b, B:75:0x0430, B:76:0x0444, B:78:0x044b, B:80:0x045f), top: B:2:0x0016, inners: #0, #1, #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0258 A[Catch: all -> 0x054b, TryCatch #3 {all -> 0x054b, blocks: (B:3:0x0016, B:5:0x0043, B:11:0x0062, B:13:0x006e, B:14:0x0070, B:16:0x0074, B:17:0x01a4, B:19:0x01c2, B:20:0x01c5, B:22:0x01e9, B:23:0x01eb, B:25:0x01f1, B:27:0x0215, B:29:0x0243, B:30:0x0246, B:32:0x0258, B:33:0x025b, B:35:0x026f, B:37:0x0281, B:38:0x0284, B:39:0x0290, B:41:0x02a2, B:42:0x02a5, B:44:0x02ba, B:45:0x02bd, B:48:0x02ef, B:49:0x02f4, B:52:0x0202, B:55:0x02f5, B:90:0x046b, B:96:0x04c9, B:98:0x04de, B:99:0x04e1, B:110:0x053e, B:109:0x053b, B:121:0x054a, B:120:0x0547, B:122:0x00af, B:124:0x00be, B:126:0x00c5, B:128:0x00d3, B:129:0x00eb, B:131:0x0157, B:132:0x015a, B:134:0x0186, B:135:0x0193, B:136:0x018d, B:137:0x00e8, B:140:0x0093, B:92:0x04bf, B:94:0x04c5, B:115:0x0541, B:104:0x0535, B:58:0x0349, B:60:0x034f, B:87:0x0379, B:63:0x0389, B:64:0x03c1, B:66:0x03c8, B:68:0x0409, B:70:0x040b, B:75:0x0430, B:76:0x0444, B:78:0x044b, B:80:0x045f), top: B:2:0x0016, inners: #0, #1, #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x026f A[Catch: all -> 0x054b, TryCatch #3 {all -> 0x054b, blocks: (B:3:0x0016, B:5:0x0043, B:11:0x0062, B:13:0x006e, B:14:0x0070, B:16:0x0074, B:17:0x01a4, B:19:0x01c2, B:20:0x01c5, B:22:0x01e9, B:23:0x01eb, B:25:0x01f1, B:27:0x0215, B:29:0x0243, B:30:0x0246, B:32:0x0258, B:33:0x025b, B:35:0x026f, B:37:0x0281, B:38:0x0284, B:39:0x0290, B:41:0x02a2, B:42:0x02a5, B:44:0x02ba, B:45:0x02bd, B:48:0x02ef, B:49:0x02f4, B:52:0x0202, B:55:0x02f5, B:90:0x046b, B:96:0x04c9, B:98:0x04de, B:99:0x04e1, B:110:0x053e, B:109:0x053b, B:121:0x054a, B:120:0x0547, B:122:0x00af, B:124:0x00be, B:126:0x00c5, B:128:0x00d3, B:129:0x00eb, B:131:0x0157, B:132:0x015a, B:134:0x0186, B:135:0x0193, B:136:0x018d, B:137:0x00e8, B:140:0x0093, B:92:0x04bf, B:94:0x04c5, B:115:0x0541, B:104:0x0535, B:58:0x0349, B:60:0x034f, B:87:0x0379, B:63:0x0389, B:64:0x03c1, B:66:0x03c8, B:68:0x0409, B:70:0x040b, B:75:0x0430, B:76:0x0444, B:78:0x044b, B:80:0x045f), top: B:2:0x0016, inners: #0, #1, #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02a2 A[Catch: all -> 0x054b, TryCatch #3 {all -> 0x054b, blocks: (B:3:0x0016, B:5:0x0043, B:11:0x0062, B:13:0x006e, B:14:0x0070, B:16:0x0074, B:17:0x01a4, B:19:0x01c2, B:20:0x01c5, B:22:0x01e9, B:23:0x01eb, B:25:0x01f1, B:27:0x0215, B:29:0x0243, B:30:0x0246, B:32:0x0258, B:33:0x025b, B:35:0x026f, B:37:0x0281, B:38:0x0284, B:39:0x0290, B:41:0x02a2, B:42:0x02a5, B:44:0x02ba, B:45:0x02bd, B:48:0x02ef, B:49:0x02f4, B:52:0x0202, B:55:0x02f5, B:90:0x046b, B:96:0x04c9, B:98:0x04de, B:99:0x04e1, B:110:0x053e, B:109:0x053b, B:121:0x054a, B:120:0x0547, B:122:0x00af, B:124:0x00be, B:126:0x00c5, B:128:0x00d3, B:129:0x00eb, B:131:0x0157, B:132:0x015a, B:134:0x0186, B:135:0x0193, B:136:0x018d, B:137:0x00e8, B:140:0x0093, B:92:0x04bf, B:94:0x04c5, B:115:0x0541, B:104:0x0535, B:58:0x0349, B:60:0x034f, B:87:0x0379, B:63:0x0389, B:64:0x03c1, B:66:0x03c8, B:68:0x0409, B:70:0x040b, B:75:0x0430, B:76:0x0444, B:78:0x044b, B:80:0x045f), top: B:2:0x0016, inners: #0, #1, #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02ba A[Catch: all -> 0x054b, TryCatch #3 {all -> 0x054b, blocks: (B:3:0x0016, B:5:0x0043, B:11:0x0062, B:13:0x006e, B:14:0x0070, B:16:0x0074, B:17:0x01a4, B:19:0x01c2, B:20:0x01c5, B:22:0x01e9, B:23:0x01eb, B:25:0x01f1, B:27:0x0215, B:29:0x0243, B:30:0x0246, B:32:0x0258, B:33:0x025b, B:35:0x026f, B:37:0x0281, B:38:0x0284, B:39:0x0290, B:41:0x02a2, B:42:0x02a5, B:44:0x02ba, B:45:0x02bd, B:48:0x02ef, B:49:0x02f4, B:52:0x0202, B:55:0x02f5, B:90:0x046b, B:96:0x04c9, B:98:0x04de, B:99:0x04e1, B:110:0x053e, B:109:0x053b, B:121:0x054a, B:120:0x0547, B:122:0x00af, B:124:0x00be, B:126:0x00c5, B:128:0x00d3, B:129:0x00eb, B:131:0x0157, B:132:0x015a, B:134:0x0186, B:135:0x0193, B:136:0x018d, B:137:0x00e8, B:140:0x0093, B:92:0x04bf, B:94:0x04c5, B:115:0x0541, B:104:0x0535, B:58:0x0349, B:60:0x034f, B:87:0x0379, B:63:0x0389, B:64:0x03c1, B:66:0x03c8, B:68:0x0409, B:70:0x040b, B:75:0x0430, B:76:0x0444, B:78:0x044b, B:80:0x045f), top: B:2:0x0016, inners: #0, #1, #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02ef A[Catch: all -> 0x054b, TryCatch #3 {all -> 0x054b, blocks: (B:3:0x0016, B:5:0x0043, B:11:0x0062, B:13:0x006e, B:14:0x0070, B:16:0x0074, B:17:0x01a4, B:19:0x01c2, B:20:0x01c5, B:22:0x01e9, B:23:0x01eb, B:25:0x01f1, B:27:0x0215, B:29:0x0243, B:30:0x0246, B:32:0x0258, B:33:0x025b, B:35:0x026f, B:37:0x0281, B:38:0x0284, B:39:0x0290, B:41:0x02a2, B:42:0x02a5, B:44:0x02ba, B:45:0x02bd, B:48:0x02ef, B:49:0x02f4, B:52:0x0202, B:55:0x02f5, B:90:0x046b, B:96:0x04c9, B:98:0x04de, B:99:0x04e1, B:110:0x053e, B:109:0x053b, B:121:0x054a, B:120:0x0547, B:122:0x00af, B:124:0x00be, B:126:0x00c5, B:128:0x00d3, B:129:0x00eb, B:131:0x0157, B:132:0x015a, B:134:0x0186, B:135:0x0193, B:136:0x018d, B:137:0x00e8, B:140:0x0093, B:92:0x04bf, B:94:0x04c5, B:115:0x0541, B:104:0x0535, B:58:0x0349, B:60:0x034f, B:87:0x0379, B:63:0x0389, B:64:0x03c1, B:66:0x03c8, B:68:0x0409, B:70:0x040b, B:75:0x0430, B:76:0x0444, B:78:0x044b, B:80:0x045f), top: B:2:0x0016, inners: #0, #1, #2, #4, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(int r26, j$.util.Optional r27) {
        /*
            Method dump skipped, instructions count: 1360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xgw.c(int, j$.util.Optional):void");
    }

    public final Optional d(sna snaVar, int i) {
        Optional of;
        boolean z;
        xhv b2 = ((qos) this.E.b()).b((smr) snaVar.cK());
        if (b2.d()) {
            of = Optional.empty();
        } else {
            of = Optional.of(Long.valueOf(b2.a()));
        }
        if (of.isEmpty()) {
            return of;
        }
        Long l = (Long) of.get();
        long longValue = l.longValue();
        if (longValue != -1) {
            z = true;
        } else {
            z = false;
        }
        albo.y(z);
        sng sngVar = new sng();
        sngVar.aj("createThreadForConversationAndSyncOneMessage-conversations");
        sngVar.R(new xhv(longValue));
        sngVar.i(false);
        sngVar.e(snaVar.C());
        sxy d = MessagesTable.d();
        d.w("createThreadForConversationAndSyncOneMessage");
        d.g(new xdo(11));
        d.g(new xgt(snaVar, 1));
        sxt sxtVar = (sxt) d.b().n();
        while (sxtVar.moveToNext()) {
            try {
                MessageCoreData j = j(sxtVar);
                if (!j.cJ()) {
                    Iterator it = ((MessageData) j).i.iterator();
                    boolean z2 = true;
                    while (it.hasNext()) {
                        z2 &= ((MessagePartCoreData) it.next()).bw();
                    }
                    if (z2) {
                        if (p(sxtVar, i)) {
                            break;
                        }
                    }
                }
                tbt tbtVar = new tbt();
                tbtVar.aj("markAllPartsAsMissing");
                tbtVar.n(true);
                tbtVar.v(new xgt(j, 0));
                tbtVar.a().e();
            } catch (Throwable th) {
                try {
                    sxtVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        sxtVar.close();
        return Optional.of(l);
    }
}
