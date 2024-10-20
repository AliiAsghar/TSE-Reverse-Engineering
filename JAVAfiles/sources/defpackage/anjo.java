package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anjo {
    public Optional a;
    public anix b;
    public byte c;
    private Optional d;

    public anjo() {
        throw null;
    }

    public final anjp a() {
        return new anjp(this.d, this.a, this.b, (~this.c) & 7);
    }

    public final void b(String str) {
        this.d = Optional.of(str);
        this.c = (byte) (this.c | 1);
    }

    public anjo(byte[] bArr) {
        this.d = Optional.empty();
        this.a = Optional.empty();
    }
}
