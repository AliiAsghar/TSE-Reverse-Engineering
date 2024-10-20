package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import java.util.function.ToLongFunction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rsh implements ToLongFunction {
    private final /* synthetic */ int a;

    public /* synthetic */ rsh(int i) {
        this.a = i;
    }

    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                return ((vsa) obj).b;
            }
            return ((ConversationIdType) obj).a;
        }
        MessagePartCoreData messagePartCoreData = (MessagePartCoreData) obj;
        return albo.cm(messagePartCoreData.bK(), messagePartCoreData.p(), 0);
    }
}
