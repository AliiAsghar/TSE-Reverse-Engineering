package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.provider.Telephony;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xit implements xir {
    public Cursor a;
    public Cursor b;
    public wyg c;
    public wyg d;
    private final int e;
    private final wyj f;

    public xit(Context context, mce mceVar, wyj wyjVar, wzs wzsVar, String str, String str2, int i) {
        this.e = i;
        this.a = null;
        this.b = null;
        this.f = wyjVar;
        try {
            xyo d = xiu.a.d();
            d.H("Querying for remote SMS.");
            d.z("smsSelection", str);
            d.q();
            mbm b = mceVar.b("Bugle.Telephony.Query.Sms.Sync.Latency");
            Cursor query = context.getContentResolver().query(Telephony.Sms.CONTENT_URI, wyh.g(wzsVar), str, null, "date DESC");
            this.a = query;
            qxq.m(query);
            b.c();
            if (this.a != null) {
                xyo d2 = xiu.a.d();
                d2.H("Querying for remote MMS.");
                d2.z("mmsSelection", str2);
                d2.q();
                mbm b2 = mceVar.b("Bugle.Telephony.Query.Mms.Sync.Latency");
                Cursor query2 = context.getContentResolver().query(Telephony.Mms.CONTENT_URI, wye.m(), str2, null, "date DESC");
                this.b = query2;
                qxq.m(query2);
                b2.c();
                if (this.b != null) {
                    this.c = b();
                    this.d = a();
                    return;
                } else {
                    xiu.a.q("Remote MMS query returned null cursor; need to cancel sync");
                    throw new RuntimeException("Null cursor from remote MMS query");
                }
            }
            xiu.a.q("Remote SMS query returned null cursor; need to cancel sync");
            throw new RuntimeException("Null cursor from remote SMS query");
        } catch (SQLiteException e) {
            xyo b3 = xiu.a.b();
            b3.H("failed to query remote messages");
            b3.r(e);
            throw e;
        }
    }

    public final wyg a() {
        Cursor cursor = this.b;
        if (cursor != null && cursor.moveToNext()) {
            return wye.g(this.b, this.e);
        }
        return null;
    }

    public final wyg b() {
        Cursor cursor = this.a;
        if (cursor != null && cursor.moveToNext()) {
            wyh a = this.f.a();
            a.f(this.a, this.e);
            return a;
        }
        return null;
    }
}
