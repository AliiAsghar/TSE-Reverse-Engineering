package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.provider.BlockedNumberContract;
import android.telephony.SubscriptionManager;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessPendingMessagesAction;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.ui.AsyncImageView;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import java.io.File;
import java.util.Set;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class wuo implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public wuo(AsyncImageView asyncImageView, int i) {
        this.b = i;
        this.a = asyncImageView;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [wve, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [msh, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        Object apply;
        Uri uri;
        byte[] bArr = null;
        int i = 20;
        int i2 = 12;
        int i3 = 17;
        int i4 = 0;
        int i5 = 1;
        switch (this.b) {
            case 0:
                wur wurVar = (wur) this.a;
                wurVar.c.remove(wurVar.a);
                return;
            case 1:
                ((vrn) ((xyt) ((wuh) this.a).b.b()).a()).o(vrk.NO_HINT);
                return;
            case 2:
                this.a.b();
                return;
            case 3:
                wvy wvyVar = (wvy) this.a;
                if (!wvyVar.f.getAndSet(true)) {
                    wvyVar.g = new wvx(wvyVar);
                    if (Build.VERSION.SDK_INT >= 30) {
                        adwq b = adwq.b(wvyVar.b);
                        try {
                            ((SubscriptionManager) b.a).addOnSubscriptionsChangedListener(wvyVar.c, wvyVar.g);
                        } catch (SecurityException e) {
                            throw new adwk("READ_PHONE_STATE permission is missing.", e);
                        }
                    } else {
                        adwq.b(wvyVar.b).e(wvyVar.g);
                    }
                    wvy.a.m().q("Registered onSubscriptionsChangedListener.");
                    return;
                }
                return;
            case 4:
                Object obj = this.a;
                ((yjy) ((xcd) obj).b.b()).n(new mjr(obj, 2));
                return;
            case 5:
                alwo alwoVar = xds.a;
                String n = this.a.n();
                if (n.isEmpty()) {
                    ((alvg) ((alvg) ptn.a.i()).h("com/google/android/apps/messaging/shared/chatapi/capabilities/cache/database/RcsCapabilitiesDatabaseOperations", "deleteRcsCapabilities", 339, "RcsCapabilitiesDatabaseOperations.java")).q("Failed to delete RCS capabilities from RcsRemoteCapabilitiesCacheTable, MSISDN is invalid");
                    return;
                }
                pts ptsVar = new pts();
                ptsVar.f("deleteRcsCapabilities");
                apply = new ptm(n, i4).apply(new ptx());
                ptsVar.a = new agpw((ptx) apply);
                ptsVar.d();
                return;
            case 6:
                sng sngVar = new sng();
                sngVar.aj("initializeIncrementalReverseSyncInTransaction-conversations");
                sngVar.af();
                sngVar.i(true);
                sngVar.X(new xdo(i2));
                sngVar.a().e();
                sya syaVar = new sya();
                syaVar.aj("initializeIncrementalReverseSyncInTransaction-messages");
                syaVar.g(true);
                syaVar.p();
                syaVar.P(new xdo(15));
                syaVar.a().e();
                ((xgw) this.a).b();
                return;
            case 7:
                sng sngVar2 = new sng();
                sngVar2.aj("initializeReverseSyncInTransaction-conversations");
                sngVar2.af();
                sngVar2.i(true);
                sngVar2.R(new xhv());
                sngVar2.X(new xdo(i3));
                sngVar2.a().e();
                sya syaVar2 = new sya();
                syaVar2.aj("initializeReverseSyncInTransaction-messages");
                syaVar2.g(true);
                syaVar2.a.putNull("sms_message_uri");
                syaVar2.aa("old_sms_message_uri", new agpk("sms_message_uri", new Object[0]));
                syaVar2.P(new xdo(18));
                syaVar2.a().e();
                tbt tbtVar = new tbt();
                tbtVar.aj("initializeReverseSyncInTransaction-parts");
                tbtVar.n(true);
                tbtVar.v(new xdo(19));
                tbtVar.af();
                tbtVar.a().e();
                ((xgw) this.a).b();
                return;
            case 8:
                ((xgw) this.a).c(1, Optional.empty());
                return;
            case 9:
                xng xngVar = (xng) this.a;
                if (!xngVar.f()) {
                    xng.a.q("Removing entire cache of sms/mms - missing sms/mms permission");
                    xngVar.b(0L);
                    return;
                }
                File[] listFiles = xngVar.a().listFiles();
                if (listFiles != null) {
                    while (i4 < listFiles.length) {
                        File file = listFiles[i4];
                        Matcher matcher = xng.b.matcher(file.getName());
                        if (matcher.matches()) {
                            String group = matcher.group(1);
                            albo.C(group);
                            if (PartsTable.a(group) == null && !xng.d(file)) {
                                xyo e2 = xng.a.e();
                                e2.H("Unable to delete orphaned file");
                                e2.z("fileName", file.getName());
                                e2.q();
                            }
                        }
                        i4++;
                    }
                    return;
                }
                return;
            case 10:
                xob xobVar = (xob) this.a;
                xot xotVar = (xot) xobVar.c.b();
                Duration ofMillis = Duration.ofMillis(((Long) xob.a.e()).longValue());
                aiut.b();
                d.t(!ofMillis.isNegative(), "duration should not be negative");
                alog alogVar = (alog) xotVar.c.c("updateRcsFileTransferToAutoResume", new ubu(xotVar.d.f(), ofMillis, i, bArr));
                alvw d = xob.b.d();
                d.X(alwp.a, "BugleFileTransfer");
                ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/transfer/FileTransferConnectionMonitor", "scheduleFileTransferResume", 120, "FileTransferConnectionMonitor.java")).t("Resume file transfers %s that paused by satellite", alogVar);
                if (!alogVar.isEmpty()) {
                    new ProcessPendingMessagesAction(9).w(0L);
                    return;
                }
                return;
            case 11:
                if (((AsyncImageView) this.a).a.g()) {
                    AsyncImageView asyncImageView = (AsyncImageView) this.a;
                    asyncImageView.c = (ufs) ((rra) asyncImageView.a.a()).k();
                }
                ((AsyncImageView) this.a).e();
                ((AsyncImageView) this.a).b();
                xtz xtzVar = ((AsyncImageView) this.a).d;
                if (xtzVar != null) {
                    xtzVar.c();
                    ((AsyncImageView) this.a).d = null;
                    return;
                }
                return;
            case 12:
                Object obj2 = this.a;
                akrh e3 = aktp.e("BlockedParticipantsUtil#copyBlockedParticipantsToSystem");
                try {
                    xyl.h();
                    taz e4 = ParticipantsTable.e();
                    e4.w("copyBlockedParticipantsToSystem");
                    e4.g(new xos(16));
                    e4.d(new xos(i3));
                    tav tavVar = (tav) e4.b().n();
                    try {
                        ContentValues contentValues = new ContentValues();
                        while (tavVar.moveToNext()) {
                            contentValues.clear();
                            contentValues.put("e164_number", tavVar.M());
                            contentValues.put("original_number", tavVar.P());
                            try {
                                ContentResolver contentResolver = ((xxe) obj2).d.getContentResolver();
                                uri = BlockedNumberContract.BlockedNumbers.CONTENT_URI;
                                contentResolver.insert(uri, contentValues);
                            } catch (SQLiteException e5) {
                                ((alwl) ((alwl) xxe.a.a(Level.SEVERE).g(e5)).h("com/google/android/apps/messaging/shared/util/block/BlockedParticipantsUtil", "copyBlockedParticipantsToSystem", 316, "BlockedParticipantsUtil.java")).q("copyBlockedParticipantsToSystem: inserting dupe?");
                            } catch (IllegalArgumentException e6) {
                                ((alwl) ((alwl) ((alwl) xxe.a.h()).g(e6)).h("com/google/android/apps/messaging/shared/util/block/BlockedParticipantsUtil", "copyBlockedParticipantsToSystem", (char) 318, "BlockedParticipantsUtil.java")).q("copyBlockedParticipantsToSystem: phone unexpectedly fails CTS and does not properly implement a ContentResolver at content://com.android.blockednumber/blocked");
                            }
                        }
                        tavVar.close();
                        e3.close();
                        return;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        e3.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 13:
                Collection.EL.forEach((Set) ((xyg) this.a).a.b(), new xet(13));
                return;
            case 14:
                Collection.EL.forEach((Set) ((xyg) this.a).a.b(), new xet(i2));
                return;
            case 15:
                FileHandler fileHandler = ((xza) this.a).d;
                if (fileHandler != null) {
                    fileHandler.close();
                    return;
                }
                return;
            case 16:
                ybg ybgVar = ((yaw) this.a).a;
                synchronized (ybgVar.i) {
                    Collection.EL.stream(ybgVar.h.values()).flatMap(new ybe(i4)).forEach(new ybf(ybgVar, i5));
                }
                return;
            case 17:
                ((zxf) ((ahjj) this.a).a).a();
                return;
            case 18:
                yav yavVar = (yav) this.a;
                for (ahjj ahjjVar : yavVar.m) {
                    ahjjVar.getClass();
                    qjb.a(new wuo(ahjjVar, i3), yavVar.h);
                }
                return;
            case 19:
                Object obj3 = this.a;
                synchronized (((ybd) obj3).g) {
                    ((ybd) obj3).e();
                }
                return;
            default:
                Object obj4 = this.a;
                synchronized (((ybd) obj4).g) {
                    ((ybd) obj4).h = new ybc((ybd) obj4, new xpw(obj4, i));
                    ((ybd) obj4).d();
                }
                return;
        }
    }

    public /* synthetic */ wuo(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
