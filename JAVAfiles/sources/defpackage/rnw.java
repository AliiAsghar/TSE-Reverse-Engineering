package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rnw extends agpx {
    @Override // defpackage.agpx
    public final /* synthetic */ agpw a() {
        return new agpw(this);
    }

    public final void b() {
        int intValue = rnx.b().intValue();
        if (intValue < 0) {
            agnc.t(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, intValue);
        }
        U(new agmg("parts_backup.text", 6));
    }
}
