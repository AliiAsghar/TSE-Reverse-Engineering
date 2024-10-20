package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zyi {
    public final alog a;

    public zyi() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zyi) && d.F(this.a, ((zyi) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DescriptionUiData(items=" + this.a + ")";
    }

    public /* synthetic */ zyi(byte[] bArr) {
        int i = alog.d;
        alog alogVar = alsx.a;
        alogVar.getClass();
        this.a = alogVar;
    }
}
