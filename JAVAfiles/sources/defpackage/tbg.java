package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import java.util.BitSet;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tbg extends agmb {
    public String A;
    public String B;
    public byte[] C;
    public byte[] D;
    public boolean E;
    public long F;
    public String G;
    public String H;
    public long I;
    public String J;
    public String K;
    public boolean L;
    public long M;
    public byte[] N;
    public byte[] O;
    public boolean P;
    public boolean Q;
    public long R;
    public String S;
    public tqj T;
    public aggp U;
    public tqw V;
    public pyz W;
    public tqq X;
    public tqi Y;
    public String a;
    public MessageIdType b;
    public String c;
    public Uri d;
    public String e;
    public Uri f;
    public Uri g;
    public int h;
    public int i;
    public long j;
    public Uri k;
    public long l;
    public tql m;
    public tqd n;
    public ConversationIdType o;
    public tqa p;
    public tqa q;
    public long r;
    public double s;
    public double t;
    public Uri u;
    public String v;
    public Uri w;
    public int x;
    public int y;
    public String z;

    public tbg() {
        super(a.bp());
        this.b = rvc.a;
        this.h = -1;
        this.i = -1;
        this.l = 0L;
        this.m = tql.SUCCEEDED;
        this.n = tqd.NOT_FROM_CMS;
        this.o = ruy.a;
        this.p = new tqa(-1);
        this.q = new tqa(-1);
        this.r = -1L;
        this.s = 0.0d;
        this.t = 0.0d;
        this.x = 13;
        this.y = 0;
        this.E = false;
        this.F = 0L;
        this.L = false;
        this.M = 0L;
        this.Q = false;
        this.T = tqj.STANDARD;
        this.V = tqw.UNKNOWN;
        this.W = null;
        this.X = tqq.NONE;
        this.Y = tqi.DEFAULT_NO_VERDICT;
    }

    public final void A(int i) {
        aC(8);
        this.i = i;
    }

    public final void B(String str) {
        aC(0);
        this.a = str;
    }

    public final void C(tqi tqiVar) {
        int i = this.az;
        if (i < 60240) {
            agnc.t("image_display_state", i);
        }
        aC(50);
        this.Y = tqiVar;
    }

    public final void D(double d) {
        int i = this.az;
        if (i < 10005) {
            agnc.t("latitude", i);
        }
        aC(19);
        this.t = d;
    }

    public final void E(String str) {
        int i = this.az;
        if (i < 52050) {
            agnc.t("local_cache_path", i);
        }
        aC(44);
        this.S = str;
    }

    public final void F(double d) {
        int i = this.az;
        if (i < 10005) {
            agnc.t("longitude", i);
        }
        aC(18);
        this.s = d;
    }

    public final void G(byte[] bArr) {
        int i = this.az;
        if (i < 30040) {
            agnc.t("media_encryption_key", i);
        }
        aC(39);
        this.N = bArr;
    }

    public final void H(long j) {
        int i = this.az;
        if (i < 7000) {
            agnc.t("media_modified_timestamp", i);
        }
        aC(17);
        this.r = j;
    }

    public final void I(tqj tqjVar) {
        int i = this.az;
        if (i < 58150) {
            agnc.t("media_send_type", i);
        }
        aC(45);
        this.T = tqjVar;
    }

    public final void J(MessageIdType messageIdType) {
        aC(1);
        this.b = messageIdType;
    }

    public final void K(boolean z) {
        int i = this.az;
        if (i < 52030) {
            agnc.t("missing_entry_in_telephony", i);
        }
        aC(41);
        this.P = z;
    }

    public final void L(Uri uri) {
        int i = this.az;
        if (i < 10021) {
            agnc.t("original_uri", i);
        }
        aC(5);
        this.f = uri;
    }

    public final void M(String str) {
        int i = this.az;
        if (i < 10017) {
            agnc.t("preview_content_type", i);
        }
        aC(21);
        this.v = str;
    }

    public final void N(Uri uri) {
        int i = this.az;
        if (i < 10017) {
            agnc.t("preview_content_uri", i);
        }
        aC(20);
        this.u = uri;
    }

    public final void O(pyz pyzVar) {
        int i = this.az;
        if (i < 60080) {
            agnc.t("processing_id", i);
        }
        aC(48);
        this.W = pyzVar;
    }

    public final void P(Uri uri) {
        int i = this.az;
        if (i < 4020) {
            agnc.t("output_uri", i);
        }
        aC(10);
        this.k = uri;
    }

    public final void Q(tql tqlVar) {
        int i = this.az;
        if (i < 4020) {
            agnc.t("processing_status", i);
        }
        aC(12);
        this.m = tqlVar;
    }

    public final void R(tqq tqqVar) {
        int i = this.az;
        if (i < 60230) {
            agnc.t("rich_card_media_download_failure_reason", i);
        }
        aC(49);
        this.X = tqqVar;
    }

    public final void S(int i) {
        int i2 = this.az;
        if (i2 < 14010) {
            agnc.t("source", i2);
        }
        aC(23);
        this.x = i;
    }

    public final void T(tqa tqaVar) {
        int i = this.az;
        if (i < 5020) {
            agnc.t("sticker_id", i);
        }
        aC(16);
        this.q = tqaVar;
    }

    public final void U(tqa tqaVar) {
        int i = this.az;
        if (i < 5020) {
            agnc.t("sticker_set_id", i);
        }
        aC(15);
        this.p = tqaVar;
    }

    public final void V(Uri uri) {
        int i = this.az;
        if (i < 29060) {
            agnc.t("storage_uri", i);
        }
        aC(6);
        this.g = uri;
    }

    public final void W(long j) {
        int i = this.az;
        if (i < 4020) {
            agnc.t("target_size", i);
        }
        aC(11);
        this.l = j;
    }

    public final void X(String str) {
        aC(2);
        if (!this.aA) {
            str = yta.a(str);
        }
        this.c = str;
    }

    public final void Y(long j) {
        int i = this.az;
        if (i < 3010) {
            agnc.t("timestamp", i);
        }
        aC(9);
        this.j = j;
    }

    public final void Z(Uri uri) {
        aC(3);
        this.d = uri;
    }

    public final PartsTable.BindData a() {
        return b(new taq(8));
    }

    public final void aa(tqw tqwVar) {
        int i = this.az;
        if (i < 58770) {
            agnc.t("validation_status", i);
        }
        aC(47);
        this.V = tqwVar;
    }

    public final void ab(aggp aggpVar) {
        int i = this.az;
        if (i < 59470) {
            agnc.t("voice_metadata", i);
        }
        aC(46);
        this.U = aggpVar;
    }

    public final void ac(int i) {
        aC(7);
        this.h = i;
    }

    public final PartsTable.BindData b(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        PartsTable.BindData bindData = (PartsTable.BindData) obj;
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
        bindData.T = this.T;
        bindData.U = this.U;
        bindData.V = this.V;
        bindData.W = this.W;
        bindData.X = this.X;
        bindData.Y = this.Y;
        bindData.cF = aA();
        return bindData;
    }

    public final void c(PartsTable.BindData bindData, boolean z, BitSet bitSet) {
        BitSet bitSet2;
        if (bitSet == null) {
            bitSet2 = null;
        } else {
            bitSet2 = (BitSet) bitSet.clone();
        }
        this.ax = bitSet2;
        if (z) {
            BitSet bitSet3 = this.ax;
            if (bitSet3 != null) {
                bitSet3.clear(0);
            }
        } else {
            BitSet bitSet4 = this.ax;
            if (bitSet4 == null || bitSet4.get(0)) {
                this.a = bindData.z();
            }
        }
        BitSet bitSet5 = this.ax;
        if (bitSet5 == null || bitSet5.get(1)) {
            this.b = bindData.p();
        }
        BitSet bitSet6 = this.ax;
        if (bitSet6 == null || bitSet6.get(2)) {
            this.c = bindData.B();
        }
        BitSet bitSet7 = this.ax;
        if (bitSet7 == null || bitSet7.get(3)) {
            this.d = bindData.n();
        }
        BitSet bitSet8 = this.ax;
        if (bitSet8 == null || bitSet8.get(4)) {
            this.e = bindData.x();
        }
        BitSet bitSet9 = this.ax;
        if (bitSet9 == null || bitSet9.get(5)) {
            bindData.ao(5, "original_uri");
            this.f = bindData.f;
        }
        BitSet bitSet10 = this.ax;
        if (bitSet10 == null || bitSet10.get(6)) {
            bindData.ao(6, "storage_uri");
            this.g = bindData.g;
        }
        BitSet bitSet11 = this.ax;
        if (bitSet11 == null || bitSet11.get(7)) {
            bindData.ao(7, "width");
            this.h = bindData.h;
        }
        BitSet bitSet12 = this.ax;
        if (bitSet12 == null || bitSet12.get(8)) {
            bindData.ao(8, "height");
            this.i = bindData.i;
        }
        BitSet bitSet13 = this.ax;
        if (bitSet13 == null || bitSet13.get(9)) {
            bindData.ao(9, "timestamp");
            this.j = bindData.j;
        }
        BitSet bitSet14 = this.ax;
        if (bitSet14 == null || bitSet14.get(10)) {
            bindData.ao(10, "output_uri");
            this.k = bindData.k;
        }
        BitSet bitSet15 = this.ax;
        if (bitSet15 == null || bitSet15.get(11)) {
            bindData.ao(11, "target_size");
            this.l = bindData.l;
        }
        BitSet bitSet16 = this.ax;
        if (bitSet16 == null || bitSet16.get(12)) {
            bindData.ao(12, "processing_status");
            this.m = bindData.m;
        }
        BitSet bitSet17 = this.ax;
        if (bitSet17 == null || bitSet17.get(13)) {
            bindData.ao(13, "cms_attachment_processing_status");
            this.n = bindData.n;
        }
        BitSet bitSet18 = this.ax;
        if (bitSet18 == null || bitSet18.get(14)) {
            this.o = bindData.o();
        }
        BitSet bitSet19 = this.ax;
        if (bitSet19 == null || bitSet19.get(15)) {
            bindData.ao(15, "sticker_set_id");
            this.p = bindData.p;
        }
        BitSet bitSet20 = this.ax;
        if (bitSet20 == null || bitSet20.get(16)) {
            bindData.ao(16, "sticker_id");
            this.q = bindData.q;
        }
        BitSet bitSet21 = this.ax;
        if (bitSet21 == null || bitSet21.get(17)) {
            bindData.ao(17, "media_modified_timestamp");
            this.r = bindData.r;
        }
        BitSet bitSet22 = this.ax;
        if (bitSet22 == null || bitSet22.get(18)) {
            bindData.ao(18, "longitude");
            this.s = bindData.s;
        }
        BitSet bitSet23 = this.ax;
        if (bitSet23 == null || bitSet23.get(19)) {
            bindData.ao(19, "latitude");
            this.t = bindData.t;
        }
        BitSet bitSet24 = this.ax;
        if (bitSet24 == null || bitSet24.get(20)) {
            bindData.ao(20, "preview_content_uri");
            this.u = bindData.u;
        }
        BitSet bitSet25 = this.ax;
        if (bitSet25 == null || bitSet25.get(21)) {
            bindData.ao(21, "preview_content_type");
            this.v = bindData.v;
        }
        BitSet bitSet26 = this.ax;
        if (bitSet26 == null || bitSet26.get(22)) {
            bindData.ao(22, "fallback_uri");
            this.w = bindData.w;
        }
        BitSet bitSet27 = this.ax;
        if (bitSet27 == null || bitSet27.get(23)) {
            bindData.ao(23, "source");
            this.x = bindData.x;
        }
        BitSet bitSet28 = this.ax;
        if (bitSet28 == null || bitSet28.get(24)) {
            bindData.ao(24, "bundle_index");
            this.y = bindData.y;
        }
        BitSet bitSet29 = this.ax;
        if (bitSet29 == null || bitSet29.get(25)) {
            this.z = bindData.u();
        }
        BitSet bitSet30 = this.ax;
        if (bitSet30 == null || bitSet30.get(26)) {
            this.A = bindData.t();
        }
        BitSet bitSet31 = this.ax;
        if (bitSet31 == null || bitSet31.get(27)) {
            bindData.ao(27, "cms_full_size_blob_id");
            this.B = bindData.B;
        }
        BitSet bitSet32 = this.ax;
        if (bitSet32 == null || bitSet32.get(28)) {
            bindData.ao(28, "cms_media_encryption_key");
            this.C = bindData.C;
        }
        BitSet bitSet33 = this.ax;
        if (bitSet33 == null || bitSet33.get(29)) {
            bindData.ao(29, "cms_compressed_media_encryption_key");
            this.D = bindData.D;
        }
        BitSet bitSet34 = this.ax;
        if (bitSet34 == null || bitSet34.get(30)) {
            this.E = bindData.C();
        }
        BitSet bitSet35 = this.ax;
        if (bitSet35 == null || bitSet35.get(31)) {
            this.F = bindData.h();
        }
        BitSet bitSet36 = this.ax;
        if (bitSet36 == null || bitSet36.get(32)) {
            bindData.ao(32, "expressive_sticker_name");
            this.G = bindData.G;
        }
        BitSet bitSet37 = this.ax;
        if (bitSet37 == null || bitSet37.get(33)) {
            this.H = bindData.y();
        }
        BitSet bitSet38 = this.ax;
        if (bitSet38 == null || bitSet38.get(34)) {
            this.I = bindData.l();
        }
        BitSet bitSet39 = this.ax;
        if (bitSet39 == null || bitSet39.get(35)) {
            this.J = bindData.w();
        }
        BitSet bitSet40 = this.ax;
        if (bitSet40 == null || bitSet40.get(36)) {
            this.K = bindData.v();
        }
        BitSet bitSet41 = this.ax;
        if (bitSet41 == null || bitSet41.get(37)) {
            this.L = bindData.D();
        }
        BitSet bitSet42 = this.ax;
        if (bitSet42 == null || bitSet42.get(38)) {
            this.M = bindData.k();
        }
        BitSet bitSet43 = this.ax;
        if (bitSet43 == null || bitSet43.get(39)) {
            this.N = bindData.F();
        }
        BitSet bitSet44 = this.ax;
        if (bitSet44 == null || bitSet44.get(40)) {
            this.O = bindData.E();
        }
        BitSet bitSet45 = this.ax;
        if (bitSet45 == null || bitSet45.get(41)) {
            bindData.ao(41, "missing_entry_in_telephony");
            this.P = bindData.P;
        }
        BitSet bitSet46 = this.ax;
        if (bitSet46 == null || bitSet46.get(42)) {
            bindData.ao(42, "awaiting_reverse_sync");
            this.Q = bindData.Q;
        }
        BitSet bitSet47 = this.ax;
        if (bitSet47 == null || bitSet47.get(43)) {
            this.R = bindData.m();
        }
        BitSet bitSet48 = this.ax;
        if (bitSet48 == null || bitSet48.get(44)) {
            this.S = bindData.A();
        }
        BitSet bitSet49 = this.ax;
        if (bitSet49 == null || bitSet49.get(45)) {
            bindData.ao(45, "media_send_type");
            this.T = bindData.T;
        }
        BitSet bitSet50 = this.ax;
        if (bitSet50 == null || bitSet50.get(46)) {
            bindData.ao(46, "voice_metadata");
            this.U = bindData.U;
        }
        BitSet bitSet51 = this.ax;
        if (bitSet51 == null || bitSet51.get(47)) {
            bindData.ao(47, "validation_status");
            this.V = bindData.V;
        }
        BitSet bitSet52 = this.ax;
        if (bitSet52 == null || bitSet52.get(48)) {
            bindData.ao(48, "processing_id");
            this.W = bindData.W;
        }
        BitSet bitSet53 = this.ax;
        if (bitSet53 == null || bitSet53.get(49)) {
            bindData.ao(49, "rich_card_media_download_failure_reason");
            this.X = bindData.X;
        }
        BitSet bitSet54 = this.ax;
        if (bitSet54 != null && !bitSet54.get(50)) {
            return;
        }
        bindData.ao(50, "image_display_state");
        this.Y = bindData.Y;
    }

    public final void d() {
        b(new taq(7)).s();
    }

    public final void e(boolean z) {
        int i = this.az;
        if (i < 53040) {
            agnc.t("awaiting_reverse_sync", i);
        }
        aC(42);
        this.Q = z;
    }

    public final void f(String str) {
        int i = this.az;
        if (i < 59570) {
            agnc.t("blob_gaia_email", i);
        }
        aC(26);
        this.A = str;
    }

    public final void g(String str) {
        int i = this.az;
        if (i < 17020) {
            agnc.t("blob_id", i);
        }
        aC(25);
        this.z = str;
    }

    public final void h(boolean z) {
        int i = this.az;
        if (i < 18000) {
            agnc.t("blob_upload_permanent_failure", i);
        }
        aC(30);
        this.E = z;
    }

    public final void i(long j) {
        int i = this.az;
        if (i < 19030) {
            agnc.t("blob_upload_timestamp", i);
        }
        aC(31);
        this.F = j;
    }

    public final void j(int i) {
        int i2 = this.az;
        if (i2 < 17010) {
            agnc.t("bundle_index", i2);
        }
        aC(24);
        this.y = i;
    }

    public final void k(tqd tqdVar) {
        int i = this.az;
        if (i < 44010) {
            agnc.t("cms_attachment_processing_status", i);
        }
        aC(13);
        this.n = tqdVar;
    }

    public final void l(String str) {
        int i = this.az;
        if (i < 40040) {
            agnc.t("cms_compressed_blob_id", i);
        }
        aC(36);
        this.K = str;
    }

    public final void m(byte[] bArr) {
        int i = this.az;
        if (i < 42070) {
            agnc.t("cms_compressed_media_encryption_key", i);
        }
        aC(29);
        this.D = bArr;
    }

    public final void n(String str) {
        int i = this.az;
        if (i < 40040) {
            agnc.t("cms_full_size_blob_id", i);
        }
        aC(27);
        this.B = str;
    }

    public final void o(byte[] bArr) {
        int i = this.az;
        if (i < 42010) {
            agnc.t("cms_media_encryption_key", i);
        }
        aC(28);
        this.C = bArr;
    }

    public final void p(String str) {
        int i = this.az;
        if (i < 27000) {
            agnc.t("compressed_blob_id", i);
        }
        aC(35);
        this.J = str;
    }

    public final void q(boolean z) {
        int i = this.az;
        if (i < 27000) {
            agnc.t("compressed_blob_upload_permanent_failure", i);
        }
        aC(37);
        this.L = z;
    }

    public final void r(long j) {
        int i = this.az;
        if (i < 27000) {
            agnc.t("compressed_blob_upload_timestamp", i);
        }
        aC(38);
        this.M = j;
    }

    public final void s(byte[] bArr) {
        int i = this.az;
        if (i < 30040) {
            agnc.t("compressed_media_encryption_key", i);
        }
        aC(40);
        this.O = bArr;
    }

    public final void t(String str) {
        aC(4);
        this.e = str;
    }

    public final void u(ConversationIdType conversationIdType) {
        aC(14);
        this.o = conversationIdType;
    }

    public final void v(long j) {
        int i = this.az;
        if (i < 26040) {
            agnc.t("duration", i);
        }
        aC(34);
        this.I = j;
    }

    public final void w(String str) {
        int i = this.az;
        if (i < 22060) {
            agnc.t("expressive_sticker_name", i);
        }
        aC(32);
        this.G = str;
    }

    public final void x(Uri uri) {
        int i = this.az;
        if (i < 13000) {
            agnc.t("fallback_uri", i);
        }
        aC(22);
        this.w = uri;
    }

    public final void y(String str) {
        int i = this.az;
        if (i < 26000) {
            agnc.t("file_name", i);
        }
        aC(33);
        this.H = str;
    }

    public final void z(long j) {
        int i = this.az;
        if (i < 52050) {
            agnc.t("file_size_bytes", i);
        }
        aC(43);
        this.R = j;
    }
}
