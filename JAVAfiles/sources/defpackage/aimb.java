package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aimb extends aimm implements Cloneable {
    protected aimk a;

    public aimb() {
        super(assi.a);
    }

    @Override // defpackage.aimh
    public final String a() {
        aimk aimkVar = this.a;
        if (aimkVar != null) {
            String c = aimkVar.c();
            if (m()) {
                return c + ";" + this.e.c();
            }
            return c;
        }
        throw new IllegalStateException("Media range is null.");
    }

    public final String b() {
        aimk aimkVar = this.a;
        if (aimkVar == null) {
            return null;
        }
        return aimkVar.b;
    }

    @Override // defpackage.aimh, defpackage.aiku
    public final Object clone() {
        if (this.a != null) {
            aimb aimbVar = new aimb();
            aimbVar.e = (aila) this.e.clone();
            aimbVar.a = (aimk) this.a.clone();
            return aimbVar;
        }
        throw new IllegalStateException("MediaRange is null.");
    }

    public final String e() {
        aimk aimkVar = this.a;
        if (aimkVar == null) {
            return null;
        }
        return aimkVar.a;
    }

    public final void f(String str) {
        if (this.a == null) {
            this.a = new aimk();
        }
        this.a.b = str;
    }

    public final void g(String str) {
        if (this.a == null) {
            this.a = new aimk();
        }
        if (str.indexOf(47) < 0) {
            this.a.a = str;
            return;
        }
        String[] split = str.split("/");
        aimk aimkVar = this.a;
        aimkVar.a = split[0];
        aimkVar.b = split[1];
    }
}
