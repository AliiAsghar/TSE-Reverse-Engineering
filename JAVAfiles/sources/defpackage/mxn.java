package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mxn implements myd {
    public final mxr a;

    public mxn(mxr mxrVar) {
        this.a = mxrVar;
    }

    @Override // defpackage.myd
    public final mxr a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof mxn) && d.F(this.a, ((mxn) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BugleHorizontalRichCardAttachment(cardAttachmentContent=" + this.a + ")";
    }
}
