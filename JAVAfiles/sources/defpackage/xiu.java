package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.Telephony;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xiu implements Closeable, AutoCloseable {
    public final String d;
    public final String e;
    public final String f;
    private final Context j;
    private final mce k;
    private final mbl l;
    private final ogq m;
    private final wzs n;
    private xir o;
    private xir p;
    private final String q;
    private final armf r;
    private final yyt s;
    public static final xze a = xze.g("Bugle", "SyncCursorPair");
    private static final alvi g = alvi.m("com/google/android/apps/messaging/shared/telephony/forwardsync/SyncCursorPair");
    static final utz b = uuh.e(uuh.b, "forward_sync_spot_sync_limit", 1000);
    private static final String h = String.format(Locale.US, "(%s NOTNULL)", MessagesTable.c.o);
    public static final String c = String.format(Locale.US, "(%s NOTNULL)", MessagesTable.c.a);
    private static final String[] i = {"count()"};

    public xiu(Context context, mce mceVar, mbl mblVar, yyt yytVar, wzs wzsVar, armf armfVar, ogq ogqVar, long j, long j2) {
        this.j = context;
        this.k = mceVar;
        this.l = mblVar;
        this.s = yytVar;
        this.m = ogqVar;
        this.r = armfVar;
        this.n = wzsVar;
        long j3 = j < 0 ? j : (j / 1000) * 1000;
        long j4 = j2 < 0 ? j2 : ((j2 + 999) / 1000) * 1000;
        long j5 = j3;
        long j6 = j4;
        this.q = t(c, MessagesTable.c.i.toString(), j5, j6);
        this.d = t(h, MessagesTable.c.i.toString(), j5, j6);
        this.e = t(s(wzsVar), "date", j5, j6);
        this.f = t(r(wzsVar), "date", j3 / 1000, j4 / 1000);
    }

    public static int b(String str) {
        sxy d = MessagesTable.d();
        d.w("+isSynchronized");
        d.g(new xgt(str, 11));
        return d.b().i();
    }

    public static void j(List list, List list2, uj ujVar, wyb wybVar, xae xaeVar) {
        String str;
        long j;
        if (wybVar.a() == 1) {
            wye wyeVar = (wye) wybVar;
            ujVar.f(wyeVar.b, wyeVar);
            list2.add(wyeVar);
            j = wyeVar.i;
            str = wyeVar.a;
        } else if (wybVar.a() == 0) {
            wyh wyhVar = (wyh) wybVar;
            list.add(wyhVar);
            j = wyhVar.i;
            str = wyhVar.b;
        } else {
            xyo e = a.e();
            e.H("Tried to add message with unknown protocol");
            e.x("protocol", wybVar.a());
            e.q();
            str = null;
            j = -1;
        }
        xaeVar.a(wxr.c, j, str);
    }

    private static int m(ArrayList arrayList, uj ujVar, ArrayList arrayList2) {
        return arrayList.size() + ujVar.b() + arrayList2.size();
    }

    private static int n(Cursor cursor) {
        String str;
        if (cursor != null && cursor.moveToFirst()) {
            return cursor.getInt(0);
        }
        if (cursor != null) {
            if (cursor.getCount() == 0) {
                str = "empty";
            } else {
                str = "";
            }
        } else {
            str = "null";
        }
        throw new IllegalArgumentException(a.bW(str, "Cannot get count from ", " cursor"));
    }

    private static final long o(wyb wybVar) {
        return wybVar.c() / 1000;
    }

    private static ahka p(int i2, int i3) {
        if (i2 >= i3) {
            return new ahka("ForwardSync::ScanOneBatch::FullUpdates");
        }
        if (i2 > 0) {
            return new ahka("ForwardSync::ScanOneBatch::SomeUpdates");
        }
        return new ahka("ForwardSync::ScanOneBatch::NoUpdates");
    }

    private static String q(Set set, String str) {
        return String.format("(%s IN (%s))", "_id", (String) Collection.EL.stream(set).filter(new xdm(str, 4)).map(new xgv(8)).collect(Collectors.joining(", ")));
    }

    private static String r(wzs wzsVar) {
        return wzsVar.E();
    }

    private static String s(wzs wzsVar) {
        return wzsVar.H();
    }

    private static String t(String str, String str2, long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (j > 0) {
            sb.append(" AND ");
            sb.append(str2);
            sb.append(">=");
            sb.append(j);
        }
        if (j2 > 0) {
            sb.append(" AND ");
            sb.append(str2);
            sb.append("<");
            sb.append(j2);
        }
        if (!TextUtils.isEmpty(null) && !TextUtils.isEmpty(null)) {
            sb.append(" AND null=null");
        }
        return sb.toString();
    }

    private static final boolean u(wyb wybVar, wyc wycVar) {
        boolean z;
        if (Objects.equals(wybVar.d(), wycVar.b)) {
            return true;
        }
        if (wybVar.a() == wycVar.a || (wybVar.a() == 1 && wycVar.a == 3)) {
            if (wybVar.a() == 1) {
                wye wyeVar = (wye) wybVar;
                if (!albo.ah(wyeVar.o) && !albo.ah(wycVar.g) && Objects.equals(wyeVar.o, wycVar.g)) {
                    return true;
                }
                tbs d = PartsTable.d();
                d.g(new xgt(wycVar, 10));
                alog t = d.b().t();
                if (wyeVar.x.size() == ((alsx) t).c) {
                    loop0: while (true) {
                        z = true;
                        for (wyf wyfVar : wyeVar.x) {
                            if (!z || !Collection.EL.stream(t).anyMatch(new xdm(wyfVar, 6))) {
                                z = false;
                            }
                        }
                    }
                    if (z) {
                        return true;
                    }
                }
            } else if (wybVar.a() == 0 && Objects.equals(((wyh) wybVar).e, wycVar.f)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean v(wyc wycVar, Set set, Set set2) {
        if (albo.ah(wycVar.b)) {
            Stream map = Collection.EL.stream(set2).map(new xgv(9));
            int i2 = alog.d;
            alog alogVar = (alog) map.collect(alls.a);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                wyb wybVar = (wyb) it.next();
                if (u(wybVar, wycVar) && !alogVar.contains(wybVar)) {
                    set2.add(new xin(wycVar, wybVar));
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int a() {
        sxt sxtVar = ((xis) this.o).b;
        if (sxtVar == null) {
            return 0;
        }
        return sxtVar.getCount();
    }

    public final int c() {
        sxt sxtVar = ((xis) this.o).b;
        if (sxtVar == null) {
            return 0;
        }
        return sxtVar.getPosition();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        xis xisVar;
        sxt sxtVar;
        xir xirVar = this.o;
        if (xirVar != null && (sxtVar = (xisVar = (xis) xirVar).b) != null) {
            sxtVar.close();
            xisVar.b = null;
        }
        xir xirVar2 = this.p;
        if (xirVar2 != null) {
            xit xitVar = (xit) xirVar2;
            Cursor cursor = xitVar.a;
            if (cursor != null) {
                cursor.close();
                xitVar.a = null;
            }
            Cursor cursor2 = xitVar.b;
            if (cursor2 != null) {
                cursor2.close();
                xitVar.b = null;
            }
        }
    }

    public final int d() {
        int count;
        xit xitVar = (xit) this.p;
        Cursor cursor = xitVar.a;
        int i2 = 0;
        if (cursor == null) {
            count = 0;
        } else {
            count = cursor.getCount();
        }
        Cursor cursor2 = xitVar.b;
        if (cursor2 != null) {
            i2 = cursor2.getCount();
        }
        return count + i2;
    }

    public final int e(String str, String str2) {
        Context context = this.j;
        mbm b2 = this.k.b("Bugle.Telephony.Query.Count.Latency");
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = Telephony.Sms.CONTENT_URI;
        String[] strArr = i;
        Cursor e = vcp.e(contentResolver, uri, strArr, str, null, null);
        try {
            qxq.m(e);
            b2.c();
            int n = n(e);
            if (e != null) {
                e.close();
            }
            mce mceVar = this.k;
            Context context2 = this.j;
            mbm b3 = mceVar.b("Bugle.Telephony.Query.Count.Latency");
            e = vcp.e(context2.getContentResolver(), Telephony.Mms.CONTENT_URI, strArr, str2, null, null);
            try {
                qxq.m(e);
                b3.c();
                int n2 = n(e);
                if (e != null) {
                    e.close();
                }
                return n + n2;
            } finally {
            }
        } finally {
        }
    }

    public final int f() {
        int position;
        xit xitVar = (xit) this.p;
        Cursor cursor = xitVar.a;
        int i2 = 0;
        if (cursor == null) {
            position = 0;
        } else {
            position = cursor.getPosition();
        }
        Cursor cursor2 = xitVar.b;
        if (cursor2 != null) {
            i2 = cursor2.getPosition();
        }
        return (position + i2) - 1;
    }

    final wyc g() {
        xis xisVar = (xis) this.o;
        sxt sxtVar = xisVar.b;
        String str = null;
        if (sxtVar == null || !sxtVar.moveToNext()) {
            return null;
        }
        xiu xiuVar = xisVar.a;
        sxt sxtVar2 = xisVar.b;
        if (sxtVar2 == null) {
            return null;
        }
        Uri A = sxtVar2.A();
        String ad = sxtVar2.ad();
        String cX = sxtVar2.cX("parts_expression");
        MessageIdType E = sxtVar2.E();
        int g2 = sxtVar2.g();
        if (A != null) {
            str = A.toString();
        }
        long s = sxtVar2.s();
        ConversationIdType C = sxtVar2.C();
        sxtVar2.h();
        return new wyc(E, g2, str, s, C, cX, ad);
    }

    final wyg h(Set set, xae xaeVar) {
        wyg wygVar;
        xit xitVar = (xit) this.p;
        wyg wygVar2 = xitVar.c;
        if (wygVar2 != null && (wygVar = xitVar.d) != null) {
            if (((wyh) wygVar2).f >= ((wye) wygVar).g) {
                xitVar.c = xitVar.b();
            } else {
                xitVar.d = xitVar.a();
                wygVar2 = wygVar;
            }
        } else if (wygVar2 != null) {
            xitVar.c = xitVar.b();
        } else {
            wygVar2 = xitVar.d;
            xitVar.d = xitVar.a();
        }
        if (wygVar2 != null && !((Boolean) qpf.a.e()).booleanValue()) {
            long e = wygVar2.e();
            xaz a2 = xaeVar.a(wym.a, e, albo.ag(wygVar2.d()));
            long j = a2.a;
            if (j != e && j != -1 && e != -1) {
                set.add(new xio(e, a2));
            }
        }
        if (wygVar2 != null && wygVar2.c() == 0) {
            this.l.e("Bugle.Telephony.ForwardSync.SyncCursorPair.ReadTelephonyMessageWithTimestampZero", wygVar2 instanceof wye ? 1 : 0);
        }
        return wygVar2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [armf, java.lang.Object] */
    public final void i(int i2) {
        this.o = new xis(this, this.q);
        yyt yytVar = this.s;
        Context context = (Context) yytVar.b.b();
        context.getClass();
        mce mceVar = (mce) yytVar.d.b();
        mceVar.getClass();
        wyj wyjVar = (wyj) yytVar.a.b();
        wyjVar.getClass();
        wzs wzsVar = (wzs) yytVar.c.b();
        wzsVar.getClass();
        this.p = new xit(context, mceVar, wyjVar, wzsVar, this.e, this.f, i2);
    }

    public final boolean k() {
        boolean z;
        String str = this.e;
        String str2 = this.f;
        try {
            int b2 = b(this.d);
            int e = e(str, str2);
            if (b2 == e) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                xyo a2 = a.a();
                a2.H("Same number of local and remote messages.");
                a2.x("count", b2);
                a2.q();
            } else {
                xyo c2 = a.c();
                c2.H("Not in sync.");
                c2.x("localCount", b2);
                c2.x("remoteCount", e);
                c2.q();
            }
            return z;
        } catch (Exception e2) {
            xyo b3 = a.b();
            b3.H("failed to query local or remote message counts");
            b3.r(e2);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0240, code lost:
    
        r29 = r12;
        r31 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c8, code lost:
    
        if (r12 != r4) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0165, code lost:
    
        r31 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0068 A[Catch: all -> 0x005e, TryCatch #8 {all -> 0x005e, blocks: (B:225:0x0057, B:12:0x0068, B:14:0x0079, B:48:0x00ba, B:50:0x00c2, B:51:0x00ca, B:52:0x00cc, B:59:0x00d9, B:60:0x00ff), top: B:224:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x023e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x026f A[Catch: all -> 0x03b9, TryCatch #4 {all -> 0x03b9, blocks: (B:89:0x01de, B:92:0x01f5, B:94:0x0244, B:95:0x0211, B:110:0x01aa, B:112:0x01b3, B:114:0x01b7, B:121:0x01c3, B:123:0x01cd, B:134:0x0257, B:135:0x0269, B:137:0x026f, B:139:0x027c, B:144:0x0286, B:146:0x0293, B:147:0x029b, B:149:0x02a1, B:151:0x02a9, B:153:0x02af, B:155:0x02b5, B:157:0x02bd, B:159:0x02c3, B:164:0x02cb, B:166:0x02cf, B:162:0x02d2, B:170:0x02d9, B:174:0x02eb, B:178:0x0342), top: B:88:0x01de }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0293 A[Catch: all -> 0x03b9, TryCatch #4 {all -> 0x03b9, blocks: (B:89:0x01de, B:92:0x01f5, B:94:0x0244, B:95:0x0211, B:110:0x01aa, B:112:0x01b3, B:114:0x01b7, B:121:0x01c3, B:123:0x01cd, B:134:0x0257, B:135:0x0269, B:137:0x026f, B:139:0x027c, B:144:0x0286, B:146:0x0293, B:147:0x029b, B:149:0x02a1, B:151:0x02a9, B:153:0x02af, B:155:0x02b5, B:157:0x02bd, B:159:0x02c3, B:164:0x02cb, B:166:0x02cf, B:162:0x02d2, B:170:0x02d9, B:174:0x02eb, B:178:0x0342), top: B:88:0x01de }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0079 A[Catch: all -> 0x005e, TRY_LEAVE, TryCatch #8 {all -> 0x005e, blocks: (B:225:0x0057, B:12:0x0068, B:14:0x0079, B:48:0x00ba, B:50:0x00c2, B:51:0x00ca, B:52:0x00cc, B:59:0x00d9, B:60:0x00ff), top: B:224:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02af A[Catch: all -> 0x03b9, TryCatch #4 {all -> 0x03b9, blocks: (B:89:0x01de, B:92:0x01f5, B:94:0x0244, B:95:0x0211, B:110:0x01aa, B:112:0x01b3, B:114:0x01b7, B:121:0x01c3, B:123:0x01cd, B:134:0x0257, B:135:0x0269, B:137:0x026f, B:139:0x027c, B:144:0x0286, B:146:0x0293, B:147:0x029b, B:149:0x02a1, B:151:0x02a9, B:153:0x02af, B:155:0x02b5, B:157:0x02bd, B:159:0x02c3, B:164:0x02cb, B:166:0x02cf, B:162:0x02d2, B:170:0x02d9, B:174:0x02eb, B:178:0x0342), top: B:88:0x01de }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02d2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ba A[Catch: all -> 0x005e, TRY_ENTER, TryCatch #8 {all -> 0x005e, blocks: (B:225:0x0057, B:12:0x0068, B:14:0x0079, B:48:0x00ba, B:50:0x00c2, B:51:0x00ca, B:52:0x00cc, B:59:0x00d9, B:60:0x00ff), top: B:224:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014b A[Catch: all -> 0x011a, TryCatch #5 {all -> 0x011a, blocks: (B:214:0x0111, B:67:0x012d, B:69:0x0139, B:71:0x0141, B:72:0x0145, B:74:0x014b, B:76:0x0169, B:78:0x0173, B:80:0x017a, B:82:0x0187, B:84:0x018b, B:101:0x0191, B:108:0x019f, B:64:0x0123), top: B:213:0x0111 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f5 A[Catch: all -> 0x03b9, TRY_ENTER, TryCatch #4 {all -> 0x03b9, blocks: (B:89:0x01de, B:92:0x01f5, B:94:0x0244, B:95:0x0211, B:110:0x01aa, B:112:0x01b3, B:114:0x01b7, B:121:0x01c3, B:123:0x01cd, B:134:0x0257, B:135:0x0269, B:137:0x026f, B:139:0x027c, B:144:0x0286, B:146:0x0293, B:147:0x029b, B:149:0x02a1, B:151:0x02a9, B:153:0x02af, B:155:0x02b5, B:157:0x02bd, B:159:0x02c3, B:164:0x02cb, B:166:0x02cf, B:162:0x02d2, B:170:0x02d9, B:174:0x02eb, B:178:0x0342), top: B:88:0x01de }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0211 A[Catch: all -> 0x03b9, TryCatch #4 {all -> 0x03b9, blocks: (B:89:0x01de, B:92:0x01f5, B:94:0x0244, B:95:0x0211, B:110:0x01aa, B:112:0x01b3, B:114:0x01b7, B:121:0x01c3, B:123:0x01cd, B:134:0x0257, B:135:0x0269, B:137:0x026f, B:139:0x027c, B:144:0x0286, B:146:0x0293, B:147:0x029b, B:149:0x02a1, B:151:0x02a9, B:153:0x02af, B:155:0x02b5, B:157:0x02bd, B:159:0x02c3, B:164:0x02cb, B:166:0x02cf, B:162:0x02d2, B:170:0x02d9, B:174:0x02eb, B:178:0x0342), top: B:88:0x01de }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long l(int r36, int r37, java.util.ArrayList r38, java.util.ArrayList r39, defpackage.uj r40, java.util.ArrayList r41, java.util.Set r42, java.util.Set r43, defpackage.xae r44, java.util.ArrayList r45) {
        /*
            Method dump skipped, instructions count: 1132
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xiu.l(int, int, java.util.ArrayList, java.util.ArrayList, uj, java.util.ArrayList, java.util.Set, java.util.Set, xae, java.util.ArrayList):long");
    }

    public xiu(Context context, mce mceVar, mbl mblVar, yyt yytVar, wzs wzsVar, armf armfVar, ogq ogqVar, Set set) {
        this.j = context;
        this.k = mceVar;
        this.l = mblVar;
        this.s = yytVar;
        this.m = ogqVar;
        this.r = armfVar;
        this.n = wzsVar;
        int size = set.size();
        utz utzVar = b;
        int intValue = ((Integer) utzVar.e()).intValue();
        int size2 = set.size();
        Object e = utzVar.e();
        if (size <= intValue) {
            syc sycVar = new syc();
            sycVar.J(set);
            this.q = new syb(sycVar).a(agpo.b());
            syc sycVar2 = new syc();
            sycVar2.J(set);
            this.d = new syb(sycVar2).a(agpo.b());
            this.e = String.format("%s AND %s", s(wzsVar), q(set, "sms"));
            this.f = String.format("%s AND %s", r(wzsVar), q(set, "mms"));
            return;
        }
        throw new alia(albo.F("Spot sync size exceeds limit: [%s] > [%s]", Integer.valueOf(size2), e));
    }
}
