package com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.a;
import defpackage.aday;
import defpackage.aggp;
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
import defpackage.pyz;
import defpackage.pzm;
import defpackage.ruy;
import defpackage.rvc;
import defpackage.sdr;
import defpackage.smq;
import defpackage.swc;
import defpackage.taq;
import defpackage.tbe;
import defpackage.tbg;
import defpackage.tbh;
import defpackage.tbi;
import defpackage.tbn;
import defpackage.tbr;
import defpackage.tbs;
import defpackage.tbu;
import defpackage.tbv;
import defpackage.tqa;
import defpackage.tqd;
import defpackage.tqi;
import defpackage.tqj;
import defpackage.tql;
import defpackage.tqq;
import defpackage.tqw;
import defpackage.wch;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PartsTable extends aglo {
    public static final String[] a = {"parts._id", "parts.message_id", "parts.text", "parts.uri", "parts.content_type", "parts.original_uri", "parts.storage_uri", "parts.width", "parts.height", "parts.timestamp", "parts.output_uri", "parts.target_size", "parts.processing_status", "parts.cms_attachment_processing_status", "parts.conversation_id", "parts.sticker_set_id", "parts.sticker_id", "parts.media_modified_timestamp", "parts.longitude", "parts.latitude", "parts.preview_content_uri", "parts.preview_content_type", "parts.fallback_uri", "parts.source", "parts.bundle_index", "parts.blob_id", "parts.blob_gaia_email", "parts.cms_full_size_blob_id", "parts.cms_media_encryption_key", "parts.cms_compressed_media_encryption_key", "parts.blob_upload_permanent_failure", "parts.blob_upload_timestamp", "parts.expressive_sticker_name", "parts.file_name", "parts.duration", "parts.compressed_blob_id", "parts.cms_compressed_blob_id", "parts.compressed_blob_upload_permanent_failure", "parts.compressed_blob_upload_timestamp", "parts.media_encryption_key", "parts.compressed_media_encryption_key", "parts.missing_entry_in_telephony", "parts.awaiting_reverse_sync", "parts.file_size_bytes", "parts.local_cache_path", "parts.media_send_type", "parts.voice_metadata", "parts.validation_status", "parts.processing_id", "parts.rich_card_media_download_failure_reason", "parts.image_display_state"};
    public static final alor b;
    public static final alor c;
    public static final tbh d;
    public static final int[] e;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public static abstract class BindData extends aglz<tbn, tbr, tbs, BindData, tbi> implements Parcelable, agma {
        public static final Parcelable.Creator<BindData> CREATOR = new sdr(6);
        public String A;
        public String B;
        public byte[] C;
        public byte[] D;
        public String G;
        public String H;
        public long I;
        public String J;
        public String K;
        public byte[] N;
        public byte[] O;
        public boolean P;
        public long R;
        public String S;
        public aggp U;
        public String a;
        public String c;
        public Uri d;
        public String e;
        public Uri f;
        public Uri g;
        public long j;
        public Uri k;
        public Uri u;
        public String v;
        public Uri w;
        public String z;
        public MessageIdType b = rvc.a;
        public int h = -1;
        public int i = -1;
        public long l = 0;
        public tql m = tql.SUCCEEDED;
        public tqd n = tqd.NOT_FROM_CMS;
        public ConversationIdType o = ruy.a;
        public tqa p = new tqa(-1);
        public tqa q = new tqa(-1);
        public long r = -1;
        public double s = 0.0d;
        public double t = 0.0d;
        public int x = 13;
        public int y = 0;
        public boolean E = false;
        public long F = 0;
        public boolean L = false;
        public long M = 0;
        public boolean Q = false;
        public tqj T = tqj.STANDARD;
        public tqw V = tqw.UNKNOWN;
        public pyz W = null;
        public tqq X = tqq.NONE;
        public tqi Y = tqi.DEFAULT_NO_VERDICT;

        /* JADX INFO: Access modifiers changed from: protected */
        public BindData() {
        }

        public final String A() {
            ao(44, "local_cache_path");
            return this.S;
        }

        public final String B() {
            ao(2, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
            return this.c;
        }

        public final boolean C() {
            ao(30, "blob_upload_permanent_failure");
            return this.E;
        }

        public final boolean D() {
            ao(37, "compressed_blob_upload_permanent_failure");
            return this.L;
        }

        public final byte[] E() {
            ao(40, "compressed_media_encryption_key");
            return this.O;
        }

        public final byte[] F() {
            ao(39, "media_encryption_key");
            return this.N;
        }

        @Override // defpackage.aglz
        public final String a() {
            String str;
            String str2;
            String str3;
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
            String valueOf27 = String.valueOf(this.B);
            byte[] bArr = this.C;
            String str4 = "NULL";
            if (bArr == null) {
                str = "NULL";
            } else {
                str = String.valueOf(bArr.length);
            }
            String concat = "BLOB".concat(String.valueOf(str));
            byte[] bArr2 = this.D;
            if (bArr2 == null) {
                str2 = "NULL";
            } else {
                str2 = String.valueOf(bArr2.length);
            }
            String concat2 = "BLOB".concat(String.valueOf(str2));
            String valueOf28 = String.valueOf(this.E);
            String valueOf29 = String.valueOf(this.F);
            String valueOf30 = String.valueOf(this.G);
            String valueOf31 = String.valueOf(this.H);
            String valueOf32 = String.valueOf(this.I);
            String valueOf33 = String.valueOf(this.J);
            String valueOf34 = String.valueOf(this.K);
            String valueOf35 = String.valueOf(this.L);
            String valueOf36 = String.valueOf(this.M);
            byte[] bArr3 = this.N;
            if (bArr3 == null) {
                str3 = "NULL";
            } else {
                str3 = String.valueOf(bArr3.length);
            }
            String concat3 = "BLOB".concat(String.valueOf(str3));
            byte[] bArr4 = this.O;
            if (bArr4 != null) {
                str4 = String.valueOf(bArr4.length);
            }
            return String.format(locale, "PartsTable [_id: %s,\n  message_id: %s,\n  text: %s,\n  uri: %s,\n  content_type: %s,\n  original_uri: %s,\n  storage_uri: %s,\n  width: %s,\n  height: %s,\n  timestamp: %s,\n  output_uri: %s,\n  target_size: %s,\n  processing_status: %s,\n  cms_attachment_processing_status: %s,\n  conversation_id: %s,\n  sticker_set_id: %s,\n  sticker_id: %s,\n  media_modified_timestamp: %s,\n  longitude: %s,\n  latitude: %s,\n  preview_content_uri: %s,\n  preview_content_type: %s,\n  fallback_uri: %s,\n  source: %s,\n  bundle_index: %s,\n  blob_id: %s,\n  blob_gaia_email: %s,\n  cms_full_size_blob_id: %s,\n  cms_media_encryption_key: %s,\n  cms_compressed_media_encryption_key: %s,\n  blob_upload_permanent_failure: %s,\n  blob_upload_timestamp: %s,\n  expressive_sticker_name: %s,\n  file_name: %s,\n  duration: %s,\n  compressed_blob_id: %s,\n  cms_compressed_blob_id: %s,\n  compressed_blob_upload_permanent_failure: %s,\n  compressed_blob_upload_timestamp: %s,\n  media_encryption_key: %s,\n  compressed_media_encryption_key: %s,\n  missing_entry_in_telephony: %s,\n  awaiting_reverse_sync: %s,\n  file_size_bytes: %s,\n  local_cache_path: %s,\n  media_send_type: %s,\n  voice_metadata: %s,\n  validation_status: %s,\n  processing_id: %s,\n  rich_card_media_download_failure_reason: %s,\n  image_display_state: %s\n]\n", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, valueOf17, valueOf18, valueOf19, valueOf20, valueOf21, valueOf22, valueOf23, valueOf24, valueOf25, valueOf26, "REDACTED", valueOf27, concat, concat2, valueOf28, valueOf29, valueOf30, valueOf31, valueOf32, valueOf33, valueOf34, valueOf35, valueOf36, concat3, "BLOB".concat(String.valueOf(str4)), String.valueOf(this.P), String.valueOf(this.Q), String.valueOf(this.R), String.valueOf(this.S), String.valueOf(this.T), String.valueOf(this.U), String.valueOf(this.V), String.valueOf(this.W), String.valueOf(this.X), String.valueOf(this.Y));
        }

        @Override // defpackage.aglz
        public final void b(ContentValues contentValues) {
            Integer valueOf;
            valueOf = Integer.valueOf(a.bp().c());
            int intValue = valueOf.intValue();
            MessageIdType messageIdType = this.b;
            if (messageIdType != null && !messageIdType.equals(rvc.a)) {
                contentValues.put("message_id", Long.valueOf(rvc.a(this.b)));
            } else {
                contentValues.putNull("message_id");
            }
            agnc.r(contentValues, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, this.c);
            Uri uri = this.d;
            if (uri == null) {
                contentValues.putNull(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
            } else {
                contentValues.put(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri.toString());
            }
            agnc.r(contentValues, "content_type", this.e);
            if (intValue >= 10021) {
                Uri uri2 = this.f;
                if (uri2 == null) {
                    contentValues.putNull("original_uri");
                } else {
                    contentValues.put("original_uri", uri2.toString());
                }
            }
            if (intValue >= 29060) {
                Uri uri3 = this.g;
                if (uri3 == null) {
                    contentValues.putNull("storage_uri");
                } else {
                    contentValues.put("storage_uri", uri3.toString());
                }
            }
            contentValues.put("width", Integer.valueOf(this.h));
            contentValues.put("height", Integer.valueOf(this.i));
            if (intValue >= 3010) {
                contentValues.put("timestamp", Long.valueOf(this.j));
            }
            if (intValue >= 4020) {
                Uri uri4 = this.k;
                if (uri4 == null) {
                    contentValues.putNull("output_uri");
                } else {
                    contentValues.put("output_uri", uri4.toString());
                }
            }
            if (intValue >= 4020) {
                contentValues.put("target_size", Long.valueOf(this.l));
            }
            if (intValue >= 4020) {
                tql tqlVar = this.m;
                if (tqlVar == null) {
                    contentValues.putNull("processing_status");
                } else {
                    contentValues.put("processing_status", Integer.valueOf(tqlVar.ordinal()));
                }
            }
            if (intValue >= 44010) {
                tqd tqdVar = this.n;
                if (tqdVar == null) {
                    contentValues.putNull("cms_attachment_processing_status");
                } else {
                    contentValues.put("cms_attachment_processing_status", Integer.valueOf(tqdVar.ordinal()));
                }
            }
            ConversationIdType conversationIdType = this.o;
            if (conversationIdType != null && !conversationIdType.equals(ruy.a)) {
                contentValues.put("conversation_id", Long.valueOf(ruy.a(this.o)));
            } else {
                contentValues.putNull("conversation_id");
            }
            if (intValue >= 5020) {
                tqa tqaVar = this.p;
                if (tqaVar == null) {
                    contentValues.putNull("sticker_set_id");
                } else {
                    contentValues.put("sticker_set_id", wch.J(tqaVar));
                }
            }
            if (intValue >= 5020) {
                tqa tqaVar2 = this.q;
                if (tqaVar2 == null) {
                    contentValues.putNull("sticker_id");
                } else {
                    contentValues.put("sticker_id", wch.J(tqaVar2));
                }
            }
            if (intValue >= 7000) {
                contentValues.put("media_modified_timestamp", Long.valueOf(this.r));
            }
            if (intValue >= 10005) {
                contentValues.put("longitude", Double.valueOf(this.s));
            }
            if (intValue >= 10005) {
                contentValues.put("latitude", Double.valueOf(this.t));
            }
            if (intValue >= 10017) {
                Uri uri5 = this.u;
                if (uri5 == null) {
                    contentValues.putNull("preview_content_uri");
                } else {
                    contentValues.put("preview_content_uri", uri5.toString());
                }
            }
            if (intValue >= 10017) {
                agnc.r(contentValues, "preview_content_type", this.v);
            }
            if (intValue >= 13000) {
                Uri uri6 = this.w;
                if (uri6 == null) {
                    contentValues.putNull("fallback_uri");
                } else {
                    contentValues.put("fallback_uri", uri6.toString());
                }
            }
            if (intValue >= 14010) {
                contentValues.put("source", Integer.valueOf(this.x));
            }
            if (intValue >= 17010) {
                contentValues.put("bundle_index", Integer.valueOf(this.y));
            }
            if (intValue >= 17020) {
                agnc.r(contentValues, "blob_id", this.z);
            }
            if (intValue >= 59570) {
                agnc.r(contentValues, "blob_gaia_email", this.A);
            }
            if (intValue >= 40040) {
                agnc.r(contentValues, "cms_full_size_blob_id", this.B);
            }
            if (intValue >= 42010) {
                contentValues.put("cms_media_encryption_key", this.C);
            }
            if (intValue >= 42070) {
                contentValues.put("cms_compressed_media_encryption_key", this.D);
            }
            if (intValue >= 18000) {
                contentValues.put("blob_upload_permanent_failure", Boolean.valueOf(this.E));
            }
            if (intValue >= 19030) {
                contentValues.put("blob_upload_timestamp", Long.valueOf(this.F));
            }
            if (intValue >= 22060) {
                agnc.r(contentValues, "expressive_sticker_name", this.G);
            }
            if (intValue >= 26000) {
                agnc.r(contentValues, "file_name", this.H);
            }
            if (intValue >= 26040) {
                contentValues.put("duration", Long.valueOf(this.I));
            }
            if (intValue >= 27000) {
                agnc.r(contentValues, "compressed_blob_id", this.J);
            }
            if (intValue >= 40040) {
                agnc.r(contentValues, "cms_compressed_blob_id", this.K);
            }
            if (intValue >= 27000) {
                contentValues.put("compressed_blob_upload_permanent_failure", Boolean.valueOf(this.L));
            }
            if (intValue >= 27000) {
                contentValues.put("compressed_blob_upload_timestamp", Long.valueOf(this.M));
            }
            if (intValue >= 30040) {
                contentValues.put("media_encryption_key", this.N);
            }
            if (intValue >= 30040) {
                contentValues.put("compressed_media_encryption_key", this.O);
            }
            if (intValue >= 52030) {
                contentValues.put("missing_entry_in_telephony", Boolean.valueOf(this.P));
            }
            if (intValue >= 53040) {
                contentValues.put("awaiting_reverse_sync", Boolean.valueOf(this.Q));
            }
            if (intValue >= 52050) {
                contentValues.put("file_size_bytes", Long.valueOf(this.R));
            }
            if (intValue >= 52050) {
                agnc.r(contentValues, "local_cache_path", this.S);
            }
            if (intValue >= 58150) {
                tqj tqjVar = this.T;
                if (tqjVar == null) {
                    contentValues.putNull("media_send_type");
                } else {
                    contentValues.put("media_send_type", Integer.valueOf(tqjVar.ordinal()));
                }
            }
            if (intValue >= 59470) {
                aggp aggpVar = this.U;
                if (aggpVar == null) {
                    contentValues.putNull("voice_metadata");
                } else {
                    contentValues.put("voice_metadata", aggpVar.toByteArray());
                }
            }
            if (intValue >= 58770) {
                tqw tqwVar = this.V;
                if (tqwVar == null) {
                    contentValues.putNull("validation_status");
                } else {
                    contentValues.put("validation_status", Integer.valueOf(tqwVar.ordinal()));
                }
            }
            if (intValue >= 60080) {
                pyz pyzVar = this.W;
                if (pyzVar == null) {
                    contentValues.putNull("processing_id");
                } else {
                    contentValues.put("processing_id", pyz.a(pyzVar));
                }
            }
            if (intValue >= 60230) {
                tqq tqqVar = this.X;
                if (tqqVar == null) {
                    contentValues.putNull("rich_card_media_download_failure_reason");
                } else {
                    contentValues.put("rich_card_media_download_failure_reason", Integer.valueOf(tqqVar.ordinal()));
                }
            }
            if (intValue >= 60240) {
                tqi tqiVar = this.Y;
                if (tqiVar == null) {
                    contentValues.putNull("image_display_state");
                } else {
                    contentValues.put("image_display_state", Integer.valueOf(tqiVar.ordinal()));
                }
            }
        }

        @Override // defpackage.aglz
        public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
            tbn tbnVar = (tbn) agmqVar;
            aq();
            this.cJ = tbnVar.dx();
            if (tbnVar.db(0)) {
                this.a = tbnVar.Q();
                fE(0);
            }
            if (tbnVar.db(1)) {
                this.b = tbnVar.y();
                fE(1);
            }
            if (tbnVar.db(2)) {
                this.c = tbnVar.T();
                fE(2);
            }
            if (tbnVar.db(3)) {
                this.d = tbnVar.v();
                fE(3);
            }
            if (tbnVar.db(4)) {
                this.e = tbnVar.N();
                fE(4);
            }
            if (tbnVar.db(5)) {
                this.f = tbnVar.r();
                fE(5);
            }
            if (tbnVar.db(6)) {
                this.g = tbnVar.u();
                fE(6);
            }
            if (tbnVar.db(7)) {
                this.h = tbnVar.i();
                fE(7);
            }
            if (tbnVar.db(8)) {
                this.i = tbnVar.g();
                fE(8);
            }
            if (tbnVar.db(9)) {
                this.j = tbnVar.p();
                fE(9);
            }
            if (tbnVar.db(10)) {
                this.k = tbnVar.t();
                fE(10);
            }
            if (tbnVar.db(11)) {
                this.l = tbnVar.o();
                fE(11);
            }
            if (tbnVar.db(12)) {
                this.m = tbnVar.E();
                fE(12);
            }
            if (tbnVar.db(13)) {
                this.n = tbnVar.B();
                fE(13);
            }
            if (tbnVar.db(14)) {
                this.o = tbnVar.x();
                fE(14);
            }
            if (tbnVar.db(15)) {
                this.p = tbnVar.A();
                fE(15);
            }
            if (tbnVar.db(16)) {
                this.q = tbnVar.z();
                fE(16);
            }
            if (tbnVar.db(17)) {
                this.r = tbnVar.n();
                fE(17);
            }
            if (tbnVar.db(18)) {
                this.s = tbnVar.e();
                fE(18);
            }
            if (tbnVar.db(19)) {
                this.t = tbnVar.c();
                fE(19);
            }
            if (tbnVar.db(20)) {
                this.u = tbnVar.s();
                fE(20);
            }
            if (tbnVar.db(21)) {
                this.v = tbnVar.S();
                fE(21);
            }
            if (tbnVar.db(22)) {
                this.w = tbnVar.q();
                fE(22);
            }
            if (tbnVar.db(23)) {
                this.x = tbnVar.h();
                fE(23);
            }
            if (tbnVar.db(24)) {
                this.y = tbnVar.f();
                fE(24);
            }
            if (tbnVar.db(25)) {
                this.z = tbnVar.J();
                fE(25);
            }
            if (tbnVar.db(26)) {
                this.A = tbnVar.I();
                fE(26);
            }
            if (tbnVar.db(27)) {
                this.B = tbnVar.L();
                fE(27);
            }
            if (tbnVar.db(28)) {
                this.C = tbnVar.Z();
                fE(28);
            }
            if (tbnVar.db(29)) {
                this.D = tbnVar.Y();
                fE(29);
            }
            if (tbnVar.db(30)) {
                this.E = tbnVar.V();
                fE(30);
            }
            if (tbnVar.db(31)) {
                this.F = tbnVar.j();
                fE(31);
            }
            if (tbnVar.db(32)) {
                this.G = tbnVar.O();
                fE(32);
            }
            if (tbnVar.db(33)) {
                this.H = tbnVar.P();
                fE(33);
            }
            if (tbnVar.db(34)) {
                this.I = tbnVar.l();
                fE(34);
            }
            if (tbnVar.db(35)) {
                this.J = tbnVar.M();
                fE(35);
            }
            if (tbnVar.db(36)) {
                this.K = tbnVar.K();
                fE(36);
            }
            if (tbnVar.db(37)) {
                this.L = tbnVar.W();
                fE(37);
            }
            if (tbnVar.db(38)) {
                this.M = tbnVar.k();
                fE(38);
            }
            if (tbnVar.db(39)) {
                this.N = tbnVar.ab();
                fE(39);
            }
            if (tbnVar.db(40)) {
                this.O = tbnVar.aa();
                fE(40);
            }
            if (tbnVar.db(41)) {
                this.P = tbnVar.X();
                fE(41);
            }
            if (tbnVar.db(42)) {
                this.Q = tbnVar.U();
                fE(42);
            }
            if (tbnVar.db(43)) {
                this.R = tbnVar.m();
                fE(43);
            }
            if (tbnVar.db(44)) {
                this.S = tbnVar.R();
                fE(44);
            }
            if (tbnVar.db(45)) {
                this.T = tbnVar.D();
                fE(45);
            }
            if (tbnVar.db(46)) {
                this.U = tbnVar.H();
                fE(46);
            }
            if (tbnVar.db(47)) {
                this.V = tbnVar.G();
                fE(47);
            }
            if (tbnVar.db(48)) {
                this.W = tbnVar.w();
                fE(48);
            }
            if (tbnVar.db(49)) {
                this.X = tbnVar.F();
                fE(49);
            }
            if (tbnVar.db(50)) {
                this.Y = tbnVar.C();
                fE(50);
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
            if (super.aC(bindData.cJ) && Objects.equals(this.a, bindData.a) && Objects.equals(this.b, bindData.b) && Objects.equals(this.c, bindData.c) && Objects.equals(this.d, bindData.d) && Objects.equals(this.e, bindData.e) && Objects.equals(this.f, bindData.f) && Objects.equals(this.g, bindData.g) && this.h == bindData.h && this.i == bindData.i && this.j == bindData.j && Objects.equals(this.k, bindData.k) && this.l == bindData.l && this.m == bindData.m && this.n == bindData.n && Objects.equals(this.o, bindData.o) && Objects.equals(this.p, bindData.p) && Objects.equals(this.q, bindData.q) && this.r == bindData.r && this.s == bindData.s && this.t == bindData.t && Objects.equals(this.u, bindData.u) && Objects.equals(this.v, bindData.v) && Objects.equals(this.w, bindData.w) && this.x == bindData.x && this.y == bindData.y && Objects.equals(this.z, bindData.z) && Objects.equals(this.A, bindData.A) && Objects.equals(this.B, bindData.B) && Arrays.equals(this.C, bindData.C) && Arrays.equals(this.D, bindData.D) && this.E == bindData.E && this.F == bindData.F && Objects.equals(this.G, bindData.G) && Objects.equals(this.H, bindData.H) && this.I == bindData.I && Objects.equals(this.J, bindData.J) && Objects.equals(this.K, bindData.K) && this.L == bindData.L && this.M == bindData.M && Arrays.equals(this.N, bindData.N) && Arrays.equals(this.O, bindData.O) && this.P == bindData.P && this.Q == bindData.Q && this.R == bindData.R && Objects.equals(this.S, bindData.S) && this.T == bindData.T && Objects.equals(this.U, bindData.U) && this.V == bindData.V && Objects.equals(this.W, bindData.W) && this.X == bindData.X && this.Y == bindData.Y) {
                return true;
            }
            return false;
        }

        @Override // defpackage.agma
        public final String f() {
            return String.format(Locale.US, "INTO %s (%s) VALUES ", "parts", agnc.j(new String[]{"message_id", ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, "content_type", "original_uri", "storage_uri", "width", "height", "timestamp", "output_uri", "target_size", "processing_status", "cms_attachment_processing_status", "conversation_id", "sticker_set_id", "sticker_id", "media_modified_timestamp", "longitude", "latitude", "preview_content_uri", "preview_content_type", "fallback_uri", "source", "bundle_index", "blob_id", "blob_gaia_email", "cms_full_size_blob_id", "cms_media_encryption_key", "cms_compressed_media_encryption_key", "blob_upload_permanent_failure", "blob_upload_timestamp", "expressive_sticker_name", "file_name", "duration", "compressed_blob_id", "cms_compressed_blob_id", "compressed_blob_upload_permanent_failure", "compressed_blob_upload_timestamp", "media_encryption_key", "compressed_media_encryption_key", "missing_entry_in_telephony", "awaiting_reverse_sync", "file_size_bytes", "local_cache_path", "media_send_type", "voice_metadata", "validation_status", "processing_id", "rich_card_media_download_failure_reason", "image_display_state"}));
        }

        @Override // defpackage.aglz
        protected final void fo(Parcel parcel) {
            Uri parse;
            Uri parse2;
            Uri parse3;
            Uri parse4;
            Uri parse5;
            Uri parse6;
            boolean z;
            boolean z2;
            boolean z3;
            aggp aggpVar;
            this.a = parcel.readString();
            this.b = new MessageIdType(parcel.readLong());
            this.c = parcel.readString();
            String readString = parcel.readString();
            if (readString == null) {
                parse = null;
            } else {
                parse = Uri.parse(readString);
            }
            this.d = parse;
            this.e = parcel.readString();
            String readString2 = parcel.readString();
            if (readString2 == null) {
                parse2 = null;
            } else {
                parse2 = Uri.parse(readString2);
            }
            this.f = parse2;
            String readString3 = parcel.readString();
            if (readString3 == null) {
                parse3 = null;
            } else {
                parse3 = Uri.parse(readString3);
            }
            this.g = parse3;
            this.h = parcel.readInt();
            this.i = parcel.readInt();
            this.j = parcel.readLong();
            String readString4 = parcel.readString();
            if (readString4 == null) {
                parse4 = null;
            } else {
                parse4 = Uri.parse(readString4);
            }
            this.k = parse4;
            this.l = parcel.readLong();
            tql[] values = tql.values();
            int readInt = parcel.readInt();
            if (readInt >= 0) {
                if (readInt < values.length) {
                    this.m = values[readInt];
                } else {
                    throw new IllegalArgumentException();
                }
            }
            tqd[] values2 = tqd.values();
            int readInt2 = parcel.readInt();
            if (readInt2 >= 0) {
                if (readInt2 < values2.length) {
                    this.n = values2[readInt2];
                } else {
                    throw new IllegalArgumentException();
                }
            }
            this.o = new ConversationIdType(parcel.readLong());
            this.p = wch.I(parcel.readString());
            this.q = wch.I(parcel.readString());
            this.r = parcel.readLong();
            this.s = parcel.readDouble();
            this.t = parcel.readDouble();
            String readString5 = parcel.readString();
            if (readString5 == null) {
                parse5 = null;
            } else {
                parse5 = Uri.parse(readString5);
            }
            this.u = parse5;
            this.v = parcel.readString();
            String readString6 = parcel.readString();
            if (readString6 == null) {
                parse6 = null;
            } else {
                parse6 = Uri.parse(readString6);
            }
            this.w = parse6;
            this.x = parcel.readInt();
            this.y = parcel.readInt();
            this.z = parcel.readString();
            this.A = parcel.readString();
            this.B = parcel.readString();
            this.C = parcel.createByteArray();
            this.D = parcel.createByteArray();
            boolean z4 = false;
            if (parcel.readInt() == 1) {
                z = true;
            } else {
                z = false;
            }
            this.E = z;
            this.F = parcel.readLong();
            this.G = parcel.readString();
            this.H = parcel.readString();
            this.I = parcel.readLong();
            this.J = parcel.readString();
            this.K = parcel.readString();
            if (parcel.readInt() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.L = z2;
            this.M = parcel.readLong();
            this.N = parcel.createByteArray();
            this.O = parcel.createByteArray();
            if (parcel.readInt() == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.P = z3;
            if (parcel.readInt() == 1) {
                z4 = true;
            }
            this.Q = z4;
            this.R = parcel.readLong();
            this.S = parcel.readString();
            tqj[] values3 = tqj.values();
            int readInt3 = parcel.readInt();
            if (readInt3 >= 0) {
                if (readInt3 < values3.length) {
                    this.T = values3[readInt3];
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] createByteArray = parcel.createByteArray();
            if (createByteArray == null) {
                aggpVar = null;
            } else {
                try {
                    aggpVar = (aggp) apag.parseFrom(aggp.a, createByteArray, aozs.a());
                } catch (Throwable unused) {
                    this.U = null;
                }
            }
            this.U = aggpVar;
            tqw[] values4 = tqw.values();
            int readInt4 = parcel.readInt();
            if (readInt4 >= 0) {
                if (readInt4 < values4.length) {
                    this.V = values4[readInt4];
                } else {
                    throw new IllegalArgumentException();
                }
            }
            this.W = pzm.a(parcel.readString());
            tqq[] values5 = tqq.values();
            int readInt5 = parcel.readInt();
            if (readInt5 >= 0) {
                if (readInt5 < values5.length) {
                    this.X = values5[readInt5];
                } else {
                    throw new IllegalArgumentException();
                }
            }
            tqi[] values6 = tqi.values();
            int readInt6 = parcel.readInt();
            if (readInt6 >= 0) {
                if (readInt6 < values6.length) {
                    this.Y = values6[readInt6];
                    return;
                }
                throw new IllegalArgumentException();
            }
        }

        @Override // defpackage.aglz
        protected final void fp(Parcel parcel) {
            String uri;
            String uri2;
            String uri3;
            String uri4;
            int ordinal;
            int ordinal2;
            String uri5;
            String uri6;
            int ordinal3;
            int ordinal4;
            int ordinal5;
            parcel.writeString(this.a);
            parcel.writeLong(rvc.a(this.b));
            parcel.writeString(this.c);
            Uri uri7 = this.d;
            byte[] bArr = null;
            if (uri7 == null) {
                uri = null;
            } else {
                uri = uri7.toString();
            }
            parcel.writeString(uri);
            parcel.writeString(this.e);
            Uri uri8 = this.f;
            if (uri8 == null) {
                uri2 = null;
            } else {
                uri2 = uri8.toString();
            }
            parcel.writeString(uri2);
            Uri uri9 = this.g;
            if (uri9 == null) {
                uri3 = null;
            } else {
                uri3 = uri9.toString();
            }
            parcel.writeString(uri3);
            parcel.writeInt(this.h);
            parcel.writeInt(this.i);
            parcel.writeLong(this.j);
            Uri uri10 = this.k;
            if (uri10 == null) {
                uri4 = null;
            } else {
                uri4 = uri10.toString();
            }
            parcel.writeString(uri4);
            parcel.writeLong(this.l);
            tql tqlVar = this.m;
            int i = -1;
            if (tqlVar == null) {
                ordinal = -1;
            } else {
                ordinal = tqlVar.ordinal();
            }
            parcel.writeInt(ordinal);
            tqd tqdVar = this.n;
            if (tqdVar == null) {
                ordinal2 = -1;
            } else {
                ordinal2 = tqdVar.ordinal();
            }
            parcel.writeInt(ordinal2);
            parcel.writeLong(ruy.a(this.o));
            parcel.writeString(wch.J(this.p));
            parcel.writeString(wch.J(this.q));
            parcel.writeLong(this.r);
            parcel.writeDouble(this.s);
            parcel.writeDouble(this.t);
            Uri uri11 = this.u;
            if (uri11 == null) {
                uri5 = null;
            } else {
                uri5 = uri11.toString();
            }
            parcel.writeString(uri5);
            parcel.writeString(this.v);
            Uri uri12 = this.w;
            if (uri12 == null) {
                uri6 = null;
            } else {
                uri6 = uri12.toString();
            }
            parcel.writeString(uri6);
            parcel.writeInt(this.x);
            parcel.writeInt(this.y);
            parcel.writeString(this.z);
            parcel.writeString(this.A);
            parcel.writeString(this.B);
            parcel.writeByteArray(this.C);
            parcel.writeByteArray(this.D);
            parcel.writeInt(this.E ? 1 : 0);
            parcel.writeLong(this.F);
            parcel.writeString(this.G);
            parcel.writeString(this.H);
            parcel.writeLong(this.I);
            parcel.writeString(this.J);
            parcel.writeString(this.K);
            parcel.writeInt(this.L ? 1 : 0);
            parcel.writeLong(this.M);
            parcel.writeByteArray(this.N);
            parcel.writeByteArray(this.O);
            parcel.writeInt(this.P ? 1 : 0);
            parcel.writeInt(this.Q ? 1 : 0);
            parcel.writeLong(this.R);
            parcel.writeString(this.S);
            tqj tqjVar = this.T;
            if (tqjVar == null) {
                ordinal3 = -1;
            } else {
                ordinal3 = tqjVar.ordinal();
            }
            parcel.writeInt(ordinal3);
            aggp aggpVar = this.U;
            if (aggpVar != null) {
                bArr = aggpVar.toByteArray();
            }
            parcel.writeByteArray(bArr);
            tqw tqwVar = this.V;
            if (tqwVar == null) {
                ordinal4 = -1;
            } else {
                ordinal4 = tqwVar.ordinal();
            }
            parcel.writeInt(ordinal4);
            parcel.writeString(pyz.a(this.W));
            tqq tqqVar = this.X;
            if (tqqVar == null) {
                ordinal5 = -1;
            } else {
                ordinal5 = tqqVar.ordinal();
            }
            parcel.writeInt(ordinal5);
            tqi tqiVar = this.Y;
            if (tqiVar != null) {
                i = tqiVar.ordinal();
            }
            parcel.writeInt(i);
        }

        @Override // defpackage.agma
        public final String g() {
            return "_id";
        }

        public final long h() {
            ao(31, "blob_upload_timestamp");
            return this.F;
        }

        public final int hashCode() {
            aday adayVar;
            int ordinal;
            int ordinal2;
            int ordinal3;
            int ordinal4;
            int ordinal5;
            int ordinal6;
            aday adayVar2 = this.cJ;
            if (adayVar2 != null && !adayVar2.Y()) {
                adayVar = this.cJ;
            } else {
                adayVar = null;
            }
            String str = this.a;
            MessageIdType messageIdType = this.b;
            String str2 = this.c;
            Uri uri = this.d;
            String str3 = this.e;
            Uri uri2 = this.f;
            Uri uri3 = this.g;
            Integer valueOf = Integer.valueOf(this.h);
            Integer valueOf2 = Integer.valueOf(this.i);
            Long valueOf3 = Long.valueOf(this.j);
            Uri uri4 = this.k;
            Long valueOf4 = Long.valueOf(this.l);
            tql tqlVar = this.m;
            if (tqlVar == null) {
                ordinal = 0;
            } else {
                ordinal = tqlVar.ordinal();
            }
            Integer valueOf5 = Integer.valueOf(ordinal);
            tqd tqdVar = this.n;
            if (tqdVar == null) {
                ordinal2 = 0;
            } else {
                ordinal2 = tqdVar.ordinal();
            }
            Integer valueOf6 = Integer.valueOf(ordinal2);
            ConversationIdType conversationIdType = this.o;
            tqa tqaVar = this.p;
            tqa tqaVar2 = this.q;
            Long valueOf7 = Long.valueOf(this.r);
            Double valueOf8 = Double.valueOf(this.s);
            Double valueOf9 = Double.valueOf(this.t);
            Uri uri5 = this.u;
            String str4 = this.v;
            Uri uri6 = this.w;
            Integer valueOf10 = Integer.valueOf(this.x);
            Integer valueOf11 = Integer.valueOf(this.y);
            String str5 = this.z;
            String str6 = this.A;
            String str7 = this.B;
            Integer valueOf12 = Integer.valueOf(Arrays.hashCode(this.C));
            Integer valueOf13 = Integer.valueOf(Arrays.hashCode(this.D));
            Boolean valueOf14 = Boolean.valueOf(this.E);
            Long valueOf15 = Long.valueOf(this.F);
            String str8 = this.G;
            String str9 = this.H;
            Long valueOf16 = Long.valueOf(this.I);
            String str10 = this.J;
            String str11 = this.K;
            Boolean valueOf17 = Boolean.valueOf(this.L);
            Long valueOf18 = Long.valueOf(this.M);
            Integer valueOf19 = Integer.valueOf(Arrays.hashCode(this.N));
            Integer valueOf20 = Integer.valueOf(Arrays.hashCode(this.O));
            Boolean valueOf21 = Boolean.valueOf(this.P);
            Boolean valueOf22 = Boolean.valueOf(this.Q);
            Long valueOf23 = Long.valueOf(this.R);
            String str12 = this.S;
            tqj tqjVar = this.T;
            if (tqjVar == null) {
                ordinal3 = 0;
            } else {
                ordinal3 = tqjVar.ordinal();
            }
            Integer valueOf24 = Integer.valueOf(ordinal3);
            aggp aggpVar = this.U;
            tqw tqwVar = this.V;
            if (tqwVar == null) {
                ordinal4 = 0;
            } else {
                ordinal4 = tqwVar.ordinal();
            }
            Integer valueOf25 = Integer.valueOf(ordinal4);
            pyz pyzVar = this.W;
            tqq tqqVar = this.X;
            if (tqqVar == null) {
                ordinal5 = 0;
            } else {
                ordinal5 = tqqVar.ordinal();
            }
            Integer valueOf26 = Integer.valueOf(ordinal5);
            tqi tqiVar = this.Y;
            if (tqiVar == null) {
                ordinal6 = 0;
            } else {
                ordinal6 = tqiVar.ordinal();
            }
            return Objects.hash(adayVar, str, messageIdType, str2, uri, str3, uri2, uri3, valueOf, valueOf2, valueOf3, uri4, valueOf4, valueOf5, valueOf6, conversationIdType, tqaVar, tqaVar2, valueOf7, valueOf8, valueOf9, uri5, str4, uri6, valueOf10, valueOf11, str5, str6, str7, valueOf12, valueOf13, valueOf14, valueOf15, str8, str9, valueOf16, str10, str11, valueOf17, valueOf18, valueOf19, valueOf20, valueOf21, valueOf22, valueOf23, str12, valueOf24, aggpVar, valueOf25, pyzVar, valueOf26, Integer.valueOf(ordinal6), null);
        }

        @Override // defpackage.agma
        public final String i() {
            return "parts";
        }

        @Override // defpackage.agma
        public final void j(StringBuilder sb, List list) {
            String uri;
            String uri2;
            String uri3;
            String uri4;
            Object valueOf;
            Object valueOf2;
            String uri5;
            String uri6;
            Object valueOf3;
            byte[] byteArray;
            Object valueOf4;
            Object valueOf5;
            Object valueOf6;
            Object obj = new swc(this, 20).get();
            String str = this.c;
            Uri uri7 = this.d;
            if (uri7 == null) {
                uri = null;
            } else {
                uri = uri7.toString();
            }
            String str2 = this.e;
            Uri uri8 = this.f;
            if (uri8 == null) {
                uri2 = null;
            } else {
                uri2 = uri8.toString();
            }
            Uri uri9 = this.g;
            if (uri9 == null) {
                uri3 = null;
            } else {
                uri3 = uri9.toString();
            }
            Integer valueOf7 = Integer.valueOf(this.h);
            Integer valueOf8 = Integer.valueOf(this.i);
            Long valueOf9 = Long.valueOf(this.j);
            Uri uri10 = this.k;
            if (uri10 == null) {
                uri4 = null;
            } else {
                uri4 = uri10.toString();
            }
            Long valueOf10 = Long.valueOf(this.l);
            tql tqlVar = this.m;
            if (tqlVar == null) {
                valueOf = 0;
            } else {
                valueOf = String.valueOf(tqlVar.ordinal());
            }
            tqd tqdVar = this.n;
            if (tqdVar == null) {
                valueOf2 = 0;
            } else {
                valueOf2 = String.valueOf(tqdVar.ordinal());
            }
            Object obj2 = new tbv((aglz) this, 1).get();
            String J = wch.J(this.p);
            String J2 = wch.J(this.q);
            Object obj3 = valueOf;
            Long valueOf11 = Long.valueOf(this.r);
            Double valueOf12 = Double.valueOf(this.s);
            Double valueOf13 = Double.valueOf(this.t);
            Uri uri11 = this.u;
            if (uri11 == null) {
                uri5 = null;
            } else {
                uri5 = uri11.toString();
            }
            String str3 = this.v;
            Uri uri12 = this.w;
            if (uri12 == null) {
                uri6 = null;
            } else {
                uri6 = uri12.toString();
            }
            Integer valueOf14 = Integer.valueOf(this.x);
            Integer valueOf15 = Integer.valueOf(this.y);
            String str4 = this.z;
            String str5 = this.A;
            String str6 = this.B;
            byte[] bArr = this.C;
            byte[] bArr2 = this.D;
            Integer valueOf16 = Integer.valueOf(this.E ? 1 : 0);
            Long valueOf17 = Long.valueOf(this.F);
            String str7 = this.G;
            String str8 = this.H;
            Long valueOf18 = Long.valueOf(this.I);
            String str9 = this.J;
            String str10 = this.K;
            Integer valueOf19 = Integer.valueOf(this.L ? 1 : 0);
            Long valueOf20 = Long.valueOf(this.M);
            byte[] bArr3 = this.N;
            byte[] bArr4 = this.O;
            Integer valueOf21 = Integer.valueOf(this.P ? 1 : 0);
            Integer valueOf22 = Integer.valueOf(this.Q ? 1 : 0);
            Long valueOf23 = Long.valueOf(this.R);
            String str11 = this.S;
            tqj tqjVar = this.T;
            if (tqjVar == null) {
                valueOf3 = 0;
            } else {
                valueOf3 = String.valueOf(tqjVar.ordinal());
            }
            Object obj4 = valueOf3;
            aggp aggpVar = this.U;
            if (aggpVar == null) {
                byteArray = null;
            } else {
                byteArray = aggpVar.toByteArray();
            }
            tqw tqwVar = this.V;
            if (tqwVar == null) {
                valueOf4 = 0;
            } else {
                valueOf4 = String.valueOf(tqwVar.ordinal());
            }
            Object obj5 = valueOf4;
            String a = pyz.a(this.W);
            tqq tqqVar = this.X;
            if (tqqVar == null) {
                valueOf5 = 0;
            } else {
                valueOf5 = String.valueOf(tqqVar.ordinal());
            }
            Object obj6 = valueOf5;
            tqi tqiVar = this.Y;
            if (tqiVar == null) {
                valueOf6 = 0;
            } else {
                valueOf6 = String.valueOf(tqiVar.ordinal());
            }
            Object[] objArr = {obj, str, uri, str2, uri2, uri3, valueOf7, valueOf8, valueOf9, uri4, valueOf10, obj3, valueOf2, obj2, J, J2, valueOf11, valueOf12, valueOf13, uri5, str3, uri6, valueOf14, valueOf15, str4, str5, str6, bArr, bArr2, valueOf16, valueOf17, str7, str8, valueOf18, str9, str10, valueOf19, valueOf20, bArr3, bArr4, valueOf21, valueOf22, valueOf23, str11, obj4, byteArray, obj5, a, obj6, valueOf6};
            sb.append('(');
            for (int i = 0; i < 50; i++) {
                Object obj7 = objArr[i];
                if (obj7 instanceof Number) {
                    sb.append(String.valueOf(obj7));
                } else {
                    if (obj7 instanceof String) {
                        String str12 = (String) obj7;
                        if (str12.length() < 12) {
                            sb.append(DatabaseUtils.sqlEscapeString(str12));
                        }
                    }
                    list.add(obj7);
                    sb.append('?');
                    sb.append(',');
                }
                sb.append(',');
            }
            sb.setLength(sb.length() - 1);
            sb.append(')');
        }

        public final long k() {
            ao(38, "compressed_blob_upload_timestamp");
            return this.M;
        }

        public final long l() {
            ao(34, "duration");
            return this.I;
        }

        public final long m() {
            ao(43, "file_size_bytes");
            return this.R;
        }

        public final Uri n() {
            ao(3, ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
            return this.d;
        }

        public final ConversationIdType o() {
            ao(14, "conversation_id");
            return this.o;
        }

        public final MessageIdType p() {
            ao(1, "message_id");
            return this.b;
        }

        public final tbg q() {
            int i = taq.a;
            tbg tbgVar = new tbg();
            tbgVar.c(this, false, this.cE);
            return tbgVar;
        }

        public final tbg r() {
            tbg tbgVar = new tbg();
            tbgVar.c(this, true, this.cE);
            return tbgVar;
        }

        public final Long s() {
            agnw d;
            agnw d2;
            d = agnc.d("$primary");
            d2 = agnc.d("$primary");
            return Long.valueOf(agnc.a(d2, "parts", this, new tbe(d, 2), new smq(this, 18)));
        }

        public final String t() {
            ao(26, "blob_gaia_email");
            return this.A;
        }

        public final String toString() {
            if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
                return String.format(Locale.US, "%s", "PartsTable -- REDACTED");
            }
            return a();
        }

        public final String u() {
            ao(25, "blob_id");
            return this.z;
        }

        public final String v() {
            ao(36, "cms_compressed_blob_id");
            return this.K;
        }

        public final String w() {
            ao(35, "compressed_blob_id");
            return this.J;
        }

        public final String x() {
            ao(4, "content_type");
            return this.e;
        }

        public final String y() {
            ao(33, "file_name");
            return this.H;
        }

        public final String z() {
            ao(0, "_id");
            return this.a;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public BindData(Parcel parcel) {
            ap(parcel);
        }
    }

    static {
        alok alokVar = new alok();
        alokVar.h("parts.original_uri", 10021);
        alokVar.h("parts.storage_uri", 29060);
        alokVar.h("parts.timestamp", 3010);
        alokVar.h("parts.output_uri", 4020);
        alokVar.h("parts.target_size", 4020);
        alokVar.h("parts.processing_status", 4020);
        alokVar.h("parts.cms_attachment_processing_status", 44010);
        alokVar.h("parts.sticker_set_id", 5020);
        alokVar.h("parts.sticker_id", 5020);
        alokVar.h("parts.media_modified_timestamp", 7000);
        alokVar.h("parts.longitude", 10005);
        alokVar.h("parts.latitude", 10005);
        alokVar.h("parts.preview_content_uri", 10017);
        alokVar.h("parts.preview_content_type", 10017);
        alokVar.h("parts.fallback_uri", 13000);
        alokVar.h("parts.source", 14010);
        alokVar.h("parts.bundle_index", 17010);
        alokVar.h("parts.blob_id", 17020);
        alokVar.h("parts.blob_gaia_email", 59570);
        alokVar.h("parts.cms_full_size_blob_id", 40040);
        alokVar.h("parts.cms_media_encryption_key", 42010);
        alokVar.h("parts.cms_compressed_media_encryption_key", 42070);
        alokVar.h("parts.blob_upload_permanent_failure", 18000);
        alokVar.h("parts.blob_upload_timestamp", 19030);
        alokVar.h("parts.expressive_sticker_name", 22060);
        alokVar.h("parts.file_name", 26000);
        alokVar.h("parts.duration", 26040);
        alokVar.h("parts.compressed_blob_id", 27000);
        alokVar.h("parts.cms_compressed_blob_id", 40040);
        alokVar.h("parts.compressed_blob_upload_permanent_failure", 27000);
        alokVar.h("parts.compressed_blob_upload_timestamp", 27000);
        alokVar.h("parts.media_encryption_key", 30040);
        alokVar.h("parts.compressed_media_encryption_key", 30040);
        alokVar.h("parts.missing_entry_in_telephony", 52030);
        alokVar.h("parts.awaiting_reverse_sync", 53040);
        alokVar.h("parts.file_size_bytes", 52050);
        alokVar.h("parts.local_cache_path", 52050);
        alokVar.h("parts.media_send_type", 58150);
        alokVar.h("parts.voice_metadata", 59470);
        alokVar.h("parts.validation_status", 58770);
        alokVar.h("parts.processing_id", 60080);
        alokVar.h("parts.rich_card_media_download_failure_reason", 60230);
        alokVar.h("parts.image_display_state", 60240);
        b = alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h("message_id", "index_parts_message_id");
        alokVar2.h("content_type", "index_parts_content_type");
        alokVar2.h("output_uri", "index_parts_output_uri");
        alokVar2.h("conversation_id", "index_parts_conversation_id");
        alokVar2.h("preview_content_type", "index_parts_preview_content_type");
        alokVar2.h("file_size_bytes", "index_parts_file_size_bytes");
        alokVar2.h("local_cache_path", "index_parts_local_cache_path");
        c = alokVar2.b();
        d = new tbh();
        e = new int[]{3010, 4020, 5020, 7000, 10005, 10017, 10021, 13000, 14010, 17010, 17020, 18000, 19030, 22060, 26000, 26040, 27000, 29060, 30040, 40040, 42010, 42070, 44010, 49010, 52030, 52050, 53040, 58150, 58380, 58770, 59470, 59570, 60080, 60230, 60240};
    }

    public static BindData a(String str) {
        tbs d2 = d();
        d2.w("parts.queryOnId");
        tbu tbuVar = new tbu();
        tbuVar.f(str);
        d2.f(tbuVar);
        return (BindData) agnc.b(d2.b());
    }

    public static tbg b() {
        int i = taq.a;
        return new tbg();
    }

    public static tbg c() {
        int i = taq.a;
        tbg tbgVar = new tbg();
        tbgVar.aD();
        return tbgVar;
    }

    public static final tbs d() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("parts._id");
            alobVar.h("parts.message_id");
            alobVar.h("parts.text");
            alobVar.h("parts.uri");
            alobVar.h("parts.content_type");
            if (valueOf.intValue() >= 10021) {
                alobVar.h("parts.original_uri");
            }
            if (valueOf.intValue() >= 29060) {
                alobVar.h("parts.storage_uri");
            }
            alobVar.h("parts.width");
            alobVar.h("parts.height");
            if (valueOf.intValue() >= 3010) {
                alobVar.h("parts.timestamp");
            }
            if (valueOf.intValue() >= 4020) {
                alobVar.h("parts.output_uri");
            }
            if (valueOf.intValue() >= 4020) {
                alobVar.h("parts.target_size");
            }
            if (valueOf.intValue() >= 4020) {
                alobVar.h("parts.processing_status");
            }
            if (valueOf.intValue() >= 44010) {
                alobVar.h("parts.cms_attachment_processing_status");
            }
            alobVar.h("parts.conversation_id");
            if (valueOf.intValue() >= 5020) {
                alobVar.h("parts.sticker_set_id");
            }
            if (valueOf.intValue() >= 5020) {
                alobVar.h("parts.sticker_id");
            }
            if (valueOf.intValue() >= 7000) {
                alobVar.h("parts.media_modified_timestamp");
            }
            if (valueOf.intValue() >= 10005) {
                alobVar.h("parts.longitude");
            }
            if (valueOf.intValue() >= 10005) {
                alobVar.h("parts.latitude");
            }
            if (valueOf.intValue() >= 10017) {
                alobVar.h("parts.preview_content_uri");
            }
            if (valueOf.intValue() >= 10017) {
                alobVar.h("parts.preview_content_type");
            }
            if (valueOf.intValue() >= 13000) {
                alobVar.h("parts.fallback_uri");
            }
            if (valueOf.intValue() >= 14010) {
                alobVar.h("parts.source");
            }
            if (valueOf.intValue() >= 17010) {
                alobVar.h("parts.bundle_index");
            }
            if (valueOf.intValue() >= 17020) {
                alobVar.h("parts.blob_id");
            }
            if (valueOf.intValue() >= 59570) {
                alobVar.h("parts.blob_gaia_email");
            }
            if (valueOf.intValue() >= 40040) {
                alobVar.h("parts.cms_full_size_blob_id");
            }
            if (valueOf.intValue() >= 42010) {
                alobVar.h("parts.cms_media_encryption_key");
            }
            if (valueOf.intValue() >= 42070) {
                alobVar.h("parts.cms_compressed_media_encryption_key");
            }
            if (valueOf.intValue() >= 18000) {
                alobVar.h("parts.blob_upload_permanent_failure");
            }
            if (valueOf.intValue() >= 19030) {
                alobVar.h("parts.blob_upload_timestamp");
            }
            if (valueOf.intValue() >= 22060) {
                alobVar.h("parts.expressive_sticker_name");
            }
            if (valueOf.intValue() >= 26000) {
                alobVar.h("parts.file_name");
            }
            if (valueOf.intValue() >= 26040) {
                alobVar.h("parts.duration");
            }
            if (valueOf.intValue() >= 27000) {
                alobVar.h("parts.compressed_blob_id");
            }
            if (valueOf.intValue() >= 40040) {
                alobVar.h("parts.cms_compressed_blob_id");
            }
            if (valueOf.intValue() >= 27000) {
                alobVar.h("parts.compressed_blob_upload_permanent_failure");
            }
            if (valueOf.intValue() >= 27000) {
                alobVar.h("parts.compressed_blob_upload_timestamp");
            }
            if (valueOf.intValue() >= 30040) {
                alobVar.h("parts.media_encryption_key");
            }
            if (valueOf.intValue() >= 30040) {
                alobVar.h("parts.compressed_media_encryption_key");
            }
            if (valueOf.intValue() >= 52030) {
                alobVar.h("parts.missing_entry_in_telephony");
            }
            if (valueOf.intValue() >= 53040) {
                alobVar.h("parts.awaiting_reverse_sync");
            }
            if (valueOf.intValue() >= 52050) {
                alobVar.h("parts.file_size_bytes");
            }
            if (valueOf.intValue() >= 52050) {
                alobVar.h("parts.local_cache_path");
            }
            if (valueOf.intValue() >= 58150) {
                alobVar.h("parts.media_send_type");
            }
            if (valueOf.intValue() >= 59470) {
                alobVar.h("parts.voice_metadata");
            }
            if (valueOf.intValue() >= 58770) {
                alobVar.h("parts.validation_status");
            }
            if (valueOf.intValue() >= 60080) {
                alobVar.h("parts.processing_id");
            }
            if (valueOf.intValue() >= 60230) {
                alobVar.h("parts.rich_card_media_download_failure_reason");
            }
            if (valueOf.intValue() >= 60240) {
                alobVar.h("parts.image_display_state");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new tbs(strArr);
    }

    public static void e(agnw agnwVar) {
        agnwVar.z("ALTER TABLE parts ADD COLUMN blob_upload_timestamp INT DEFAULT(0);");
    }
}
