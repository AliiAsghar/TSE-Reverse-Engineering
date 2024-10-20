package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum akza {
    NEW("New"),
    REPLY("Reply"),
    REPLY_ALL("ReplyAll"),
    FORWARD("Forward");

    private final String f;

    akza(String str) {
        this.f = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f;
    }
}
