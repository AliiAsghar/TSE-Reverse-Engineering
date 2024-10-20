package defpackage;

import com.google.android.apps.messaging.multishare.chip.ChipData;
import com.google.android.apps.messaging.multishare.chip.ChipId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lge {
    public final List a;
    public final ChipData b;
    public final ChipData c;
    private final Set d;

    public lge() {
        this(null, 0 == true ? 1 : 0, 15);
    }

    public final boolean a(ConversationId conversationId) {
        if (!this.d.isEmpty()) {
            return this.d.contains(new ChipId.Conversation(conversationId));
        }
        return false;
    }

    public final boolean b(msh mshVar) {
        if (!this.d.isEmpty()) {
            return this.d.contains(new ChipId.Identity(mshVar));
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lge)) {
            return false;
        }
        lge lgeVar = (lge) obj;
        if (d.F(this.a, lgeVar.a) && d.F(this.d, lgeVar.d) && d.F(this.b, lgeVar.b) && d.F(this.c, lgeVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() * 31) + this.d.hashCode();
        ChipData chipData = this.b;
        int i = 0;
        if (chipData == null) {
            hashCode = 0;
        } else {
            hashCode = chipData.hashCode();
        }
        int i2 = ((hashCode2 * 31) + hashCode) * 31;
        ChipData chipData2 = this.c;
        if (chipData2 != null) {
            i = chipData2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "ContactSelectionStateImpl(allChipList=" + this.a + ", allIdentities=" + this.d + ", lastAddedChip=" + this.b + ", lastRemovedChip=" + this.c + ")";
    }

    public lge(List list, Set set, ChipData chipData, ChipData chipData2) {
        list.getClass();
        set.getClass();
        this.a = list;
        this.d = set;
        this.b = chipData;
        this.c = chipData2;
    }

    public /* synthetic */ lge(List list, Set set, int i) {
        this((i & 1) != 0 ? arnv.a : list, (i & 2) != 0 ? arnx.a : set, null, null);
    }
}
