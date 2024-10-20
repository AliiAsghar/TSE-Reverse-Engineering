package defpackage;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.telephony.SubscriptionManager;
import android.text.TextUtils;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qxg extends ContentProvider {
    private static final alwo a = alwo.o("Bugle");
    private final UriMatcher b = new UriMatcher(-1);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        armf LI();

        yyz Qe();

        lpg Sm();

        aksr a();

        mel ad();

        mfc ae();

        xhq fK();

        ydq gg();

        yep gh();

        yjr gk();

        yla gm();
    }

    static final void a(PrintWriter printWriter, String str, String str2) {
        printWriter.println(str.concat(":"));
        printWriter.println(str2);
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("Delete not supported: ".concat(String.valueOf(String.valueOf(uri))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.io.FileDescriptor] */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r18v13 */
    /* JADX WARN: Type inference failed for: r18v14 */
    /* JADX WARN: Type inference failed for: r18v15 */
    /* JADX WARN: Type inference failed for: r18v16 */
    /* JADX WARN: Type inference failed for: r18v17, types: [akrc] */
    /* JADX WARN: Type inference failed for: r18v18 */
    /* JADX WARN: Type inference failed for: r18v19 */
    /* JADX WARN: Type inference failed for: r18v2, types: [akrc] */
    /* JADX WARN: Type inference failed for: r18v20 */
    /* JADX WARN: Type inference failed for: r18v21 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    @Override // android.content.ContentProvider
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Throwable th;
        Throwable th2;
        List A;
        akrh e;
        yla gm;
        StringBuilder sb;
        String str;
        mfb mfbVar;
        String str2;
        String str3;
        alor b;
        Context context = getContext();
        context.getClass();
        a aVar = (a) akec.w(context, a.class);
        akrc b2 = aVar.a().b("BugleContentProviderInternal#dump");
        try {
            try {
                akrh e2 = aktp.e("BugleContentProviderInternal#dumpTraced");
                try {
                    if (anfi.a("bugle.dump_gathers_psds_early", "bugle")) {
                        try {
                            A = ((lpg) aVar.LI().b()).A();
                        } catch (Throwable th3) {
                            th2 = th3;
                            fileDescriptor = b2;
                            try {
                                e2.close();
                                throw th2;
                            } catch (Throwable th4) {
                                th2.addSuppressed(th4);
                                throw th2;
                            }
                        }
                    } else {
                        A = null;
                    }
                    e = aktp.e("BugleContentProviderInternal#sqliteVersion");
                } catch (Throwable th5) {
                    th = th5;
                    fileDescriptor = b2;
                }
                try {
                    try {
                        a(printWriter, "Sqlite version", agnc.i(null));
                        e.close();
                        akrh e3 = aktp.e("BugleContentProviderInternal#defaultSmsApp");
                        try {
                            String k = aVar.gk().k();
                            if (TextUtils.isEmpty(k)) {
                                k = "None";
                            }
                            a(printWriter, "Default SMS app", k);
                            e3.close();
                            yep gh = aVar.gh();
                            akrh e4 = aktp.e("BugleContentProviderInternal#gServices");
                            try {
                                a(printWriter, "GServicesValues", gh.d());
                                e4.close();
                                akrh e5 = aktp.e("BugleContentProviderInternal#phenotypeFlags");
                                try {
                                    a(printWriter, "Phenotypes", aVar.Sm().B());
                                    e5.close();
                                    akrh e6 = aktp.e("BugleContentProviderInternal#sharedPrefs");
                                    try {
                                        gm = aVar.gm();
                                        sb = new StringBuilder();
                                    } catch (Throwable th6) {
                                        th = th6;
                                        fileDescriptor = b2;
                                    }
                                    try {
                                        if (gm.c.y()) {
                                            if (((SubscriptionManager) gm.b.getSystemService(SubscriptionManager.class)) == null) {
                                                alvw i = yla.a.i();
                                                i.X(alwp.a, "Bugle");
                                                fileDescriptor = b2;
                                                ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/util/prefs/common/BuglePrefsPrinter", "buildSubscriptionPreferenceMap", 143, "BuglePrefsPrinter.java")).q("Couldn't get a subscription manager. Per-subscription preferences won't be backed up/restored.");
                                                b = altc.a;
                                            } else {
                                                fileDescriptor = b2;
                                                alok alokVar = new alok();
                                                gm.d.n(new yas(gm, alokVar, 5));
                                                b = alokVar.b();
                                            }
                                            Iterator it = b.entrySet().iterator();
                                            while (it.hasNext()) {
                                                yla.a((String) ((Map.Entry) it.next()).getKey(), gm.b, sb);
                                                sb.append("\n");
                                            }
                                        } else {
                                            fileDescriptor = b2;
                                            sb.append("No subscription prefs because NOT the default SMS app\n");
                                        }
                                        yla.a(gm.e.a(), gm.b, sb);
                                        a(printWriter, "Settings (Preferences)", sb.toString());
                                        e6.close();
                                        String str4 = "";
                                        if (anfi.a("bugle.dump_rcs_provisioning_flags_to_bug_report", "bugle")) {
                                            akrh e7 = aktp.e("BugleContentProviderInternal#ProvisioningFlags");
                                            try {
                                                a(printWriter, "Provisioning Flags", "");
                                                aczv.s().k(printWriter);
                                                e7.close();
                                            } finally {
                                            }
                                        }
                                        akrh e8 = aktp.e("BugleContentProviderInternal#carrierConfigs");
                                        try {
                                            a(printWriter, "Carrier configs", aVar.Qe().l());
                                            e8.close();
                                            akrh e9 = aktp.e("BugleContentProviderInternal#writeMessageStatusSection");
                                            try {
                                                if (((Boolean) utw.Y.e()).booleanValue()) {
                                                    byte[] b3 = aVar.ad().b();
                                                    if (b3 == null) {
                                                        str3 = "";
                                                    } else {
                                                        str3 = new String(b3);
                                                    }
                                                    a(printWriter, "Message Status", str3);
                                                }
                                                e9.close();
                                                akrh e10 = aktp.e("BugleContentProviderInternal#writeAppEventsSection");
                                                try {
                                                    if (((Boolean) utw.Y.e()).booleanValue()) {
                                                        byte[] a2 = aVar.ad().a();
                                                        if (a2 != null) {
                                                            str4 = new String(a2);
                                                        }
                                                        a(printWriter, "App Events", str4);
                                                    }
                                                    e10.close();
                                                    akrh e11 = aktp.e("BugleContentProviderInternal#writeTelephonyWipeoutSection");
                                                    try {
                                                        xhq fK = aVar.fK();
                                                        if (fK != null) {
                                                            xhp a3 = fK.a();
                                                            StringBuilder sb2 = new StringBuilder();
                                                            sb2.append("last recreated intent: ");
                                                            apct apctVar = a3.c;
                                                            if (apctVar == null) {
                                                                apctVar = apct.a;
                                                            }
                                                            sb2.append(fK.e(apctVar));
                                                            sb2.append("\nlast reverse sync: ");
                                                            apct apctVar2 = a3.c;
                                                            if (apctVar2 == null) {
                                                                apctVar2 = apct.a;
                                                            }
                                                            sb2.append(fK.e(apctVar2));
                                                            str = sb2.toString();
                                                        } else {
                                                            str = "N/A (LastWipeoutService was null).";
                                                        }
                                                        a(printWriter, "Telephony", str);
                                                        e11.close();
                                                        akrh e12 = aktp.e("BugleContentProviderInternal#writeRecentMessageCodesSection");
                                                        try {
                                                            mfc ae = aVar.ae();
                                                            if (ae != null) {
                                                                try {
                                                                    mfbVar = (mfb) ae.b.l();
                                                                } catch (apba e13) {
                                                                    xyo b4 = mfc.a.b();
                                                                    b4.H("Couldn't load RecentMessageCodes from SettingsStore.");
                                                                    b4.r(e13);
                                                                    mfbVar = mfb.a;
                                                                }
                                                                if (mfbVar.h.isEmpty()) {
                                                                    str2 = "No message codes logged.";
                                                                } else {
                                                                    str2 = (String) Collection.EL.stream(mfc.a(mfbVar).entrySet()).map(new lvo(19)).collect(Collectors.joining("\n"));
                                                                }
                                                            } else {
                                                                str2 = "N/A (RecentMessageCodesService was null).";
                                                            }
                                                            a(printWriter, "Recent Message Codes", str2);
                                                            e12.close();
                                                            akrh e14 = aktp.e("BugleContentProviderInternal#writePsdSection");
                                                            try {
                                                                printWriter.println("** PSDs Log **");
                                                                if (A == null) {
                                                                    A = ((lpg) aVar.LI().b()).A();
                                                                }
                                                                Iterator it2 = A.iterator();
                                                                while (it2.hasNext()) {
                                                                    try {
                                                                        printWriter.println((String) ((akul) it2.next()).get(1L, TimeUnit.SECONDS));
                                                                    } catch (Exception e15) {
                                                                        printWriter.printf("\nAdding PSD section failed, %s\n", e15.toString());
                                                                    }
                                                                }
                                                                e14.close();
                                                                printWriter.println("** Messages Log **");
                                                                akrh e16 = aktp.e("BugleContentProviderInternal#writeLogUtilLogData");
                                                                try {
                                                                    xzb.f(context, gh, printWriter, xzc.BUGLE);
                                                                    e16.close();
                                                                    akrh e17 = aktp.e("BugleContentProviderInternal#writeFloggerLogData");
                                                                    try {
                                                                        printWriter.println("** Messages Flogger Log **");
                                                                        try {
                                                                            ydq gg = aVar.gg();
                                                                            akul.g(gg.e.f().d(akto.g(new mkf(gg, printWriter, 2)), gg.c).l()).get(10L, TimeUnit.SECONDS);
                                                                        } catch (Exception e18) {
                                                                            printWriter.printf("\nAdding Flogger logs failed, %s\n", e18.toString());
                                                                            ((alwl) ((alwl) ((alwl) a.i()).g(e18)).h("com/google/android/apps/messaging/shared/datamodel/BugleContentProviderInternal$BugleContentProviderInternalInternal", "writeFloggerLogData", (char) 430, "BugleContentProviderInternal.java")).q("Failed to add flogger logs to bug report");
                                                                        }
                                                                        e17.close();
                                                                        e2.close();
                                                                        fileDescriptor.close();
                                                                    } finally {
                                                                    }
                                                                } finally {
                                                                    try {
                                                                        e16.close();
                                                                        throw th;
                                                                    } catch (Throwable th7) {
                                                                        th.addSuppressed(th7);
                                                                    }
                                                                }
                                                            } finally {
                                                                try {
                                                                    e14.close();
                                                                    throw th;
                                                                } catch (Throwable th8) {
                                                                    th.addSuppressed(th8);
                                                                }
                                                            }
                                                        } finally {
                                                            try {
                                                                e12.close();
                                                                throw th;
                                                            } catch (Throwable th9) {
                                                                th.addSuppressed(th9);
                                                            }
                                                        }
                                                    } finally {
                                                        try {
                                                            e11.close();
                                                            throw th;
                                                        } catch (Throwable th10) {
                                                            th.addSuppressed(th10);
                                                        }
                                                    }
                                                } finally {
                                                    try {
                                                        e10.close();
                                                        throw th;
                                                    } catch (Throwable th11) {
                                                        th.addSuppressed(th11);
                                                    }
                                                }
                                            } finally {
                                                try {
                                                    e9.close();
                                                    throw th;
                                                } catch (Throwable th12) {
                                                    th.addSuppressed(th12);
                                                }
                                            }
                                        } finally {
                                            try {
                                                e8.close();
                                                throw th;
                                            } catch (Throwable th13) {
                                                th.addSuppressed(th13);
                                            }
                                        }
                                    } catch (Throwable th14) {
                                        th = th14;
                                        Throwable th15 = th;
                                        try {
                                            e6.close();
                                            throw th15;
                                        } catch (Throwable th16) {
                                            th15.addSuppressed(th16);
                                            throw th15;
                                        }
                                    }
                                } finally {
                                }
                            } finally {
                            }
                        } catch (Throwable th17) {
                            fileDescriptor = b2;
                            try {
                                e3.close();
                                throw th17;
                            } catch (Throwable th18) {
                                th17.addSuppressed(th18);
                                throw th17;
                            }
                        }
                    } finally {
                        fileDescriptor = b2;
                        try {
                            e.close();
                            throw th;
                        } catch (Throwable th19) {
                            th.addSuppressed(th19);
                        }
                    }
                } catch (Throwable th20) {
                    th = th20;
                    th2 = th;
                    fileDescriptor = fileDescriptor;
                    e2.close();
                    throw th2;
                }
            } catch (Throwable th21) {
                th = th21;
                fileDescriptor = b2;
                th = th;
                try {
                    fileDescriptor.close();
                    throw th;
                } catch (Throwable th22) {
                    th.addSuppressed(th22);
                    throw th;
                }
            }
        } catch (Throwable th23) {
            th = th23;
            th = th;
            fileDescriptor.close();
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new UnsupportedOperationException("getType not supported: ".concat(String.valueOf(String.valueOf(uri))));
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("Insert not supported ".concat(String.valueOf(String.valueOf(uri))));
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        context.getClass();
        this.b.addURI(riw.l(context), "conversation_images/*", 50);
        this.b.addURI(riw.l(context), "draft_images/*", 60);
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        throw new UnsupportedOperationException("openFile not supported: ".concat(String.valueOf(String.valueOf(uri))));
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (uri.getPathSegments().size() == 2) {
            ska skaVar = new ska();
            skaVar.U(new agmd("conversation_image_parts_view.conversation_id_messages", 1, Long.valueOf(ruy.a(ruy.b(uri.getPathSegments().get(1))))));
            SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
            sQLiteQueryBuilder.setTables("conversation_image_parts_view");
            int match = this.b.match(uri);
            if (match == 50) {
                skaVar.U(new agmg("conversation_image_parts_view.uri_parts", 6));
                skaVar.U(new agoi("conversation_image_parts_view.status_messages", 2, 3));
            } else if (match == 60) {
                skaVar.U(new agoi("conversation_image_parts_view.status_messages", 1, 3));
            } else {
                throw new IllegalArgumentException("Unknown URI ".concat(String.valueOf(String.valueOf(uri))));
            }
            sQLiteQueryBuilder.appendWhere(new agpw(skaVar).a(agpo.b()));
            Cursor query = sQLiteQueryBuilder.query(agnc.d("$primary").j(), strArr, str, strArr2, null, null, str2, null);
            query.setNotificationUri(getContext().getContentResolver(), uri);
            return query;
        }
        throw new IllegalArgumentException("Malformed URI ".concat(String.valueOf(String.valueOf(uri))));
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("Update not supported: ".concat(String.valueOf(String.valueOf(uri))));
    }
}
