package defpackage;

import com.android.vcard.VCardEntry;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hja implements VCardEntry.EntryElementIterator {
    public boolean a = true;

    @Override // com.android.vcard.VCardEntry.EntryElementIterator
    public final boolean onElement(hjg hjgVar) {
        if (!hjgVar.isEmpty()) {
            this.a = false;
            return false;
        }
        return true;
    }

    @Override // com.android.vcard.VCardEntry.EntryElementIterator
    public final void onElementGroupEnded() {
    }

    @Override // com.android.vcard.VCardEntry.EntryElementIterator
    public final void onIterationEnded() {
    }

    @Override // com.android.vcard.VCardEntry.EntryElementIterator
    public final void onIterationStarted() {
    }

    @Override // com.android.vcard.VCardEntry.EntryElementIterator
    public final void onElementGroupStarted(VCardEntry.EntryLabel entryLabel) {
    }
}
