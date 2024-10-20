package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaRecorder;
import android.net.Uri;
import android.provider.ContactsContract;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.DesugarArrays;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mig implements Callable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mig(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v125, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v134, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [alob] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r3v35, types: [java.lang.Object, ascc] */
    /* JADX WARN: Type inference failed for: r3v46, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [armf, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        rri rriVar;
        alog g;
        ?? r2;
        String str;
        Uri parse;
        int i;
        int i2;
        boolean z;
        int i3 = 2;
        int i4 = 5;
        Object obj = null;
        int i5 = 3;
        int i6 = 1;
        r6 = true;
        boolean z2 = true;
        boolean z3 = true;
        int i7 = 0;
        switch (this.b) {
            case 0:
                mii miiVar = (mii) this.a;
                acir a = miiVar.c.a(3, albo.cy(miiVar.a()));
                a.r(new mih(i7));
                return a;
            case 1:
                return ((mie) ((mic) this.a).F.b()).c().map(new mfk(8));
            case 2:
                Object obj2 = this.a;
                qnu qnuVar = (qnu) ((mkb) obj2).b.b();
                if (!((yjf) qnuVar.b.b()).f()) {
                    rriVar = null;
                } else {
                    rriVar = new rri((Context) qnuVar.a, ContactsContract.Contacts.CONTENT_STREQUENT_URI.buildUpon().appendQueryParameter("strequent_phone_only", "true").build(), qli.b, "account_type NOT IN (\"com.whatsapp\", \"com.google.android.apps.tachyon\") ", null, null);
                }
                if (rriVar == null) {
                    int i8 = alog.d;
                    return alsx.a;
                }
                alob alobVar = new alob();
                Cursor a2 = rriVar.a();
                if (a2 != null) {
                    try {
                        if (a2.moveToNext()) {
                            HashSet hashSet = new HashSet();
                            while (!a2.isAfterLast()) {
                                String string = a2.getString(3);
                                string.getClass();
                                while (hashSet.contains(string) && a2.moveToNext()) {
                                    string = a2.getString(3);
                                    string.getClass();
                                }
                                if (!a2.isAfterLast()) {
                                    long j = a2.getLong(0);
                                    String string2 = a2.getString(3);
                                    string2.getClass();
                                    hashSet.add(string2);
                                    if (mkb.c(a2)) {
                                        g = ((mkb) obj2).b(a2);
                                    } else {
                                        String ag = albo.ag(a2.getString(i6));
                                        String string3 = a2.getString(i3);
                                        alob alobVar2 = new alob();
                                        alobVar2.h(((mkb) obj2).d(a2));
                                        int i9 = -1;
                                        while (a2.moveToNext()) {
                                            String string4 = a2.getString(3);
                                            string4.getClass();
                                            if (string2.equals(string4)) {
                                                if (mkb.c(a2)) {
                                                    g = ((mkb) obj2).b(a2);
                                                } else {
                                                    alobVar2.h(((mkb) obj2).d(a2));
                                                }
                                            } else if (i9 == -1) {
                                                i9 = a2.getPosition();
                                            }
                                        }
                                        if (i9 >= 0) {
                                            a2.moveToPosition(i9);
                                        }
                                        if (ag.length() > 0) {
                                            r2 = true;
                                            str = ag.substring(0, 1);
                                        } else {
                                            r2 = true;
                                            str = ag;
                                        }
                                        alog g2 = alobVar2.g();
                                        if (string3 == null) {
                                            parse = null;
                                        } else {
                                            parse = Uri.parse(string3);
                                        }
                                        alobVar.h(mkh.a(j, string2, str, ag, g2, parse));
                                        i6 = r2;
                                        i3 = 2;
                                    }
                                    a2.close();
                                    return g;
                                }
                                g = alobVar.g();
                                a2.close();
                                return g;
                            }
                            g = alobVar.g();
                            a2.close();
                            return g;
                        }
                    } finally {
                    }
                }
                g = alsx.a;
                if (a2 == null) {
                    return g;
                }
                a2.close();
                return g;
            case 3:
                int i10 = mkg.g;
                ?? alobVar3 = new alob();
                HashSet hashSet2 = new HashSet();
                int i11 = 0;
                while (true) {
                    ?? r4 = this.a;
                    if (i11 < ((alsx) r4).c) {
                        alog alogVar = (alog) albo.bQ((akul) r4.get(i11));
                        int size = alogVar.size();
                        int i12 = 0;
                        while (true) {
                            i = i11 + 1;
                            if (i12 < size) {
                                mkl mklVar = (mkl) alogVar.get(i12);
                                if (hashSet2.add(mklVar.f())) {
                                    alobVar3.h(mklVar);
                                }
                                i12++;
                            }
                        }
                        i11 = i;
                    } else {
                        return alobVar3.g();
                    }
                }
                break;
            case 4:
                alwo alwoVar = mkt.a;
                ?? r0 = this.a;
                int size2 = r0.size();
                while (i7 < size2) {
                    Object bQ = albo.bQ((akul) r0.get(i7));
                    i7++;
                    if (bQ == mks.SUCCEEDED) {
                        return upm.b();
                    }
                }
                return upm.d();
            case 5:
                alvw g3 = mui.a.g();
                g3.X(alwp.a, "BugleMapi");
                alvg alvgVar = (alvg) g3;
                mui muiVar = (mui) this.a;
                alvgVar.X(ydl.q, muiVar.j);
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository", "getOldestUnreadMessageId", 573, "CoreBugleMessageRepository.java")).q("getOldestUnreadMessageId started");
                sxy a3 = ugz.a(muiVar.j.a);
                a3.e(new mtm(7));
                a3.h((atkn[]) mvg.a.c.toArray(new atkn[0]));
                a3.t(MessagesTable.c.a);
                a3.u(1);
                MessagesTable.BindData bindData = (MessagesTable.BindData) ((sxt) ((akip) muiVar.p.get()).b(a3).b().n()).cO();
                if (bindData != null) {
                    boolean z4 = muiVar.q;
                    MessageIdType A = bindData.A();
                    if (z4) {
                        String[] strArr = PartsTable.a;
                        obj = (MessageId) DesugarArrays.stream((PartsTable.BindData[]) bindData.au("parts", new PartsTable.BindData[0])).min(Comparator.CC.comparingInt(new kmb(i4))).map(new mtl(A, i4)).orElse(new CoreBugleMessageId(A, -1L));
                    } else {
                        obj = new CoreBugleMessageId(A, -1L);
                    }
                }
                alvw g4 = mui.a.g();
                g4.X(alwp.a, "BugleMapi");
                alvg alvgVar2 = (alvg) g4;
                alvgVar2.X(ydl.q, muiVar.j);
                ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository", "getOldestUnreadMessageId", 579, "CoreBugleMessageRepository.java")).t("getOldestUnreadMessageId completed. Returning: %s", obj);
                return obj;
            case 6:
                ConversationIdType conversationIdType = ((mvv) this.a).a.a;
                alog alogVar2 = ugz.a;
                akrh e = aktp.e("UnreadMessagesCountQuery#getUnreadConversationMessagesCount");
                try {
                    int i13 = ugz.a(conversationIdType).b().i();
                    e.close();
                    return Integer.valueOf(i13);
                } finally {
                }
            case 7:
                alwl alwlVar = (alwl) ney.b.g();
                ney neyVar = (ney) this.a;
                alwlVar.X(ydl.C, neyVar.d());
                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/RcsContactsRcsCapabilitiesSupplier", "getAsync", 123, "RcsContactsRcsCapabilitiesSupplier.java")).q("Retrieving Cached RCS Capabilities.");
                return neyVar.c.g(neyVar.d);
            case 8:
                Object obj3 = this.a;
                synchronized (ngv.class) {
                    if (((ngv) obj3).c != null) {
                        alvw d = ngv.a.d();
                        d.X(alwp.a, "Bugle");
                        ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/audio/LevelTrackingMediaRecorder", "trackingSoundLevel", 295, "LevelTrackingMediaRecorder.java")).q("start tracking sound level with recorder");
                        hgj hgjVar = ((ngv) obj3).d;
                        synchronized (ngv.class) {
                            MediaRecorder mediaRecorder = ((ngv) obj3).c;
                            if (mediaRecorder != null) {
                                i2 = Math.min(mediaRecorder.getMaxAmplitude() / 327, 100);
                            } else {
                                i2 = 0;
                            }
                            ?? r3 = hgjVar.a;
                            if (i2 >= 0 && i2 < 101) {
                                r3.h(new aggs(i2));
                            } else {
                                throw new IllegalArgumentException(a.cq(i2, " is an invalid AudioLevel. Should be between 0 and 100."));
                            }
                        }
                        z3 = false;
                    }
                }
                return Boolean.valueOf(z3);
            case 9:
                xyo a4 = prk.a.a();
                a4.H("Checking for pre-existing business info...");
                Object obj4 = this.a;
                a4.z("RBM bot id", obj4);
                a4.q();
                return (Boolean) teh.c((String) obj4, new prj(i6), new ngq(obj4, i4));
            case 10:
                xze xzeVar = prk.a;
                return prq.b((String) this.a);
            case 11:
                alvi alviVar = prq.a;
                return teh.a((String) this.a);
            case 12:
                return prq.b((String) this.a);
            case 13:
                ArrayList arrayList = new ArrayList();
                amio i14 = ((mho) ((psb) this.a).a.b()).i("last_rbm_active_event_time_millis");
                if (i14 == amio.EVENT_AGE_WITHIN_1_DAY) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && i14 != amio.EVENT_AGE_1_TO_7_DAYS) {
                    z2 = false;
                }
                xou xouVar = new xou((short[]) null);
                xouVar.j("IsRbm1DA");
                xouVar.k(String.valueOf(z));
                arrayList.add(xouVar.i());
                xou xouVar2 = new xou((short[]) null);
                xouVar2.j("IsRbm7DA");
                xouVar2.k(String.valueOf(z2));
                arrayList.add(xouVar2.i());
                return arrayList;
            case 14:
                aozy createBuilder = qej.a.createBuilder();
                String at = this.a.at();
                at.getClass();
                aozb z5 = aozb.z(at);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                qej qejVar = (qej) createBuilder.b;
                qejVar.b |= 2;
                qejVar.d = z5;
                aozy createBuilder2 = qel.a.createBuilder();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                apag apagVar = createBuilder2.b;
                qel qelVar = (qel) apagVar;
                qelVar.b |= 1;
                qelVar.c = "application";
                if (!apagVar.isMutable()) {
                    createBuilder2.u();
                }
                qel qelVar2 = (qel) createBuilder2.b;
                qelVar2.b = 2 | qelVar2.b;
                qelVar2.d = "vnd.gsma.botsuggestion.response.v1.0+json";
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                qej qejVar2 = (qej) createBuilder.b;
                qel qelVar3 = (qel) createBuilder2.s();
                qelVar3.getClass();
                qejVar2.c = qelVar3;
                qejVar2.b |= 1;
                return (qej) createBuilder.s();
            case 15:
                alwo alwoVar2 = pth.a;
                qei qeiVar = (qei) this.a;
                qeh b = qeh.b(qeiVar.c);
                if (b == null) {
                    b = qeh.UNKNOWN_TYPE;
                }
                if (!anfi.a("bugle.enable_rbm_bot_capabilities_fetch", "bugle")) {
                    d.s(b.equals(qeh.PHONE));
                }
                String str2 = qeiVar.d;
                d.t(!str2.isEmpty(), "Invalid MSISDN while trying to get RCS Capabilities from RcsRemoteCapabilitiesCacheTable");
                ptv ptvVar = new ptv(pty.a);
                ptvVar.w("getRcsCapabilities");
                ptvVar.c(new nfc(str2, 20));
                ptp ptpVar = (ptp) ((ptr) ptvVar.b().n()).cO();
                if (ptpVar == null) {
                    ((alvg) ((alvg) ptn.a.g()).h("com/google/android/apps/messaging/shared/chatapi/capabilities/cache/database/RcsCapabilitiesDatabaseOperations", "getRcsCapabilities", 111, "RcsCapabilitiesDatabaseOperations.java")).q("No RCS Capabilities found cached in database");
                    return Optional.empty();
                }
                pvm pvmVar = new pvm();
                pvmVar.i(ptpVar.d());
                pvmVar.h(ptpVar.e());
                return Optional.of(pvmVar.g());
            case 16:
                alwo alwoVar3 = pth.a;
                return ptn.b(this.a);
            case 17:
                snf e2 = sni.e();
                e2.w("isMessageForMissingGroupConversation");
                e2.f(new qcq(i7));
                e2.h(new qcr(this.a, i7));
                return Boolean.valueOf(e2.b().f().isEmpty());
            case 18:
                return (alor) Collection.EL.stream(((usk) this.a).a.entrySet()).collect(alls.a(new qcq(i5), new qcq(4)));
            case 19:
                return ((qrk) this.a).b();
            default:
                Object obj5 = this.a;
                akrh e3 = aktp.e("DatabaseHelperBasic#doInitialization");
                try {
                    ((uci) ((qxn) obj5).i.get()).getClass();
                    SQLiteDatabase a5 = ((qxn) obj5).a();
                    akrh e4 = aktp.e("DatabaseHelperBasic#initPlugins");
                    if (a5 != null) {
                        try {
                            uco[] ucoVarArr = ((uci) ((qxn) obj5).i.get()).g;
                            int length = ucoVarArr.length;
                            while (i7 < length) {
                                ucoVarArr[i7].m(a5);
                                i7++;
                            }
                        } finally {
                        }
                    }
                    e4.close();
                    e3.close();
                    return a5;
                } finally {
                }
        }
    }
}
