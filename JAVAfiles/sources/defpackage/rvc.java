package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rvc {
    public static final MessageIdType a = new MessageIdType(-1);

    public static long a(MessageIdType messageIdType) {
        if (messageIdType == null) {
            return -1L;
        }
        return messageIdType.a;
    }

    public static MessageIdType b(String str) {
        if (str != null) {
            try {
                return new MessageIdType(Long.parseLong(str));
            } catch (Exception unused) {
            }
        }
        return a;
    }

    public static alog c(List list) {
        return alog.n((Collection) Collection.EL.stream(list).map(new ruh(19)).collect(Collectors.toCollection(new roi(10))));
    }
}
