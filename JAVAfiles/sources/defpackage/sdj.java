package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.aglz;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sdj extends aglz {
    public MessageIdType a;
    public MessageIdType b;
    public long c;
    public MessagesTable.BindData d;
    public String e;
    public int f;
    public String g;
    public String h;
    public String i;
    public String j;
    public ParticipantsTable.BindData k;
    public String[] l;
    public String[] m;
    public Uri[] n;
    public String[] o;
    public String[] p;
    public long[] q;
    public long[] r;
    public PartsTable.BindData[] s;
    public String t;
    public long u;
    public String v;
    public String w;
    public boolean x;
    public ssi y;

    public sdj() {
        MessageIdType messageIdType = rvc.a;
        this.a = messageIdType;
        this.b = messageIdType;
        this.c = 0L;
        this.f = -2;
        this.u = 0L;
        this.x = false;
    }

    private final String[] h() {
        ao(9, "_id");
        return this.l;
    }

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "MessageRepliesView [message_replies.message_replies_message_id: %s,\n  messages.messages__id: %s,\n  messages.messages_received_timestamp: %s,\n  participants.participants__id: %s,\n  participants.participants_sub_id: %s,\n  participants.participants_normalized_destination: %s,\n  participants.participants_display_destination: %s,\n  participants.participants_full_name: %s,\n  participants.participants_first_name: %s,\n  parts.parts__id: %s,\n  parts.parts_text: %s,\n  parts.parts_uri: %s,\n  parts.parts_content_type: %s,\n  parts.parts_file_name: %s,\n  parts.parts_duration: %s,\n  parts.parts_rowid: %s,\n  link_preview.link_preview_trigger_url: %s,\n  link_preview.link_preview_expiration_time_millis: %s,\n  link_preview.link_preview_link_title: %s,\n  link_preview.link_preview_link_image_url: %s,\n  link_preview.link_preview_link_preview_failed: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), aA(this.l), aA(this.m), az(this.n), aA(this.o), aA(this.p), ay(this.q), ay(this.r), String.valueOf(this.t), String.valueOf(this.u), String.valueOf(this.v), String.valueOf(this.w), String.valueOf(this.x));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        valueOf.intValue();
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        Uri uri;
        lbz lbzVar = (lbz) agmqVar;
        aq();
        this.cJ = lbzVar.dx();
        boolean z = false;
        if (lbzVar.db(0)) {
            this.a = new MessageIdType(lbzVar.getLong(lbzVar.cI(0, sdp.a)));
            fE(0);
        }
        if (lbzVar.db(1)) {
            this.b = new MessageIdType(lbzVar.getLong(lbzVar.cI(1, sdp.a)));
            fE(1);
        }
        if (lbzVar.db(2)) {
            this.c = lbzVar.getLong(lbzVar.cI(2, sdp.a));
            fE(2);
        }
        if (lbzVar.db(3)) {
            this.e = lbzVar.getString(lbzVar.cI(3, sdp.a));
            fE(3);
        }
        if (lbzVar.db(4)) {
            this.f = lbzVar.getInt(lbzVar.cI(4, sdp.a));
            fE(4);
        }
        if (lbzVar.db(5)) {
            this.g = aabr.bb(lbzVar.getString(lbzVar.cI(5, sdp.a)));
            fE(5);
        }
        if (lbzVar.db(6)) {
            this.h = aabr.bb(lbzVar.getString(lbzVar.cI(6, sdp.a)));
            fE(6);
        }
        if (lbzVar.db(7)) {
            this.i = yta.a(lbzVar.getString(lbzVar.cI(7, sdp.a)));
            fE(7);
        }
        if (lbzVar.db(8)) {
            this.j = yta.a(lbzVar.getString(lbzVar.cI(8, sdp.a)));
            fE(8);
        }
        if (lbzVar.db(9)) {
            this.l = (String[]) agnc.z(null, lbz.dm(lbzVar.getString(lbzVar.cI(9, sdp.a))), new String[0]);
            fE(9);
        }
        if (lbzVar.db(10)) {
            String[] dm = lbz.dm(lbzVar.getString(lbzVar.cI(10, sdp.a)));
            for (int i = 0; i < dm.length; i++) {
                dm[i] = yta.a(dm[i]);
            }
            this.m = (String[]) agnc.z(null, dm, new String[0]);
            fE(10);
        }
        if (lbzVar.db(11)) {
            String[] dm2 = lbz.dm(lbzVar.getString(lbzVar.cI(11, sdp.a)));
            int length = dm2.length;
            Uri[] uriArr = new Uri[length];
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                String str = dm2[i2];
                int i4 = i3 + 1;
                if (str != null && str.length() != 0) {
                    uri = Uri.parse(str);
                } else {
                    uri = null;
                }
                uriArr[i3] = uri;
                i2++;
                i3 = i4;
            }
            this.n = (Uri[]) agnc.z(null, uriArr, new Uri[0]);
            fE(11);
        }
        if (lbzVar.db(12)) {
            this.o = (String[]) agnc.z(null, lbz.dm(lbzVar.getString(lbzVar.cI(12, sdp.a))), new String[0]);
            fE(12);
        }
        if (lbzVar.db(13)) {
            this.p = (String[]) agnc.z(null, lbz.dm(lbzVar.getString(lbzVar.cI(13, sdp.a))), new String[0]);
            fE(13);
        }
        if (lbzVar.db(14)) {
            this.q = agnc.y(null, lbz.dl(lbzVar.getString(lbzVar.cI(14, sdp.a))));
            fE(14);
        }
        if (lbzVar.db(15)) {
            this.r = agnc.y(null, lbz.dl(lbzVar.getString(lbzVar.cI(15, sdp.a))));
            fE(15);
        }
        if (lbzVar.db(16)) {
            this.t = lbzVar.getString(lbzVar.cI(16, sdp.a));
            fE(16);
        }
        if (lbzVar.db(17)) {
            this.u = lbzVar.getLong(lbzVar.cI(17, sdp.a));
            fE(17);
        }
        if (lbzVar.db(18)) {
            this.v = yta.a(lbzVar.getString(lbzVar.cI(18, sdp.a)));
            fE(18);
        }
        if (lbzVar.db(19)) {
            this.w = lbzVar.getString(lbzVar.cI(19, sdp.a));
            fE(19);
        }
        if (lbzVar.db(20)) {
            if (lbzVar.getInt(lbzVar.cI(20, sdp.a)) == 1) {
                z = true;
            }
            this.x = z;
            fE(20);
        }
        g();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sdj)) {
            return false;
        }
        sdj sdjVar = (sdj) obj;
        if (super.aC(sdjVar.cJ) && Objects.equals(this.a, sdjVar.a) && Objects.equals(this.b, sdjVar.b) && this.c == sdjVar.c && Objects.equals(this.e, sdjVar.e) && this.f == sdjVar.f && Objects.equals(this.g, sdjVar.g) && Objects.equals(this.h, sdjVar.h) && Objects.equals(this.i, sdjVar.i) && Objects.equals(this.j, sdjVar.j) && Arrays.equals(this.l, sdjVar.l) && Arrays.equals(this.m, sdjVar.m) && Arrays.equals(this.n, sdjVar.n) && Arrays.equals(this.o, sdjVar.o) && Arrays.equals(this.p, sdjVar.p) && Arrays.equals(this.q, sdjVar.q) && Arrays.equals(this.r, sdjVar.r) && Objects.equals(this.t, sdjVar.t) && this.u == sdjVar.u && Objects.equals(this.v, sdjVar.v) && Objects.equals(this.w, sdjVar.w) && this.x == sdjVar.x) {
            return true;
        }
        return false;
    }

    public final MessageIdType f() {
        ao(0, "message_id");
        return this.a;
    }

    public final void g() {
        Integer valueOf;
        Object obj;
        long[] jArr;
        int length;
        int length2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        sxn c = MessagesTable.c();
        ao(1, "_id");
        c.v(this.b);
        ao(2, "received_timestamp");
        c.X(this.c);
        this.d = c.a();
        tap d = ParticipantsTable.d();
        ao(3, "_id");
        d.v(this.e);
        ao(4, "sub_id");
        d.S(this.f);
        ao(5, "normalized_destination");
        d.H(this.g);
        ao(6, "display_destination");
        d.q(this.h);
        ao(7, "full_name");
        d.u(this.i);
        ao(8, "first_name");
        d.t(this.j);
        this.k = d.a();
        ArrayList arrayList = new ArrayList();
        obj = agnc.c.f.get();
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (booleanValue) {
            jArr = this.r;
        } else {
            jArr = null;
        }
        if (booleanValue) {
            if (jArr != null && (length2 = jArr.length) != 0 && (length2 != 1 || jArr[0] != 0)) {
                length = h().length;
            }
            length = 0;
        } else {
            if (h() != null) {
                length = h().length;
            }
            length = 0;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < length; i++) {
            if (booleanValue) {
                long j = jArr[i];
                if (j != 0) {
                    Long valueOf2 = Long.valueOf(j);
                    if (!hashSet.contains(valueOf2)) {
                        hashSet.add(valueOf2);
                    }
                }
            }
            tbg c2 = PartsTable.c();
            c2.B(h()[i]);
            ao(10, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
            c2.X(this.m[i]);
            ao(11, ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
            c2.Z(this.n[i]);
            ao(12, "content_type");
            c2.t(this.o[i]);
            if (intValue >= 26000) {
                ao(13, "file_name");
                c2.y(this.p[i]);
            }
            if (intValue >= 26040) {
                ao(14, "duration");
                c2.v(this.q[i]);
            }
            arrayList.add(c2.a());
        }
        this.s = (PartsTable.BindData[]) arrayList.toArray(new PartsTable.BindData[0]);
        ssj b = sss.b();
        ao(16, "trigger_url");
        b.m(this.t);
        ao(17, "expiration_time_millis");
        b.d(this.u);
        ao(18, "link_title");
        b.k(this.v);
        ao(19, "link_image_url");
        b.h(this.w);
        if (intValue >= 22020) {
            ao(20, "link_preview_failed");
            b.i(this.x);
        }
        this.y = b.a();
    }

    public final int hashCode() {
        aday adayVar;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        return Objects.hash(adayVar, this.a, this.b, Long.valueOf(this.c), this.e, Integer.valueOf(this.f), this.g, this.h, this.i, this.j, Integer.valueOf(Arrays.hashCode(this.l)), Integer.valueOf(Arrays.hashCode(this.m)), Integer.valueOf(Arrays.hashCode(this.n)), Integer.valueOf(Arrays.hashCode(this.o)), Integer.valueOf(Arrays.hashCode(this.p)), Integer.valueOf(Arrays.hashCode(this.q)), Integer.valueOf(Arrays.hashCode(this.r)), this.t, Long.valueOf(this.u), this.v, this.w, Boolean.valueOf(this.x), null);
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "MessageRepliesView -- REDACTED");
        }
        return a();
    }
}
