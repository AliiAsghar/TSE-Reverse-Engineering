package com.google.android.apps.messaging.diagnostics;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Telephony;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.amdy;
import defpackage.anna;
import defpackage.imp;
import defpackage.knb;
import defpackage.uti;
import defpackage.vcp;
import defpackage.xyo;
import defpackage.xze;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LogTelephonyDatabaseAction extends Action<Uri> implements Parcelable {
    private final Context c;
    private static final xze a = xze.g("Bugle", "LogTelephonyDatabaseAction");
    private static final String[] b = {"_id", "date", "message_count", "recipient_ids", "snippet", "snippet_cs", "read", "error", "has_attachment"};
    public static final Parcelable.Creator<Action<Uri>> CREATOR = new imp(12);

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public interface a {
        knb v();
    }

    public LogTelephonyDatabaseAction(Context context) {
        super(amdy.LOG_TELEPHONY_DATABASE_ACTION);
        this.c = context;
    }

    private static void h(String str, String str2, Uri uri, String str3, Context context, PrintWriter printWriter) {
        String string;
        printWriter.printf("CREATE TABLE %s (%s);\n", str, str2);
        ArrayList arrayList = new ArrayList();
        for (String str4 : anna.e(',').a(str2)) {
            arrayList.add(str4.substring(0, str4.indexOf(" ")));
        }
        Cursor e = vcp.e(context.getContentResolver(), uri.buildUpon().appendQueryParameter("simple", "true").build(), null, null, null, null);
        while (true) {
            try {
                e.getClass();
                if (e.moveToNext()) {
                    printWriter.printf("INSERT INTO %s (", str);
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder();
                    String[] columnNames = e.getColumnNames();
                    boolean z = false;
                    for (int i = 0; i < columnNames.length; i++) {
                        if (arrayList.contains(columnNames[i])) {
                            if (z) {
                                sb.append(",");
                                sb2.append(",");
                            }
                            sb.append(columnNames[i]);
                            if (e.isNull(i)) {
                                string = "";
                            } else {
                                string = e.getString(i);
                            }
                            if (TextUtils.equals(str3, columnNames[i])) {
                                string = "redacted";
                            }
                            sb2.append(DatabaseUtils.sqlEscapeString(string));
                            z = true;
                        }
                    }
                    printWriter.printf("%s) VALUES(%s);\n", sb.toString(), sb2.toString());
                } else {
                    e.close();
                    return;
                }
            } finally {
            }
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("LogTelephonyDatabaseAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        try {
            PrintWriter printWriter = new PrintWriter(new FileOutputStream(uti.e(this.c, "mmssms.db.txt")));
            try {
                Context context = this.c;
                xze xzeVar = a;
                xzeVar.l("Dump of canonical_addresses table.");
                xzeVar.l("**********************************");
                Cursor e = vcp.e(context.getContentResolver(), Uri.parse("content://mms-sms/canonical-addresses"), null, null, null, null);
                int i = 1;
                int i2 = 0;
                if (e != null) {
                    while (e.moveToNext()) {
                        try {
                            long j = e.getLong(0);
                            String string = e.getString(1);
                            xyo a2 = a.a();
                            a2.C("id", String.valueOf(j));
                            a2.C("number", string);
                            a2.q();
                        } finally {
                            e.close();
                        }
                    }
                    e.close();
                } else {
                    xzeVar.q("null Cursor in content://mms-sms/canonical-addresses");
                }
                h("canonical_addresses", "_id INTEGER PRIMARY KEY AUTOINCREMENT,address TEXT", Uri.parse("content://mms-sms/canonical-addresses"), null, context, printWriter);
                Context context2 = this.c;
                xze xzeVar2 = a;
                xzeVar2.l("Dump of threads table.");
                xzeVar2.l("**********************");
                e = vcp.e(context2.getContentResolver(), Telephony.Threads.CONTENT_URI.buildUpon().appendQueryParameter("simple", "true").build(), b, null, null, "date ASC");
                while (true) {
                    try {
                        e.getClass();
                        if (!e.moveToNext()) {
                            break;
                        }
                        long j2 = e.getLong(i2);
                        long j3 = e.getLong(i);
                        int i3 = e.getInt(2);
                        int i4 = e.getInt(6);
                        String string2 = e.getString(3);
                        int i5 = e.getInt(7);
                        int i6 = e.getInt(8);
                        xyo a3 = a.a();
                        a3.C("threadId", String.valueOf(j2));
                        a3.C("date", String.valueOf(j3));
                        a3.C("message_count", String.valueOf(i3));
                        a3.C("snippet", e.getString(4));
                        a3.C("read", String.valueOf(i4));
                        a3.C("error", String.valueOf(i5));
                        a3.C("has_attachment", String.valueOf(i6));
                        a3.C("recipient_ids", string2);
                        a3.q();
                        i = 1;
                        i2 = 0;
                    } finally {
                    }
                }
                e.close();
                h("threads", "_id INTEGER PRIMARY KEY AUTOINCREMENT,date INTEGER DEFAULT 0,message_count INTEGER DEFAULT 0,recipient_ids TEXT,snippet TEXT,snippet_cs INTEGER DEFAULT 0,read INTEGER DEFAULT 1,archived INTEGER DEFAULT 0,type INTEGER DEFAULT 0,error INTEGER DEFAULT 0,has_attachment INTEGER DEFAULT 0", Telephony.Threads.CONTENT_URI, "snippet", context2, printWriter);
                h("sms", "_id INTEGER PRIMARY KEY,thread_id INTEGER,address TEXT,person INTEGER,date INTEGER,date_sent INTEGER DEFAULT 0,protocol INTEGER,read INTEGER DEFAULT 0,status INTEGER DEFAULT -1,type INTEGER,reply_path_present INTEGER,subject TEXT,body TEXT,service_center TEXT,locked INTEGER DEFAULT 0,sub_id INTEGER DEFAULT -1,error_code INTEGER DEFAULT 0,creator TEXT,seen INTEGER DEFAULT 0", Telephony.Sms.CONTENT_URI, null, this.c, printWriter);
                h("pdu", "_id INTEGER PRIMARY KEY AUTOINCREMENT,thread_id INTEGER,date INTEGER,date_sent INTEGER DEFAULT 0,msg_box INTEGER,read INTEGER DEFAULT 0,m_id TEXT,sub TEXT,sub_cs INTEGER,ct_t TEXT,ct_l TEXT,exp INTEGER,m_cls TEXT,m_type INTEGER,v INTEGER,m_size INTEGER,pri INTEGER,rr INTEGER,rpt_a INTEGER,resp_st INTEGER,st INTEGER,tr_id TEXT,retr_st INTEGER,retr_txt TEXT,retr_txt_cs INTEGER,read_status INTEGER,ct_cls INTEGER,resp_txt TEXT,d_tm INTEGER,d_rpt INTEGER,locked INTEGER DEFAULT 0,sub_id INTEGER DEFAULT -1, seen INTEGER DEFAULT 0,creator TEXT,text_only INTEGER DEFAULT 0", Telephony.Mms.CONTENT_URI, null, this.c, printWriter);
                h("part", "_id INTEGER PRIMARY KEY AUTOINCREMENT,mid INTEGER,seq INTEGER DEFAULT 0,ct TEXT,name TEXT,chset INTEGER,cd TEXT,fn TEXT,cid TEXT,cl TEXT,ctt_s INTEGER,ctt_t TEXT,_data TEXT,text TEXT", Uri.parse("content://mms/part"), null, this.c, printWriter);
                printWriter.close();
            } finally {
            }
        } catch (Exception e2) {
            xyo e3 = a.e();
            e3.H("Exception writing database file:");
            e3.H("mmssms.db.txt");
            e3.r(e2);
        }
        return uti.d(this.c, "mmssms.db.txt");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.LogTelephonyDatabase.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public LogTelephonyDatabaseAction(Context context, Parcel parcel) {
        super(parcel, amdy.LOG_TELEPHONY_DATABASE_ACTION);
        this.c = context;
    }
}
