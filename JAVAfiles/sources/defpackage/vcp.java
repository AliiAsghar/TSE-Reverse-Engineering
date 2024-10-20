package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vcp {
    public vcp() {
    }

    public static final vcq a(String str) {
        if (!arsd.M(str)) {
            return new vcq(str);
        }
        throw new IllegalArgumentException("Tachyon url must not be blank");
    }

    public static boolean b(String str) {
        return "application/vnd.oma.drm.message".equals(str);
    }

    public static int c(ContentResolver contentResolver, Uri uri, String str, String[] strArr) {
        try {
            return contentResolver.delete(uri, str, strArr);
        } catch (SQLiteException | IllegalArgumentException e) {
            xzb.i("Bugle", e, "SqliteWrapper: catch an exception when delete");
            return -1;
        }
    }

    public static int d(ContentResolver contentResolver, Uri uri, ContentValues contentValues, String str, String[] strArr) {
        try {
            return contentResolver.update(uri, contentValues, str, strArr);
        } catch (SQLiteException | IllegalArgumentException e) {
            xzb.i("Bugle", e, "SqliteWrapper: catch an exception when update");
            return -1;
        }
    }

    public static Cursor e(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        try {
            return contentResolver.query(uri, strArr, str, strArr2, str2);
        } catch (SQLiteException | IllegalArgumentException e) {
            xzb.i("Bugle", e, "SqliteWrapper: catch an exception when query");
            return null;
        }
    }

    public static Uri f(ContentResolver contentResolver, Uri uri, ContentValues contentValues) {
        try {
            return contentResolver.insert(uri, contentValues);
        } catch (SQLiteException | IllegalArgumentException e) {
            xzb.i("Bugle", e, "SqliteWrapper: catch an exception when insert");
            return null;
        }
    }

    public static /* synthetic */ ryb g(String str, String str2, String str3, String str4, String str5, String str6, yjt yjtVar, yjt yjtVar2, List list, List list2, arst arstVar, int i) {
        List list3;
        List list4;
        yjt yjtVar3;
        yjt yjtVar4;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        int a;
        int b;
        if ((i & 4096) != 0) {
            list3 = arnv.a;
        } else {
            list3 = list;
        }
        if ((i & 8192) != 0) {
            list4 = arnv.a;
        } else {
            list4 = list2;
        }
        list3.getClass();
        list4.getClass();
        List list5 = ryb.a;
        list5.getClass();
        List ay = aqjn.ay(list5);
        for (int z = aqjn.z(ay); z > 0; z--) {
            int i2 = z + 1;
            if (i2 > 0) {
                if (((-i2) & i2) == i2) {
                    a = arstVar.a(arrj.b(i2));
                    ay.set(a, ay.set(z, ay.get(a)));
                }
                do {
                    b = arstVar.b() >>> 1;
                    a = b % i2;
                } while ((b - a) + z < 0);
                ay.set(a, ay.set(z, ay.get(a)));
            } else {
                throw new IllegalArgumentException(arrj.d(0, Integer.valueOf(i2)));
            }
        }
        int i3 = i & 256;
        int i4 = i & 128;
        int i5 = i & 64;
        int i6 = i & 8;
        int i7 = i & 4;
        int i8 = i & 2;
        int i9 = i & 1;
        if ((i & 1024) != 0) {
            yjtVar3 = null;
        } else {
            yjtVar3 = yjtVar2;
        }
        if (i3 != 0) {
            yjtVar4 = null;
        } else {
            yjtVar4 = yjtVar;
        }
        if (i4 != 0) {
            str7 = null;
        } else {
            str7 = str6;
        }
        if (i5 != 0) {
            str8 = null;
        } else {
            str8 = str5;
        }
        if (i6 != 0) {
            str9 = null;
        } else {
            str9 = str4;
        }
        if (i7 != 0) {
            str10 = null;
        } else {
            str10 = str3;
        }
        if (i8 != 0) {
            str11 = null;
        } else {
            str11 = str2;
        }
        if (1 == i9) {
            str12 = null;
        } else {
            str12 = str;
        }
        List av = aqjn.av(ay, 10);
        return new ryb(r(str12, av), r(str11, av), r(str10, av), r(str9, av), r(null, av), r(null, av), r(str8, av), r(str7, av), t(yjtVar4, av), t(null, av), t(yjtVar3, av), t(null, av), s(list3, av), s(list4, av));
    }

    public static tap h(String str) {
        tap c = ParticipantsTable.c();
        c.v(null);
        c.S(-2);
        c.R(-1);
        c.Q(str);
        c.H(str);
        c.q(str);
        c.u(str);
        c.t(null);
        c.M(null);
        c.l(-1L);
        c.C(null);
        c.e(false);
        c.T(0);
        c.U(null);
        return c;
    }

    public static boolean i(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
            if (k(bindData) && !ryg.l(bindData)) {
                return true;
            }
        }
        return false;
    }

    public static boolean j(ParticipantsTable.BindData bindData) {
        String P = bindData.P();
        xze xzeVar = xca.a;
        return msx.g(P);
    }

    public static boolean k(ParticipantsTable.BindData bindData) {
        if (bindData.n() == 1) {
            return true;
        }
        return false;
    }

    public static final rxg l(String str) {
        rxg rxgVar = rxg.a;
        if (str != null) {
            List aa = arsd.aa(str, new char[]{':'});
            ArrayList arrayList = new ArrayList();
            Iterator it = aa.iterator();
            while (it.hasNext()) {
                Long v = arsd.v((String) it.next());
                if (v != null) {
                    arrayList.add(v);
                }
            }
            if (arrayList.size() != 2) {
                arrayList = null;
            }
            if (arrayList != null) {
                return new rxg(((Number) arrayList.get(0)).longValue(), ((Number) arrayList.get(1)).longValue());
            }
        }
        return rxg.a;
    }

    public static final rxg m() {
        rxg o = o();
        if (o == null) {
            return rxg.c;
        }
        return o;
    }

    public static final String n(rxg rxgVar) {
        rxgVar.getClass();
        return rxgVar.d + ":" + rxgVar.e;
    }

    public static final rxg o() {
        return (rxg) ((rxh) yyb.aL(rxh.class)).Jb().map(new rxb(qnc.l, 6)).orElse(null);
    }

    public static akrh p() {
        return aktp.e("OnSmsMessageReceivedListener");
    }

    public static agmh[] q() {
        return (agmh[]) roq.c.c;
    }

    private static final String r(String str, List list) {
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (ryb.b.contains(Character.valueOf(charAt))) {
                    sb.append(charAt);
                } else if (Character.isDigit(charAt)) {
                    int j = arro.j(charAt);
                    if (j >= 0) {
                        sb.append(((Character) list.get(j)).charValue());
                    } else {
                        throw new IllegalArgumentException("Char " + charAt + " is not a decimal digit");
                    }
                } else {
                    sb.append('x');
                }
            }
            return sb.toString();
        }
        return null;
    }

    private static final List s(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yjt yjtVar = (yjt) it.next();
            List list3 = ryb.a;
            String t = t(yjtVar, list2);
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    private static final String t(yjt yjtVar, List list) {
        return r(String.valueOf(yjtVar), list);
    }

    public vcp(byte[] bArr) {
        new HashMap();
    }
}
