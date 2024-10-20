package com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import defpackage.a;
import defpackage.aday;
import defpackage.aglo;
import defpackage.aglz;
import defpackage.agma;
import defpackage.agmq;
import defpackage.agnc;
import defpackage.agnw;
import defpackage.akec;
import defpackage.alob;
import defpackage.alok;
import defpackage.alor;
import defpackage.aozs;
import defpackage.apag;
import defpackage.apwq;
import defpackage.atok;
import defpackage.qwe;
import defpackage.riw;
import defpackage.ruy;
import defpackage.ruz;
import defpackage.rvc;
import defpackage.rve;
import defpackage.rvg;
import defpackage.sdr;
import defpackage.smq;
import defpackage.spl;
import defpackage.swc;
import defpackage.swm;
import defpackage.sxn;
import defpackage.sxo;
import defpackage.sxp;
import defpackage.sxt;
import defpackage.sxx;
import defpackage.sxy;
import defpackage.syc;
import defpackage.tqf;
import defpackage.tqp;
import defpackage.tqr;
import defpackage.tqu;
import defpackage.utk;
import defpackage.uzz;
import defpackage.xxw;
import j$.time.Instant;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MessagesTable extends aglo {
    public static final String[] a = {"messages._id", "messages.conversation_id", "messages.sender_id", "messages.sender_send_destination", "messages.msisdn_receiving_rcs_message", "messages.receiving_network_country", "messages.sent_timestamp", "messages.queue_insert_timestamp", "messages.received_timestamp", "messages.message_protocol", "messages.message_status", "messages.message_report_status", "messages.seen", "messages.read", "messages.sms_message_uri", "messages.sms_priority", "messages.sms_message_size", "messages.mms_subject", "messages.mms_transaction_id", "messages.mms_content_location", "messages.mms_expiry", "messages.rcs_expiry", "messages.mms_retrieve_text", "messages.raw_status", "messages.self_id", "messages.my_identity_foreign_key", "messages.retry_start_timestamp", "messages.cloud_sync_id", "messages.rcs_message_id_with_text_type", "messages.etouffee_status", "messages.verification_status", "messages.rcs_ui_status", "messages.is_hidden", "messages.rcs_remote_instance", "messages.rcs_file_transfer_session_id", "messages.sms_error_code", "messages.sms_error_desc_map_name", "messages.correlation_id", "messages.cms_id", "messages.cms_last_mod_seq", "messages.web_id", "messages.usage_stats_logging_id", "messages.send_counter", "messages.original_rcs_message_id", "messages.custom_delivery_receipt_mime_type", "messages.custom_delivery_receipt_content", "messages.report_attempt_acounter", "messages.custom_headers", "messages.cms_correlation_id", "messages.group_private_participant", "messages.original_message_id", "messages.awaiting_reverse_sync", "messages.old_sms_message_uri", "messages.draft_id", "messages.result_code", "messages.cms_life_cycle", "messages.fallback_reason", "messages.auto_retry_counter", "messages.can_revoke_before_delivered_with_rcs", "messages.trace_id", "messages.outgoing_delivery_report_status", "messages.outgoing_read_report_status", "messages.xms_transport", "messages.message_original_protocol", "messages.satellite_datagram_id", "messages.encryption_protocol", "messages.message_persistence_id"};
    public static final alor b;
    public static final sxo c;
    public static final int[] d;

    static {
        alok alokVar = new alok();
        alokVar.h("messages.sender_send_destination", 54040);
        alokVar.h("messages.msisdn_receiving_rcs_message", 59340);
        alokVar.h("messages.receiving_network_country", 54040);
        alokVar.h("messages.queue_insert_timestamp", 17030);
        alokVar.h("messages.message_report_status", 13020);
        alokVar.h("messages.rcs_expiry", 59890);
        alokVar.h("messages.mms_retrieve_text", 9030);
        alokVar.h("messages.my_identity_foreign_key", 60160);
        alokVar.h("messages.cloud_sync_id", 8500);
        alokVar.h("messages.rcs_message_id_with_text_type", 41040);
        alokVar.h("messages.etouffee_status", 29060);
        alokVar.h("messages.verification_status", 29090);
        alokVar.h("messages.rcs_ui_status", 39000);
        alokVar.h("messages.is_hidden", 30010);
        alokVar.h("messages.rcs_remote_instance", 10002);
        alokVar.h("messages.rcs_file_transfer_session_id", 10004);
        alokVar.h("messages.sms_error_code", 9000);
        alokVar.h("messages.sms_error_desc_map_name", 9000);
        alokVar.h("messages.correlation_id", 9010);
        alokVar.h("messages.cms_id", 31010);
        alokVar.h("messages.cms_last_mod_seq", 37040);
        alokVar.h("messages.web_id", 19020);
        alokVar.h("messages.usage_stats_logging_id", 29100);
        alokVar.h("messages.send_counter", 35030);
        alokVar.h("messages.original_rcs_message_id", 35030);
        alokVar.h("messages.custom_delivery_receipt_mime_type", 37020);
        alokVar.h("messages.custom_delivery_receipt_content", 37020);
        alokVar.h("messages.report_attempt_acounter", 37030);
        alokVar.h("messages.custom_headers", 45020);
        alokVar.h("messages.cms_correlation_id", 46010);
        alokVar.h("messages.group_private_participant", 48030);
        alokVar.h("messages.original_message_id", 48030);
        alokVar.h("messages.awaiting_reverse_sync", 49060);
        alokVar.h("messages.old_sms_message_uri", 49060);
        alokVar.h("messages.draft_id", 56000);
        alokVar.h("messages.result_code", 58040);
        alokVar.h("messages.cms_life_cycle", 58210);
        alokVar.h("messages.fallback_reason", 58710);
        alokVar.h("messages.auto_retry_counter", 58230);
        alokVar.h("messages.can_revoke_before_delivered_with_rcs", 58280);
        alokVar.h("messages.trace_id", 58680);
        alokVar.h("messages.outgoing_delivery_report_status", 58720);
        alokVar.h("messages.outgoing_read_report_status", 58720);
        alokVar.h("messages.xms_transport", 59310);
        alokVar.h("messages.message_original_protocol", 59430);
        alokVar.h("messages.satellite_datagram_id", 59490);
        alokVar.h("messages.encryption_protocol", 60190);
        alokVar.h("messages.message_persistence_id", 60370);
        b = alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h("sender_id", "index_messages_sender_id");
        alokVar2.h("sent_timestamp", "index_messages_sent_timestamp");
        alokVar2.h("read", "index_messages_read_0");
        alokVar2.h("sms_message_uri", "index_messages_sms_message_uri");
        alokVar2.h("rcs_expiry", "index_messages_rcs_expiry");
        alokVar2.h("self_id", "index_messages_self_id");
        alokVar2.h("my_identity", "index_messages_my_identity");
        alokVar2.h("my_identity_foreign_key", "index_messages_my_identity_foreign_key");
        alokVar2.h("cloud_sync_id", "index_messages_cloud_sync_id");
        alokVar2.h(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS, "index_messages_verification_status");
        alokVar2.h("cms_id", "index_messages_cms_id");
        alokVar2.h("web_id", "index_messages_web_id");
        alokVar2.h("original_rcs_message_id", "index_messages_original_rcs_message_id");
        alokVar2.h("cms_correlation_id", "index_messages_cms_correlation_id");
        alokVar2.h("group_private_participant", "index_messages_group_private_participant");
        alokVar2.h("original_message_id", "index_messages_original_message_id");
        alokVar2.h("awaiting_reverse_sync", "index_messages_awaiting_reverse_sync");
        alokVar2.h("draft_id", "index_messages_draft_id");
        alokVar2.h("satellite_datagram_id", "index_messages_satellite_datagram_id");
        alokVar2.h("message_persistence_id", "index_messages_message_persistence_id");
        alokVar2.b();
        c = new sxo();
        d = new int[]{8500, 9000, 9010, 9030, 10000, 10002, 10004, 13020, 17030, 19020, 22080, 24090, 25010, 29060, 29090, 29100, 30010, 31010, 32050, 35030, 36000, 37020, 37030, 37040, 39000, 41040, 45020, 46010, 48030, 49060, 54040, 54070, 56000, 58040, 58060, 58210, 58230, 58280, 58360, 58680, 58710, 58720, 58740, 59160, 59310, 59340, 59430, 59490, 59510, 59530, 59810, 59890, 60160, 60190, 60370};
    }

    public static BindData a(MessageIdType messageIdType) {
        sxy d2 = d();
        d2.w("messages.queryOnId");
        syc sycVar = new syc();
        sycVar.i(messageIdType);
        d2.f(sycVar);
        return (BindData) agnc.b(d2.b());
    }

    public static sxn b() {
        int i = swm.a;
        return new sxn();
    }

    public static sxn c() {
        int i = swm.a;
        sxn sxnVar = new sxn();
        sxnVar.aD();
        return sxnVar;
    }

    public static final sxy d() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("messages._id");
            alobVar.h("messages.conversation_id");
            alobVar.h("messages.sender_id");
            if (valueOf.intValue() >= 54040) {
                alobVar.h("messages.sender_send_destination");
            }
            if (valueOf.intValue() >= 59340) {
                alobVar.h("messages.msisdn_receiving_rcs_message");
            }
            if (valueOf.intValue() >= 54040) {
                alobVar.h("messages.receiving_network_country");
            }
            alobVar.h("messages.sent_timestamp");
            if (valueOf.intValue() >= 17030) {
                alobVar.h("messages.queue_insert_timestamp");
            }
            alobVar.h("messages.received_timestamp");
            alobVar.h("messages.message_protocol");
            alobVar.h("messages.message_status");
            if (valueOf.intValue() >= 13020) {
                alobVar.h("messages.message_report_status");
            }
            alobVar.h("messages.seen");
            alobVar.h("messages.read");
            alobVar.h("messages.sms_message_uri");
            alobVar.h("messages.sms_priority");
            alobVar.h("messages.sms_message_size");
            alobVar.h("messages.mms_subject");
            alobVar.h("messages.mms_transaction_id");
            alobVar.h("messages.mms_content_location");
            alobVar.h("messages.mms_expiry");
            if (valueOf.intValue() >= 59890) {
                alobVar.h("messages.rcs_expiry");
            }
            if (valueOf.intValue() >= 9030) {
                alobVar.h("messages.mms_retrieve_text");
            }
            alobVar.h("messages.raw_status");
            alobVar.h("messages.self_id");
            if (valueOf.intValue() >= 60160) {
                alobVar.h("messages.my_identity_foreign_key");
            }
            alobVar.h("messages.retry_start_timestamp");
            if (valueOf.intValue() >= 8500) {
                alobVar.h("messages.cloud_sync_id");
            }
            if (valueOf.intValue() >= 41040) {
                alobVar.h("messages.rcs_message_id_with_text_type");
            }
            if (valueOf.intValue() >= 29060) {
                alobVar.h("messages.etouffee_status");
            }
            if (valueOf.intValue() >= 29090) {
                alobVar.h("messages.verification_status");
            }
            if (valueOf.intValue() >= 39000) {
                alobVar.h("messages.rcs_ui_status");
            }
            if (valueOf.intValue() >= 30010) {
                alobVar.h("messages.is_hidden");
            }
            if (valueOf.intValue() >= 10002) {
                alobVar.h("messages.rcs_remote_instance");
            }
            if (valueOf.intValue() >= 10004) {
                alobVar.h("messages.rcs_file_transfer_session_id");
            }
            if (valueOf.intValue() >= 9000) {
                alobVar.h("messages.sms_error_code");
            }
            if (valueOf.intValue() >= 9000) {
                alobVar.h("messages.sms_error_desc_map_name");
            }
            if (valueOf.intValue() >= 9010) {
                alobVar.h("messages.correlation_id");
            }
            if (valueOf.intValue() >= 31010) {
                alobVar.h("messages.cms_id");
            }
            if (valueOf.intValue() >= 37040) {
                alobVar.h("messages.cms_last_mod_seq");
            }
            if (valueOf.intValue() >= 19020) {
                alobVar.h("messages.web_id");
            }
            if (valueOf.intValue() >= 29100) {
                alobVar.h("messages.usage_stats_logging_id");
            }
            if (valueOf.intValue() >= 35030) {
                alobVar.h("messages.send_counter");
            }
            if (valueOf.intValue() >= 35030) {
                alobVar.h("messages.original_rcs_message_id");
            }
            if (valueOf.intValue() >= 37020) {
                alobVar.h("messages.custom_delivery_receipt_mime_type");
            }
            if (valueOf.intValue() >= 37020) {
                alobVar.h("messages.custom_delivery_receipt_content");
            }
            if (valueOf.intValue() >= 37030) {
                alobVar.h("messages.report_attempt_acounter");
            }
            if (valueOf.intValue() >= 45020) {
                alobVar.h("messages.custom_headers");
            }
            if (valueOf.intValue() >= 46010) {
                alobVar.h("messages.cms_correlation_id");
            }
            if (valueOf.intValue() >= 48030) {
                alobVar.h("messages.group_private_participant");
            }
            if (valueOf.intValue() >= 48030) {
                alobVar.h("messages.original_message_id");
            }
            if (valueOf.intValue() >= 49060) {
                alobVar.h("messages.awaiting_reverse_sync");
            }
            if (valueOf.intValue() >= 49060) {
                alobVar.h("messages.old_sms_message_uri");
            }
            if (valueOf.intValue() >= 56000) {
                alobVar.h("messages.draft_id");
            }
            if (valueOf.intValue() >= 58040) {
                alobVar.h("messages.result_code");
            }
            if (valueOf.intValue() >= 58210) {
                alobVar.h("messages.cms_life_cycle");
            }
            if (valueOf.intValue() >= 58710) {
                alobVar.h("messages.fallback_reason");
            }
            if (valueOf.intValue() >= 58230) {
                alobVar.h("messages.auto_retry_counter");
            }
            if (valueOf.intValue() >= 58280) {
                alobVar.h("messages.can_revoke_before_delivered_with_rcs");
            }
            if (valueOf.intValue() >= 58680) {
                alobVar.h("messages.trace_id");
            }
            if (valueOf.intValue() >= 58720) {
                alobVar.h("messages.outgoing_delivery_report_status");
            }
            if (valueOf.intValue() >= 58720) {
                alobVar.h("messages.outgoing_read_report_status");
            }
            if (valueOf.intValue() >= 59310) {
                alobVar.h("messages.xms_transport");
            }
            if (valueOf.intValue() >= 59430) {
                alobVar.h("messages.message_original_protocol");
            }
            if (valueOf.intValue() >= 59490) {
                alobVar.h("messages.satellite_datagram_id");
            }
            if (valueOf.intValue() >= 60190) {
                alobVar.h("messages.encryption_protocol");
            }
            if (valueOf.intValue() >= 60370) {
                alobVar.h("messages.message_persistence_id");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new sxy(strArr);
    }

    public static final sxy e(String str) {
        sxy d2 = d();
        d2.w(str);
        return d2;
    }

    public static Object f(MessageIdType messageIdType, Function function, Supplier supplier) {
        Object obj;
        Object apply;
        BindData a2 = a(messageIdType);
        if (a2 != null) {
            apply = function.apply(a2);
            return apply;
        }
        obj = supplier.get();
        return obj;
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public static abstract class BindData extends aglz<sxt, sxx, sxy, BindData, sxp> implements Parcelable, agma {
        public static final Parcelable.Creator<BindData> CREATOR = new sdr(4);
        public String B;
        public String H;
        public String K;
        public String L;
        public String M;
        public long N;
        public String S;
        public byte[] T;
        public apwq V;
        public String W;
        public String X;
        public Uri aa;
        public atok ah;
        public tqp ai;
        public tqp aj;
        public tqu ak;
        public int al;
        public ruz am;
        public utk an;
        public Optional ao;
        public String c;
        public String d;
        public String e;
        public String f;
        public Uri o;
        public String r;
        public String s;
        public String t;
        public String w;
        public String y;
        public MessageIdType a = rvc.a;
        public ConversationIdType b = ruy.a;
        public long g = 0;
        public Instant h = uzz.l(0);
        public long i = 0;
        public int j = 0;
        public int k = 0;
        public int l = 0;
        public boolean m = false;
        public boolean n = false;
        public int p = 0;
        public long q = 0;
        public long u = 0;
        public long v = 0;
        public int x = 0;
        public qwe z = null;
        public long A = 0;
        public rve C = rve.a;
        public int D = 0;
        public tqr E = tqr.VERIFICATION_NA;
        public int F = 0;
        public boolean G = false;
        public long I = -1;
        public int J = -1;
        public String O = "";
        public long P = 0;
        public long Q = 1;
        public rve R = rve.a;
        public long U = 0;
        public MessageIdType Y = rvc.a;
        public boolean Z = false;
        public Optional ab = rvg.a;
        public int ac = -2;
        public xxw ad = xxw.UNKNOWN;
        public tqf ae = tqf.UNKNOWN;
        public int af = 0;
        public boolean ag = false;

        /* JADX INFO: Access modifiers changed from: protected */
        public BindData() {
            tqp tqpVar = tqp.UNKNOWN;
            this.ai = tqpVar;
            this.aj = tqpVar;
            this.ak = tqu.UNKNOWN;
            this.al = -1;
            this.am = ruz.a;
            this.an = utk.a;
            this.ao = uzz.j();
        }

        public final MessageIdType A() {
            ao(0, "_id");
            return this.a;
        }

        public final MessageIdType B() {
            agnw d;
            agnw d2;
            d = agnc.d("$primary");
            d2 = agnc.d("$primary");
            return new MessageIdType(agnc.a(d2, "messages", this, new spl(d, 17), new smq(this, 13)));
        }

        public final rve C() {
            ao(43, "original_rcs_message_id");
            return this.R;
        }

        public final rve D() {
            ao(28, "rcs_message_id_with_text_type");
            return this.C;
        }

        public final sxn E() {
            int i = swm.a;
            sxn sxnVar = new sxn();
            sxnVar.d(this, false, this.cE);
            return sxnVar;
        }

        public final sxn F() {
            sxn sxnVar = new sxn();
            sxnVar.d(this, true, this.cE);
            return sxnVar;
        }

        public final tqf G() {
            ao(56, "fallback_reason");
            return this.ae;
        }

        public final tqr H() {
            ao(30, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS);
            return this.E;
        }

        public final tqu I() {
            ao(62, "xms_transport");
            return this.ak;
        }

        public final xxw J() {
            ao(55, "cms_life_cycle");
            return this.ad;
        }

        public final apwq K() {
            ao(47, "custom_headers");
            return this.V;
        }

        public final String L() {
            ao(38, "cms_id");
            return this.M;
        }

        public final String M() {
            ao(22, "mms_retrieve_text");
            return this.w;
        }

        public final String N() {
            ao(17, "mms_subject");
            return this.r;
        }

        public final String O() {
            ao(24, "self_id");
            return this.y;
        }

        public final String P() {
            ao(2, "sender_id");
            return this.c;
        }

        public final String Q() {
            ao(36, "sms_error_desc_map_name");
            return this.K;
        }

        public final String R() {
            ao(40, "web_id");
            return this.O;
        }

        public final atok S() {
            ao(59, "trace_id");
            return this.ah;
        }

        public final boolean T() {
            ao(32, "is_hidden");
            return this.G;
        }

        public final boolean U() {
            ao(13, "read");
            return this.n;
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
            byte[] bArr = this.T;
            if (bArr != null) {
                str = String.valueOf(bArr.length);
            } else {
                str = "NULL";
            }
            return String.format(locale, "MessagesTable [_id: %s,\n  conversation_id: %s,\n  sender_id: %s,\n  sender_send_destination: %s,\n  msisdn_receiving_rcs_message: %s,\n  receiving_network_country: %s,\n  sent_timestamp: %s,\n  queue_insert_timestamp: %s,\n  received_timestamp: %s,\n  message_protocol: %s,\n  message_status: %s,\n  message_report_status: %s,\n  seen: %s,\n  read: %s,\n  sms_message_uri: %s,\n  sms_priority: %s,\n  sms_message_size: %s,\n  mms_subject: %s,\n  mms_transaction_id: %s,\n  mms_content_location: %s,\n  mms_expiry: %s,\n  rcs_expiry: %s,\n  mms_retrieve_text: %s,\n  raw_status: %s,\n  self_id: %s,\n  my_identity_foreign_key: %s,\n  retry_start_timestamp: %s,\n  cloud_sync_id: %s,\n  rcs_message_id_with_text_type: %s,\n  etouffee_status: %s,\n  verification_status: %s,\n  rcs_ui_status: %s,\n  is_hidden: %s,\n  rcs_remote_instance: %s,\n  rcs_file_transfer_session_id: %s,\n  sms_error_code: %s,\n  sms_error_desc_map_name: %s,\n  correlation_id: %s,\n  cms_id: %s,\n  cms_last_mod_seq: %s,\n  web_id: %s,\n  usage_stats_logging_id: %s,\n  send_counter: %s,\n  original_rcs_message_id: %s,\n  custom_delivery_receipt_mime_type: %s,\n  custom_delivery_receipt_content: %s,\n  report_attempt_acounter: %s,\n  custom_headers: %s,\n  cms_correlation_id: %s,\n  group_private_participant: %s,\n  original_message_id: %s,\n  awaiting_reverse_sync: %s,\n  old_sms_message_uri: %s,\n  draft_id: %s,\n  result_code: %s,\n  cms_life_cycle: %s,\n  fallback_reason: %s,\n  auto_retry_counter: %s,\n  can_revoke_before_delivered_with_rcs: %s,\n  trace_id: %s,\n  outgoing_delivery_report_status: %s,\n  outgoing_read_report_status: %s,\n  xms_transport: %s,\n  message_original_protocol: %s,\n  satellite_datagram_id: %s,\n  encryption_protocol: %s,\n  message_persistence_id: %s\n]\n", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, valueOf17, valueOf18, valueOf19, valueOf20, valueOf21, valueOf22, valueOf23, valueOf24, valueOf25, valueOf26, valueOf27, valueOf28, valueOf29, valueOf30, valueOf31, valueOf32, valueOf33, valueOf34, valueOf35, valueOf36, valueOf37, valueOf38, valueOf39, valueOf40, valueOf41, valueOf42, valueOf43, valueOf44, valueOf45, "BLOB".concat(String.valueOf(str)), String.valueOf(this.U), String.valueOf(this.V), String.valueOf(this.W), String.valueOf(this.X), String.valueOf(this.Y), String.valueOf(this.Z), String.valueOf(this.aa), String.valueOf(this.ab), String.valueOf(this.ac), String.valueOf(this.ad), String.valueOf(this.ae), String.valueOf(this.af), String.valueOf(this.ag), String.valueOf(this.ah), String.valueOf(this.ai), String.valueOf(this.aj), String.valueOf(this.ak), String.valueOf(this.al), String.valueOf(this.am), String.valueOf(this.an), String.valueOf(this.ao));
        }

        @Override // defpackage.aglz
        public final void b(ContentValues contentValues) {
            Integer valueOf;
            valueOf = Integer.valueOf(a.bp().c());
            int intValue = valueOf.intValue();
            MessageIdType messageIdType = this.a;
            if (messageIdType != null && !messageIdType.equals(rvc.a)) {
                contentValues.put("_id", Long.valueOf(rvc.a(this.a)));
            } else {
                contentValues.putNull("_id");
            }
            ConversationIdType conversationIdType = this.b;
            if (conversationIdType != null && !conversationIdType.equals(ruy.a)) {
                contentValues.put("conversation_id", Long.valueOf(ruy.a(this.b)));
            } else {
                contentValues.putNull("conversation_id");
            }
            agnc.r(contentValues, "sender_id", this.c);
            if (intValue >= 54040) {
                agnc.r(contentValues, "sender_send_destination", this.d);
            }
            if (intValue >= 59340) {
                agnc.r(contentValues, "msisdn_receiving_rcs_message", this.e);
            }
            if (intValue >= 54040) {
                agnc.r(contentValues, "receiving_network_country", this.f);
            }
            contentValues.put("sent_timestamp", Long.valueOf(this.g));
            if (intValue >= 17030) {
                Instant instant = this.h;
                if (instant == null) {
                    contentValues.putNull("queue_insert_timestamp");
                } else {
                    contentValues.put("queue_insert_timestamp", Long.valueOf(uzz.k(instant)));
                }
            }
            contentValues.put("received_timestamp", Long.valueOf(this.i));
            contentValues.put("message_protocol", Integer.valueOf(this.j));
            contentValues.put("message_status", Integer.valueOf(this.k));
            if (intValue >= 13020) {
                contentValues.put("message_report_status", Integer.valueOf(this.l));
            }
            contentValues.put("seen", Boolean.valueOf(this.m));
            contentValues.put("read", Boolean.valueOf(this.n));
            Uri uri = this.o;
            if (uri == null) {
                contentValues.putNull("sms_message_uri");
            } else {
                contentValues.put("sms_message_uri", uri.toString());
            }
            contentValues.put("sms_priority", Integer.valueOf(this.p));
            contentValues.put("sms_message_size", Long.valueOf(this.q));
            agnc.r(contentValues, "mms_subject", this.r);
            agnc.r(contentValues, "mms_transaction_id", this.s);
            agnc.r(contentValues, "mms_content_location", this.t);
            contentValues.put("mms_expiry", Long.valueOf(this.u));
            if (intValue >= 59890) {
                contentValues.put("rcs_expiry", Long.valueOf(this.v));
            }
            if (intValue >= 9030) {
                agnc.r(contentValues, "mms_retrieve_text", this.w);
            }
            contentValues.put("raw_status", Integer.valueOf(this.x));
            agnc.r(contentValues, "self_id", this.y);
            if (intValue >= 60160) {
                qwe qweVar = this.z;
                if (qweVar != null && !qweVar.equals(null)) {
                    contentValues.put("my_identity_foreign_key", riw.n(this.z));
                } else {
                    contentValues.putNull("my_identity_foreign_key");
                }
            }
            contentValues.put("retry_start_timestamp", Long.valueOf(this.A));
            if (intValue >= 8500) {
                agnc.r(contentValues, "cloud_sync_id", this.B);
            }
            if (intValue >= 41040) {
                rve rveVar = this.C;
                if (rveVar == null) {
                    contentValues.putNull("rcs_message_id_with_text_type");
                } else {
                    contentValues.put("rcs_message_id_with_text_type", rve.d(rveVar));
                }
            }
            if (intValue >= 29060) {
                contentValues.put("etouffee_status", Integer.valueOf(this.D));
            }
            if (intValue >= 29090) {
                tqr tqrVar = this.E;
                if (tqrVar == null) {
                    contentValues.putNull(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS);
                } else {
                    contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS, Integer.valueOf(tqrVar.ordinal()));
                }
            }
            if (intValue >= 39000) {
                contentValues.put("rcs_ui_status", Integer.valueOf(this.F));
            }
            if (intValue >= 30010) {
                contentValues.put("is_hidden", Boolean.valueOf(this.G));
            }
            if (intValue >= 10002) {
                agnc.r(contentValues, "rcs_remote_instance", this.H);
            }
            if (intValue >= 10004) {
                contentValues.put("rcs_file_transfer_session_id", Long.valueOf(this.I));
            }
            if (intValue >= 9000) {
                contentValues.put("sms_error_code", Integer.valueOf(this.J));
            }
            if (intValue >= 9000) {
                agnc.r(contentValues, "sms_error_desc_map_name", this.K);
            }
            if (intValue >= 9010) {
                agnc.r(contentValues, "correlation_id", this.L);
            }
            if (intValue >= 31010) {
                agnc.r(contentValues, "cms_id", this.M);
            }
            if (intValue >= 37040) {
                contentValues.put("cms_last_mod_seq", Long.valueOf(this.N));
            }
            if (intValue >= 19020) {
                agnc.r(contentValues, "web_id", this.O);
            }
            if (intValue >= 29100) {
                contentValues.put("usage_stats_logging_id", Long.valueOf(this.P));
            }
            if (intValue >= 35030) {
                contentValues.put("send_counter", Long.valueOf(this.Q));
            }
            if (intValue >= 35030) {
                rve rveVar2 = this.R;
                if (rveVar2 == null) {
                    contentValues.putNull("original_rcs_message_id");
                } else {
                    contentValues.put("original_rcs_message_id", rve.d(rveVar2));
                }
            }
            if (intValue >= 37020) {
                agnc.r(contentValues, "custom_delivery_receipt_mime_type", this.S);
            }
            if (intValue >= 37020) {
                contentValues.put("custom_delivery_receipt_content", this.T);
            }
            if (intValue >= 37030) {
                contentValues.put("report_attempt_acounter", Long.valueOf(this.U));
            }
            if (intValue >= 45020) {
                apwq apwqVar = this.V;
                if (apwqVar == null) {
                    contentValues.putNull("custom_headers");
                } else {
                    contentValues.put("custom_headers", apwqVar.toByteArray());
                }
            }
            if (intValue >= 46010) {
                agnc.r(contentValues, "cms_correlation_id", this.W);
            }
            if (intValue >= 48030) {
                agnc.r(contentValues, "group_private_participant", this.X);
            }
            if (intValue >= 48030) {
                MessageIdType messageIdType2 = this.Y;
                if (messageIdType2 != null && !messageIdType2.equals(rvc.a)) {
                    contentValues.put("original_message_id", Long.valueOf(rvc.a(this.Y)));
                } else {
                    contentValues.putNull("original_message_id");
                }
            }
            if (intValue >= 49060) {
                contentValues.put("awaiting_reverse_sync", Boolean.valueOf(this.Z));
            }
            if (intValue >= 49060) {
                Uri uri2 = this.aa;
                if (uri2 == null) {
                    contentValues.putNull("old_sms_message_uri");
                } else {
                    contentValues.put("old_sms_message_uri", uri2.toString());
                }
            }
            if (intValue >= 56000) {
                Optional optional = this.ab;
                if (optional != null && !optional.equals(rvg.a)) {
                    contentValues.put("draft_id", rvg.b(this.ab));
                } else {
                    contentValues.putNull("draft_id");
                }
            }
            if (intValue >= 58040) {
                contentValues.put("result_code", Integer.valueOf(this.ac));
            }
            if (intValue >= 58210) {
                xxw xxwVar = this.ad;
                if (xxwVar == null) {
                    contentValues.putNull("cms_life_cycle");
                } else {
                    contentValues.put("cms_life_cycle", Integer.valueOf(xxwVar.ordinal()));
                }
            }
            if (intValue >= 58710) {
                tqf tqfVar = this.ae;
                if (tqfVar == null) {
                    contentValues.putNull("fallback_reason");
                } else {
                    contentValues.put("fallback_reason", Integer.valueOf(tqfVar.ordinal()));
                }
            }
            if (intValue >= 58230) {
                contentValues.put("auto_retry_counter", Integer.valueOf(this.af));
            }
            if (intValue >= 58280) {
                contentValues.put("can_revoke_before_delivered_with_rcs", Boolean.valueOf(this.ag));
            }
            if (intValue >= 58680) {
                atok atokVar = this.ah;
                if (atokVar == null) {
                    contentValues.putNull("trace_id");
                } else {
                    contentValues.put("trace_id", atokVar.toByteArray());
                }
            }
            if (intValue >= 58720) {
                tqp tqpVar = this.ai;
                if (tqpVar == null) {
                    contentValues.putNull("outgoing_delivery_report_status");
                } else {
                    contentValues.put("outgoing_delivery_report_status", Integer.valueOf(tqpVar.ordinal()));
                }
            }
            if (intValue >= 58720) {
                tqp tqpVar2 = this.aj;
                if (tqpVar2 == null) {
                    contentValues.putNull("outgoing_read_report_status");
                } else {
                    contentValues.put("outgoing_read_report_status", Integer.valueOf(tqpVar2.ordinal()));
                }
            }
            if (intValue >= 59310) {
                tqu tquVar = this.ak;
                if (tquVar == null) {
                    contentValues.putNull("xms_transport");
                } else {
                    contentValues.put("xms_transport", Integer.valueOf(tquVar.ordinal()));
                }
            }
            if (intValue >= 59430) {
                contentValues.put("message_original_protocol", Integer.valueOf(this.al));
            }
            if (intValue >= 59490) {
                ruz ruzVar = this.am;
                if (ruzVar != null && !ruzVar.equals(ruz.a)) {
                    contentValues.put("satellite_datagram_id", ruz.d(this.am));
                } else {
                    contentValues.putNull("satellite_datagram_id");
                }
            }
            if (intValue >= 60190) {
                utk utkVar = this.an;
                if (utkVar == null) {
                    contentValues.putNull("encryption_protocol");
                } else {
                    contentValues.put("encryption_protocol", Integer.valueOf(utkVar.ordinal()));
                }
            }
            if (intValue >= 60370) {
                Optional optional2 = this.ao;
                if (optional2 != null && !optional2.equals(rvg.a)) {
                    contentValues.put("message_persistence_id", rvg.b(this.ao));
                } else {
                    contentValues.putNull("message_persistence_id");
                }
            }
        }

        @Override // defpackage.aglz
        public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
            sxt sxtVar = (sxt) agmqVar;
            aq();
            this.cJ = sxtVar.dx();
            if (sxtVar.db(0)) {
                this.a = sxtVar.E();
                fE(0);
            }
            if (sxtVar.db(1)) {
                this.b = sxtVar.C();
                fE(1);
            }
            if (sxtVar.db(2)) {
                this.c = sxtVar.ai();
                fE(2);
            }
            if (sxtVar.db(3)) {
                this.d = sxtVar.aj();
                fE(3);
            }
            if (sxtVar.db(4)) {
                this.e = sxtVar.ae();
                fE(4);
            }
            if (sxtVar.db(5)) {
                this.f = sxtVar.ag();
                fE(5);
            }
            if (sxtVar.db(6)) {
                this.g = sxtVar.w();
                fE(6);
            }
            if (sxtVar.db(7)) {
                this.h = sxtVar.R();
                fE(7);
            }
            if (sxtVar.db(8)) {
                this.i = sxtVar.s();
                fE(8);
            }
            if (sxtVar.db(9)) {
                this.j = sxtVar.g();
                fE(9);
            }
            if (sxtVar.db(10)) {
                this.k = sxtVar.n();
                fE(10);
            }
            if (sxtVar.db(11)) {
                this.l = sxtVar.e();
                fE(11);
            }
            if (sxtVar.db(12)) {
                this.m = sxtVar.aq();
                fE(12);
            }
            if (sxtVar.db(13)) {
                this.n = sxtVar.ar();
                fE(13);
            }
            if (sxtVar.db(14)) {
                this.o = sxtVar.A();
                fE(14);
            }
            if (sxtVar.db(15)) {
                this.p = sxtVar.m();
                fE(15);
            }
            if (sxtVar.db(16)) {
                this.q = sxtVar.x();
                fE(16);
            }
            if (sxtVar.db(17)) {
                this.r = sxtVar.ac();
                fE(17);
            }
            if (sxtVar.db(18)) {
                this.s = sxtVar.ad();
                fE(18);
            }
            if (sxtVar.db(19)) {
                this.t = sxtVar.aa();
                fE(19);
            }
            if (sxtVar.db(20)) {
                this.u = sxtVar.p();
                fE(20);
            }
            if (sxtVar.db(21)) {
                this.v = sxtVar.q();
                fE(21);
            }
            if (sxtVar.db(22)) {
                this.w = sxtVar.ab();
                fE(22);
            }
            if (sxtVar.db(23)) {
                this.x = sxtVar.h();
                fE(23);
            }
            if (sxtVar.db(24)) {
                this.y = sxtVar.ah();
                fE(24);
            }
            if (sxtVar.db(25)) {
                this.z = sxtVar.B();
                fE(25);
            }
            if (sxtVar.db(26)) {
                this.A = sxtVar.u();
                fE(26);
            }
            if (sxtVar.db(27)) {
                this.B = sxtVar.U();
                fE(27);
            }
            if (sxtVar.db(28)) {
                this.C = sxtVar.H();
                fE(28);
            }
            if (sxtVar.db(29)) {
                this.D = sxtVar.i();
                fE(29);
            }
            if (sxtVar.db(30)) {
                this.E = sxtVar.L();
                fE(30);
            }
            if (sxtVar.db(31)) {
                this.F = sxtVar.j();
                fE(31);
            }
            if (sxtVar.db(32)) {
                this.G = sxtVar.ap();
                fE(32);
            }
            if (sxtVar.db(33)) {
                this.H = sxtVar.af();
                fE(33);
            }
            if (sxtVar.db(34)) {
                this.I = sxtVar.r();
                fE(34);
            }
            if (sxtVar.db(35)) {
                this.J = sxtVar.l();
                fE(35);
            }
            if (sxtVar.db(36)) {
                this.K = sxtVar.ak();
                fE(36);
            }
            if (sxtVar.db(37)) {
                this.L = sxtVar.X();
                fE(37);
            }
            if (sxtVar.db(38)) {
                this.M = sxtVar.W();
                fE(38);
            }
            if (sxtVar.db(39)) {
                this.N = sxtVar.o();
                fE(39);
            }
            if (sxtVar.db(40)) {
                this.O = sxtVar.al();
                fE(40);
            }
            if (sxtVar.db(41)) {
                this.P = sxtVar.y();
                fE(41);
            }
            if (sxtVar.db(42)) {
                this.Q = sxtVar.v();
                fE(42);
            }
            if (sxtVar.db(43)) {
                this.R = sxtVar.G();
                fE(43);
            }
            if (sxtVar.db(44)) {
                this.S = sxtVar.Y();
                fE(44);
            }
            if (sxtVar.db(45)) {
                this.T = sxtVar.as();
                fE(45);
            }
            if (sxtVar.db(46)) {
                this.U = sxtVar.t();
                fE(46);
            }
            if (sxtVar.db(47)) {
                this.V = sxtVar.Q();
                fE(47);
            }
            if (sxtVar.db(48)) {
                this.W = sxtVar.V();
                fE(48);
            }
            if (sxtVar.db(49)) {
                this.X = sxtVar.Z();
                fE(49);
            }
            if (sxtVar.db(50)) {
                this.Y = sxtVar.F();
                fE(50);
            }
            if (sxtVar.db(51)) {
                this.Z = sxtVar.an();
                fE(51);
            }
            if (sxtVar.db(52)) {
                this.aa = sxtVar.z();
                fE(52);
            }
            if (sxtVar.db(53)) {
                this.ab = sxtVar.S();
                fE(53);
            }
            if (sxtVar.db(54)) {
                this.ac = sxtVar.k();
                fE(54);
            }
            if (sxtVar.db(55)) {
                this.ad = sxtVar.O();
                fE(55);
            }
            if (sxtVar.db(56)) {
                this.ae = sxtVar.I();
                fE(56);
            }
            if (sxtVar.db(57)) {
                this.af = sxtVar.c();
                fE(57);
            }
            if (sxtVar.db(58)) {
                this.ag = sxtVar.ao();
                fE(58);
            }
            if (sxtVar.db(59)) {
                this.ah = sxtVar.am();
                fE(59);
            }
            if (sxtVar.db(60)) {
                this.ai = sxtVar.J();
                fE(60);
            }
            if (sxtVar.db(61)) {
                this.aj = sxtVar.K();
                fE(61);
            }
            if (sxtVar.db(62)) {
                this.ak = sxtVar.M();
                fE(62);
            }
            if (sxtVar.db(63)) {
                this.al = sxtVar.f();
                fE(63);
            }
            if (sxtVar.db(64)) {
                this.am = sxtVar.D();
                fE(64);
            }
            if (sxtVar.db(65)) {
                this.an = sxtVar.N();
                fE(65);
            }
            if (sxtVar.db(66)) {
                this.ao = sxtVar.T();
                fE(66);
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BindData)) {
                return false;
            }
            BindData bindData = (BindData) obj;
            if (super.aC(bindData.cJ) && Objects.equals(this.a, bindData.a) && Objects.equals(this.b, bindData.b) && Objects.equals(this.c, bindData.c) && Objects.equals(this.d, bindData.d) && Objects.equals(this.e, bindData.e) && Objects.equals(this.f, bindData.f) && this.g == bindData.g && Objects.equals(this.h, bindData.h) && this.i == bindData.i && this.j == bindData.j && this.k == bindData.k && this.l == bindData.l && this.m == bindData.m && this.n == bindData.n && Objects.equals(this.o, bindData.o) && this.p == bindData.p && this.q == bindData.q && Objects.equals(this.r, bindData.r) && Objects.equals(this.s, bindData.s) && Objects.equals(this.t, bindData.t) && this.u == bindData.u && this.v == bindData.v && Objects.equals(this.w, bindData.w) && this.x == bindData.x && Objects.equals(this.y, bindData.y) && Objects.equals(this.z, bindData.z) && this.A == bindData.A && Objects.equals(this.B, bindData.B) && Objects.equals(this.C, bindData.C) && this.D == bindData.D && this.E == bindData.E && this.F == bindData.F && this.G == bindData.G && Objects.equals(this.H, bindData.H) && this.I == bindData.I && this.J == bindData.J && Objects.equals(this.K, bindData.K) && Objects.equals(this.L, bindData.L) && Objects.equals(this.M, bindData.M) && this.N == bindData.N && Objects.equals(this.O, bindData.O) && this.P == bindData.P && this.Q == bindData.Q && Objects.equals(this.R, bindData.R) && Objects.equals(this.S, bindData.S) && Arrays.equals(this.T, bindData.T) && this.U == bindData.U && Objects.equals(this.V, bindData.V) && Objects.equals(this.W, bindData.W) && Objects.equals(this.X, bindData.X) && Objects.equals(this.Y, bindData.Y) && this.Z == bindData.Z && Objects.equals(this.aa, bindData.aa) && Objects.equals(this.ab, bindData.ab) && this.ac == bindData.ac && this.ad == bindData.ad && this.ae == bindData.ae && this.af == bindData.af && this.ag == bindData.ag && Objects.equals(this.ah, bindData.ah) && this.ai == bindData.ai && this.aj == bindData.aj && this.ak == bindData.ak && this.al == bindData.al && Objects.equals(this.am, bindData.am) && this.an == bindData.an && Objects.equals(this.ao, bindData.ao)) {
                return true;
            }
            return false;
        }

        @Override // defpackage.agma
        public final String f() {
            return String.format(Locale.US, "INTO %s (%s) VALUES ", "messages", agnc.j(new String[]{"conversation_id", "sender_id", "sender_send_destination", "msisdn_receiving_rcs_message", "receiving_network_country", "sent_timestamp", "queue_insert_timestamp", "received_timestamp", "message_protocol", "message_status", "message_report_status", "seen", "read", "sms_message_uri", "sms_priority", "sms_message_size", "mms_subject", "mms_transaction_id", "mms_content_location", "mms_expiry", "rcs_expiry", "mms_retrieve_text", "raw_status", "self_id", "my_identity_foreign_key", "retry_start_timestamp", "cloud_sync_id", "rcs_message_id_with_text_type", "etouffee_status", BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS, "rcs_ui_status", "is_hidden", "rcs_remote_instance", "rcs_file_transfer_session_id", "sms_error_code", "sms_error_desc_map_name", "correlation_id", "cms_id", "cms_last_mod_seq", "web_id", "usage_stats_logging_id", "send_counter", "original_rcs_message_id", "custom_delivery_receipt_mime_type", "custom_delivery_receipt_content", "report_attempt_acounter", "custom_headers", "cms_correlation_id", "group_private_participant", "original_message_id", "awaiting_reverse_sync", "old_sms_message_uri", "draft_id", "result_code", "cms_life_cycle", "fallback_reason", "auto_retry_counter", "can_revoke_before_delivered_with_rcs", "trace_id", "outgoing_delivery_report_status", "outgoing_read_report_status", "xms_transport", "message_original_protocol", "satellite_datagram_id", "encryption_protocol", "message_persistence_id"}));
        }

        @Override // defpackage.aglz
        protected final void fo(Parcel parcel) {
            boolean z;
            boolean z2;
            Uri parse;
            boolean z3;
            apwq apwqVar;
            boolean z4;
            Uri parse2;
            atok atokVar;
            this.a = new MessageIdType(parcel.readLong());
            this.b = new ConversationIdType(parcel.readLong());
            this.c = parcel.readString();
            this.d = parcel.readString();
            this.e = parcel.readString();
            this.f = parcel.readString();
            this.g = parcel.readLong();
            this.h = uzz.l(parcel.readLong());
            this.i = parcel.readLong();
            this.j = parcel.readInt();
            this.k = parcel.readInt();
            this.l = parcel.readInt();
            boolean z5 = false;
            if (parcel.readInt() == 1) {
                z = true;
            } else {
                z = false;
            }
            this.m = z;
            if (parcel.readInt() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.n = z2;
            String readString = parcel.readString();
            if (readString == null) {
                parse = null;
            } else {
                parse = Uri.parse(readString);
            }
            this.o = parse;
            this.p = parcel.readInt();
            this.q = parcel.readLong();
            this.r = parcel.readString();
            this.s = parcel.readString();
            this.t = parcel.readString();
            this.u = parcel.readLong();
            this.v = parcel.readLong();
            this.w = parcel.readString();
            this.x = parcel.readInt();
            this.y = parcel.readString();
            this.z = riw.m(parcel.readString());
            this.A = parcel.readLong();
            this.B = parcel.readString();
            this.C = rve.a(parcel.readString());
            this.D = parcel.readInt();
            tqr[] values = tqr.values();
            int readInt = parcel.readInt();
            if (readInt >= 0) {
                if (readInt < values.length) {
                    this.E = values[readInt];
                } else {
                    throw new IllegalArgumentException();
                }
            }
            this.F = parcel.readInt();
            if (parcel.readInt() == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.G = z3;
            this.H = parcel.readString();
            this.I = parcel.readLong();
            this.J = parcel.readInt();
            this.K = parcel.readString();
            this.L = parcel.readString();
            this.M = parcel.readString();
            this.N = parcel.readLong();
            this.O = parcel.readString();
            this.P = parcel.readLong();
            this.Q = parcel.readLong();
            this.R = rve.a(parcel.readString());
            this.S = parcel.readString();
            this.T = parcel.createByteArray();
            this.U = parcel.readLong();
            byte[] createByteArray = parcel.createByteArray();
            if (createByteArray == null) {
                apwqVar = null;
            } else {
                try {
                    apwqVar = (apwq) apag.parseFrom(apwq.a, createByteArray, aozs.a());
                } catch (Throwable unused) {
                    this.V = null;
                }
            }
            this.V = apwqVar;
            this.W = parcel.readString();
            this.X = parcel.readString();
            this.Y = new MessageIdType(parcel.readLong());
            if (parcel.readInt() == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.Z = z4;
            String readString2 = parcel.readString();
            if (readString2 == null) {
                parse2 = null;
            } else {
                parse2 = Uri.parse(readString2);
            }
            this.aa = parse2;
            this.ab = rvg.a(parcel.readString());
            this.ac = parcel.readInt();
            xxw[] values2 = xxw.values();
            int readInt2 = parcel.readInt();
            if (readInt2 >= 0) {
                if (readInt2 < values2.length) {
                    this.ad = values2[readInt2];
                } else {
                    throw new IllegalArgumentException();
                }
            }
            tqf[] values3 = tqf.values();
            int readInt3 = parcel.readInt();
            if (readInt3 >= 0) {
                if (readInt3 < values3.length) {
                    this.ae = values3[readInt3];
                } else {
                    throw new IllegalArgumentException();
                }
            }
            this.af = parcel.readInt();
            if (parcel.readInt() == 1) {
                z5 = true;
            }
            this.ag = z5;
            byte[] createByteArray2 = parcel.createByteArray();
            if (createByteArray2 == null) {
                atokVar = null;
            } else {
                try {
                    atokVar = (atok) apag.parseFrom(atok.a, createByteArray2, aozs.a());
                } catch (Throwable unused2) {
                    this.ah = null;
                }
            }
            this.ah = atokVar;
            tqp[] values4 = tqp.values();
            int readInt4 = parcel.readInt();
            if (readInt4 >= 0) {
                if (readInt4 < values4.length) {
                    this.ai = values4[readInt4];
                } else {
                    throw new IllegalArgumentException();
                }
            }
            tqp[] values5 = tqp.values();
            int readInt5 = parcel.readInt();
            if (readInt5 >= 0) {
                if (readInt5 < values5.length) {
                    this.aj = values5[readInt5];
                } else {
                    throw new IllegalArgumentException();
                }
            }
            tqu[] values6 = tqu.values();
            int readInt6 = parcel.readInt();
            if (readInt6 >= 0) {
                if (readInt6 < values6.length) {
                    this.ak = values6[readInt6];
                } else {
                    throw new IllegalArgumentException();
                }
            }
            this.al = parcel.readInt();
            this.am = new ruz(parcel.readString());
            utk[] values7 = utk.values();
            int readInt7 = parcel.readInt();
            if (readInt7 >= 0) {
                if (readInt7 < values7.length) {
                    this.an = values7[readInt7];
                } else {
                    throw new IllegalArgumentException();
                }
            }
            this.ao = rvg.a(parcel.readString());
        }

        @Override // defpackage.aglz
        protected final void fp(Parcel parcel) {
            String uri;
            int ordinal;
            byte[] byteArray;
            String uri2;
            int ordinal2;
            int ordinal3;
            int ordinal4;
            int ordinal5;
            int ordinal6;
            parcel.writeLong(rvc.a(this.a));
            parcel.writeLong(ruy.a(this.b));
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f);
            parcel.writeLong(this.g);
            parcel.writeLong(uzz.k(this.h));
            parcel.writeLong(this.i);
            parcel.writeInt(this.j);
            parcel.writeInt(this.k);
            parcel.writeInt(this.l);
            parcel.writeInt(this.m ? 1 : 0);
            parcel.writeInt(this.n ? 1 : 0);
            Uri uri3 = this.o;
            byte[] bArr = null;
            if (uri3 == null) {
                uri = null;
            } else {
                uri = uri3.toString();
            }
            parcel.writeString(uri);
            parcel.writeInt(this.p);
            parcel.writeLong(this.q);
            parcel.writeString(this.r);
            parcel.writeString(this.s);
            parcel.writeString(this.t);
            parcel.writeLong(this.u);
            parcel.writeLong(this.v);
            parcel.writeString(this.w);
            parcel.writeInt(this.x);
            parcel.writeString(this.y);
            parcel.writeString(riw.n(this.z));
            parcel.writeLong(this.A);
            parcel.writeString(this.B);
            parcel.writeString(rve.d(this.C));
            parcel.writeInt(this.D);
            tqr tqrVar = this.E;
            int i = -1;
            if (tqrVar == null) {
                ordinal = -1;
            } else {
                ordinal = tqrVar.ordinal();
            }
            parcel.writeInt(ordinal);
            parcel.writeInt(this.F);
            parcel.writeInt(this.G ? 1 : 0);
            parcel.writeString(this.H);
            parcel.writeLong(this.I);
            parcel.writeInt(this.J);
            parcel.writeString(this.K);
            parcel.writeString(this.L);
            parcel.writeString(this.M);
            parcel.writeLong(this.N);
            parcel.writeString(this.O);
            parcel.writeLong(this.P);
            parcel.writeLong(this.Q);
            parcel.writeString(rve.d(this.R));
            parcel.writeString(this.S);
            parcel.writeByteArray(this.T);
            parcel.writeLong(this.U);
            apwq apwqVar = this.V;
            if (apwqVar == null) {
                byteArray = null;
            } else {
                byteArray = apwqVar.toByteArray();
            }
            parcel.writeByteArray(byteArray);
            parcel.writeString(this.W);
            parcel.writeString(this.X);
            parcel.writeLong(rvc.a(this.Y));
            parcel.writeInt(this.Z ? 1 : 0);
            Uri uri4 = this.aa;
            if (uri4 == null) {
                uri2 = null;
            } else {
                uri2 = uri4.toString();
            }
            parcel.writeString(uri2);
            parcel.writeString(rvg.b(this.ab));
            parcel.writeInt(this.ac);
            xxw xxwVar = this.ad;
            if (xxwVar == null) {
                ordinal2 = -1;
            } else {
                ordinal2 = xxwVar.ordinal();
            }
            parcel.writeInt(ordinal2);
            tqf tqfVar = this.ae;
            if (tqfVar == null) {
                ordinal3 = -1;
            } else {
                ordinal3 = tqfVar.ordinal();
            }
            parcel.writeInt(ordinal3);
            parcel.writeInt(this.af);
            parcel.writeInt(this.ag ? 1 : 0);
            atok atokVar = this.ah;
            if (atokVar != null) {
                bArr = atokVar.toByteArray();
            }
            parcel.writeByteArray(bArr);
            tqp tqpVar = this.ai;
            if (tqpVar == null) {
                ordinal4 = -1;
            } else {
                ordinal4 = tqpVar.ordinal();
            }
            parcel.writeInt(ordinal4);
            tqp tqpVar2 = this.aj;
            if (tqpVar2 == null) {
                ordinal5 = -1;
            } else {
                ordinal5 = tqpVar2.ordinal();
            }
            parcel.writeInt(ordinal5);
            tqu tquVar = this.ak;
            if (tquVar == null) {
                ordinal6 = -1;
            } else {
                ordinal6 = tquVar.ordinal();
            }
            parcel.writeInt(ordinal6);
            parcel.writeInt(this.al);
            parcel.writeString(ruz.d(this.am));
            utk utkVar = this.an;
            if (utkVar != null) {
                i = utkVar.ordinal();
            }
            parcel.writeInt(i);
            parcel.writeString(rvg.b(this.ao));
        }

        @Override // defpackage.agma
        public final String g() {
            return "_id";
        }

        public final int h() {
            ao(11, "message_report_status");
            return this.l;
        }

        public final int hashCode() {
            aday adayVar;
            int ordinal;
            int ordinal2;
            int ordinal3;
            int ordinal4;
            int ordinal5;
            int ordinal6;
            int ordinal7;
            aday adayVar2 = this.cJ;
            if (adayVar2 != null && !adayVar2.Y()) {
                adayVar = this.cJ;
            } else {
                adayVar = null;
            }
            MessageIdType messageIdType = this.a;
            ConversationIdType conversationIdType = this.b;
            String str = this.c;
            String str2 = this.d;
            String str3 = this.e;
            String str4 = this.f;
            Long valueOf = Long.valueOf(this.g);
            Instant instant = this.h;
            Long valueOf2 = Long.valueOf(this.i);
            Integer valueOf3 = Integer.valueOf(this.j);
            Integer valueOf4 = Integer.valueOf(this.k);
            Integer valueOf5 = Integer.valueOf(this.l);
            Boolean valueOf6 = Boolean.valueOf(this.m);
            Boolean valueOf7 = Boolean.valueOf(this.n);
            Uri uri = this.o;
            Integer valueOf8 = Integer.valueOf(this.p);
            Long valueOf9 = Long.valueOf(this.q);
            String str5 = this.r;
            String str6 = this.s;
            String str7 = this.t;
            Long valueOf10 = Long.valueOf(this.u);
            Long valueOf11 = Long.valueOf(this.v);
            String str8 = this.w;
            Integer valueOf12 = Integer.valueOf(this.x);
            String str9 = this.y;
            qwe qweVar = this.z;
            Long valueOf13 = Long.valueOf(this.A);
            String str10 = this.B;
            rve rveVar = this.C;
            Integer valueOf14 = Integer.valueOf(this.D);
            tqr tqrVar = this.E;
            if (tqrVar == null) {
                ordinal = 0;
            } else {
                ordinal = tqrVar.ordinal();
            }
            Integer valueOf15 = Integer.valueOf(ordinal);
            Integer valueOf16 = Integer.valueOf(this.F);
            Boolean valueOf17 = Boolean.valueOf(this.G);
            String str11 = this.H;
            Long valueOf18 = Long.valueOf(this.I);
            Integer valueOf19 = Integer.valueOf(this.J);
            String str12 = this.K;
            String str13 = this.L;
            String str14 = this.M;
            Long valueOf20 = Long.valueOf(this.N);
            String str15 = this.O;
            Long valueOf21 = Long.valueOf(this.P);
            Long valueOf22 = Long.valueOf(this.Q);
            rve rveVar2 = this.R;
            String str16 = this.S;
            Integer valueOf23 = Integer.valueOf(Arrays.hashCode(this.T));
            Long valueOf24 = Long.valueOf(this.U);
            apwq apwqVar = this.V;
            String str17 = this.W;
            String str18 = this.X;
            MessageIdType messageIdType2 = this.Y;
            Boolean valueOf25 = Boolean.valueOf(this.Z);
            Uri uri2 = this.aa;
            Optional optional = this.ab;
            Integer valueOf26 = Integer.valueOf(this.ac);
            xxw xxwVar = this.ad;
            if (xxwVar == null) {
                ordinal2 = 0;
            } else {
                ordinal2 = xxwVar.ordinal();
            }
            Integer valueOf27 = Integer.valueOf(ordinal2);
            tqf tqfVar = this.ae;
            if (tqfVar == null) {
                ordinal3 = 0;
            } else {
                ordinal3 = tqfVar.ordinal();
            }
            Integer valueOf28 = Integer.valueOf(ordinal3);
            Integer valueOf29 = Integer.valueOf(this.af);
            Boolean valueOf30 = Boolean.valueOf(this.ag);
            atok atokVar = this.ah;
            tqp tqpVar = this.ai;
            if (tqpVar == null) {
                ordinal4 = 0;
            } else {
                ordinal4 = tqpVar.ordinal();
            }
            Integer valueOf31 = Integer.valueOf(ordinal4);
            tqp tqpVar2 = this.aj;
            if (tqpVar2 == null) {
                ordinal5 = 0;
            } else {
                ordinal5 = tqpVar2.ordinal();
            }
            Integer valueOf32 = Integer.valueOf(ordinal5);
            tqu tquVar = this.ak;
            if (tquVar == null) {
                ordinal6 = 0;
            } else {
                ordinal6 = tquVar.ordinal();
            }
            Integer valueOf33 = Integer.valueOf(ordinal6);
            Integer valueOf34 = Integer.valueOf(this.al);
            ruz ruzVar = this.am;
            utk utkVar = this.an;
            if (utkVar == null) {
                ordinal7 = 0;
            } else {
                ordinal7 = utkVar.ordinal();
            }
            return Objects.hash(adayVar, messageIdType, conversationIdType, str, str2, str3, str4, valueOf, instant, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, uri, valueOf8, valueOf9, str5, str6, str7, valueOf10, valueOf11, str8, valueOf12, str9, qweVar, valueOf13, str10, rveVar, valueOf14, valueOf15, valueOf16, valueOf17, str11, valueOf18, valueOf19, str12, str13, str14, valueOf20, str15, valueOf21, valueOf22, rveVar2, str16, valueOf23, valueOf24, apwqVar, str17, str18, messageIdType2, valueOf25, uri2, optional, valueOf26, valueOf27, valueOf28, valueOf29, valueOf30, atokVar, valueOf31, valueOf32, valueOf33, valueOf34, ruzVar, Integer.valueOf(ordinal7), this.ao, null);
        }

        @Override // defpackage.agma
        public final String i() {
            return "messages";
        }

        @Override // defpackage.agma
        public final void j(StringBuilder sb, List list) {
            String uri;
            Object valueOf;
            byte[] byteArray;
            String uri2;
            Object valueOf2;
            Object valueOf3;
            Object valueOf4;
            Object valueOf5;
            Object valueOf6;
            Object valueOf7;
            Object obj = new swc(this, 5).get();
            String str = this.c;
            String str2 = this.d;
            String str3 = this.e;
            String str4 = this.f;
            Long valueOf8 = Long.valueOf(this.g);
            Long valueOf9 = Long.valueOf(uzz.k(this.h));
            Long valueOf10 = Long.valueOf(this.i);
            Integer valueOf11 = Integer.valueOf(this.j);
            Integer valueOf12 = Integer.valueOf(this.k);
            Integer valueOf13 = Integer.valueOf(this.l);
            Integer valueOf14 = Integer.valueOf(this.m ? 1 : 0);
            Integer valueOf15 = Integer.valueOf(this.n ? 1 : 0);
            Uri uri3 = this.o;
            byte[] bArr = null;
            if (uri3 == null) {
                uri = null;
            } else {
                uri = uri3.toString();
            }
            Integer valueOf16 = Integer.valueOf(this.p);
            Long valueOf17 = Long.valueOf(this.q);
            String str5 = this.r;
            String str6 = this.s;
            String str7 = this.t;
            Long valueOf18 = Long.valueOf(this.u);
            Long valueOf19 = Long.valueOf(this.v);
            String str8 = this.w;
            Integer valueOf20 = Integer.valueOf(this.x);
            String str9 = this.y;
            Object obj2 = new swc(this, 6).get();
            Long valueOf21 = Long.valueOf(this.A);
            String str10 = this.B;
            String d = rve.d(this.C);
            Integer valueOf22 = Integer.valueOf(this.D);
            tqr tqrVar = this.E;
            if (tqrVar == null) {
                valueOf = 0;
            } else {
                valueOf = String.valueOf(tqrVar.ordinal());
            }
            Object obj3 = valueOf;
            Integer valueOf23 = Integer.valueOf(this.F);
            Integer valueOf24 = Integer.valueOf(this.G ? 1 : 0);
            String str11 = this.H;
            Long valueOf25 = Long.valueOf(this.I);
            Integer valueOf26 = Integer.valueOf(this.J);
            String str12 = this.K;
            String str13 = this.L;
            String str14 = this.M;
            Long valueOf27 = Long.valueOf(this.N);
            String str15 = this.O;
            Long valueOf28 = Long.valueOf(this.P);
            Long valueOf29 = Long.valueOf(this.Q);
            String d2 = rve.d(this.R);
            String str16 = this.S;
            byte[] bArr2 = this.T;
            Long valueOf30 = Long.valueOf(this.U);
            apwq apwqVar = this.V;
            if (apwqVar == null) {
                byteArray = null;
            } else {
                byteArray = apwqVar.toByteArray();
            }
            String str17 = this.W;
            String str18 = this.X;
            Object obj4 = new swc(this, 7).get();
            Integer valueOf31 = Integer.valueOf(this.Z ? 1 : 0);
            Uri uri4 = this.aa;
            if (uri4 == null) {
                uri2 = null;
            } else {
                uri2 = uri4.toString();
            }
            Object obj5 = new swc(this, 8).get();
            Integer valueOf32 = Integer.valueOf(this.ac);
            xxw xxwVar = this.ad;
            if (xxwVar == null) {
                valueOf2 = 0;
            } else {
                valueOf2 = String.valueOf(xxwVar.ordinal());
            }
            Object obj6 = valueOf2;
            tqf tqfVar = this.ae;
            if (tqfVar == null) {
                valueOf3 = 0;
            } else {
                valueOf3 = String.valueOf(tqfVar.ordinal());
            }
            Object obj7 = valueOf3;
            Integer valueOf33 = Integer.valueOf(this.af);
            Integer valueOf34 = Integer.valueOf(this.ag ? 1 : 0);
            atok atokVar = this.ah;
            if (atokVar != null) {
                bArr = atokVar.toByteArray();
            }
            tqp tqpVar = this.ai;
            if (tqpVar == null) {
                valueOf4 = 0;
            } else {
                valueOf4 = String.valueOf(tqpVar.ordinal());
            }
            Object obj8 = valueOf4;
            tqp tqpVar2 = this.aj;
            if (tqpVar2 == null) {
                valueOf5 = 0;
            } else {
                valueOf5 = String.valueOf(tqpVar2.ordinal());
            }
            Object obj9 = valueOf5;
            tqu tquVar = this.ak;
            if (tquVar == null) {
                valueOf6 = 0;
            } else {
                valueOf6 = String.valueOf(tquVar.ordinal());
            }
            Object obj10 = valueOf6;
            Integer valueOf35 = Integer.valueOf(this.al);
            Object obj11 = new swc(this, 9).get();
            utk utkVar = this.an;
            if (utkVar == null) {
                valueOf7 = 0;
            } else {
                valueOf7 = String.valueOf(utkVar.ordinal());
            }
            Object[] objArr = {obj, str, str2, str3, str4, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, uri, valueOf16, valueOf17, str5, str6, str7, valueOf18, valueOf19, str8, valueOf20, str9, obj2, valueOf21, str10, d, valueOf22, obj3, valueOf23, valueOf24, str11, valueOf25, valueOf26, str12, str13, str14, valueOf27, str15, valueOf28, valueOf29, d2, str16, bArr2, valueOf30, byteArray, str17, str18, obj4, valueOf31, uri2, obj5, valueOf32, obj6, obj7, valueOf33, valueOf34, bArr, obj8, obj9, obj10, valueOf35, obj11, valueOf7, new swc(this, 10).get()};
            sb.append('(');
            for (int i = 0; i < 66; i++) {
                Object obj12 = objArr[i];
                if (obj12 instanceof Number) {
                    sb.append(String.valueOf(obj12));
                } else {
                    if (obj12 instanceof String) {
                        String str19 = (String) obj12;
                        if (str19.length() < 12) {
                            sb.append(DatabaseUtils.sqlEscapeString(str19));
                        }
                    }
                    list.add(obj12);
                    sb.append('?');
                    sb.append(',');
                }
                sb.append(',');
            }
            sb.setLength(sb.length() - 1);
            sb.append(')');
        }

        public final int k() {
            ao(9, "message_protocol");
            return this.j;
        }

        public final int l() {
            ao(23, "raw_status");
            return this.x;
        }

        public final int m() {
            ao(29, "etouffee_status");
            return this.D;
        }

        public final int n() {
            ao(54, "result_code");
            return this.ac;
        }

        public final int o() {
            ao(35, "sms_error_code");
            return this.J;
        }

        public final int p() {
            ao(15, "sms_priority");
            return this.p;
        }

        public final int q() {
            ao(10, "message_status");
            return this.k;
        }

        public final long r() {
            ao(20, "mms_expiry");
            return this.u;
        }

        public final long s() {
            ao(34, "rcs_file_transfer_session_id");
            return this.I;
        }

        public final long t() {
            ao(8, "received_timestamp");
            return this.i;
        }

        public final String toString() {
            if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
                return String.format(Locale.US, "%s", "MessagesTable -- REDACTED");
            }
            return a();
        }

        public final long u() {
            ao(26, "retry_start_timestamp");
            return this.A;
        }

        public final long v() {
            ao(6, "sent_timestamp");
            return this.g;
        }

        public final long w() {
            ao(16, "sms_message_size");
            return this.q;
        }

        public final long x() {
            ao(41, "usage_stats_logging_id");
            return this.P;
        }

        public final Uri y() {
            ao(14, "sms_message_uri");
            return this.o;
        }

        public final ConversationIdType z() {
            ao(1, "conversation_id");
            return this.b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public BindData(Parcel parcel) {
            tqp tqpVar = tqp.UNKNOWN;
            this.ai = tqpVar;
            this.aj = tqpVar;
            this.ak = tqu.UNKNOWN;
            this.al = -1;
            this.am = ruz.a;
            this.an = utk.a;
            this.ao = uzz.j();
            ap(parcel);
        }
    }
}
