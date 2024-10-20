package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tap extends agmb {
    public int A;
    public String B;
    public boolean C;
    public int D;
    public String E;
    public tqr F;
    public String G;
    public byte[] H;
    public long I;
    public boolean J;
    public boolean K;
    public String L;
    public xxw M;
    public mta N;
    public rxg O;
    public vox P;
    public vox Q;
    public vov R;
    public ndp S;
    public String a;
    public qwe b;
    public qwe c;
    public int d;
    public int e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public long k;
    public String l;
    public String m;
    public String n;
    public Uri o;
    public Uri p;
    public long q;
    public String r;
    public int s;
    public int t;
    public int u;
    public boolean v;
    public String w;
    public int x;
    public String y;
    public int z;

    public tap() {
        super(a.bp());
        this.b = null;
        this.c = null;
        this.d = -2;
        this.e = -1;
        this.q = -1L;
        this.s = -1;
        this.t = 0;
        this.u = 0;
        this.v = false;
        this.x = 0;
        this.z = 0;
        this.A = 0;
        this.C = false;
        this.D = 0;
        this.F = tqr.VERIFICATION_NA;
        this.I = -1L;
        this.J = riw.j();
        this.K = true;
        this.M = xxw.UNKNOWN;
        this.N = mta.NOT_MODIFIED;
        this.O = rxi.a();
        vox voxVar = vox.PROFILE_CONTACT_SOURCE;
        this.P = voxVar;
        this.Q = voxVar;
        this.R = vov.PREFER_PROFILE_PHOTO;
    }

    public final void A(rxg rxgVar) {
        int i = this.az;
        if (i < 59440) {
            agnc.t("last_modified_by_key", i);
        }
        aC(40);
        this.O = rxgVar;
    }

    public final void B(tqr tqrVar) {
        int i = this.az;
        if (i < 31030) {
            agnc.t("latest_verification_status", i);
        }
        aC(31);
        this.F = tqrVar;
    }

    public final void C(String str) {
        aC(17);
        this.r = str;
    }

    public final void D(qwe qweVar) {
        if (this.az < 59930) {
            return;
        }
        aC(1);
        this.b = qweVar;
    }

    public final void E(qwe qweVar) {
        if (this.az < 60160) {
            return;
        }
        aC(2);
        this.c = qweVar;
    }

    public final void F(vox voxVar) {
        int i = this.az;
        if (i < 59550) {
            agnc.t("name_source", i);
        }
        aC(41);
        this.P = voxVar;
    }

    public final void G(mta mtaVar) {
        int i = this.az;
        if (i < 58620) {
            agnc.t("norm_ui_status", i);
        }
        aC(39);
        this.N = mtaVar;
    }

    public final void H(String str) {
        aC(5);
        if (!this.aA) {
            str = aabr.bb(str);
        }
        this.f = str;
    }

    public final void I(int i) {
        int i2 = this.az;
        if (i2 < 12001) {
            agnc.t("participant_type", i2);
        }
        aC(25);
        this.z = i;
    }

    public final void J(vox voxVar) {
        int i = this.az;
        if (i < 59550) {
            agnc.t("photo_source", i);
        }
        aC(42);
        this.Q = voxVar;
    }

    public final void K(String str) {
        int i = this.az;
        if (i < 33000) {
            agnc.t("profile_photo_blob_id", i);
        }
        aC(32);
        this.G = str;
    }

    public final void L(byte[] bArr) {
        int i = this.az;
        if (i < 33060) {
            agnc.t("profile_photo_encryption_key", i);
        }
        aC(33);
        this.H = bArr;
    }

    public final void M(Uri uri) {
        aC(14);
        this.o = uri;
    }

    public final void N(vov vovVar) {
        int i = this.az;
        if (i < 60060) {
            agnc.t("profile_photo_user_preference", i);
        }
        aC(43);
        this.R = vovVar;
    }

    public final void O(String str) {
        int i = this.az;
        if (i < 58090) {
            agnc.t("recipient_canonical_address", i);
        }
        aC(11);
        this.l = str;
    }

    public final void P(long j) {
        int i = this.az;
        if (i < 58090) {
            agnc.t("recipient_id", i);
        }
        aC(10);
        this.k = j;
    }

    public final void Q(String str) {
        aC(6);
        if (!this.aA) {
            str = aabr.bb(str);
        }
        this.g = str;
    }

    public final void R(int i) {
        int i2 = this.az;
        if (i2 < 2000) {
            agnc.t("sim_slot_id", i2);
        }
        aC(4);
        this.e = i;
    }

    public final void S(int i) {
        aC(3);
        this.d = i;
    }

    public final void T(int i) {
        int i2 = this.az;
        if (i2 < 2000) {
            agnc.t("subscription_color", i2);
        }
        aC(23);
        this.x = i;
    }

    public final void U(String str) {
        int i = this.az;
        if (i < 2000) {
            agnc.t("subscription_name", i);
        }
        aC(22);
        this.w = str;
    }

    public final void V(int i) {
        int i2 = this.az;
        if (i2 < 13050) {
            agnc.t("video_reachability", i2);
        }
        aC(26);
        this.A = i;
    }

    public final ParticipantsTable.BindData a() {
        return b(new sym(19));
    }

    public final ParticipantsTable.BindData b(Supplier supplier) {
        Object obj;
        qwe qweVar;
        try {
            if (oes.a() && (qweVar = this.b) != null) {
                E(qweVar);
            }
            obj = supplier.get();
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
            bindData.ar(az());
            bindData.a = this.a;
            bindData.b = this.b;
            bindData.c = this.c;
            bindData.d = this.d;
            bindData.e = this.e;
            bindData.f = this.f;
            bindData.g = this.g;
            bindData.h = this.h;
            bindData.i = this.i;
            bindData.j = this.j;
            bindData.k = this.k;
            bindData.l = this.l;
            bindData.m = this.m;
            bindData.n = this.n;
            bindData.o = this.o;
            bindData.p = this.p;
            bindData.q = this.q;
            bindData.r = this.r;
            bindData.s = this.s;
            bindData.t = this.t;
            bindData.u = this.u;
            bindData.v = this.v;
            bindData.w = this.w;
            bindData.x = this.x;
            bindData.y = this.y;
            bindData.z = this.z;
            bindData.A = this.A;
            bindData.B = this.B;
            bindData.C = this.C;
            bindData.D = this.D;
            bindData.E = this.E;
            bindData.F = this.F;
            bindData.G = this.G;
            bindData.H = this.H;
            bindData.I = this.I;
            bindData.J = this.J;
            bindData.K = this.K;
            bindData.L = this.L;
            bindData.M = this.M;
            bindData.N = this.N;
            bindData.O = this.O;
            bindData.P = this.P;
            bindData.Q = this.Q;
            bindData.R = this.R;
            bindData.S = this.S;
            bindData.cF = aA();
            return bindData;
        } catch (Throwable th) {
            throw new aglw(th);
        }
    }

    public final ParticipantsTable.BindData c() {
        ParticipantsTable.BindData b = b(new taq(1));
        b.E();
        return b;
    }

    public final void d(String str) {
        int i = this.az;
        if (i < 20060) {
            agnc.t("alias", i);
        }
        aC(27);
        this.B = str;
    }

    public final void e(boolean z) {
        aC(21);
        this.v = z;
    }

    public final void f(String str) {
        int i = this.az;
        if (i < 31020) {
            agnc.t("cms_id", i);
        }
        aC(30);
        this.E = str;
    }

    public final void g(xxw xxwVar) {
        int i = this.az;
        if (i < 58210) {
            agnc.t("cms_life_cycle", i);
        }
        aC(38);
        this.M = xxwVar;
    }

    public final void h(int i) {
        aC(18);
        this.s = i;
    }

    public final void i(int i) {
        int i2 = this.az;
        if (i2 < 1000) {
            agnc.t("color_type", i2);
        }
        aC(19);
        this.t = i;
    }

    public final void j(String str) {
        int i = this.az;
        if (i < 54040) {
            agnc.t("comparable_destination", i);
        }
        aC(8);
        if (!this.aA) {
            str = yta.a(str);
        }
        this.i = str;
    }

    public final void k(String str) {
        int i = this.az;
        if (i < 4000) {
            agnc.t("contact_destination", i);
        }
        aC(24);
        this.y = str;
    }

    public final void l(long j) {
        aC(16);
        this.q = j;
    }

    public final void m(ndp ndpVar) {
        int i = this.az;
        if (i < 60070) {
            agnc.t("contact_metadata", i);
        }
        aC(44);
        this.S = ndpVar;
    }

    public final void n(Uri uri) {
        int i = this.az;
        if (i < 59850) {
            agnc.t("contact_photo_uri", i);
        }
        aC(15);
        this.p = uri;
    }

    public final void o(String str) {
        int i = this.az;
        if (i < 54040) {
            agnc.t("country_code", i);
        }
        aC(9);
        if (!this.aA) {
            str = yta.a(str);
        }
        this.j = str;
    }

    public final void p(long j) {
        int i = this.az;
        if (i < 35010) {
            agnc.t("directory_id", i);
        }
        aC(34);
        this.I = j;
    }

    public final void q(String str) {
        aC(7);
        if (!this.aA) {
            str = aabr.bb(str);
        }
        this.h = str;
    }

    public final void r(String str) {
        int i = this.az;
        if (i < 58090) {
            agnc.t("duplicate_of", i);
        }
        aC(37);
        this.L = str;
    }

    public final void s(int i) {
        int i2 = this.az;
        if (i2 < 10027) {
            agnc.t("extended_color", i2);
        }
        aC(20);
        this.u = i;
    }

    public final void t(String str) {
        aC(13);
        if (!this.aA) {
            str = yta.a(str);
        }
        this.n = str;
    }

    public final void u(String str) {
        aC(12);
        if (!this.aA) {
            str = yta.a(str);
        }
        this.m = str;
    }

    public final void v(String str) {
        aC(0);
        this.a = str;
    }

    public final void w(boolean z) {
        int i = this.az;
        if (i < 55010) {
            agnc.t("is_check_constraint_enabled_via_phenotype", i);
        }
        aC(35);
        this.J = z;
    }

    public final void x(boolean z) {
        int i = this.az;
        if (i < 24060) {
            agnc.t("is_spam", i);
        }
        aC(28);
        this.C = z;
    }

    public final void y(int i) {
        int i2 = this.az;
        if (i2 < 30000) {
            agnc.t("is_spam_source", i2);
        }
        aC(29);
        this.D = i;
    }

    public final void z(boolean z) {
        int i = this.az;
        if (i < 55010) {
            agnc.t("is_valid_phone_number_data", i);
        }
        aC(36);
        this.K = z;
    }
}
