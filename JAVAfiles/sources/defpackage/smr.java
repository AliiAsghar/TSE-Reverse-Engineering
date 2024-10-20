package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.aglz;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class smr extends aglz<sna, sne, snf, smr, smv> implements agma<ConversationIdType> {
    public String A;
    public String F;
    public String I;
    public String J;
    public String K;
    public String T;
    public String U;
    public String Z;
    public String aa;
    public String ab;
    public byte[] ac;
    public ConversationIdType ai;
    public ConversationIdType aj;
    public qpd ak;
    public xxw al;
    public String am;
    public Optional an;
    public Optional ao;
    public boolean ap;
    public boolean aq;
    public vst ar;
    public vvh as;
    public int at;
    public utk au;
    public utj av;
    public String aw;
    public String c;
    public String e;
    public String g;
    public String h;
    public Uri i;
    public String j;
    public String l;
    public String m;
    public Uri n;
    public String o;
    public String t;
    public String w;
    public String x;
    public String y;
    public String z;
    public ConversationIdType a = ruy.a;
    public xhv b = new xhv();
    public tqh d = tqh.NAME_IS_AUTOMATIC;
    public MessageIdType f = rvc.a;
    public boolean k = false;
    public int p = 0;
    public tqc q = tqc.UNARCHIVED;
    public long r = 0;
    public long s = 0;
    public long u = -1;
    public long v = -1;
    public qwe B = null;
    public qss C = null;
    public int D = 0;
    public boolean E = true;
    public boolean G = true;
    public boolean H = false;
    public int L = 0;
    public long M = -1;
    public int N = 0;
    public int O = 0;
    public int P = 0;
    public boolean Q = false;
    public boolean R = false;
    public long S = 0;
    public boolean V = false;
    public int W = 0;
    public long X = 0;
    public long Y = 0;
    public long ad = 0;
    public long ae = -1;
    public boolean af = true;
    public vtm ag = new vtm(0);
    public boolean ah = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public smr() {
        ConversationIdType conversationIdType = ruy.a;
        this.ai = conversationIdType;
        this.aj = conversationIdType;
        this.ak = qpd.b(0);
        this.al = xxw.UNKNOWN;
        this.an = uxi.g(-1L);
        this.ao = uxi.g(-1L);
        this.ap = false;
        this.aq = false;
        this.as = vvh.a;
        this.at = 0;
        this.au = utk.a;
        this.av = null;
    }

    public final tqc A() {
        ao(16, "archive_status");
        return this.q;
    }

    public final tqh B() {
        ao(3, "name_is_automatic");
        return this.d;
    }

    public final vst C() {
        ao(69, "custom_theme");
        return this.ar;
    }

    public final vtm D() {
        ao(58, "rcs_group_capabilities");
        return this.ag;
    }

    public final vvh E() {
        ao(70, "mms_group_upgrade_status");
        return this.as;
    }

    public final xhv F() {
        ao(1, "sms_thread_id");
        return this.b;
    }

    public final xxw G() {
        ao(63, "cms_life_cycle");
        return this.al;
    }

    public final Optional H() {
        ao(66, "rcs_group_last_sync_timestamp");
        return this.ao;
    }

    public final Optional I() {
        ao(65, "recipient_offline_timestamp_ms");
        return this.an;
    }

    public final String J() {
        ao(51, "cms_id");
        return this.Z;
    }

    public final String K() {
        ao(26, "current_self_id");
        return this.A;
    }

    public final String L() {
        ao(14, "draft_preview_content_type");
        return this.o;
    }

    public final String M() {
        ao(11, "draft_snippet_text");
        return this.l;
    }

    public final String N() {
        ao(12, "draft_subject_text");
        return this.m;
    }

    public final String O() {
        ao(19, "icon");
        return this.t;
    }

    public final String P() {
        ao(2, "name");
        return this.c;
    }

    public final String Q() {
        ao(31, "notification_sound_uri");
        return this.F;
    }

    public final String R() {
        ao(35, "participant_id_list");
        return this.J;
    }

    public final String S() {
        ao(24, "participant_normalized_destination");
        return this.y;
    }

    public final String T() {
        ao(9, "preview_content_type");
        return this.j;
    }

    public final String U() {
        ao(53, "rcs_conference_uri");
        return this.ab;
    }

    public final String V() {
        ao(52, "rcs_group_id");
        return this.aa;
    }

    public final String W() {
        ao(64, "rcs_group_self_msisdn");
        return this.am;
    }

    public final String X() {
        ao(34, "sms_service_center");
        return this.I;
    }

    public final String Y() {
        ao(6, "snippet_text");
        return this.g;
    }

    public final String Z() {
        ao(7, "subject_text");
        return this.h;
    }

    @Override // defpackage.aglz
    public final String a() {
        String str;
        Locale locale = Locale.US;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.g);
        String valueOf8 = String.valueOf(this.h);
        String valueOf9 = String.valueOf(this.i);
        String valueOf10 = String.valueOf(this.j);
        String valueOf11 = String.valueOf(this.k);
        String valueOf12 = String.valueOf(this.l);
        String valueOf13 = String.valueOf(this.m);
        String valueOf14 = String.valueOf(this.n);
        String valueOf15 = String.valueOf(this.o);
        String valueOf16 = String.valueOf(this.p);
        String valueOf17 = String.valueOf(this.q);
        String valueOf18 = String.valueOf(this.r);
        String valueOf19 = String.valueOf(this.s);
        String valueOf20 = String.valueOf(this.t);
        String valueOf21 = String.valueOf(this.u);
        String valueOf22 = String.valueOf(this.v);
        String valueOf23 = String.valueOf(this.w);
        String valueOf24 = String.valueOf(this.x);
        String valueOf25 = String.valueOf(this.y);
        String valueOf26 = String.valueOf(this.z);
        String valueOf27 = String.valueOf(this.A);
        String valueOf28 = String.valueOf(this.B);
        String valueOf29 = String.valueOf(this.C);
        String valueOf30 = String.valueOf(this.D);
        String valueOf31 = String.valueOf(this.E);
        String valueOf32 = String.valueOf(this.F);
        String valueOf33 = String.valueOf(this.G);
        String valueOf34 = String.valueOf(this.H);
        String valueOf35 = String.valueOf(this.I);
        String valueOf36 = String.valueOf(this.J);
        String valueOf37 = String.valueOf(this.K);
        String valueOf38 = String.valueOf(this.L);
        String valueOf39 = String.valueOf(this.M);
        String valueOf40 = String.valueOf(this.N);
        String valueOf41 = String.valueOf(this.O);
        String valueOf42 = String.valueOf(this.P);
        String valueOf43 = String.valueOf(this.Q);
        String valueOf44 = String.valueOf(this.R);
        String valueOf45 = String.valueOf(this.S);
        String valueOf46 = String.valueOf(this.T);
        String valueOf47 = String.valueOf(this.U);
        String valueOf48 = String.valueOf(this.V);
        String valueOf49 = String.valueOf(this.W);
        String valueOf50 = String.valueOf(this.X);
        String valueOf51 = String.valueOf(this.Y);
        String valueOf52 = String.valueOf(this.Z);
        String valueOf53 = String.valueOf(this.aa);
        String valueOf54 = String.valueOf(this.ab);
        byte[] bArr = this.ac;
        if (bArr != null) {
            str = String.valueOf(bArr.length);
        } else {
            str = "NULL";
        }
        return String.format(locale, "ConversationsTable [_id: %s,\n  sms_thread_id: %s,\n  name: %s,\n  name_is_automatic: %s,\n  subtitle: %s,\n  latest_message_id: %s,\n  snippet_text: %s,\n  subject_text: %s,\n  preview_uri: %s,\n  preview_content_type: %s,\n  show_draft: %s,\n  draft_snippet_text: %s,\n  draft_subject_text: %s,\n  draft_preview_uri: %s,\n  draft_preview_content_type: %s,\n  etouffee_default: %s,\n  archive_status: %s,\n  sort_timestamp: %s,\n  last_read_timestamp: %s,\n  icon: %s,\n  participant_contact_id: %s,\n  normalized_participant_contact_id: %s,\n  participant_lookup_key: %s,\n  normalized_participant_lookup_key: %s,\n  participant_normalized_destination: %s,\n  participant_comparable_destination: %s,\n  current_self_id: %s,\n  current_my_identity_foreign_key: %s,\n  destination_token: %s,\n  participant_count: %s,\n  notification_enabled: %s,\n  notification_sound_uri: %s,\n  notification_vibration: %s,\n  include_email_addr: %s,\n  sms_service_center: %s,\n  participant_id_list: %s,\n  normalized_participant_id_list: %s,\n  source_type: %s,\n  rcs_session_id: %s,\n  join_state: %s,\n  conv_type: %s,\n  send_mode: %s,\n  IS_ENTERPRISE: %s,\n  has_ea2p_bot_recipient: %s,\n  last_interactive_event_timestamp: %s,\n  participant_display_destination: %s,\n  normalized_participant_display_destination: %s,\n  spam_warning_dismiss_status: %s,\n  open_count: %s,\n  last_logged_scooby_metadata_timestamp: %s,\n  delete_timestamp: %s,\n  cms_id: %s,\n  rcs_group_id: %s,\n  rcs_conference_uri: %s,\n  tachygram_group_routing_info_token: %s,\n  cms_most_recent_read_message_timestamp_ms: %s,\n  rcs_subject_change_timestamp_ms: %s,\n  rcs_session_allows_revocation: %s,\n  rcs_group_capabilities: %s,\n  awaiting_reverse_sync: %s,\n  duplicate_of: %s,\n  new_duplicate_of: %s,\n  error_state: %s,\n  cms_life_cycle: %s,\n  rcs_group_self_msisdn: %s,\n  recipient_offline_timestamp_ms: %s,\n  rcs_group_last_sync_timestamp: %s,\n  has_been_e2ee: %s,\n  marked_as_unread: %s,\n  custom_theme: %s,\n  mms_group_upgrade_status: %s,\n  mms_group_upgrade_retries: %s,\n  encryption_protocol: %s,\n  encryption_id: %s,\n  cms_correlation_id: %s\n]\n", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, valueOf17, valueOf18, valueOf19, valueOf20, valueOf21, valueOf22, valueOf23, valueOf24, valueOf25, valueOf26, valueOf27, valueOf28, valueOf29, valueOf30, valueOf31, valueOf32, valueOf33, valueOf34, valueOf35, valueOf36, valueOf37, valueOf38, valueOf39, valueOf40, valueOf41, valueOf42, valueOf43, valueOf44, valueOf45, valueOf46, valueOf47, valueOf48, valueOf49, valueOf50, valueOf51, valueOf52, valueOf53, valueOf54, "BLOB".concat(String.valueOf(str)), String.valueOf(this.ad), String.valueOf(this.ae), String.valueOf(this.af), String.valueOf(this.ag), String.valueOf(this.ah), String.valueOf(this.ai), String.valueOf(this.aj), String.valueOf(this.ak), String.valueOf(this.al), String.valueOf(this.am), String.valueOf(this.an), String.valueOf(this.ao), String.valueOf(this.ap), String.valueOf(this.aq), String.valueOf(this.ar), String.valueOf(this.as), String.valueOf(this.at), String.valueOf(this.au), String.valueOf(this.av), String.valueOf(this.aw));
    }

    public final boolean aa() {
        ao(59, "awaiting_reverse_sync");
        return this.ah;
    }

    public final boolean ab() {
        ao(67, "has_been_e2ee");
        return this.ap;
    }

    public final boolean ac() {
        ao(43, "has_ea2p_bot_recipient");
        return this.R;
    }

    public final boolean ad() {
        ao(33, "include_email_addr");
        return this.H;
    }

    public final boolean ae() {
        ao(68, "marked_as_unread");
        return this.aq;
    }

    public final boolean af() {
        ao(30, "notification_enabled");
        return this.E;
    }

    public final boolean ag() {
        ao(32, "notification_vibration");
        return this.G;
    }

    public final boolean ah() {
        ao(57, "rcs_session_allows_revocation");
        return this.af;
    }

    public final boolean ai() {
        ao(10, "show_draft");
        return this.k;
    }

    public final boolean aj() {
        ao(47, "spam_warning_dismiss_status");
        return this.V;
    }

    public final byte[] ak() {
        ao(54, "tachygram_group_routing_info_token");
        return this.ac;
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        ConversationIdType conversationIdType = this.a;
        if (conversationIdType != null && !conversationIdType.equals(ruy.a)) {
            contentValues.put("_id", Long.valueOf(ruy.a(this.a)));
        } else {
            contentValues.putNull("_id");
        }
        xhv xhvVar = this.b;
        if (xhvVar == null) {
            contentValues.putNull("sms_thread_id");
        } else {
            contentValues.put("sms_thread_id", Long.valueOf(yyb.cE(xhvVar)));
        }
        agnc.r(contentValues, "name", this.c);
        if (intValue >= 10012) {
            tqh tqhVar = this.d;
            if (tqhVar == null) {
                contentValues.putNull("name_is_automatic");
            } else {
                contentValues.put("name_is_automatic", Integer.valueOf(tqhVar.ordinal()));
            }
        }
        if (intValue >= 59760) {
            agnc.r(contentValues, "subtitle", this.e);
        }
        MessageIdType messageIdType = this.f;
        if (messageIdType == null) {
            contentValues.putNull("latest_message_id");
        } else {
            contentValues.put("latest_message_id", Long.valueOf(rvc.a(messageIdType)));
        }
        agnc.r(contentValues, "snippet_text", this.g);
        agnc.r(contentValues, "subject_text", this.h);
        Uri uri = this.i;
        if (uri == null) {
            contentValues.putNull("preview_uri");
        } else {
            contentValues.put("preview_uri", uri.toString());
        }
        agnc.r(contentValues, "preview_content_type", this.j);
        contentValues.put("show_draft", Boolean.valueOf(this.k));
        agnc.r(contentValues, "draft_snippet_text", this.l);
        agnc.r(contentValues, "draft_subject_text", this.m);
        Uri uri2 = this.n;
        if (uri2 == null) {
            contentValues.putNull("draft_preview_uri");
        } else {
            contentValues.put("draft_preview_uri", uri2.toString());
        }
        agnc.r(contentValues, "draft_preview_content_type", this.o);
        if (intValue >= 29060) {
            contentValues.put("etouffee_default", Integer.valueOf(this.p));
        }
        tqc tqcVar = this.q;
        if (tqcVar == null) {
            contentValues.putNull("archive_status");
        } else {
            contentValues.put("archive_status", Integer.valueOf(tqcVar.h));
        }
        contentValues.put("sort_timestamp", Long.valueOf(this.r));
        contentValues.put("last_read_timestamp", Long.valueOf(this.s));
        agnc.r(contentValues, "icon", this.t);
        contentValues.put("participant_contact_id", Long.valueOf(this.u));
        if (intValue >= 58090) {
            contentValues.put("normalized_participant_contact_id", Long.valueOf(this.v));
        }
        agnc.r(contentValues, "participant_lookup_key", this.w);
        if (intValue >= 58090) {
            agnc.r(contentValues, "normalized_participant_lookup_key", this.x);
        }
        agnc.r(contentValues, "participant_normalized_destination", this.y);
        if (intValue >= 58090) {
            agnc.r(contentValues, "participant_comparable_destination", this.z);
        }
        agnc.r(contentValues, "current_self_id", this.A);
        if (intValue >= 60160) {
            qwe qweVar = this.B;
            if (qweVar != null && !qweVar.equals(null)) {
                contentValues.put("current_my_identity_foreign_key", riw.n(this.B));
            } else {
                contentValues.putNull("current_my_identity_foreign_key");
            }
        }
        if (intValue >= 60360) {
            qss qssVar = this.C;
            if (qssVar != null && !qssVar.equals(null)) {
                contentValues.put("destination_token", qta.e(this.C));
            } else {
                contentValues.putNull("destination_token");
            }
        }
        contentValues.put("participant_count", Integer.valueOf(this.D));
        contentValues.put("notification_enabled", Boolean.valueOf(this.E));
        agnc.r(contentValues, "notification_sound_uri", this.F);
        contentValues.put("notification_vibration", Boolean.valueOf(this.G));
        contentValues.put("include_email_addr", Boolean.valueOf(this.H));
        agnc.r(contentValues, "sms_service_center", this.I);
        if (intValue >= 8500) {
            agnc.r(contentValues, "participant_id_list", this.J);
        }
        if (intValue >= 58090) {
            agnc.r(contentValues, "normalized_participant_id_list", this.K);
        }
        if (intValue >= 8500) {
            contentValues.put("source_type", Integer.valueOf(this.L));
        }
        if (intValue >= 10000) {
            contentValues.put("rcs_session_id", Long.valueOf(this.M));
        }
        if (intValue >= 10006) {
            contentValues.put("join_state", Integer.valueOf(this.N));
        }
        if (intValue >= 10007) {
            contentValues.put("conv_type", Integer.valueOf(this.O));
        }
        if (intValue >= 10016) {
            contentValues.put("send_mode", Integer.valueOf(this.P));
        }
        if (intValue >= 10018) {
            contentValues.put("IS_ENTERPRISE", Boolean.valueOf(this.Q));
        }
        if (intValue >= 12001) {
            contentValues.put("has_ea2p_bot_recipient", Boolean.valueOf(this.R));
        }
        if (intValue >= 15000) {
            contentValues.put("last_interactive_event_timestamp", Long.valueOf(this.S));
        }
        if (intValue >= 15010) {
            agnc.r(contentValues, "participant_display_destination", this.T);
        }
        if (intValue >= 58090) {
            agnc.r(contentValues, "normalized_participant_display_destination", this.U);
        }
        if (intValue >= 23000) {
            contentValues.put("spam_warning_dismiss_status", Boolean.valueOf(this.V));
        }
        if (intValue >= 26020) {
            contentValues.put("open_count", Integer.valueOf(this.W));
        }
        if (intValue >= 28010) {
            contentValues.put("last_logged_scooby_metadata_timestamp", Long.valueOf(this.X));
        }
        if (intValue >= 29020) {
            contentValues.put("delete_timestamp", Long.valueOf(this.Y));
        }
        if (intValue >= 32000) {
            agnc.r(contentValues, "cms_id", this.Z);
        }
        if (intValue >= 40050) {
            agnc.r(contentValues, "rcs_group_id", this.aa);
        }
        if (intValue >= 40050) {
            agnc.r(contentValues, "rcs_conference_uri", this.ab);
        }
        if (intValue >= 58120) {
            contentValues.put("tachygram_group_routing_info_token", this.ac);
        }
        if (intValue >= 53030) {
            contentValues.put("cms_most_recent_read_message_timestamp_ms", Long.valueOf(this.ad));
        }
        if (intValue >= 46050) {
            contentValues.put("rcs_subject_change_timestamp_ms", Long.valueOf(this.ae));
        }
        if (intValue >= 48040) {
            contentValues.put("rcs_session_allows_revocation", Boolean.valueOf(this.af));
        }
        if (intValue >= 49020) {
            vtm vtmVar = this.ag;
            if (vtmVar == null) {
                contentValues.putNull("rcs_group_capabilities");
            } else {
                contentValues.put("rcs_group_capabilities", Long.valueOf(vtmVar.a));
            }
        }
        if (intValue >= 49060) {
            contentValues.put("awaiting_reverse_sync", Boolean.valueOf(this.ah));
        }
        if (intValue >= 58090) {
            ConversationIdType conversationIdType2 = this.ai;
            if (conversationIdType2 != null && !conversationIdType2.equals(ruy.a)) {
                contentValues.put("duplicate_of", Long.valueOf(ruy.a(this.ai)));
            } else {
                contentValues.putNull("duplicate_of");
            }
        }
        if (intValue >= 59130) {
            ConversationIdType conversationIdType3 = this.aj;
            if (conversationIdType3 != null && !conversationIdType3.equals(ruy.a)) {
                contentValues.put("new_duplicate_of", Long.valueOf(ruy.a(this.aj)));
            } else {
                contentValues.putNull("new_duplicate_of");
            }
        }
        if (intValue >= 58140) {
            qpd qpdVar = this.ak;
            if (qpdVar == null) {
                contentValues.putNull("error_state");
            } else {
                contentValues.put("error_state", Integer.valueOf(qpdVar.a()));
            }
        }
        if (intValue >= 58210) {
            xxw xxwVar = this.al;
            if (xxwVar == null) {
                contentValues.putNull("cms_life_cycle");
            } else {
                contentValues.put("cms_life_cycle", Integer.valueOf(xxwVar.ordinal()));
            }
        }
        if (intValue >= 58540) {
            agnc.r(contentValues, "rcs_group_self_msisdn", this.am);
        }
        if (intValue >= 58750) {
            Optional optional = this.an;
            if (optional == null) {
                contentValues.putNull("recipient_offline_timestamp_ms");
            } else {
                contentValues.put("recipient_offline_timestamp_ms", Long.valueOf(uxi.f(optional)));
            }
        }
        if (intValue >= 58910) {
            Optional optional2 = this.ao;
            if (optional2 == null) {
                contentValues.putNull("rcs_group_last_sync_timestamp");
            } else {
                contentValues.put("rcs_group_last_sync_timestamp", Long.valueOf(uxi.f(optional2)));
            }
        }
        if (intValue >= 59210) {
            contentValues.put("has_been_e2ee", Boolean.valueOf(this.ap));
        }
        if (intValue >= 59220) {
            contentValues.put("marked_as_unread", Boolean.valueOf(this.aq));
        }
        if (intValue >= 59820) {
            vst vstVar = this.ar;
            if (vstVar == null) {
                contentValues.putNull("custom_theme");
            } else {
                contentValues.put("custom_theme", vstVar.toByteArray());
            }
        }
        if (intValue >= 60050) {
            vvh vvhVar = this.as;
            if (vvhVar == null) {
                contentValues.putNull("mms_group_upgrade_status");
            } else {
                contentValues.put("mms_group_upgrade_status", Integer.valueOf(vvhVar.ordinal()));
            }
        }
        if (intValue >= 60050) {
            contentValues.put("mms_group_upgrade_retries", Integer.valueOf(this.at));
        }
        if (intValue >= 60180) {
            utk utkVar = this.au;
            if (utkVar == null) {
                contentValues.putNull("encryption_protocol");
            } else {
                contentValues.put("encryption_protocol", Integer.valueOf(utkVar.ordinal()));
            }
        }
        if (intValue >= 60210) {
            utj utjVar = this.av;
            if (utjVar == null) {
                contentValues.putNull("encryption_id");
            } else {
                contentValues.put("encryption_id", utj.b(utjVar));
            }
        }
        if (intValue >= 60250) {
            agnc.r(contentValues, "cms_correlation_id", this.aw);
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        sna snaVar = (sna) agmqVar;
        aq();
        this.cJ = snaVar.dx();
        if (snaVar.db(0)) {
            this.a = snaVar.C();
            fE(0);
        }
        if (snaVar.db(1)) {
            this.b = snaVar.L();
            fE(1);
        }
        if (snaVar.db(2)) {
            this.c = snaVar.W();
            fE(2);
        }
        if (snaVar.db(3)) {
            this.d = snaVar.F();
            fE(3);
        }
        if (snaVar.db(4)) {
            this.e = snaVar.an();
            fE(4);
        }
        if (snaVar.db(5)) {
            this.f = snaVar.D();
            fE(5);
        }
        if (snaVar.db(6)) {
            this.g = snaVar.al();
            fE(6);
        }
        if (snaVar.db(7)) {
            this.h = snaVar.am();
            fE(7);
        }
        if (snaVar.db(8)) {
            this.i = snaVar.w();
            fE(8);
        }
        if (snaVar.db(9)) {
            this.j = snaVar.ag();
            fE(9);
        }
        if (snaVar.db(10)) {
            this.k = snaVar.ax();
            fE(10);
        }
        if (snaVar.db(11)) {
            this.l = snaVar.T();
            fE(11);
        }
        if (snaVar.db(12)) {
            this.m = snaVar.U();
            fE(12);
        }
        if (snaVar.db(13)) {
            this.n = snaVar.v();
            fE(13);
        }
        if (snaVar.db(14)) {
            this.o = snaVar.S();
            fE(14);
        }
        if (snaVar.db(15)) {
            this.p = snaVar.e();
            fE(15);
        }
        if (snaVar.db(16)) {
            this.q = snaVar.E();
            fE(16);
        }
        if (snaVar.db(17)) {
            this.r = snaVar.u();
            fE(17);
        }
        if (snaVar.db(18)) {
            this.s = snaVar.p();
            fE(18);
        }
        if (snaVar.db(19)) {
            this.t = snaVar.V();
            fE(19);
        }
        if (snaVar.db(20)) {
            this.u = snaVar.r();
            fE(20);
        }
        if (snaVar.db(21)) {
            this.v = snaVar.q();
            fE(21);
        }
        if (snaVar.db(22)) {
            this.w = snaVar.ae();
            fE(22);
        }
        if (snaVar.db(23)) {
            this.x = snaVar.Z();
            fE(23);
        }
        if (snaVar.db(24)) {
            this.y = snaVar.af();
            fE(24);
        }
        if (snaVar.db(25)) {
            this.z = snaVar.ab();
            fE(25);
        }
        if (snaVar.db(26)) {
            this.A = snaVar.R();
            fE(26);
        }
        if (snaVar.db(27)) {
            this.B = snaVar.z();
            fE(27);
        }
        if (snaVar.db(28)) {
            this.C = snaVar.y();
            fE(28);
        }
        if (snaVar.db(29)) {
            this.D = snaVar.i();
            fE(29);
        }
        if (snaVar.db(30)) {
            this.E = snaVar.au();
            fE(30);
        }
        if (snaVar.db(31)) {
            this.F = snaVar.aa();
            fE(31);
        }
        if (snaVar.db(32)) {
            this.G = snaVar.av();
            fE(32);
        }
        if (snaVar.db(33)) {
            this.H = snaVar.ar();
            fE(33);
        }
        if (snaVar.db(34)) {
            this.I = snaVar.ak();
            fE(34);
        }
        if (snaVar.db(35)) {
            this.J = snaVar.ad();
            fE(35);
        }
        if (snaVar.db(36)) {
            this.K = snaVar.Y();
            fE(36);
        }
        if (snaVar.db(37)) {
            this.L = snaVar.k();
            fE(37);
        }
        if (snaVar.db(38)) {
            this.M = snaVar.s();
            fE(38);
        }
        if (snaVar.db(39)) {
            this.N = snaVar.f();
            fE(39);
        }
        if (snaVar.db(40)) {
            this.O = snaVar.c();
            fE(40);
        }
        if (snaVar.db(41)) {
            this.P = snaVar.j();
            fE(41);
        }
        if (snaVar.db(42)) {
            this.Q = snaVar.as();
            fE(42);
        }
        if (snaVar.db(43)) {
            this.R = snaVar.aq();
            fE(43);
        }
        if (snaVar.db(44)) {
            this.S = snaVar.n();
            fE(44);
        }
        if (snaVar.db(45)) {
            this.T = snaVar.ac();
            fE(45);
        }
        if (snaVar.db(46)) {
            this.U = snaVar.X();
            fE(46);
        }
        if (snaVar.db(47)) {
            this.V = snaVar.ay();
            fE(47);
        }
        if (snaVar.db(48)) {
            this.W = snaVar.h();
            fE(48);
        }
        if (snaVar.db(49)) {
            this.X = snaVar.o();
            fE(49);
        }
        if (snaVar.db(50)) {
            this.Y = snaVar.m();
            fE(50);
        }
        if (snaVar.db(51)) {
            this.Z = snaVar.Q();
            fE(51);
        }
        if (snaVar.db(52)) {
            this.aa = snaVar.ai();
            fE(52);
        }
        if (snaVar.db(53)) {
            this.ab = snaVar.ah();
            fE(53);
        }
        if (snaVar.db(54)) {
            this.ac = snaVar.az();
            fE(54);
        }
        if (snaVar.db(55)) {
            this.ad = snaVar.l();
            fE(55);
        }
        if (snaVar.db(56)) {
            this.ae = snaVar.t();
            fE(56);
        }
        if (snaVar.db(57)) {
            this.af = snaVar.aw();
            fE(57);
        }
        if (snaVar.db(58)) {
            this.ag = snaVar.J();
            fE(58);
        }
        if (snaVar.db(59)) {
            this.ah = snaVar.ao();
            fE(59);
        }
        if (snaVar.db(60)) {
            this.ai = snaVar.A();
            fE(60);
        }
        if (snaVar.db(61)) {
            this.aj = snaVar.B();
            fE(61);
        }
        if (snaVar.db(62)) {
            this.ak = snaVar.x();
            fE(62);
        }
        if (snaVar.db(63)) {
            this.al = snaVar.M();
            fE(63);
        }
        if (snaVar.db(64)) {
            this.am = snaVar.aj();
            fE(64);
        }
        if (snaVar.db(65)) {
            this.an = snaVar.O();
            fE(65);
        }
        if (snaVar.db(66)) {
            this.ao = snaVar.N();
            fE(66);
        }
        if (snaVar.db(67)) {
            this.ap = snaVar.ap();
            fE(67);
        }
        if (snaVar.db(68)) {
            this.aq = snaVar.at();
            fE(68);
        }
        if (snaVar.db(69)) {
            this.ar = snaVar.I();
            fE(69);
        }
        if (snaVar.db(70)) {
            this.as = snaVar.K();
            fE(70);
        }
        if (snaVar.db(71)) {
            this.at = snaVar.g();
            fE(71);
        }
        if (snaVar.db(72)) {
            this.au = snaVar.H();
            fE(72);
        }
        if (snaVar.db(73)) {
            this.av = snaVar.G();
            fE(73);
        }
        if (snaVar.db(74)) {
            this.aw = snaVar.P();
            fE(74);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof smr)) {
            return false;
        }
        smr smrVar = (smr) obj;
        if (super.aC(smrVar.cJ) && Objects.equals(this.a, smrVar.a) && Objects.equals(this.b, smrVar.b) && Objects.equals(this.c, smrVar.c) && this.d == smrVar.d && Objects.equals(this.e, smrVar.e) && Objects.equals(this.f, smrVar.f) && Objects.equals(this.g, smrVar.g) && Objects.equals(this.h, smrVar.h) && Objects.equals(this.i, smrVar.i) && Objects.equals(this.j, smrVar.j) && this.k == smrVar.k && Objects.equals(this.l, smrVar.l) && Objects.equals(this.m, smrVar.m) && Objects.equals(this.n, smrVar.n) && Objects.equals(this.o, smrVar.o) && this.p == smrVar.p && this.q == smrVar.q && this.r == smrVar.r && this.s == smrVar.s && Objects.equals(this.t, smrVar.t) && this.u == smrVar.u && this.v == smrVar.v && Objects.equals(this.w, smrVar.w) && Objects.equals(this.x, smrVar.x) && Objects.equals(this.y, smrVar.y) && Objects.equals(this.z, smrVar.z) && Objects.equals(this.A, smrVar.A) && Objects.equals(this.B, smrVar.B) && Objects.equals(this.C, smrVar.C) && this.D == smrVar.D && this.E == smrVar.E && Objects.equals(this.F, smrVar.F) && this.G == smrVar.G && this.H == smrVar.H && Objects.equals(this.I, smrVar.I) && Objects.equals(this.J, smrVar.J) && Objects.equals(this.K, smrVar.K) && this.L == smrVar.L && this.M == smrVar.M && this.N == smrVar.N && this.O == smrVar.O && this.P == smrVar.P && this.Q == smrVar.Q && this.R == smrVar.R && this.S == smrVar.S && Objects.equals(this.T, smrVar.T) && Objects.equals(this.U, smrVar.U) && this.V == smrVar.V && this.W == smrVar.W && this.X == smrVar.X && this.Y == smrVar.Y && Objects.equals(this.Z, smrVar.Z) && Objects.equals(this.aa, smrVar.aa) && Objects.equals(this.ab, smrVar.ab) && Arrays.equals(this.ac, smrVar.ac) && this.ad == smrVar.ad && this.ae == smrVar.ae && this.af == smrVar.af && Objects.equals(this.ag, smrVar.ag) && this.ah == smrVar.ah && Objects.equals(this.ai, smrVar.ai) && Objects.equals(this.aj, smrVar.aj) && this.ak == smrVar.ak && this.al == smrVar.al && Objects.equals(this.am, smrVar.am) && Objects.equals(this.an, smrVar.an) && Objects.equals(this.ao, smrVar.ao) && this.ap == smrVar.ap && this.aq == smrVar.aq && Objects.equals(this.ar, smrVar.ar) && this.as == smrVar.as && this.at == smrVar.at && this.au == smrVar.au && Objects.equals(this.av, smrVar.av) && Objects.equals(this.aw, smrVar.aw)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "conversations", agnc.j(new String[]{"sms_thread_id", "name", "name_is_automatic", "subtitle", "latest_message_id", "snippet_text", "subject_text", "preview_uri", "preview_content_type", "show_draft", "draft_snippet_text", "draft_subject_text", "draft_preview_uri", "draft_preview_content_type", "etouffee_default", "archive_status", "sort_timestamp", "last_read_timestamp", "icon", "participant_contact_id", "normalized_participant_contact_id", "participant_lookup_key", "normalized_participant_lookup_key", "participant_normalized_destination", "participant_comparable_destination", "current_self_id", "current_my_identity_foreign_key", "destination_token", "participant_count", "notification_enabled", "notification_sound_uri", "notification_vibration", "include_email_addr", "sms_service_center", "participant_id_list", "normalized_participant_id_list", "source_type", "rcs_session_id", "join_state", "conv_type", "send_mode", "IS_ENTERPRISE", "has_ea2p_bot_recipient", "last_interactive_event_timestamp", "participant_display_destination", "normalized_participant_display_destination", "spam_warning_dismiss_status", "open_count", "last_logged_scooby_metadata_timestamp", "delete_timestamp", "cms_id", "rcs_group_id", "rcs_conference_uri", "tachygram_group_routing_info_token", "cms_most_recent_read_message_timestamp_ms", "rcs_subject_change_timestamp_ms", "rcs_session_allows_revocation", "rcs_group_capabilities", "awaiting_reverse_sync", "duplicate_of", "new_duplicate_of", "error_state", "cms_life_cycle", "rcs_group_self_msisdn", "recipient_offline_timestamp_ms", "rcs_group_last_sync_timestamp", "has_been_e2ee", "marked_as_unread", "custom_theme", "mms_group_upgrade_status", "mms_group_upgrade_retries", "encryption_protocol", "encryption_id", "cms_correlation_id"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return "_id";
    }

    public final int h() {
        ao(40, "conv_type");
        return this.O;
    }

    public final int hashCode() {
        aday adayVar;
        int ordinal;
        int ordinal2;
        int ordinal3;
        int ordinal4;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        ConversationIdType conversationIdType = this.a;
        xhv xhvVar = this.b;
        String str = this.c;
        tqh tqhVar = this.d;
        if (tqhVar == null) {
            ordinal = 0;
        } else {
            ordinal = tqhVar.ordinal();
        }
        Integer valueOf = Integer.valueOf(ordinal);
        String str2 = this.e;
        MessageIdType messageIdType = this.f;
        String str3 = this.g;
        String str4 = this.h;
        Uri uri = this.i;
        String str5 = this.j;
        Boolean valueOf2 = Boolean.valueOf(this.k);
        String str6 = this.l;
        String str7 = this.m;
        Uri uri2 = this.n;
        String str8 = this.o;
        Integer valueOf3 = Integer.valueOf(this.p);
        tqc tqcVar = this.q;
        Long valueOf4 = Long.valueOf(this.r);
        Long valueOf5 = Long.valueOf(this.s);
        String str9 = this.t;
        Long valueOf6 = Long.valueOf(this.u);
        Long valueOf7 = Long.valueOf(this.v);
        String str10 = this.w;
        String str11 = this.x;
        String str12 = this.y;
        String str13 = this.z;
        String str14 = this.A;
        qwe qweVar = this.B;
        qss qssVar = this.C;
        Integer valueOf8 = Integer.valueOf(this.D);
        Boolean valueOf9 = Boolean.valueOf(this.E);
        String str15 = this.F;
        Boolean valueOf10 = Boolean.valueOf(this.G);
        Boolean valueOf11 = Boolean.valueOf(this.H);
        String str16 = this.I;
        String str17 = this.J;
        String str18 = this.K;
        Integer valueOf12 = Integer.valueOf(this.L);
        Long valueOf13 = Long.valueOf(this.M);
        Integer valueOf14 = Integer.valueOf(this.N);
        Integer valueOf15 = Integer.valueOf(this.O);
        Integer valueOf16 = Integer.valueOf(this.P);
        Boolean valueOf17 = Boolean.valueOf(this.Q);
        Boolean valueOf18 = Boolean.valueOf(this.R);
        Long valueOf19 = Long.valueOf(this.S);
        String str19 = this.T;
        String str20 = this.U;
        Boolean valueOf20 = Boolean.valueOf(this.V);
        Integer valueOf21 = Integer.valueOf(this.W);
        Long valueOf22 = Long.valueOf(this.X);
        Long valueOf23 = Long.valueOf(this.Y);
        String str21 = this.Z;
        String str22 = this.aa;
        String str23 = this.ab;
        Integer valueOf24 = Integer.valueOf(Arrays.hashCode(this.ac));
        Long valueOf25 = Long.valueOf(this.ad);
        Long valueOf26 = Long.valueOf(this.ae);
        Boolean valueOf27 = Boolean.valueOf(this.af);
        vtm vtmVar = this.ag;
        Boolean valueOf28 = Boolean.valueOf(this.ah);
        ConversationIdType conversationIdType2 = this.ai;
        ConversationIdType conversationIdType3 = this.aj;
        qpd qpdVar = this.ak;
        xxw xxwVar = this.al;
        if (xxwVar == null) {
            ordinal2 = 0;
        } else {
            ordinal2 = xxwVar.ordinal();
        }
        Integer valueOf29 = Integer.valueOf(ordinal2);
        String str24 = this.am;
        Optional optional = this.an;
        Optional optional2 = this.ao;
        Boolean valueOf30 = Boolean.valueOf(this.ap);
        Boolean valueOf31 = Boolean.valueOf(this.aq);
        vst vstVar = this.ar;
        vvh vvhVar = this.as;
        if (vvhVar == null) {
            ordinal3 = 0;
        } else {
            ordinal3 = vvhVar.ordinal();
        }
        Integer valueOf32 = Integer.valueOf(ordinal3);
        Integer valueOf33 = Integer.valueOf(this.at);
        utk utkVar = this.au;
        if (utkVar == null) {
            ordinal4 = 0;
        } else {
            ordinal4 = utkVar.ordinal();
        }
        return Objects.hash(adayVar, conversationIdType, xhvVar, str, valueOf, str2, messageIdType, str3, str4, uri, str5, valueOf2, str6, str7, uri2, str8, valueOf3, tqcVar, valueOf4, valueOf5, str9, valueOf6, valueOf7, str10, str11, str12, str13, str14, qweVar, qssVar, valueOf8, valueOf9, str15, valueOf10, valueOf11, str16, str17, str18, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, valueOf17, valueOf18, valueOf19, str19, str20, valueOf20, valueOf21, valueOf22, valueOf23, str21, str22, str23, valueOf24, valueOf25, valueOf26, valueOf27, vtmVar, valueOf28, conversationIdType2, conversationIdType3, qpdVar, valueOf29, str24, optional, optional2, valueOf30, valueOf31, vstVar, valueOf32, valueOf33, Integer.valueOf(ordinal4), this.av, this.aw, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "conversations";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v55, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v58, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v72, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v81, types: [java.lang.String] */
    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        String uri;
        String uri2;
        Integer num;
        Object valueOf2;
        String str;
        String str2;
        Integer valueOf3;
        Integer valueOf4;
        byte[] byteArray;
        Integer valueOf5;
        Long valueOf6 = Long.valueOf(yyb.cE(this.b));
        String str3 = this.c;
        tqh tqhVar = this.d;
        if (tqhVar == null) {
            valueOf = 0;
        } else {
            valueOf = String.valueOf(tqhVar.ordinal());
        }
        String str4 = this.e;
        Long valueOf7 = Long.valueOf(rvc.a(this.f));
        String str5 = this.g;
        String str6 = this.h;
        Uri uri3 = this.i;
        if (uri3 == null) {
            uri = null;
        } else {
            uri = uri3.toString();
        }
        String str7 = this.j;
        Integer valueOf8 = Integer.valueOf(this.k ? 1 : 0);
        String str8 = this.l;
        String str9 = this.m;
        Uri uri4 = this.n;
        if (uri4 == null) {
            num = 0;
            uri2 = null;
        } else {
            uri2 = uri4.toString();
            num = 0;
        }
        String str10 = this.o;
        Integer valueOf9 = Integer.valueOf(this.p);
        tqc tqcVar = this.q;
        if (tqcVar == null) {
            str = uri2;
            str2 = str10;
            valueOf2 = num;
        } else {
            valueOf2 = String.valueOf(tqcVar.h);
            str = uri2;
            str2 = str10;
        }
        Long valueOf10 = Long.valueOf(this.r);
        Long valueOf11 = Long.valueOf(this.s);
        String str11 = this.t;
        Long valueOf12 = Long.valueOf(this.u);
        Long valueOf13 = Long.valueOf(this.v);
        String str12 = this.w;
        String str13 = this.x;
        String str14 = this.y;
        String str15 = this.z;
        String str16 = this.A;
        Object obj = new rnb((aglz) this, 18).get();
        Object obj2 = new rnb((aglz) this, 19).get();
        Integer valueOf14 = Integer.valueOf(this.D);
        Integer valueOf15 = Integer.valueOf(this.E ? 1 : 0);
        String str17 = this.F;
        Integer valueOf16 = Integer.valueOf(this.G ? 1 : 0);
        Integer valueOf17 = Integer.valueOf(this.H ? 1 : 0);
        String str18 = this.I;
        String str19 = this.J;
        String str20 = this.K;
        Integer valueOf18 = Integer.valueOf(this.L);
        Long valueOf19 = Long.valueOf(this.M);
        Integer valueOf20 = Integer.valueOf(this.N);
        Integer valueOf21 = Integer.valueOf(this.O);
        Integer valueOf22 = Integer.valueOf(this.P);
        Integer valueOf23 = Integer.valueOf(this.Q ? 1 : 0);
        Integer valueOf24 = Integer.valueOf(this.R ? 1 : 0);
        Long valueOf25 = Long.valueOf(this.S);
        String str21 = this.T;
        String str22 = this.U;
        Integer valueOf26 = Integer.valueOf(this.V ? 1 : 0);
        Integer valueOf27 = Integer.valueOf(this.W);
        Long valueOf28 = Long.valueOf(this.X);
        Long valueOf29 = Long.valueOf(this.Y);
        String str23 = this.Z;
        String str24 = this.aa;
        String str25 = this.ab;
        byte[] bArr = this.ac;
        Long valueOf30 = Long.valueOf(this.ad);
        Long valueOf31 = Long.valueOf(this.ae);
        Integer valueOf32 = Integer.valueOf(this.af ? 1 : 0);
        Long valueOf33 = Long.valueOf(this.ag.a);
        Integer valueOf34 = Integer.valueOf(this.ah ? 1 : 0);
        Object obj3 = new rnb((aglz) this, 20).get();
        Object obj4 = new snj(this, 1).get();
        qpd qpdVar = this.ak;
        if (qpdVar == null) {
            valueOf3 = num;
        } else {
            valueOf3 = String.valueOf(qpdVar.a());
        }
        xxw xxwVar = this.al;
        if (xxwVar == null) {
            valueOf4 = num;
        } else {
            valueOf4 = String.valueOf(xxwVar.ordinal());
        }
        String str26 = this.am;
        Long valueOf35 = Long.valueOf(uxi.f(this.an));
        Long valueOf36 = Long.valueOf(uxi.f(this.ao));
        Integer valueOf37 = Integer.valueOf(this.ap ? 1 : 0);
        Integer valueOf38 = Integer.valueOf(this.aq ? 1 : 0);
        vst vstVar = this.ar;
        if (vstVar == null) {
            byteArray = null;
        } else {
            byteArray = vstVar.toByteArray();
        }
        vvh vvhVar = this.as;
        if (vvhVar == null) {
            valueOf5 = num;
        } else {
            valueOf5 = String.valueOf(vvhVar.ordinal());
        }
        Integer valueOf39 = Integer.valueOf(this.at);
        utk utkVar = this.au;
        if (utkVar != null) {
            num = String.valueOf(utkVar.ordinal());
        }
        Object[] objArr = {valueOf6, str3, valueOf, str4, valueOf7, str5, str6, uri, str7, valueOf8, str8, str9, str, str2, valueOf9, valueOf2, valueOf10, valueOf11, str11, valueOf12, valueOf13, str12, str13, str14, str15, str16, obj, obj2, valueOf14, valueOf15, str17, valueOf16, valueOf17, str18, str19, str20, valueOf18, valueOf19, valueOf20, valueOf21, valueOf22, valueOf23, valueOf24, valueOf25, str21, str22, valueOf26, valueOf27, valueOf28, valueOf29, str23, str24, str25, bArr, valueOf30, valueOf31, valueOf32, valueOf33, valueOf34, obj3, obj4, valueOf3, valueOf4, str26, valueOf35, valueOf36, valueOf37, valueOf38, byteArray, valueOf5, valueOf39, num, utj.b(this.av), this.aw};
        sb.append('(');
        for (int i = 0; i < 74; i++) {
            Object obj5 = objArr[i];
            if (obj5 instanceof Number) {
                sb.append(String.valueOf(obj5));
            } else {
                if (obj5 instanceof String) {
                    String str27 = (String) obj5;
                    if (str27.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str27));
                    }
                }
                list.add(obj5);
                sb.append('?');
                sb.append(',');
            }
            sb.append(',');
        }
        sb.setLength(sb.length() - 1);
        sb.append(')');
    }

    public final int k() {
        ao(15, "etouffee_default");
        return this.p;
    }

    public final int l() {
        ao(39, "join_state");
        return this.N;
    }

    public final int m() {
        ao(71, "mms_group_upgrade_retries");
        return this.at;
    }

    public final int n() {
        ao(48, "open_count");
        return this.W;
    }

    public final int o() {
        ao(29, "participant_count");
        return this.D;
    }

    public final int p() {
        ao(41, "send_mode");
        return this.P;
    }

    public final int q() {
        ao(37, "source_type");
        return this.L;
    }

    public final long r() {
        ao(50, "delete_timestamp");
        return this.Y;
    }

    public final long s() {
        ao(38, "rcs_session_id");
        return this.M;
    }

    public final long t() {
        ao(56, "rcs_subject_change_timestamp_ms");
        return this.ae;
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "ConversationsTable -- REDACTED");
        }
        return a();
    }

    public final long u() {
        ao(17, "sort_timestamp");
        return this.r;
    }

    public final Uri v() {
        ao(13, "draft_preview_uri");
        return this.n;
    }

    public final qpd w() {
        ao(62, "error_state");
        return this.ak;
    }

    public final ConversationIdType x() {
        ao(0, "_id");
        return this.a;
    }

    public final ConversationIdType y() {
        agnw d;
        agnw d2;
        d = agnc.d("$primary");
        d2 = agnc.d("$primary");
        return new ConversationIdType(agnc.a(d2, "conversations", this, new skt(d, 6), new smq(this, 0)));
    }

    public final MessageIdType z() {
        ao(5, "latest_message_id");
        return this.f;
    }
}
