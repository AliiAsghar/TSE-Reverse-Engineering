package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aflx {
    public final String a;
    public final List b;

    public aflx(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aflx)) {
            return false;
        }
        aflx aflxVar = (aflx) obj;
        if (d.F(this.a, aflxVar.a) && d.F(this.b, aflxVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "EmojiCategory(label=" + this.a + ", emojiSets=" + this.b + ")";
    }
}
