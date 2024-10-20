package defpackage;

import com.android.vcard.VCardEntry;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hiz implements VCardEntry.EntryElementIterator {
    final /* synthetic */ VCardEntry a;
    private final List b;
    private final int c;

    public hiz(VCardEntry vCardEntry, List list, int i) {
        this.a = vCardEntry;
        this.b = list;
        this.c = i;
    }

    @Override // com.android.vcard.VCardEntry.EntryElementIterator
    public final boolean onElement(hjg hjgVar) {
        if (!hjgVar.isEmpty()) {
            hjgVar.constructInsertOperation(this.b, this.c);
            return true;
        }
        return true;
    }

    @Override // com.android.vcard.VCardEntry.EntryElementIterator
    public final void onIterationStarted() {
        this.a.iterateAllPreferredElements();
    }

    @Override // com.android.vcard.VCardEntry.EntryElementIterator
    public final void onElementGroupEnded() {
    }

    @Override // com.android.vcard.VCardEntry.EntryElementIterator
    public final void onIterationEnded() {
    }

    @Override // com.android.vcard.VCardEntry.EntryElementIterator
    public final void onElementGroupStarted(VCardEntry.EntryLabel entryLabel) {
    }
}
