package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mvs implements rtv {
    private final String a;
    private final String b;
    private final boolean c;

    public mvs(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    @Override // defpackage.rtv
    public final String a() {
        return this.b;
    }

    @Override // defpackage.rtv
    public final String b() {
        return this.a;
    }

    @Override // defpackage.rtv
    public final boolean c() {
        return this.c;
    }

    public final String toString() {
        return "id: " + this.a + ", displayName: " + this.b + ", isPenpalBot: " + this.c;
    }
}
