package com.google.android.apps.messaging.diagnostics;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.Toast;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.agmh;
import defpackage.agnw;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.amdy;
import defpackage.armf;
import defpackage.hht;
import defpackage.ilu;
import defpackage.imp;
import defpackage.isg;
import defpackage.ivk;
import defpackage.kmy;
import defpackage.kmz;
import defpackage.odv;
import defpackage.uti;
import defpackage.xyo;
import defpackage.xze;
import defpackage.yyb;
import j$.util.DesugarArrays;
import j$.util.stream.Collectors;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DumpDatabaseAction extends Action<Uri> implements Parcelable {
    public final kmz a;
    private final Context c;
    private final armf d;
    private final Map e;
    private final boolean f;
    private static final xze b = xze.g("BugleDataModel", "DumpDatabaseAction");
    public static final Parcelable.Creator<Action<Uri>> CREATOR = new imp(11);

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public interface a {
        kmy u();
    }

    public DumpDatabaseAction(Context context, armf armfVar, Map map, Parcel parcel) {
        super(parcel, amdy.DUMP_DATABASE_ACTION);
        boolean readBoolean;
        this.c = context;
        this.d = armfVar;
        this.e = map;
        if (odv.a()) {
            String readString = parcel.readString();
            readString.getClass();
            kmz kmzVar = (kmz) Enum.valueOf(kmz.class, readString);
            this.a = kmzVar;
            this.f = kmzVar != kmz.NOT_REDACTED;
            return;
        }
        readBoolean = parcel.readBoolean();
        this.f = readBoolean;
        this.a = kmz.REDACTED;
    }

    private final File h(Context context, String str) {
        String str2;
        BufferedOutputStream bufferedOutputStream;
        File databasePath = context.getDatabasePath("bugle_db".concat(str));
        long j = 0;
        if (databasePath.exists() && databasePath.isFile()) {
            j = databasePath.length();
        }
        boolean z = this.f;
        StringBuilder sb = new StringBuilder("db_copy");
        if (true != z) {
            str2 = "";
        } else {
            str2 = "_redacted";
        }
        sb.append(str2);
        sb.append(str);
        File e = uti.e(context, sb.toString());
        int i = 0;
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(e));
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e2) {
            e = e2;
        }
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(databasePath));
            try {
                byte[] bArr = new byte[16384];
                int i2 = 0;
                while (true) {
                    try {
                        int read = bufferedInputStream.read(bArr);
                        if (read > 0) {
                            bufferedOutputStream.write(bArr, 0, read);
                            i2 += read;
                        } else {
                            try {
                                break;
                            } catch (Throwable th2) {
                                th = th2;
                                i = i2;
                                try {
                                    bufferedOutputStream.close();
                                } catch (Throwable th3) {
                                    th.addSuppressed(th3);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        i = i2;
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable th5) {
                            th.addSuppressed(th5);
                        }
                        throw th;
                    }
                }
                bufferedInputStream.close();
                try {
                    bufferedOutputStream.close();
                } catch (IOException e3) {
                    e = e3;
                    i = i2;
                    xyo e4 = b.e();
                    e4.H("Exception copying database file:");
                    e4.H("bugle_db");
                    e4.u(str);
                    e4.u("; destination may not be complete.");
                    e4.r(e);
                    i2 = i;
                    yyb.aU(e);
                    xyo c = b.c();
                    c.H("Dump complete.");
                    c.y("originalSize", j);
                    c.x("copy size", i2);
                    c.q();
                    return e;
                } catch (Throwable th6) {
                    th = th6;
                    i = i2;
                    yyb.aU(e);
                    xyo c2 = b.c();
                    c2.H("Dump complete.");
                    c2.y("originalSize", j);
                    c2.x("copy size", i);
                    c2.q();
                    throw th;
                }
                yyb.aU(e);
                xyo c3 = b.c();
                c3.H("Dump complete.");
                c3.y("originalSize", j);
                c3.x("copy size", i2);
                c3.q();
                return e;
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            th = th8;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("DumpDatabaseAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        boolean z;
        Cursor g = ((agnw) this.d.b()).g("pragma wal_checkpoint(TRUNCATE)", null);
        try {
            g.moveToFirst();
            xyo c = b.c();
            if (g.getLong(0) == 0) {
                z = true;
            } else {
                z = false;
            }
            c.A("checkpointed", z);
            c.y("pages written", g.getLong(2));
            c.q();
            if (g != null) {
                g.close();
            }
            File h = h(this.c, "");
            h(this.c, "-wal");
            if (this.f) {
                SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(h.getAbsolutePath(), null, 0);
                try {
                    Cursor rawQuery = openDatabase.rawQuery("PRAGMA secure_delete=1", null);
                    try {
                        if (!rawQuery.moveToFirst()) {
                            Toast.makeText(this.c, "unable to set secure_delete -- failing", 1).show();
                        }
                        if (rawQuery != null) {
                            rawQuery.close();
                        }
                        String str = ((agnw) this.d.b()).n().b;
                        for (Map.Entry entry : this.e.entrySet()) {
                            String str2 = (String) entry.getKey();
                            if (str2.startsWith(hht.h(str, "+"))) {
                                String substring = str2.substring(str2.indexOf("+") + 1);
                                if (substring.equals("sqlite_master")) {
                                    continue;
                                } else {
                                    String str3 = (String) DesugarArrays.stream((agmh[]) entry.getValue()).filter(new ilu(3)).filter(new isg(this, 5)).filter(new ilu(4)).map(new ivk(20)).collect(Collectors.joining(","));
                                    if (str3.isEmpty()) {
                                        continue;
                                    } else {
                                        try {
                                            openDatabase.execSQL(String.format(Locale.ROOT, "UPDATE %s SET %s", substring, str3));
                                        } finally {
                                        }
                                    }
                                }
                            }
                        }
                        if (openDatabase != null) {
                            openDatabase.close();
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    if (openDatabase != null) {
                        try {
                            openDatabase.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            return uti.d(this.c, h.getName());
        } catch (Throwable th3) {
            if (g != null) {
                try {
                    g.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.DumpDatabase.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
        if (odv.a()) {
            parcel.writeString(this.a.name());
        } else {
            parcel.writeBoolean(this.f);
        }
    }

    public DumpDatabaseAction(Context context, armf armfVar, Map map, kmz kmzVar) {
        super(amdy.DUMP_DATABASE_ACTION);
        this.c = context;
        this.d = armfVar;
        this.e = map;
        this.a = kmzVar;
        this.f = kmzVar != kmz.NOT_REDACTED;
    }

    public DumpDatabaseAction(Context context, armf armfVar, Map map, boolean z) {
        super(amdy.DUMP_DATABASE_ACTION);
        this.c = context;
        this.d = armfVar;
        this.e = map;
        this.f = z;
        this.a = kmz.REDACTED;
    }
}
