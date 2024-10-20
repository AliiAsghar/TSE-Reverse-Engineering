package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tbt extends agps {
    public tbt() {
        super("parts");
    }

    public final boolean b(String str) {
        tbu tbuVar = new tbu();
        tbuVar.f(str);
        return ae(new agpw(tbuVar), "parts-buildAndUpdateForId");
    }

    public final void c(boolean z) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 53040) {
            agnc.t("awaiting_reverse_sync", intValue2);
        }
        if (intValue >= 53040) {
            this.a.put("awaiting_reverse_sync", Boolean.valueOf(z));
        }
    }

    public final void d() {
        this.a.putNull("blob_id");
    }

    public final void e(String str) {
        agnc.r(this.a, "content_type", str);
    }

    public final void f(ConversationIdType conversationIdType) {
        if (conversationIdType != null && !conversationIdType.equals(ruy.a)) {
            this.a.put("conversation_id", Long.valueOf(ruy.a(conversationIdType)));
        } else {
            this.a.putNull("conversation_id");
        }
    }

    public final void g(long j) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 26040) {
            agnc.t("duration", intValue2);
        }
        if (intValue >= 26040) {
            this.a.put("duration", Long.valueOf(j));
        }
    }

    public final void h(Uri uri) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 13000) {
            agnc.t("fallback_uri", intValue2);
        }
        if (intValue >= 13000) {
            this.a.put("fallback_uri", uri.toString());
        }
    }

    public final void i() {
        this.a.putNull("file_size_bytes");
    }

    public final void j(int i) {
        this.a.put("height", Integer.valueOf(i));
    }

    public final void k(tqi tqiVar) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 60240) {
            agnc.t("image_display_state", intValue2);
        }
        if (intValue >= 60240) {
            if (tqiVar == null) {
                this.a.putNull("image_display_state");
            } else {
                this.a.put("image_display_state", Integer.valueOf(tqiVar.ordinal()));
            }
        }
    }

    public final void l(String str) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 52050) {
            agnc.t("local_cache_path", intValue2);
        }
        if (intValue >= 52050) {
            agnc.r(this.a, "local_cache_path", str);
        }
    }

    public final void m() {
        this.a.putNull("local_cache_path");
    }

    public final void n(boolean z) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 52030) {
            agnc.t("missing_entry_in_telephony", intValue2);
        }
        if (intValue >= 52030) {
            this.a.put("missing_entry_in_telephony", Boolean.valueOf(z));
        }
    }

    public final void o(Uri uri) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 10017) {
            agnc.t("preview_content_uri", intValue2);
        }
        if (intValue >= 10017) {
            if (uri == null) {
                this.a.putNull("preview_content_uri");
            } else {
                this.a.put("preview_content_uri", uri.toString());
            }
        }
    }

    public final void p() {
        this.a.putNull("output_uri");
    }

    public final void q(tql tqlVar) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 4020) {
            agnc.t("processing_status", intValue2);
        }
        if (intValue >= 4020) {
            if (tqlVar == null) {
                this.a.putNull("processing_status");
            } else {
                this.a.put("processing_status", Integer.valueOf(tqlVar.ordinal()));
            }
        }
    }

    public final void r(tqq tqqVar) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 60230) {
            agnc.t("rich_card_media_download_failure_reason", intValue2);
        }
        if (intValue >= 60230) {
            if (tqqVar == null) {
                this.a.putNull("rich_card_media_download_failure_reason");
            } else {
                this.a.put("rich_card_media_download_failure_reason", Integer.valueOf(tqqVar.ordinal()));
            }
        }
    }

    public final void s(Uri uri) {
        if (uri == null) {
            this.a.putNull(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
        } else {
            this.a.put(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri.toString());
        }
    }

    public final void t() {
        this.a.putNull(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
    }

    public final void u(int i) {
        this.a.put("width", Integer.valueOf(i));
    }

    public final void v(Function function) {
        Object apply;
        apply = function.apply(new tbu());
        Z(new agpw((tbu) apply));
    }

    @Override // defpackage.agps
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final agpr a() {
        ac();
        String str = this.c;
        agpt agptVar = this.e;
        return new agpr(str, this.a, this.b, this.d.g(), agptVar.a());
    }
}
