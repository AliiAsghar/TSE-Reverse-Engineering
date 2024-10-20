package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import android.provider.Telephony;
import android.text.TextUtils;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aama extends xzs {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ boolean c;
    final /* synthetic */ boolean k;
    final /* synthetic */ aamb l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aama(aamb aambVar, String str, String str2, boolean z, boolean z2) {
        super("Bugle.Async.Debug.createFakeTelephonyConversations.Duration", null);
        this.a = str;
        this.b = str2;
        this.c = z;
        this.k = z2;
        this.l = aambVar;
    }

    @Override // defpackage.xzs
    public final /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        String str;
        String str2;
        if (TextUtils.isEmpty(this.a)) {
            str = "5555550000";
        } else {
            str = this.a;
        }
        String str3 = str;
        if (TextUtils.isEmpty(this.b)) {
            str2 = "Test msg";
        } else {
            str2 = this.b;
        }
        ContentValues a = aamb.a(str3, str2, this.l.f.f().toEpochMilli(), this.l.g.e(str3), -1L, false, this.c, this.k);
        Uri insert = this.l.h.getContentResolver().insert(Telephony.Sms.Inbox.CONTENT_URI, a);
        wzp wzpVar = (wzp) this.l.j.b();
        insert.getClass();
        Object obj = a.get("date");
        obj.getClass();
        wzpVar.m(insert, Instant.ofEpochMilli(((Long) obj).longValue()));
        return null;
    }

    @Override // defpackage.xzs
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        if (!this.c && !this.k) {
            this.l.k.l("Notification should be posted soon, ensure notifications are enabled.");
        } else {
            this.l.k.l("Telephony DB populated. Now syncing...");
        }
    }
}
