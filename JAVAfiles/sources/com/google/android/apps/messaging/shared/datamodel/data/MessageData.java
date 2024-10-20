package com.google.android.apps.messaging.shared.datamodel.data;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.format.Formatter;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsDataImpl;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import defpackage.agnc;
import defpackage.ahka;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.albo;
import defpackage.alls;
import defpackage.alob;
import defpackage.alog;
import defpackage.alsx;
import defpackage.alvw;
import defpackage.alwl;
import defpackage.alwo;
import defpackage.ameb;
import defpackage.amjk;
import defpackage.aoyj;
import defpackage.apwq;
import defpackage.armf;
import defpackage.atok;
import defpackage.d;
import defpackage.eyg;
import defpackage.gh;
import defpackage.hgj;
import defpackage.ibi;
import defpackage.lga;
import defpackage.lua;
import defpackage.msh;
import defpackage.msk;
import defpackage.qei;
import defpackage.qkf;
import defpackage.qkv;
import defpackage.rgd;
import defpackage.rha;
import defpackage.roi;
import defpackage.rsb;
import defpackage.rsc;
import defpackage.rsi;
import defpackage.rtb;
import defpackage.rtc;
import defpackage.rtd;
import defpackage.rtw;
import defpackage.ruz;
import defpackage.rve;
import defpackage.rvx;
import defpackage.rwn;
import defpackage.ryg;
import defpackage.sxn;
import defpackage.sxt;
import defpackage.sya;
import defpackage.tqp;
import defpackage.tqr;
import defpackage.tqu;
import defpackage.tqx;
import defpackage.ujx;
import defpackage.utz;
import defpackage.uuh;
import defpackage.vht;
import defpackage.voa;
import defpackage.voe;
import defpackage.vxt;
import defpackage.vyv;
import defpackage.wam;
import defpackage.wjj;
import defpackage.xcd;
import defpackage.xnv;
import defpackage.xxw;
import defpackage.xyl;
import defpackage.yck;
import defpackage.ydl;
import defpackage.yhx;
import defpackage.yta;
import defpackage.ytd;
import defpackage.znj;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class MessageData implements MessageCoreData {
    public static final Parcelable.Creator<MessageCoreData> CREATOR;
    public static final alwo a = alwo.o("BugleDataModel");
    public static final long b;
    public static final long c;
    public static final utz d;
    public static final utz e;
    private final ibi A;
    public final rtb f;
    public final armf g;
    public final armf h;
    public final ArrayList i;
    public sxn j;
    public MessageUsageStatisticsData k;
    public lua l;
    public wjj m;
    public amjk n;
    public voe o;
    public rwn p;
    private final Context q;
    private final xnv r;
    private final tqx s;
    private final armf t;
    private final armf u;
    private final armf v;
    private alog w;
    private alog x;
    private String y;
    private hgj z;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        tqx dm();
    }

    static {
        long millis = TimeUnit.HOURS.toMillis(12L);
        b = millis;
        long millis2 = TimeUnit.HOURS.toMillis(24L);
        c = millis2;
        d = uuh.a("zero_connectivity_message_sending_timeout_ms", millis);
        e = uuh.a("rcs_resend_and_mark_send_failed_timeout_ms", millis2);
        String[] strArr = MessagesTable.a;
        CREATOR = new rha(5);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:6|7|(1:9)(1:44)|(1:11)(1:42)|12|(2:14|(12:16|17|18|19|(3:21|(1:23)|(7:25|26|(1:28)|29|(2:31|(1:33))|34|35))|38|26|(0)|29|(0)|34|35))|41|17|18|19|(0)|38|26|(0)|29|(0)|34|35) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b3, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b4, code lost:
    
        ((defpackage.uvi) r7.a.b()).b(r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a0 A[Catch: Exception -> 0x00b3, TryCatch #1 {Exception -> 0x00b3, blocks: (B:19:0x009a, B:21:0x00a0, B:25:0x00a6), top: B:18:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d5  */
    /* JADX WARN: Type inference failed for: r4v6, types: [armf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MessageData(android.content.Context r2, defpackage.xnv r3, defpackage.rtb r4, defpackage.tqx r5, defpackage.armf r6, defpackage.vyv r7, defpackage.armf r8, android.os.Parcel r9, defpackage.armf r10, defpackage.armf r11, defpackage.armf r12, defpackage.ibi r13) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.data.MessageData.<init>(android.content.Context, xnv, rtb, tqx, armf, vyv, armf, android.os.Parcel, armf, armf, armf, ibi):void");
    }

    public static MessagePartCoreData H(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it.next();
            if (messagePartCoreData.aV()) {
                return messagePartCoreData;
            }
        }
        return null;
    }

    public static ahka R(int i) {
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 7) {
                                    return null;
                                }
                                return new ahka("SATELLITE");
                            }
                            return new ahka("CLOUD SYNC");
                        }
                        return new ahka("RCS");
                    }
                    return new ahka("MMS PUSH");
                }
                return new ahka("MMS");
            }
            return new ahka("SMS");
        }
        return new ahka("UNKNOWN");
    }

    public static String aB(MessageIdType messageIdType, int i, List list) {
        StringBuilder sb = new StringBuilder();
        if (!messageIdType.b()) {
            sb.append(messageIdType.a());
            sb.append("(");
            sb.append(as(i));
            sb.append("): ");
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb.append((MessagePartCoreData) it.next());
            sb.append(" ");
        }
        return sb.toString();
    }

    public static List aC(rtb rtbVar, String str) {
        if (TextUtils.isEmpty(str)) {
            int i = alog.d;
            return alsx.a;
        }
        return alog.r(rtbVar.c(str));
    }

    public static String al(int i) {
        switch (i) {
            case 0:
                return "SMS";
            case 1:
                return "MMS";
            case 2:
                return "MMS Push Notification";
            case 3:
                return "RCS";
            case 4:
                return "Cloud Sync";
            case 5:
                return "Tombstone";
            case 6:
                return "EMP";
            case 7:
                return "SATELLITE";
            default:
                throw new IllegalArgumentException("Invalid Message Protocol");
        }
    }

    public static String as(int i) {
        if (qkf.o()) {
            ahka R = R(i);
            if (R != null) {
                return R.a;
            }
            return null;
        }
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 7) {
                                    return null;
                                }
                                return "SATELLITE";
                            }
                            return "CLOUD SYNC";
                        }
                        return "RCS";
                    }
                    return "MMS PUSH";
                }
                return "MMS";
            }
            return "SMS";
        }
        return "UNKNOWN";
    }

    public static boolean bY(int i) {
        if (i != 113 && i != 114) {
            return false;
        }
        return true;
    }

    public static boolean cE(int i) {
        if (i > 0 && i <= 22) {
            return true;
        }
        return false;
    }

    public static boolean cF(int i) {
        if (i != 8 && i != 9 && i != 13 && i != 18 && i != 19 && i != 22) {
            return false;
        }
        return true;
    }

    public static boolean cR(int i) {
        if (i == 0) {
            return true;
        }
        return false;
    }

    public static int cY(int i) {
        if (i != 0) {
            if (i == 1) {
                return 3;
            }
            if (i != 3) {
                return 1;
            }
            return 4;
        }
        return 2;
    }

    public static boolean ca(List list) {
        if (H(list) != null) {
            return true;
        }
        return false;
    }

    public static boolean cj(int i) {
        if (i == 4) {
            return true;
        }
        return false;
    }

    public static boolean cx(int i) {
        if (!d.y(i) && !d.z(i)) {
            return false;
        }
        return true;
    }

    public static boolean cy(int i) {
        if (i != 111 && i != 112 && i != 106 && i != 107 && i != 113 && i != 114 && i != 8 && i != 9 && i != 13 && i != 18 && i != 19 && i != 22) {
            return false;
        }
        return true;
    }

    private static List da(rtb rtbVar, int i, String str) {
        d.s(d.z(i));
        alob alobVar = new alob();
        if (ujx.f(i)) {
            String b2 = ytd.b(str, "");
            rtc a2 = rtd.a();
            a2.b = b2;
            a2.c = "text/plain";
            a2.k(ameb.TOMBSTONE_PART);
            alobVar.h(rtbVar.e(a2.a()));
        }
        return alobVar.g();
    }

    private static boolean db(int i) {
        d.s(d.z(i));
        switch (i) {
            case BasePaymentResult.ERROR_REQUEST_FAILED /* 200 */:
            case BasePaymentResult.ERROR_REQUEST_TIMEOUT /* 201 */:
            case BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED /* 202 */:
            case BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED /* 203 */:
            case 204:
            case 205:
            case 206:
            case 207:
            case 208:
            case 209:
            case 210:
            case 211:
            case 212:
            case 213:
            case 214:
            case 215:
            case 216:
            case 219:
            case 220:
            case 221:
            case 222:
            case 223:
            case 224:
            case 225:
            case 226:
            case 227:
            case 228:
            case 229:
            case 230:
            case 231:
            case 232:
            case 233:
            case 234:
            case 235:
            case 236:
            case 237:
            case 238:
            case 239:
            case 240:
            case 241:
            case 242:
            case 243:
            case 244:
            case 245:
            case 246:
            case 247:
            case 248:
            case 249:
            case 250:
            case 251:
            case 252:
                return true;
            case 217:
            case 218:
                return false;
            default:
                throw new IllegalStateException(String.format("Tombstone %d has unknown read status", Integer.valueOf(i)));
        }
    }

    private final String dc(int i) {
        int j;
        String str;
        int j2 = j();
        if (d.z(j2) && (((j = j()) != 200 && j != 201) || !this.x.isEmpty() || this.i.isEmpty())) {
            if (ujx.f(j2)) {
                str = cW(i);
            } else {
                str = "";
            }
            String str2 = str;
            ujx ujxVar = (ujx) this.u.b();
            alog alogVar = this.x;
            sxn sxnVar = this.j;
            return ujxVar.d(alogVar, sxnVar.k, false, sxnVar.y, sxnVar.c, this.y, str2, this.q);
        }
        return cW(i);
    }

    public static int e(int i) {
        d.s(d.z(i));
        switch (i) {
            case BasePaymentResult.ERROR_REQUEST_FAILED /* 200 */:
            case BasePaymentResult.ERROR_REQUEST_TIMEOUT /* 201 */:
            case BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED /* 202 */:
            case BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED /* 203 */:
            case 207:
            case 213:
            case 215:
            case 216:
            case 217:
            case 218:
            case 219:
            case 220:
            case 221:
            case 223:
            case 224:
            case 225:
            case 226:
            case 227:
            case 228:
            case 229:
            case 230:
            case 231:
            case 233:
            case 234:
            case 235:
            case 237:
            case 238:
            case 240:
            case 241:
            case 242:
                return 3;
            case 204:
            case 208:
            case 252:
                return 1;
            case 205:
            case 206:
            case 209:
            case 214:
            case 222:
            case 236:
                return 0;
            case 210:
            case 211:
            case 212:
            case 232:
            case 243:
            case 244:
            case 245:
            case 251:
                return 5;
            case 239:
            case 246:
            case 247:
            case 248:
            case 249:
            case 250:
                return 7;
            default:
                xyl.c("Tombstone bugle status shouldn't be unknown");
                return -1;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final ruz A() {
        return this.j.am;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final MessageIdType B() {
        return this.j.a;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final MessageIdType C() {
        return this.j.Y;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final rve D() {
        return this.j.R;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final rve E() {
        return this.j.C;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final rwn F() {
        return this.p;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final MessagePartCoreData G() {
        return H(this.i);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final MessagesTable.BindData I() {
        return this.j.a();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final sya J() {
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        Integer valueOf4;
        Integer valueOf5;
        Integer valueOf6;
        Integer valueOf7;
        Integer valueOf8;
        Integer valueOf9;
        Integer valueOf10;
        Integer valueOf11;
        Integer valueOf12;
        Integer valueOf13;
        Integer valueOf14;
        sya syaVar = new sya();
        syaVar.aj("getUpdateBuilderForMessage");
        syaVar.i(this.j.b);
        agnc.r(syaVar.a, "sender_id", this.j.c);
        syaVar.F(this.j.d);
        syaVar.D(this.j.y);
        syaVar.G(this.j.g);
        syaVar.t(this.j.h);
        syaVar.z(this.j.i);
        syaVar.o(this.j.m);
        syaVar.y(this.j.n);
        syaVar.s(this.j.j);
        syaVar.L(this.j.k);
        syaVar.K(this.j.o);
        syaVar.a.put("sms_priority", Integer.valueOf(this.j.p));
        syaVar.J(this.j.q);
        syaVar.m(this.j.u);
        long j = this.j.v;
        valueOf = Integer.valueOf(defpackage.a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(defpackage.a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 59890) {
            agnc.t("rcs_expiry", intValue2);
        }
        if (intValue >= 59890) {
            syaVar.a.put("rcs_expiry", Long.valueOf(j));
        }
        agnc.r(syaVar.a, "mms_subject", yta.a(this.j.r));
        syaVar.n(this.j.s);
        agnc.r(syaVar.a, "mms_content_location", this.j.t);
        syaVar.u(this.j.x);
        syaVar.B(this.j.A);
        syaVar.x(this.j.C);
        syaVar.v(this.j.D);
        syaVar.k(this.j.G);
        String str = this.j.X;
        valueOf3 = Integer.valueOf(defpackage.a.bp().c());
        int intValue3 = valueOf3.intValue();
        valueOf4 = Integer.valueOf(defpackage.a.bp().c());
        int intValue4 = valueOf4.intValue();
        if (intValue4 < 48030) {
            agnc.t("group_private_participant", intValue4);
        }
        if (intValue3 >= 48030) {
            agnc.r(syaVar.a, "group_private_participant", str);
        }
        syaVar.E(this.j.Q);
        long j2 = this.j.U;
        valueOf5 = Integer.valueOf(defpackage.a.bp().c());
        int intValue5 = valueOf5.intValue();
        valueOf6 = Integer.valueOf(defpackage.a.bp().c());
        int intValue6 = valueOf6.intValue();
        if (intValue6 < 37030) {
            agnc.t("report_attempt_acounter", intValue6);
        }
        if (intValue5 >= 37030) {
            syaVar.a.put("report_attempt_acounter", Long.valueOf(j2));
        }
        syaVar.M(this.j.E);
        syaVar.w(this.j.I);
        String str2 = this.j.H;
        valueOf7 = Integer.valueOf(defpackage.a.bp().c());
        int intValue7 = valueOf7.intValue();
        valueOf8 = Integer.valueOf(defpackage.a.bp().c());
        int intValue8 = valueOf8.intValue();
        if (intValue8 < 10002) {
            agnc.t("rcs_remote_instance", intValue8);
        }
        if (intValue7 >= 10002) {
            agnc.r(syaVar.a, "rcs_remote_instance", str2);
        }
        syaVar.H(this.j.J);
        syaVar.I(this.j.K);
        String str3 = this.j.O;
        valueOf9 = Integer.valueOf(defpackage.a.bp().c());
        int intValue9 = valueOf9.intValue();
        valueOf10 = Integer.valueOf(defpackage.a.bp().c());
        int intValue10 = valueOf10.intValue();
        if (intValue10 < 19020) {
            agnc.t("web_id", intValue10);
        }
        if (intValue9 >= 19020) {
            agnc.r(syaVar.a, "web_id", str3);
        }
        syaVar.j(this.j.V);
        syaVar.A(this.j.ac);
        syaVar.f(this.j.af);
        syaVar.h(this.j.ag);
        atok atokVar = this.j.ah;
        valueOf11 = Integer.valueOf(defpackage.a.bp().c());
        int intValue11 = valueOf11.intValue();
        valueOf12 = Integer.valueOf(defpackage.a.bp().c());
        int intValue12 = valueOf12.intValue();
        if (intValue12 < 58680) {
            agnc.t("trace_id", intValue12);
        }
        if (intValue11 >= 58680) {
            if (atokVar == null) {
                syaVar.a.putNull("trace_id");
            } else {
                syaVar.a.put("trace_id", atokVar.toByteArray());
            }
        }
        int i = this.j.al;
        valueOf13 = Integer.valueOf(defpackage.a.bp().c());
        int intValue13 = valueOf13.intValue();
        valueOf14 = Integer.valueOf(defpackage.a.bp().c());
        int intValue14 = valueOf14.intValue();
        if (intValue14 < 59430) {
            agnc.t("message_original_protocol", intValue14);
        }
        if (intValue13 >= 59430) {
            syaVar.a.put("message_original_protocol", Integer.valueOf(i));
        }
        return syaVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final tqp K() {
        return this.j.ai;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final tqp L() {
        return this.j.aj;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final tqr M() {
        return this.j.E;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final tqu N() {
        return this.j.ak;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final voe O() {
        return this.o;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final xxw P() {
        return this.j.ad;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final ahka Q() {
        return R(d());
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final alog S() {
        return this.w;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final alog T() {
        return this.x;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final amjk U() {
        return this.n;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final apwq V() {
        return this.j.V;
    }

    @Override // defpackage.rwy
    public final List W() {
        return this.i;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final Instant X() {
        return this.j.h;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final Optional Y() {
        return wam.i(V(), vxt.RCS_PENPAL_NAMESPACE, "zxmckmnbniuoip").map(new rsb(8));
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final Optional Z() {
        return this.j.ao;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final int a() {
        return this.j.af;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String aA() {
        return this.j.O;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final List aD() {
        Stream filter = Collection.EL.stream(this.i).filter(new rsi(7));
        int i = alog.d;
        return (List) filter.collect(alls.a);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final UUID aE() {
        return (UUID) this.j.ab.orElse(null);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final atok aF() {
        return this.j.ah;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aG(String str, Object obj) {
        sxn sxnVar = this.j;
        if (sxnVar.ay == null) {
            sxnVar.ay = new HashMap();
        }
        sxnVar.ay.put(str, obj);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aH(MessagePartCoreData messagePartCoreData) {
        this.i.add(messagePartCoreData);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aI(MessagesTable.BindData bindData) {
        this.j = bindData.E();
        this.i.clear();
        int i = alog.d;
        this.x = alsx.a;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aJ(SelfIdentityId selfIdentityId) {
        this.j.ad(((SelfIdentityIdImpl) selfIdentityId).a);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aK(SelfIdentityId selfIdentityId) {
        this.j.af(((SelfIdentityIdImpl) selfIdentityId).a);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aL(String str) {
        this.j.af(str);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aM() {
        this.j.S(-1L);
        this.j.A(0L);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aN() {
        sxn sxnVar = this.j;
        sxnVar.e(sxnVar.af + 1);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aO(Instant instant, boolean z) {
        int i;
        this.j.ah(instant.toEpochMilli());
        if (cw()) {
            int i2 = 102;
            if (!z ? this.j.k == 105 : !((i = this.j.k) != 105 && i != 104)) {
                i2 = 104;
            }
            this.j.an(i2);
            return;
        }
        this.j.an(7);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aP(long j) {
        if (cw()) {
            this.j.X(j);
            this.j.an(110);
        } else {
            this.j.ah(j);
            this.j.an(12);
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aQ(long j) {
        if (cw()) {
            this.j.X(j);
            this.j.an(100);
            this.j.A(0L);
        } else {
            this.j.ah(j);
            this.j.an(1);
        }
    }

    public final void aR(long j) {
        this.j.X(j);
        sxn sxnVar = this.j;
        if (sxnVar.k == 101) {
            sxnVar.an(103);
        } else {
            sxnVar.an(105);
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aS(long j) {
        if (cw()) {
            this.j.X(j);
            sxn sxnVar = this.j;
            if (sxnVar.k == 105) {
                sxnVar.an(101);
                return;
            } else {
                sxnVar.an(106);
                return;
            }
        }
        this.j.ah(j);
        this.j.X(j);
        this.j.an(8);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aT(long j) {
        int i = this.j.k;
        int[] iArr = {10, 4};
        int i2 = 0;
        while (true) {
            if (i2 < 2) {
                if (i == iArr[i2]) {
                    break;
                } else {
                    i2++;
                }
            } else {
                xyl.c("Expected value to be one of " + Arrays.toString(iArr) + " but was " + i);
                break;
            }
        }
        this.j.ah(j);
        this.j.an(8);
        this.j.P(10001);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aU(long j) {
        this.j.ah(j);
        this.j.X(j);
        this.j.an(9);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aV(long j) {
        if (cw()) {
            aR(j);
        } else {
            bb(j);
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aW(long j) {
        this.j.ah(j);
        this.j.an(7);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aX(long j) {
        this.j.ah(j);
        this.j.X(j);
        this.j.an(18);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aY() {
        this.j.an(15);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aZ(long j) {
        this.j.an(6);
        this.j.ah(j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final Optional aa() {
        akrh e2 = aktp.e("MessageData#getReceivingMsisdnMessagingIdentity");
        try {
            Optional flatMap = Optional.ofNullable(this.j.e).flatMap(new rsc(this, 4));
            msk mskVar = (msk) this.t.b();
            mskVar.getClass();
            Optional map = flatMap.map(new rsc(mskVar, 3));
            e2.close();
            return map;
        } catch (Throwable th) {
            try {
                e2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final Optional ab() {
        Optional flatMap;
        akrh e2 = aktp.e("MessageData#getSelfIdentityChatEndpoint");
        try {
            int i = 9;
            if (cD()) {
                flatMap = ac().flatMap(new rsb(i));
            } else {
                flatMap = aa().flatMap(new rsb(i));
            }
            e2.close();
            return flatMap;
        } catch (Throwable th) {
            try {
                e2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final Optional ac() {
        Optional empty;
        akrh e2 = aktp.e("MessageData#getSenderMessagingIdentity");
        try {
            if (this.j.d != null) {
                empty = Optional.of(((msk) this.t.b()).r(albo.ag(this.j.d)));
            } else {
                empty = Optional.empty();
            }
            e2.close();
            return empty;
        } catch (Throwable th) {
            try {
                e2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String ad() {
        return this.j.B;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String ae() {
        return this.j.W;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String af() {
        return this.j.M;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String ag() {
        if (!this.i.isEmpty()) {
            if (this.i.size() == 1) {
                return ((MessagePartCoreData) this.i.get(0)).U();
            }
            return "multipart/mixed";
        }
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String ah() {
        return this.j.S;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String ai() {
        if (cw()) {
            return "INCOMING";
        }
        return "OUTGOING";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String aj() {
        String string;
        String string2;
        xyl.k(bV());
        MessagePartCoreData G = G();
        if (G == null) {
            return "";
        }
        Context context = this.q;
        if (G.bk()) {
            string = context.getString(R.string.file_transfer_via_sms_image);
        } else if (G.bz()) {
            string = context.getString(R.string.file_transfer_via_sms_video);
        } else if (G.aW()) {
            string = context.getString(R.string.file_transfer_via_sms_audio);
        } else if (G.by()) {
            string = context.getString(R.string.file_transfer_via_sms_contact);
        } else {
            string = context.getString(R.string.file_transfer_via_sms_other);
        }
        String formatShortFileSize = Formatter.formatShortFileSize(context, G.l());
        String c2 = gh.c(G.U());
        if (TextUtils.isEmpty(c2)) {
            string2 = context.getString(R.string.file_transfer_via_sms_info_no_file_type, formatShortFileSize);
        } else {
            c2.getClass();
            string2 = context.getString(R.string.file_transfer_via_sms_info, formatShortFileSize, c2);
        }
        String string3 = context.getString(R.string.file_transfer_via_sms_expiry, ((znj) this.v.b()).w(k()).toString());
        Uri u = G.u();
        u.getClass();
        return context.getString(R.string.file_transfer_via_sms_format, string, u, string2, string3);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String ak() {
        return this.j.X;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String am() {
        return dc(2);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String an() {
        return cW(2);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String ao() {
        return this.j.t;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String ap() {
        return this.j.r;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String aq() {
        return this.j.s;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String ar() {
        return as(d());
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String at() {
        return dc(1);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String au() {
        return dc(3);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String av() {
        Uri u;
        xyl.k(bV());
        MessagePartCoreData G = G();
        if (G != null && (u = G.u()) != null) {
            return u.toString();
        }
        return "";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String aw() {
        return this.j.c;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String ax() {
        return this.j.K;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String ay() {
        return qkv.a(this.j.k);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String az() {
        voa voaVar;
        voe voeVar = this.o;
        boolean z = false;
        if (voeVar != null && voeVar.b == 103) {
            z = true;
        }
        albo.X(z, "Required complete Google Photos sharing state, got %s", voeVar);
        String cW = cW(2);
        voeVar.getClass();
        if (voeVar.b == 103) {
            voaVar = (voa) voeVar.c;
        } else {
            voaVar = voa.a;
        }
        String str = voaVar.b;
        if (TextUtils.isEmpty(cW)) {
            return str;
        }
        return defpackage.a.co(str, cW, "\n");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final int b() {
        return this.j.p;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bA(msh mshVar) {
        mshVar.e().filter(new rsi(6)).ifPresentOrElse(new rgd(this, 15), new eyg(7));
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bB(lua luaVar) {
        this.l = luaVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bC(int i) {
        this.j.aa(i);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bD(msh mshVar) {
        this.j.ag(mshVar.i());
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bE(long j) {
        this.j.ah(j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bF(int i) {
        this.j.ai(i);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bG(String str) {
        this.j.aj(str);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bH(long j) {
        this.j.ak(j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bI(int i) {
        this.j.an(i);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bJ(atok atokVar) {
        this.j.ao(atokVar);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bK(long j) {
        this.j.ap(j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bL(String str, List list) {
        this.y = str;
        this.x = alog.n(list);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bM(MessagesTable.BindData bindData) {
        this.j = bindData.E();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bN(String str) {
        this.j.ar(str);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bO(tqu tquVar) {
        this.j.as(tquVar);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bP() {
        xyl.a(d(), 0);
        xyl.f(cw());
        for (MessagePartCoreData messagePartCoreData : this.i) {
            if (messagePartCoreData.bw()) {
                messagePartCoreData.aJ(this.q);
            }
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bQ(MessageIdType messageIdType) {
        xyl.k(!messageIdType.b());
        xyl.k(this.j.a.b());
        this.j.v(messageIdType);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bR(rve rveVar) {
        xyl.k(this.j.C.i());
        this.j.T(rveVar);
        if (this.j.R.i()) {
            this.j.K(rveVar);
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bS(ConversationIdType conversationIdType, Uri uri, long j) {
        this.j.m(conversationIdType);
        this.j.al(uri);
        this.j.W(true);
        this.j.G(true);
        this.j.X(j);
        this.j.ah(j);
        this.j.an(4);
        this.j.ab(j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bT() {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((MessagePartCoreData) it.next()).ah();
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean bU() {
        if (yhx.g(this.q)) {
            return false;
        }
        int i = this.j.k;
        if (i != 102 && i != 104) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean bV() {
        if (!cI() && !cQ()) {
            return false;
        }
        if (cq()) {
            return true;
        }
        if (bZ()) {
            if (this.j.u > 0) {
                if (this.r.f().toEpochMilli() >= this.j.u + xcd.a()) {
                    alvw m = a.m();
                    m.X(ydl.a, this.j.a.a());
                    ((alwl) m.h("com/google/android/apps/messaging/shared/datamodel/data/MessageData", "canFallbackViaSms", 2765, "MessageData.java")).q("fallback to sms not allowed because of expiry");
                    return false;
                }
            }
            if (cn() || cc()) {
                return true;
            }
            alvw m2 = a.m();
            m2.X(ydl.a, this.j.a.a());
            ((alwl) m2.h("com/google/android/apps/messaging/shared/datamodel/data/MessageData", "canFallbackViaSms", 2777, "MessageData.java")).q("fallback to sms not allowed due to absent uri");
            return false;
        }
        alvw m3 = a.m();
        m3.X(ydl.a, this.j.a.a());
        ((alwl) m3.h("com/google/android/apps/messaging/shared/datamodel/data/MessageData", "canFallbackViaSms", 2758, "MessageData.java")).q("fallback to sms not allowed without attachments");
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean bW() {
        if (yhx.g(this.q)) {
            return false;
        }
        int i = this.j.k;
        if (i != 106 && i != 101 && i != 115 && i != 112 && i != 110 && (!rvx.f(i) || !((yck) this.g.b()).q())) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean bX() {
        int i = this.j.k;
        if (i != 4 && i != 7) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean bZ() {
        return ca(this.i);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void ba(long j) {
        this.j.ah(j);
        this.j.an(10);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bb(long j) {
        this.j.an(5);
        this.j.ah(j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bc(long j) {
        this.j.ah(j);
        this.j.an(1);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bd(long j) {
        if (cw()) {
            this.j.X(j);
            this.j.an(111);
        } else {
            this.j.ah(j);
            this.j.an(13);
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void be() {
        this.j.e(0);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bf(rwn rwnVar) {
        this.p = rwnVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bg(String str) {
        this.j.h(str);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bh(xxw xxwVar) {
        this.j.l(xxwVar);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bi(String str, byte[] bArr) {
        sxn sxnVar = this.j;
        sxnVar.o(bArr);
        sxnVar.p(str);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bj(apwq apwqVar) {
        this.j.q(apwqVar);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bk(UUID uuid) {
        this.j.r(Optional.ofNullable(uuid));
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bl(amjk amjkVar) {
        this.n = amjkVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bm(boolean z) {
        this.j.w(z);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bn() {
        this.j.Q(2);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bo(boolean z) {
        this.j.G(z);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bp(boolean z) {
        this.j.W(z);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bq() {
        this.j.Q(0);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void br(Uri uri) {
        this.j.al(uri);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bs(MessageUsageStatisticsData messageUsageStatisticsData) {
        this.k = messageUsageStatisticsData;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bt(String str) {
        this.j.C(str);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bu(rve rveVar) {
        this.j.K(rveVar);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bv(tqp tqpVar) {
        this.j.L(tqpVar);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bw(tqp tqpVar) {
        this.j.M(tqpVar);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bx(Instant instant) {
        this.j.O(instant);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void by(int i) {
        this.j.P(i);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bz(long j) {
        this.j.X(j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final int c() {
        return this.i.size();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cA() {
        return this.j.n;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cB() {
        return d.A(this.j.j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cC() {
        if (this.j.j == 2) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cD() {
        return cE(this.j.k);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cG() {
        int i = this.j.k;
        if (i != 104 && i != 102) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cH() {
        int i = this.j.k;
        if (i != 4 && i != 7) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cI() {
        return rvx.y(this.j.j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cJ() {
        if (cI() && bZ() && !cq()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cK() {
        sxn sxnVar = this.j;
        if (sxnVar.j != 3 && sxnVar.C.k()) {
            sxn sxnVar2 = this.j;
            if (sxnVar2.k != 15 && sxnVar2.ag) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cL() {
        if (this.j.j == 7) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cM() {
        if (this.j.k == 16) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cN() {
        return rtw.h(this.x, this.j.c);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cO() {
        int i = this.j.k;
        if (i != 5 && i != 6) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cP() {
        return rvx.v(this.j.k);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cQ() {
        return cR(this.j.j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cS() {
        if (cQ() && bZ() && !cq() && this.o == null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cT() {
        return d.z(this.j.k);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cU() {
        if (this.j.k == 4) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final byte[] cV() {
        return this.j.T;
    }

    public final String cW(int i) {
        int i2;
        String ad;
        String property = System.getProperty("line.separator");
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) arrayList.get(i3);
            z |= messagePartCoreData.bd();
            if (messagePartCoreData.bp()) {
                i2 = 3;
                if (i != 3) {
                }
            } else {
                i2 = i;
            }
            if (messagePartCoreData.aT()) {
                if (i2 == 2) {
                    ad = messagePartCoreData.V();
                } else {
                    ad = messagePartCoreData.ad();
                }
                if (!TextUtils.isEmpty(ad)) {
                    if (sb.length() > 0) {
                        sb.append(property);
                    }
                    sb.append(ad);
                }
            }
        }
        if (TextUtils.isEmpty(sb) && z) {
            return vht.i(this.q, this.i);
        }
        return sb.toString();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void cX(sxt sxtVar) {
        aI((MessagesTable.BindData) sxtVar.cK());
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final hgj cZ() {
        return this.z;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cb() {
        if (!TextUtils.isEmpty(this.j.r) || d.z(this.j.k) || this.l != null) {
            return true;
        }
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) arrayList.get(i);
            if (messagePartCoreData.aV()) {
                return true;
            }
            i++;
            if (!TextUtils.isEmpty(messagePartCoreData.ad())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cc() {
        MessagePartCoreData G = G();
        if (G != null && G.u() != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cd() {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            boolean bp = ((MessagePartCoreData) arrayList.get(i)).bp();
            i++;
            if (bp) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean ce() {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            boolean bu = ((MessagePartCoreData) arrayList.get(i)).bu();
            i++;
            if (bu) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cf() {
        int i = this.j.k;
        if (i != 105 && i != 104) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cg() {
        if (this.j.k == 115) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean ch() {
        return this.j.ag;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean ci() {
        return cj(this.j.j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean ck() {
        return rvx.h(this.j.k);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cl() {
        int i = this.j.k;
        if (i != 105 && i != 103) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cm() {
        if (this.j.j == 6) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cn() {
        if (this.j.D != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean co() {
        if (cL() && c() > 0 && Collection.EL.stream(this.i).anyMatch(new rsi(5))) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cp() {
        return cy(this.j.k);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cq() {
        MessagePartCoreData G = G();
        if (G != null && G.bl()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cr() {
        Optional i = wam.i(V(), vxt.RCS_PENPAL_NAMESPACE, "jakgvfknopmmo");
        if (i.isPresent() && ((String) i.get()).equals("true")) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cs() {
        return this.j.G;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [armf, java.lang.Object] */
    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean ct(long j) {
        if (j - this.j.A < TimeUnit.MINUTES.toMillis(((Long) this.A.a.b()).longValue())) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cu(long j) {
        Long l;
        if (cI()) {
            l = (Long) e.e();
        } else {
            l = (Long) d.e();
        }
        if (j - this.j.A < l.longValue()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cv() {
        return d.y(this.j.k);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cw() {
        return cx(this.j.k);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cz() {
        return this.j.m;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final int d() {
        return this.j.j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageData)) {
            return false;
        }
        return Objects.equals(this.j.a, ((MessageData) obj).j.a);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final int f() {
        return this.j.x;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final int g() {
        return this.j.l;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final int h() {
        return this.j.ac;
    }

    public final int hashCode() {
        MessageIdType messageIdType = this.j.a;
        if (messageIdType != null) {
            return messageIdType.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final int i() {
        return this.j.J;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final int j() {
        return this.j.k;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final long k() {
        return this.j.u;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final long l() {
        return this.j.v;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final long m() {
        return this.j.I;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final long n() {
        return this.j.i;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final long o() {
        return this.j.A;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final long p() {
        return this.j.Q;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final long q() {
        return this.j.g;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final long r() {
        return this.j.q;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final long s() {
        return this.j.P;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final Uri t() {
        return this.j.o;
    }

    public final String toString() {
        sxn sxnVar = this.j;
        return aB(sxnVar.a, sxnVar.j, this.i);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final lua u() {
        return this.l;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final SelfIdentityId v() {
        return lga.W(this.j.y);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final qei w() {
        akrh e2 = aktp.e("MessageData#getSelfIdentityChatEndpointOrThrow");
        try {
            qei qeiVar = (qei) ab().orElseThrow(new roi(7));
            e2.close();
            return qeiVar;
        } catch (Throwable th) {
            try {
                e2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        String str;
        this.j.a().writeToParcel(parcel, i);
        parcel.writeInt(this.i.size());
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeParcelable((MessagePartCoreData) arrayList.get(i2), i);
        }
        parcel.writeParcelable(this.k, i);
        hgj hgjVar = this.z;
        byte[] bArr4 = null;
        if (hgjVar != null) {
            bArr = ((aoyj) hgjVar.a).toByteArray();
        } else {
            bArr = null;
        }
        parcel.writeByteArray(bArr);
        lua luaVar = this.l;
        parcel.getClass();
        if (luaVar != null) {
            bArr2 = luaVar.a.toByteArray();
        } else {
            bArr2 = null;
        }
        parcel.writeByteArray(bArr2);
        voe voeVar = this.o;
        parcel.getClass();
        if (voeVar != null) {
            bArr3 = voeVar.toByteArray();
        } else {
            bArr3 = null;
        }
        parcel.writeByteArray(bArr3);
        rwn rwnVar = this.p;
        if (rwnVar == null) {
            str = null;
        } else {
            str = rwnVar.a;
        }
        parcel.writeString(str);
        wjj wjjVar = this.m;
        parcel.getClass();
        if (wjjVar != null) {
            bArr4 = wjjVar.a.toByteArray();
        }
        parcel.writeByteArray(bArr4);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final MessageCoreData x() {
        lua luaVar;
        MessageCoreData a2 = this.s.a();
        MessageData messageData = (MessageData) a2;
        messageData.j = this.j.a().E();
        messageData.k = this.k.e();
        lua luaVar2 = this.l;
        rwn rwnVar = null;
        if (luaVar2 != null) {
            luaVar = new lua(luaVar2.a);
        } else {
            luaVar = null;
        }
        messageData.l = luaVar;
        rwn rwnVar2 = this.p;
        if (rwnVar2 != null) {
            rwnVar = new rwn(rwnVar2.a);
        }
        messageData.p = rwnVar;
        messageData.j.x(Optional.empty());
        return a2;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final MessageUsageStatisticsData y() {
        return this.k;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final ConversationIdType z() {
        return this.j.b;
    }

    public MessageData(Context context, xnv xnvVar, rtb rtbVar, tqx tqxVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, ibi ibiVar) {
        this.i = new ArrayList();
        int i = alog.d;
        alog alogVar = alsx.a;
        this.w = alogVar;
        this.x = alogVar;
        this.q = context;
        this.r = xnvVar;
        this.f = rtbVar;
        this.s = tqxVar;
        this.g = armfVar;
        this.t = armfVar2;
        this.h = armfVar3;
        this.u = armfVar4;
        this.v = armfVar5;
        this.A = ibiVar;
        sxn b2 = MessagesTable.b();
        this.j = b2;
        b2.am(129);
        this.j.ai(-1);
        this.j.aj(null);
        this.j.S(-1L);
        this.j.ae(1L);
        this.k = new MessageUsageStatisticsDataImpl();
    }

    public MessageData(Context context, xnv xnvVar, rtb rtbVar, tqx tqxVar, armf armfVar, vyv vyvVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, ibi ibiVar, int i, ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, String str) {
        this(context, xnvVar, rtbVar, tqxVar, armfVar, armfVar2, armfVar3, armfVar4, armfVar5, ibiVar, conversationIdType, lga.Y(selfIdentityId), selfIdentityId, 3, i, aC(rtbVar, str));
        if (i != 0) {
            if (i == 1) {
                this.j.C(null);
                this.j.am(129);
            } else if (i != 3 && i != 6 && i != 7) {
                throw new IllegalArgumentException("Unsupported message type: " + i + ", " + as(i));
            }
        }
    }

    public MessageData(Context context, xnv xnvVar, rtb rtbVar, tqx tqxVar, armf armfVar, vyv vyvVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, ibi ibiVar, Uri uri, ConversationIdType conversationIdType, String str, SelfIdentityId selfIdentityId, String str2, String str3, long j, long j2, boolean z, boolean z2, long j3) {
        this(context, xnvVar, rtbVar, tqxVar, armfVar, vyvVar, armfVar2, armfVar3, armfVar4, armfVar5, ibiVar, conversationIdType, str, selfIdentityId, 100, 0, aC(rtbVar, str2), j2, j, z, z2);
        sxn sxnVar = this.j;
        sxnVar.al(uri);
        sxnVar.C(str3);
        this.j.ap(j3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:10:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MessageData(android.content.Context r19, defpackage.xnv r20, defpackage.rtb r21, defpackage.tqx r22, defpackage.armf r23, defpackage.vyv r24, defpackage.armf r25, defpackage.armf r26, defpackage.armf r27, defpackage.armf r28, defpackage.ibi r29, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r30, com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r31, defpackage.qei r32, java.lang.String r33, java.lang.String r34) {
        /*
            r18 = this;
            r14 = r18
            r15 = r21
            r12 = r33
            r13 = r34
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r25
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r30
            r13 = r31
            java.lang.String r16 = defpackage.lga.Y(r31)
            r12 = r16
            int r16 = defpackage.alog.d
            r16 = 3
            r15 = r16
            alog r16 = defpackage.alsx.a
            r17 = 3
            r14 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = android.text.TextUtils.isEmpty(r33)
            if (r0 != 0) goto Ld3
            int r0 = r34.hashCode()
            r1 = 622719353(0x251df179, float:1.3699393E-16)
            java.lang.String r2 = "application/vnd.gsma.botsuggestion.response.v1.0+json"
            r3 = 1
            if (r0 == r1) goto L5d
            r1 = 817335912(0x30b78e68, float:1.3355477E-9)
            if (r0 == r1) goto L51
            r1 = r34
            goto L67
        L51:
            java.lang.String r0 = "text/plain"
            r1 = r34
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L67
            r0 = 0
            goto L68
        L5d:
            r1 = r34
            boolean r0 = r1.equals(r2)
            if (r0 == 0) goto L67
            r0 = r3
            goto L68
        L67:
            r0 = -1
        L68:
            if (r0 == 0) goto Lc3
            if (r0 != r3) goto Lb5
            rtc r0 = defpackage.rtd.a()
            r1 = r33
            r0.b = r1
            r0.c = r2
            ameb r2 = defpackage.ameb.SUGGESTED_REPLY_RESPONSE
            r0.k(r2)
            rtd r0 = r0.a()
            r2 = r21
            com.google.android.apps.messaging.shared.datamodel.data.MessagePartData r0 = r2.e(r0)
            com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponse r1 = com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponseDeserializer.deserializeFromJson(r33)
            if (r1 == 0) goto La0
            com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponse$ConversationSuggestionResponseType r1 = r1.type
            com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponse$ConversationSuggestionResponseType r2 = com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponse.ConversationSuggestionResponseType.ACTION
            if (r1 != r2) goto La0
            ameb r1 = defpackage.ameb.SUGGESTED_ACTION_RESPONSE
            if (r1 != 0) goto L97
            ameb r1 = defpackage.ameb.UNKNOWN
        L97:
            tbg r2 = r0.d
            int r1 = r1.a()
            r2.S(r1)
        La0:
            r4 = r18
            java.util.ArrayList r1 = r4.i
            r1.add(r0)
            ameb r0 = r0.M()
            ameb r1 = defpackage.ameb.SUGGESTED_ACTION_RESPONSE
            if (r0 != r1) goto Ld5
            sxn r0 = r4.j
            r0.w(r3)
            goto Ld5
        Lb5:
            r4 = r18
            java.lang.String r0 = "Unsupported content type: "
            java.lang.String r0 = r0.concat(r1)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        Lc3:
            r4 = r18
            r2 = r21
            r1 = r33
            java.util.ArrayList r0 = r4.i
            com.google.android.apps.messaging.shared.datamodel.data.MessagePartData r1 = r2.c(r1)
            r0.add(r1)
            goto Ld5
        Ld3:
            r4 = r18
        Ld5:
            sxn r0 = r4.j
            r1 = r32
            java.lang.String r1 = r1.d
            r0.ag(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.data.MessageData.<init>(android.content.Context, xnv, rtb, tqx, armf, vyv, armf, armf, armf, armf, ibi, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId, qei, java.lang.String, java.lang.String):void");
    }

    public MessageData(Context context, xnv xnvVar, rtb rtbVar, tqx tqxVar, armf armfVar, vyv vyvVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, ibi ibiVar, ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, MessageCoreData messageCoreData) {
        this(context, xnvVar, rtbVar, tqxVar, armfVar, armfVar2, armfVar3, armfVar4, armfVar5, ibiVar, conversationIdType, ((SelfIdentityIdImpl) selfIdentityId).a, selfIdentityId, 3, -1, messageCoreData.W());
        MessageData messageData;
        if (TextUtils.isEmpty(messageCoreData.aw())) {
            messageData = this;
        } else {
            messageData = this;
            messageData.j.af(messageCoreData.aw());
        }
        if (TextUtils.isEmpty(messageCoreData.ap())) {
            return;
        }
        messageData.j.C(messageCoreData.ap());
    }

    public MessageData(Context context, xnv xnvVar, rtb rtbVar, tqx tqxVar, armf armfVar, vyv vyvVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, ibi ibiVar, ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, String str, qei qeiVar) {
        this(context, xnvVar, rtbVar, tqxVar, armfVar, armfVar2, armfVar3, armfVar4, armfVar5, ibiVar, conversationIdType, lga.Y(selfIdentityId), selfIdentityId, 3, 0, aC(rtbVar, str));
        this.j.ag(qeiVar.d);
    }

    public MessageData(Context context, xnv xnvVar, rtb rtbVar, tqx tqxVar, armf armfVar, vyv vyvVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, ibi ibiVar, ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, String str, String str2, boolean z) {
        this(context, xnvVar, rtbVar, tqxVar, armfVar, armfVar2, armfVar3, armfVar4, armfVar5, ibiVar, conversationIdType, lga.Y(selfIdentityId), selfIdentityId, 3, 1, aC(rtbVar, str));
        this.j.C(str2);
        this.j.am(true != z ? 129 : 130);
    }

    public MessageData(Context context, xnv xnvVar, rtb rtbVar, tqx tqxVar, armf armfVar, vyv vyvVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, ibi ibiVar, ConversationIdType conversationIdType, String str, SelfIdentityId selfIdentityId, int i, int i2, List list, long j, long j2, boolean z, boolean z2) {
        this(context, xnvVar, rtbVar, tqxVar, armfVar, armfVar2, armfVar3, armfVar4, armfVar5, ibiVar, conversationIdType, str, selfIdentityId, i, i2, list);
        sxn sxnVar = this.j;
        sxnVar.X(j);
        sxnVar.ah(j2);
        sxnVar.G(z);
        sxnVar.W(z2);
    }

    public MessageData(Context context, xnv xnvVar, rtb rtbVar, tqx tqxVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, ibi ibiVar, ConversationIdType conversationIdType, String str, SelfIdentityId selfIdentityId, int i, int i2, List list) {
        this(context, xnvVar, rtbVar, tqxVar, armfVar, armfVar2, armfVar3, armfVar4, armfVar5, ibiVar);
        long epochMilli = xnvVar.f().toEpochMilli();
        sxn sxnVar = this.j;
        sxnVar.m(conversationIdType);
        sxnVar.af(TextUtils.isEmpty(str) ? lga.Y(selfIdentityId) : str);
        sxnVar.ad(lga.X(selfIdentityId));
        sxnVar.an(i);
        sxnVar.N(i2);
        sxnVar.X(epochMilli);
        sxnVar.r(Optional.ofNullable(null));
        sxnVar.ah(epochMilli);
        if ((i2 == 0 || i2 == 1) && (i == 3 || i == 4)) {
            this.j.as(tqu.TRANSPORT_NOT_SELECTED);
        }
        this.i.addAll(list);
    }

    public MessageData(Context context, xnv xnvVar, rtb rtbVar, tqx tqxVar, armf armfVar, vyv vyvVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, ibi ibiVar, rve rveVar, String str, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, String str2, int i, int i2, String str3, long j, boolean z, boolean z2, long j2, long j3) {
        this(context, xnvVar, rtbVar, tqxVar, armfVar, vyvVar, armfVar2, armfVar3, armfVar4, armfVar5, ibiVar, conversationIdType, str, selfIdentityId, i, 3, aC(rtbVar, str3), j3, j2, z, z2);
        sxn sxnVar = this.j;
        sxnVar.T(rveVar);
        sxnVar.K(rveVar);
        sxnVar.U(str2);
        sxnVar.ak(j);
        sxnVar.y(i2);
        sxnVar.A(Long.MAX_VALUE);
        sxnVar.P(128);
        if (i == 104 || i == 6) {
            this.j.ab(j3);
        }
    }

    public MessageData(Context context, xnv xnvVar, rtb rtbVar, tqx tqxVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, ibi ibiVar, String str) {
        this(context, xnvVar, rtbVar, tqxVar, armfVar, armfVar2, armfVar3, armfVar4, armfVar5, ibiVar);
        this.j.an(3);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.i.add(rtbVar.c(str));
    }

    public MessageData(Context context, xnv xnvVar, rtb rtbVar, tqx tqxVar, armf armfVar, vyv vyvVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, ibi ibiVar, String str, Uri uri, long j, long j2, rve rveVar, long j3, String str2, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, String str3, int i, boolean z, long j4, long j5, String str4, String str5) {
        this(context, xnvVar, rtbVar, tqxVar, armfVar, vyvVar, armfVar2, armfVar3, armfVar4, armfVar5, ibiVar, rveVar, str2, selfIdentityId, conversationIdType, str3, i, 1, null, j, z, false, j4, j5);
        this.j.S(j3);
        this.j.A(j2);
        rtc a2 = rtd.a();
        a2.c = str;
        a2.l(j);
        a2.k = str4;
        if (uri != null) {
            a2.f = uri;
        }
        if (str5 != null) {
            a2.l = str5;
        }
        this.i.add(rtbVar.e(a2.a()));
    }

    public MessageData(Context context, xnv xnvVar, rtb rtbVar, tqx tqxVar, armf armfVar, vyv vyvVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, ibi ibiVar, String str, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, int i, long j, String str2) {
        this(context, xnvVar, rtbVar, tqxVar, armfVar, vyvVar, armfVar2, armfVar3, armfVar4, armfVar5, ibiVar, conversationIdType, str, selfIdentityId, i, e(i), da(rtbVar, i, str2), j, j, true, db(i));
        sxn sxnVar = this.j;
        sxnVar.A(Long.MAX_VALUE);
        sxnVar.P(128);
    }

    public MessageData(Context context, xnv xnvVar, rtb rtbVar, tqx tqxVar, armf armfVar, vyv vyvVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, ibi ibiVar, String str, ConversationIdType conversationIdType, String str2, SelfIdentityId selfIdentityId, String str3, String str4, long j, long j2, boolean z, boolean z2, int i, String str5) {
        this(context, xnvVar, rtbVar, tqxVar, armfVar, vyvVar, armfVar2, armfVar3, armfVar4, armfVar5, ibiVar, conversationIdType, str2, selfIdentityId, i, 4, aC(rtbVar, str3), j2, j, z, z2);
        sxn sxnVar = this.j;
        sxnVar.h(str);
        sxnVar.C(str4);
        sxnVar.n(str5);
        sxnVar.B(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MessageData(android.content.Context r26, defpackage.xnv r27, defpackage.rtb r28, defpackage.tqx r29, defpackage.armf r30, defpackage.vyv r31, defpackage.armf r32, defpackage.armf r33, defpackage.armf r34, defpackage.armf r35, defpackage.ibi r36, java.lang.String r37, com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r38, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r39, int r40, long r41, long r43, defpackage.wrj r45, defpackage.ruz r46) {
        /*
            r25 = this;
            r15 = r25
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r29
            r5 = r30
            r6 = r31
            r7 = r32
            r8 = r33
            r9 = r34
            r10 = r35
            r11 = r36
            r13 = r37
            r14 = r38
            r12 = r39
            r15 = r40
            r20 = r41
            r18 = r43
            r24 = r0
            rtc r0 = defpackage.rtd.a()
            byte[] r1 = r45.toByteArray()
            r2 = 3
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r2)
            r1.getClass()
            r0.b = r1
            java.lang.String r1 = "application/x-end-of-emergency-proto"
            r0.c = r1
            ameb r1 = defpackage.ameb.TEXT_PART
            r0.k(r1)
            rtd r0 = r0.a()
            r1 = r28
            com.google.android.apps.messaging.shared.datamodel.data.MessagePartData r0 = r1.e(r0)
            alog r17 = defpackage.alog.r(r0)
            r22 = 1
            r23 = 1
            r16 = 7
            r1 = r26
            r2 = r27
            r0 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r20, r22, r23)
            r0 = r25
            sxn r1 = r0.j
            r2 = 0
            r1.al(r2)
            sxn r1 = r0.j
            r2 = r46
            r1.ac(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.data.MessageData.<init>(android.content.Context, xnv, rtb, tqx, armf, vyv, armf, armf, armf, armf, ibi, java.lang.String, com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, int, long, long, wrj, ruz):void");
    }

    public MessageData(Context context, xnv xnvVar, rtb rtbVar, tqx tqxVar, armf armfVar, vyv vyvVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, ibi ibiVar, String str, String str2, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, int i, boolean z, boolean z2, long j, long j2, String str3) {
        this(context, xnvVar, rtbVar, tqxVar, armfVar, vyvVar, armfVar2, armfVar3, armfVar4, armfVar5, ibiVar, conversationIdType, str2, selfIdentityId, i, 0, aC(rtbVar, str3), j2, j, z, z2);
        this.j.al(str == null ? null : Uri.parse(str));
    }

    public MessageData(Context context, xnv xnvVar, rtb rtbVar, tqx tqxVar, armf armfVar, vyv vyvVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, ibi ibiVar, String str, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, int i, boolean z, boolean z2, long j, long j2, String str2, ruz ruzVar) {
        this(context, xnvVar, rtbVar, tqxVar, armfVar, vyvVar, armfVar2, armfVar3, armfVar4, armfVar5, ibiVar, conversationIdType, str, selfIdentityId, i, 7, aC(rtbVar, str2), j2, j, z, z2);
        this.j.al(null);
        if (ruzVar != null) {
            this.j.ac(ruzVar);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageData(Context context, xnv xnvVar, rtb rtbVar, tqx tqxVar, armf armfVar, vyv vyvVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, ibi ibiVar, String str, String str2, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, boolean z, int i, String str3, String str4, int i2, String str5, boolean z2, boolean z3, long j, int i3, long j2, long j3, long j4, String str6, tqr tqrVar, long j5) {
        this(context, xnvVar, rtbVar, tqxVar, armfVar, vyvVar, armfVar2, armfVar3, armfVar4, armfVar5, ibiVar, conversationIdType, str2, selfIdentityId, i, true == z ? 2 : 1, alsx.a, j4, j3, z2, z3);
        int i4 = alog.d;
        sxn sxnVar = this.j;
        sxnVar.z(str3);
        sxnVar.D(str4);
        sxnVar.al(str == null ? null : Uri.parse(str));
        sxnVar.am(i2);
        sxnVar.ak(j);
        sxnVar.C(str5);
        sxnVar.A(j2);
        sxnVar.P(i3);
        sxnVar.B(str6);
        sxnVar.aq(tqrVar);
        sxnVar.ap(j5);
        if (i == 104 || i == 6) {
            this.j.ab(j4);
        }
    }

    public MessageData(Context context, xnv xnvVar, rtb rtbVar, tqx tqxVar, armf armfVar, vyv vyvVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, ibi ibiVar, ConversationIdType conversationIdType, int i, long j) {
        this(context, xnvVar, rtbVar, tqxVar, armfVar, vyvVar, armfVar2, armfVar4, armfVar5, armfVar6, ibiVar, conversationIdType, ((SelfIdentityIdImpl) ((ryg) armfVar3.b()).d().g()).a, ((ryg) armfVar3.b()).d().g(), i, e(i), da(rtbVar, i, null), j, j, true, db(i));
        sxn sxnVar = this.j;
        sxnVar.A(Long.MAX_VALUE);
        sxnVar.P(128);
    }
}
