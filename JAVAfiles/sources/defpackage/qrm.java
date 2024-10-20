package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qrm {
    public static final ahka a = new ahka("ScreenEffectSuggestionStoredOnSentMessage");
    public static final ahka b = new ahka("ScreenEffectSuggestionLoadedOnSentMessage");
    public static final ahka c = new ahka("ScreenEffectAppearedOnSentMessage");
    public static final ahka d = new ahka("ScreenEffectReadyButDiscardedOnSentMessage");
    public final ahqr e;
    public MessageIdType f;

    public qrm(ahqr ahqrVar) {
        ahqrVar.getClass();
        this.e = ahqrVar;
    }

    public final void a() {
        this.e.c(a);
        this.e.c(b);
        this.e.c(d);
        this.e.c(c);
    }
}
