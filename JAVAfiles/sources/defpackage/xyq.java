package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.Collection;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xyq extends HashSet {
    public xyq() {
    }

    public final ConversationIdType a() {
        return (ConversationIdType) iterator().next();
    }

    public xyq(Collection collection) {
        super(collection);
    }
}
