package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agxs {
    public final agxq a;
    public final Bitmap b;

    public agxs() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agxs) {
            agxs agxsVar = (agxs) obj;
            if (this.a.equals(agxsVar.a) && this.b.equals(agxsVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Bitmap bitmap = this.b;
        return "EmojiViewBitmap{drawParams=" + this.a.toString() + ", bitmap=" + bitmap.toString() + "}";
    }

    public agxs(agxq agxqVar, Bitmap bitmap) {
        if (agxqVar == null) {
            throw new NullPointerException("Null drawParams");
        }
        this.a = agxqVar;
        if (bitmap != null) {
            this.b = bitmap;
            return;
        }
        throw new NullPointerException("Null bitmap");
    }
}
