package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class assl implements assn {
    private final String a;
    private final String b;
    private final String c;

    public assl(String str) {
        String str2;
        if (str != null) {
            this.a = str;
            int indexOf = str.indexOf(47);
            if (indexOf != -1) {
                this.b = str.substring(0, indexOf);
                str2 = str.substring(indexOf + 1);
            } else {
                this.b = str;
                str2 = null;
            }
            this.c = str2;
            return;
        }
        throw new IllegalArgumentException("MIME type may not be null");
    }

    @Override // defpackage.asso
    public String b() {
        return this.b;
    }

    @Override // defpackage.asso
    public String c() {
        return this.a;
    }

    @Override // defpackage.asso
    public String d() {
        return this.c;
    }
}
