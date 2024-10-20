package defpackage;

import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Telephony;
import android.telephony.SmsManager;
import android.text.TextUtils;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.stream.Stream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wzw implements wzs, wzy {
    private final armf A;
    private final armf B;
    private final armf C;
    private final armf D;
    private final armf E;
    private final armf F;
    private final armf G;
    private final armf H;
    private final armf I;
    private final armf J;
    private final armf K;
    private final armf L;
    private final armf M;
    private final armf N;
    private final armf O;
    private final armf P;
    private final Optional Q;
    private final armf R;
    private final anen S;
    private final anen T;
    private final armf U;
    private final armf V;
    private final armf W;
    private final armf X;
    private final armf Y;
    private final armf Z;
    private final armf aa;
    private final armf ab;
    private final oeh ac;
    private final atsg ad;
    public final armf i;
    public final armf j;
    public final armf k;
    public final armf l;
    private Boolean p = null;
    private Boolean q = null;
    private final Context r;
    private final armf s;
    private final xnv t;
    private final armf u;
    private final armf v;
    private final armf w;
    private final armf x;
    private final armf y;
    private final armf z;
    static final uuf c = uuh.q(161865896);
    public static final utz d = uuh.r(178041157, "handle_empty_recipients_from_telephony");
    public static final alwo e = alwo.o("Bugle");
    private static final xze m = xze.g("Bugle", "TelephonyManagerInterface");
    private static final String n = String.format(Locale.US, "((%s IN (%d, %d, %d, %d, %d)) AND (%s>=0))", BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, 1, 4, 6, 5, 2, "thread_id");
    private static final String o = String.format(Locale.US, "((%s IN (%d, %d, %d, %d)) AND (%s IN (%d, %d, %d)) AND (%s>=0))", "msg_box", 1, 4, 2, 5, "m_type", 128, 130, 132, "thread_id");
    static final String[] f = {"_id", "recipient_ids"};
    static final Uri g = Telephony.Threads.CONTENT_URI.buildUpon().appendQueryParameter("simple", "true").build();
    static final String[] h = {"archived"};

    public wzw(Context context, atsg atsgVar, armf armfVar, xnv xnvVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14, armf armfVar15, armf armfVar16, armf armfVar17, armf armfVar18, armf armfVar19, armf armfVar20, armf armfVar21, armf armfVar22, armf armfVar23, armf armfVar24, armf armfVar25, armf armfVar26, Optional optional, armf armfVar27, anen anenVar, anen anenVar2, armf armfVar28, armf armfVar29, armf armfVar30, armf armfVar31, armf armfVar32, armf armfVar33, armf armfVar34, armf armfVar35, armf armfVar36, oeh oehVar) {
        this.r = context;
        this.ad = atsgVar;
        this.s = armfVar;
        this.t = xnvVar;
        this.u = armfVar2;
        this.v = armfVar3;
        this.w = armfVar4;
        this.x = armfVar5;
        this.y = armfVar6;
        this.z = armfVar7;
        this.A = armfVar8;
        this.B = armfVar9;
        this.C = armfVar10;
        this.D = armfVar11;
        this.E = armfVar12;
        this.F = armfVar13;
        this.G = armfVar14;
        this.i = armfVar15;
        this.j = armfVar16;
        this.k = armfVar17;
        this.H = armfVar18;
        this.I = armfVar19;
        this.J = armfVar22;
        this.K = armfVar23;
        this.L = armfVar20;
        this.M = armfVar21;
        this.N = armfVar24;
        this.O = armfVar25;
        this.P = armfVar26;
        this.Q = optional;
        this.R = armfVar27;
        this.S = anenVar;
        this.T = anenVar2;
        this.l = armfVar28;
        this.U = armfVar29;
        this.V = armfVar30;
        this.W = armfVar31;
        this.X = armfVar32;
        this.Y = armfVar33;
        this.Z = armfVar34;
        this.aa = armfVar35;
        this.ab = armfVar36;
        this.ac = oehVar;
    }

    private final boolean aA(Uri uri) {
        xyl.l(uri);
        xyl.k(!TextUtils.isEmpty("date_sent"));
        try {
            Cursor e2 = vcp.e(ao(), uri, new String[]{"date_sent"}, null, null, hht.h("date_sent", " ASC LIMIT 1"));
            if (e2 != null) {
                e2.close();
            }
            return true;
        } catch (SQLiteException e3) {
            xyo e4 = m.e();
            e4.H("date_sent in");
            e4.H(uri);
            e4.H("does not exist");
            e4.r(e3);
            return false;
        }
    }

    private final boolean aB(long j, long j2, Uri uri) {
        String str;
        String[] strArr;
        if (aq(j, "thread_id", uri) == 0) {
            return true;
        }
        ContentResolver contentResolver = this.r.getContentResolver();
        if (j2 != Long.MAX_VALUE) {
            str = "thread_id=? AND date<=?";
            strArr = new String[]{Long.toString(j), Long.toString(j2)};
        } else {
            str = "thread_id=?";
            strArr = new String[]{Long.toString(j)};
        }
        if (as(contentResolver, uri, str, strArr, "Bugle.Telephony.Delete.SmsBulk.Latency") > 0) {
            return true;
        }
        return false;
    }

    private final void aC(long[] jArr) {
        String str;
        String[] strArr;
        int length = jArr.length;
        if (length != 0) {
            Uri[] uriArr = {Telephony.Mms.CONTENT_URI, Telephony.Sms.CONTENT_URI};
            for (int i = 0; i < 2; i++) {
                Uri uri = uriArr[i];
                if (true != uri.equals(Telephony.Mms.CONTENT_URI)) {
                    str = "Bugle.Telephony.Delete.SmsBulk.Latency";
                } else {
                    str = "Bugle.Telephony.Delete.MmsBulk.Latency";
                }
                mbm b = ((mce) this.v.b()).b(str);
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i2 + 128;
                    int min = Math.min(i3, length) - i2;
                    String format = String.format(Locale.US, "%s IN %s", "_id", ap(min));
                    if (min <= 0) {
                        strArr = null;
                    } else {
                        String[] strArr2 = new String[min];
                        for (int i4 = 0; i4 < min; i4++) {
                            strArr2[i4] = Long.toString(jArr[i2 + i4]);
                        }
                        strArr = strArr2;
                    }
                    ar(ao(), uri, format, strArr);
                    i2 = i3;
                }
                b.c();
            }
        }
    }

    private final int aD(final ContentResolver contentResolver, final Uri uri, final ContentValues contentValues, final String[] strArr) {
        Optional a = ((wzx) this.aa.b()).a(new arqg() { // from class: wzu
            public final /* synthetic */ String d = "thread_id=? AND read=0 AND date<=?";

            @Override // defpackage.arqg
            public final Object a() {
                utz utzVar = wzw.d;
                return Integer.valueOf(contentResolver.update(uri, contentValues, this.d, strArr));
            }
        });
        if (a.isPresent()) {
            return ((Integer) a.get()).intValue();
        }
        return 0;
    }

    private final Uri aE(Context context, gt gtVar, int i, String str, long j, long j2, String str2, boolean z, String str3) {
        Uri g2;
        Uri uri = null;
        try {
            g2 = ((vak) this.K.b()).g(gtVar, Telephony.Mms.Inbox.CONTENT_URI, i, str, j, null);
        } catch (SQLiteException e2) {
            e = e2;
        } catch (gl e3) {
            e = e3;
        }
        try {
            ContentValues contentValues = new ContentValues(3);
            if (this.p == null) {
                this.p = Boolean.valueOf(aA(Telephony.Mms.CONTENT_URI));
            }
            if (this.p.booleanValue()) {
                contentValues.put("date_sent", Long.valueOf(gtVar.a.b(133)));
            }
            contentValues.put("date", Long.valueOf(j2));
            contentValues.put("ct_l", str2);
            long b = gtVar.a.b(142);
            if (b > 0) {
                contentValues.put("m_size", Long.valueOf(b));
            }
            if (z && !TextUtils.isEmpty(str3) && yyb.aG()) {
                contentValues.put("m_id", str3);
            }
            mbm b2 = ((mce) this.v.b()).b("Bugle.Telephony.Update.Field.Latency");
            vcp.d(context.getContentResolver(), g2, contentValues, null, null);
            b2.c();
            xyo a = m.a();
            a.H("Inserted MMS message into telephony.");
            a.z(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, g2);
            a.q();
            if (z) {
                this.Q.ifPresent(new vrw(14));
                return g2;
            }
            this.Q.ifPresent(new vrw(15));
            return g2;
        } catch (SQLiteException e4) {
            e = e4;
            uri = g2;
            m.n("update mms received message failure", e);
            return uri;
        } catch (gl e5) {
            e = e5;
            uri = g2;
            m.n("persist mms received message failure", e);
            return uri;
        }
    }

    private final void aF() {
        this.Q.ifPresent(new vrw(18));
    }

    private final Uri aG(Context context, List list, MessageCoreData messageCoreData, aknw aknwVar, long j, int i, String str, long j2, byte[] bArr, final boolean z) {
        Uri l;
        String str2;
        String str3;
        byte[] bArr2 = bArr;
        akrh e2 = aktp.e("TelephonyManagerInterface.insertSendingMmsMessage");
        try {
            if (((Boolean) ((utz) vrf.a.get()).e()).booleanValue() && !z && bArr2 != null && new String(bArr2, StandardCharsets.US_ASCII).length() > 40) {
                ((alwl) ((alwl) e.i()).h("com/google/android/apps/messaging/shared/sms/TelephonyManagerInterfaceImpl", "insertSendingMessageInMmsTables", 1389, "TelephonyManagerInterfaceImpl.java")).q("MMS transaction IDs that are longer than 40 characters can not be sent over the network. Updating MMS Transaction ID as empty string");
                bArr2 = "".getBytes(StandardCharsets.US_ASCII);
                ((mbl) this.O.b()).c("Bugle.TelephonyManagerInterface.MmsSend.PduTransactionIdCheck.Failure.Count");
            }
            gv ai = ai((String[]) list.toArray(new String[list.size()]), messageCoreData, aknwVar, 604800L, messageCoreData.b(), j2, bArr2);
            Uri uri = null;
            if (ai != null) {
                HashMap hashMap = new HashMap();
                if (z) {
                    l = au(context, ai, i, str, j, messageCoreData.E().b, hashMap);
                } else {
                    l = l(context, ai, i, str, j, hashMap);
                }
                if (l != null) {
                    uri = ContentUris.withAppendedId(Telephony.Mms.CONTENT_URI, ContentUris.parseId(l));
                    HashMap hashMap2 = new HashMap();
                    for (MessagePartCoreData messagePartCoreData : messageCoreData.W()) {
                        Uri t = messagePartCoreData.t();
                        if (t != null) {
                            hashMap2.put(t, messagePartCoreData);
                        }
                    }
                    if (hashMap2.size() != hashMap.size()) {
                        xyo e3 = m.e();
                        e3.H("Can't update content uri for all parts.");
                        e3.c(messageCoreData.B());
                        e3.v(messageCoreData.s());
                        e3.x("partCount", hashMap2.size());
                        e3.x("updatedPartCount", hashMap.size());
                        e3.q();
                    }
                    ((agnq) this.J.b()).e("TelephonyManagerInterface#updateMessageAndPartsUriFromTelephony", new rgr(this, messageCoreData, uri, hashMap, hashMap2, 6));
                    final boolean z2 = false;
                    if (messageCoreData.bZ() && !messageCoreData.cq()) {
                        z2 = true;
                    }
                    xyo a = m.a();
                    a.H("Inserted outgoing");
                    if (z) {
                        str2 = "RCS";
                    } else {
                        str2 = "MMS";
                    }
                    a.H(str2);
                    if (z2) {
                        str3 = "file transfer";
                    } else {
                        str3 = " text message";
                    }
                    a.H(str3);
                    a.H("into telephony.");
                    a.z("outboxUri", l);
                    a.q();
                    messageCoreData.aE();
                    this.Q.ifPresent(new Consumer() { // from class: wzt
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void q(Object obj) {
                            armf armfVar = (armf) obj;
                            utz utzVar = wzw.d;
                            if (z) {
                                if (z2) {
                                    ((xbz) armfVar.b()).g();
                                } else {
                                    ((xbz) armfVar.b()).f();
                                }
                            }
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                } else {
                    m.m("failed to persist message into telephony");
                }
            }
            e2.close();
            return uri;
        } catch (Throwable th) {
            try {
                e2.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public static final String ap(int i) {
        if (i <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder("(?");
        for (int i2 = 0; i2 < i - 1; i2++) {
            sb.append(",?");
        }
        sb.append(")");
        return sb.toString();
    }

    private final int aq(long j, String str, Uri uri) {
        String[] strArr;
        String str2;
        String[] strArr2;
        ContentResolver contentResolver = this.r.getContentResolver();
        Cursor cursor = null;
        int i = 0;
        if (j != -1 && str != null) {
            String[] strArr3 = {Long.toString(j)};
            str2 = str.concat("=?");
            strArr = new String[]{str};
            strArr2 = strArr3;
        } else {
            strArr = new String[]{"_id"};
            str2 = null;
            strArr2 = null;
        }
        try {
            mbm b = ((mce) this.v.b()).b("Bugle.Telephony.Query.Count.Latency");
            cursor = contentResolver.query(uri, strArr, str2, strArr2, null);
            qxq.m(cursor);
            b.c();
            if (cursor != null) {
                i = cursor.getCount();
            }
            return i;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    private final int ar(ContentResolver contentResolver, Uri uri, String str, String[] strArr) {
        boolean z;
        int i = 0;
        try {
            if (uri.getPathSegments().isEmpty() && str == null) {
                z = true;
            } else {
                z = false;
            }
            albo.T(!z);
            i = contentResolver.delete(uri, str, strArr);
            xyo c2 = m.c();
            c2.H("Deleted messages from telephony");
            c2.z(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
            c2.z("batchSelection", str);
            c2.B("batchSelectionArgs", strArr);
            c2.x("deletedCount", i);
            c2.q();
            if (i > 0) {
                this.Q.ifPresent(new vrw(16));
            }
        } catch (SQLiteException e2) {
            if (((Boolean) xby.a.e()).booleanValue()) {
                xyo b = m.b();
                b.H("Could not delete messages from telephony");
                b.z(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
                b.r(e2);
            } else {
                throw e2;
            }
        } catch (IllegalArgumentException e3) {
            xyo b2 = m.b();
            b2.H("Could not delete messages from telephony");
            b2.z(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
            b2.r(e3);
        } catch (Exception e4) {
            xyo b3 = m.b();
            b3.H("Could not delete messages from telephony");
            b3.z(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
            b3.r(e4);
        }
        return i;
    }

    private final int as(ContentResolver contentResolver, Uri uri, String str, String[] strArr, String str2) {
        mbm b = ((mce) this.v.b()).b(str2);
        int ar = ar(contentResolver, uri, str, strArr);
        b.c();
        return ar;
    }

    private static long at(Uri uri) {
        if (uri != null) {
            try {
                return ContentUris.parseId(uri);
            } catch (NumberFormatException | UnsupportedOperationException unused) {
                return -1L;
            }
        }
        return -1L;
    }

    private final Uri au(Context context, gj gjVar, int i, String str, long j, String str2, Map map) {
        Uri g2;
        Uri uri = null;
        try {
            g2 = ((vak) this.K.b()).g(gjVar, Telephony.Mms.Sent.CONTENT_URI, i, str, j, map);
        } catch (gl e2) {
            e = e2;
        }
        try {
            ContentValues contentValues = new ContentValues(3);
            contentValues.put("read", (Integer) 1);
            contentValues.put("seen", (Integer) 1);
            if (!TextUtils.isEmpty(str2) && yyb.aG()) {
                contentValues.put("m_id", str2);
            }
            mbm b = ((mce) this.v.b()).b("Bugle.Telephony.Update.Mms.Seen.Latency");
            vcp.d(context.getContentResolver(), g2, contentValues, null, null);
            b.c();
            return g2;
        } catch (gl e3) {
            e = e3;
            uri = g2;
            ((alwl) ((alwl) ((alwl) e.h()).g(e)).h("com/google/android/apps/messaging/shared/sms/TelephonyManagerInterfaceImpl", "insertSendReqInternal", (char) 1239, "TelephonyManagerInterfaceImpl.java")).q("persist mms sent message failure");
            return uri;
        }
    }

    private static qwm av(ryg rygVar, SelfIdentityId selfIdentityId) {
        qwm e2 = rygVar.e(selfIdentityId);
        if (e2 == null) {
            return rygVar.d();
        }
        return e2;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.alog aw(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wzw.aw(java.lang.String):alog");
    }

    private final String ax(long j, String str, String[] strArr) {
        Cursor query;
        if (j <= 0 || (query = ao().query(g, f, str, strArr, null)) == null) {
            return null;
        }
        do {
            try {
                if (!query.moveToNext()) {
                    return null;
                }
            } finally {
                query.close();
            }
        } while (j != query.getLong(0));
        return query.getString(1);
    }

    private final void ay(Uri uri, Uri uri2, String str) {
        if (uri != null) {
            int a = a(uri, "Bugle.Telephony.Delete.Message.Latency");
            xyo a2 = m.a();
            a2.H(str);
            a2.z(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
            a2.z("updatedMessageUri", uri2);
            a2.x("count", a);
            a2.q();
        }
    }

    private static boolean az(List list) {
        return Collection.EL.stream(list).map(new wmi(12)).anyMatch(new wjl(7));
    }

    @Override // defpackage.wzs
    public final Optional A(xhv xhvVar) {
        if (xhvVar.d()) {
            return Optional.empty();
        }
        return z(xhvVar.a());
    }

    @Override // defpackage.wzs
    public final Optional B(xaz xazVar, String str) {
        if (xazVar != null && xazVar.b.size() == 1) {
            msh mshVar = (msh) xazVar.b.get(0);
            if (!((vqq) this.x.b()).d(mshVar.j(((Boolean) new msn(18).get()).booleanValue()))) {
                return Optional.ofNullable(mshVar);
            }
        }
        mbm b = ((mce) this.v.b()).b("Bugle.Telephony.Query.Addr.Latency");
        Cursor e2 = vcp.e(ao(), Uri.withAppendedPath(Uri.parse(str), "addr"), qkv.b(), "type=137", null, null);
        qxq.m(e2);
        b.c();
        if (e2 != null) {
            try {
                if (e2.moveToFirst()) {
                    Optional of = Optional.of(((wfh) this.N.b()).g(e2));
                    e2.close();
                    return of;
                }
                e2.close();
            } catch (Throwable th) {
                try {
                    e2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return Optional.empty();
    }

    @Override // defpackage.wzs
    public final String C(long j) {
        Cursor cursor;
        try {
            cursor = ao().query(ContentUris.withAppendedId(b, j), null, null, null, null);
        } catch (RuntimeException unused) {
            xyo b = m.b();
            b.H("getCanonicalAddressFromRecipientId: failed for id");
            b.G(j);
            b.q();
            cursor = null;
        }
        if (cursor != null) {
            try {
                if (cursor.moveToFirst()) {
                    return cursor.getString(0);
                }
                if (cursor.moveToNext()) {
                    xyo a = m.a();
                    a.H("getCanonicalAddressFromRecipientId found more than one result for id");
                    a.G(j);
                    a.q();
                }
                return "";
            } finally {
                cursor.close();
            }
        }
        return "";
    }

    @Override // defpackage.wzs
    public final String D(xaz xazVar, String str) {
        return (String) B(xazVar, str).map(new wmi(13)).orElse(null);
    }

    @Override // defpackage.wzs
    public final String E() {
        return o;
    }

    @Override // defpackage.wzs
    public final String F(long j) {
        String ax = ax(j, "_id=?", new String[]{String.valueOf(j)});
        if (ax == null) {
            ax = ax(j, null, null);
        }
        if (TextUtils.isEmpty(ax) && j > 0) {
            ((mbl) this.O.b()).c("Bugle.Telephony.Thread.Recipients.LookupFailed");
        }
        return ax;
    }

    @Override // defpackage.wzs
    public final String G(xhv xhvVar) {
        return F(yyb.cE(xhvVar));
    }

    @Override // defpackage.wzs
    public final String H() {
        return n;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00de A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0013 A[SYNTHETIC] */
    @Override // defpackage.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List I(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wzw.I(java.lang.String):java.util.List");
    }

    @Override // defpackage.wzs
    public final List J(String str) {
        Uri withAppendedPath = Uri.withAppendedPath(Uri.parse(str), "addr");
        mbm b = ((mce) this.v.b()).b("Bugle.Telephony.Query.Addr.Latency");
        Cursor e2 = vcp.e(this.r.getContentResolver(), withAppendedPath, qkv.b(), null, null, null);
        qxq.m(e2);
        b.c();
        if (e2 != null) {
            try {
                ArrayList arrayList = new ArrayList();
                while (e2.moveToNext()) {
                    msh v = ((msk) this.l.b()).v(((wfh) this.N.b()).g(e2));
                    if (!arrayList.contains(v) && !((ryg) this.U.b()).k(v)) {
                        arrayList.add(v);
                    }
                }
                return arrayList;
            } finally {
                e2.close();
            }
        }
        return new ArrayList();
    }

    @Override // defpackage.wzs
    public final Map K() {
        HashMap hashMap = new HashMap();
        Cursor query = ao().query(g, f, null, null, null);
        while (query != null) {
            try {
                if (!query.moveToNext()) {
                    break;
                }
                int columnIndex = query.getColumnIndex("recipient_ids");
                albo.ae(columnIndex, query.getColumnCount());
                String string = query.getString(columnIndex);
                string.getClass();
                if (anna.e(' ').c(string).size() <= 1) {
                    List I = I(string);
                    if (I.size() != 1) {
                        xyo e2 = m.e();
                        e2.H("More than one messaging identity returned for a single recipient ID.");
                        e2.z("recipientId", string);
                        e2.M("identities", I);
                        e2.q();
                    } else if (((vxq) this.R.b()).b(albo.ag(((msh) I.get(0)).h(((Boolean) new msn(18).get()).booleanValue())))) {
                        int columnIndex2 = query.getColumnIndex("_id");
                        albo.ae(columnIndex2, query.getColumnCount());
                        long j = query.getLong(columnIndex2);
                        xyo a = m.a();
                        a.H("Found a RCS group conversation");
                        a.y("threadId", j);
                        a.M("identity", I.get(0));
                        a.q();
                        hashMap.put(Long.valueOf(j), (msh) I.get(0));
                    }
                }
            } catch (Throwable th) {
                try {
                    query.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (query != null) {
            query.close();
        }
        return hashMap;
    }

    @Override // defpackage.wzs
    public final void L(Context context, Uri uri) {
        ContentValues contentValues = new ContentValues(1);
        contentValues.putNull("st");
        mbm b = ((mce) this.v.b()).b("Bugle.Telephony.Update.Mms.Status.Latency");
        vcp.d(context.getContentResolver(), uri, contentValues, null, null);
        b.c();
    }

    @Override // defpackage.wzs
    public final void M(uj ujVar) {
        int b = ujVar.b();
        int i = 0;
        while (i < b) {
            int i2 = i + 128;
            int min = Math.min(i2, b) - i;
            String format = String.format(Locale.US, "%s != '%s' AND %s IN %s", "ct", "application/smil", "mid", ap(min));
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < min; i3++) {
                int i4 = i + i3;
                List list = ((wye) ujVar.e(i4)).x;
                if (((wye) ujVar.e(i4)).x.isEmpty()) {
                    arrayList.add(Long.toString(((wye) ujVar.e(i4)).b));
                }
            }
            if (!arrayList.isEmpty()) {
                Cursor e2 = vcp.e(this.r.getContentResolver(), wzs.a, wyf.a, format, (String[]) arrayList.toArray(new String[arrayList.size()]), null);
                qxq.m(e2);
                if (e2 != null) {
                    while (e2.moveToNext()) {
                        try {
                            wyf X = ((znj) this.F.b()).X();
                            X.b(e2, false);
                            wye wyeVar = (wye) ujVar.d(X.d);
                            if (wyeVar != null && (!X.e() || !TextUtils.isEmpty(X.f))) {
                                wyeVar.h(X);
                            }
                        } finally {
                            e2.close();
                        }
                    }
                }
                i = i2;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.wzs
    public final void N(long j, long j2) {
        ContentValues contentValues = new ContentValues(1);
        long j3 = j2 / 1000;
        if (j3 == 0) {
            ((mbl) this.O.b()).e("Bugle.Telephony.Timestamp0.Mms", 5);
            j3 = 0;
        }
        contentValues.put("date", Long.valueOf(j3));
        mbm b = ((mce) this.v.b()).b("Bugle.Telephony.Update.Field.Latency");
        ao().update(Telephony.Mms.CONTENT_URI, contentValues, "_id=?", new String[]{Long.toString(j)});
        b.c();
    }

    @Override // defpackage.wzs
    @Deprecated
    public final void O(Uri uri, String str) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("tr_id", str);
            mbm b = ((mce) this.v.b()).b("Bugle.Telephony.Update.Field.Latency");
            int d2 = vcp.d(this.r.getContentResolver(), uri, contentValues, null, null);
            b.c();
            if (d2 == 1) {
                ((alwl) ((alwl) e.g()).h("com/google/android/apps/messaging/shared/sms/TelephonyManagerInterfaceImpl", "updateMmsTransactionIdLegacy", 3837, "TelephonyManagerInterfaceImpl.java")).t("Updated MMS transaction ID. Message URI: %s", uri);
            } else if (d2 > 1) {
                ((alwl) ((alwl) e.i()).h("com/google/android/apps/messaging/shared/sms/TelephonyManagerInterfaceImpl", "updateMmsTransactionIdLegacy", 3839, "TelephonyManagerInterfaceImpl.java")).t("Multiple MMS transaction IDs updated. Message URI: %s", uri);
            } else {
                ((alwl) ((alwl) e.i()).h("com/google/android/apps/messaging/shared/sms/TelephonyManagerInterfaceImpl", "updateMmsTransactionIdLegacy", 3843, "TelephonyManagerInterfaceImpl.java")).t("Failed to update MMS transaction ID. Message URI: %s", uri);
            }
        } catch (SQLiteException | IllegalArgumentException e2) {
            ((alwl) ((alwl) ((alwl) e.i()).g(e2)).h("com/google/android/apps/messaging/shared/sms/TelephonyManagerInterfaceImpl", "updateMmsTransactionIdLegacy", (char) 3846, "TelephonyManagerInterfaceImpl.java")).q("Update MMS Transaction ID failure");
        }
    }

    @Override // defpackage.wzs
    public final void P(Uri uri, int i, long j) {
        if (uri == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(i));
        if (S()) {
            contentValues.put("date_sent", Long.valueOf(j));
        }
        mbm b = ((mce) this.v.b()).b("Bugle.Telephony.Update.Field.Latency");
        ao().update(uri, contentValues, null, null);
        b.c();
    }

    @Override // defpackage.wzs
    public final void Q(xhv xhvVar, boolean z) {
        armf armfVar = this.C;
        long cE = yyb.cE(xhvVar);
        if (!((yjr) armfVar.b()).y()) {
            xyo e2 = m.e();
            e2.H("Not default SMS app. Cannot update archive status of thread in Telephony.");
            e2.A("isArchived", z);
            e2.y("threadId", cE);
            e2.q();
            return;
        }
        if (!((yjf) this.s.b()).m()) {
            xyo e3 = m.e();
            e3.H("No SMS permissions. Cannot update archive status of thread in Telephony.");
            e3.A("isArchived", z);
            e3.y("threadId", cE);
            e3.q();
            return;
        }
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("archived", Integer.valueOf(z ? 1 : 0));
        try {
            mbm b = ((mce) this.v.b()).b("Bugle.Telephony.Update.FieldBulk.Latency");
            ao().update(Telephony.Threads.CONTENT_URI, contentValues, "_id=?", new String[]{Long.toString(cE)});
            b.c();
        } catch (Exception e4) {
            xyo b2 = m.b();
            b2.H("Error updating archive status of thread in Telephony. Missing Archive column?");
            b2.A("isArchived", z);
            b2.y("threadId", cE);
            b2.r(e4);
        }
    }

    @Override // defpackage.wzs
    public final boolean R(long j, long j2) {
        ((wyt) this.z.b()).i();
        boolean aB = aB(j, j2, Telephony.Sms.CONTENT_URI);
        long j3 = Long.MAX_VALUE;
        if (j2 != Long.MAX_VALUE) {
            j3 = j2 / 1000;
        }
        boolean aB2 = aB(j, j3, Telephony.Mms.CONTENT_URI);
        if (!aB && !aB2) {
            return false;
        }
        return true;
    }

    @Override // defpackage.wzs
    public final boolean S() {
        if (this.q == null) {
            this.q = Boolean.valueOf(aA(Telephony.Sms.CONTENT_URI));
        }
        return this.q.booleanValue();
    }

    @Override // defpackage.wzs
    public final boolean T(xhv xhvVar) {
        Uri.Builder buildUpon = Telephony.Threads.CONTENT_URI.buildUpon();
        buildUpon.appendPath(String.valueOf(yyb.cE(xhvVar))).appendPath("recipients");
        try {
            Cursor query = ao().query(buildUpon.build(), h, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        boolean z = true;
                        if (query.getInt(0) != 1) {
                            z = false;
                        }
                        query.close();
                        return z;
                    }
                } finally {
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (Exception e2) {
            xyo b = m.b();
            b.H("Error getting the archived status of a thread in Telephony.");
            b.z("threadId", xhvVar);
            b.r(e2);
        }
        return false;
    }

    @Override // defpackage.wzs
    public final boolean U(Context context, Uri uri, int i, long j) {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            ContentValues contentValues = new ContentValues();
            long j2 = j / 1000;
            contentValues.put("msg_box", Integer.valueOf(i));
            if (j2 == 0) {
                ((mbl) this.O.b()).e("Bugle.Telephony.Timestamp0.Mms", 4);
                j2 = 0;
            }
            contentValues.put("date", Long.valueOf(j2));
            mbm b = ((mce) this.v.b()).b("Bugle.Telephony.Update.Field.Latency");
            int update = contentResolver.update(uri, contentValues, null, null);
            b.c();
            aF();
            if (update == 1) {
                xyo a = m.a();
                a.H("Updated sending MMS.");
                a.z(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
                a.x("box", i);
                a.y("date (secs since epoch)", j2);
                a.q();
                return true;
            }
            return false;
        } catch (SQLiteException | IllegalArgumentException e2) {
            m.n("update mms message failure", e2);
            return false;
        }
    }

    @Override // defpackage.wzs
    public final boolean V(Uri uri, String str) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("tr_id", str);
            mbm b = ((mce) this.v.b()).b("Bugle.Telephony.Update.Field.Latency");
            int d2 = vcp.d(this.r.getContentResolver(), uri, contentValues, null, null);
            b.c();
            if (d2 <= 0) {
                ((alwl) ((alwl) e.i()).h("com/google/android/apps/messaging/shared/sms/TelephonyManagerInterfaceImpl", "updateMmsTransactionId", 3869, "TelephonyManagerInterfaceImpl.java")).t("Failed to update MMS transaction ID. Message URI: %s", uri);
                return false;
            }
            if (d2 == 1) {
                ((alwl) ((alwl) e.g()).h("com/google/android/apps/messaging/shared/sms/TelephonyManagerInterfaceImpl", "updateMmsTransactionId", 3874, "TelephonyManagerInterfaceImpl.java")).t("Updated MMS transaction ID. Message URI: %s", uri);
            } else {
                ((alwl) ((alwl) e.i()).h("com/google/android/apps/messaging/shared/sms/TelephonyManagerInterfaceImpl", "updateMmsTransactionId", 3876, "TelephonyManagerInterfaceImpl.java")).t("Multiple MMS transaction IDs updated. Message URI: %s", uri);
            }
            return true;
        } catch (SQLiteException | IllegalArgumentException e2) {
            ((alwl) ((alwl) ((alwl) e.i()).g(e2)).h("com/google/android/apps/messaging/shared/sms/TelephonyManagerInterfaceImpl", "updateMmsTransactionId", (char) 3881, "TelephonyManagerInterfaceImpl.java")).q("Update MMS Transaction ID failure");
            return false;
        }
    }

    @Override // defpackage.wzs
    public final void W(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (ydk.z(uri) || ydk.y(uri)) {
                String lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment != null) {
                    arrayList.add(Long.valueOf(Long.parseLong(lastPathSegment)));
                }
            }
        }
        long[] jArr = new long[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            jArr[i] = ((Long) arrayList.get(i)).longValue();
        }
        aC(jArr);
    }

    @Override // defpackage.wzs
    public final Uri X(Context context, gt gtVar, int i, String str, long j, long j2, String str2, int i2) {
        long j3;
        if (j2 == 0) {
            ((mbl) this.O.b()).e("Bugle.Telephony.Timestamp0.Mms", 2);
            j3 = 0;
        } else {
            j3 = j2;
        }
        return aE(context, gtVar, i, str, j, j3, null, true, str2);
    }

    @Override // defpackage.wzs
    public final void Y(long j, long j2) {
        xyl.e(-1L, j);
        xyl.e(-1L, j2);
        try {
            ContentResolver ao = ao();
            String[] strArr = {Long.toString(j)};
            ContentValues contentValues = new ContentValues(2);
            contentValues.put("thread_id", Long.valueOf(j2));
            mbm b = ((mce) this.v.b()).b("Bugle.Telephony.Update.FieldBulk.Latency");
            int update = ao.update(Telephony.Sms.CONTENT_URI, contentValues, "thread_id=?", strArr);
            b.c();
            aF();
            mbm b2 = ((mce) this.v.b()).b("Bugle.Telephony.Update.FieldBulk.Latency");
            int update2 = ao.update(Telephony.Mms.CONTENT_URI, contentValues, "thread_id=?", strArr);
            b2.c();
            aF();
            ao.notifyChange(Telephony.Sms.CONTENT_URI, null);
            ao.notifyChange(Telephony.Mms.CONTENT_URI, null);
            xyo a = m.a();
            a.H("Moved messages.");
            a.x("smsCount", update);
            a.x("mmsCount", update2);
            a.y("oldThreadId", j);
            a.y("newThreadId", j2);
            a.q();
        } catch (SQLiteException | IllegalArgumentException e2) {
            m.n("move message failure ", e2);
        }
    }

    @Override // defpackage.wzs
    public final void Z(Uri uri) {
        if (((yjr) this.C.b()).y() && ((yjf) this.s.b()).m()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("read", (Integer) 1);
            contentValues.put("seen", (Integer) 1);
            mbm b = ((mce) this.v.b()).b("Bugle.Telephony.Update.Field.Latency");
            int update = ao().update(uri, contentValues, "read=0", null);
            b.c();
            aF();
            if (update > 1) {
                xyo e2 = m.e();
                e2.H(a.bV(update, "Unexpectedly marked more than one message as read: "));
                e2.z("messageUri", uri);
                e2.q();
                return;
            }
            return;
        }
        xyo e3 = m.e();
        e3.H("Has no permission to set read status in Telephony.");
        e3.z("messageUri", uri);
        e3.q();
    }

    @Override // defpackage.wzs
    public final int a(Uri uri, String str) {
        return as(ao(), uri, null, null, str);
    }

    @Override // defpackage.wzs
    public final void aa(Context context, Uri uri, long j) {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            ContentValues contentValues = new ContentValues(1);
            long j2 = j / 1000;
            contentValues.put("exp", Long.valueOf(j2));
            mbm b = ((mce) this.v.b()).b("Bugle.Telephony.Update.Field.Latency");
            int update = contentResolver.update(uri, contentValues, null, null);
            b.c();
            aF();
            if (update == 1) {
                return;
            }
            xyo e2 = m.e();
            e2.H("updateMmsMessageExpiry - Expect one, but updated.");
            e2.x("cnt", update);
            e2.z(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
            e2.y("expiry (secs since epoch)", j2);
            e2.q();
        } catch (SQLiteException | IllegalArgumentException e3) {
            m.n("update mms message expiry failure", e3);
        }
    }

    @Override // defpackage.wzs
    public final vqh ab(Context context, Uri uri, gu guVar) {
        int a = guVar.a.a(146);
        int i = 2;
        ContentValues contentValues = new ContentValues(2);
        contentValues.put("resp_st", Integer.valueOf(a));
        byte[] k = guVar.a.k(139);
        if (k != null && k.length > 0) {
            contentValues.put("m_id", vak.c(k));
        }
        mbm b = ((mce) this.v.b()).b("Bugle.Telephony.Update.Field.Latency");
        vcp.d(context.getContentResolver(), uri, contentValues, null, null);
        b.c();
        if (a == 128) {
            i = 0;
        } else if (a != 192 && a != 195 && a != 196) {
            xyo b2 = m.b();
            b2.H("failed to send message. respStatus: 0x");
            b2.u(Integer.toHexString(a));
            b2.q();
        } else {
            xyo e2 = m.e();
            e2.H("Response status indicates transient error, setting message send status to AUTO_RETRY");
            e2.x("responseStatus", a);
            e2.q();
            i = 1;
        }
        vqg a2 = vqh.a(i, a);
        a2.c = uri;
        return a2.a();
    }

    @Override // defpackage.wzs
    public final boolean ac(Uri uri, int i, long j) {
        try {
            ContentValues contentValues = new ContentValues(2);
            contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, Integer.valueOf(i));
            contentValues.put("date", Long.valueOf(j));
            mbm b = ((mce) this.v.b()).b("Bugle.Telephony.Update.Field.Latency");
            int update = ao().update(uri, contentValues, null, null);
            b.c();
            aF();
            if (update == 1) {
                xyo a = m.a();
                a.H("Updated sending SMS.");
                a.z(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
                a.x(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, i);
                a.y("date (ms since epoch)", j);
                a.q();
                return true;
            }
            return false;
        } catch (SQLiteException | IllegalArgumentException e2) {
            m.n("update sms message failure", e2);
            return false;
        }
    }

    @Override // defpackage.wzs
    public final void ad(Uri uri, long j) {
        mbm b = ((mce) this.v.b()).b("Bugle.Telephony.Query.Field.Latency");
        Cursor query = ao().query(uri, new String[]{"thread_id", "date"}, null, null, null);
        qxq.m(query);
        b.c();
        try {
            if (query == null) {
                xyo b2 = m.b();
                b2.H("Error finding thread for");
                b2.H(uri);
                b2.q();
            } else if (query.getCount() != 1) {
                xyo b3 = m.b();
                b3.H("Found");
                b3.F(query.getCount());
                b3.H("threads for");
                b3.H(uri);
                b3.q();
            } else if (!query.moveToFirst()) {
                xyo b4 = m.b();
                b4.H("Failed to advance cursor for");
                b4.H(uri);
                b4.q();
            } else {
                int columnIndex = query.getColumnIndex("thread_id");
                albo.ae(columnIndex, query.getColumnCount());
                long j2 = query.getLong(columnIndex);
                long j3 = j(j2, j);
                xyo a = m.a();
                a.G(j3);
                a.H("messages as read for thread");
                a.G(j2);
                a.q();
            }
        } finally {
            xzv.a(query);
        }
    }

    @Override // defpackage.wzs
    public final String[] ae(Context context, gj gjVar) {
        byte[] f2 = gjVar.f();
        if (f2 != null) {
            String str = new String(f2);
            long epochMilli = this.t.f().toEpochMilli() / 1000;
            String[] strArr = {Integer.toString(130), Long.toString(epochMilli), Long.toString((-604800) + epochMilli), Long.toString(epochMilli + 604800), str};
            mbm b = ((mce) this.v.b()).b("Bugle.Telephony.Query.Mms.Latency");
            try {
                Cursor e2 = vcp.e(context.getContentResolver(), Telephony.Mms.CONTENT_URI, new String[]{"_id"}, "((m_type<>?) OR (exp>?)) AND (date>?) AND (date<?) AND (ct_l=?)", strArr, null);
                try {
                    qxq.m(e2);
                    b.c();
                    e2.getClass();
                    int count = e2.getCount();
                    if (count > 0) {
                        int min = Math.min(count, 32);
                        String[] strArr2 = new String[min];
                        for (int i = 0; e2.moveToNext() && i < min; i++) {
                            String string = e2.getString(0);
                            string.getClass();
                            strArr2[i] = string;
                        }
                        e2.close();
                        return strArr2;
                    }
                    e2.close();
                    return null;
                } finally {
                }
            } catch (SQLiteException e3) {
                m.n("query failure.", e3);
                return null;
            }
        }
        return null;
    }

    @Override // defpackage.wzs
    public final void af() {
        String format = String.format(Locale.US, "%s AND (%s IN (SELECT %s FROM part WHERE %s))", o, "_id", "mid", String.format(Locale.US, "((%s LIKE '%s') OR (%s LIKE '%s') OR (%s LIKE '%s') OR (%s='%s'))", "ct", "image/%", "ct", "video/%", "ct", "audio/%", "ct", "application/ogg"));
        mbm b = ((mce) this.v.b()).b("Bugle.Telephony.Query.PartsBulk.Latency");
        Cursor query = ao().query(Telephony.Mms.CONTENT_URI, new String[]{"_id"}, format, null, null);
        qxq.m(query);
        b.c();
        if (query != null) {
            long[] jArr = new long[query.getCount()];
            int i = 0;
            while (query.moveToNext()) {
                try {
                    int i2 = i + 1;
                    jArr[i] = query.getLong(0);
                    i = i2;
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            query.close();
            aC(jArr);
        }
    }

    @Override // defpackage.wzs
    public final Uri ag(Context context, Uri uri, int i, String str, String str2, long j, int i2, int i3, xhv xhvVar, Optional optional) {
        Uri uri2;
        xze xzeVar;
        Uri insert;
        aozb w;
        long cE = yyb.cE(xhvVar);
        try {
            ContentResolver contentResolver = context.getContentResolver();
            Long valueOf = Long.valueOf(j);
            xzeVar = m;
            xyo a = xzeVar.a();
            a.H("add message to uri.");
            a.j(str);
            a.l(i);
            a.z(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
            a.A("read", true);
            a.A("notified", true);
            a.x("status", i2);
            a.x(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, i3);
            try {
                a.z("subject", null);
                a.q();
                ContentValues contentValues = new ContentValues(7);
                contentValues.put("address", str);
                contentValues.put("date", valueOf);
                contentValues.put("read", (Integer) 1);
                contentValues.put("seen", (Integer) 1);
                if (((pph) this.ab.b()).a()) {
                    alhr alhrVar = vrf.a;
                    aozy createBuilder = vqa.a.createBuilder();
                    vqf vqfVar = vqf.a;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    vqa vqaVar = (vqa) createBuilder.b;
                    vqfVar.getClass();
                    vqaVar.d = vqfVar;
                    vqaVar.c = 4;
                    if (optional.isPresent()) {
                        w = aozb.w(ByteBuffer.allocate(16).putLong(r6.getMostSignificantBits()).putLong(((UUID) optional.get()).getLeastSignificantBits()).array());
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        vqa vqaVar2 = (vqa) createBuilder.b;
                        vqaVar2.b = 1 | vqaVar2.b;
                        vqaVar2.e = w;
                    }
                    contentValues.put("subject", vrf.e((vqa) createBuilder.s()));
                    uri2 = null;
                } else {
                    uri2 = null;
                    try {
                        contentValues.put("subject", (String) null);
                    } catch (SQLiteException e2) {
                        e = e2;
                        m.n("persist sms message failure", e);
                        return uri2;
                    } catch (IllegalArgumentException e3) {
                        e = e3;
                        m.n("persist sms message failure", e);
                        return uri2;
                    }
                }
                contentValues.put("body", str2);
                contentValues.put("sub_id", Integer.valueOf(i));
                if (i2 != -1) {
                    contentValues.put("status", (Integer) 0);
                }
                contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, Integer.valueOf(i3));
                if (cE != -1) {
                    contentValues.put("thread_id", Long.valueOf(cE));
                }
                mbm b = ((mce) this.v.b()).b("Bugle.Telephony.Insert.Sms.Latency");
                insert = contentResolver.insert(uri, contentValues);
                b.c();
            } catch (SQLiteException | IllegalArgumentException e4) {
                e = e4;
                uri2 = null;
            }
        } catch (SQLiteException | IllegalArgumentException e5) {
            e = e5;
            uri2 = null;
        }
        if (insert == null) {
            xyo a2 = xzeVar.a();
            a2.H("Cannot insert SMS message into telephony.");
            a2.x(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, i3);
            a2.q();
            return uri2;
        }
        Uri withAppendedId = ContentUris.withAppendedId(Telephony.Sms.CONTENT_URI, ContentUris.parseId(insert));
        xyo a3 = xzeVar.a();
        a3.H("Inserted SMS message into telephony.");
        a3.x(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, i3);
        a3.z("messageUri", insert);
        a3.z("result", withAppendedId);
        a3.y("threadId", cE);
        a3.q();
        this.Q.ifPresent(new vrw(17));
        return withAppendedId;
    }

    @Override // defpackage.wzs
    public final Uri ah(Context context, List list, MessageCoreData messageCoreData, aknw aknwVar, long j, int i, String str, long j2, byte[] bArr) {
        return aG(context, list, messageCoreData, aknwVar, j, i, str, j2, bArr, true);
    }

    @Override // defpackage.wzs
    public final gv ai(String[] strArr, MessageCoreData messageCoreData, aknw aknwVar, long j, int i, long j2, byte[] bArr) {
        int length;
        if (strArr != null && (length = strArr.length) > 0) {
            String[] strArr2 = new String[length];
            for (int i2 = 0; i2 < strArr.length; i2++) {
                String str = strArr[i2];
                if (new ysv(str).a) {
                    strArr2[i2] = str;
                } else if (str != null) {
                    int length2 = str.length();
                    StringBuilder sb = new StringBuilder(length2);
                    for (int i3 = 0; i3 < length2; i3++) {
                        char charAt = str.charAt(i3);
                        if (!Character.isLetterOrDigit(charAt) && charAt != '+' && charAt != '*') {
                            if (charAt == '#') {
                                charAt = '#';
                            }
                        }
                        sb.append(charAt);
                    }
                    strArr2[i2] = sb.toString();
                }
            }
            try {
                gv gvVar = new gv();
                qwm av = av((ryg) this.U.b(), messageCoreData.v());
                msk mskVar = (msk) this.l.b();
                Optional b = av.b();
                mskVar.getClass();
                Optional map = b.map(new qsb(mskVar, 19));
                if (map.isPresent()) {
                    String l = ((msh) map.get()).l(((Boolean) new mst(10).get()).booleanValue());
                    xyo d2 = m.d();
                    d2.H("createSendReq: from");
                    d2.j(l);
                    d2.q();
                    gvVar.b(new gi(albo.ag(l)));
                }
                gi[] f2 = gi.f(strArr2);
                if (f2 != null) {
                    gvVar.a.n(f2);
                }
                if (!TextUtils.isEmpty(messageCoreData.ap())) {
                    gvVar.i(new gi(messageCoreData.ap()));
                }
                gvVar.h(j2 / 1000);
                gvVar.b = (gqg) aknwVar.b;
                gvVar.a.h(aknwVar.a, 142);
                gvVar.a.j("personal".getBytes(), 138);
                gvVar.a.h(j, 136);
                gvVar.a.i(i, 143);
                gvVar.a.i(129, 134);
                gvVar.a.i(129, 144);
                if (messageCoreData.cI()) {
                    gvVar.g();
                }
                if (bArr != null) {
                    gvVar.j(bArr);
                    return gvVar;
                }
                return gvVar;
            } catch (gl e2) {
                ((alwl) ((alwl) ((alwl) e.h()).g(e2)).h("com/google/android/apps/messaging/shared/sms/TelephonyManagerInterfaceImpl", "createMmsSendReq", (char) 1640, "TelephonyManagerInterfaceImpl.java")).q("MmsException creating sendReq PDU");
                return null;
            }
        }
        throw new IllegalArgumentException("MMS sendReq no recipient");
    }

    @Override // defpackage.wzs
    public final Uri aj(Context context, List list, MessageCoreData messageCoreData, aknw aknwVar, long j, int i, String str, long j2) {
        return aG(context, list, messageCoreData, aknwVar, j, i, str, j2, null, false);
    }

    final int ak(Throwable th) {
        Throwable cause = th.getCause();
        if (cause != null) {
            return ak(cause);
        }
        String message = th.getMessage();
        if (message == null) {
            return 1;
        }
        if (message.contains("SmsSender: empty destination address")) {
            return 10010;
        }
        if (message.contains("SmsSender: empty text message")) {
            return 10011;
        }
        if (message.contains("SmsSender: fails to divide message")) {
            return 10012;
        }
        if (message.contains("Invalid destinationAddress")) {
            return 10000;
        }
        if (message.contains("Invalid message body")) {
            return 10001;
        }
        if (!message.contains("caught exception in sending")) {
            return 1;
        }
        return 10002;
    }

    @Override // defpackage.wzy
    public final int al() {
        return an() + am();
    }

    @Override // defpackage.wzy
    public final int am() {
        return aq(-1L, null, Telephony.Mms.CONTENT_URI);
    }

    @Override // defpackage.wzy
    public final int an() {
        return aq(-1L, null, Telephony.Sms.CONTENT_URI);
    }

    final ContentResolver ao() {
        return this.r.getContentResolver();
    }

    @Override // defpackage.wzs
    public final int b(long j) {
        ContentResolver ao = ao();
        return as(ao, Telephony.Sms.CONTENT_URI, String.format(Locale.US, "%s AND (%s<=%d)", n, "date", Long.valueOf(j)), null, "Bugle.Telephony.Delete.SmsBulk.Latency") + as(ao, Telephony.Mms.CONTENT_URI, String.format(Locale.US, "%s AND (%s<=%d)", o, "date", Long.valueOf(j / 1000)), null, "Bugle.Telephony.Delete.MmsBulk.Latency");
    }

    @Override // defpackage.wzs
    public final int c(ContentResolver contentResolver, String str, String str2) {
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("address", str2);
        int update = contentResolver.update(b.buildUpon().appendPath(str).build(), contentValues, null, null);
        aF();
        return update;
    }

    @Override // defpackage.wzs
    public final /* synthetic */ long d(Context context, String str) {
        return f(context, wym.a, str);
    }

    @Override // defpackage.wzs
    public final /* synthetic */ long e(Context context, java.util.Collection collection) {
        return g(context, wym.a, collection);
    }

    /* JADX WARN: Type inference failed for: r15v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [armf, java.lang.Object] */
    @Override // defpackage.wzs
    public final long f(Context context, wxs wxsVar, String str) {
        HashSet hashSet = new HashSet();
        hashSet.add(str);
        qxr qxrVar = (qxr) this.Y.b();
        ?? r2 = qxrVar.f;
        ?? r3 = qxrVar.b;
        ?? r4 = qxrVar.h;
        Function m329m = d$$ExternalSyntheticApiModelOutline0.m329m(qxrVar.e.b());
        m329m.getClass();
        ?? r6 = qxrVar.c;
        ?? r7 = qxrVar.a;
        ?? r8 = qxrVar.d;
        uac uacVar = (uac) qxrVar.g.b();
        uacVar.getClass();
        return i(context, wxsVar, hashSet, new qqq(r2, r3, r4, m329m, r6, r7, r8, uacVar, "TelephonyManagerInterfaceImpl#getOrCreateThreadId"));
    }

    @Override // defpackage.wzs
    public final long g(Context context, wxs wxsVar, java.util.Collection collection) {
        return i(context, wxsVar, collection, ((qxr) this.Y.b()).b());
    }

    @Override // defpackage.wzs
    public final long h(Context context, wxs wxsVar, String str, qqq qqqVar) {
        HashSet hashSet = new HashSet();
        hashSet.add(str);
        return i(context, wxsVar, hashSet, qqqVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0058 A[Catch: all -> 0x01fb, TRY_LEAVE, TryCatch #7 {all -> 0x01fb, blocks: (B:3:0x0014, B:5:0x0023, B:13:0x004e, B:15:0x0058, B:17:0x0052, B:28:0x0076, B:27:0x0073, B:29:0x0077, B:30:0x0089, B:32:0x008f, B:34:0x00a1, B:35:0x00a8, B:37:0x00b0, B:39:0x00b6, B:43:0x00bc, B:45:0x00d4, B:47:0x00e6, B:58:0x017e, B:65:0x01a7, B:50:0x01b7, B:51:0x01fa, B:75:0x01b6, B:74:0x01b3, B:69:0x01ad, B:21:0x006d, B:53:0x00f4, B:55:0x00fa, B:57:0x0105, B:61:0x0149, B:63:0x0157, B:64:0x0185, B:7:0x002f, B:9:0x0035, B:12:0x003e), top: B:2:0x0014, inners: #1, #2, #5, #6 }] */
    @Override // defpackage.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long i(android.content.Context r16, defpackage.wxs r17, java.util.Collection r18, defpackage.qqq r19) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wzw.i(android.content.Context, wxs, java.util.Collection, qqq):long");
    }

    @Override // defpackage.wzs
    public final long j(long j, long j2) {
        long j3;
        Cursor cursor;
        mbm b;
        int i;
        long j4 = 0;
        if (!((yjr) this.C.b()).y()) {
            xyo e2 = m.e();
            e2.H("Not default SMS app. Cannot set thread in Telephony DB to read status.");
            e2.y("threadId", j);
            e2.q();
            return 0L;
        }
        if (!((yjf) this.s.b()).m()) {
            xyo e3 = m.e();
            e3.H("No SMS permissions. Cannot set thread in Telephony DB to read status.");
            e3.y("threadId", j);
            e3.q();
            return 0L;
        }
        ContentResolver ao = ao();
        ContentValues contentValues = new ContentValues();
        contentValues.put("read", (Integer) 1);
        contentValues.put("seen", (Integer) 1);
        xze xzeVar = m;
        if (xzeVar.s(2)) {
            j3 = this.t.f().toEpochMilli();
            xzeVar.p("updateSmsReadStatus - starting");
            try {
                String ck = a.ck(j, "thread_id=");
                b = ((mce) this.v.b()).b("Bugle.Telephony.Query.Count.Latency");
                cursor = ao.query(Telephony.Sms.CONTENT_URI, null, ck, null, null);
            } catch (Throwable th) {
                th = th;
                cursor = null;
            }
            try {
                qxq.m(cursor);
                b.c();
                xyo d2 = xzeVar.d();
                d2.H("updateSmsReadStatus.");
                if (cursor != null) {
                    i = cursor.getCount();
                } else {
                    i = 0;
                }
                d2.x("sms count", i);
                d2.y("time", this.t.f().toEpochMilli() - j3);
                d2.q();
                if (cursor != null) {
                    cursor.close();
                }
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } else {
            j3 = 0;
        }
        String[] strArr = {Long.toString(j), Long.toString(j2)};
        mbm b2 = ((mce) this.v.b()).b("Bugle.Telephony.Update.FieldBulk.Latency");
        int aD = aD(ao, Telephony.Sms.CONTENT_URI, contentValues, strArr);
        b2.c();
        aF();
        if (xzeVar.s(2)) {
            j4 = this.t.f().toEpochMilli();
            xyo d3 = xzeVar.d();
            d3.H("updateSmsReadStatus - sms update time:");
            d3.G(j4 - j3);
            d3.q();
        }
        String[] strArr2 = {Long.toString(j), Long.toString(j2 / 1000)};
        mbm b3 = ((mce) this.v.b()).b("Bugle.Telephony.Update.FieldBulk.Latency");
        int aD2 = aD(ao, Telephony.Mms.CONTENT_URI, contentValues, strArr2);
        b3.c();
        aF();
        if (xzeVar.s(2)) {
            xyo d4 = xzeVar.d();
            d4.H("updateSmsReadStatus -mms update time:");
            d4.G(this.t.f().toEpochMilli() - j4);
            d4.q();
        }
        return aD + aD2;
    }

    @Override // defpackage.wzs
    public final Uri k(Context context, gt gtVar, int i, String str, long j, long j2, String str2) {
        long j3;
        if (j2 == 0) {
            ((mbl) this.O.b()).e("Bugle.Telephony.Timestamp0.Mms", 3);
            j3 = 0;
        } else {
            j3 = j2;
        }
        return aE(context, gtVar, i, str, j, j3, str2, false, null);
    }

    @Override // defpackage.wzs
    public final Uri l(Context context, gj gjVar, int i, String str, long j, Map map) {
        return au(context, gjVar, i, str, j, null, map);
    }

    @Override // defpackage.wzs
    public final Uri m(ryg rygVar, MessageCoreData messageCoreData, long j) {
        int i;
        Uri ag;
        Uri t = messageCoreData.t();
        if (t != null && ydk.z(t)) {
            return t;
        }
        String am = messageCoreData.am();
        if (am == null) {
            ag = null;
        } else {
            qwm av = av(rygVar, messageCoreData.v());
            if (av != null) {
                i = av.e();
            } else {
                i = -1;
            }
            int i2 = i;
            xhv a = ((ugy) this.I.b()).a(messageCoreData.z());
            ArrayList b = ((rus) this.H.b()).b(messageCoreData.z(), messageCoreData.ci());
            boolean z = true;
            albo.y(!b.isEmpty());
            if (b.size() != 1) {
                z = false;
            }
            albo.y(z);
            String str = (String) b.get(0);
            Context context = this.r;
            Uri uri = Telephony.Sms.CONTENT_URI;
            messageCoreData.aE();
            ag = ag(context, uri, i2, str, am, j, -1, 2, a, messageCoreData.Z());
        }
        if (ag == null) {
            xyo a2 = m.a();
            a2.H("moveFallbackMessageToSms fails to insert SMS message.");
            a2.z(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, t);
            a2.q();
            return t;
        }
        if (!messageCoreData.cJ()) {
            ay(t, ag, "move MMS to SMS.");
        }
        return ag;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0098, code lost:
    
        if (r2.toString().equals(r0.b) == false) goto L28;
     */
    @Override // defpackage.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.net.Uri n(defpackage.ryg r17, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r18) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wzw.n(ryg, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData):android.net.Uri");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wzs
    public final vqh o(Context context, Uri uri, int i, String str, String str2, Uri uri2, boolean z, long j, Bundle bundle, long j2) {
        Object obj;
        String str3;
        Object obj2;
        String str4;
        int i2;
        int i3;
        Object obj3;
        int i4;
        String uri3 = uri2.toString();
        if (TextUtils.isEmpty(uri3)) {
            m.m("Download from empty content location URL");
            return vqh.a(3, 0).a();
        }
        try {
            try {
                try {
                    try {
                        if (((yck) this.L.b()).q()) {
                            try {
                                if (uhl.k(uri2, context)) {
                                    xyo a = m.a();
                                    a.H("Reading MMS from dump file:");
                                    a.H(uri2);
                                    a.q();
                                    obj3 = "failed to download message";
                                    try {
                                        return p(context, uri, i, str, str2, uri3, z, j, wyq.a(((yck) this.L.b()).s(uri2.getPathSegments().get(1), context)), j2);
                                    } catch (wyr e2) {
                                        e = e2;
                                        obj2 = obj3;
                                        str4 = null;
                                        xyo b = m.b();
                                        b.H(obj2);
                                        b.H(uri);
                                        b.r(e);
                                        i2 = e.a;
                                        i3 = str4;
                                        return vqh.a(i2, i3).a();
                                    }
                                }
                            } catch (gk e3) {
                                e = e3;
                                obj = "failed to download message";
                                str3 = null;
                                xyo b2 = m.b();
                                b2.H(obj);
                                b2.H(uri);
                                b2.r(e);
                                i2 = 2;
                                i3 = str3;
                                return vqh.a(i2, i3).a();
                            } catch (wyr e4) {
                                e = e4;
                                obj3 = "failed to download message";
                            }
                        }
                        obj = "failed to download message";
                        try {
                            xze xzeVar = m;
                            xyo a2 = xzeVar.a();
                            a2.H("Downloading MMS.");
                            str3 = "notification message";
                            a2.z("notification message", uri);
                            a2.q();
                            try {
                                if (i >= 0) {
                                    bundle.putParcelable("notification_uri", uri);
                                    bundle.putInt("sub_id", i);
                                    bundle.putString("sub_phone_number", str);
                                    bundle.putString("transaction_id", str2);
                                    bundle.putString("content_location", uri3);
                                    bundle.putBoolean("auto_download", z);
                                    bundle.putLong("received_timestamp", j);
                                    wys wysVar = (wys) this.A.b();
                                    Uri parse = Uri.parse(uri3);
                                    Uri d2 = uhm.d(context);
                                    Intent b3 = wysVar.d.b(parse, d2, bundle, j2);
                                    lfl bc = ((mho) wysVar.e.b()).bc();
                                    if (bc != null) {
                                        i4 = 0;
                                        bc.h(0, d2);
                                    } else {
                                        i4 = 0;
                                    }
                                    gf gfVar = wysVar.f;
                                    b3.putExtra("mms_api", 1);
                                    xyo c2 = gf.a.c();
                                    c2.H("downloading MMS. ");
                                    c2.v(j2);
                                    c2.q();
                                    PendingIntent broadcast = PendingIntent.getBroadcast(context, i4, b3, yhy.a | VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS);
                                    int e5 = d.e(i);
                                    SmsManager smsManagerForSubscriptionId = SmsManager.getSmsManagerForSubscriptionId(e5);
                                    if (yhx.e) {
                                        smsManagerForSubscriptionId.downloadMultimediaMessage(context, uri3, d2, gfVar.a(e5), broadcast, j2);
                                    } else {
                                        smsManagerForSubscriptionId.downloadMultimediaMessage(context, uri3, d2, gfVar.a(e5), broadcast);
                                    }
                                    return vqh.a;
                                }
                                xzeVar.m("Incoming MMS came from unknown SIM");
                                throw new wyr(3, "Message from unknown SIM");
                            } catch (gk e6) {
                                e = e6;
                                xyo b22 = m.b();
                                b22.H(obj);
                                b22.H(uri);
                                b22.r(e);
                                i2 = 2;
                                i3 = str3;
                                return vqh.a(i2, i3).a();
                            } catch (wyr e7) {
                                e = e7;
                                obj2 = obj;
                                str4 = str3;
                                xyo b4 = m.b();
                                b4.H(obj2);
                                b4.H(uri);
                                b4.r(e);
                                i2 = e.a;
                                i3 = str4;
                                return vqh.a(i2, i3).a();
                            }
                        } catch (wyr e8) {
                            e = e8;
                            str3 = null;
                        }
                    } catch (gk e9) {
                        e = e9;
                    }
                } catch (wyr e10) {
                    e = e10;
                    obj = "failed to download message";
                    str3 = null;
                }
            } catch (gk e11) {
                e = e11;
                obj = "failed to download message";
                str3 = null;
            }
        } catch (wyr e12) {
            e = e12;
            obj2 = "failed to download message";
            str4 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    /* JADX WARN: Type inference failed for: r0v10, types: [msh, java.lang.Object] */
    @Override // defpackage.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.vqh p(android.content.Context r17, android.net.Uri r18, int r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, boolean r23, long r24, defpackage.gt r26, long r27) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wzw.p(android.content.Context, android.net.Uri, int, java.lang.String, java.lang.String, java.lang.String, boolean, long, gt, long):vqh");
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x02d3 A[Catch: Exception -> 0x02e3, TryCatch #2 {Exception -> 0x02e3, blocks: (B:15:0x006d, B:18:0x008f, B:20:0x0095, B:21:0x00a1, B:23:0x00d9, B:25:0x00e3, B:26:0x00ea, B:28:0x00f0, B:30:0x0100, B:32:0x0106, B:36:0x0121, B:37:0x0129, B:45:0x0143, B:48:0x014e, B:50:0x0154, B:56:0x0162, B:66:0x016b, B:67:0x0189, B:69:0x018f, B:71:0x019f, B:73:0x01a5, B:79:0x01ca, B:81:0x01ce, B:83:0x01fd, B:84:0x01f1, B:86:0x01c6, B:88:0x022c, B:90:0x0235, B:91:0x0245, B:104:0x02ab, B:111:0x02bb, B:112:0x02ca, B:113:0x02cb, B:114:0x02d2, B:115:0x02d3, B:116:0x02da, B:119:0x0185, B:120:0x02db, B:121:0x02e2, B:96:0x0252, B:98:0x026e, B:100:0x0283, B:101:0x027a, B:106:0x0286, B:108:0x028a, B:109:0x029c), top: B:14:0x006d, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018f A[Catch: Exception -> 0x02e3, TryCatch #2 {Exception -> 0x02e3, blocks: (B:15:0x006d, B:18:0x008f, B:20:0x0095, B:21:0x00a1, B:23:0x00d9, B:25:0x00e3, B:26:0x00ea, B:28:0x00f0, B:30:0x0100, B:32:0x0106, B:36:0x0121, B:37:0x0129, B:45:0x0143, B:48:0x014e, B:50:0x0154, B:56:0x0162, B:66:0x016b, B:67:0x0189, B:69:0x018f, B:71:0x019f, B:73:0x01a5, B:79:0x01ca, B:81:0x01ce, B:83:0x01fd, B:84:0x01f1, B:86:0x01c6, B:88:0x022c, B:90:0x0235, B:91:0x0245, B:104:0x02ab, B:111:0x02bb, B:112:0x02ca, B:113:0x02cb, B:114:0x02d2, B:115:0x02d3, B:116:0x02da, B:119:0x0185, B:120:0x02db, B:121:0x02e2, B:96:0x0252, B:98:0x026e, B:100:0x0283, B:101:0x027a, B:106:0x0286, B:108:0x028a, B:109:0x029c), top: B:14:0x006d, inners: #0 }] */
    /* JADX WARN: Type inference failed for: r0v21, types: [apwt, java.lang.Object] */
    @Override // defpackage.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.vqh q(defpackage.msh r28, java.lang.String r29, android.net.Uri r30, int r31, java.lang.String r32, boolean r33, com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r34, long r35) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wzw.q(msh, java.lang.String, android.net.Uri, int, java.lang.String, boolean, com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType, long):vqh");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
    /* JADX WARN: Type inference failed for: r0v9, types: [wyh] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // defpackage.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.wyb r(android.net.Uri r10, int r11) {
        /*
            r9 = this;
            java.lang.String r0 = r10.getAuthority()
            java.lang.String r1 = "sms"
            boolean r2 = r1.equals(r0)
            r3 = 1
            if (r2 != 0) goto L17
            java.lang.String r2 = "mms"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L16
            goto L17
        L16:
            r3 = 0
        L17:
            defpackage.xyl.k(r3)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L34
            java.lang.String[] r1 = defpackage.wyh.g(r9)
            armf r2 = r9.v
            java.lang.Object r2 = r2.b()
            mce r2 = (defpackage.mce) r2
            java.lang.String r3 = "Bugle.Telephony.Query.Sms.Latency"
            mbm r2 = r2.b(r3)
            r5 = r1
            goto L48
        L34:
            armf r1 = r9.v
            java.lang.String[] r2 = defpackage.wye.m()
            java.lang.Object r1 = r1.b()
            mce r1 = (defpackage.mce) r1
            java.lang.String r3 = "Bugle.Telephony.Query.Mms.Latency"
            mbm r1 = r1.b(r3)
            r5 = r2
            r2 = r1
        L48:
            r1 = 0
            android.content.Context r3 = r9.r     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L84
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L84
            r7 = 0
            r8 = 0
            r6 = 0
            r4 = r10
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L84
            defpackage.qxq.m(r10)     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> L9b
            r2.c()     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> L9b
            if (r10 == 0) goto L95
            boolean r2 = r10.moveToFirst()     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> L9b
            if (r2 == 0) goto L95
            if (r0 == 0) goto L77
            armf r0 = r9.Z     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> L9b
            java.lang.Object r0 = r0.b()     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> L9b
            wyj r0 = (defpackage.wyj) r0     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> L9b
            wyh r0 = r0.a()     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> L9b
            r0.f(r10, r11)     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> L9b
            goto L7b
        L77:
            wye r0 = defpackage.wye.g(r10, r11)     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> L9b
        L7b:
            r10.close()
            return r0
        L7f:
            r11 = move-exception
            goto L87
        L81:
            r10 = move-exception
            r11 = r10
            goto L9d
        L84:
            r10 = move-exception
            r11 = r10
            r10 = r1
        L87:
            xze r0 = defpackage.wzw.m     // Catch: java.lang.Throwable -> L9b
            xyo r0 = r0.b()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = "load telephony message failed"
            r0.H(r2)     // Catch: java.lang.Throwable -> L9b
            r0.r(r11)     // Catch: java.lang.Throwable -> L9b
        L95:
            if (r10 == 0) goto L9a
            r10.close()
        L9a:
            return r1
        L9b:
            r11 = move-exception
            r1 = r10
        L9d:
            if (r1 == 0) goto La2
            r1.close()
        La2:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wzw.r(android.net.Uri, int):wyb");
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00d7: MOVE (r8 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:216), block:B:42:0x00d7 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00da  */
    @Override // defpackage.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.wye s(android.net.Uri r12) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wzw.s(android.net.Uri):wye");
    }

    @Override // defpackage.wzs
    public final wzr t(Uri uri) {
        msh f2;
        ContentResolver ao = ao();
        Uri withAppendedPath = Uri.withAppendedPath(uri, "addr");
        alog alogVar = qkv.e;
        Cursor e2 = vcp.e(ao, withAppendedPath, (String[]) alogVar.toArray(new String[((alsx) alogVar).c]), "type=137 OR type=151 OR type=130", null, null);
        qxq.m(e2);
        alpr alprVar = new alpr();
        alpr alprVar2 = new alpr();
        alpr alprVar3 = new alpr();
        alpr alprVar4 = new alpr();
        if (e2 != null) {
            while (e2.moveToNext()) {
                try {
                    try {
                        f2 = ((wfh) this.N.b()).g(e2);
                    } catch (wyd e3) {
                        ((alwl) ((alwl) ((alwl) e.i()).g(e3)).h("com/google/android/apps/messaging/shared/sms/TelephonyManagerInterfaceImpl", "getRawMmsSenderAndRecipientsObject", (char) 4038, "TelephonyManagerInterfaceImpl.java")).q("Error loading MMS recipient from Telephony.");
                        f2 = ((msk) this.l.b()).f();
                    }
                    String ag = albo.ag(f2.m());
                    int i = e2.getInt(2);
                    if (i != 130) {
                        if (i != 137) {
                            if (i == 151) {
                                alprVar.c(ag);
                            }
                        } else {
                            alprVar3.c(ag);
                            alprVar4.c(f2);
                        }
                    } else {
                        alprVar2.c(ag);
                    }
                } finally {
                    e2.close();
                }
            }
        }
        return new wzr(alprVar3.g(), alprVar.g(), alprVar2.g(), alprVar4.g());
    }

    @Override // defpackage.wzs
    public final /* synthetic */ xaz u(long j, String str) {
        return w(wym.a, j, str);
    }

    @Override // defpackage.wzs
    public final /* synthetic */ xaz v(xhv xhvVar, String str) {
        return x(wym.a, xhvVar, str);
    }

    @Override // defpackage.wzs
    @Deprecated
    public final xaz w(wxs wxsVar, long j, String str) {
        return x(wxsVar, xhv.b(j), str);
    }

    @Override // defpackage.wzs
    @Deprecated
    public final xaz x(wxs wxsVar, xhv xhvVar, String str) {
        List I;
        boolean z;
        ((wxt) this.V.b()).a(wxsVar);
        String G = G(xhvVar);
        boolean T = T(xhvVar);
        if (TextUtils.isEmpty(G)) {
            if (((Boolean) c.e()).booleanValue()) {
                xyo e2 = m.e();
                e2.H("No recipient ids found using thread lookup, trying again with message lookup.");
                e2.z("threadId", xhvVar);
                e2.q();
                I = aw(str);
                if (!I.isEmpty()) {
                    ((mbl) this.O.b()).c("Bugle.Telephony.ThreadData.Recipients.UsedMessageInsteadOfThread");
                }
            } else {
                I = new ArrayList();
            }
        } else {
            I = I(G);
        }
        if (I.isEmpty()) {
            xyo e3 = m.e();
            e3.H("No recipients found.");
            e3.z("threadId", xhvVar);
            e3.q();
            ((mbl) this.O.b()).c("Bugle.Telephony.ThreadData.Recipients.Empty");
            return new xaz(yyb.cE(xhvVar), new ArrayList(), T);
        }
        if (((Boolean) d.e()).booleanValue() && az(I)) {
            ((mbl) this.O.b()).c("Bugle.Telephony.ThreadData.Recipients.EmptyRecipientString");
            alog aw = aw(str);
            int i = ((alsx) aw).c;
            int size = I.size();
            if (i == size) {
                z = true;
            } else {
                z = false;
            }
            if (i == size) {
                I = aw;
            }
            if (az(I)) {
                I = (alog) Collection.EL.stream(I).map(new wki(this, 15)).collect(alls.a);
            } else if (z) {
                ((mbl) this.O.b()).c("Bugle.Telephony.ThreadData.Recipients.UsedMessageToFixEmptyRecipient");
            }
        }
        if (I.size() == 1) {
            String j = ((msh) I.get(0)).j(((Boolean) new msn(18).get()).booleanValue());
            if (((vqq) this.x.b()).d(j) || ((vqq) this.x.b()).c(j)) {
                if (((Boolean) ((utz) vqu.a.get()).e()).booleanValue()) {
                    return ((vqm) this.y.b()).d(xhvVar, j, str);
                }
                return ((vqu) this.w.b()).j(yyb.cE(xhvVar), j, str);
            }
        }
        Stream map = Collection.EL.stream(I).map(new wmi(11));
        int i2 = alog.d;
        long h2 = ((wyt) this.z.b()).h(wxsVar, (List) map.collect(alls.a));
        if (h2 != -1) {
            xhvVar = xhv.b(h2);
        }
        return new xaz(yyb.cE(xhvVar), I, T);
    }

    @Override // defpackage.wzs
    public final akul y() {
        return akul.g(this.ad.l(Telephony.MmsSms.CONTENT_URI, new Bundle()));
    }

    @Override // defpackage.wzs
    public final Optional z(long j) {
        String F = F(j);
        if (F == null) {
            return Optional.empty();
        }
        return Optional.of(alog.n(I(F)));
    }
}
