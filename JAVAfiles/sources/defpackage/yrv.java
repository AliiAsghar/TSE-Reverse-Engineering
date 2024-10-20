package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yrv {
    private final String a;
    private final int b;

    public yrv(int i, String str) {
        this.b = i;
        this.a = str;
    }

    public final ype a(Integer num) {
        amzp amzpVar;
        ypk ypkVar;
        int i = this.b - 2;
        if (i != 2 && i != 8) {
            if (i != 11) {
                amzpVar = amzp.NO_VERDICT;
            } else {
                amzpVar = amzp.NOT_SPAM;
            }
        } else {
            amzpVar = amzp.SPAM;
        }
        if (i != 2) {
            if (i != 8) {
                if (i != 11) {
                    ypkVar = ypk.a;
                } else {
                    ypkVar = ypk.c;
                }
            } else {
                ypkVar = ypk.b;
            }
        } else {
            ypkVar = ypk.c;
        }
        ypk ypkVar2 = ypkVar;
        String str = this.a;
        alvi alviVar = yrz.a;
        return new ype(amzpVar, ypkVar2, str, yyb.y(this.b, num), null, 16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yrv)) {
            return false;
        }
        yrv yrvVar = (yrv) obj;
        if (this.b == yrvVar.b && d.F(this.a, yrvVar.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = this.b;
        a.bm(i);
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (i * 31) + hashCode;
    }

    public final String toString() {
        return "StrangerCheckResult(action=" + ((Object) arwi.G(this.b)) + ", initiatedBy=" + this.a + ")";
    }
}
