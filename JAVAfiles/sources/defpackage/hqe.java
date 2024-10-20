package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqe implements hpy {
    private final /* synthetic */ int a;

    public hqe(int i) {
        this.a = i;
    }

    @Override // defpackage.hpy
    public final /* synthetic */ int a(Object obj) {
        if (this.a != 0) {
            return ((byte[]) obj).length;
        }
        return ((int[]) obj).length;
    }

    @Override // defpackage.hpy
    public final int b() {
        if (this.a != 0) {
            return 1;
        }
        return 4;
    }

    @Override // defpackage.hpy
    public final /* synthetic */ Object c(int i) {
        if (this.a != 0) {
            return new byte[i];
        }
        return new int[i];
    }

    @Override // defpackage.hpy
    public final String d() {
        if (this.a != 0) {
            return "ByteArrayPool";
        }
        return "IntegerArrayPool";
    }
}
