package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afed implements afdz {
    public static final afed a = new afed();
    private final /* synthetic */ afeb b;

    private afed() {
        altx altxVar = new altx(afdw.c);
        this.b = new afeb(altxVar, altxVar);
    }

    @Override // defpackage.afdz
    public final String[] a(afdy afdyVar) {
        afdyVar.getClass();
        return this.b.a(afdyVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afed)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 125327243;
    }

    public final String toString() {
        return "SizeBytesStrategy";
    }
}
