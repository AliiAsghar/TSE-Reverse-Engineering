package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hiy implements hji {
    public final String a;
    public int b = 100;
    private final int c;

    public hiy(String str, int i) {
        this.a = str;
        this.c = i;
    }

    @Override // defpackage.hji
    public final int getAppearanceOrder() {
        return this.c;
    }

    @Override // defpackage.hji
    public final int getPref() {
        return this.b;
    }

    @Override // defpackage.hji
    public final void setPref(int i) {
        this.b = i;
    }

    @Override // defpackage.hji
    public final void setIsPrimary(boolean z) {
    }
}
