package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class wxy extends IllegalArgumentException {
    public wxy(String str) {
        super(String.format("Missing MessagingIdentity on direction: %s during %s", str, "sendChatMessageResponse"));
    }
}
