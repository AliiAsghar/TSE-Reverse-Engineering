package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lua {
    public final ltz a;
    public final MessageIdType b;

    public lua(ltz ltzVar) {
        this.a = ltzVar;
        MessageIdType b = rvc.b(ltzVar.b);
        this.b = b;
        d.F(ltzVar.c, "");
        if (!b.b()) {
        } else {
            throw new IllegalArgumentException("Creating a ReplyMessageDataWrapper with empty repliedToMessageId");
        }
    }

    public static final lua a(MessageIdType messageIdType) {
        messageIdType.getClass();
        aozy createBuilder = ltz.a.createBuilder();
        createBuilder.getClass();
        lgc.w(messageIdType.a(), createBuilder);
        return new lua(lgc.v(createBuilder));
    }

    public static final lua b(MessageIdType messageIdType, rve rveVar) {
        messageIdType.getClass();
        rveVar.getClass();
        aozy createBuilder = ltz.a.createBuilder();
        createBuilder.getClass();
        lgc.w(messageIdType.a(), createBuilder);
        String f = rveVar.f();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((ltz) createBuilder.b).c = f;
        return new lua(lgc.v(createBuilder));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof lua) && d.F(this.a, ((lua) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ReplyMessageDataWrapper(replyMessageData=" + this.a + ")";
    }
}
