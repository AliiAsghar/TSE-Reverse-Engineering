package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atlf extends atky {
    private byte[] a;

    public atlf(int i) {
        super(i);
    }

    @Override // defpackage.atky
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer("<");
        stringBuffer.append(atpj.c(this.a));
        stringBuffer.append(">");
        return stringBuffer.toString();
    }

    @Override // defpackage.atky
    public final void b(atkt atktVar) {
        this.a = atktVar.h();
    }

    @Override // defpackage.atky
    public final void c(atkv atkvVar) {
        atkvVar.a(this.a);
    }

    public atlf() {
        super(3);
    }
}
