package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alag extends albo implements akxo {
    private Optional a;
    private Optional b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alag(byte[] bArr, int i, byte[] bArr2) {
        super(null);
        this.c = i;
        this.a = Optional.empty();
        this.b = Optional.empty();
    }

    @Override // defpackage.akxo
    public final /* synthetic */ Object a() {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                return new alai(this.a, this.b);
            }
            return new alad(this.a, this.b);
        }
        return new alah(this.a, this.b);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alag(byte[] bArr, int i) {
        super(null);
        this.c = i;
        this.a = Optional.empty();
        this.b = Optional.empty();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alag(byte[] bArr, int i, char[] cArr) {
        super(null);
        this.c = i;
        this.a = Optional.empty();
        this.b = Optional.empty();
    }
}
