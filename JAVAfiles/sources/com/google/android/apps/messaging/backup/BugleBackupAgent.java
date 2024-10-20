package com.google.android.apps.messaging.backup;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.telephony.SubscriptionManager;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import defpackage.aegr;
import defpackage.aetn;
import defpackage.agnq;
import defpackage.ahiy;
import defpackage.aiut;
import defpackage.akrc;
import defpackage.aksr;
import defpackage.aktp;
import defpackage.akul;
import defpackage.alok;
import defpackage.alor;
import defpackage.alpt;
import defpackage.altc;
import defpackage.altx;
import defpackage.alvg;
import defpackage.alvi;
import defpackage.alvw;
import defpackage.alwp;
import defpackage.anen;
import defpackage.ansy;
import defpackage.apct;
import defpackage.apds;
import defpackage.asho;
import defpackage.bl$$ExternalSyntheticApiModelOutline0;
import defpackage.ich;
import defpackage.ici;
import defpackage.icj;
import defpackage.ick;
import defpackage.idk;
import defpackage.iew;
import defpackage.ijq;
import defpackage.mla;
import defpackage.nau;
import defpackage.njw;
import defpackage.nys;
import defpackage.nzc;
import defpackage.puy;
import defpackage.qda;
import defpackage.qic;
import defpackage.qid;
import defpackage.qif;
import defpackage.qig;
import defpackage.qiu;
import defpackage.qlf;
import defpackage.qyo;
import defpackage.utz;
import defpackage.xxy;
import defpackage.xyc;
import defpackage.xyl;
import defpackage.yht;
import defpackage.yhu;
import defpackage.yjy;
import defpackage.ykw;
import defpackage.ykz;
import defpackage.yyb;
import defpackage.znj;
import defpackage.zxy;
import j$.util.Optional;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class BugleBackupAgent extends aegr {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/backup/BugleBackupAgent");
    public ykw b;
    public yjy c;
    public qyo d;
    public qif e;
    public anen f;
    public anen g;
    public zxy h;
    public ahiy i;
    public ansy j;
    private yhu m;
    private idk n;
    private nys o;
    private nzc p;
    private aksr q;
    private iew s;
    private znj t;
    private final Object k = new Object();
    private Set l = null;
    private boolean r = false;

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public interface a {
        Optional a();
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public interface b {
        aksr a();

        idk c();

        nys d();

        nzc e();

        qif f();

        qyo g();

        yhu h();

        yjy i();

        ykw j();

        anen k();

        anen l();

        void m();

        iew n();

        zxy o();

        ahiy p();

        ansy q();

        znj r();
    }

    private final void k() {
        Set set = this.l;
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            e((String) it.next());
        }
        this.l = null;
    }

    private final void l() {
        synchronized (this.k) {
            if (!this.r) {
                b bVar = (b) yyb.aL(b.class);
                this.b = bVar.j();
                this.m = bVar.h();
                this.t = bVar.r();
                this.c = bVar.i();
                this.h = bVar.o();
                this.n = bVar.c();
                this.s = bVar.n();
                this.d = bVar.g();
                this.e = bVar.f();
                this.f = bVar.k();
                this.g = bVar.l();
                this.j = bVar.q();
                this.i = bVar.p();
                this.o = bVar.d();
                this.p = bVar.e();
                this.q = bVar.a();
                this.r = true;
                bVar.m();
                alvw g = a.g();
                g.X(alwp.a, "BugleBackup");
                ((alvg) ((alvg) g).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "init", 194, "BugleBackupAgent.java")).q("Dependencies initialized.");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, wul] */
    private final void m() {
        int bh;
        alvw g = a.g();
        g.X(alwp.a, "BugleBackup");
        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "restoreCmsTimestamp", 534, "BugleBackupAgent.java")).q("Restoring CmsTimestamp.");
        String f = this.b.f(getString(R.string.cms_d2d_timestamp_pref_key), null);
        if (f != null) {
            try {
                qif qifVar = this.e;
                apct apctVar = apds.a;
                int indexOf = f.indexOf(84);
                if (indexOf != -1) {
                    int indexOf2 = f.indexOf(90, indexOf);
                    if (indexOf2 == -1) {
                        indexOf2 = f.indexOf(43, indexOf);
                    }
                    if (indexOf2 == -1) {
                        indexOf2 = f.indexOf(45, indexOf);
                    }
                    if (indexOf2 != -1) {
                        String substring = f.substring(0, indexOf2);
                        String str = "";
                        int indexOf3 = substring.indexOf(46);
                        if (indexOf3 != -1) {
                            String substring2 = substring.substring(0, indexOf3);
                            str = substring.substring(indexOf3 + 1);
                            substring = substring2;
                        }
                        long time = ((SimpleDateFormat) apds.c.get()).parse(substring).getTime() / 1000;
                        if (str.isEmpty()) {
                            bh = 0;
                        } else {
                            bh = aetn.bh(str);
                        }
                        if (f.charAt(indexOf2) == 'Z') {
                            if (f.length() != indexOf2 + 1) {
                                throw new ParseException("Failed to parse timestamp: invalid trailing data \"" + f.substring(indexOf2) + "\"", 0);
                            }
                        } else {
                            String substring3 = f.substring(indexOf2 + 1);
                            int indexOf4 = substring3.indexOf(58);
                            if (indexOf4 != -1) {
                                try {
                                    long parseLong = ((Long.parseLong(substring3.substring(0, indexOf4)) * 60) + Long.parseLong(substring3.substring(indexOf4 + 1))) * 60;
                                    if (f.charAt(indexOf2) == '+') {
                                        time -= parseLong;
                                    } else {
                                        time += parseLong;
                                    }
                                } catch (NumberFormatException e) {
                                    ParseException parseException = new ParseException("Invalid offset value: ".concat(String.valueOf(substring3)), 0);
                                    parseException.initCause(e);
                                    throw parseException;
                                }
                            } else {
                                throw new ParseException("Invalid offset value: ".concat(String.valueOf(substring3)), 0);
                            }
                        }
                        try {
                            apct d = apds.d(time, bh);
                            aiut.b();
                            qifVar.b.get().m(new puy(d, 18));
                            return;
                        } catch (IllegalArgumentException e2) {
                            ParseException parseException2 = new ParseException("Failed to parse timestamp " + f + " Timestamp is out of range.", 0);
                            parseException2.initCause(e2);
                            throw parseException2;
                        }
                    }
                    throw new ParseException("Failed to parse timestamp: missing valid timezone offset.", 0);
                }
                throw new ParseException("Failed to parse timestamp: invalid timestamp \"" + f + "\"", 0);
            } catch (ParseException e3) {
                alvw i = a.i();
                i.X(alwp.a, "BugleBackup");
                ((alvg) ((alvg) ((alvg) i).g(e3)).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "restoreCmsTimestamp", (char) 541, "BugleBackupAgent.java")).q("Failed to parse timestamp. Skipping restore the D2D Value");
            }
        }
    }

    private final void n(boolean z) {
        alvw g = a.g();
        g.X(alwp.a, "BugleBackup");
        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "setEnableOptimizedRestoreWithD2dFlag", 381, "BugleBackupAgent.java")).t("Writing D2d flag value %s to preferences.", Boolean.valueOf(z));
        this.b.h(getString(R.string.cms_d2d_flag_pref_key), z);
    }

    private final void o() {
        n(true);
        Boolean bool = false;
        try {
            bool = (Boolean) a().i(new ici(this, 1), this.g).i(new ici(this, 0), this.g).get(((Integer) xxy.k.e()).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            alvw i = a.i();
            i.X(alwp.a, "BugleBackup");
            ((alvg) ((alvg) ((alvg) i).g(e)).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "setOptimizedRestoreWithD2dValues", (char) 369, "BugleBackupAgent.java")).q("Failed to completely set D2d values for Optimized Restore");
        }
        if (bool.booleanValue()) {
            alvw g = a.g();
            g.X(alwp.a, "BugleBackup");
            ((alvg) ((alvg) g).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "setOptimizedRestoreWithD2dValues", 373, "BugleBackupAgent.java")).q("Successfully set optimized CMS Restore Settings");
        } else {
            alvw g2 = a.g();
            g2.X(alwp.a, "BugleBackup");
            ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "setOptimizedRestoreWithD2dValues", 375, "BugleBackupAgent.java")).q("Failed to set optimized CMS Restore Settings");
        }
    }

    final akul a() {
        return this.d.a().i(new ici(this, 2), this.f).h(new icj(this, 1), this.f);
    }

    final Map b() {
        l();
        if (SubscriptionManager.from(this) == null) {
            alvw i = a.i();
            i.X(alwp.a, "BugleBackup");
            ((alvg) ((alvg) i).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "buildSubscriptionBackupPreferenceMap", 724, "BugleBackupAgent.java")).q("Couldn't get a subscription manager. Per-subscription preferences won't be backed up/restored.");
            return altc.a;
        }
        try {
            Charset forName = Charset.forName("UTF-8");
            alok alokVar = new alok();
            this.c.n(new ick(this, forName, alokVar));
            return alokVar.b();
        } catch (UnsupportedCharsetException e) {
            xyl.p("Device doesn't support UTF-8 encoding. Per-subscription preferences won't be backed up/restored.", e);
            return altc.a;
        }
    }

    @Override // defpackage.aegr
    protected final Map c() {
        l();
        alok alokVar = new alok();
        alokVar.h(this.b.a(), ich.a(this, new altx(this.n)));
        ykz b2 = ich.b(this);
        Set set = this.l;
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                alokVar.h((String) it.next(), b2);
            }
        }
        return alokVar.b();
    }

    final void d(String str, String str2) {
        l();
        alvw d = a.d();
        d.X(alwp.a, "BugleBackup");
        ((alvg) ((alvg) d).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "copyPreferences", 786, "BugleBackupAgent.java")).D("Copying shared preferences from \"%s\" to \"%s\".", str, str2);
        SharedPreferences sharedPreferences = getSharedPreferences(str, 0);
        SharedPreferences.Editor edit = getSharedPreferences(str2, 0).edit();
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                i(edit, entry.getKey(), value);
            }
        }
        edit.apply();
    }

    final void e(String str) {
        l();
        alvi alviVar = a;
        alvw d = alviVar.d();
        d.X(alwp.a, "BugleBackup");
        ((alvg) ((alvg) d).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "deletePreferences", 803, "BugleBackupAgent.java")).t("Deleting shared preferences \"%s\".", str);
        if (!getSharedPreferences(str, 0).edit().clear().commit()) {
            alvw i = alviVar.i();
            i.X(alwp.a, "BugleBackup");
            ((alvg) ((alvg) i).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "deletePreferences", 808, "BugleBackupAgent.java")).t("Failed to clear shared preferences \"%s\".", str);
        }
        if (!deleteSharedPreferences(str)) {
            alvw i2 = alviVar.i();
            i2.X(alwp.a, "BugleBackup");
            ((alvg) ((alvg) i2).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "deletePreferencesFile", 816, "BugleBackupAgent.java")).t("Failed to delete shared preferences \"%s\".", str);
        }
    }

    final void f() {
        try {
            ((Boolean) a().get(((Integer) xxy.j.e()).intValue(), TimeUnit.MILLISECONDS)).booleanValue();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            alvw i = a.i();
            i.X(alwp.a, "BugleBackup");
            ((alvg) ((alvg) ((alvg) i).g(e)).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "writeAccountNameToPreferencesSync", (char) 295, "BugleBackupAgent.java")).q("Failed to set gaia user id. Skipping backing up BnR Account and setting the D2D value\"");
        }
    }

    @Override // defpackage.aegr
    protected final void g(Set set) {
        l();
        alvw g = a.g();
        g.X(alwp.a, "BugleBackup");
        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "onPreferencesRestored", 677, "BugleBackupAgent.java")).q("onPreferencesRestored started.");
        Map b2 = b();
        int i = 0;
        int i2 = 0;
        for (Map.Entry entry : ((alor) b2).entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (set.contains(str2)) {
                d(str2, str);
                i2++;
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (str3.startsWith("bugleuniqsub_")) {
                e(str3);
                i++;
            }
        }
        alvi alviVar = a;
        alvw g2 = alviVar.g();
        g2.X(alwp.a, "BugleBackup");
        ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "restoreSubscriptionPreferences", 707, "BugleBackupAgent.java")).r("Backup data for %d SIM card(s) was retrieved from the cloud.", i);
        alvw g3 = alviVar.g();
        g3.X(alwp.a, "BugleBackup");
        ((alvg) ((alvg) g3).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "restoreSubscriptionPreferences", 709, "BugleBackupAgent.java")).u("%d out of %d active SIM card(s) was/were restored.", i2, ((altc) b2).d);
        alvw g4 = alviVar.g();
        g4.X(alwp.a, "BugleBackup");
        ((alvg) ((alvg) g4).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "onPreferencesRestored", 680, "BugleBackupAgent.java")).q("onPreferencesRestored finished.");
    }

    @Override // defpackage.aegr, android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public final void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) {
        int transportFlags;
        NotificationChannel e;
        boolean shouldVibrate;
        Uri sound;
        Uri sound2;
        String uri;
        alvi alviVar = a;
        alvw g = alviVar.g();
        g.X(alwp.a, "BugleBackup");
        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "onBackup", BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED, "BugleBackupAgent.java")).q("onBackup started.");
        l();
        this.s.b(2);
        l();
        alvw g2 = alviVar.g();
        g2.X(alwp.a, "BugleBackup");
        ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "writeDefaultNotificationChannelToPreferences", 254, "BugleBackupAgent.java")).q("Writing default notification settings to preferences.");
        boolean h = this.m.h(true);
        this.b.h(getString(R.string.notifications_enabled_pref_key), h);
        if (h && (e = this.m.e()) != null) {
            ykw ykwVar = this.b;
            String string = getString(R.string.notification_vibration_pref_key);
            shouldVibrate = e.shouldVibrate();
            ykwVar.h(string, shouldVibrate);
            sound = e.getSound();
            if (sound != null) {
                sound2 = e.getSound();
                uri = sound2.toString();
            } else {
                uri = null;
            }
            this.b.l(getString(R.string.notification_sound_pref_key), uri);
        }
        xyl.i(this.l);
        Map b2 = b();
        alor alorVar = (alor) b2;
        for (Map.Entry entry : alorVar.entrySet()) {
            d((String) entry.getKey(), (String) entry.getValue());
        }
        alvi alviVar2 = a;
        alvw g3 = alviVar2.g();
        g3.X(alwp.a, "BugleBackup");
        ((alvg) ((alvg) g3).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "createSubscriptionBackupPreferences", 633, "BugleBackupAgent.java")).r("%d active SIM card(s) will be backed up.", ((altc) b2).d);
        this.l = alpt.o(alorVar.values());
        if (((ansy) ((njw) this.p).a.b()).e("bugle.enable_optimized_restore_with_d2d")) {
            qig b3 = qig.b(this.e.a().e);
            if (b3 == null) {
                b3 = qig.INITIAL_SYNC_STATUS_NOT_SET;
            }
            if (b3 == qig.COMPLETE) {
                alvw g4 = alviVar2.g();
                g4.X(alwp.a, "BugleBackup");
                ((alvg) ((alvg) g4).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "onBackup", 216, "BugleBackupAgent.java")).q("CMS Initial Sync is complete, setting optimized restore values");
                o();
            } else {
                alvw g5 = alviVar2.g();
                g5.X(alwp.a, "BugleBackup");
                ((alvg) ((alvg) g5).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "onBackup", 219, "BugleBackupAgent.java")).q("CMS Initial Sync is not complete, clearing optimized restore values.");
                n(false);
                this.b.n(getString(R.string.prior_to_d2d_device_id_pref_key));
                this.b.n(getString(R.string.bnr_gaia_account_user_id_pref_key));
                this.b.n(getString(R.string.cms_d2d_timestamp_pref_key));
            }
        }
        if (this.o.a() && Build.VERSION.SDK_INT >= 28 && backupDataOutput != null) {
            transportFlags = backupDataOutput.getTransportFlags();
            if ((transportFlags & 1) != 0) {
                akrc b4 = this.q.b("writeCmsSettingsToPreferences");
                try {
                    try {
                        qid qidVar = (qid) this.e.d().get();
                        ykw ykwVar2 = this.b;
                        String string2 = getString(R.string.bnr_enabled_status_pref_key);
                        qic b5 = qic.b(qidVar.l);
                        if (b5 == null) {
                            b5 = qic.UNSPECIFIED_STATUS;
                        }
                        ykwVar2.j(string2, b5.h);
                        ykw ykwVar3 = this.b;
                        String string3 = getString(R.string.multi_device_enabled_status_pref_key);
                        qic b6 = qic.b(qidVar.j);
                        if (b6 == null) {
                            b6 = qic.UNSPECIFIED_STATUS;
                        }
                        ykwVar3.j(string3, b6.h);
                    } catch (InterruptedException | ExecutionException e2) {
                        alvw i = a.i();
                        i.X(alwp.a, "BugleBackup");
                        ((alvg) ((alvg) ((alvg) i).g(e2)).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "writeCmsEnabledStatusToPreferencesSync", (char) 283, "BugleBackupAgent.java")).q("Failed to get cms settings data. Skipping backing up Cms related enabled statuses");
                    }
                    f();
                    b4.close();
                } finally {
                }
            }
        }
        try {
            super.onBackup(parcelFileDescriptor, backupDataOutput, parcelFileDescriptor2);
            k();
            if (this.o.a()) {
                alvw g6 = a.g();
                g6.X(alwp.a, "BugleBackup");
                ((alvg) ((alvg) g6).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "onBackup", 239, "BugleBackupAgent.java")).q("onBackup finished.");
            } else {
                alvw g7 = a.g();
                g7.X(alwp.a, "BugleBackup");
                ((alvg) ((alvg) g7).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "onBackup", 241, "BugleBackupAgent.java")).q("onBackup finished.");
            }
        } catch (Throwable th) {
            k();
            if (this.o.a()) {
                alvw g8 = a.g();
                g8.X(alwp.a, "BugleBackup");
                ((alvg) ((alvg) g8).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "onBackup", 239, "BugleBackupAgent.java")).q("onBackup finished.");
                throw th;
            }
            alvw g9 = a.g();
            g9.X(alwp.a, "BugleBackup");
            ((alvg) ((alvg) g9).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "onBackup", 241, "BugleBackupAgent.java")).q("onBackup finished.");
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, wul] */
    /* JADX WARN: Type inference failed for: r11v30, types: [java.lang.Object, wul] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, wul] */
    /* JADX WARN: Type inference failed for: r7v28, types: [java.lang.Object, wul] */
    @Override // defpackage.aegr, android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public final void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) {
        List notificationChannels;
        List notificationChannels2;
        String group;
        String id;
        akul ag;
        super.onRestore(backupDataInput, i, parcelFileDescriptor);
        l();
        this.s.b(3);
        l();
        alvw g = a.g();
        g.X(alwp.a, "BugleBackup");
        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "restoreNotificationChannels", 558, "BugleBackupAgent.java")).q("Restoring notification channels.");
        if (this.m.e() == null) {
            if (this.b.q(getString(R.string.notifications_enabled_pref_key), getResources().getBoolean(R.bool.notifications_enabled_pref_default))) {
                this.m.a(this.t.n(), this.b.f(getString(R.string.notification_sound_pref_key), null));
            }
        } else {
            yhu yhuVar = this.m;
            notificationChannels = ((NotificationManager) yhuVar.a.b()).getNotificationChannels();
            if (notificationChannels != null) {
                notificationChannels2 = ((NotificationManager) yhuVar.a.b()).getNotificationChannels();
                ArrayList arrayList = new ArrayList(notificationChannels2);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    NotificationChannel m = bl$$ExternalSyntheticApiModelOutline0.m(arrayList.get(i2));
                    group = m.getGroup();
                    if (TextUtils.equals(group, yht.CONVERSATIONS.e)) {
                        NotificationManager notificationManager = (NotificationManager) yhuVar.a.b();
                        id = m.getId();
                        notificationManager.deleteNotificationChannel(id);
                    }
                }
            }
        }
        int i3 = 9;
        int i4 = 1;
        if (this.b.q(getString(R.string.cms_d2d_flag_pref_key), false)) {
            qif qifVar = this.e;
            aiut.b();
            qifVar.b.get().m(new qda(i3));
            qifVar.d.set(asho.UNKNOWN_CLOUD_SYNC_STATUS);
            qifVar.e();
            alvi alviVar = a;
            alvw g2 = alviVar.g();
            g2.X(alwp.a, "BugleBackup");
            ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "restorePriorToCmsGaiaId", 511, "BugleBackupAgent.java")).q("Restoring gaia Id.");
            String f = this.b.f(getString(R.string.bnr_gaia_account_user_id_pref_key), null);
            if (f != null) {
                qif qifVar2 = this.e;
                aiut.b();
                qifVar2.b.get().m(new puy(f, 19));
            }
            alvw g3 = alviVar.g();
            g3.X(alwp.a, "BugleBackup");
            ((alvg) ((alvg) g3).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "restorePriorToDeviceId", 520, "BugleBackupAgent.java")).q("Restoring priorToDeviceId.");
            String f2 = this.b.f(getString(R.string.prior_to_d2d_device_id_pref_key), null);
            if (f2 != null) {
                alvw g4 = alviVar.g();
                g4.X(alwp.a, "BugleBackup");
                ((alvg) ((alvg) g4).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "restorePriorToDeviceId", 524, "BugleBackupAgent.java")).t("Restoring priorToDeviceId with device id: %s", f2);
                qif qifVar3 = this.e;
                aiut.b();
                qifVar3.b.get().m(new qlf(f2, i4));
            } else {
                alvw g5 = alviVar.g();
                g5.X(alwp.a, "BugleBackup");
                ((alvg) ((alvg) g5).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "restorePriorToDeviceId", 529, "BugleBackupAgent.java")).q("Device Id is empty. Skipping restoring of priorToD2dDeviceId");
            }
            m();
        }
        if (this.o.a() && Build.VERSION.SDK_INT >= 28) {
            akrc b2 = this.q.b("restoreCmsSettingsToPreferences");
            try {
                alvi alviVar2 = a;
                alvw g6 = alviVar2.g();
                g6.X(alwp.a, "BugleBackup");
                ((alvg) ((alvg) g6).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "restoreLinkedAccount", 583, "BugleBackupAgent.java")).q("Restoring linked account.");
                String f3 = this.b.f(getString(R.string.bnr_gaia_account_user_id_pref_key), null);
                if (f3 != null) {
                    ag = akul.g(this.i.D()).h(new ijq(this, f3, i4), this.f);
                } else {
                    ag = aktp.ag(null);
                }
                qiu.h(ag);
                alvw g7 = alviVar2.g();
                g7.X(alwp.a, "BugleBackup");
                ((alvg) ((alvg) g7).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "restoreCmsEnabledStatuses", 606, "BugleBackupAgent.java")).q("Restoring cms enabled statuses.");
                qic b3 = qic.b(this.b.d(getString(R.string.bnr_enabled_status_pref_key), 0));
                if (b3 != null) {
                    this.e.f(b3);
                }
                qic b4 = qic.b(this.b.d(getString(R.string.multi_device_enabled_status_pref_key), 0));
                if (b4 != null) {
                    qif qifVar4 = this.e;
                    aiut.b();
                    qifVar4.b.get().m(new puy(b4, 20));
                    qifVar4.f.w(b4);
                    qifVar4.e();
                    if (xxy.a() && ((Boolean) ((utz) xyc.a.get()).e()).booleanValue()) {
                        ((agnq) qifVar4.c.b()).h(new mla(i3), "CmsSettingsDataService#notifyAppSettingsUi", new nau(qifVar4, 8));
                    }
                }
                b2.close();
            } catch (Throwable th) {
                try {
                    b2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }
}
