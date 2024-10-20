package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kcj implements mym {
    public final List a;

    public kcj(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof kcj) && d.F(this.a, ((kcj) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.mym
    public final String j() {
        return "message-list-gallery";
    }

    public final String toString() {
        return "MessageListGalleryContent(gallery=" + this.a + ")";
    }
}
