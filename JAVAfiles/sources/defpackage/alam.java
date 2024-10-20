package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alam extends albo implements akxo {
    public Optional a;
    public Optional b;
    private Optional c;
    private Optional d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alam(byte[] bArr, int i, byte[] bArr2) {
        super(null);
        this.e = i;
        this.a = Optional.empty();
        this.c = Optional.empty();
        this.b = Optional.empty();
        this.d = Optional.empty();
    }

    @Override // defpackage.akxo
    public final /* synthetic */ Object a() {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                return new alas(this.a, this.c, this.b, this.d);
            }
            return new alal(this.a, this.c, this.b, this.d);
        }
        return new alan(this.c, this.d, this.a, this.b);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alam(byte[] bArr, int i) {
        super(null);
        this.e = i;
        this.c = Optional.empty();
        this.d = Optional.empty();
        this.a = Optional.empty();
        this.b = Optional.empty();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alam(byte[] bArr, int i, char[] cArr) {
        super(null);
        this.e = i;
        this.a = Optional.empty();
        this.c = Optional.empty();
        this.b = Optional.empty();
        this.d = Optional.empty();
    }
}
