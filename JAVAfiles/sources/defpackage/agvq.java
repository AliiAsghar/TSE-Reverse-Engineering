package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agvq {
    public final int a;
    public final int b;
    public final boolean c;
    public final CharSequence d;

    public agvq() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agvq) {
            agvq agvqVar = (agvq) obj;
            if (this.a == agvqVar.a && this.b == agvqVar.b && this.c == agvqVar.c) {
                CharSequence charSequence = agvqVar.d;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        if (true != this.c) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (i ^ ((this.b ^ ((this.a ^ 1000003) * 1000003)) * 1525764945)) * (-721379959);
    }

    public final String toString() {
        return "EmojiListOptions{rowHeight=" + this.a + ", columns=" + this.b + ", emojiIconBackground=0, emojiPlaceHolderDrawable=0, popupViewController=null, popupWindowFocusable=" + this.c + ", popupWindowBackgroundDrawable=null, selectedEmoji=null}";
    }

    public agvq(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = null;
    }
}
