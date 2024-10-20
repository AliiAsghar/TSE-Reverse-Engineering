package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class apbg {
    protected volatile apbt a;
    public volatile aozb b;

    public final aozb a() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            if (this.a == null) {
                this.b = aozb.b;
            } else {
                this.b = this.a.toByteString();
            }
            return this.b;
        }
    }

    public final apbt b(apbt apbtVar) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = apbtVar;
                        this.b = aozb.b;
                    } catch (apba unused) {
                        this.a = apbtVar;
                        this.b = aozb.b;
                    }
                }
            }
        }
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apbg)) {
            return false;
        }
        apbg apbgVar = (apbg) obj;
        apbt apbtVar = this.a;
        apbt apbtVar2 = apbgVar.a;
        if (apbtVar == null && apbtVar2 == null) {
            return a().equals(apbgVar.a());
        }
        if (apbtVar != null && apbtVar2 != null) {
            return apbtVar.equals(apbtVar2);
        }
        if (apbtVar != null) {
            return apbtVar.equals(apbgVar.b(apbtVar.getDefaultInstanceForType()));
        }
        return b(apbtVar2.getDefaultInstanceForType()).equals(apbtVar2);
    }

    public int hashCode() {
        return 1;
    }
}
