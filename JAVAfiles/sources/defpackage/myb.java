package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class myb implements myd {
    public final mxr a;
    public final int b;

    public myb(mxr mxrVar, int i) {
        this.a = mxrVar;
        this.b = i;
    }

    @Override // defpackage.myd
    public final mxr a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof myb)) {
            return false;
        }
        myb mybVar = (myb) obj;
        if (d.F(this.a, mybVar.a) && this.b == mybVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = this.b;
        a.bm(i);
        return hashCode + i;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BugleVerticalRichCardAttachment(cardAttachmentContent=");
        sb.append(this.a);
        sb.append(", size=");
        int i = this.b;
        if (i != 1) {
            if (i != 2) {
                str = "TALL";
            } else {
                str = "MEDIUM";
            }
        } else {
            str = "SHORT";
        }
        sb.append((Object) str);
        sb.append(")");
        return sb.toString();
    }
}
