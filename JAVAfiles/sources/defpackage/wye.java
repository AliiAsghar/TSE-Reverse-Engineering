package defpackage;

import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import android.provider.Telephony;
import android.text.TextUtils;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wye extends wyg {
    private static String[] z;
    private int A;
    public String a;
    public long b;
    public int c;
    public String d;
    public int e;
    public long f;
    public long g;
    public long h;
    public long i;
    public int j;
    public int k;
    public boolean l;
    public boolean m;
    public String n;
    public String o;
    public long p;
    public int q;
    public msh r;
    public wzr s;
    public int t;
    public int u;
    public String v;
    public Optional w;
    public final List x = new ArrayList();
    public boolean y = false;

    private wye() {
    }

    public static wye g(Cursor cursor, int i) {
        boolean z2;
        wye wyeVar = new wye();
        wyeVar.b = cursor.getLong(0);
        boolean z3 = true;
        wyeVar.c = cursor.getInt(1);
        wyeVar.d = cursor.getString(2);
        wyeVar.e = cursor.getInt(3);
        if (!TextUtils.isEmpty(wyeVar.d)) {
            wyeVar.d = wyi.a(wyi.b(wyeVar.d, 4), wyeVar.e);
        }
        wyeVar.f = cursor.getLong(4);
        wyeVar.g = cursor.getLong(5) * 1000;
        wyeVar.h = cursor.getLong(6) * 1000;
        wyeVar.i = cursor.getLong(7);
        wyeVar.j = cursor.getInt(8);
        wyeVar.k = cursor.getInt(9);
        if (cursor.getInt(10) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        wyeVar.l = z2;
        if (cursor.getInt(11) == 0) {
            z3 = false;
        }
        wyeVar.m = z3;
        wyeVar.n = cursor.getString(12);
        wyeVar.o = cursor.getString(13);
        wyeVar.A = cursor.getInt(14);
        wyeVar.p = cursor.getLong(15) * 1000;
        wyeVar.t = cursor.getInt(16);
        wyeVar.u = cursor.getInt(17);
        wyeVar.v = cursor.getString(18);
        if (((Boolean) ((utz) xim.h.get()).e()).booleanValue()) {
            wyeVar.w = Optional.ofNullable(vrf.a(wyeVar.o));
        }
        wyeVar.x.clear();
        wyeVar.y = false;
        wyeVar.a = ContentUris.withAppendedId(Telephony.Mms.CONTENT_URI, wyeVar.b).toString();
        int i2 = cursor.getInt(21);
        if (i2 >= 0) {
            i = i2;
        }
        wyeVar.q = i;
        return wyeVar;
    }

    public static String[] m() {
        if (z == null) {
            z = new String[]{"_id", "msg_box", "sub", "sub_cs", "m_size", "date", "date_sent", "thread_id", "pri", "st", "read", "seen", "ct_l", "tr_id", "m_type", "exp", "resp_st", "retr_st", "retr_txt", "m_id", "ct_cls", "sub_id"};
        }
        return z;
    }

    @Override // defpackage.wyb
    public final int a() {
        return 1;
    }

    @Override // defpackage.wyb
    public final int b() {
        return this.k;
    }

    @Override // defpackage.wyb
    public final long c() {
        return this.g;
    }

    @Override // defpackage.wyb
    public final String d() {
        return this.a;
    }

    @Override // defpackage.wyg
    public final long e() {
        return this.i;
    }

    public final Uri f() {
        String str = this.a;
        if (str == null) {
            return null;
        }
        return Uri.parse(str);
    }

    public final void h(wyf wyfVar) {
        this.x.add(wyfVar);
    }

    public final boolean i() {
        if (this.A == 130) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        if (this.c != 1) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        Optional optional = this.w;
        if (optional != null && optional.isPresent()) {
            if (((vre) this.w.get()).c.isPresent()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean l() {
        if (this.x.size() != 1 || !((wyf) this.x.get(0)).d()) {
            return false;
        }
        return true;
    }
}
