package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class aiks extends aiku {
    protected String d;
    public String e;

    /* JADX INFO: Access modifiers changed from: protected */
    public aiks() {
    }

    @Override // defpackage.aiku
    public String c() {
        return this.d;
    }

    @Override // defpackage.aiku
    public Object clone() {
        try {
            return new aiks(this.d);
        } catch (Exception e) {
            throw new RuntimeException(String.valueOf(e.getMessage()).concat(String.valueOf(this.d)));
        }
    }

    public String d() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof aiks)) {
            return false;
        }
        aiks aiksVar = (aiks) obj;
        if (!d.B(this.e, aiksVar.e) || !d.B(this.d, aiksVar.d)) {
            return false;
        }
        return true;
    }

    public void h(String str) {
        throw new UnsupportedOperationException("setMethod should be overridden");
    }

    public int hashCode() {
        int i;
        if (!albo.ah(this.e)) {
            i = this.e.hashCode();
        } else {
            i = 0;
        }
        if (!albo.ah(this.d)) {
            return (i * 37) + this.d.hashCode();
        }
        return i;
    }

    public boolean l() {
        return this instanceof aikp;
    }

    public String toString() {
        return c();
    }

    public aiks(String str) {
        try {
            this.d = str;
            this.e = str.substring(0, str.indexOf(":"));
        } catch (Exception unused) {
            throw new ailb("URI, Bad URI format");
        }
    }
}
