package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kbx extends arrp implements arqg {
    final /* synthetic */ boolean a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kbx(arqr arqrVar, lre lreVar, boolean z, int i) {
        super(0);
        this.d = i;
        this.c = arqrVar;
        this.b = lreVar;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, arqr] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    ((zeh) this.c).c.a();
                    if (this.a) {
                        ((zeh) this.c).j.c(zep.a);
                    } else {
                        ((zeh) this.c).c.e();
                        ((lkd) this.b).g(llg.a);
                    }
                    return arnb.a;
                }
                return ((aeqg) this.c.a(((lre) this.b).c)).a(this.a, new lhb(this.b, 13));
            }
            jdp jdpVar = (jdp) this.b;
            if (jdpVar.c.b(jdpVar.a)) {
                if (this.a && ((Optional) ((apxx) ((jdp) this.b).h).a).isPresent()) {
                    vni vniVar = (vni) ((Optional) ((apxx) ((jdp) this.b).h).a).get();
                    Object obj = this.b;
                    String l = vniVar.l();
                    String k = vniVar.k();
                    String uri = vniVar.f().toString();
                    uri.getClass();
                    List y = aqjn.y(new aeif(uri, arsd.T(vniVar.k(), vniVar.g(), 0, 6), arsd.T(vniVar.k(), vniVar.g(), 0, 6) + vniVar.g().length(), new geg(vniVar, this.b, 6), 24));
                    String string = ((jdp) this.b).a.getString(R.string.delete_conversation_confirmation_button);
                    string.getClass();
                    aewr aewrVar = new aewr(string, new gqx(this.b, this.c, 20, null));
                    String string2 = ((jdp) this.b).a.getString(R.string.delete_conversation_decline_button);
                    string2.getClass();
                    lgb.o(((jdp) obj).k, new aepx(k, y, null, l, false, false, aewrVar, new aewr(string2, ipf.j), null, 308));
                } else {
                    jdp jdpVar2 = (jdp) this.b;
                    String quantityString = jdpVar2.a.getResources().getQuantityString(R.plurals.delete_conversations_confirmation_dialog_title, 1, 1);
                    String string3 = ((jdp) this.b).a.getString(R.string.delete_message_confirmation_dialog_text);
                    string3.getClass();
                    String string4 = ((jdp) this.b).a.getString(R.string.delete_conversation_confirmation_button);
                    string4.getClass();
                    aewr aewrVar2 = new aewr(string4, new jdr(this.b, this.c, 1));
                    String string5 = ((jdp) this.b).a.getString(R.string.delete_conversation_decline_button);
                    string5.getClass();
                    lgb.o(jdpVar2.k, new aepx(string3, null, null, quantityString, false, false, aewrVar2, new aewr(string5, ipf.k), null, 310));
                }
            } else {
                ((jdp) this.b).e.a();
            }
            return arnb.a;
        }
        String string6 = ((kcc) this.b).a.getString(R.string.message_bubble_generic_attachment_content_text_revised);
        string6.getClass();
        return new aeki(new aejg(string6, ""), new aekh((byte[]) null), (String) this.c, this.a, (arqg) null, 48);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kbx(jdp jdpVar, boolean z, ConversationId conversationId, int i) {
        super(0);
        this.d = i;
        this.b = jdpVar;
        this.a = z;
        this.c = conversationId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kbx(kcc kccVar, String str, boolean z, int i) {
        super(0);
        this.d = i;
        this.b = kccVar;
        this.c = str;
        this.a = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kbx(zeh zehVar, boolean z, lkd lkdVar, int i) {
        super(0);
        this.d = i;
        this.c = zehVar;
        this.a = z;
        this.b = lkdVar;
    }
}
