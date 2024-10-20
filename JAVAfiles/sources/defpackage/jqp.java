package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jqp extends arrm implements arqr {
    public static final jqp a = new jqp();

    public jqp() {
        super(1, spa.class, "getText", "getText()Ljava/lang/String;", 0);
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        spa spaVar = (spa) obj;
        spaVar.getClass();
        spaVar.ao(1, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
        return spaVar.b;
    }
}
