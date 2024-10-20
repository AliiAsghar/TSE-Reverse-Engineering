package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lwi implements lus {
    public final rpl a = new rpl(true, true);
    private final /* synthetic */ int b;

    public lwi(int i) {
        this.b = i;
    }

    @Override // defpackage.lus
    public final boolean a() {
        if (this.b != 0) {
            return false;
        }
        return true;
    }

    public lwi(int i, byte[] bArr) {
        this.b = i;
    }
}
