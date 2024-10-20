package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arsx extends arsw implements arsz {
    static {
        new arsx((char) 1, (char) 0);
    }

    public arsx(char c, char c2) {
        super(c, c2);
    }

    @Override // defpackage.arsw, defpackage.arsz
    public final boolean a() {
        if (arro.a(this.a, this.b) > 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.arsw
    public final boolean equals(Object obj) {
        if (!(obj instanceof arsx)) {
            return false;
        }
        if (a() && ((arsx) obj).a()) {
            return true;
        }
        arsx arsxVar = (arsx) obj;
        if (this.a != arsxVar.a || this.b != arsxVar.b) {
            return false;
        }
        return true;
    }

    @Override // defpackage.arsw
    public final int hashCode() {
        if (a()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // defpackage.arsw
    public final String toString() {
        return this.a + ".." + this.b;
    }
}
