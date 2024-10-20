package com.google.android.apps.messaging.shared.datamodel.database.upgrade;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import com.google.android.ims.util.common.RcsIntents;
import defpackage.a;
import defpackage.adtw;
import defpackage.adwi;
import defpackage.agmd;
import defpackage.agme;
import defpackage.agmg;
import defpackage.agmh;
import defpackage.agnc;
import defpackage.agnw;
import defpackage.agof;
import defpackage.agog;
import defpackage.agoh;
import defpackage.agoi;
import defpackage.agov;
import defpackage.agpk;
import defpackage.agpl;
import defpackage.agpw;
import defpackage.agpx;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.albo;
import defpackage.alls;
import defpackage.alob;
import defpackage.alog;
import defpackage.alor;
import defpackage.alsx;
import defpackage.alvg;
import defpackage.alvi;
import defpackage.alvw;
import defpackage.alwp;
import defpackage.amvm;
import defpackage.aozy;
import defpackage.aqas;
import defpackage.armf;
import defpackage.atkn;
import defpackage.d;
import defpackage.eex;
import defpackage.eyg;
import defpackage.lce;
import defpackage.mbm;
import defpackage.mcb;
import defpackage.mce;
import defpackage.mlo;
import defpackage.msh;
import defpackage.msn;
import defpackage.nds;
import defpackage.qfe;
import defpackage.qiu;
import defpackage.qqv;
import defpackage.qvi;
import defpackage.qvn;
import defpackage.qxq;
import defpackage.qya;
import defpackage.qyd;
import defpackage.qye;
import defpackage.rix;
import defpackage.rjl;
import defpackage.roi;
import defpackage.rsi;
import defpackage.rtz;
import defpackage.rui;
import defpackage.ruy;
import defpackage.ruz;
import defpackage.rva;
import defpackage.rvc;
import defpackage.rvy;
import defpackage.rwd;
import defpackage.rxn;
import defpackage.rxq;
import defpackage.ryu;
import defpackage.rzi;
import defpackage.rzj;
import defpackage.rzk;
import defpackage.rzl;
import defpackage.rzm;
import defpackage.rzn;
import defpackage.rzo;
import defpackage.rzx;
import defpackage.skk;
import defpackage.sku;
import defpackage.skx;
import defpackage.sla;
import defpackage.slb;
import defpackage.slc;
import defpackage.sld;
import defpackage.slw;
import defpackage.sly;
import defpackage.smh;
import defpackage.smk;
import defpackage.smp;
import defpackage.smr;
import defpackage.smu;
import defpackage.smv;
import defpackage.sna;
import defpackage.snb;
import defpackage.snf;
import defpackage.sng;
import defpackage.snh;
import defpackage.sni;
import defpackage.som;
import defpackage.soq;
import defpackage.sov;
import defpackage.soy;
import defpackage.soz;
import defpackage.srm;
import defpackage.sss;
import defpackage.stl;
import defpackage.svq;
import defpackage.swb;
import defpackage.sww;
import defpackage.sxo;
import defpackage.sxp;
import defpackage.sxt;
import defpackage.sxx;
import defpackage.sxy;
import defpackage.sya;
import defpackage.syb;
import defpackage.syc;
import defpackage.syx;
import defpackage.tap;
import defpackage.tar;
import defpackage.tas;
import defpackage.tav;
import defpackage.taz;
import defpackage.tbb;
import defpackage.tbd;
import defpackage.tbe;
import defpackage.tbh;
import defpackage.tbi;
import defpackage.tbn;
import defpackage.tbo;
import defpackage.tbr;
import defpackage.tbs;
import defpackage.tbt;
import defpackage.tbu;
import defpackage.tcs;
import defpackage.tde;
import defpackage.tdf;
import defpackage.tdi;
import defpackage.tdj;
import defpackage.tdv;
import defpackage.tec;
import defpackage.teh;
import defpackage.tel;
import defpackage.teq;
import defpackage.tgi;
import defpackage.tgp;
import defpackage.tgr;
import defpackage.tgw;
import defpackage.tgx;
import defpackage.tgz;
import defpackage.thb;
import defpackage.thc;
import defpackage.thd;
import defpackage.thk;
import defpackage.thu;
import defpackage.thv;
import defpackage.tid;
import defpackage.tkh;
import defpackage.tkl;
import defpackage.tko;
import defpackage.tkq;
import defpackage.tkr;
import defpackage.tlp;
import defpackage.tlq;
import defpackage.tlr;
import defpackage.tmc;
import defpackage.tmh;
import defpackage.tmo;
import defpackage.tmv;
import defpackage.tnc;
import defpackage.tne;
import defpackage.tnh;
import defpackage.tnk;
import defpackage.tnl;
import defpackage.tnm;
import defpackage.toi;
import defpackage.tol;
import defpackage.tom;
import defpackage.tpk;
import defpackage.tps;
import defpackage.tqc;
import defpackage.tqm;
import defpackage.tqr;
import defpackage.uli;
import defpackage.und;
import defpackage.uof;
import defpackage.upk;
import defpackage.upz;
import defpackage.uqu;
import defpackage.uta;
import defpackage.utw;
import defpackage.utz;
import defpackage.vom;
import defpackage.vqm;
import defpackage.vqq;
import defpackage.vqu;
import defpackage.wfg;
import defpackage.wfh;
import defpackage.wtd;
import defpackage.wzp;
import defpackage.wzs;
import defpackage.xaz;
import defpackage.xhv;
import defpackage.xyl;
import defpackage.xyo;
import defpackage.xze;
import defpackage.xzq;
import defpackage.yhx;
import defpackage.yjf;
import defpackage.yjr;
import defpackage.yst;
import defpackage.yyb;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CustomUpgradeSteps {
    private static final String CREATE_CONVERSATION_SUGGESTIONS_INDEX_11000 = "CREATE INDEX index_conversation_suggestions_message_id ON conversation_suggestions(message_id);";
    private static final String CREATE_CONVERSATION_SUGGESTIONS_TABLE_11000 = "CREATE TABLE conversation_suggestions(_id INTEGER PRIMARY KEY AUTOINCREMENT, message_id STRING, conversation_suggestion_type INT DEFAULT(0), properties TEXT, post_back_data TEXT, post_back_encoding TEXT, FOREIGN KEY (message_id) REFERENCES  messages(_id) ON DELETE CASCADE);";
    private static final String CREATE_PROXY_TABLE_SQL = "CREATE TABLE proxy_state_table(_id INTEGER PRIMARY KEY AUTOINCREMENT, participant_id STRING UNIQUE, disabled_reports_timestamp INT DEFAULT(0), FOREIGN KEY (participant_id) REFERENCES participants(_id) ON DELETE CASCADE);";
    private static final String HUAWEI_MANUFACTURER = "HUAWEI";
    private static final int MARK_RCS_IN_TELEPHONY_BATCH_SIZE = 100;
    private static final String PROXY_DISABLED_REPORTS_TIMESTAMP = "disabled_reports_timestamp";
    private static final String PROXY_INDEX = "index_proxy_state_table_participant_id";
    private static final String PROXY_PARTICIPANT_ID = "participant_id";
    private static final String PROXY_TABLE = "proxy_state_table";
    private static final String PROXY_TABLE_PARTICIPANT_ID_INDEX_SQL = "CREATE INDEX index_proxy_state_table_participant_id ON proxy_state_table(participant_id)";
    private final yst base32Utils;
    private final yjr buglePhoneNumberUtils;
    private final uli cmsBackFillBnrStateForFiMdQueue;
    private final Context context;
    private final armf<rtz> conversationDatabaseOperations;
    private final rix markAsReadActionFactory;
    private final wfh markRcsMessagesInTelephonyQueue;
    private final armf<rwd> messageDatabaseOperations;
    private final qya participantAvatarUriGenerator;
    private final armf<rxq> participantDatabaseOperations;
    private final nds participantRowFactory;
    private final yjf permissionChecker;
    private final armf<vqm> rcsTelephonyAccess;
    private final vqq rcsTelephonyStrings;
    private final vqu rcsUtils;
    private final rjl sanitizeParticipantsActionFactory;
    private final armf<wzp> syncManager;
    private final armf<wzs> telephonyManagerInterface;
    private final mce timerEventLogger;
    private static final xze log = xze.g("BugleDataModel", "OnDeviceDatabaseUpgradeHandler");
    private static final alvi logger = alvi.m("com/google/android/apps/messaging/shared/datamodel/database/upgrade/CustomUpgradeSteps");
    private static final String[] HUAWEI_MATE_20_MODEL_NAMES = {"LYA-L09", "LYA-L29", "LYA-L0C", "HMA-L09", "HMA-L29", "EVR-L29"};

    public CustomUpgradeSteps(Context context, armf<wzp> armfVar, yjf yjfVar, armf<rxq> armfVar2, armf<rtz> armfVar3, armf<rwd> armfVar4, vqu vquVar, vqq vqqVar, armf<vqm> armfVar5, yst ystVar, armf<wzs> armfVar6, mce mceVar, yjr yjrVar, rjl rjlVar, qya qyaVar, rix rixVar, wfh wfhVar, uli uliVar, nds ndsVar) {
        this.context = context;
        this.syncManager = armfVar;
        this.permissionChecker = yjfVar;
        this.participantDatabaseOperations = armfVar2;
        this.conversationDatabaseOperations = armfVar3;
        this.messageDatabaseOperations = armfVar4;
        this.rcsUtils = vquVar;
        this.rcsTelephonyStrings = vqqVar;
        this.rcsTelephonyAccess = armfVar5;
        this.base32Utils = ystVar;
        this.telephonyManagerInterface = armfVar6;
        this.timerEventLogger = mceVar;
        this.buglePhoneNumberUtils = yjrVar;
        this.sanitizeParticipantsActionFactory = rjlVar;
        this.participantAvatarUriGenerator = qyaVar;
        this.markAsReadActionFactory = rixVar;
        this.markRcsMessagesInTelephonyQueue = wfhVar;
        this.cmsBackFillBnrStateForFiMdQueue = uliVar;
        this.participantRowFactory = ndsVar;
    }

    private static smh[] applyDeduplicationAndConvert(alog<sku> alogVar) {
        return (smh[]) Collection.EL.stream(((alor) Collection.EL.stream(alogVar).filter(new rsi(16)).filter(new rsi(17)).collect(alls.b(new rzj(11), Function$CC.identity(), new mcb(10)))).values()).map(new rzj(12)).toArray(new mlo(6));
    }

    private void broadcastIncreaseSessionIdIntent() {
        Intent intent = new Intent(RcsIntents.ACTION_DEBUG_OPTION_INCREASE_SESSION_ID);
        adwi.c(this.context, intent);
        adtw.c(this.context, intent);
        this.context.sendBroadcast(intent);
    }

    private static void copyBlobIdIntoCompressedBlobId() {
        xze xzeVar = log;
        xzeVar.o("begin copyBlobIdIntoCompressedBlobId.");
        tbt tbtVar = new tbt();
        tbtVar.aj("copyBlobIdIntoCompressedBlobId-parts1");
        tbtVar.aa("compressed_blob_id", PartsTable.d.z);
        tbtVar.a().e();
        tbt tbtVar2 = new tbt();
        tbtVar2.aj("copyBlobIdIntoCompressedBlobIdparts2");
        tbtVar2.aa("compressed_blob_upload_permanent_failure", PartsTable.d.E);
        tbtVar2.a().e();
        tbt tbtVar3 = new tbt();
        tbtVar3.aj("copyBlobIdIntoCompressedBlobId-parts3");
        tbtVar3.aa("compressed_blob_upload_timestamp", PartsTable.d.F);
        tbtVar3.a().e();
        xzeVar.o("completed copyBlobIdIntoCompressedBlobId.");
    }

    private static void fixLegacyResourceUris() {
        fixLegacyResourceUrisInConversations();
        fixLegacyResourceUrisInDrafts();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0063, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002e, code lost:
    
        if (r0.moveToFirst() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0030, code lost:
    
        r1 = getUpdatedLegacyStickerUri(r0.v());
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0038, code lost:
    
        if (r1 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003a, code lost:
    
        r2 = new defpackage.sng();
        r2.aj("fixLegacyResourceUrisInConversations2");
        r2.o(r1);
        r1 = new defpackage.snh();
        r1.j(r0.C());
        r2.W(r1);
        r2.a().e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0061, code lost:
    
        if (r0.moveToNext() != false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void fixLegacyResourceUrisInConversations() {
        /*
            snf r0 = defpackage.sni.e()
            java.lang.String r1 = "fixLegacyResourceUrisInConversations1"
            r0.w(r1)
            r0.q()
            rzi r1 = new rzi
            r2 = 18
            r1.<init>(r2)
            r0.e(r1)
            rzi r1 = new rzi
            r2 = 19
            r1.<init>(r2)
            r0.h(r1)
            sne r0 = r0.b()
            agmq r0 = r0.n()
            sna r0 = (defpackage.sna) r0
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L63
        L30:
            android.net.Uri r1 = r0.v()     // Catch: java.lang.Throwable -> L67
            android.net.Uri r1 = getUpdatedLegacyStickerUri(r1)     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L5d
            sng r2 = new sng     // Catch: java.lang.Throwable -> L67
            r2.<init>()     // Catch: java.lang.Throwable -> L67
            java.lang.String r3 = "fixLegacyResourceUrisInConversations2"
            r2.aj(r3)     // Catch: java.lang.Throwable -> L67
            r2.o(r1)     // Catch: java.lang.Throwable -> L67
            snh r1 = new snh     // Catch: java.lang.Throwable -> L67
            r1.<init>()     // Catch: java.lang.Throwable -> L67
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r3 = r0.C()     // Catch: java.lang.Throwable -> L67
            r1.j(r3)     // Catch: java.lang.Throwable -> L67
            r2.W(r1)     // Catch: java.lang.Throwable -> L67
            agpr r1 = r2.a()     // Catch: java.lang.Throwable -> L67
            r1.e()     // Catch: java.lang.Throwable -> L67
        L5d:
            boolean r1 = r0.moveToNext()     // Catch: java.lang.Throwable -> L67
            if (r1 != 0) goto L30
        L63:
            r0.close()
            return
        L67:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L6c
            goto L70
        L6c:
            r0 = move-exception
            r1.addSuppressed(r0)
        L70:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.database.upgrade.CustomUpgradeSteps.fixLegacyResourceUrisInConversations():void");
    }

    private static void fixLegacyResourceUrisInDrafts() {
        boolean z;
        tbs d = PartsTable.d();
        d.w("fixLegacyResourceUrisInDrafts");
        d.q();
        d.d(new rzi(13));
        d.g(new rzi(15));
        tbn tbnVar = (tbn) d.b().n();
        while (tbnVar.moveToNext()) {
            try {
                Uri updatedLegacyStickerUri = getUpdatedLegacyStickerUri(tbnVar.v());
                Uri updatedLegacyStickerUri2 = getUpdatedLegacyStickerUri(tbnVar.s());
                Uri updatedLegacyStickerUri3 = getUpdatedLegacyStickerUri(tbnVar.q());
                tbt tbtVar = new tbt();
                tbtVar.aj("fixLegacyResourceUrisInDrafts-parts");
                boolean z2 = true;
                if (updatedLegacyStickerUri != null) {
                    tbtVar.s(updatedLegacyStickerUri);
                    z = true;
                } else {
                    z = false;
                }
                if (updatedLegacyStickerUri2 != null) {
                    tbtVar.o(updatedLegacyStickerUri2);
                } else {
                    z2 = z;
                }
                if (updatedLegacyStickerUri3 != null) {
                    tbtVar.h(updatedLegacyStickerUri3);
                } else if (z2) {
                }
                tbtVar.b(tbnVar.Q());
            } catch (Throwable th) {
                try {
                    tbnVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        tbnVar.close();
    }

    private void fixRcsGroupConversation(agnw agnwVar, ConversationIdType conversationIdType, long j, String str, String str2) {
        boolean z;
        xaz j2;
        if (str2 != null) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "lastUri cannot be null");
        xyo a = log.a();
        a.H("Promoting to an Rcs group.");
        a.b(conversationIdType);
        a.q();
        if (((Boolean) ((utz) vqu.a.get()).e()).booleanValue()) {
            j2 = ((vqm) this.rcsTelephonyAccess.b()).c(j, str, str2);
        } else {
            j2 = this.rcsUtils.j(j, str, str2);
        }
        agnwVar.A("OnDeviceDatabaseUpgradeHandler#fixRcsGroupConversation", new eex(this, str, j2, conversationIdType, 19, null));
    }

    private static void fixSpamWarningForOlderReports() {
        Integer valueOf;
        xze xzeVar = log;
        xzeVar.o("begin fixSpamWarningForOlderReports.");
        sng sngVar = new sng();
        sngVar.aj("fixSpamWarningForOlderReports");
        sngVar.af();
        sngVar.U(false);
        snh snhVar = new snh();
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 23000) {
            agnc.t("spam_warning_dismiss_status", intValue);
        }
        snhVar.U(new agoi("conversations.spam_warning_dismiss_status", 1, 1));
        sngVar.W(snhVar);
        sngVar.a().e();
        xzeVar.o("completed fixSpamWarningForOlderReports.");
    }

    private static alog<smr> getAllRcsGroupConversationsWithJoinedStatus() {
        snf e = sni.e();
        e.w("CustomUpgradeSteps#getAllRcsGroupConversations");
        e.q();
        e.h(new rzk(11));
        smu smuVar = sni.c;
        e.c(smuVar.a, smuVar.am);
        return e.b().t();
    }

    private static Uri getUpdatedLegacyStickerUri(Uri uri) {
        String str;
        if (uri != null) {
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() == 1) {
                switch (Integer.parseInt(pathSegments.get(0))) {
                    case 2130837661:
                        str = "foodies_animated_angry";
                        break;
                    case 2130837662:
                        str = "foodies_animated_bye";
                        break;
                    case 2130837663:
                        str = "foodies_animated_confused";
                        break;
                    case 2130837664:
                        str = "foodies_animated_congratulations";
                        break;
                    default:
                        return null;
                }
                Uri build = new Uri.Builder().scheme("android.resource").authority(albo.ag(uri.getAuthority())).appendPath("drawable").appendPath(str).build();
                xyo a = log.a();
                a.H("Convert sticker.");
                a.z("oldUri", uri.toString());
                a.z("updatedUri", build.toString());
                a.q();
                return build;
            }
            return null;
        }
        return null;
    }

    private void huaweiMate20UpgradeCleardata() {
        if (((Boolean) utw.Q.e()).booleanValue() && HUAWEI_MANUFACTURER.equalsIgnoreCase(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            for (String str2 : HUAWEI_MATE_20_MODEL_NAMES) {
                if (str.equalsIgnoreCase(str2)) {
                    xze xzeVar = log;
                    xzeVar.q("Huawei Mate-20 phone detected");
                    Context context = this.context;
                    if (context == null) {
                        xzeVar.q("huaweiMate20UpgradeClearData - unable to retrieve context");
                        return;
                    }
                    ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                    if (activityManager == null) {
                        xzeVar.q("huaweiMate20UpgradeClearData - unable to retrieve activity service");
                        return;
                    }
                    xzeVar.q("huaweiMate20UpgradeClearData - Wiping data.");
                    activityManager.clearApplicationUserData();
                    xzeVar.q("huaweiMate20UpgradeClearData - Wiped data.  Forcing exit.");
                    System.exit(0);
                    return;
                }
            }
        }
    }

    private static void invalidateRcsSessionIdsForOneToOne() {
        sng sngVar = new sng();
        sngVar.aj("invalidateRcsSessionIdsForOneToOne");
        sngVar.af();
        sngVar.N(-1L);
        sngVar.X(new rzi(11));
        sngVar.a().e();
    }

    public static /* synthetic */ boolean lambda$applyDeduplicationAndConvert$0(sku skuVar) {
        if (skuVar.l() != null && !albo.ah(skuVar.l().toString())) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean lambda$applyDeduplicationAndConvert$1(sku skuVar) {
        if (skuVar.h() > 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ sku lambda$applyDeduplicationAndConvert$2(sku skuVar, sku skuVar2) {
        if (skuVar.n()) {
            return skuVar;
        }
        return skuVar2;
    }

    public static /* synthetic */ smh[] lambda$applyDeduplicationAndConvert$3(int i) {
        return new smh[i];
    }

    public static /* synthetic */ smv[] lambda$fixLegacyResourceUrisInConversations$0(smu smuVar) {
        return new smv[]{smuVar.a, smuVar.n};
    }

    public static /* synthetic */ snh lambda$fixLegacyResourceUrisInConversations$1(snh snhVar) {
        snhVar.h();
        return snhVar;
    }

    public static /* synthetic */ tbi[] lambda$fixLegacyResourceUrisInDrafts$0(tbh tbhVar) {
        return new tbi[]{tbhVar.a, tbhVar.d, tbhVar.u, tbhVar.w};
    }

    public static /* synthetic */ tbu lambda$fixLegacyResourceUrisInDrafts$1(tbu tbuVar) {
        tbuVar.b(new rzj(16), new rzj(17), new rzj(18));
        return tbuVar;
    }

    public static /* synthetic */ tbu lambda$fixLegacyResourceUrisInDrafts$2(tbu tbuVar) {
        tbuVar.o();
        return tbuVar;
    }

    public static /* synthetic */ tbu lambda$fixLegacyResourceUrisInDrafts$3(tbu tbuVar) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 10017) {
            agnc.t("preview_content_uri", intValue);
        }
        tbuVar.U(new agmd("parts.preview_content_uri", 11, "android.resource%"));
        return tbuVar;
    }

    public static /* synthetic */ tbu lambda$fixLegacyResourceUrisInDrafts$4(tbu tbuVar) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 13000) {
            agnc.t("fallback_uri", intValue);
        }
        tbuVar.U(new agmd("parts.fallback_uri", 11, "android.resource%"));
        return tbuVar;
    }

    public static /* synthetic */ snh lambda$getAllRcsGroupConversationsWithJoinedStatus$0(snh snhVar) {
        snhVar.e(2);
        snhVar.m(0);
        return snhVar;
    }

    public static /* synthetic */ smv[] lambda$getAllRcsThreadIdGroupNamePairs$0(smu smuVar) {
        return new smv[]{smuVar.b, smuVar.c};
    }

    public static /* synthetic */ snh lambda$invalidateRcsSessionIdsForOneToOne$0(snh snhVar) {
        snhVar.e(0);
        return snhVar;
    }

    public static /* synthetic */ List lambda$potentiallyInvalidateRcsSessionIdsForRcsGroups$0(Long l) {
        return new ArrayList();
    }

    public static /* synthetic */ void lambda$potentiallyInvalidateRcsSessionIdsForRcsGroups$1(List list) {
        sng sngVar = new sng();
        sngVar.aj("potentiallyInvalidateRcsSessionIdsForRcsGroups#update");
        sngVar.v(4);
        sngVar.N(-1L);
        snh snhVar = new snh();
        snhVar.l(list);
        sngVar.Z(new agpw(snhVar));
        sngVar.a().e();
    }

    public static /* synthetic */ smh[] lambda$rebuildConversationToParticipantsTable$0(int i) {
        return new smh[i];
    }

    public static /* synthetic */ slc lambda$toOtherConversationToParticipants$0(ConversationIdType conversationIdType, long j, slc slcVar) {
        slcVar.b(conversationIdType);
        slcVar.d(j);
        return slcVar;
    }

    public static /* synthetic */ syc lambda$updateNotNeededMessageSendReportStatusInTransactionPre41040$0(syc sycVar) {
        sycVar.W(new agpk("rcs_message_id NOT NULL AND rcs_message_id <> ''", new Object[0]));
        sycVar.r(0);
        return sycVar;
    }

    public static /* synthetic */ snh lambda$upgradeToVersion10015$1(snh snhVar) {
        snhVar.U(new agmg("conversations.participant_lookup_key", 6));
        return snhVar;
    }

    public static /* synthetic */ snh lambda$upgradeToVersion10020$0(snh snhVar) {
        snhVar.e(0);
        snhVar.x();
        return snhVar;
    }

    public static /* synthetic */ snh lambda$upgradeToVersion10025$0(snh snhVar) {
        snhVar.e(3);
        return snhVar;
    }

    public static /* synthetic */ void lambda$upgradeToVersion13030$0() {
        Integer valueOf;
        syc sycVar = new syc();
        sycVar.M(108);
        updateNotNeededMessageSendReportStatusInTransactionPre41040(new syb(sycVar), 2);
        syc sycVar2 = new syc();
        sycVar2.M(109);
        updateNotNeededMessageSendReportStatusInTransactionPre41040(new syb(sycVar2), 3);
        syc sycVar3 = new syc();
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 13020) {
            agnc.t("message_report_status", intValue);
        }
        sycVar3.U(new agoi("messages.message_report_status", 9, 100));
        updateNotNeededMessageSendReportStatusInTransactionPre41040(new syb(sycVar3), 1);
    }

    public static /* synthetic */ tbd lambda$upgradeToVersion2000$0(int i, tbd tbdVar) {
        tbdVar.q(i);
        return tbdVar;
    }

    public static /* synthetic */ tbd lambda$upgradeToVersion2000$1(int i, tbd tbdVar) {
        tbdVar.q(i);
        return tbdVar;
    }

    public static /* synthetic */ soy lambda$upgradeToVersion24050$0(soy soyVar) {
        soyVar.U(new agmg("disambiguations.normalized_destination", 5));
        return soyVar;
    }

    public static /* synthetic */ tbu lambda$upgradeToVersion29000$0(tbu tbuVar) {
        tbuVar.o();
        return tbuVar;
    }

    public static /* synthetic */ snh lambda$upgradeToVersion29000$1(snh snhVar) {
        snhVar.h();
        return snhVar;
    }

    public static /* synthetic */ tas[] lambda$upgradeToVersion29050$0(tar tarVar) {
        return new tas[]{tarVar.f, tarVar.e, tarVar.d, tarVar.w, tarVar.x, tarVar.a};
    }

    public static /* synthetic */ tbd lambda$upgradeToVersion29050$1(tbd tbdVar) {
        tbdVar.s();
        return tbdVar;
    }

    public static /* synthetic */ tbu lambda$upgradeToVersion30030$1(tbu tbuVar) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 14010) {
            agnc.t("source", intValue);
        }
        tbuVar.U(new agoi("parts.source", 1, 21));
        return tbuVar;
    }

    public static /* synthetic */ syc lambda$upgradeToVersion30030$2(tbr tbrVar, syc sycVar) {
        sycVar.l(tbrVar);
        return sycVar;
    }

    public static /* synthetic */ syc lambda$upgradeToVersion3010$1(syc sycVar) {
        sycVar.j(PartsTable.d.b);
        return sycVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, agpj] */
    public static /* synthetic */ syc lambda$upgradeToVersion35070$1(syc sycVar) {
        sycVar.j(tgr.d.c);
        return sycVar;
    }

    public static /* synthetic */ syc lambda$upgradeToVersion4020$0(int i, syc sycVar) {
        sycVar.M(i - 90);
        return sycVar;
    }

    public static /* synthetic */ tlq lambda$upgradeToVersion41040$0(tlq tlqVar) {
        tlqVar.U(new agmd("sqlite_master.type", 1, "trigger"));
        tlqVar.U(new agmd("sqlite_master.name", 1, "on_messages_update_bkr"));
        return tlqVar;
    }

    public static /* synthetic */ snh lambda$upgradeToVersion42040$0(snh snhVar) {
        snhVar.c(tqc.KEEP_ARCHIVED);
        return snhVar;
    }

    public static /* synthetic */ snh lambda$upgradeToVersion42040$1(snh snhVar) {
        snhVar.c(tqc.ARCHIVED);
        snhVar.p();
        return snhVar;
    }

    public static /* synthetic */ smv[] lambda$upgradeToVersion42040$2(smu smuVar) {
        return new smv[]{smuVar.a, smuVar.y};
    }

    public static /* synthetic */ tbd lambda$upgradeToVersion42040$3(String str, tbd tbdVar) {
        Integer valueOf;
        tbdVar.l(str);
        agpx[] agpxVarArr = new tbd[2];
        tbd tbdVar2 = new tbd();
        tbdVar2.c();
        agpxVarArr[0] = tbdVar2;
        agpx tbdVar3 = new tbd();
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 24060) {
            agnc.t("is_spam", intValue);
        }
        tbdVar3.U(new agoi("participants.is_spam", 1, 1));
        agpxVarArr[1] = tbdVar3;
        tbdVar.V(agpxVarArr);
        return tbdVar;
    }

    public static /* synthetic */ tas[] lambda$upgradeToVersion42040$4(tar tarVar) {
        return new tas[]{tarVar.v, tarVar.C, tarVar.D};
    }

    public static /* synthetic */ snh lambda$upgradeToVersion42040$5(ArrayList arrayList, snh snhVar) {
        snhVar.l(arrayList);
        return snhVar;
    }

    public static /* synthetic */ snh lambda$upgradeToVersion42040$6(ArrayList arrayList, snh snhVar) {
        snhVar.l(arrayList);
        return snhVar;
    }

    public static /* synthetic */ void lambda$upgradeToVersion45000$0() {
        agnw d;
        agnw d2;
        agnw d3;
        agnw d4;
        tgz a = thb.a();
        a.w("upgradeToVersion45000");
        a.q();
        tgw tgwVar = (tgw) a.b().n();
        while (tgwVar.moveToNext()) {
            try {
                String i = tgwVar.i();
                if (i != null) {
                    thd a2 = thk.a();
                    a2.i(i);
                    a2.b(tgwVar.e());
                    a2.c(tgwVar.j());
                    a2.e(tgwVar.l());
                    a2.f(tgwVar.k());
                    a2.g(tgwVar.f());
                    a2.j(tgwVar.c());
                    thc a3 = a2.a();
                    d = agnc.d("$primary");
                    d2 = agnc.d("$primary");
                    agnc.a(d2, "remote_registrations_table", a3, new tbe(d, 15), new swb(9));
                    tpk b = tid.b();
                    b.e(tgwVar.h());
                    b.f(i);
                    thv d5 = b.d();
                    d3 = agnc.d("$primary");
                    d4 = agnc.d("$primary");
                    agnc.a(d4, "remote_user_id_to_registration_id", d5, new tbe(d3, 18), new swb(12));
                }
                tmc c = thu.c();
                c.h(tgwVar.h());
                c.g(tgwVar.f());
                c.f(tgwVar.e());
                c.e().l();
            } catch (Throwable th) {
                try {
                    tgwVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        tgx tgxVar = new tgx();
        tgxVar.f("upgradeToVersion45000");
        tgxVar.d();
        tgwVar.close();
    }

    public static /* synthetic */ snh lambda$upgradeToVersion49000$0(snh snhVar) {
        snhVar.m(3);
        snhVar.e(2);
        return snhVar;
    }

    public static /* synthetic */ tas[] lambda$upgradeToVersion52020$0(tar tarVar) {
        return new tas[]{tarVar.a, tarVar.o};
    }

    public static /* synthetic */ tbd lambda$upgradeToVersion52020$1(tbd tbdVar) {
        tbdVar.k(tqr.VERIFICATION_NA);
        return tbdVar;
    }

    public static /* synthetic */ sxp[] lambda$upgradeToVersion53000$0(sxo sxoVar) {
        return new sxp[]{sxoVar.a};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, agpj] */
    public static /* synthetic */ syc lambda$upgradeToVersion53000$1(syc sycVar) {
        sycVar.j(tom.e.b);
        sycVar.b(new rzk(9), new rzk(10));
        return sycVar;
    }

    public static /* synthetic */ syc lambda$upgradeToVersion53000$2(syc sycVar) {
        sycVar.M(217);
        return sycVar;
    }

    public static /* synthetic */ syc lambda$upgradeToVersion53000$3(syc sycVar) {
        sycVar.M(211);
        return sycVar;
    }

    public static /* synthetic */ tol lambda$upgradeToVersion53000$4(sxx sxxVar, tol tolVar) {
        tolVar.W(new agov(sxxVar));
        return tolVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, agpj] */
    public static /* synthetic */ syc lambda$upgradeToVersion58020$1(syc sycVar) {
        sycVar.j(ScheduledSendTable.d.f);
        return sycVar;
    }

    public static /* synthetic */ tnk lambda$upgradeToVersion58650$0(tnk tnkVar) {
        tnkVar.U(new agoi("supersort_labels._id", 1, 6));
        return tnkVar;
    }

    public static /* synthetic */ snh lambda$upgradeToVersion59320$0(snh snhVar) {
        snhVar.g(1);
        snhVar.i(false);
        return snhVar;
    }

    public static /* synthetic */ syc lambda$upgradeToVersion59480$0(syc sycVar) {
        sycVar.M(232);
        sycVar.U(new agmg("messages.self_id", 5));
        return sycVar;
    }

    public static /* synthetic */ syc lambda$upgradeToVersion59500$0(syc sycVar) {
        sycVar.E(new ruz(""));
        return sycVar;
    }

    public static /* synthetic */ soq lambda$upgradeToVersion59600$0(soq soqVar) {
        Object apply;
        soqVar.d(tqm.GAIA);
        Function[] functionArr = {new rzk(15), new rzk(16)};
        soq[] soqVarArr = new soq[2];
        for (int i = 0; i < 2; i++) {
            apply = functionArr[i].apply(new soq());
            soqVarArr[i] = (soq) apply;
        }
        soqVar.V(soqVarArr);
        return soqVar;
    }

    public static /* synthetic */ soq lambda$upgradeToVersion59600$1(soq soqVar) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 59560) {
            agnc.t("gaia_email", intValue);
        }
        soqVar.U(new agmg("desktop.gaia_email", 5));
        return soqVar;
    }

    public static /* synthetic */ soq lambda$upgradeToVersion59600$2(soq soqVar) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 59560) {
            agnc.t("gaia_email", intValue);
        }
        soqVar.U(new agmd("desktop.gaia_email", 1, ""));
        return soqVar;
    }

    public static /* synthetic */ tdf lambda$upgradeToVersion59760$0(tde tdeVar) {
        return (tdf) tdeVar.b;
    }

    public static /* synthetic */ tdf lambda$upgradeToVersion59760$1(tde tdeVar) {
        return (tdf) tdeVar.i;
    }

    public static /* synthetic */ slc lambda$upgradeToVersion59760$2(tdi tdiVar, slc slcVar) {
        slcVar.U(new agme("conversation_participants.participant_id", 1, tdiVar));
        return slcVar;
    }

    public static /* synthetic */ snh lambda$upgradeToVersion59760$3(sku skuVar, snh snhVar) {
        snhVar.e(0);
        snhVar.j(skuVar.l());
        return snhVar;
    }

    public static /* synthetic */ tbd lambda$upgradeToVersion59840$0(tbd tbdVar) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 4000) {
            agnc.t("contact_destination", intValue);
        }
        tbdVar.U(new agmg("participants.contact_destination", 6));
        return tbdVar;
    }

    public static /* synthetic */ tkq lambda$upgradeToVersion60270$0(tkq tkqVar) {
        tkqVar.b(-1);
        tkqVar.U(new agoi("self_participants.sim_slot_index", 9, 0));
        return tkqVar;
    }

    public static /* synthetic */ tkq lambda$upgradeToVersion60270$1(tkh tkhVar, tkq tkqVar) {
        tkqVar.U(new agoi("self_participants.sub_id", 7, -1));
        tkhVar.ao(3, "sim_slot_index");
        tkqVar.U(new agoi("self_participants.sim_slot_index", 1, Integer.valueOf(tkhVar.d)));
        return tkqVar;
    }

    public static /* synthetic */ syc lambda$upgradeToVersion60370$0(syc sycVar) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 60370) {
            agnc.t("message_persistence_id", intValue);
        }
        sycVar.U(new agmg("messages.message_persistence_id", 5));
        return sycVar;
    }

    public static /* synthetic */ snh lambda$upgradeToVersion60450$0(snh snhVar) {
        snhVar.y(xhv.b(0L));
        return snhVar;
    }

    private void markMessagesAsReadInTelephonyAsync() {
        xze xzeVar = log;
        xzeVar.o("begin markMessagesAsReadInTelephonyAsync.");
        if (!this.buglePhoneNumberUtils.y()) {
            xzeVar.o("Not default sms app. Cannot mark messages as read in telephony.");
        } else {
            if (!this.permissionChecker.m()) {
                xzeVar.o("No SMS permissions. Cannot mark messages as read in telephony.");
                return;
            }
            xzq.a(this.context, new rzl(this));
            xzeVar.o("completed markMessagesAsReadInTelephonyAsync.");
        }
    }

    public void markMessagesAsReadInTelephonySync() {
        sxy d = MessagesTable.d();
        d.w("markMessagesAsReadInTelephonySync");
        sxo sxoVar = MessagesTable.c;
        d.c(sxoVar.o, sxoVar.i);
        syc sycVar = new syc();
        sycVar.A(true);
        sycVar.K();
        d.f(sycVar);
        d.h(new atkn((Object) MessagesTable.c.i, false));
        d.t(MessagesTable.c.b);
        sxt sxtVar = (sxt) d.b().n();
        while (sxtVar.moveToNext()) {
            try {
                ((wzs) this.telephonyManagerInterface.b()).ad(sxtVar.A(), sxtVar.s());
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
    }

    private void potentiallyInvalidateRcsSessionIdsForRcsGroups(agnw agnwVar) {
        ArrayList arrayList = new ArrayList();
        snf e = sni.e();
        e.w("potentiallyInvalidateRcsSessionIdsForRcsGroups");
        e.q();
        smu smuVar = sni.c;
        e.c(smuVar.a, smuVar.M);
        snh snhVar = new snh();
        snhVar.e(2);
        e.k(new agpw(snhVar));
        sna snaVar = (sna) e.b().n();
        try {
            HashMap hashMap = new HashMap();
            while (snaVar.moveToNext()) {
                ((List) Map.EL.computeIfAbsent(hashMap, Long.valueOf(snaVar.s()), new rzi(3))).add(snaVar.C());
            }
            for (List list : hashMap.values()) {
                if (list.size() > 1) {
                    arrayList.addAll(list);
                }
            }
            snaVar.close();
            if (!arrayList.isEmpty()) {
                agnwVar.A("OnDeviceDatabaseUpgradeHandler#potentiallyInvalidateRcsSessionIdsForRcsGroups", new rui(arrayList, 5));
            }
        } catch (Throwable th) {
            try {
                snaVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private void rebuildConversationToParticipantsTable() {
        smk smkVar = new smk();
        smkVar.e();
        smkVar.d();
        sla a = sld.a();
        a.q();
        smp.a(applyDeduplicationAndConvert(a.b().t()));
        smh[] smhVarArr = (smh[]) Collection.EL.stream(getAllRcsGroupConversationsWithJoinedStatus()).map(new ryu(this, 3)).filter(new rsi(15)).map(new rzi(14)).toArray(new mlo(5));
        smp.a(smhVarArr);
        if (smhVarArr.length > 0) {
            upgradeRcsGroupsConversationParticipantCount();
        }
    }

    private void sanitizeParticipants() {
        xze xzeVar = log;
        xzeVar.o("begin sanitizeParticipants.");
        this.sanitizeParticipantsActionFactory.b().z();
        xzeVar.o("completed sanitizeParticipants.");
    }

    private void setThreadArchiveStatusInTelephonyAsync(boolean z) {
        xze xzeVar = log;
        xzeVar.o("begin setThreadArchiveStatusInTelephonyAsync.");
        if (!this.buglePhoneNumberUtils.y()) {
            xzeVar.o("Not default SMS app. Cannot set thread archive status in telephony.");
        } else {
            if (!this.permissionChecker.m()) {
                xzeVar.o("No SMS permissions. Cannot set thread archive status in telephony.");
                return;
            }
            xzq.a(this.context, new rzm(this, z));
            xzeVar.o("completed setThreadArchiveStatusInTelephonyAsync.");
        }
    }

    public void setThreadArchiveStatusInTelephonySync(boolean z) {
        snh snhVar = new snh();
        if (z) {
            snhVar.d(tqc.UNARCHIVED);
        } else {
            snhVar.c(tqc.UNARCHIVED);
        }
        snf e = sni.e();
        e.w("setThreadArchiveStatusInTelephonySync");
        e.f(new rzj(2));
        snhVar.U(new agmg("conversations.sms_thread_id", 6));
        e.g(snhVar);
        sna snaVar = (sna) e.b().n();
        while (snaVar.moveToNext()) {
            try {
                ((wzs) this.telephonyManagerInterface.b()).Q(snaVar.L(), z);
            } catch (Throwable th) {
                try {
                    snaVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        snaVar.close();
    }

    public static String toConversationParticipantsDeduplicationKey(sku skuVar) {
        return String.valueOf(skuVar.l()) + "|" + skuVar.h();
    }

    public static smh toConversationToParticipants(sku skuVar) {
        tcs c = smp.c();
        c.m(skuVar.h());
        c.k(skuVar.l());
        c.n(skuVar.k());
        c.l(skuVar.m());
        return c.h();
    }

    public Optional<smh> toOtherConversationToParticipants(smr smrVar) {
        String W = smrVar.W();
        if (W == null) {
            return Optional.empty();
        }
        ConversationIdType x = smrVar.x();
        long parseLong = Long.parseLong(((rxq) this.participantDatabaseOperations.b()).g(rxn.b(W)));
        sla a = sld.a();
        a.w("CustomUpgradeSteps#toConversationToParticipants.hasSelfParticipant");
        a.f(new lce(x, parseLong, 9));
        if (a.b().K()) {
            return Optional.empty();
        }
        tcs c = smp.c();
        c.m(parseLong);
        c.k(x);
        c.n(qfe.JOINED);
        return Optional.of(c.h());
    }

    private static void updateNotNeededMessageSendReportStatusInTransactionPre41040(syb sybVar, int i) {
        sya syaVar = new sya();
        syaVar.aj("updateNotNeededMessageSendReportStatusInTransactionPre41040");
        syaVar.l(i);
        syaVar.P(new rzk(8));
        syaVar.Z(sybVar);
        syaVar.af();
        syaVar.a().e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void upgradeRcsGroups(agnw agnwVar) {
        log.o("begin upgradeRcsGroups.");
        snh snhVar = new snh();
        snhVar.W(new agpk("$V{J:convo} like $V", new Object[]{sni.c.c, "@rcs.google.com"}));
        agpw agpwVar = new agpw(snhVar);
        syb sybVar = new syb(new syc());
        akrh e = aktp.e("MessageDatabaseOperations#queryLastMessagesForEachConversation");
        try {
            sxy d = MessagesTable.d();
            d.w("+queryLastMessagesForEachConversation");
            d.d(new rvy(12));
            snf e2 = sni.e();
            e2.e(new rvy(13));
            e2.k(agpwVar);
            agog b = agoh.b(e2.b(), sni.c.a, MessagesTable.c.b);
            b.f = "convo";
            d.D(b.a());
            d.g(new rvy(14));
            d.k(sybVar);
            d.n(new agpk("MAX($V)", new Object[]{MessagesTable.c.i}), "max_timestamp_expression");
            d.t(MessagesTable.c.b);
            alog t = d.b().t();
            e.close();
            int i = ((alsx) t).c;
            for (int i2 = 0; i2 < i; i2++) {
                MessagesTable.BindData bindData = (MessagesTable.BindData) t.get(i2);
                smr smrVar = (smr) bindData.al("conversation", smr.class);
                Uri y = bindData.y();
                if (smrVar != null && y != null) {
                    fixRcsGroupConversation(agnwVar, bindData.z(), Long.parseLong(smrVar.F().toString()), smrVar.P(), y.toString());
                }
            }
            log.o("completed upgradeRcsGroups.");
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void upgradeRcsGroupsConversationParticipantCount() {
        log.o("begin upgradeRcsGroupsParticipantCount.");
        alog t = ((rtz) this.conversationDatabaseOperations.b()).t();
        int i = ((alsx) t).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((rtz) this.conversationDatabaseOperations.b()).R((ConversationIdType) t.get(i2));
        }
        log.o("completed upgradeRcsGroupsParticipantCount.");
    }

    private void upgradeRcsTelephonyEncoding() {
        int i;
        log.o("begin upgradeRcsTelephonyEncoding.");
        java.util.Map<Long, String> allRcsThreadIdGroupNamePairs = getAllRcsThreadIdGroupNamePairs();
        SparseArray sparseArray = new SparseArray();
        Iterator<Long> it = allRcsThreadIdGroupNamePairs.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Long next = it.next();
            long longValue = next.longValue();
            String str = allRcsThreadIdGroupNamePairs.get(next);
            String F = ((wzs) this.telephonyManagerInterface.b()).F(longValue);
            if (F != null) {
                if (F.split(" ").length == 1) {
                    String trim = F.trim();
                    String ag = albo.ag(((msh) ((wzs) this.telephonyManagerInterface.b()).I(trim).get(0)).j(((Boolean) new msn(18).get()).booleanValue()));
                    yst ystVar = this.base32Utils;
                    StringTokenizer stringTokenizer = new StringTokenizer(ag, "@");
                    if (!stringTokenizer.hasMoreTokens() || !ystVar.b(stringTokenizer.nextToken())) {
                        sparseArray.put(Integer.parseInt(trim), this.rcsTelephonyStrings.b(ag, str));
                    }
                } else {
                    log.m("An RCS group in threads table exists with multiple recipients, which should only happen in MMS groups.");
                }
            }
        }
        ContentResolver contentResolver = this.context.getContentResolver();
        for (i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            String str2 = (String) sparseArray.get(keyAt);
            ContentValues contentValues = new ContentValues(1);
            Uri build = wzs.b.buildUpon().appendPath(Integer.toString(keyAt)).build();
            contentValues.put("address", this.base32Utils.d(str2));
            mbm b = this.timerEventLogger.b("Bugle.Telephony.Update.FieldBulk.Latency");
            int update = contentResolver.update(build, contentValues, a.bV(keyAt, "_id="), null);
            b.c();
            if (update <= 0) {
                xyo b2 = log.b();
                b2.H("Updating the backup contact address on canonical addresses table failed.");
                b2.x("numberOfRowsUpdated", update);
                b2.q();
            }
        }
        log.o("completed upgradeRcsTelephonyEncoding.");
    }

    public void clearOneToOneColumnsForRcsGroups(agnw agnwVar) {
        xze xzeVar = log;
        xzeVar.o("begin clearOneToOneColumnsForRcsGroups.");
        sng sngVar = new sng();
        sngVar.aj("clearOneToOneColumnsForRcsGroups");
        sngVar.af();
        sngVar.A(0L);
        sngVar.a.putNull("participant_lookup_key");
        sngVar.a.putNull("participant_normalized_destination");
        snh snhVar = new snh();
        snhVar.e(2);
        sngVar.W(snhVar);
        int e = sngVar.a().e();
        if (e > 0) {
            xyo c = xzeVar.c();
            c.H("cleared 1:1s rcs groups.");
            c.x("count", e);
            c.q();
        }
        xzeVar.o("completed clearOneToOneColumnsForRcsGroups.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, agpj] */
    public void copySuggestionRcsMessageIdIntoTargetRcsMessageId(agnw agnwVar) {
        xze xzeVar = log;
        xzeVar.o("begin copySuggestionRcsMessageIdIntoTargetRcsMessageId.");
        slw slwVar = new slw();
        slwVar.aj("copySuggestionRcsMessageIdIntoTargetRcsMessageId");
        slwVar.aa("target_rcs_message_id", sly.d.e);
        slwVar.a().e();
        xzeVar.o("completed copySuggestionRcsMessageIdIntoTargetRcsMessageId.");
    }

    public java.util.Map<Long, String> getAllRcsThreadIdGroupNamePairs() {
        akrh e = aktp.e("CustomUpgradeSteps#getAllRcsThreadIdGroupNamePairs");
        try {
            xyl.h();
            HashMap hashMap = new HashMap();
            snf e2 = sni.e();
            e2.w("getAllRcsThreadIdGroupNamePairs");
            e2.q();
            snh snhVar = new snh();
            snhVar.e(2);
            e2.g(snhVar);
            e2.e(new rzi(4));
            sna snaVar = (sna) e2.b().n();
            while (snaVar.moveToNext()) {
                try {
                    long cE = yyb.cE(snaVar.L());
                    String W = snaVar.W();
                    if (W != null) {
                        hashMap.put(Long.valueOf(cE), W);
                    }
                } finally {
                }
            }
            snaVar.close();
            e.close();
            return hashMap;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: lambda$fixRcsGroupConversation$0$com-google-android-apps-messaging-shared-datamodel-database-upgrade-CustomUpgradeSteps */
    public /* synthetic */ void m193xd0ec2aa7(String str, xaz xazVar, ConversationIdType conversationIdType) {
        ParticipantsTable.BindData a;
        tap g = rxn.g(str);
        ((rxq) this.participantDatabaseOperations.b()).h(g);
        ParticipantsTable.BindData a2 = g.a();
        ((rxq) this.participantDatabaseOperations.b()).h(rxn.g(xazVar.d));
        ArrayList arrayList = new ArrayList();
        if (xazVar.b.isEmpty()) {
            arrayList.add(a2);
        } else {
            for (msh mshVar : xazVar.b) {
                String j = mshVar.j(((Boolean) new msn(18).get()).booleanValue());
                j.getClass();
                if (((Boolean) new msn(18).get()).booleanValue()) {
                    tap g2 = rxn.g(j);
                    ((rxq) this.participantDatabaseOperations.b()).h(g2);
                    a = g2.a();
                } else {
                    a = this.participantRowFactory.a(mshVar);
                    ((rxq) this.participantDatabaseOperations.b()).g(a);
                }
                arrayList.add(a);
            }
        }
        sng sngVar = new sng();
        sngVar.aj("fixRcsGroupConversation");
        sngVar.x(xazVar.c);
        sngVar.A(0L);
        sngVar.E("");
        sngVar.F("");
        sngVar.C("");
        sngVar.k(xazVar.d);
        sngVar.B(arrayList.size());
        sngVar.D(xazVar.b.toString());
        sngVar.v(xazVar.f);
        sngVar.j();
        sngVar.u(this.participantAvatarUriGenerator.b(arrayList).toString());
        ((rtz) this.conversationDatabaseOperations.b()).U(conversationIdType, sngVar);
        if (!xazVar.b.isEmpty()) {
            ((rtz) this.conversationDatabaseOperations.b()).ag(a2, conversationIdType, false);
            ((rtz) this.conversationDatabaseOperations.b()).al(arrayList, conversationIdType, false);
        }
    }

    public void markUnreadMessagesInReadConversationsAsRead(agnw agnwVar) {
        xze xzeVar = log;
        xzeVar.o("begin markUnreadMessagesInReadConversationsAsRead.");
        String obj = MessagesTable.c.b.toString();
        sxo sxoVar = MessagesTable.c;
        String obj2 = sxoVar.n.toString();
        sxp sxpVar = sxoVar.b;
        String obj3 = sxpVar.toString();
        String obj4 = sxpVar.toString();
        String[] strArr = sni.a;
        sxo sxoVar2 = MessagesTable.c;
        Cursor cursor = null;
        try {
            try {
                cursor = agnwVar.g("/*EXEMPT-FROM-QUERY-PLAN-CHECK*/SELECT DISTINCT " + obj + " FROM messages WHERE " + obj2 + "=0 AND " + obj3 + " IN ( SELECT " + obj4 + " FROM conversations LEFT JOIN messages ON conversations.latest_message_id = " + sxoVar2.a.toString() + " WHERE " + sxoVar2.n.toString() + "=1)", null);
                int count = cursor.getCount();
                xyo c = xzeVar.c();
                c.H("Found read conversations with unread messages.");
                c.x("countOfConversationIds", count);
                c.q();
                if (count > 0) {
                    ConversationIdType[] conversationIdTypeArr = new ConversationIdType[count];
                    int i = 0;
                    while (cursor.moveToNext()) {
                        conversationIdTypeArr[i] = ruy.b(cursor.getString(0));
                        i++;
                    }
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    this.markAsReadActionFactory.i(conversationIdTypeArr, rvc.a).p(new rzn(countDownLatch));
                    if (!countDownLatch.await(5L, TimeUnit.SECONDS)) {
                        log.o("Latch timed out waiting for actions.");
                    }
                }
            } catch (InterruptedException e) {
                log.r("Latch await has been interrupted.", e);
            }
            log.o("completed markUnreadMessagesInReadConversationsAsRead.");
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public void potentiallyInvalidateRcsSessionIds(agnw agnwVar) {
        invalidateRcsSessionIdsForOneToOne();
        potentiallyInvalidateRcsSessionIdsForRcsGroups(agnwVar);
        broadcastIncreaseSessionIdIntent();
    }

    public void removeIncompletePaymentMetadataRows(agnw agnwVar) {
        xze xzeVar = log;
        xzeVar.o("begin removeIncompletePaymentMetadataRows.");
        agnwVar.z("DELETE FROM rbm_payment_request_metadata WHERE conversation_id IS NULL;");
        xzeVar.o("completed removeIncompletePaymentMetadataRows.");
    }

    public void updateConversationOtherParticipantDisplayDestination(agnw agnwVar) {
        xze xzeVar = log;
        xzeVar.o("begin updateConversationOtherParticipantDisplayDestination.");
        String[] strArr = sni.a;
        agnwVar.z(" UPDATE conversations SET participant_display_destination= ( SELECT display_destination FROM conversations AS c  INNER JOIN participants AS p  ON c.participant_normalized_destination = p.normalized_destination WHERE conversations.participant_normalized_destination = p.normalized_destination)  WHERE " + sni.c.O.toString() + " = 0");
        xzeVar.o("completed updateConversationOtherParticipantDisplayDestination.");
    }

    @rzo(a = true)
    void upgradeToVersion10007(agnw agnwVar) {
        sng sngVar = new sng();
        sngVar.aj("upgradeToVersion10007");
        smu smuVar = sni.c;
        sngVar.aa("conv_type", new agpk("CASE WHEN $V > 1 THEN CASE WHEN $V = $V THEN $V ELSE $V END ELSE $V END", new Object[]{smuVar.D, smuVar.M, -1L, 1, 2, 0}));
        sngVar.a().e();
    }

    @rzo(a = true)
    void upgradeToVersion10008(agnw agnwVar) {
        upgradeRcsGroups(agnwVar);
    }

    @rzo(a = true)
    void upgradeToVersion10015(agnw agnwVar) {
        akrh e = aktp.e("CustomUpgradeSteps#prefillDisambiguationTable");
        try {
            snf e2 = sni.e();
            e2.w("upgradeToVersion10015");
            e2.q();
            e2.f(new rzi(16));
            e2.n(new agpk("MIN($V)", new Object[]{sni.c.y}), "min_normalized_destination_expression");
            e2.n(new agpl("COUNT(*)"), "row_count_expression");
            e2.h(new rzi(17));
            e2.t(sni.c.w);
            sna snaVar = (sna) e2.b().n();
            while (snaVar.moveToNext()) {
                try {
                    if (Long.parseLong(snaVar.cX("row_count_expression")) == 1) {
                        tpk c = soz.c();
                        c.k(snaVar.ae());
                        c.l(snaVar.cX("min_normalized_destination_expression"));
                        c.j().h();
                    }
                } finally {
                }
            }
            snaVar.close();
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @rzo
    void upgradeToVersion10020(agnw agnwVar) {
        sng sngVar = new sng();
        sngVar.aj("upgradeToVersion10020");
        sngVar.af();
        sngVar.N(-1L);
        sngVar.X(new rzj(5));
        int e = sngVar.a().e();
        xyo d = log.d();
        d.H("Cleared rcs 1:1 conversations.");
        d.x("sessionsCount", e);
        d.q();
    }

    @rzo
    void upgradeToVersion10024(agnw agnwVar) {
        upgradeRcsTelephonyEncoding();
    }

    @rzo
    void upgradeToVersion10025(agnw agnwVar) {
        snb snbVar = new snb();
        snbVar.f("upgradeToVersion10025");
        snbVar.b(new rzi(12));
        snbVar.d();
    }

    @rzo
    void upgradeToVersion10028(agnw agnwVar) {
        log.o("Will soon update database data for version 10028.");
        clearOneToOneColumnsForRcsGroups(agnwVar);
    }

    @rzo
    void upgradeToVersion10029(agnw agnwVar) {
        agnwVar.z(CREATE_PROXY_TABLE_SQL);
        agnwVar.z(PROXY_TABLE_PARTICIPANT_ID_INDEX_SQL);
    }

    @rzo
    void upgradeToVersion11000(agnw agnwVar) {
        agnwVar.z(CREATE_CONVERSATION_SUGGESTIONS_TABLE_11000);
        agnwVar.z(CREATE_CONVERSATION_SUGGESTIONS_INDEX_11000);
    }

    @rzo(a = true)
    void upgradeToVersion12000(agnw agnwVar) {
        copySuggestionRcsMessageIdIntoTargetRcsMessageId(agnwVar);
    }

    @rzo
    void upgradeToVersion12002(agnw agnwVar) {
        agnwVar.z("DROP INDEX index_proxy_state_table_participant_id");
        agnwVar.z("DROP TABLE proxy_state_table");
    }

    @rzo
    void upgradeToVersion12003(agnw agnwVar) {
        log.o("Launching full sync as upgrade to version 12003.");
        ((wzp) this.syncManager.b()).k(amvm.CUSTOM_UPGRADE_STEP_UPGRADE_TO_VERSION_12003);
    }

    @rzo
    void upgradeToVersion12004(agnw agnwVar) {
        log.o("Will mark messages read in telephony for version 12004.");
        markMessagesAsReadInTelephonyAsync();
    }

    @rzo
    void upgradeToVersion12005(agnw agnwVar) {
        log.o("Will mark threads archived in telephony for version 12005.");
        setThreadArchiveStatusInTelephonyAsync(true);
    }

    @rzo
    void upgradeToVersion13001(agnw agnwVar) {
        log.o("Will mark threads unarchived in telephony for version 13001.");
        setThreadArchiveStatusInTelephonyAsync(false);
    }

    @rzo
    void upgradeToVersion13030(agnw agnwVar) {
        agnwVar.A("OnDeviceDatabaseUpgradeHandler#upgradeToVersion13030", new eyg(8));
    }

    @rzo
    void upgradeToVersion13060(agnw agnwVar) {
        log.o("Will sanitize participants table for version 13060.");
        sanitizeParticipants();
    }

    @rzo(a = true)
    void upgradeToVersion15010(agnw agnwVar) {
        updateConversationOtherParticipantDisplayDestination(agnwVar);
    }

    @rzo
    void upgradeToVersion17000(agnw agnwVar) {
        String[] strArr = sly.a;
        agnc.s(agnwVar, "index_conversation_suggestions_target_rcs_message_id", "CREATE INDEX index_conversation_suggestions_target_rcs_message_id ON conversation_suggestions(target_rcs_message_id);");
    }

    @rzo
    void upgradeToVersion19000(agnw agnwVar) {
        agnwVar.z("CREATE TABLE rbm_payment_request_metadata(_id INTEGER PRIMARY KEY AUTOINCREMENT, request_id TEXT NOT NULL, rbm_bot_id TEXT NOT NULL, expiration_time_millis INT DEFAULT(0), is_expired INT DEFAULT(0));");
    }

    @rzo
    void upgradeToVersion19010(agnw agnwVar) {
        agnwVar.z("ALTER TABLE rbm_payment_request_metadata ADD COLUMN conversation_id INT REFERENCES conversations(_id) ON DELETE CASCADE;");
    }

    @rzo
    void upgradeToVersion19030(agnw agnwVar) {
        tbt tbtVar = new tbt();
        tbtVar.aj("upgradeToVersion19030");
        tbtVar.af();
        tbtVar.d();
        tbtVar.a().e();
        PartsTable.e(agnwVar);
        agnwVar.z(qxq.b);
    }

    @rzo(a = true)
    void upgradeToVersion2000(agnw agnwVar) {
        tbb f = ParticipantsTable.f();
        f.aj("upgradeToVersion2000-participants1");
        f.H(-1);
        f.M(new rzi(7));
        f.a().e();
        tbb f2 = ParticipantsTable.f();
        f2.aj("upgradeToVersion2000-participants2");
        f2.H(-2);
        f2.M(new rzi(8));
        f2.a().e();
    }

    @rzo
    void upgradeToVersion20000(agnw agnwVar) {
        agnwVar.z("CREATE TABLE link_preview (_id INTEGER PRIMARY KEY AUTOINCREMENT, message_id TEXT NOT NULL REFERENCES messages(_id) ON DELETE CASCADE, trigger_url TEXT NOT NULL, expiration_time_millis INT DEFAULT(0), link_title TEXT, link_description TEXT, link_image_url TEXT, link_domain TEXT, link_canonical_url TEXT);");
    }

    @rzo
    void upgradeToVersion20040(agnw agnwVar) {
        String[] strArr = stl.a;
        agnwVar.z("DROP TABLE messages_annotations");
        agnwVar.z("DROP INDEX IF EXISTS index_messages_annotations_message_id");
        stl.c(agnwVar, 20040);
    }

    @rzo
    void upgradeToVersion20050(agnw agnwVar) {
        markUnreadMessagesInReadConversationsAsRead(agnwVar);
    }

    @rzo(b = true)
    void upgradeToVersion21000(agnw agnwVar) {
        sss.e(agnwVar, 21000);
    }

    @rzo
    void upgradeToVersion22030(agnw agnwVar) {
        agnwVar.z(qxq.h);
    }

    @rzo
    void upgradeToVersion24000(agnw agnwVar) {
        xze xzeVar = log;
        xzeVar.o("version 24000 start schema upgrade.");
        srm.b(agnwVar, 24000);
        agnwVar.z("CREATE INDEX index_generic_worker_queue_inflight_retries ON generic_worker_queue(in_flight,retry_count)");
        xzeVar.o("version 24000 apply triggers to schema.");
        agnwVar.z("CREATE TRIGGER on_conversations_insert AFTER INSERT ON conversations BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) VALUES (3,2,NEW._id); END");
        agnwVar.z("CREATE TRIGGER on_messages_insert AFTER INSERT ON messages BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) VALUES (3,1,NEW._id); END");
        agnwVar.z("CREATE TRIGGER on_participants_insert AFTER INSERT ON participants BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) VALUES (3,3,NEW._id); END");
        xzeVar.o("version 24000 OnPostInsert triggers done.");
        agnwVar.z("CREATE TRIGGER on_conversations_update AFTER UPDATE ON conversations WHEN OLD.name != NEW.name BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) VALUES (3,2,OLD._id); END");
        agnwVar.z("CREATE TRIGGER on_messages_update AFTER UPDATE ON messages BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) VALUES (3,1,OLD._id); END");
        agnwVar.z("CREATE TRIGGER on_participants_update AFTER UPDATE ON participants WHEN OLD.full_name != NEW.full_name OR OLD.lookup_key != NEW.lookup_key OR OLD.display_destination != NEW.display_destination OR OLD.normalized_destination != NEW.normalized_destination BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) VALUES (3,3,OLD._id); END");
        xzeVar.o("version 24000 OnPostUpdate triggers done.");
        agnwVar.z("CREATE TRIGGER on_conversations_delete AFTER DELETE ON conversations BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) VALUES (3,2,OLD._id); END");
        agnwVar.z("CREATE TRIGGER on_messages_delete AFTER DELETE ON messages BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) VALUES (3,1,OLD._id); END");
        agnwVar.z("CREATE TRIGGER on_participants_delete AFTER DELETE ON participants BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) VALUES (3,3,OLD._id); END");
        removeIncompletePaymentMetadataRows(agnwVar);
    }

    @rzo(b = true)
    void upgradeToVersion24050(agnw agnwVar) {
        Object apply;
        sov sovVar = new sov();
        sovVar.f("upgradeToVersion24050");
        apply = new rzj(15).apply(new soy());
        sovVar.a = new agpw((soy) apply);
        sovVar.d();
        agnc.F(agnwVar, "disambiguations", soz.a("TEMP___disambiguations"), soz.a, d.at());
    }

    @rzo
    void upgradeToVersion24100(agnw agnwVar) {
        agnwVar.z(qxq.g);
    }

    @rzo
    void upgradeToVersion25000(agnw agnwVar) {
        xze xzeVar = log;
        xzeVar.o("begin enqueueRcsLocationsForAnnotations.");
        String[] strArr = srm.a;
        agnwVar.z("INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) SELECT DISTINCT 2,1," + PartsTable.d.b.toString() + " FROM parts WHERE " + PartsTable.d.e.toString() + " = 'application/vnd.gsma.rcspushlocation+xml';");
        xzeVar.o("begin enqueueRcsLocationsForAnnotations.");
    }

    @rzo
    void upgradeToVersion25020(agnw agnwVar) {
        agnwVar.z("DROP TRIGGER IF EXISTS ".concat(rzx.e(1, "UPDATE")));
        agnwVar.z("DROP TRIGGER IF EXISTS ".concat(rzx.e(3, "UPDATE")));
        agnwVar.z("DROP TRIGGER IF EXISTS ".concat(rzx.e(2, "UPDATE")));
        agnwVar.z("CREATE TRIGGER on_participants_update AFTER UPDATE ON participants WHEN OLD.full_name != NEW.full_name OR OLD.lookup_key != NEW.lookup_key OR OLD.display_destination != NEW.display_destination OR OLD.normalized_destination != NEW.normalized_destination BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) VALUES (3,3,OLD._id); END");
        agnwVar.z("CREATE TRIGGER on_conversations_update AFTER UPDATE ON conversations WHEN OLD.name != NEW.name BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) VALUES (3,2,OLD._id); END");
    }

    @rzo
    void upgradeToVersion25030(agnw agnwVar) {
        agnwVar.z("DROP TRIGGER IF EXISTS ".concat(rzx.e(1, "UPDATE")));
    }

    @rzo
    void upgradeToVersion26060(agnw agnwVar) {
        huaweiMate20UpgradeCleardata();
        fixLegacyResourceUris();
    }

    @rzo(a = true)
    void upgradeToVersion27000(agnw agnwVar) {
        agnwVar.z(qxq.c);
        copyBlobIdIntoCompressedBlobId();
    }

    @rzo
    void upgradeToVersion27010(agnw agnwVar) {
        agnwVar.z("CREATE TRIGGER on_messages_annotations_insert AFTER INSERT ON messages_annotations BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) VALUES (1,4,NEW._id); END");
        agnwVar.z("CREATE TRIGGER on_messages_annotations_update AFTER UPDATE ON messages_annotations WHEN OLD.message_id != NEW.message_id OR OLD.annotation_details != NEW.annotation_details OR OLD.annotation_type != NEW.annotation_type BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) VALUES (1,4,OLD._id); END");
        agnwVar.z("CREATE TRIGGER on_messages_annotations_delete AFTER DELETE ON messages_annotations BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) VALUES (1,4,OLD._id); END");
        String[] strArr = srm.a;
        String obj = stl.e.a.toString();
        Object obj2 = stl.e.c;
        agnwVar.z("INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) SELECT DISTINCT 1,4," + obj + " FROM messages_annotations WHERE " + obj2.toString() + " = " + aqas.f(4) + " OR " + obj2.toString() + " = " + aqas.f(8) + ";");
    }

    @rzo
    void upgradeToVersion29000(agnw agnwVar) {
        String[] strArr = tgi.a;
        agnwVar.z("DROP TABLE IF EXISTS recent_stickers");
        String[] strArr2 = tmh.a;
        agnwVar.z("DROP TABLE IF EXISTS sticker_sets_localization");
        String[] strArr3 = tmv.a;
        agnwVar.z("DROP TABLE IF EXISTS stickers_localization");
        String[] strArr4 = tmo.a;
        agnwVar.z("DROP TABLE IF EXISTS sticker_sets");
        String[] strArr5 = tnc.a;
        agnwVar.z("DROP TABLE IF EXISTS stickers");
        agnwVar.z("DROP INDEX IF EXISTS index_stickers_sticker_set_id");
        tbo tboVar = new tbo();
        tboVar.e();
        tboVar.f("upgradeToVersion29000");
        tboVar.b(new rzk(6));
        tboVar.d();
        sng sngVar = new sng();
        sngVar.aj("upgradeToVersion29000");
        sngVar.af();
        sngVar.p();
        sngVar.X(new rzk(7));
        sngVar.a().e();
    }

    @rzo
    void upgradeToVersion29010(agnw agnwVar) {
        agnwVar.z("DROP TRIGGER IF EXISTS participantsCorpus_delete_trigger_appdatasearch;");
        agnwVar.z("DROP TRIGGER IF EXISTS participantsCorpus_insert_trigger_appdatasearch;");
        agnwVar.z("DROP TRIGGER IF EXISTS participantsCorpus_update_trigger_appdatasearch;");
        agnwVar.z("DROP TRIGGER IF EXISTS partsCorpus_delete_trigger_appdatasearch;");
        agnwVar.z("DROP TRIGGER IF EXISTS partsCorpus_insert_trigger_appdatasearch;");
        agnwVar.z("DROP TRIGGER IF EXISTS partsCorpus_update_trigger_appdatasearch;");
        agnwVar.z("DROP TRIGGER IF EXISTS messagesCorpus_delete_trigger_appdatasearch;");
        agnwVar.z("DROP TRIGGER IF EXISTS messagesCorpus_insert_trigger_appdatasearch;");
        agnwVar.z("DROP TRIGGER IF EXISTS messagesCorpus_update_trigger_appdatasearch;");
        agnwVar.z("DROP TABLE IF EXISTS partsCorpus_seqno_table_appdatasearch;");
        agnwVar.z("DROP TABLE IF EXISTS messagesCorpus_seqno_table_appdatasearch;");
        agnwVar.z("DROP TABLE IF EXISTS participantsCorpus_seqno_table_appdatasearch;");
    }

    @rzo(a = true)
    void upgradeToVersion29050(agnw agnwVar) {
        agof agofVar = new agof("self_participants", "$primary");
        uqu uquVar = tkr.d;
        agofVar.b((agmh) uquVar.a, (agmh) uquVar.f, (agmh) uquVar.c, (agmh) uquVar.i, (agmh) uquVar.e, (agmh) uquVar.d);
        taz e = ParticipantsTable.e();
        e.w("upgradeToVersion29050");
        e.d(new rzi(5));
        e.g(new rzi(6));
        agofVar.c = e.b();
        agofVar.a().a();
    }

    @rzo(a = true)
    void upgradeToVersion29060(agnw agnwVar) {
        tbt tbtVar = new tbt();
        tbtVar.aj("upgradeToVersion29060");
        tbtVar.aa("storage_uri", PartsTable.d.d);
        tbtVar.a().e();
    }

    @rzo
    void upgradeToVersion29070(agnw agnwVar) {
        agnwVar.z("DROP TRIGGER IF EXISTS on_messages_update_enqueue_worker");
        agnwVar.z("DROP TRIGGER IF EXISTS on_conversations_update_enqueue_worker");
        agnwVar.z("DROP TRIGGER IF EXISTS on_participants_update_enqueue_worker");
    }

    @rzo
    void upgradeToVersion30030(agnw agnwVar) {
        tbs d = PartsTable.d();
        d.w("upgradeToVersion30030-parts");
        d.e(new rzk(12));
        d.g(new rzk(13));
        tbr b = d.b();
        sya syaVar = new sya();
        syaVar.aj("upgradeToVersion30030-messages");
        syaVar.k(true);
        syaVar.P(new ryu(b, 10));
        syaVar.af();
        syaVar.a().e();
    }

    @rzo(b = true)
    void upgradeToVersion30050(agnw agnwVar) {
        agnc.F(agnwVar, "verified_sms_senders", tps.b("TEMP___verified_sms_senders"), tps.a, d.at());
    }

    @rzo(a = true)
    void upgradeToVersion3010(agnw agnwVar) {
        tbt tbtVar = new tbt();
        tbtVar.aj("upgradeToVersion3010");
        sxy d = MessagesTable.d();
        d.e(new rzk(18));
        d.g(new rzk(19));
        tbtVar.aa("timestamp", d.b());
        tbtVar.a().e();
        agnwVar.z(qxq.a);
        agnwVar.z(qxq.d);
    }

    @rzo
    void upgradeToVersion32040(agnw agnwVar) {
        String[] strArr = srm.a;
        agnwVar.z("CREATE INDEX index_generic_worker_queue_worker_table_itemId ON generic_worker_queue(worker_type,item_table_type,item_id)");
        agnwVar.z("UPDATE generic_worker_queue SET in_flight = 0 WHERE in_flight = 'false'");
        agnwVar.z("UPDATE generic_worker_queue SET in_flight = 1 WHERE in_flight = 'true'");
    }

    @rzo
    void upgradeToVersion33050(agnw agnwVar) {
        agnwVar.z("DROP VIEW IF EXISTS conversation_list_view");
    }

    @rzo
    void upgradeToVersion34010(agnw agnwVar) {
        String[] strArr = thb.a;
        agnwVar.z("DROP TABLE IF EXISTS remote_instances");
        thb.b(agnwVar, 34010);
    }

    @rzo
    void upgradeToVersion35000(agnw agnwVar) {
        String[] strArr = MessagesTable.a;
        agnc.s(agnwVar, "index_messages_cms_id", "CREATE UNIQUE INDEX index_messages_cms_id ON messages(cms_id);");
        String[] strArr2 = ParticipantsTable.a;
        agnc.s(agnwVar, "index_participants_cms_id", "CREATE UNIQUE INDEX index_participants_cms_id ON participants(cms_id);");
        fixSpamWarningForOlderReports();
    }

    @rzo(a = true)
    void upgradeToVersion35070(agnw agnwVar) {
        tgp tgpVar = new tgp();
        tgpVar.aj("upgradeToVersion35070");
        sxy d = MessagesTable.d();
        d.e(new rzj(6));
        d.g(new rzj(7));
        tgpVar.aa("conversation_id", d.b());
        tgpVar.a().e();
    }

    @rzo
    void upgradeToVersion37050(agnw agnwVar) {
        potentiallyInvalidateRcsSessionIds(agnwVar);
    }

    @rzo(a = true)
    void upgradeToVersion39020(agnw agnwVar) {
        agnwVar.z("DROP TRIGGER IF EXISTS on_conversations_insert");
        agnwVar.z("DROP TRIGGER IF EXISTS on_messages_insert");
        agnwVar.z("DROP TRIGGER IF EXISTS on_participants_insert");
        agnwVar.z("DROP TRIGGER IF EXISTS on_messages_annotations_insert");
        agnwVar.z("DROP TRIGGER IF EXISTS on_conversations_update");
        agnwVar.z("DROP TRIGGER IF EXISTS on_participants_update");
        agnwVar.z("DROP TRIGGER IF EXISTS on_messages_annotations_update");
        agnwVar.z("DROP TRIGGER IF EXISTS on_conversations_delete");
        agnwVar.z("DROP TRIGGER IF EXISTS on_messages_delete");
        agnwVar.z("DROP TRIGGER IF EXISTS on_participants_delete");
        agnwVar.z("DROP TRIGGER IF EXISTS on_messages_annotations_delete");
        agnwVar.z("CREATE TRIGGER on_conversations_insert AFTER INSERT ON conversations BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) SELECT 3,2,NEW._id; END");
        agnwVar.z("CREATE TRIGGER on_messages_insert AFTER INSERT ON messages BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) SELECT 3,1,NEW._id; END");
        agnwVar.z("CREATE TRIGGER on_participants_insert AFTER INSERT ON participants BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) SELECT 3,3,NEW._id; END");
        agnwVar.z("CREATE TRIGGER on_messages_annotations_insert AFTER INSERT ON messages_annotations BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) SELECT 1,4,NEW._id; END");
        agnwVar.z("CREATE TRIGGER on_conversations_update AFTER UPDATE ON conversations WHEN OLD.name != NEW.name BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) SELECT 3,2,OLD._id; END");
        agnwVar.z("CREATE TRIGGER on_participants_update AFTER UPDATE ON participants WHEN OLD.full_name != NEW.full_name OR OLD.lookup_key != NEW.lookup_key OR OLD.display_destination != NEW.display_destination OR OLD.normalized_destination != NEW.normalized_destination BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) SELECT 3,3,OLD._id; END");
        agnwVar.z("CREATE TRIGGER on_messages_annotations_update AFTER UPDATE ON messages_annotations WHEN OLD.message_id != NEW.message_id OR OLD.annotation_details != NEW.annotation_details OR OLD.annotation_type != NEW.annotation_type BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) SELECT 1,4,OLD._id; END");
        agnwVar.z("CREATE TRIGGER on_conversations_delete AFTER DELETE ON conversations BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) SELECT 3,2,OLD._id; END");
        agnwVar.z("CREATE TRIGGER on_messages_delete AFTER DELETE ON messages BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) SELECT 3,1,OLD._id; END");
        agnwVar.z("CREATE TRIGGER on_participants_delete AFTER DELETE ON participants BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) SELECT 3,3,OLD._id; END");
        agnwVar.z("CREATE TRIGGER on_messages_annotations_delete AFTER DELETE ON messages_annotations BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) SELECT 1,4,OLD._id; END");
    }

    @rzo
    void upgradeToVersion39035(agnw agnwVar) {
        potentiallyInvalidateRcsSessionIds(agnwVar);
    }

    @rzo
    void upgradeToVersion40000(agnw agnwVar) {
        potentiallyInvalidateRcsSessionIds(agnwVar);
    }

    @rzo(a = true)
    void upgradeToVersion4020(agnw agnwVar) {
        int[] iArr = {100, 101, 102, 103, 104, 105, 106, 107};
        for (int i = 0; i < 8; i++) {
            int i2 = iArr[i];
            sya syaVar = new sya();
            syaVar.aj("upgradeToVersion4020");
            syaVar.L(i2);
            syaVar.P(new qqv(i2, 5));
            syaVar.a().e();
        }
    }

    @rzo(a = true)
    void upgradeToVersion41040(agnw agnwVar) {
        Object apply;
        sya syaVar = new sya();
        syaVar.aj("upgradeToVersion41040");
        syaVar.aa("rcs_message_id_with_text_type", new agpk("rcs_message_id", new Object[0]));
        syaVar.a().e();
        agnwVar.z("UPDATE messages SET rcs_message_id = NULL");
        tlp tlpVar = new tlp(tlr.a);
        tlpVar.w("upgradeToVersion41040");
        apply = new rzj(1).apply(new tlq());
        tlpVar.k(new agpw((tlq) apply));
        if (tlpVar.b().K()) {
            agnwVar.z("DROP TRIGGER IF EXISTS on_messages_update_bkr");
            agnwVar.z("CREATE TRIGGER on_messages_update_bkr AFTER UPDATE ON messages WHEN (OLD.sender_id IS NOT NEW.sender_id) OR (OLD.message_protocol IS NOT NEW.message_protocol) OR (OLD.mms_subject IS NOT NEW.mms_subject) OR (OLD.mms_transaction_id IS NOT NEW.mms_transaction_id) OR (OLD.mms_expiry IS NOT NEW.mms_expiry) OR (OLD.mms_retrieve_text IS NOT NEW.mms_retrieve_text) OR (OLD.cloud_sync_id IS NOT NEW.cloud_sync_id) OR (OLD.rcs_message_id_with_text_type IS NOT NEW.rcs_message_id_with_text_type) OR (OLD.etouffee_status IS NOT NEW.etouffee_status) OR (OLD.rcs_file_transfer_session_id IS NOT NEW.rcs_file_transfer_session_id) OR (OLD.sms_error_code IS NOT NEW.sms_error_code) OR (OLD.correlation_id IS NOT NEW.correlation_id) BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id,account_id,flags) SELECT 32,5,OLD._id,IFNULL((SELECT linked_account.account_id FROM linked_account WHERE linked_account.account_id IS NOT NULL LIMIT 1),-1),4; END");
        }
    }

    @rzo
    void upgradeToVersion42040(agnw agnwVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        sng sngVar = new sng();
        sngVar.aj("upgradeToVersion42040#update");
        int i = 4;
        sngVar.X(new rzk(4));
        sngVar.h(tqc.BLOCKED_FOLDER);
        sngVar.a().e();
        snf e = sni.e();
        e.w("upgradeToVersion42040");
        e.h(new rzk(14));
        e.e(new rzk(20));
        sna snaVar = (sna) e.b().n();
        while (snaVar.moveToNext()) {
            try {
                try {
                    ConversationIdType C = snaVar.C();
                    String af = snaVar.af();
                    if (!C.b() && !TextUtils.isEmpty(af)) {
                        taz e2 = ParticipantsTable.e();
                        e2.w("upgradeToVersion42040-participants");
                        e2.g(new ryu(af, 11));
                        e2.d(new rzi(1));
                        tav tavVar = (tav) e2.b().n();
                        try {
                            if (tavVar.moveToNext()) {
                                if (tavVar.T() && yyb.G(tavVar.g()).c()) {
                                    arrayList2.add(C);
                                } else if (tavVar.R()) {
                                    arrayList.add(C);
                                }
                            }
                            tavVar.close();
                        } catch (Throwable th) {
                            try {
                                tavVar.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                            break;
                        }
                    }
                } catch (Exception unused) {
                    log.m("Failed to determine if participant's conversation should be moved");
                }
            } catch (Throwable th3) {
                try {
                    snaVar.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        snaVar.close();
        sng sngVar2 = new sng();
        sngVar2.aj("upgradeToVersion42040#update2");
        sngVar2.X(new ryu(arrayList, i));
        sngVar2.h(tqc.BLOCKED_FOLDER);
        sngVar2.a().e();
        sng sngVar3 = new sng();
        sngVar3.aj("upgradeToVersion42040-conversations#update");
        sngVar3.X(new ryu(arrayList2, 5));
        sngVar3.h(tqc.SPAM_FOLDER);
        sngVar3.a().e();
    }

    @rzo(a = true)
    void upgradeToVersion45000(agnw agnwVar) {
        agnwVar.A("OnDeviceDatabaseUpgradeHandler#upgradeToVersion45000", new eyg(9));
    }

    @rzo(a = true)
    void upgradeToVersion46070(agnw agnwVar) {
        Integer valueOf;
        Integer valueOf2;
        upz upzVar = new upz();
        upzVar.ag();
        upzVar.aj("upgradeToVersion46070");
        upzVar.af();
        Date date = new Date(0L);
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 46070) {
            agnc.t("minimum_start_time", intValue2);
        }
        if (intValue >= 46070) {
            upzVar.a.put("minimum_start_time", Long.valueOf(rva.a(date)));
        }
        upzVar.a().e();
    }

    @rzo(a = true)
    void upgradeToVersion49000(agnw agnwVar) {
        sng sngVar = new sng();
        sngVar.aj("upgradeToVersion49000");
        sngVar.af();
        sngVar.X(new rzj(3));
        sngVar.v(4);
        sngVar.a().e();
    }

    @rzo(a = true)
    void upgradeToVersion5000(agnw agnwVar) {
        agnwVar.z(qxq.i);
    }

    @rzo
    void upgradeToVersion51020(agnw agnwVar) {
        String[] strArr = tdv.a;
        agnwVar.z("DROP TABLE IF EXISTS rbm_business_info_properties");
        tdv.b(agnwVar, 51020);
    }

    @rzo(b = true)
    void upgradeToVersion52010(agnw agnwVar) {
        tec tecVar = new tec();
        tecVar.f("upgradeToVersion52010-rbmbusinfo");
        tecVar.e();
        tecVar.d();
        agnc.F(agnwVar, "rbm_business_info", teh.d(52010, "TEMP___rbm_business_info"), teh.a, d.at());
        tel telVar = new tel();
        telVar.f("upgradeToVersion52010-rbmbusverifier");
        telVar.e();
        telVar.d();
        agnc.F(agnwVar, "rbm_business_verifier_info", teq.a("TEMP___rbm_business_verifier_info"), teq.a, d.at());
    }

    @rzo
    void upgradeToVersion52020(agnw agnwVar) {
        taz e = ParticipantsTable.e();
        e.w("upgradeToVersion52020-participants");
        e.q();
        e.d(new rzi(9));
        e.g(new rzi(10));
        tav tavVar = (tav) e.b().n();
        while (tavVar.moveToNext()) {
            try {
                Uri q = tavVar.q();
                if (q != null) {
                    Uri build = q.buildUpon().appendQueryParameter("v", Boolean.TRUE.toString()).build();
                    String K = tavVar.K();
                    tbb f = ParticipantsTable.f();
                    f.aj("upgradeToVersion52020-participants#update");
                    f.D(build);
                    f.d(K);
                }
            } catch (Throwable th) {
                try {
                    tavVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        tavVar.close();
    }

    @rzo
    void upgradeToVersion53000(agnw agnwVar) {
        Object apply;
        sxy d = MessagesTable.d();
        d.w("upgradeToVersion53000");
        d.d(new rzi(0));
        d.g(new rzi(2));
        sxx b = d.b();
        toi toiVar = new toi();
        toiVar.f("upgradeToVersion53000");
        toiVar.e();
        apply = new ryu(b, 6).apply(new tol());
        toiVar.a = new agpw((tol) apply);
        int d2 = toiVar.d();
        xyo a = log.a();
        a.H("Deleted");
        a.F(d2);
        a.H("rows from UserReferenceTable for upgrade to 53000");
        a.q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @rzo(b = true)
    void upgradeToVersion53020(agnw agnwVar) {
        tnl.b(agnwVar);
        agnc.F(agnwVar, "conversation_labels", skk.a(53020, "TEMP___conversation_labels"), skk.a, skk.c(53020));
        alog u = alog.u(SuperSortLabel.PERSONAL, SuperSortLabel.TRANSACTION, SuperSortLabel.PROMOTION, SuperSortLabel.UPDATE);
        int i = ((alsx) u).c;
        for (int i2 = 0; i2 < i; i2++) {
            SuperSortLabel superSortLabel = (SuperSortLabel) u.get(i2);
            int i3 = superSortLabel.i;
            tne a = tnl.a();
            a.c(i3);
            a.d(superSortLabel.toString());
            a.e(tnm.NO_CHANGE);
            a.b();
        }
    }

    @rzo(a = true)
    void upgradeToVersion53070(agnw agnwVar) {
        tne a = tnl.a();
        a.c(SuperSortLabel.OTP.i);
        a.d(SuperSortLabel.OTP.toString());
        a.e(tnm.NO_CHANGE);
        a.b();
    }

    @rzo(b = true)
    void upgradeToVersion54030(agnw agnwVar) {
        agnc.F(agnwVar, "message_reactions", svq.b(54030, "TEMP___message_reactions"), svq.a, svq.d(54030));
    }

    @rzo(b = true)
    void upgradeToVersion54050(agnw agnwVar) {
        sss.e(agnwVar, 54050);
    }

    @rzo(b = true)
    void upgradeToVersion54060(agnw agnwVar) {
        agnc.F(agnwVar, "smarts_personalization_features", syx.a(54060, "TEMP___smarts_personalization_features"), syx.a, syx.c(54060));
    }

    @rzo(b = true)
    void upgradeToVersion55000(agnw agnwVar) {
        agnc.F(agnwVar, "message_spam", sww.b(55000, "TEMP___message_spam"), sww.a, sww.d(55000));
    }

    @rzo(a = true, b = true)
    void upgradeToVersion55010(agnw agnwVar) {
        ParticipantsTable.j(agnwVar, 55010);
        qyd.d();
        agnwVar.z("CREATE TRIGGER participants_IS_NOT_EMPTY_TRIGER AFTER UPDATE ON participants WHEN NOT( OLD.is_valid_phone_number_data ) AND NEW.send_destination IS NOT NULL AND NEW.display_destination IS NOT NULL AND NEW.normalized_destination IS NOT NULL AND length(NEW.send_destination ) > 0  AND length(NEW.display_destination ) > 0  AND length(NEW.normalized_destination) > 0  BEGIN UPDATE participants  SET is_valid_phone_number_data = 1  WHERE rowid=NEW.rowid; END;");
        if (((Boolean) qye.a.e()).booleanValue()) {
            tbb f = ParticipantsTable.f();
            f.aj("upgradeToVersion55010");
            f.s(true);
            f.a().e();
        }
    }

    @rzo(b = true)
    void upgradeToVersion56030(agnw agnwVar) {
        agnwVar.z("DROP TABLE IF EXISTS rbm_payment_request_metadata;");
    }

    @rzo(a = true)
    void upgradeToVersion56050(agnw agnwVar) {
        int i;
        sxy d = MessagesTable.d();
        d.w("upgradeToVersion56050");
        d.q();
        syc sycVar = new syc();
        sycVar.w(3);
        d.f(sycVar);
        d.c(MessagesTable.c.a);
        sxt sxtVar = (sxt) d.b().n();
        try {
            ArrayList arrayList = new ArrayList(100);
            uta utaVar = new uta(null, null, Duration.ofSeconds(10L), null, null, null);
            while (true) {
                i = 18;
                if (!sxtVar.moveToNext()) {
                    break;
                }
                MessageIdType E = sxtVar.E();
                if (!E.b()) {
                    arrayList.add(E);
                    if (arrayList.size() == 100) {
                        wfh wfhVar = this.markRcsMessagesInTelephonyQueue;
                        aozy createBuilder = wfg.a.createBuilder();
                        createBuilder.Y((Iterable) Collection.EL.stream(arrayList).map(new rzj(13)).collect(Collectors.toCollection(new roi(i))));
                        wfhVar.a((wfg) createBuilder.s(), utaVar);
                        arrayList.clear();
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                wfh wfhVar2 = this.markRcsMessagesInTelephonyQueue;
                aozy createBuilder2 = wfg.a.createBuilder();
                createBuilder2.Y((Iterable) Collection.EL.stream(arrayList).map(new rzj(14)).collect(Collectors.toCollection(new roi(i))));
                wfhVar2.a((wfg) createBuilder2.s(), utaVar);
            }
            sxtVar.close();
        } catch (Throwable th) {
            try {
                sxtVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @rzo(a = true)
    void upgradeToVersion58020(agnw agnwVar) {
        wtd wtdVar = new wtd();
        wtdVar.aj("upgradeToVersion58020");
        sxy d = MessagesTable.d();
        d.e(new rzj(8));
        d.g(new rzj(9));
        wtdVar.aa("creation_time", d.b());
        wtdVar.a().e();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [armf, java.lang.Object] */
    @rzo
    void upgradeToVersion58260(agnw agnwVar) {
        ((uof) this.cmsBackFillBnrStateForFiMdQueue.a.b()).a(upk.a("cms_back_fill_bnr_state_for_fi_md", und.a));
    }

    @rzo(a = true)
    void upgradeToVersion58290(agnw agnwVar) {
        agnwVar.z("DROP INDEX IF EXISTS index_scheduled_send_scheduled_time");
    }

    @rzo(a = true)
    void upgradeToVersion58570(agnw agnwVar) {
        slb b = sld.b();
        b.aj("upgradeToVersion58570");
        b.af();
        b.c(qfe.JOINED);
        b.a().e();
    }

    @rzo(a = true)
    void upgradeToVersion58650(agnw agnwVar) {
        Object apply;
        tnh tnhVar = new tnh();
        tnhVar.f("upgradeToVersion58650");
        apply = new rzj(19).apply(new tnk());
        tnhVar.a = new agpw((tnk) apply);
        tnhVar.d();
    }

    @rzo(a = true)
    void upgradeToVersion58990(agnw agnwVar) {
        agnwVar.z(new String(Base64.decode("RFJPUCBUQUJMRSBJRiBFWElTVFMgdm9pY2VfdHJhbnNjcmlwdGlvbnM=", 0)));
    }

    @rzo
    void upgradeToVersion59090(agnw agnwVar) {
        if (yhx.g) {
            log.o("Running a one-time sync.");
            qiu.h(((wzp) this.syncManager.b()).f(amvm.CUSTOM_UPGRADE_STEP_UPGRADE_TO_VERSION_59090));
        }
    }

    @rzo(a = true)
    void upgradeToVersion59130(agnw agnwVar) {
        sng sngVar = new sng();
        sngVar.aj("upgradeToVersion59130");
        sngVar.aa("new_duplicate_of", sni.c.ai);
        sngVar.aa("duplicate_of", new agpk("null", new Object[0]));
        sngVar.a().e();
    }

    @rzo(a = true)
    void upgradeToVersion59320(agnw agnwVar) {
        sng sngVar = new sng();
        sngVar.aj("upgradeToVersion59320");
        sngVar.X(new rzk(5));
        sngVar.af();
        sngVar.t();
        sngVar.a().e();
    }

    @rzo(a = true)
    void upgradeToVersion59480(agnw agnwVar) {
        sya syaVar = new sya();
        syaVar.aj("upgradeToVersion59480");
        syaVar.aa("self_id", new agpk("sender_id", new Object[0]));
        syaVar.P(new rzk(1));
        syaVar.a().e();
    }

    @rzo(a = false)
    void upgradeToVersion59500(agnw agnwVar) {
        sya syaVar = new sya();
        syaVar.aj("upgradeToVersion59500");
        syaVar.af();
        syaVar.C(new ruz(null));
        syaVar.P(new rzk(17));
        syaVar.a().e();
    }

    @rzo(a = false)
    void upgradeToVersion59600(agnw agnwVar) {
        som somVar = new som();
        somVar.f("upgradeToVersion59600");
        somVar.b(new rzj(4));
        somVar.a().V();
    }

    @rzo
    void upgradeToVersion59680(agnw agnwVar) {
        agnwVar.z("DROP TRIGGER IF EXISTS group_conversation_participants_insert_audit_log;");
        agnwVar.z("DROP TRIGGER IF EXISTS group_conversation_participants_update_audit_log;");
        agnwVar.z("DROP TRIGGER IF EXISTS group_conversation_participants_delete_audit_log;");
        agnwVar.z("DROP TABLE IF EXISTS group_conversation_participants_audit_log;");
    }

    @rzo
    void upgradeToVersion59740(agnw agnwVar) {
        xze xzeVar = log;
        xzeVar.o("begin removeRowsNeedingUnpairing.");
        agnwVar.z("DELETE FROM desktop WHERE needs_unpairing = 1;");
        xzeVar.o("completed removeRowsNeedingUnpairing.");
    }

    @rzo(a = true)
    void upgradeToVersion59760(agnw agnwVar) {
        tdj a = ProfilesTable.a();
        a.d(new rzk(0));
        taz e = ParticipantsTable.e();
        e.g(new rzk(2));
        a.B(agoh.b(e.b(), ParticipantsTable.c.a, (agmh) ProfilesTable.c.b).a());
        tdi b = a.b();
        sla a2 = sld.a();
        tdj a3 = ProfilesTable.a();
        a3.d(new rzk(3));
        a2.B(agoh.b(a3.b(), (agmh) ProfilesTable.c.b, (agmh) sld.e.e).a());
        a2.f(new ryu(b, 8));
        skx skxVar = (skx) a2.b().n();
        while (skxVar.moveToNext()) {
            try {
                sku skuVar = (sku) skxVar.cK();
                ProfilesTable.BindData bindData = (ProfilesTable.BindData) skuVar.al("profiles_table", ProfilesTable.BindData.class);
                if (bindData != null && !TextUtils.isEmpty(bindData.l())) {
                    sng sngVar = new sng();
                    String l = bindData.l();
                    l.getClass();
                    sngVar.V(vom.b(l));
                    sngVar.X(new ryu(skuVar, 9));
                    sngVar.a().e();
                }
            } catch (Throwable th) {
                try {
                    skxVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        skxVar.close();
    }

    @rzo
    void upgradeToVersion59840(agnw agnwVar) {
        tbb f = ParticipantsTable.f();
        f.aj("CustomUpgradeSteps#upgradeTo59790");
        f.h();
        f.M(new rzi(20));
        f.af();
        f.a().e();
    }

    @rzo(a = true)
    void upgradeToVersion59900(agnw agnwVar) {
        upgradeRcsGroupsConversationParticipantCount();
    }

    @rzo(a = true)
    void upgradeToVersion59980(agnw agnwVar) {
        Integer valueOf;
        Integer valueOf2;
        qvi qviVar = new qvi();
        qviVar.aj("CustomUpgradeSteps#upgradeToVersion59980");
        qvn qvnVar = qvn.a;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        if (valueOf2.intValue() >= 59980 && intValue >= 59980) {
            if (qvnVar == null) {
                qviVar.a.putNull("address_type");
            } else {
                qviVar.a.put("address_type", Integer.valueOf(qvnVar.ordinal()));
            }
        }
        qviVar.a().e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @rzo
    void upgradeToVersion60270(agnw agnwVar) {
        try {
            tko b = tkr.b();
            b.c(new rzj(10));
            alog t = b.b().t();
            if (((alsx) t).c == 1) {
                tkh tkhVar = (tkh) t.get(0);
                tko b2 = tkr.b();
                b2.c(new ryu(tkhVar, 7));
                tkl tklVar = (tkl) b2.b().m((agmh) tkr.d.b);
                try {
                    alob alobVar = new alob();
                    while (tklVar.moveToNext()) {
                        if (tklVar.g() != null) {
                            alobVar.h(tklVar.g());
                        }
                    }
                    alog g = alobVar.g();
                    tklVar.close();
                    if (((alsx) g).c == 1) {
                        String str = (String) g.get(0);
                        sng sngVar = new sng();
                        sngVar.af();
                        sngVar.k(str);
                        sngVar.g(tkhVar.k());
                    }
                } finally {
                }
            }
        } catch (Exception e) {
            alvw h = logger.h();
            h.X(alwp.a, "BugleDatabase");
            ((alvg) ((alvg) ((alvg) h).g(e)).h("com/google/android/apps/messaging/shared/datamodel/database/upgrade/CustomUpgradeSteps", "upgradeToVersion60270", (char) 1974, "CustomUpgradeSteps.java")).q("Failed to update currentSelfId on legacy conversations");
        }
    }

    @rzo(b = true)
    void upgradeToVersion60350(agnw agnwVar) {
        try {
            rebuildConversationToParticipantsTable();
        } catch (Exception e) {
            alvw h = logger.h();
            h.X(alwp.a, "BugleDatabase");
            ((alvg) ((alvg) ((alvg) h).g(e)).h("com/google/android/apps/messaging/shared/datamodel/database/upgrade/CustomUpgradeSteps", "upgradeToVersion60350", (char) 1993, "CustomUpgradeSteps.java")).q("Failed to rebuild ConversationToParticipantsTable");
        }
    }

    @rzo(a = true)
    void upgradeToVersion60370(agnw agnwVar) {
        sya syaVar = new sya();
        syaVar.aa("message_persistence_id", new agpk("lower(hex(randomblob(4)) || '-' || hex( randomblob(2)) || '-' || '4' || substr(hex( randomblob(2)), 2) || '-'\n || substr('AB89', 1 + (abs(random()) % 4) , 1)  || substr(hex(randomblob(2)), 2) || '-' || hex(randomblob(6)))", new Object[0]));
        syaVar.P(new rzj(0));
        syaVar.a().e();
    }

    @rzo
    void upgradeToVersion60380(agnw agnwVar) {
        agnwVar.z("DROP INDEX IF EXISTS contacts_dedupe");
        agnwVar.z("DROP INDEX IF EXISTS contacts_dedupe_custom");
    }

    @rzo
    void upgradeToVersion60450(agnw agnwVar) {
        sng sngVar = new sng();
        sngVar.R(new xhv());
        sngVar.X(new rzj(20));
        sngVar.a().e();
    }

    @rzo(a = true)
    void upgradeToVersion22000(agnw agnwVar) {
    }

    @rzo
    void upgradeToVersion37010(agnw agnwVar) {
    }

    @rzo
    void upgradeToVersion41020(agnw agnwVar) {
    }

    @rzo
    void upgradeToVersion53010(agnw agnwVar) {
    }

    @rzo
    void upgradeToVersion58000(agnw agnwVar) {
    }

    @rzo
    void upgradeToVersion58310(agnw agnwVar) {
    }

    @rzo
    void upgradeToVersion58500(agnw agnwVar) {
    }

    @rzo
    void upgradeToVersion58560(agnw agnwVar) {
    }

    @rzo
    void upgradeToVersion58730(agnw agnwVar) {
    }

    @rzo
    void upgradeToVersion58830(agnw agnwVar) {
    }

    @rzo
    void upgradeToVersion58860(agnw agnwVar) {
    }

    @rzo
    void upgradeToVersion58890(agnw agnwVar) {
    }

    @rzo
    void upgradeToVersion58970(agnw agnwVar) {
    }

    @rzo
    void upgradeToVersion58980(agnw agnwVar) {
    }

    @rzo
    void upgradeToVersion59000(agnw agnwVar) {
    }

    @rzo
    void upgradeToVersion59020(agnw agnwVar) {
    }

    @rzo(a = true)
    void upgradeToVersion59280(agnw agnwVar) {
    }

    @rzo
    void upgradeToVersion59750(agnw agnwVar) {
    }

    @rzo
    void upgradeToVersion59770(agnw agnwVar) {
    }

    @rzo
    void upgradeToVersion59790(agnw agnwVar) {
    }

    @rzo
    void upgradeToVersion59800(agnw agnwVar) {
    }

    @rzo
    void upgradeToVersion60030(agnw agnwVar) {
    }

    @rzo
    void upgradeToVersion60100(agnw agnwVar) {
    }

    @rzo
    void upgradeToVersion60130(agnw agnwVar) {
    }

    @rzo
    void upgradeToVersion60290(agnw agnwVar) {
    }

    @rzo
    void upgradeToVersion60300(agnw agnwVar) {
    }

    @rzo
    void upgradeToVersion60390(agnw agnwVar) {
    }

    @rzo
    void upgradeToVersion60440(agnw agnwVar) {
    }
}
