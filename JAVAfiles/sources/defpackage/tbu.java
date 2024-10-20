package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tbu extends agpx {
    @Override // defpackage.agpx
    public final /* synthetic */ agpw a() {
        return new agpw(this);
    }

    public final void b(Function... functionArr) {
        Object apply;
        tbu[] tbuVarArr = new tbu[functionArr.length];
        for (int i = 0; i < functionArr.length; i++) {
            apply = functionArr[i].apply(new tbu());
            tbuVarArr[i] = (tbu) apply;
        }
        V(tbuVarArr);
    }

    public final void c(String str) {
        U(new agmd("parts.content_type", 1, str));
    }

    public final void d(String str) {
        U(new agmd("parts.content_type", 11, str));
    }

    public final void e(ConversationIdType conversationIdType) {
        U(new agmd("parts.conversation_id", 1, Long.valueOf(ruy.a(conversationIdType))));
    }

    public final void f(String str) {
        U(new agmd("parts._id", 1, String.valueOf(str)));
    }

    public final void g(Iterable iterable) {
        U(new agmf("parts._id", 3, X(iterable), false));
    }

    public final void h() {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 52050) {
            agnc.t("local_cache_path", intValue);
        }
        U(new agmg("parts.local_cache_path", 6));
    }

    public final void i(MessageIdType messageIdType) {
        U(new agmd("parts.message_id", 1, Long.valueOf(rvc.a(messageIdType))));
    }

    public final void j(agpj agpjVar) {
        U(new agme("parts.message_id", 3, agpjVar));
    }

    public final void k(Uri uri) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 4020) {
            agnc.t("output_uri", intValue);
        }
        U(new agmd("parts.output_uri", 1, uri));
    }

    public final void l() {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 4020) {
            agnc.t("output_uri", intValue);
        }
        U(new agmg("parts.output_uri", 6));
    }

    public final void m() {
        U(new agmg("parts.text", 6));
    }

    public final void n(Uri uri) {
        U(new agmd("parts.uri", 1, uri));
    }

    public final void o() {
        U(new agmd("parts.uri", 11, "android.resource%"));
    }

    public final void p() {
        U(new agmg("parts.uri", 6));
    }
}
