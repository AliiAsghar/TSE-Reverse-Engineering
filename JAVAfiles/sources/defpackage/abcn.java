package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abcn extends IllegalStateException {
    public abcn() {
        super("Requesting a ConversationViewModelProvider inside a hierarchy not containinga ConversationViewModelOwner.");
    }
}
