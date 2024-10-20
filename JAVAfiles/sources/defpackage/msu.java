package defpackage;

import android.util.LruCache;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class msu implements alhr {
    private final /* synthetic */ int a;

    public /* synthetic */ msu(int i) {
        this.a = i;
    }

    @Override // defpackage.alhr
    public final Object get() {
        int i = 0;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(anfi.a("bugle.enable_mi_in_cms_messages_to_telephony_persister", "bugle"));
            case 1:
                return Boolean.valueOf(anfi.a("bugle.enable_mi_for_contacts_intents", "bugle"));
            case 2:
                return Boolean.valueOf(anfi.a("bugle.enable_mi_in_incoming_rcs_file_transfer_handler", "bugle"));
            case 3:
                return Boolean.valueOf(anfi.a("bugle.enable_mi_in_wearable_message", "bugle"));
            case 4:
                return Pattern.compile("[;,N].*|^\\*67|[^\\d*#+a-zA-Z]+");
            case 5:
                return Pattern.compile("\\p{C}");
            case 6:
                return Pattern.compile("[\\d*#+]+");
            case 7:
                return Pattern.compile("@([0-9a-zA-Z:\\-\\(\\)\\[\\]]+\\.)*[0-9a-zA-Z:\\-\\(\\)\\[\\]]*?[a-zA-Z:\\-\\(\\)\\[\\]][0-9a-zA-Z:\\-\\(\\)\\[\\]]*\\z");
            case 8:
                return Pattern.compile("^\\+\\d{1,3}\\s");
            case 9:
                return Pattern.compile("^\\+(\\d{1,3})\\s.*");
            case 10:
                return Pattern.compile("^\\+(\\d{1,3})\\s(.*)");
            case 11:
                alok alokVar = new alok();
                alokVar.h(pud.a, alog.s("urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.im", "urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.session.group"));
                alokVar.h(pud.b, alog.r("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp"));
                alokVar.h(pud.c, alog.r("urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.ft"));
                alokVar.h(pud.d, alog.r("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.ftthumb"));
                alokVar.h(pud.e, alog.r("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.ftsms"));
                alokVar.h(pud.f, alog.r("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.geopush"));
                alokVar.h(pud.g, alog.r("urn%3Aurn-7%3A3gppapplication.ims.iari.rcs.geosms"));
                alokVar.h(pud.h, alog.r("urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.callcomposer"));
                alokVar.h(pud.i, alog.r("urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.callunanswered"));
                alokVar.h(pud.k, alog.r("urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.sharedsketch"));
                alokVar.h(pud.j, alog.r("urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.sharedmap"));
                alokVar.h(pud.l, alog.r("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.chatbot"));
                alokVar.h(pud.m, alog.s("urn%3Aurn-7%3A3gpp-service.ims.icsi.mmtel", "+g.gsma.rcs.ipcall"));
                return alokVar.b();
            case 12:
                alhr alhrVar = qkx.a;
                return uuh.f(uuh.b, "get_or_create_conversation_timeout_millis", 10000L);
            case 13:
                return new LruCache(1000);
            case 14:
                return Optional.empty();
            case 15:
                return Optional.empty();
            case 16:
                Stream map = DesugarArrays.stream(((String) qxn.d.e()).split("\\|")).map(new qvm(18)).filter(new qxi(i)).map(new qvm(19));
                int i2 = alog.d;
                return (alog) map.collect(alls.a);
            case 17:
                AtomicBoolean atomicBoolean = qxn.a;
                return uuh.e(uuh.b, "database_open_retry_iterations", 20);
            case 18:
                return false;
            case 19:
                return Optional.empty();
            default:
                return InvalidConversationId.a;
        }
    }
}
