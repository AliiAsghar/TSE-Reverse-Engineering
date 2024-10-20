package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ruy {
    public static final ConversationIdType a = new ConversationIdType(-1);

    public static long a(ConversationIdType conversationIdType) {
        if (conversationIdType == null) {
            return -1L;
        }
        return conversationIdType.a;
    }

    public static ConversationIdType b(String str) {
        if (str != null) {
            try {
                return new ConversationIdType(Long.parseLong(str));
            } catch (Exception unused) {
            }
        }
        return a;
    }

    public static alog c(Collection collection) {
        return alog.n((Collection) Collection.EL.stream(collection).map(new ruh(17)).collect(Collectors.toCollection(new roi(9))));
    }

    public static alog d(List list) {
        return alog.n((java.util.Collection) Collection.EL.stream(list).map(new ruh(17)).collect(Collectors.toCollection(new roi(9))));
    }
}
