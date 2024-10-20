package defpackage;

import android.text.SpannableStringBuilder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kmq {
    public final SpannableStringBuilder a;
    public final kky b;

    public kmq() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kmq) {
            kmq kmqVar = (kmq) obj;
            if (this.a.equals(kmqVar.a) && this.b.equals(kmqVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        kky kkyVar = this.b;
        return "RedactedEditResult{editedText=" + this.a.toString() + ", editDistance=" + String.valueOf(kkyVar) + "}";
    }

    public kmq(SpannableStringBuilder spannableStringBuilder, kky kkyVar) {
        this.a = spannableStringBuilder;
        this.b = kkyVar;
    }
}
