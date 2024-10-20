package defpackage;

import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jrf {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/replacer/DraftReplacerImpl");
    public final jpq b;
    public final jxv c;
    private final arpi d;

    public jrf(arpi arpiVar, jxv jxvVar, jpq jpqVar) {
        arpiVar.getClass();
        jxvVar.getClass();
        this.d = arpiVar;
        this.c = jxvVar;
        this.b = jpqVar;
    }

    public final Object a(IncomingDraft incomingDraft, arqr arqrVar, arpe arpeVar) {
        return arro.q(this.d, new uqm(incomingDraft, this, arqrVar, (arpe) null, 1), arpeVar);
    }
}
