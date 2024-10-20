package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ailt extends aimh implements Cloneable {
    protected Integer a;
    protected String b;

    public ailt() {
        super("CSeq");
    }

    @Override // defpackage.aimh
    public final String a() {
        return this.a + " " + this.b.toUpperCase(Locale.US);
    }

    public final int b() {
        Integer num = this.a;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // defpackage.aimh, defpackage.aiku
    public final Object clone() {
        ailt ailtVar = new ailt();
        Integer num = this.a;
        if (num != null) {
            num.intValue();
            ailtVar.a = num;
        }
        ailtVar.b = this.b;
        return ailtVar;
    }

    @Override // defpackage.aimh
    public final aila d() {
        return null;
    }

    public final String e() {
        return this.b.toUpperCase(Locale.US);
    }

    @Override // defpackage.aimh
    public final boolean equals(Object obj) {
        if (!(obj instanceof ailt)) {
            return false;
        }
        ailt ailtVar = (ailt) obj;
        if (!this.a.equals(ailtVar.a) || !this.b.equalsIgnoreCase(ailtVar.b)) {
            return false;
        }
        return true;
    }

    public final void f(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("parameter is null");
    }

    public final void g(int i) {
        if (i >= 0) {
            this.a = Integer.valueOf(i);
            return;
        }
        throw new IllegalArgumentException("the sequence number parameter is < 0");
    }

    @Override // defpackage.aimh
    public final int hashCode() {
        return 27650;
    }
}
