package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.util.Objects;
import j$.util.function.IntPredicate$CC;
import java.util.List;
import java.util.function.IntPredicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class zok implements IntPredicate {
    public final /* synthetic */ List a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ zok(List list, ConversationIdType conversationIdType, int i) {
        this.c = i;
        this.a = list;
        this.b = conversationIdType;
    }

    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        if (this.c != 0) {
            return IntPredicate$CC.$default$and(this, intPredicate);
        }
        return IntPredicate$CC.$default$and(this, intPredicate);
    }

    public final /* synthetic */ IntPredicate negate() {
        if (this.c != 0) {
            return IntPredicate$CC.$default$negate(this);
        }
        return IntPredicate$CC.$default$negate(this);
    }

    public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        if (this.c != 0) {
            return IntPredicate$CC.$default$or(this, intPredicate);
        }
        return IntPredicate$CC.$default$or(this, intPredicate);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    @Override // java.util.function.IntPredicate
    public final boolean test(int i) {
        if (this.c != 0) {
            List list = this.a;
            if (list.get(i) != null) {
                if (((ConversationIdType) this.b).equals(((kzx) list.get(i)).a.l)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return Objects.equals(((MessagePartCoreData) this.b.get(i)).t(), ((MessagePartCoreData) this.a.get(i)).t());
    }

    public /* synthetic */ zok(List list, List list2, int i) {
        this.c = i;
        this.b = list;
        this.a = list2;
    }
}
