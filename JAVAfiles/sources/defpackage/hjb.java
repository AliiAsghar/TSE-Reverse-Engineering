package defpackage;

import com.android.vcard.VCardEntry;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjb implements VCardEntry.EntryElementIterator {
    final /* synthetic */ VCardEntry a;
    private StringBuilder b;
    private boolean c;

    public hjb(VCardEntry vCardEntry) {
        this.a = vCardEntry;
    }

    @Override // com.android.vcard.VCardEntry.EntryElementIterator
    public final boolean onElement(hjg hjgVar) {
        if (!this.c) {
            this.b.append(", ");
            this.c = false;
        }
        StringBuilder sb = this.b;
        sb.append("[");
        sb.append(hjgVar);
        sb.append("]");
        return true;
    }

    @Override // com.android.vcard.VCardEntry.EntryElementIterator
    public final void onElementGroupEnded() {
        this.b.append("\n");
    }

    @Override // com.android.vcard.VCardEntry.EntryElementIterator
    public final void onElementGroupStarted(VCardEntry.EntryLabel entryLabel) {
        StringBuilder sb = this.b;
        sb.append(entryLabel);
        sb.append(": ");
        this.c = true;
    }

    @Override // com.android.vcard.VCardEntry.EntryElementIterator
    public final void onIterationEnded() {
        this.b.append("]]\n");
    }

    @Override // com.android.vcard.VCardEntry.EntryElementIterator
    public final void onIterationStarted() {
        StringBuilder sb = new StringBuilder();
        this.b = sb;
        sb.append("[[hash: ");
        sb.append(this.a.hashCode());
        sb.append("\n");
    }

    public final String toString() {
        return this.b.toString();
    }
}
